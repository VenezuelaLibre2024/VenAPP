package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* loaded from: classes2.dex */
public final class zzadr {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzadr(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", this.zza.i().r().b());
        if (!TextUtils.isEmpty(this.zza.n())) {
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.n());
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzacr.zza().zzb());
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", this.zza.i().q());
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", this.zza.k());
        this.zzb.startActivity(intent);
    }
}
