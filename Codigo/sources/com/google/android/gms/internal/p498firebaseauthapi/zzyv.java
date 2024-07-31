package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyv implements zzadk<zzagx> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyv(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagx zzagxVar) {
        zzagx zzagxVar2 = zzagxVar;
        this.zzb.zza(new zzafn(zzagxVar2.zzc(), zzagxVar2.zzb(), Long.valueOf(zzagxVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzagxVar2.zzd()), null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(C9881q.m29583a(str));
    }
}
