package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcbe extends zzcaj {
    private final String zza;
    private final int zzb;

    public zzcbe(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public zzcbe(n9.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final String zzf() {
        return this.zza;
    }
}
