package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbmm implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcjk zzcjkVar = (zzcjk) obj;
        zzbja zzK = zzcjkVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcjkVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcjkVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
