package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzckp;
import com.google.android.gms.internal.ads.zzehs;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.k2 */
/* loaded from: classes.dex */
public class C5009k2 extends C4974c {
    public C5009k2() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: a */
    public final CookieManager mo12605a(Context context) {
        C4965t.m12581r();
        if (C5005j2.m12666e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            zzcec.zzh("Failed to obtain CookieManager.", th2);
            C4965t.m12580q().zzv(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: b */
    public final WebResourceResponse mo12606b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: c */
    public final zzcjs mo12607c(zzcjk zzcjkVar, zzbbp zzbbpVar, boolean z10, zzehs zzehsVar) {
        return new zzckp(zzcjkVar, zzbbpVar, z10, zzehsVar);
    }
}
