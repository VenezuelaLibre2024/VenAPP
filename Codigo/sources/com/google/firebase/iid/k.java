package com.google.firebase.iid;

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
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f11897a;

    /* renamed from: b, reason: collision with root package name */
    private final n f11898b;

    /* renamed from: c, reason: collision with root package name */
    private final ba.c f11899c;

    /* renamed from: d, reason: collision with root package name */
    private final ee.b<ye.i> f11900d;

    /* renamed from: e, reason: collision with root package name */
    private final ee.b<od.j> f11901e;

    /* renamed from: f, reason: collision with root package name */
    private final fe.f f11902f;

    k(zb.g gVar, n nVar, ba.c cVar, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar) {
        this.f11897a = gVar;
        this.f11898b = nVar;
        this.f11899c = cVar;
        this.f11900d = bVar;
        this.f11901e = bVar2;
        this.f11902f = fVar;
    }

    public k(zb.g gVar, n nVar, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar) {
        this(gVar, nVar, new ba.c(gVar.m()), bVar, bVar2, fVar);
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(b.a(), new Continuation(this) { // from class: com.google.firebase.iid.j

            /* renamed from: a, reason: collision with root package name */
            private final k f11896a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11896a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                return this.f11896a.h(task2);
            }
        });
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f11897a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
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
    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        j.a b10;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f11897a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f11898b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f11898b.a());
        bundle.putString("app_ver_name", this.f11898b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((com.google.firebase.installations.g) Tasks.await(this.f11902f.a(false))).b();
            if (TextUtils.isEmpty(b11)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        od.j jVar = this.f11901e.get();
        ye.i iVar = this.f11900d.get();
        if (jVar != null && iVar != null && (b10 = jVar.b("fire-iid")) != j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.b()));
            bundle.putString("Firebase-Client", iVar.a());
        }
        return bundle;
    }

    private Task<Bundle> j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.f11899c.a(bundle);
    }

    public Task<?> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(j(str, str2, str3, bundle));
    }

    public Task<String> e(String str, String str2, String str3) {
        return c(j(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String h(Task task) {
        return f((Bundle) task.getResult(IOException.class));
    }
}
