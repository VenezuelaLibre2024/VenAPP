package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzetb implements zzexq {
    private final zzgey zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetb(zzgey zzgeyVar) {
        this.zza = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetc.zzb();
            }
        });
    }
}
