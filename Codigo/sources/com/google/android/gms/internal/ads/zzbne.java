package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbne implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        if (map.keySet().contains("start")) {
            zzcjkVar.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzcjkVar.zzau(false);
        }
    }
}
