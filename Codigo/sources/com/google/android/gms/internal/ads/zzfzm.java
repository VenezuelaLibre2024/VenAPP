package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzfzm extends zzfzp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzm() {
        super(null);
    }

    static final zzfzp zzg(int i10) {
        zzfzp zzfzpVar;
        zzfzp zzfzpVar2;
        zzfzp zzfzpVar3;
        if (i10 < 0) {
            zzfzpVar3 = zzfzp.zzb;
            return zzfzpVar3;
        }
        if (i10 > 0) {
            zzfzpVar2 = zzfzp.zzc;
            return zzfzpVar2;
        }
        zzfzpVar = zzfzp.zza;
        return zzfzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzb(int i10, int i11) {
        return zzg(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzc(long j10, long j11) {
        return zzg(j10 < j11 ? -1 : j10 > j11 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzd(Object obj, Object obj2, Comparator comparator) {
        return zzg(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zze(boolean z10, boolean z11) {
        return zzg(zzgcs.zza(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzf(boolean z10, boolean z11) {
        return zzg(zzgcs.zza(z11, z10));
    }
}
