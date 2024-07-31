package w;

import android.graphics.Matrix;
import androidx.camera.core.impl.f2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends m0 {

    /* renamed from: a */
    private final f2 f29447a;

    /* renamed from: b */
    private final long f29448b;

    /* renamed from: c */
    private final int f29449c;

    /* renamed from: d */
    private final Matrix f29450d;

    public d(f2 f2Var, long j10, int i10, Matrix matrix) {
        if (f2Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f29447a = f2Var;
        this.f29448b = j10;
        this.f29449c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f29450d = matrix;
    }

    @Override // w.m0, w.h0
    public f2 b() {
        return this.f29447a;
    }

    @Override // w.m0, w.h0
    public long c() {
        return this.f29448b;
    }

    @Override // w.m0, w.h0
    public int d() {
        return this.f29449c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f29447a.equals(m0Var.b()) && this.f29448b == m0Var.c() && this.f29449c == m0Var.d() && this.f29450d.equals(m0Var.f());
    }

    @Override // w.m0
    public Matrix f() {
        return this.f29450d;
    }

    public int hashCode() {
        int hashCode = (this.f29447a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f29448b;
        return ((((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f29449c) * 1000003) ^ this.f29450d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f29447a + ", timestamp=" + this.f29448b + ", rotationDegrees=" + this.f29449c + ", sensorToBufferTransformMatrix=" + this.f29450d + "}";
    }
}
