package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfmz implements Runnable {
    private final zzfnc zzb;
    private String zzc;
    private String zzd;
    private zzfgx zze;
    private c3 zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    public zzfmz(zzfnc zzfncVar) {
        this.zzb = zzfncVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfmz zza(zzfmo zzfmoVar) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfmoVar.zzi();
            list.add(zzfmoVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcep.zzd.schedule(this, ((Integer) a0.c().zza(zzbgc.zziG)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfmz zzb(String str) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue() && zzfmy.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfmz zzc(c3 c3Var) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            this.zzf = c3Var;
        }
        return this;
    }

    public final synchronized zzfmz zzd(ArrayList arrayList) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(x8.c.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(x8.c.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(x8.c.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(x8.c.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(x8.c.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfmz zze(String str) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfmz zzf(zzfgx zzfgxVar) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            this.zze = zzfgxVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfmo zzfmoVar : this.zza) {
                int i10 = this.zzh;
                if (i10 != 2) {
                    zzfmoVar.zzm(i10);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfmoVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfmoVar.zzk()) {
                    zzfmoVar.zzd(this.zzd);
                }
                zzfgx zzfgxVar = this.zze;
                if (zzfgxVar != null) {
                    zzfmoVar.zzb(zzfgxVar);
                } else {
                    c3 c3Var = this.zzf;
                    if (c3Var != null) {
                        zzfmoVar.zza(c3Var);
                    }
                }
                this.zzb.zzb(zzfmoVar.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfmz zzh(int i10) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            this.zzh = i10;
        }
        return this;
    }
}
