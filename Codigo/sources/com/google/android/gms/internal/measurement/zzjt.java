package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
final class zzjt extends zzjs {
    /* JADX INFO: Access modifiers changed from: private */
    public zzjt() {
        super();
    }

    public /* synthetic */ zzjt(zzjw zzjwVar) {
        this();
    }

    private static <E> zzjf<E> zzc(Object obj, long j10) {
        return (zzjf) zzmg.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <L> List<L> zza(Object obj, long j10) {
        zzjf zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzjf zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzmg.zza(obj, j10, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzjf zzc = zzc(obj, j10);
        zzjf zzc2 = zzc(obj2, j10);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzmg.zza(obj, j10, zzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).i_();
    }
}
