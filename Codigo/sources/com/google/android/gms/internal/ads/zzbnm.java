package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbnm implements zzbng {
    static final Map zza = la.g.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.b zzb;
    private final zzbvq zzc;
    private final zzbvx zzd;

    public zzbnm(com.google.android.gms.ads.internal.b bVar, zzbvq zzbvqVar, zzbvx zzbvxVar) {
        this.zzb = bVar;
        this.zzc = zzbvqVar;
        this.zzd = zzbvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.b bVar = this.zzb;
                if (!bVar.c()) {
                    bVar.b(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbvt(zzcjkVar, map).zzb();
                    return;
                }
                if (intValue == 4) {
                    new zzbvn(zzcjkVar, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zzcec.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcjkVar == null) {
            zzcec.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = parseBoolean ? -1 : 14;
        }
        zzcjkVar.zzar(i10);
    }
}
