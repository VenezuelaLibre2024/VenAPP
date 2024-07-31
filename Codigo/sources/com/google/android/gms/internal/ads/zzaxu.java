package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzaxu extends zzaxx {
    private final View zzi;

    public zzaxu(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, View view) {
        super(zzawjVar, "a1Na7bntM+sktGxZBhUnqailj8ITQ7piLQZ5OyqVU2HU4R0rOCZ63N/fUHG081A+", "eISRjanjhAfdgJ9+lE3tGViJFRMvsuX1oVbmo+9k2XU=", zzasgVar, i10, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        if (this.zzi != null) {
            Boolean bool = (Boolean) a0.c().zza(zzbgc.zzdk);
            Boolean bool2 = (Boolean) a0.c().zza(zzbgc.zzku);
            zzawn zzawnVar = new zzawn((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzatb zza = zzatc.zza();
            zza.zzb(zzawnVar.zza.longValue());
            zza.zzd(zzawnVar.zzb.longValue());
            zza.zze(zzawnVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzawnVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzawnVar.zzd.longValue());
            }
            this.zze.zzY((zzatc) zza.zzal());
        }
    }
}
