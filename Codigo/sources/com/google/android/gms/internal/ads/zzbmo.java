package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbmo implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str;
        zzcjk zzcjkVar = (zzcjk) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            zzfvm zzl = zzfvn.zzl();
            zzl.zzb((String) map.get("appId"));
            zzl.zzh(zzcjkVar.getWidth());
            zzl.zzg(zzcjkVar.zzF().getWindowToken());
            zzl.zzd((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            zzl.zze(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                zzl.zza((String) map.get("enifd"));
            }
            try {
                t.l().j(zzcjkVar, zzl.zzi());
                return;
            } catch (NullPointerException e10) {
                t.q().zzw(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        u1.a(str);
    }
}
