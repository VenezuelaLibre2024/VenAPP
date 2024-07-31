package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.C0620f2;
import java.nio.ByteBuffer;
import p407w.AbstractC12025m0;
import p407w.InterfaceC12011h0;

/* renamed from: androidx.camera.core.a */
/* loaded from: classes.dex */
final class C0588a implements InterfaceC0710o {

    /* renamed from: a */
    private final Image f2697a;

    /* renamed from: b */
    private final a[] f2698b;

    /* renamed from: c */
    private final InterfaceC12011h0 f2699c;

    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC0710o.a {

        /* renamed from: a */
        private final Image.Plane f2700a;

        a(Image.Plane plane) {
            this.f2700a = plane;
        }

        @Override // androidx.camera.core.InterfaceC0710o.a
        /* renamed from: c */
        public ByteBuffer mo2886c() {
            return this.f2700a.getBuffer();
        }

        @Override // androidx.camera.core.InterfaceC0710o.a
        /* renamed from: d */
        public int mo2887d() {
            return this.f2700a.getRowStride();
        }

        @Override // androidx.camera.core.InterfaceC0710o.a
        /* renamed from: e */
        public int mo2888e() {
            return this.f2700a.getPixelStride();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0588a(Image image) {
        this.f2697a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f2698b = new a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f2698b[i10] = new a(planes[i10]);
            }
        } else {
            this.f2698b = new a[0];
        }
        this.f2699c = AbstractC12025m0.m38636e(C0620f2.m3069b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: Z */
    public void mo2882Z(Rect rect) {
        this.f2697a.setCropRect(rect);
    }

    @Override // androidx.camera.core.InterfaceC0710o, java.lang.AutoCloseable
    public void close() {
        this.f2697a.close();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: e1 */
    public InterfaceC12011h0 mo2883e1() {
        return this.f2699c;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getFormat() {
        return this.f2697a.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getHeight() {
        return this.f2697a.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getWidth() {
        return this.f2697a.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: k1 */
    public Image mo2884k1() {
        return this.f2697a;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: u0 */
    public InterfaceC0710o.a[] mo2885u0() {
        return this.f2698b;
    }
}
