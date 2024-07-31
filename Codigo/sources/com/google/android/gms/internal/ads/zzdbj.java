package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdbj extends zzdgl implements zzdbb {
    public zzdbj(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zza(c3 c3Var) {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbi
            public /* synthetic */ zzdbi() {
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbn) obj).zzp(c3.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzb() {
        zzu(zzdbh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzc(zzdkv zzdkvVar) {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbg
            public /* synthetic */ zzdbg() {
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbn) obj).zzp(zzfij.zzd(12, zzdkv.this.getMessage(), null));
            }
        });
    }
}
