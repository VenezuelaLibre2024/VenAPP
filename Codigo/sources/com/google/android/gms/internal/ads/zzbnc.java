package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbnc implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcjkVar.zzbp();
        } else if ("resume".equals(str)) {
            zzcjkVar.zzbq();
        }
    }
}
