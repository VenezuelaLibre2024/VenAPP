package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ba.C1689c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.AbstractC6200g;
import ee.InterfaceC7183b;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p106fe.InterfaceC7337f;
import p273od.InterfaceC9920j;
import p284p1.ExecutorC10035b;
import p485zb.C12867g;
import ye.InterfaceC12683i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.e0 */
/* loaded from: classes.dex */
public class C6221e0 {

    /* renamed from: a */
    private final C12867g f13293a;

    /* renamed from: b */
    private final C6236j0 f13294b;

    /* renamed from: c */
    private final C1689c f13295c;

    /* renamed from: d */
    private final InterfaceC7183b<InterfaceC12683i> f13296d;

    /* renamed from: e */
    private final InterfaceC7183b<InterfaceC9920j> f13297e;

    /* renamed from: f */
    private final InterfaceC7337f f13298f;

    C6221e0(C12867g c12867g, C6236j0 c6236j0, C1689c c1689c, InterfaceC7183b<InterfaceC12683i> interfaceC7183b, InterfaceC7183b<InterfaceC9920j> interfaceC7183b2, InterfaceC7337f interfaceC7337f) {
        this.f13293a = c12867g;
        this.f13294b = c6236j0;
        this.f13295c = c1689c;
        this.f13296d = interfaceC7183b;
        this.f13297e = interfaceC7183b2;
        this.f13298f = interfaceC7337f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6221e0(C12867g c12867g, C6236j0 c6236j0, InterfaceC7183b<InterfaceC12683i> interfaceC7183b, InterfaceC7183b<InterfaceC9920j> interfaceC7183b2, InterfaceC7337f interfaceC7337f) {
        this(c12867g, c6236j0, new C1689c(c12867g.m42630m()), interfaceC7183b, interfaceC7183b2, interfaceC7337f);
    }

    /* renamed from: b */
    private static String m16978b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: d */
    private Task<String> m16979d(Task<Bundle> task) {
        return task.continueWith(new ExecutorC10035b(), new Continuation() { // from class: com.google.firebase.messaging.d0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String m16983i;
                m16983i = C6221e0.this.m16983i(task2);
                return m16983i;
            }
        });
    }

    /* renamed from: e */
    private String m16980e() {
        try {
            return m16978b(MessageDigest.getInstance("SHA-1").digest(this.f13293a.m42631q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: g */
    private String m16981g(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m16982h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m16983i(Task task) {
        return m16981g((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: j */
    private void m16984j(String str, String str2, Bundle bundle) {
        InterfaceC9920j.a mo29637b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f13293a.m42632r().m42644c());
        bundle.putString("gmsv", Integer.toString(this.f13294b.m17074d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f13294b.m17072a());
        bundle.putString("app_ver_name", this.f13294b.m17073b());
        bundle.putString("firebase-app-name-hash", m16980e());
        try {
            String mo16814b = ((AbstractC6200g) Tasks.await(this.f13298f.mo16854a(false))).mo16814b();
            if (TextUtils.isEmpty(mo16814b)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo16814b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f13298f.getId()));
        bundle.putString("cliv", "fcm-23.3.1");
        InterfaceC9920j interfaceC9920j = this.f13297e.get();
        InterfaceC12683i interfaceC12683i = this.f13296d.get();
        if (interfaceC9920j == null || interfaceC12683i == null || (mo29637b = interfaceC9920j.mo29637b("fire-iid")) == InterfaceC9920j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo29637b.m29640b()));
        bundle.putString("Firebase-Client", interfaceC12683i.mo41719a());
    }

    /* renamed from: k */
    private Task<Bundle> m16985k(String str, String str2, Bundle bundle) {
        try {
            m16984j(str, str2, bundle);
            return this.f13295c.m9294a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Task<?> m16986c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m16979d(m16985k(C6236j0.m17069c(this.f13293a), "*", bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Task<String> m16987f() {
        return m16979d(m16985k(C6236j0.m17069c(this.f13293a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Task<?> m16988l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m16979d(m16985k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Task<?> m16989m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m16979d(m16985k(str, "/topics/" + str2, bundle));
    }
}
