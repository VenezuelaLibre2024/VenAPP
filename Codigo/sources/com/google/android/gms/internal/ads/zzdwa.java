package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l9.y;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdwa {
    private final ConcurrentHashMap zza;
    private final zzcdp zzb;
    private final zzfhh zzc;
    private final String zzd;
    private final String zze;

    public zzdwa(zzdwk zzdwkVar, zzcdp zzcdpVar, zzfhh zzfhhVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdwkVar.zzc();
        this.zza = zzc;
        this.zzb = zzcdpVar;
        this.zzc = zzfhhVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) a0.c().zza(zzbgc.zzha)).booleanValue()) {
            int e10 = y.e(zzfhhVar);
            int i10 = e10 - 1;
            if (i10 == 0) {
                zzc.put("scar", "false");
                return;
            }
            zzc.put("se", i10 != 1 ? i10 != 2 ? i10 != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            zzc.put("scar", "true");
            if (((Boolean) a0.c().zza(zzbgc.zzhz)).booleanValue()) {
                zzc.put("ad_format", str2);
            }
            if (e10 == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfhhVar.zzd.A);
            zzd("rtype", y.a(y.b(zzfhhVar.zzd)));
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfgy zzfgyVar) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (!zzfgyVar.zzb.zza.isEmpty()) {
            switch (((zzfgm) zzfgyVar.zzb.zza.get(0)).zzb) {
                case 1:
                    concurrentHashMap = this.zza;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.zza;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.zza;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.zza;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.zza;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.zza;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        zzd("gqi", zzfgyVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
