package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzu implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzu(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzadi zzadiVar;
        zzafn zzafnVar2 = zzafnVar;
        zzafa zzafaVar = new zzafa(zzafnVar2.zzc());
        zzadiVar = this.zzb.zza;
        zzadiVar.zza(zzafaVar, new zzzt(this, this, zzafnVar2));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(C9881q.m29583a(str));
    }
}
