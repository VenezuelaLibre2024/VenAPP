package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzacr;
import com.google.android.gms.internal.p498firebaseauthapi.zzaed;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.auth.n0 */
/* loaded from: classes.dex */
public class C6100n0 extends AbstractC6099n {

    /* renamed from: a */
    private final Bundle f12951a;

    /* renamed from: com.google.firebase.auth.n0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final FirebaseAuth f12952a;

        /* renamed from: b */
        private final Bundle f12953b;

        /* renamed from: c */
        private final Bundle f12954c;

        private a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f12953b = bundle;
            Bundle bundle2 = new Bundle();
            this.f12954c = bundle2;
            this.f12952a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.m16396i().m42632r().m42643b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzacr.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.m16405n());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.m16396i().m42631q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.m16399k());
        }

        /* renamed from: a */
        public a m16571a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f12954c.putString(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: b */
        public C6100n0 m16572b() {
            return new C6100n0(this.f12953b);
        }

        /* renamed from: c */
        public a m16573c(List<String> list) {
            this.f12953b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }
    }

    /* renamed from: com.google.firebase.auth.n0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final String f12955a;

        /* renamed from: b */
        private String f12956b;

        /* renamed from: c */
        private String f12957c;

        /* renamed from: d */
        private String f12958d;

        private b(String str) {
            this.f12955a = str;
        }

        /* renamed from: a */
        public AbstractC6072h m16574a() {
            return C6059d2.m16490C1(this.f12955a, this.f12956b, this.f12957c, this.f12958d);
        }

        /* renamed from: b */
        public b m16575b(String str) {
            this.f12957c = str;
            return this;
        }

        /* renamed from: c */
        public b m16576c(String str) {
            this.f12956b = str;
            return this;
        }

        /* renamed from: d */
        public b m16577d(String str, String str2) {
            this.f12956b = str;
            this.f12958d = str2;
            return this;
        }
    }

    private C6100n0(Bundle bundle) {
        this.f12951a = bundle;
    }

    /* renamed from: d */
    public static a m16568d(String str) {
        return m16569e(str, FirebaseAuth.getInstance());
    }

    /* renamed from: e */
    public static a m16569e(String str, FirebaseAuth firebaseAuth) {
        C5276s.m13320f(str);
        C5276s.m13324j(firebaseAuth);
        if (!Constants.SIGN_IN_METHOD_FACEBOOK.equals(str) || zzaed.zza(firebaseAuth.m16396i())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    /* renamed from: f */
    public static b m16570f(String str) {
        return new b(C5276s.m13320f(str));
    }

    @Override // com.google.firebase.auth.AbstractC6099n
    /* renamed from: a */
    public final void mo16565a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f12951a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.AbstractC6099n
    /* renamed from: b */
    public final void mo16566b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f12951a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.AbstractC6099n
    /* renamed from: c */
    public final void mo16567c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f12951a);
        activity.startActivity(intent);
    }
}
