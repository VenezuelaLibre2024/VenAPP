package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaep implements zzaej {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaep(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
    }

    public static zzaep zzb(zzfp zzfpVar) {
        int zzi = zzfpVar.zzi();
        zzfpVar.zzL(12);
        int zzi2 = zzfpVar.zzi();
        int zzi3 = zzfpVar.zzi();
        int zzi4 = zzfpVar.zzi();
        zzfpVar.zzL(4);
        int zzi5 = zzfpVar.zzi();
        int zzi6 = zzfpVar.zzi();
        zzfpVar.zzL(8);
        return new zzaep(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return 1752331379;
    }
}
