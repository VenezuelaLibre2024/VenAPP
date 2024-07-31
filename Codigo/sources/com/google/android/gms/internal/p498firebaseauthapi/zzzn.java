package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* loaded from: classes2.dex */
final class zzzn implements zzadk<zzaeq> {
    private final /* synthetic */ zzzo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzn(zzzo zzzoVar) {
        this.zza = zzzoVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzaeq zzaeqVar) {
        zzaeq zzaeqVar2 = zzaeqVar;
        zzafn zzafnVar = new zzafn(zzaeqVar2.zzb(), zzaeqVar2.zza(), Long.valueOf(zzafp.zza(zzaeqVar2.zza())), "Bearer");
        zzzo zzzoVar = this.zza;
        zzzoVar.zzb.zza(zzafnVar, null, null, Boolean.FALSE, null, zzzoVar.zza, this);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza.zza(C9881q.m29583a(str));
    }
}
