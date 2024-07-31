package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzckp;
import com.google.android.gms.internal.ads.zzehs;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class k2 extends c {
    public k2() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.c
    public final CookieManager a(Context context) {
        com.google.android.gms.ads.internal.t.r();
        if (j2.e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            zzcec.zzh("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.t.q().zzv(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.c
    public final WebResourceResponse b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.c
    public final zzcjs c(zzcjk zzcjkVar, zzbbp zzbbpVar, boolean z10, zzehs zzehsVar) {
        return new zzckp(zzcjkVar, zzbbpVar, z10, zzehsVar);
    }
}
