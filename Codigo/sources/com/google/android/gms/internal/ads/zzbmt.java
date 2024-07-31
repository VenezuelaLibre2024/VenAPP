package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbmt implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfwk.zzc("true", str) && !zzfwk.zzc("false", str)) {
                return;
            }
            zzfuf.zzi(zzcjkVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            t.q().zzw(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
