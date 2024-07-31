package com.google.android.gms.internal.ads;

import x8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdzq extends x8.e {
    final /* synthetic */ String zza;
    final /* synthetic */ x8.k zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdzx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzq(zzdzx zzdzxVar, String str, x8.k kVar, String str2) {
        this.zza = str;
        this.zzb = kVar;
        this.zzc = str2;
        this.zzd = zzdzxVar;
    }

    @Override // x8.e
    public final void onAdFailedToLoad(o oVar) {
        String zzl;
        zzdzx zzdzxVar = this.zzd;
        zzl = zzdzx.zzl(oVar);
        zzdzxVar.zzm(zzl, this.zzc);
    }

    @Override // x8.e
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
