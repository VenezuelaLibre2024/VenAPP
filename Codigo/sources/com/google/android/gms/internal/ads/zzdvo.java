package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.regex.Pattern;
import l9.y;

/* loaded from: classes2.dex */
public final class zzdvo implements zzdfp, com.google.android.gms.ads.internal.client.a, zzdbr, zzdbb {
    private final Context zza;
    private final zzfhz zzb;
    private final zzdwf zzc;
    private final zzfgy zzd;
    private final zzfgm zze;
    private final zzehh zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) a0.c().zza(zzbgc.zzgR)).booleanValue();

    public zzdvo(Context context, zzfhz zzfhzVar, zzdwf zzdwfVar, zzfgy zzfgyVar, zzfgm zzfgmVar, zzehh zzehhVar) {
        this.zza = context;
        this.zzb = zzfhzVar;
        this.zzc = zzdwfVar;
        this.zzd = zzfgyVar;
        this.zze = zzfgmVar;
        this.zzf = zzehhVar;
    }

    private final zzdwe zzd(String str) {
        zzdwe zza = this.zzc.zza();
        zza.zze(this.zzd.zzb.zzb);
        zza.zzd(this.zze);
        zza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zza.zzb("device_connectivity", true != t.q().zzz(this.zza) ? "offline" : androidx.browser.customtabs.b.ONLINE_EXTRAS_KEY);
            zza.zzb("event_timestamp", String.valueOf(t.b().a()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) a0.c().zza(zzbgc.zzha)).booleanValue()) {
            boolean z10 = y.e(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z10));
            if (z10) {
                u4 u4Var = this.zzd.zza.zza.zzd;
                zza.zzc("ragent", u4Var.A);
                zza.zzc("rtype", y.a(y.b(u4Var)));
            }
        }
        return zza;
    }

    private final void zze(zzdwe zzdweVar) {
        if (!this.zze.zzaj) {
            zzdweVar.zzg();
            return;
        }
        this.zzf.zzd(new zzehj(t.b().a(), this.zzd.zzb.zzb.zzb, zzdweVar.zzf(), 2));
    }

    private final boolean zzf() {
        String str;
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str2 = (String) a0.c().zza(zzbgc.zzbt);
                    t.r();
                    try {
                        str = j2.R(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z10 = false;
                    if (str2 != null && str != null) {
                        try {
                            z10 = Pattern.matches(str2, str);
                        } catch (RuntimeException e10) {
                            t.q().zzw(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zza(c3 c3Var) {
        c3 c3Var2;
        if (this.zzh) {
            zzdwe zzd = zzd("ifts");
            zzd.zzb(Constants.REASON, "adapter");
            int i10 = c3Var.f8626a;
            String str = c3Var.f8627b;
            if (c3Var.f8628c.equals("com.google.android.gms.ads") && (c3Var2 = c3Var.f8629d) != null && !c3Var2.f8628c.equals("com.google.android.gms.ads")) {
                c3 c3Var3 = c3Var.f8629d;
                i10 = c3Var3.f8626a;
                str = c3Var3.f8627b;
            }
            if (i10 >= 0) {
                zzd.zzb("arec", String.valueOf(i10));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzd.zzb("areec", zza);
            }
            zzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzb() {
        if (this.zzh) {
            zzdwe zzd = zzd("ifts");
            zzd.zzb(Constants.REASON, "blocked");
            zzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzc(zzdkv zzdkvVar) {
        if (this.zzh) {
            zzdwe zzd = zzd("ifts");
            zzd.zzb(Constants.REASON, Constants.EXCEPTION);
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                zzd.zzb("msg", zzdkvVar.getMessage());
            }
            zzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        if (zzf() || this.zze.zzaj) {
            zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
