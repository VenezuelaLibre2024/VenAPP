package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzccd implements zzayq {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzccd(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z10) {
        if (t.p().zzp(this.zza)) {
            synchronized (this.zzb) {
                if (this.zzd == z10) {
                    return;
                }
                this.zzd = z10;
                if (TextUtils.isEmpty(this.zzc)) {
                    return;
                }
                if (this.zzd) {
                    t.p().zzf(this.zza, this.zzc);
                } else {
                    t.p().zzg(this.zza, this.zzc);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzby(zzayp zzaypVar) {
        zzb(zzaypVar.zzj);
    }
}
