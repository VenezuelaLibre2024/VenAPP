package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzm implements zzadk<zzagv> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzm(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagv zzagvVar) {
        zzagv zzagvVar2 = zzagvVar;
        if (zzagvVar2.zzl()) {
            this.zza.zza(new zzyk(zzagvVar2.zzf(), zzagvVar2.zzk(), zzagvVar2.zzb()));
        } else {
            zzyj.zza(this.zzb, zzagvVar2, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(C9881q.m29583a(str));
    }
}
