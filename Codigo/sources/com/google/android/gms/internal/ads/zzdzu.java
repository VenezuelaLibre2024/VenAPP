package com.google.android.gms.internal.ads;

import x8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdzu extends x8.e {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdzx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzu(zzdzx zzdzxVar, String str) {
        this.zza = str;
        this.zzb = zzdzxVar;
    }

    @Override // x8.e
    public final void onAdFailedToLoad(o oVar) {
        String zzl;
        zzdzx zzdzxVar = this.zzb;
        zzl = zzdzx.zzl(oVar);
        zzdzxVar.zzm(zzl, this.zza);
    }
}
