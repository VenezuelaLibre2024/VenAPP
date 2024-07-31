package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzchl implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgl zzcglVar = (zzcgl) obj;
        zzcki zzq = zzcglVar.zzq();
        if (zzq == null) {
            try {
                zzcki zzckiVar = new zzcki(zzcglVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcglVar.zzC(zzckiVar);
                zzq = zzckiVar;
            } catch (NullPointerException e10) {
                e = e10;
                zzcec.zzh("Unable to parse videoMeta message.", e);
                t.q().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                zzcec.zzh("Unable to parse videoMeta message.", e);
                t.q().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i10 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i10 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcec.zzm(3)) {
            zzcec.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i10 + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat2, parseFloat, i10, equals, parseFloat3);
    }
}
