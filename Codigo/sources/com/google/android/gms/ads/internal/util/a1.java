package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    final Map f8941a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f8942b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f8941a.get(num);
    }
}
