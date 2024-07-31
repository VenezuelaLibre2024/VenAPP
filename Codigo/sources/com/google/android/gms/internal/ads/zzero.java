package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;
import l9.y;

/* loaded from: classes2.dex */
public final class zzero implements zzexq {
    private final zzgey zza;
    private final zzfhh zzb;
    private final zzfhw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzero(zzgey zzgeyVar, zzfhh zzfhhVar, zzfhw zzfhwVar) {
        this.zza = zzgeyVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzern
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzero.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzerp zzc() {
        String str = null;
        if (((Boolean) a0.c().zza(zzbgc.zzhi)).booleanValue() && "requester_type_2".equals(y.b(this.zzb.zzd))) {
            str = zzfhw.zza();
        }
        return new zzerp(str);
    }
}
