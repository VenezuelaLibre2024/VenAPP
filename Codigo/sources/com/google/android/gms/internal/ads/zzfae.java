package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfae implements zzexq {
    final zzgey zza;
    final String zzb;
    final zzccz zzc;

    public zzfae(zzccz zzcczVar, zzgey zzgeyVar, String str) {
        this.zzc = zzcczVar;
        this.zza = zzgeyVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        final com.google.common.util.concurrent.f zzh = zzgen.zzh(null);
        if (((Boolean) a0.c().zza(zzbgc.zzfP)).booleanValue()) {
            zzh = zzgen.zzh(null);
        }
        final com.google.common.util.concurrent.f zzh2 = zzgen.zzh(null);
        return zzgen.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfad
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfaf((String) com.google.common.util.concurrent.f.this.get(), (String) zzh2.get());
            }
        }, zzcep.zza);
    }
}
