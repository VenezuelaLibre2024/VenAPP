package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaeo implements zzaej {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeo(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzaeo zzb(zzfp zzfpVar) {
        int zzi = zzfpVar.zzi();
        zzfpVar.zzL(8);
        int zzi2 = zzfpVar.zzi();
        int zzi3 = zzfpVar.zzi();
        zzfpVar.zzL(4);
        int zzi4 = zzfpVar.zzi();
        zzfpVar.zzL(12);
        return new zzaeo(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return 1751742049;
    }
}
