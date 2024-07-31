package com.google.firebase.iid;

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
import p485zb.C12867g;
import ye.InterfaceC12683i;

/* renamed from: com.google.firebase.iid.k */
/* loaded from: classes.dex */
public class C6179k {

    /* renamed from: a */
    private final C12867g f13112a;

    /* renamed from: b */
    private final C6182n f13113b;

    /* renamed from: c */
    private final C1689c f13114c;

    /* renamed from: d */
    private final InterfaceC7183b<InterfaceC12683i> f13115d;

    /* renamed from: e */
    private final InterfaceC7183b<InterfaceC9920j> f13116e;

    /* renamed from: f */
    private final InterfaceC7337f f13117f;

    C6179k(C12867g c12867g, C6182n c6182n, C1689c c1689c, InterfaceC7183b<InterfaceC12683i> interfaceC7183b, InterfaceC7183b<InterfaceC9920j> interfaceC7183b2, InterfaceC7337f interfaceC7337f) {
        this.f13112a = c12867g;
        this.f13113b = c6182n;
        this.f13114c = c1689c;
        this.f13115d = interfaceC7183b;
        this.f13116e = interfaceC7183b2;
        this.f13117f = interfaceC7337f;
    }

    public C6179k(C12867g c12867g, C6182n c6182n, InterfaceC7183b<InterfaceC12683i> interfaceC7183b, InterfaceC7183b<InterfaceC9920j> interfaceC7183b2, InterfaceC7337f interfaceC7337f) {
        this(c12867g, c6182n, new C1689c(c12867g.m42630m()), interfaceC7183b, interfaceC7183b2, interfaceC7337f);
    }

    /* renamed from: a */
    private static String m16752a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private Task<String> m16753c(Task<Bundle> task) {
        return task.continueWith(C6170b.m16750a(), new Continuation(this) { // from class: com.google.firebase.iid.j

            /* renamed from: a */
            private final C6179k f13111a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f13111a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                return this.f13111a.m16761h(task2);
            }
        });
    }

    /* renamed from: d */
    private String m16754d() {
        try {
            return m16752a(MessageDigest.getInstance("SHA-1").digest(this.f13112a.m42631q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    private String m16755f(Bundle bundle) {
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
        String valueOf = String.valueOf(bundle);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("Unexpected response: ");
        sb2.append(valueOf);
        Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m16756g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: i */
    private Bundle m16757i(String str, String str2, String str3, Bundle bundle) {
        InterfaceC9920j.a mo29637b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f13112a.m42632r().m42644c());
        bundle.putString("gmsv", Integer.toString(this.f13113b.m16768d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f13113b.m16766a());
        bundle.putString("app_ver_name", this.f13113b.m16767b());
        bundle.putString("firebase-app-name-hash", m16754d());
        try {
            String mo16814b = ((AbstractC6200g) Tasks.await(this.f13117f.mo16854a(false))).mo16814b();
            if (TextUtils.isEmpty(mo16814b)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo16814b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        InterfaceC9920j interfaceC9920j = this.f13116e.get();
        InterfaceC12683i interfaceC12683i = this.f13115d.get();
        if (interfaceC9920j != null && interfaceC12683i != null && (mo29637b = interfaceC9920j.mo29637b("fire-iid")) != InterfaceC9920j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo29637b.m29640b()));
            bundle.putString("Firebase-Client", interfaceC12683i.mo41719a());
        }
        return bundle;
    }

    /* renamed from: j */
    private Task<Bundle> m16758j(String str, String str2, String str3, Bundle bundle) {
        m16757i(str, str2, str3, bundle);
        return this.f13114c.m9294a(bundle);
    }

    /* renamed from: b */
    public Task<?> m16759b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m16753c(m16758j(str, str2, str3, bundle));
    }

    /* renamed from: e */
    public Task<String> m16760e(String str, String str2, String str3) {
        return m16753c(m16758j(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ String m16761h(Task task) {
        return m16755f((Bundle) task.getResult(IOException.class));
    }
}
