package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzedb {
    private final zzgey zza;
    private final zzgey zzb;
    private final zzedt zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedb(zzgey zzgeyVar, zzgey zzgeyVar2, zzedt zzedtVar) {
        this.zza = zzgeyVar;
        this.zzb = zzgeyVar2;
        this.zzc = zzedtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zza(zzbyi zzbyiVar) {
        return this.zzc.zza(zzbyiVar, ((Long) a0.c().zza(zzbgc.zzkW)).longValue());
    }

    public final com.google.common.util.concurrent.f zzb(final zzbyi zzbyiVar) {
        com.google.common.util.concurrent.f zzf;
        String str = zzbyiVar.zzb;
        t.r();
        if (j2.b(str)) {
            zzf = zzgen.zzg(new zzecf(1, "Ads signal service force local"));
        } else {
            zzf = zzgen.zzf(zzgen.zzk(new zzgdt() { // from class: com.google.android.gms.internal.ads.zzecx
                @Override // com.google.android.gms.internal.ads.zzgdt
                public final com.google.common.util.concurrent.f zza() {
                    return zzedb.this.zza(zzbyiVar);
                }
            }, this.zza), ExecutionException.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzecy
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgen.zzg(th2);
                }
            }, this.zzb);
        }
        return zzgen.zzn(zzgen.zzf(zzgee.zzu(zzf), zzecf.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzh(null);
            }
        }, this.zzb), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        t.r();
                        jSONObject = new JSONObject(j2.m(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e10) {
                        t.q().zzw(e10, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return zzgen.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
