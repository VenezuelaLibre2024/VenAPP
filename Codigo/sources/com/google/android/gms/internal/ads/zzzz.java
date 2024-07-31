package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzzz implements zzabo {
    private final Context zza;
    private final zzaab zzb;

    public zzzz(Context context, zzaab zzaabVar, zzcq zzcqVar) {
        this.zza = context;
        this.zzb = zzaabVar;
        int i10 = zzfy.zza;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && i10 == 30) {
            String str = zzfy.zzd;
            if (!zzfwk.zzc(str, "moto g(20)")) {
                zzfwk.zzc(str, "rmx3231");
            }
        }
        throw null;
    }
}
