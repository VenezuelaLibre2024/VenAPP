package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblz implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(Constants.TIMESTAMP);
            if (TextUtils.isEmpty(str2)) {
                zzcec.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzcec.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long b10 = t.b().b() + (Long.parseLong(str4) - t.b().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcjkVar.zzm().zzc(str2, str3, b10);
                return;
            } catch (NumberFormatException e10) {
                zzcec.zzk("Malformed timestamp for CSI tick.", e10);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcec.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcjkVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcec.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcec.zzj("No name given for CSI extra.");
            } else {
                zzcjkVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
