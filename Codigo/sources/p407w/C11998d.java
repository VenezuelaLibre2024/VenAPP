package p407w;

import android.graphics.Matrix;
import androidx.camera.core.impl.C0620f2;

/* renamed from: w.d */
/* loaded from: classes.dex */
final class C11998d extends AbstractC12025m0 {

    /* renamed from: a */
    private final C0620f2 f31902a;

    /* renamed from: b */
    private final long f31903b;

    /* renamed from: c */
    private final int f31904c;

    /* renamed from: d */
    private final Matrix f31905d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11998d(C0620f2 c0620f2, long j10, int i10, Matrix matrix) {
        if (c0620f2 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f31902a = c0620f2;
        this.f31903b = j10;
        this.f31904c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f31905d = matrix;
    }

    @Override // p407w.AbstractC12025m0, p407w.InterfaceC12011h0
    /* renamed from: b */
    public C0620f2 mo8852b() {
        return this.f31902a;
    }

    @Override // p407w.AbstractC12025m0, p407w.InterfaceC12011h0
    /* renamed from: c */
    public long mo8853c() {
        return this.f31903b;
    }

    @Override // p407w.AbstractC12025m0, p407w.InterfaceC12011h0
    /* renamed from: d */
    public int mo8854d() {
        return this.f31904c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12025m0)) {
            return false;
        }
        AbstractC12025m0 abstractC12025m0 = (AbstractC12025m0) obj;
        return this.f31902a.equals(abstractC12025m0.mo8852b()) && this.f31903b == abstractC12025m0.mo8853c() && this.f31904c == abstractC12025m0.mo8854d() && this.f31905d.equals(abstractC12025m0.mo38574f());
    }

    @Override // p407w.AbstractC12025m0
    /* renamed from: f */
    public Matrix mo38574f() {
        return this.f31905d;
    }

    public int hashCode() {
        int hashCode = (this.f31902a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f31903b;
        return ((((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f31904c) * 1000003) ^ this.f31905d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f31902a + ", timestamp=" + this.f31903b + ", rotationDegrees=" + this.f31904c + ", sensorToBufferTransformMatrix=" + this.f31905d + "}";
    }
}
