package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcrv implements zzdbs {
    private final zzfif zza;

    public zzcrv(zzfif zzfifVar) {
        this.zza = zzfifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbs(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfho e10) {
            zzcec.zzk("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbu(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfho e10) {
            zzcec.zzk("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfho e10) {
            zzcec.zzk("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
