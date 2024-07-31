package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfme {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfme(Context context, zzcei zzceiVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzceiVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        t.r();
        map.put("device", j2.T());
        map.put("app", this.zzb);
        t.r();
        map.put("is_lite_sdk", true != j2.d(this.zza) ? "0" : "1");
        zzbfu zzbfuVar = zzbgc.zza;
        List zzb = a0.a().zzb();
        if (((Boolean) a0.c().zza(zzbgc.zzgU)).booleanValue()) {
            zzb.addAll(t.q().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) a0.c().zza(zzbgc.zzkL)).booleanValue()) {
            t.r();
            map.put("is_bstar", true == j2.a(this.zza) ? "1" : "0");
        }
        if (((Boolean) a0.c().zza(zzbgc.zzjn)).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzcc)).booleanValue()) {
                map.put("plugin", zzfxt.zzc(t.q().zzn()));
            }
        }
    }
}
