package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfay implements zzexq {
    public static final /* synthetic */ zzfay zza = new zzfay();

    private /* synthetic */ zzfay() {
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzh(new zzexp() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", ca.k.f6983a);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
