package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbsn {
    private static zzbsn zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbsn() {
    }

    public static zzbsn zza() {
        if (zza == null) {
            zza = new zzbsn();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsm
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbgc.zza(context2);
                if (((Boolean) a0.c().zza(zzbgc.zzat)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) a0.c().zza(zzbgc.zzah)).booleanValue());
                if (((Boolean) a0.c().zza(zzbgc.zzao)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzclf) zzceg.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcee() { // from class: com.google.android.gms.internal.ads.zzbsl
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzcee
                        public final Object zza(Object obj) {
                            return zzcle.zzb(obj);
                        }
                    })).zze(com.google.android.gms.dynamic.d.h2(context2), new zzbsk(va.a.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzcef | NullPointerException e10) {
                    zzcec.zzl("#007 Could not call remote method.", e10);
                }
            }
        });
        thread.start();
        return thread;
    }
}
