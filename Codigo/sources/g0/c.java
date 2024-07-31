package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c<T> extends c0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f15559a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.utils.h f15560b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15561c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f15562d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f15563e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15564f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f15565g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.camera.core.impl.s f15566h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(T t10, androidx.camera.core.impl.utils.h hVar, int i10, Size size, Rect rect, int i11, Matrix matrix, androidx.camera.core.impl.s sVar) {
        if (t10 == null) {
            throw new NullPointerException("Null data");
        }
        this.f15559a = t10;
        this.f15560b = hVar;
        this.f15561c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f15562d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f15563e = rect;
        this.f15564f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f15565g = matrix;
        if (sVar == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f15566h = sVar;
    }

    @Override // g0.c0
    public androidx.camera.core.impl.s a() {
        return this.f15566h;
    }

    @Override // g0.c0
    public Rect b() {
        return this.f15563e;
    }

    @Override // g0.c0
    public T c() {
        return this.f15559a;
    }

    @Override // g0.c0
    public androidx.camera.core.impl.utils.h d() {
        return this.f15560b;
    }

    @Override // g0.c0
    public int e() {
        return this.f15561c;
    }

    public boolean equals(Object obj) {
        androidx.camera.core.impl.utils.h hVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f15559a.equals(c0Var.c()) && ((hVar = this.f15560b) != null ? hVar.equals(c0Var.d()) : c0Var.d() == null) && this.f15561c == c0Var.e() && this.f15562d.equals(c0Var.h()) && this.f15563e.equals(c0Var.b()) && this.f15564f == c0Var.f() && this.f15565g.equals(c0Var.g()) && this.f15566h.equals(c0Var.a());
    }

    @Override // g0.c0
    public int f() {
        return this.f15564f;
    }

    @Override // g0.c0
    public Matrix g() {
        return this.f15565g;
    }

    @Override // g0.c0
    public Size h() {
        return this.f15562d;
    }

    public int hashCode() {
        int hashCode = (this.f15559a.hashCode() ^ 1000003) * 1000003;
        androidx.camera.core.impl.utils.h hVar = this.f15560b;
        return ((((((((((((hashCode ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003) ^ this.f15561c) * 1000003) ^ this.f15562d.hashCode()) * 1000003) ^ this.f15563e.hashCode()) * 1000003) ^ this.f15564f) * 1000003) ^ this.f15565g.hashCode()) * 1000003) ^ this.f15566h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f15559a + ", exif=" + this.f15560b + ", format=" + this.f15561c + ", size=" + this.f15562d + ", cropRect=" + this.f15563e + ", rotationDegrees=" + this.f15564f + ", sensorToBufferTransform=" + this.f15565g + ", cameraCaptureResult=" + this.f15566h + "}";
    }
}
