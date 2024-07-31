package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbnl implements zzbng {
    private final Context zza;

    public zzbnl(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        char c10;
        if (t.p().zzp(this.zza)) {
            String str = (String) map.get(Constants.EVENT_NAME);
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                t.p().zzj(this.zza, str2);
            } else if (c10 == 1) {
                t.p().zzk(this.zza, str2);
            } else if (c10 != 2) {
                zzcec.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                t.p().zzh(this.zza, str2);
            }
        }
    }
}
