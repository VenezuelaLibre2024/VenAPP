package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.w1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzcci {
    static zzcci zza;

    public static synchronized zzcci zzd(Context context) {
        synchronized (zzcci.class) {
            zzcci zzcciVar = zza;
            if (zzcciVar != null) {
                return zzcciVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbgc.zza(applicationContext);
            w1 zzi = t.q().zzi();
            zzi.m(applicationContext);
            zzcca zzccaVar = new zzcca(null);
            zzccaVar.zzb(applicationContext);
            zzccaVar.zzc(t.b());
            zzccaVar.zza(zzi);
            zzccaVar.zzd(t.p());
            zzcci zze = zzccaVar.zze();
            zza = zze;
            zze.zza().zza();
            zzccm zzc = zza.zzc();
            if (((Boolean) a0.c().zza(zzbgc.zzaq)).booleanValue()) {
                t.r();
                Map W = j2.W((String) a0.c().zza(zzbgc.zzas));
                Iterator it = W.keySet().iterator();
                while (it.hasNext()) {
                    zzc.zzc((String) it.next());
                }
                zzc.zzd(new zzcck(zzc, W));
            }
            return zza;
        }
    }

    abstract zzcbt zza();

    public abstract zzcbx zzb();

    abstract zzccm zzc();
}
