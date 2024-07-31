package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbns implements zzbng {
    private final zzdzx zza;

    public zzbns(zzdzx zzdzxVar) {
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.zza.zzh(str2, str4, str3);
            } else if (str.equals("show")) {
                this.zza.zzi(str2, str3);
            }
        }
    }
}
