package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbrz implements zzcew {
    final /* synthetic */ zzceu zza;
    final /* synthetic */ zzbrd zzb;

    public zzbrz(zzbsb zzbsbVar, zzceu zzceuVar, zzbrd zzbrdVar) {
        this.zza = zzceuVar;
        this.zzb = zzbrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcew
    public final void zza() {
        u1.a("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbrm("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
