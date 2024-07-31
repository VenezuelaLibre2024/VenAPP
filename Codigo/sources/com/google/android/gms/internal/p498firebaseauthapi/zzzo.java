package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzo implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    final /* synthetic */ zzyj zzb;
    private final /* synthetic */ zzaer zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzo(zzyj zzyjVar, zzaer zzaerVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zzc = zzaerVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzadi zzadiVar;
        this.zzc.zza(zzafnVar.zzc());
        zzadiVar = this.zzb.zza;
        zzadiVar.zza(this.zzc, new zzzn(this));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(C9881q.m29583a(str));
    }
}
