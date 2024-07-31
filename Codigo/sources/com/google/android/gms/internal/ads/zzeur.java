package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import l9.y;

/* loaded from: classes2.dex */
public final class zzeur implements zzexq {
    private final zzgey zza;
    private final zzfhh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeur(zzgey zzgeyVar, zzfhh zzfhhVar) {
        this.zza = zzgeyVar;
        this.zzb = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeur.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeus zzc() {
        return new zzeus("requester_type_2".equals(y.b(this.zzb.zzd)));
    }
}
