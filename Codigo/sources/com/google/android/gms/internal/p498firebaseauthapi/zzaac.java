package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.firebase.auth.C6058d1;
import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaac implements zzadk<zzafn> {
    private final /* synthetic */ C6058d1 zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzyj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaac(zzyj zzyjVar, C6058d1 c6058d1, zzacd zzacdVar) {
        this.zzc = zzyjVar;
        this.zza = c6058d1;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzafn zzafnVar2 = zzafnVar;
        zzagc zzagcVar = new zzagc();
        zzagcVar.zzd(zzafnVar2.zzc());
        if (this.zza.zzb() || this.zza.m16483R() != null) {
            zzagcVar.zzb(this.zza.m16483R());
        }
        if (this.zza.zzc() || this.zza.m16484u1() != null) {
            zzagcVar.zzg(this.zza.zza());
        }
        zzyj.zza(this.zzc, this.zzb, zzafnVar2, zzagcVar, this);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(C9881q.m29583a(str));
    }
}
