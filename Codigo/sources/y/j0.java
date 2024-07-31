package y;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.utils.j;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j0 implements androidx.camera.core.o {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31514a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31515b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31516c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f31517d;

    /* renamed from: e, reason: collision with root package name */
    o.a[] f31518e;

    /* renamed from: f, reason: collision with root package name */
    private final w.h0 f31519f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f31522c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f31520a = i10;
            this.f31521b = i11;
            this.f31522c = byteBuffer;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer c() {
            return this.f31522c;
        }

        @Override // androidx.camera.core.o.a
        public int d() {
            return this.f31520a;
        }

        @Override // androidx.camera.core.o.a
        public int e() {
            return this.f31521b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements w.h0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f31523a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f31525c;

        b(long j10, int i10, Matrix matrix) {
            this.f31523a = j10;
            this.f31524b = i10;
            this.f31525c = matrix;
        }

        @Override // w.h0
        public void a(j.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // w.h0
        public f2 b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // w.h0
        public long c() {
            return this.f31523a;
        }

        @Override // w.h0
        public int d() {
            return this.f31524b;
        }
    }

    public j0(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(f0.b.b(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public j0(g0.c0<Bitmap> c0Var) {
        this(c0Var.c(), c0Var.b(), c0Var.f(), c0Var.g(), c0Var.a().c());
    }

    public j0(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f31514a = new Object();
        this.f31515b = i11;
        this.f31516c = i12;
        this.f31517d = rect;
        this.f31519f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f31518e = new o.a[]{e(byteBuffer, i11 * i10, i10)};
    }

    private void a() {
        synchronized (this.f31514a) {
            androidx.core.util.h.n(this.f31518e != null, "The image is closed.");
        }
    }

    private static w.h0 b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    private static o.a e(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.o
    public void Z(Rect rect) {
        synchronized (this.f31514a) {
            a();
            if (rect != null) {
                this.f31517d.set(rect);
            }
        }
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f31514a) {
            a();
            this.f31518e = null;
        }
    }

    @Override // androidx.camera.core.o
    public w.h0 e1() {
        w.h0 h0Var;
        synchronized (this.f31514a) {
            a();
            h0Var = this.f31519f;
        }
        return h0Var;
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        synchronized (this.f31514a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        int i10;
        synchronized (this.f31514a) {
            a();
            i10 = this.f31516c;
        }
        return i10;
    }

    @Override // androidx.camera.core.o
    public int getWidth() {
        int i10;
        synchronized (this.f31514a) {
            a();
            i10 = this.f31515b;
        }
        return i10;
    }

    @Override // androidx.camera.core.o
    public Image k1() {
        synchronized (this.f31514a) {
            a();
        }
        return null;
    }

    @Override // androidx.camera.core.o
    public o.a[] u0() {
        o.a[] aVarArr;
        synchronized (this.f31514a) {
            a();
            o.a[] aVarArr2 = this.f31518e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }
}
