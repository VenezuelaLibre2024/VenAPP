package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import od.j;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a */
    private final zb.g f12078a;

    /* renamed from: b */
    private final j0 f12079b;

    /* renamed from: c */
    private final ba.c f12080c;

    /* renamed from: d */
    private final ee.b<ye.i> f12081d;

    /* renamed from: e */
    private final ee.b<od.j> f12082e;

    /* renamed from: f */
    private final fe.f f12083f;

    e0(zb.g gVar, j0 j0Var, ba.c cVar, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar) {
        this.f12078a = gVar;
        this.f12079b = j0Var;
        this.f12080c = cVar;
        this.f12081d = bVar;
        this.f12082e = bVar2;
        this.f12083f = fVar;
    }

    public e0(zb.g gVar, j0 j0Var, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar) {
        this(gVar, j0Var, new ba.c(gVar.m()), bVar, bVar2, fVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.continueWith(new p1.b(), new Continuation() { // from class: com.google.firebase.messaging.d0
            public /* synthetic */ d0() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String i10;
                i10 = e0.this.i(task2);
                return i10;
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f12078a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) {
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

    public static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public /* synthetic */ String i(Task task) {
        return g((Bundle) task.getResult(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f12078a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f12079b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f12079b.a());
        bundle.putString("app_ver_name", this.f12079b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b11 = ((com.google.firebase.installations.g) Tasks.await(this.f12083f.a(false))).b();
            if (TextUtils.isEmpty(b11)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f12083f.getId()));
        bundle.putString("cliv", "fcm-23.3.1");
        od.j jVar = this.f12082e.get();
        ye.i iVar = this.f12081d.get();
        if (jVar == null || iVar == null || (b10 = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.b()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f12080c.a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    public Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(k(j0.c(this.f12078a), "*", bundle));
    }

    public Task<String> f() {
        return d(k(j0.c(this.f12078a), "*", new Bundle()));
    }

    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    public Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(k(str, "/topics/" + str2, bundle));
    }
}
