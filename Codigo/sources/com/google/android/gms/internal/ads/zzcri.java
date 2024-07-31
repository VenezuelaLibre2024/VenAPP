package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcri implements zzcqv {
    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        if (!((Boolean) a0.c().zza(zzbgc.zzjU)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t.q().zzi().k(Boolean.parseBoolean(str));
    }
}
