package androidx.camera.core.impl;

import androidx.camera.core.impl.n0;

/* loaded from: classes.dex */
public interface e1 extends u1 {

    /* renamed from: f, reason: collision with root package name */
    public static final n0.a<Integer> f2456f = n0.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: g, reason: collision with root package name */
    public static final n0.a<w.y> f2457g = n0.a.a("camerax.core.imageInput.inputDynamicRange", w.y.class);

    default w.y G() {
        return (w.y) androidx.core.util.h.k((w.y) g(f2457g, w.y.f29576c));
    }

    default int n() {
        return ((Integer) a(f2456f)).intValue();
    }
}
