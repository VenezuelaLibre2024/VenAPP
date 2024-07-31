package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.p002firebaseauthapi.zzacr;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class n0 extends n {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f11736a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f11737a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f11738b;

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f11739c;

        private a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f11738b = bundle;
            Bundle bundle2 = new Bundle();
            this.f11739c = bundle2;
            this.f11737a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.i().r().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzacr.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.n());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.i().q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.k());
        }

        public a a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f11739c.putString(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public n0 b() {
            return new n0(this.f11738b);
        }

        public a c(List<String> list) {
            this.f11738b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f11740a;

        /* renamed from: b, reason: collision with root package name */
        private String f11741b;

        /* renamed from: c, reason: collision with root package name */
        private String f11742c;

        /* renamed from: d, reason: collision with root package name */
        private String f11743d;

        private b(String str) {
            this.f11740a = str;
        }

        public h a() {
            return d2.C1(this.f11740a, this.f11741b, this.f11742c, this.f11743d);
        }

        public b b(String str) {
            this.f11742c = str;
            return this;
        }

        public b c(String str) {
            this.f11741b = str;
            return this;
        }

        public b d(String str, String str2) {
            this.f11741b = str;
            this.f11743d = str2;
            return this;
        }
    }

    private n0(Bundle bundle) {
        this.f11736a = bundle;
    }

    public static a d(String str) {
        return e(str, FirebaseAuth.getInstance());
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(firebaseAuth);
        if (!Constants.SIGN_IN_METHOD_FACEBOOK.equals(str) || zzaed.zza(firebaseAuth.i())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(com.google.android.gms.common.internal.s.f(str));
    }

    @Override // com.google.firebase.auth.n
    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f11736a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.n
    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f11736a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.n
    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f11736a);
        activity.startActivity(intent);
    }
}
