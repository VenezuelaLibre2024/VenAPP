package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzbro {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbrx zzc;
    private zzbrx zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbrx zza(Context context, zzcei zzceiVar, zzfnc zzfncVar) {
        zzbrx zzbrxVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbrx(zzc(context), zzceiVar, (String) a0.c().zza(zzbgc.zza), zzfncVar);
            }
            zzbrxVar = this.zzc;
        }
        return zzbrxVar;
    }

    public final zzbrx zzb(Context context, zzcei zzceiVar, zzfnc zzfncVar) {
        zzbrx zzbrxVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbrx(zzc(context), zzceiVar, (String) zzbik.zzb.zze(), zzfncVar);
            }
            zzbrxVar = this.zzd;
        }
        return zzbrxVar;
    }
}
