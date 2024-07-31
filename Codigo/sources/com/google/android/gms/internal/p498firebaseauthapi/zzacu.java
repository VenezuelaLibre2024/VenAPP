package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import p485zb.C12867g;

/* loaded from: classes2.dex */
final class zzacu extends zzadi implements zzaef {
    private zzaco zza;
    private zzacn zzb;
    private zzadq zzc;
    private final zzacr zzd;
    private final C12867g zze;
    private String zzf;
    private zzact zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacu(C12867g c12867g, zzacr zzacrVar) {
        this(c12867g, zzacrVar, null, null, null);
    }

    private zzacu(C12867g c12867g, zzacr zzacrVar, zzadq zzadqVar, zzaco zzacoVar, zzacn zzacnVar) {
        this.zze = c12867g;
        this.zzf = c12867g.m42632r().m42643b();
        this.zzd = (zzacr) C5276s.m13324j(zzacrVar);
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

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaef
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaek zzaekVar, zzadk<zzaen> zzadkVar) {
        C5276s.m13324j(zzaekVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/createAuthUri", this.zzf), zzaekVar, zzadkVar, zzaen.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaem zzaemVar, zzadk<Void> zzadkVar) {
        C5276s.m13324j(zzaemVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/deleteAccount", this.zzf), zzaemVar, zzadkVar, Void.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaep zzaepVar, zzadk<zzaeo> zzadkVar) {
        C5276s.m13324j(zzaepVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/emailLinkSignin", this.zzf), zzaepVar, zzadkVar, zzaeo.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaer zzaerVar, zzadk<zzaeq> zzadkVar) {
        C5276s.m13324j(zzaerVar);
        C5276s.m13324j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaerVar, zzadkVar, zzaeq.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaet zzaetVar, zzadk<zzaes> zzadkVar) {
        C5276s.m13324j(zzaetVar);
        C5276s.m13324j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaetVar, zzadkVar, zzaes.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafa zzafaVar, zzadk<zzafd> zzadkVar) {
        C5276s.m13324j(zzafaVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getAccountInfo", this.zzf), zzafaVar, zzadkVar, zzafd.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafb zzafbVar, zzadk<zzafn> zzadkVar) {
        C5276s.m13324j(zzafbVar);
        C5276s.m13324j(zzadkVar);
        zzadq zzadqVar = this.zzc;
        zzadn.zza(zzadqVar.zza("/token", this.zzf), zzafbVar, zzadkVar, zzafn.class, zzadqVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafe zzafeVar, zzadk<zzafh> zzadkVar) {
        C5276s.m13324j(zzafeVar);
        C5276s.m13324j(zzadkVar);
        if (zzafeVar.zzb() != null) {
            zzb().zzb(zzafeVar.zzb().zze());
        }
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getOobConfirmationCode", this.zzf), zzafeVar, zzadkVar, zzafh.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafg zzafgVar, zzadk<zzafj> zzadkVar) {
        C5276s.m13324j(zzafgVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getRecaptchaParam", this.zzf), zzadkVar, zzafj.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafl zzaflVar, zzadk<zzafk> zzadkVar) {
        C5276s.m13324j(zzaflVar);
        C5276s.m13324j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzaflVar.zzb() + "&version=" + zzaflVar.zzc(), zzadkVar, zzafk.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafx zzafxVar, zzadk<zzafw> zzadkVar) {
        C5276s.m13324j(zzafxVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/resetPassword", this.zzf), zzafxVar, zzadkVar, zzafw.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzafz zzafzVar, zzadk<zzagb> zzadkVar) {
        C5276s.m13324j(zzafzVar);
        C5276s.m13324j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts:revokeToken", this.zzf), zzafzVar, zzadkVar, zzagb.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaga zzagaVar, zzadk<zzagd> zzadkVar) {
        C5276s.m13324j(zzagaVar);
        C5276s.m13324j(zzadkVar);
        if (!TextUtils.isEmpty(zzagaVar.zzc())) {
            zzb().zzb(zzagaVar.zzc());
        }
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/sendVerificationCode", this.zzf), zzagaVar, zzadkVar, zzagd.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagc zzagcVar, zzadk<zzagf> zzadkVar) {
        C5276s.m13324j(zzagcVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/setAccountInfo", this.zzf), zzagcVar, zzadkVar, zzagf.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzage zzageVar, zzadk<zzagh> zzadkVar) {
        C5276s.m13324j(zzageVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/signupNewUser", this.zzf), zzageVar, zzadkVar, zzagh.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagg zzaggVar, zzadk<zzagj> zzadkVar) {
        C5276s.m13324j(zzaggVar);
        C5276s.m13324j(zzadkVar);
        if (zzaggVar instanceof zzagk) {
            zzagk zzagkVar = (zzagk) zzaggVar;
            if (!TextUtils.isEmpty(zzagkVar.zzb())) {
                zzb().zzb(zzagkVar.zzb());
            }
        }
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaggVar, zzadkVar, zzagj.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagi zzagiVar, zzadk<zzagl> zzadkVar) {
        C5276s.m13324j(zzagiVar);
        C5276s.m13324j(zzadkVar);
        if (!TextUtils.isEmpty(zzagiVar.zzb())) {
            zzb().zzb(zzagiVar.zzb());
        }
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaSignIn:start", this.zzf), zzagiVar, zzadkVar, zzagl.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagt zzagtVar, zzadk<zzagv> zzadkVar) {
        C5276s.m13324j(zzagtVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyAssertion", this.zzf), zzagtVar, zzadkVar, zzagv.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagu zzaguVar, zzadk<zzagx> zzadkVar) {
        C5276s.m13324j(zzaguVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyCustomToken", this.zzf), zzaguVar, zzadkVar, zzagx.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagw zzagwVar, zzadk<zzagz> zzadkVar) {
        C5276s.m13324j(zzagwVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyPassword", this.zzf), zzagwVar, zzadkVar, zzagz.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzagy zzagyVar, zzadk<zzahb> zzadkVar) {
        C5276s.m13324j(zzagyVar);
        C5276s.m13324j(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyPhoneNumber", this.zzf), zzagyVar, zzadkVar, zzahb.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(zzaha zzahaVar, zzadk<zzahd> zzadkVar) {
        C5276s.m13324j(zzahaVar);
        C5276s.m13324j(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzahaVar, zzadkVar, zzahd.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadi
    public final void zza(String str, zzadk<Void> zzadkVar) {
        C5276s.m13324j(zzadkVar);
        zzb().zza(str);
        zzadkVar.zza((zzadk<Void>) null);
    }
}
