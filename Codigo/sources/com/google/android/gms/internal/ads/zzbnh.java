package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbnh implements zzbng {
    private final zzbni zza;

    public zzbnh(zzbni zzbniVar) {
        this.zza = zzbniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzcec.zzh("Fail to parse float", e10);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcjkVar.zzav(equals);
    }
}
