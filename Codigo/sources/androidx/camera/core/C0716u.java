package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import p407w.InterfaceC12011h0;

/* renamed from: androidx.camera.core.u */
/* loaded from: classes.dex */
public final class C0716u extends AbstractC0592e {

    /* renamed from: d */
    private final Object f3102d;

    /* renamed from: e */
    private final InterfaceC12011h0 f3103e;

    /* renamed from: f */
    private Rect f3104f;

    /* renamed from: r */
    private final int f3105r;

    /* renamed from: s */
    private final int f3106s;

    public C0716u(InterfaceC0710o interfaceC0710o, Size size, InterfaceC12011h0 interfaceC12011h0) {
        super(interfaceC0710o);
        int height;
        this.f3102d = new Object();
        if (size == null) {
            this.f3105r = super.getWidth();
            height = super.getHeight();
        } else {
            this.f3105r = size.getWidth();
            height = size.getHeight();
        }
        this.f3106s = height;
        this.f3103e = interfaceC12011h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0716u(InterfaceC0710o interfaceC0710o, InterfaceC12011h0 interfaceC12011h0) {
        this(interfaceC0710o, null, interfaceC12011h0);
    }

    @Override // androidx.camera.core.AbstractC0592e, androidx.camera.core.InterfaceC0710o
    /* renamed from: Z */
    public void mo2882Z(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f3102d) {
            this.f3104f = rect;
        }
    }

    @Override // androidx.camera.core.AbstractC0592e, androidx.camera.core.InterfaceC0710o
    /* renamed from: e1 */
    public InterfaceC12011h0 mo2883e1() {
        return this.f3103e;
    }

    @Override // androidx.camera.core.AbstractC0592e, androidx.camera.core.InterfaceC0710o
    public int getHeight() {
        return this.f3106s;
    }

    @Override // androidx.camera.core.AbstractC0592e, androidx.camera.core.InterfaceC0710o
    public int getWidth() {
        return this.f3105r;
    }
}
