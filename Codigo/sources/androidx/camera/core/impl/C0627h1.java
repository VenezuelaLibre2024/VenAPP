package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import p002a0.C0009f;

/* renamed from: androidx.camera.core.impl.h1 */
/* loaded from: classes.dex */
public final class C0627h1 extends AbstractC0661r0 {

    /* renamed from: o */
    private final Surface f2841o;

    public C0627h1(Surface surface) {
        this.f2841o = surface;
    }

    public C0627h1(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f2841o = surface;
    }

    @Override // androidx.camera.core.impl.AbstractC0661r0
    /* renamed from: r */
    public InterfaceFutureC5920f<Surface> mo2981r() {
        return C0009f.m22h(this.f2841o);
    }
}
