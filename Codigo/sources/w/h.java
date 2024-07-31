package w;

import android.graphics.Matrix;
import android.graphics.Rect;
import w.i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends i1.h {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f29474a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29475b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29476c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29477d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f29478e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29479f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f29474a = rect;
        this.f29475b = i10;
        this.f29476c = i11;
        this.f29477d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f29478e = matrix;
        this.f29479f = z11;
    }

    @Override // w.i1.h
    public Rect a() {
        return this.f29474a;
    }

    @Override // w.i1.h
    public boolean b() {
        return this.f29479f;
    }

    @Override // w.i1.h
    public int c() {
        return this.f29475b;
    }

    @Override // w.i1.h
    public Matrix d() {
        return this.f29478e;
    }

    @Override // w.i1.h
    public int e() {
        return this.f29476c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1.h)) {
            return false;
        }
        i1.h hVar = (i1.h) obj;
        return this.f29474a.equals(hVar.a()) && this.f29475b == hVar.c() && this.f29476c == hVar.e() && this.f29477d == hVar.f() && this.f29478e.equals(hVar.d()) && this.f29479f == hVar.b();
    }

    @Override // w.i1.h
    public boolean f() {
        return this.f29477d;
    }

    public int hashCode() {
        return ((((((((((this.f29474a.hashCode() ^ 1000003) * 1000003) ^ this.f29475b) * 1000003) ^ this.f29476c) * 1000003) ^ (this.f29477d ? 1231 : 1237)) * 1000003) ^ this.f29478e.hashCode()) * 1000003) ^ (this.f29479f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f29474a + ", getRotationDegrees=" + this.f29475b + ", getTargetRotation=" + this.f29476c + ", hasCameraTransform=" + this.f29477d + ", getSensorToBufferTransform=" + this.f29478e + ", getMirroring=" + this.f29479f + "}";
    }
}
