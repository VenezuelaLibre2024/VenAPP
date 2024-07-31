package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbny implements zzbng {
    private final Context zza;

    public zzbny(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        u1.a("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            t.r();
            j2.s(this.zza, intent);
        } catch (RuntimeException e10) {
            zzcec.zzk("Failed to open Share Sheet", e10);
            t.q().zzw(e10, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
