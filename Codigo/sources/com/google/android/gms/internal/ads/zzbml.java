package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbml implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcjk zzcjkVar = (zzcjk) obj;
        zzbja zzK = zzcjkVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcjkVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcjkVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
