package p112g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.utils.C0679h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g0.c */
/* loaded from: classes.dex */
public final class C7391c<T> extends AbstractC7392c0<T> {

    /* renamed from: a */
    private final T f17137a;

    /* renamed from: b */
    private final C0679h f17138b;

    /* renamed from: c */
    private final int f17139c;

    /* renamed from: d */
    private final Size f17140d;

    /* renamed from: e */
    private final Rect f17141e;

    /* renamed from: f */
    private final int f17142f;

    /* renamed from: g */
    private final Matrix f17143g;

    /* renamed from: h */
    private final InterfaceC0663s f17144h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7391c(T t10, C0679h c0679h, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC0663s interfaceC0663s) {
        if (t10 == null) {
            throw new NullPointerException("Null data");
        }
        this.f17137a = t10;
        this.f17138b = c0679h;
        this.f17139c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f17140d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f17141e = rect;
        this.f17142f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f17143g = matrix;
        if (interfaceC0663s == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f17144h = interfaceC0663s;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: a */
    public InterfaceC0663s mo22304a() {
        return this.f17144h;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: b */
    public Rect mo22305b() {
        return this.f17141e;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: c */
    public T mo22306c() {
        return this.f17137a;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: d */
    public C0679h mo22307d() {
        return this.f17138b;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: e */
    public int mo22308e() {
        return this.f17139c;
    }

    public boolean equals(Object obj) {
        C0679h c0679h;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7392c0)) {
            return false;
        }
        AbstractC7392c0 abstractC7392c0 = (AbstractC7392c0) obj;
        return this.f17137a.equals(abstractC7392c0.mo22306c()) && ((c0679h = this.f17138b) != null ? c0679h.equals(abstractC7392c0.mo22307d()) : abstractC7392c0.mo22307d() == null) && this.f17139c == abstractC7392c0.mo22308e() && this.f17140d.equals(abstractC7392c0.mo22311h()) && this.f17141e.equals(abstractC7392c0.mo22305b()) && this.f17142f == abstractC7392c0.mo22309f() && this.f17143g.equals(abstractC7392c0.mo22310g()) && this.f17144h.equals(abstractC7392c0.mo22304a());
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: f */
    public int mo22309f() {
        return this.f17142f;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: g */
    public Matrix mo22310g() {
        return this.f17143g;
    }

    @Override // p112g0.AbstractC7392c0
    /* renamed from: h */
    public Size mo22311h() {
        return this.f17140d;
    }

    public int hashCode() {
        int hashCode = (this.f17137a.hashCode() ^ 1000003) * 1000003;
        C0679h c0679h = this.f17138b;
        return ((((((((((((hashCode ^ (c0679h == null ? 0 : c0679h.hashCode())) * 1000003) ^ this.f17139c) * 1000003) ^ this.f17140d.hashCode()) * 1000003) ^ this.f17141e.hashCode()) * 1000003) ^ this.f17142f) * 1000003) ^ this.f17143g.hashCode()) * 1000003) ^ this.f17144h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f17137a + ", exif=" + this.f17138b + ", format=" + this.f17139c + ", size=" + this.f17140d + ", cropRect=" + this.f17141e + ", rotationDegrees=" + this.f17142f + ", sensorToBufferTransform=" + this.f17143g + ", cameraCaptureResult=" + this.f17144h + "}";
    }
}
