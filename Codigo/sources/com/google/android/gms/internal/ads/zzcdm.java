package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;

/* loaded from: classes2.dex */
public final class zzcdm {
    final String zzf;
    private final w1 zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzcdm(String str, w1 w1Var) {
        this.zzf = str;
        this.zzk = w1Var;
    }

    private final void zzi() {
        if (((Boolean) zzbih.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzj) {
            i10 = this.zzi;
        }
        return i10;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.zzj) {
            bundle = new Bundle();
            if (!this.zzk.zzQ()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzbzs.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z10 = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z10 = true;
                    } else {
                        zzcec.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcec.zzj("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                }
                bundle.putBoolean("support_transparent_background", z10);
                bundle.putInt("consent_form_action_identifier", zza());
            }
            zzcec.zzi(str2);
            bundle.putBoolean("support_transparent_background", z10);
            bundle.putInt("consent_form_action_identifier", zza());
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(u4 u4Var, long j10) {
        Bundle bundle;
        synchronized (this.zzj) {
            long zzd = this.zzk.zzd();
            long a10 = t.b().a();
            if (this.zzb == -1) {
                if (a10 - zzd > ((Long) a0.c().zza(zzbgc.zzaT)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzk.zzc();
                }
                this.zzb = j10;
            }
            this.zza = j10;
            if (((Boolean) a0.c().zza(zzbgc.zzdt)).booleanValue() || (bundle = u4Var.f8751c) == null || bundle.getInt("gw", 2) != 1) {
                this.zzc++;
                int i10 = this.zzd + 1;
                this.zzd = i10;
                if (i10 == 0) {
                    this.zze = 0L;
                    this.zzk.d(a10);
                } else {
                    this.zze = a10 - this.zzk.zze();
                }
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
