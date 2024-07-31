package com.google.android.gms.internal.ads;

import x8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdzs extends n9.d {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdzx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzs(zzdzx zzdzxVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdzxVar;
    }

    @Override // x8.f
    public final void onAdFailedToLoad(o oVar) {
        String zzl;
        zzdzx zzdzxVar = this.zzc;
        zzl = zzdzx.zzl(oVar);
        zzdzxVar.zzm(zzl, this.zzb);
    }

    @Override // x8.f
    public final /* bridge */ /* synthetic */ void onAdLoaded(n9.c cVar) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, cVar, str);
    }
}
