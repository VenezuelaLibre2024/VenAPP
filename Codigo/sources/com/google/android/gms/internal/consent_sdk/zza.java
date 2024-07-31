package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* loaded from: classes2.dex */
public abstract class zza {
    private static zza zza;

    public static zza zza(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            if (zza == null) {
                zzai zzaiVar = new zzai(null);
                zzaiVar.zzb((Application) context.getApplicationContext());
                zza = zzaiVar.zza();
            }
            zzaVar = zza;
        }
        return zzaVar;
    }

    public abstract zzj zzb();

    public abstract zzbn zzc();
}