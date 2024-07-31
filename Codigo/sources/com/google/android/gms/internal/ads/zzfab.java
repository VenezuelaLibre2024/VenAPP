package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.u1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfab implements zzexq {
    private final JSONObject zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfab(Context context) {
        this.zza = zzbzo.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzh(((Boolean) a0.c().zza(zzbgc.zzlo)).booleanValue() ? new zzexp() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
            }
        } : new zzexp() { // from class: com.google.android.gms.internal.ads.zzfaa
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                zzfab.this.zzc((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            u1.a("Failed putting version constants.");
        }
    }
}
