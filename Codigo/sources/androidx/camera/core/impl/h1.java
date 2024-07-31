package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class h1 extends r0 {

    /* renamed from: o, reason: collision with root package name */
    private final Surface f2503o;

    public h1(Surface surface) {
        this.f2503o = surface;
    }

    public h1(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f2503o = surface;
    }

    @Override // androidx.camera.core.impl.r0
    public com.google.common.util.concurrent.f<Surface> r() {
        return a0.f.h(this.f2503o);
    }
}
