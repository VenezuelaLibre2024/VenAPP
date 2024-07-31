package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcrb implements zzcqv {
    private final zzdzd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrb(zzdzd zzdzdVar) {
        this.zza = zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        char c10;
        zzdzd zzdzdVar;
        zzdyz zzdyzVar;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("flick")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            zzdzdVar = this.zza;
            zzdyzVar = zzdyz.SHAKE;
        } else if (c10 != 1) {
            zzdzdVar = this.zza;
            zzdyzVar = zzdyz.NONE;
        } else {
            zzdzdVar = this.zza;
            zzdyzVar = zzdyz.FLICK;
        }
        zzdzdVar.zzl(zzdyzVar);
    }
}
