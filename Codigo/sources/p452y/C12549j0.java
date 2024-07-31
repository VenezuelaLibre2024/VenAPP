package p452y;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.utils.C0681j;
import androidx.core.util.C0984h;
import java.nio.ByteBuffer;
import java.util.Objects;
import p092f0.C7262b;
import p112g0.AbstractC7392c0;
import p407w.InterfaceC12011h0;

/* renamed from: y.j0 */
/* loaded from: classes.dex */
public final class C12549j0 implements InterfaceC0710o {

    /* renamed from: a */
    private final Object f34034a;

    /* renamed from: b */
    private final int f34035b;

    /* renamed from: c */
    private final int f34036c;

    /* renamed from: d */
    private final Rect f34037d;

    /* renamed from: e */
    InterfaceC0710o.a[] f34038e;

    /* renamed from: f */
    private final InterfaceC12011h0 f34039f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.j0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0710o.a {

        /* renamed from: a */
        final /* synthetic */ int f34040a;

        /* renamed from: b */
        final /* synthetic */ int f34041b;

        /* renamed from: c */
        final /* synthetic */ ByteBuffer f34042c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f34040a = i10;
            this.f34041b = i11;
            this.f34042c = byteBuffer;
        }

        @Override // androidx.camera.core.InterfaceC0710o.a
        /* renamed from: c */
        public ByteBuffer mo2886c() {
            return this.f34042c;
        }

        @Override // androidx.camera.core.InterfaceC0710o.a
        /* renamed from: d */
        public int mo2887d() {
            return this.f34040a;
        }

        @Override // androidx.camera.core.InterfaceC0710o.a
        /* renamed from: e */
        public int mo2888e() {
            return this.f34041b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.j0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC12011h0 {

        /* renamed from: a */
        final /* synthetic */ long f34043a;

        /* renamed from: b */
        final /* synthetic */ int f34044b;

        /* renamed from: c */
        final /* synthetic */ Matrix f34045c;

        b(long j10, int i10, Matrix matrix) {
            this.f34043a = j10;
            this.f34044b = i10;
            this.f34045c = matrix;
        }

        @Override // p407w.InterfaceC12011h0
        /* renamed from: a */
        public void mo8851a(C0681j.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // p407w.InterfaceC12011h0
        /* renamed from: b */
        public C0620f2 mo8852b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // p407w.InterfaceC12011h0
        /* renamed from: c */
        public long mo8853c() {
            return this.f34043a;
        }

        @Override // p407w.InterfaceC12011h0
        /* renamed from: d */
        public int mo8854d() {
            return this.f34044b;
        }
    }

    public C12549j0(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(C7262b.m21731b(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public C12549j0(AbstractC7392c0<Bitmap> abstractC7392c0) {
        this(abstractC7392c0.mo22306c(), abstractC7392c0.mo22305b(), abstractC7392c0.mo22309f(), abstractC7392c0.mo22310g(), abstractC7392c0.mo22304a().mo2380c());
    }

    public C12549j0(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f34034a = new Object();
        this.f34035b = i11;
        this.f34036c = i12;
        this.f34037d = rect;
        this.f34039f = m41215b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f34038e = new InterfaceC0710o.a[]{m41216e(byteBuffer, i11 * i10, i10)};
    }

    /* renamed from: a */
    private void m41214a() {
        synchronized (this.f34034a) {
            C0984h.m4836n(this.f34038e != null, "The image is closed.");
        }
    }

    /* renamed from: b */
    private static InterfaceC12011h0 m41215b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    /* renamed from: e */
    private static InterfaceC0710o.a m41216e(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: Z */
    public void mo2882Z(Rect rect) {
        synchronized (this.f34034a) {
            m41214a();
            if (rect != null) {
                this.f34037d.set(rect);
            }
        }
    }

    @Override // androidx.camera.core.InterfaceC0710o, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f34034a) {
            m41214a();
            this.f34038e = null;
        }
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: e1 */
    public InterfaceC12011h0 mo2883e1() {
        InterfaceC12011h0 interfaceC12011h0;
        synchronized (this.f34034a) {
            m41214a();
            interfaceC12011h0 = this.f34039f;
        }
        return interfaceC12011h0;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getFormat() {
        synchronized (this.f34034a) {
            m41214a();
        }
        return 1;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getHeight() {
        int i10;
        synchronized (this.f34034a) {
            m41214a();
            i10 = this.f34036c;
        }
        return i10;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    public int getWidth() {
        int i10;
        synchronized (this.f34034a) {
            m41214a();
            i10 = this.f34035b;
        }
        return i10;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: k1 */
    public Image mo2884k1() {
        synchronized (this.f34034a) {
            m41214a();
        }
        return null;
    }

    @Override // androidx.camera.core.InterfaceC0710o
    /* renamed from: u0 */
    public InterfaceC0710o.a[] mo2885u0() {
        InterfaceC0710o.a[] aVarArr;
        synchronized (this.f34034a) {
            m41214a();
            InterfaceC0710o.a[] aVarArr2 = this.f34038e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }
}
