package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.y0 */
/* loaded from: classes.dex */
public final class C0700y0 {

    /* renamed from: a */
    private static final Object f3018a = new Object();

    /* renamed from: b */
    private static final Map<Object, InterfaceC0693w> f3019b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0693w m3378a(Object obj) {
        InterfaceC0693w interfaceC0693w;
        synchronized (f3018a) {
            interfaceC0693w = f3019b.get(obj);
        }
        return interfaceC0693w == null ? InterfaceC0693w.f3005a : interfaceC0693w;
    }
}
