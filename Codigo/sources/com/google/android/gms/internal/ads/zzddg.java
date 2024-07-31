package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.b5;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzddg extends zzdgl implements zzdbr, zzdcw {
    private final zzfgm zzb;
    private final AtomicBoolean zzc;

    public zzddg(Set set, zzfgm zzfgmVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfgmVar;
    }

    private final void zzb() {
        b5 b5Var;
        if (((Boolean) a0.c().zza(zzbgc.zzhH)).booleanValue() && this.zzc.compareAndSet(false, true) && (b5Var = this.zzb.zzaf) != null && b5Var.f8621a == 3) {
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzddf
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    zzddg.this.zza((zzddi) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzddi zzddiVar) {
        zzddiVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }
}
