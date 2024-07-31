package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class zzbgi {
    private final String zza = (String) zzbhu.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbgi(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        t.r();
        linkedHashMap.put("device", j2.T());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        t.r();
        linkedHashMap.put("is_lite_sdk", true != j2.d(context) ? "0" : "1");
        Future zzb = t.o().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzj) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzj) zzb.get()).zzl));
        } catch (Exception e10) {
            t.q().zzw(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) a0.c().zza(zzbgc.zzkL)).booleanValue()) {
            Map map = this.zzb;
            t.r();
            map.put("is_bstar", true == j2.a(context) ? "1" : "0");
        }
        if (((Boolean) a0.c().zza(zzbgc.zzjn)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zzcc)).booleanValue() || zzfxt.zzd(t.q().zzn())) {
                return;
            }
            this.zzb.put("plugin", t.q().zzn());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
