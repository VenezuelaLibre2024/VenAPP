package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdwp {
    private final String zze;
    private final zzdwk zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final w1 zza = t.q().zzi();

    public zzdwp(String str, zzdwk zzdwkVar) {
        this.zze = str;
        this.zzf = zzdwkVar;
    }

    private final Map zzg() {
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(t.b().b(), 10));
        zza.put("tid", this.zza.zzQ() ? "" : this.zze);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) a0.c().zza(zzbgc.zzbZ)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "aaia");
                zzg.put("aair", "MalformedJson");
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) a0.c().zza(zzbgc.zzbZ)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_finished");
                zzg.put("ancn", str);
                zzg.put("rqe", str2);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) a0.c().zza(zzbgc.zzbZ)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_started");
                zzg.put("ancn", str);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) a0.c().zza(zzbgc.zzbZ)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_finished");
                zzg.put("ancn", str);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zze() {
        if (((Boolean) a0.c().zza(zzbgc.zzbZ)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue() && !this.zzd) {
                Map zzg = zzg();
                zzg.put("action", "init_finished");
                this.zzb.add(zzg);
                Iterator it = this.zzb.iterator();
                while (it.hasNext()) {
                    this.zzf.zzf((Map) it.next());
                }
                this.zzd = true;
            }
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) a0.c().zza(zzbgc.zzbZ)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue() && !this.zzc) {
                Map zzg = zzg();
                zzg.put("action", "init_started");
                this.zzb.add(zzg);
                this.zzc = true;
            }
        }
    }
}
