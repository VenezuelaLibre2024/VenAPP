package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2673a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Object, w> f2674b = new HashMap();

    public static w a(Object obj) {
        w wVar;
        synchronized (f2673a) {
            wVar = f2674b.get(obj);
        }
        return wVar == null ? w.f2661a : wVar;
    }
}
