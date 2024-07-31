package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.u1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class zzdwn {
    protected final Context zzc;
    protected final Executor zzd;
    protected final zzceh zze;
    private final zzfmg zzg;
    protected final String zza = (String) zzbhu.zzb.zze();
    protected final Map zzb = new HashMap();
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference(new Bundle());
    protected final boolean zzf = ((Boolean) a0.c().zza(zzbgc.zzbX)).booleanValue();
    private final boolean zzh = ((Boolean) a0.c().zza(zzbgc.zzca)).booleanValue();
    private final boolean zzi = ((Boolean) a0.c().zza(zzbgc.zzhb)).booleanValue();

    public zzdwn(Executor executor, zzceh zzcehVar, zzfmg zzfmgVar, Context context) {
        this.zzd = executor;
        this.zze = zzcehVar;
        this.zzg = zzfmgVar;
        this.zzc = context;
    }

    private final void zza(Map map, boolean z10) {
        if (map.isEmpty()) {
            zzcec.zze("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            zzcec.zze("Empty or null paramMap.");
        } else {
            if (!this.zzj.getAndSet(true)) {
                String str = (String) a0.c().zza(zzbgc.zzjZ);
                this.zzk.set(com.google.android.gms.ads.internal.util.e.a(this.zzc, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdwm
                    public final /* synthetic */ String zzb;

                    public /* synthetic */ zzdwm(String str2) {
                        r2 = str2;
                    }

                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        zzdwn.this.zzd(r2, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.zzk.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        String zza = this.zzg.zza(map);
        u1.a(zza);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zzf) {
            if (!z10 || this.zzh) {
                if (!parseBoolean || this.zzi) {
                    this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwl
                        public final /* synthetic */ String zzb;

                        public /* synthetic */ zzdwl(String zza2) {
                            r2 = zza2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdwn.this.zze.zza(r2);
                        }
                    });
                }
            }
        }
    }

    public final String zzb(Map map) {
        return this.zzg.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzk.set(com.google.android.gms.ads.internal.util.e.b(this.zzc, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
