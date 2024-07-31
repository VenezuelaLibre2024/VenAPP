package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzflv {
    private final HashMap zza;
    private final zzfmb zzb;

    private zzflv() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfmb(t.b());
        hashMap.put("new_csi", "1");
    }

    public static zzflv zzb(String str) {
        zzflv zzflvVar = new zzflv();
        zzflvVar.zza.put("action", str);
        return zzflvVar;
    }

    public static zzflv zzc(String str) {
        zzflv zzflvVar = new zzflv();
        zzflvVar.zza.put("request_id", str);
        return zzflvVar;
    }

    public final zzflv zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzflv zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzflv zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzflv zzf(zzfgm zzfgmVar) {
        this.zza.put("aai", zzfgmVar.zzx);
        return this;
    }

    public final zzflv zzg(zzfgp zzfgpVar) {
        if (!TextUtils.isEmpty(zzfgpVar.zzb)) {
            this.zza.put("gqi", zzfgpVar.zzb);
        }
        return this;
    }

    public final zzflv zzh(zzfgy zzfgyVar, zzcdp zzcdpVar) {
        HashMap hashMap;
        String str;
        zzfgx zzfgxVar = zzfgyVar.zzb;
        zzg(zzfgxVar.zzb);
        if (!zzfgxVar.zza.isEmpty()) {
            String str2 = "ad_format";
            switch (((zzfgm) zzfgxVar.zza.get(0)).zzb) {
                case 1:
                    hashMap = this.zza;
                    str = "banner";
                    hashMap.put(str2, str);
                    break;
                case 2:
                    hashMap = this.zza;
                    str = "interstitial";
                    hashMap.put(str2, str);
                    break;
                case 3:
                    hashMap = this.zza;
                    str = "native_express";
                    hashMap.put(str2, str);
                    break;
                case 4:
                    hashMap = this.zza;
                    str = "native_advanced";
                    hashMap.put(str2, str);
                    break;
                case 5:
                    hashMap = this.zza;
                    str = "rewarded";
                    hashMap.put(str2, str);
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzcdpVar != null) {
                        hashMap = this.zza;
                        str = true != zzcdpVar.zzm() ? "0" : "1";
                        str2 = "as";
                        hashMap.put(str2, str);
                        break;
                    }
                    break;
                default:
                    hashMap = this.zza;
                    str = "unknown";
                    hashMap.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final zzflv zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfma zzfmaVar : this.zzb.zza()) {
            hashMap.put(zzfmaVar.zza, zzfmaVar.zzb);
        }
        return hashMap;
    }
}
