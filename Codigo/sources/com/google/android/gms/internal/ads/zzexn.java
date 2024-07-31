package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzexn implements zzexq {
    private final zzgey zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexn(zzgey zzgeyVar, Context context) {
        this.zza = zzgeyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexn.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzexp zzc() {
        final Bundle b10 = com.google.android.gms.ads.internal.util.e.b(this.zzb, (String) a0.c().zza(zzbgc.zzgf));
        if (b10.isEmpty()) {
            return null;
        }
        return new zzexp() { // from class: com.google.android.gms.internal.ads.zzexm
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", b10);
            }
        };
    }
}
