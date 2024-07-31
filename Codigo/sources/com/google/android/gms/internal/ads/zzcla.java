package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzcla {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcla(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcla zza() {
        return new zzcla(0, 0, 0);
    }

    public static zzcla zzb(int i10, int i11) {
        return new zzcla(1, i10, i11);
    }

    public static zzcla zzc(z4 z4Var) {
        return z4Var.f8834d ? new zzcla(3, 0, 0) : z4Var.f8839t ? new zzcla(2, 0, 0) : z4Var.f8838s ? zza() : zzb(z4Var.f8836f, z4Var.f8833c);
    }

    public static zzcla zzd() {
        return new zzcla(5, 0, 0);
    }

    public static zzcla zze() {
        return new zzcla(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
