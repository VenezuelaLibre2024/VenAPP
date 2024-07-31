package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfny {
    private final Context zza;
    private final Executor zzb;
    private final zzceh zzc;
    private final zzfnc zzd;

    public zzfny(Context context, Executor executor, zzceh zzcehVar, zzfnc zzfncVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcehVar;
        this.zzd = zzfncVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfmz zzfmzVar) {
        zzfmo zza = zzfmn.zza(this.zza, 14);
        zza.zzh();
        zza.zzf(this.zzc.zza(str));
        if (zzfmzVar == null) {
            this.zzd.zzb(zza.zzl());
        } else {
            zzfmzVar.zza(zza);
            zzfmzVar.zzg();
        }
    }

    public final void zzc(String str, zzfmz zzfmzVar) {
        if (zzfnc.zza() && ((Boolean) zzbht.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnx
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzfmz zzc;

                public /* synthetic */ zzfnx(String str2, zzfmz zzfmzVar2) {
                    r2 = str2;
                    r3 = zzfmzVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzfny.this.zzb(r2, r3);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnw
                public final /* synthetic */ String zzb;

                public /* synthetic */ zzfnw(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzfny.this.zza(r2);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
