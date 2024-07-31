package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeuz implements zzexq {
    private final zzgey zza;
    private final zzdzd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeuz(zzgey zzgeyVar, zzdzd zzdzdVar) {
        this.zza = zzgeyVar;
        this.zzb = zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuz.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeva zzc() {
        zzdzd zzdzdVar = this.zzb;
        String zzc = zzdzdVar.zzc();
        boolean zzq = zzdzdVar.zzq();
        boolean l10 = t.u().l();
        zzdzd zzdzdVar2 = this.zzb;
        return new zzeva(zzc, zzq, l10, zzdzdVar2.zzo(), zzdzdVar2.zzr());
    }
}
