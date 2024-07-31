package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbnx implements zzbng {
    private final zzbnw zza;

    public zzbnx(zzbnw zzbnwVar) {
        this.zza = zzbnwVar;
    }

    public static void zzb(zzcjk zzcjkVar, zzbnw zzbnwVar) {
        zzcjkVar.zzae("/reward", new zzbnx(zzbnwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzcag zzcagVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcagVar = new zzcag(str2, parseInt);
            }
        } catch (NumberFormatException e10) {
            zzcec.zzk("Unable to parse reward amount.", e10);
        }
        this.zza.zza(zzcagVar);
    }
}
