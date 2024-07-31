package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzhhq {
    private final List zza;
    private final List zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhhq(int i10, int i11, zzhhp zzhhpVar) {
        this.zza = zzhha.zzc(i10);
        this.zzb = zzhha.zzc(i11);
    }

    public final zzhhq zza(zzhhm zzhhmVar) {
        this.zzb.add(zzhhmVar);
        return this;
    }

    public final zzhhq zzb(zzhhm zzhhmVar) {
        this.zza.add(zzhhmVar);
        return this;
    }

    public final zzhhr zzc() {
        return new zzhhr(this.zza, this.zzb, null);
    }
}
