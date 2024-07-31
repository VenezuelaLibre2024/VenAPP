package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.util.a1 */
/* loaded from: classes.dex */
public final class C4968a1 {

    /* renamed from: a */
    final Map f10040a = new ConcurrentHashMap();

    /* renamed from: b */
    private final AtomicInteger f10041b = new AtomicInteger(0);

    /* renamed from: a */
    public final Bitmap m12592a(Integer num) {
        return (Bitmap) this.f10040a.get(num);
    }
}
