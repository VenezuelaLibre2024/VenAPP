package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzefg implements zzdfp, com.google.android.gms.ads.internal.client.a, zzdbr, zzdbb {
    private final Context zza;
    private final zzfhz zzb;
    private final zzfgy zzc;
    private final zzfgm zzd;
    private final zzehh zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) a0.c().zza(zzbgc.zzgR)).booleanValue();
    private final zzflw zzh;
    private final String zzi;

    public zzefg(Context context, zzfhz zzfhzVar, zzfgy zzfgyVar, zzfgm zzfgmVar, zzehh zzehhVar, zzflw zzflwVar, String str) {
        this.zza = context;
        this.zzb = zzfhzVar;
        this.zzc = zzfgyVar;
        this.zzd = zzfgmVar;
        this.zze = zzehhVar;
        this.zzh = zzflwVar;
        this.zzi = str;
    }

    private final zzflv zzd(String str) {
        zzflv zzb = zzflv.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzb.zza("device_connectivity", true != t.q().zzz(this.zza) ? "offline" : androidx.browser.customtabs.b.ONLINE_EXTRAS_KEY);
            zzb.zza("event_timestamp", String.valueOf(t.b().a()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zze(zzflv zzflvVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzflvVar);
            return;
        }
        this.zze.zzd(new zzehj(t.b().a(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzflvVar), 2));
    }

    private final boolean zzf() {
        String str;
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zza(c3 c3Var) {
        c3 c3Var2;
        if (this.zzg) {
            int i10 = c3Var.f8626a;
            String str = c3Var.f8627b;
            if (c3Var.f8628c.equals("com.google.android.gms.ads") && (c3Var2 = c3Var.f8629d) != null && !c3Var2.f8628c.equals("com.google.android.gms.ads")) {
                c3 c3Var3 = c3Var.f8629d;
                i10 = c3Var3.f8626a;
                str = c3Var3.f8627b;
            }
            String zza = this.zzb.zza(str);
            zzflv zzd = zzd("ifts");
            zzd.zza(Constants.REASON, "adapter");
            if (i10 >= 0) {
                zzd.zza("arec", String.valueOf(i10));
            }
            if (zza != null) {
                zzd.zza("areec", zza);
            }
            this.zzh.zzb(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzb() {
        if (this.zzg) {
            zzflw zzflwVar = this.zzh;
            zzflv zzd = zzd("ifts");
            zzd.zza(Constants.REASON, "blocked");
            zzflwVar.zzb(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzc(zzdkv zzdkvVar) {
        if (this.zzg) {
            zzflv zzd = zzd("ifts");
            zzd.zza(Constants.REASON, Constants.EXCEPTION);
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                zzd.zza("msg", zzdkvVar.getMessage());
            }
            this.zzh.zzb(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final void zzi() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final void zzj() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        if (zzf() || this.zzd.zzaj) {
            zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
