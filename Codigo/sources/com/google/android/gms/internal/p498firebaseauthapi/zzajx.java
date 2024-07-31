package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.List;

/* loaded from: classes2.dex */
final class zzajx extends zzajs {
    private zzajx() {
        super();
    }

    private static <E> zzajj<E> zzc(Object obj, long j10) {
        return (zzajj) zzamk.zze(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajs
    public final <L> List<L> zza(Object obj, long j10) {
        zzajj zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzajj zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzamk.zza(obj, j10, zza);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajs
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzajj zzc = zzc(obj, j10);
        zzajj zzc2 = zzc(obj2, j10);
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
        zzamk.zza(obj, j10, zzc2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzajs
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }
}
