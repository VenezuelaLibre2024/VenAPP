package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaae implements zzadk<zzafn> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzyj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaae(zzyj zzyjVar, String str, zzacd zzacdVar) {
        this.zzc = zzyjVar;
        this.zza = str;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzafn zzafnVar2 = zzafnVar;
        String zzc = zzafnVar2.zzc();
        zzagc zzagcVar = new zzagc();
        zzagcVar.zzd(zzc).zzf(this.zza);
        zzyj.zza(this.zzc, this.zzb, zzafnVar2, zzagcVar, this);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(C9881q.m29583a(str));
    }
}