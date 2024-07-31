package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzhaq extends zzhas {
    private zzhaq() {
        super(null);
    }

    public /* synthetic */ zzhaq(zzhap zzhapVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final List zza(Object obj, long j10) {
        zzhad zzhadVar = (zzhad) zzhcz.zzh(obj, j10);
        if (zzhadVar.zzc()) {
            return zzhadVar;
        }
        int size = zzhadVar.size();
        zzhad zzd = zzhadVar.zzd(size == 0 ? 10 : size + size);
        zzhcz.zzv(obj, j10, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzb(Object obj, long j10) {
        ((zzhad) zzhcz.zzh(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzc(Object obj, Object obj2, long j10) {
        zzhad zzhadVar = (zzhad) zzhcz.zzh(obj, j10);
        zzhad zzhadVar2 = (zzhad) zzhcz.zzh(obj2, j10);
        int size = zzhadVar.size();
        int size2 = zzhadVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzhadVar.zzc()) {
                zzhadVar = zzhadVar.zzd(size2 + size);
            }
            zzhadVar.addAll(zzhadVar2);
        }
        if (size > 0) {
            zzhadVar2 = zzhadVar;
        }
        zzhcz.zzv(obj, j10, zzhadVar2);
    }
}
