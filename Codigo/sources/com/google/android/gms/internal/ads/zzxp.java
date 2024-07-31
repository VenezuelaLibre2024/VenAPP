package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzxp implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxp(zzam zzamVar, int i10) {
        this.zza = 1 == (zzamVar.zze & 1);
        this.zzb = zzyg.zzo(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxp zzxpVar) {
        return zzfzp.zzk().zze(this.zzb, zzxpVar.zzb).zze(this.zza, zzxpVar.zza).zza();
    }
}
