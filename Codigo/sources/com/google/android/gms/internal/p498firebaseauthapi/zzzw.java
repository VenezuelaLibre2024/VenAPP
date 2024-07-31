package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzw implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzw(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzadi zzadiVar;
        zzaem zzaemVar = new zzaem(zzafnVar.zzc());
        zzadiVar = this.zzb.zza;
        zzadiVar.zza(zzaemVar, new zzzv(this, this));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(C9881q.m29583a(str));
    }
}
