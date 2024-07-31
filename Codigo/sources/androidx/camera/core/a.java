package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.f2;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import w.h0;
import w.m0;

/* loaded from: classes.dex */
final class a implements o {

    /* renamed from: a */
    private final Image f2376a;

    /* renamed from: b */
    private final C0026a[] f2377b;

    /* renamed from: c */
    private final h0 f2378c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class C0026a implements o.a {

        /* renamed from: a */
        private final Image.Plane f2379a;

        C0026a(Image.Plane plane) {
            this.f2379a = plane;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer c() {
            return this.f2379a.getBuffer();
        }

        @Override // androidx.camera.core.o.a
        public int d() {
            return this.f2379a.getRowStride();
        }

        @Override // androidx.camera.core.o.a
        public int e() {
            return this.f2379a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f2376a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f2377b = new C0026a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f2377b[i10] = new C0026a(planes[i10]);
            }
        } else {
            this.f2377b = new C0026a[0];
        }
        this.f2378c = m0.e(f2.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.o
    public void Z(Rect rect) {
        this.f2376a.setCropRect(rect);
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        this.f2376a.close();
    }

    @Override // androidx.camera.core.o
    public h0 e1() {
        return this.f2378c;
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        return this.f2376a.getFormat();
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        return this.f2376a.getHeight();
    }

    @Override // androidx.camera.core.o
    public int getWidth() {
        return this.f2376a.getWidth();
    }

    @Override // androidx.camera.core.o
    public Image k1() {
        return this.f2376a;
    }

    @Override // androidx.camera.core.o
    public o.a[] u0() {
        return this.f2377b;
    }
}
