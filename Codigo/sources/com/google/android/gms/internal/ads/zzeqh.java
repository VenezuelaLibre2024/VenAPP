package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.i2;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzeqh implements zzddi {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(i2 i2Var) {
        this.zza.set(i2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzh(final b5 b5Var) {
        zzfdr.zza(this.zza, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzeqg
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((i2) obj).x1(b5.this);
            }
        });
    }
}
