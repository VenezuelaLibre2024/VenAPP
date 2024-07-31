package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.d1;
import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaac implements zzadk<zzafn> {
    private final /* synthetic */ d1 zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzyj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaac(zzyj zzyjVar, d1 d1Var, zzacd zzacdVar) {
        this.zzc = zzyjVar;
        this.zza = d1Var;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzafn zzafnVar2 = zzafnVar;
        zzagc zzagcVar = new zzagc();
        zzagcVar.zzd(zzafnVar2.zzc());
        if (this.zza.zzb() || this.zza.R() != null) {
            zzagcVar.zzb(this.zza.R());
        }
        if (this.zza.zzc() || this.zza.u1() != null) {
            zzagcVar.zzg(this.zza.zza());
        }
        zzyj.zza(this.zzc, this.zzb, zzafnVar2, zzagcVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }
}
