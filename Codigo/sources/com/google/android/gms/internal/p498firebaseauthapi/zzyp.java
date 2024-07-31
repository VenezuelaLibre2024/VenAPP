package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyp implements zzadk<zzafd> {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzafn zzc;
    private final /* synthetic */ zzagc zzd;
    private final /* synthetic */ zzyj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyp(zzyj zzyjVar, zzadl zzadlVar, zzacd zzacdVar, zzafn zzafnVar, zzagc zzagcVar) {
        this.zze = zzyjVar;
        this.zza = zzadlVar;
        this.zzb = zzacdVar;
        this.zzc = zzafnVar;
        this.zzd = zzagcVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        List<zzafc> zza = zzafdVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzyj.zza(this.zze, this.zzb, this.zzc, zza.get(0), this.zzd, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
