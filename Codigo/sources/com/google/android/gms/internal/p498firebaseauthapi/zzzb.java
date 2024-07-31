package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzb implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    final /* synthetic */ zzyj zzb;
    private final /* synthetic */ zzagy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzb(zzyj zzyjVar, zzagy zzagyVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zzc = zzagyVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzadi zzadiVar;
        this.zzc.zza(zzafnVar.zzc());
        zzadiVar = this.zzb.zza;
        zzadiVar.zza(this.zzc, new zzze(this, this));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(C9881q.m29583a(str));
    }
}
