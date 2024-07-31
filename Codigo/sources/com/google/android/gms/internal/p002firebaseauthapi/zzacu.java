package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import zb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacu extends zzadi implements zzaef {
    private zzaco zza;
    private zzacn zzb;
    private zzadq zzc;
    private final zzacr zzd;
    private final g zze;
    private String zzf;
    private zzact zzg;

    public zzacu(g gVar, zzacr zzacrVar) {
        this(gVar, zzacrVar, null, null, null);
    }

    private zzacu(g gVar, zzacr zzacrVar, zzadq zzadqVar, zzaco zzacoVar, zzacn zzacnVar) {
        this.zze = gVar;
        this.zzf = gVar.r().b();
        this.zzd = (zzacr) s.j(zzacrVar);
        zza(null, null, null);
        zzaed.zza(this.zzf, this);
    }

    private final void zza(zzadq zzadqVar, zzaco zzacoVar, zzacn zzacnVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzaea.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzaed.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzadq(zza, zzb());
        }
        String zza2 = zzaea.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzaed.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzaco(zza2, zzb());
        }
        String zza3 = zzaea.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzaed.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzacn(zza3, zzb());
        }
    }

    private final zzact zzb() {
        if (this.zzg == null) {
            this.zzg = new zzact(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaef
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaek zzaekVar, zzadk<zzaen> zzadkVar) {
        s.j(zzaekVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/createAuthUri", this.zzf), zzaekVar, zzadkVar, zzaen.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaem zzaemVar, zzadk<Void> zzadkVar) {
        s.j(zzaemVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/deleteAccount", this.zzf), zzaemVar, zzadkVar, Void.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaep zzaepVar, zzadk<zzaeo> zzadkVar) {
        s.j(zzaepVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/emailLinkSignin", this.zzf), zzaepVar, zzadkVar, zzaeo.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaer zzaerVar, zzadk<zzaeq> zzadkVar) {
        s.j(zzaerVar);
        s.j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaerVar, zzadkVar, zzaeq.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaet zzaetVar, zzadk<zzaes> zzadkVar) {
        s.j(zzaetVar);
        s.j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaetVar, zzadkVar, zzaes.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafa zzafaVar, zzadk<zzafd> zzadkVar) {
        s.j(zzafaVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getAccountInfo", this.zzf), zzafaVar, zzadkVar, zzafd.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafb zzafbVar, zzadk<zzafn> zzadkVar) {
        s.j(zzafbVar);
        s.j(zzadkVar);
        zzadq zzadqVar = this.zzc;
        zzadn.zza(zzadqVar.zza("/token", this.zzf), zzafbVar, zzadkVar, zzafn.class, zzadqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafe zzafeVar, zzadk<zzafh> zzadkVar) {
        s.j(zzafeVar);
        s.j(zzadkVar);
        if (zzafeVar.zzb() != null) {
            zzb().zzb(zzafeVar.zzb().zze());
        }
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getOobConfirmationCode", this.zzf), zzafeVar, zzadkVar, zzafh.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafg zzafgVar, zzadk<zzafj> zzadkVar) {
        s.j(zzafgVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getRecaptchaParam", this.zzf), zzadkVar, zzafj.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafl zzaflVar, zzadk<zzafk> zzadkVar) {
        s.j(zzaflVar);
        s.j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzaflVar.zzb() + "&version=" + zzaflVar.zzc(), zzadkVar, zzafk.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafx zzafxVar, zzadk<zzafw> zzadkVar) {
        s.j(zzafxVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/resetPassword", this.zzf), zzafxVar, zzadkVar, zzafw.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzafz zzafzVar, zzadk<zzagb> zzadkVar) {
        s.j(zzafzVar);
        s.j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts:revokeToken", this.zzf), zzafzVar, zzadkVar, zzagb.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaga zzagaVar, zzadk<zzagd> zzadkVar) {
        s.j(zzagaVar);
        s.j(zzadkVar);
        if (!TextUtils.isEmpty(zzagaVar.zzc())) {
            zzb().zzb(zzagaVar.zzc());
        }
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/sendVerificationCode", this.zzf), zzagaVar, zzadkVar, zzagd.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagc zzagcVar, zzadk<zzagf> zzadkVar) {
        s.j(zzagcVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/setAccountInfo", this.zzf), zzagcVar, zzadkVar, zzagf.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzage zzageVar, zzadk<zzagh> zzadkVar) {
        s.j(zzageVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/signupNewUser", this.zzf), zzageVar, zzadkVar, zzagh.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagg zzaggVar, zzadk<zzagj> zzadkVar) {
        s.j(zzaggVar);
        s.j(zzadkVar);
        if (zzaggVar instanceof zzagk) {
            zzagk zzagkVar = (zzagk) zzaggVar;
            if (!TextUtils.isEmpty(zzagkVar.zzb())) {
                zzb().zzb(zzagkVar.zzb());
            }
        }
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaggVar, zzadkVar, zzagj.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagi zzagiVar, zzadk<zzagl> zzadkVar) {
        s.j(zzagiVar);
        s.j(zzadkVar);
        if (!TextUtils.isEmpty(zzagiVar.zzb())) {
            zzb().zzb(zzagiVar.zzb());
        }
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaSignIn:start", this.zzf), zzagiVar, zzadkVar, zzagl.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagt zzagtVar, zzadk<zzagv> zzadkVar) {
        s.j(zzagtVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyAssertion", this.zzf), zzagtVar, zzadkVar, zzagv.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagu zzaguVar, zzadk<zzagx> zzadkVar) {
        s.j(zzaguVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyCustomToken", this.zzf), zzaguVar, zzadkVar, zzagx.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagw zzagwVar, zzadk<zzagz> zzadkVar) {
        s.j(zzagwVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyPassword", this.zzf), zzagwVar, zzadkVar, zzagz.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzagy zzagyVar, zzadk<zzahb> zzadkVar) {
        s.j(zzagyVar);
        s.j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyPhoneNumber", this.zzf), zzagyVar, zzadkVar, zzahb.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(zzaha zzahaVar, zzadk<zzahd> zzadkVar) {
        s.j(zzahaVar);
        s.j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzahaVar, zzadkVar, zzahd.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadi
    public final void zza(String str, zzadk<Void> zzadkVar) {
        s.j(zzadkVar);
        zzb().zza(str);
        zzadkVar.zza((zzadk<Void>) null);
    }
}
