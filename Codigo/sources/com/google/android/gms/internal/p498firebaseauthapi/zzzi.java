package com.google.android.gms.internal.p498firebaseauthapi;

import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzi implements zzadk<zzafn> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzacd zzb;
    final /* synthetic */ zzyj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzi(zzyj zzyjVar, String str, zzacd zzacdVar) {
        this.zzc = zzyjVar;
        this.zza = str;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzadi zzadiVar;
        zzafn zzafnVar2 = zzafnVar;
        zzafa zzafaVar = new zzafa(zzafnVar2.zzc());
        zzadiVar = this.zzc.zza;
        zzadiVar.zza(zzafaVar, new zzzh(this, this, zzafnVar2));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(C9881q.m29583a(str));
    }
}
