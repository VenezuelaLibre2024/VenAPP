package com.google.android.gms.internal.p498firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzc implements zzadk<zzagh> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzadl zzb;
    private final /* synthetic */ zzyj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzc(zzyj zzyjVar, zzacd zzacdVar, zzadl zzadlVar) {
        this.zzc = zzyjVar;
        this.zza = zzacdVar;
        this.zzb = zzadlVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagh zzaghVar) {
        zzagh zzaghVar2 = zzaghVar;
        this.zzc.zza(new zzafn(zzaghVar2.zzc(), zzaghVar2.zzb(), Long.valueOf(zzaghVar2.zza()), "Bearer"), null, "password", Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(str);
    }
}
