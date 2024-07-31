package p398v8;

import android.opengl.Matrix;
import p363t8.C11162m0;
import p363t8.C11163n;

/* renamed from: v8.c */
/* loaded from: classes.dex */
final class C11745c {

    /* renamed from: a */
    private final float[] f31005a = new float[16];

    /* renamed from: b */
    private final float[] f31006b = new float[16];

    /* renamed from: c */
    private final C11162m0<float[]> f31007c = new C11162m0<>();

    /* renamed from: d */
    private boolean f31008d;

    /* renamed from: a */
    public static void m37118a(float[] fArr, float[] fArr2) {
        C11163n.m34820j(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    /* renamed from: b */
    private static void m37119b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            C11163n.m34820j(fArr);
        }
    }

    /* renamed from: c */
    public boolean m37120c(float[] fArr, long j10) {
        float[] m34809j = this.f31007c.m34809j(j10);
        if (m34809j == null) {
            return false;
        }
        m37119b(this.f31006b, m34809j);
        if (!this.f31008d) {
            m37118a(this.f31005a, this.f31006b);
            this.f31008d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f31005a, 0, this.f31006b, 0);
        return true;
    }

    /* renamed from: d */
    public void m37121d() {
        this.f31007c.m34806c();
        this.f31008d = false;
    }

    /* renamed from: e */
    public void m37122e(long j10, float[] fArr) {
        this.f31007c.m34805a(j10, fArr);
    }
}
