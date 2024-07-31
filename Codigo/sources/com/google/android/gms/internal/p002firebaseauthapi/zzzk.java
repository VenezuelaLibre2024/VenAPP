package com.google.android.gms.internal.p002firebaseauthapi;

import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzk implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    final /* synthetic */ zzyj zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzk(zzyj zzyjVar, String str, String str2, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zzc = str;
        this.zzd = str2;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzadi zzadiVar;
        zzaha zzahaVar = new zzaha(zzafnVar.zzc(), this.zzc, this.zzd);
        zzadiVar = this.zzb.zza;
        zzadiVar.zza(zzahaVar, new zzzj(this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }
}
