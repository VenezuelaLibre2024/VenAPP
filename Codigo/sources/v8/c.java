package v8;

import android.opengl.Matrix;
import t8.m0;
import t8.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final float[] f28571a = new float[16];

    /* renamed from: b */
    private final float[] f28572b = new float[16];

    /* renamed from: c */
    private final m0<float[]> f28573c = new m0<>();

    /* renamed from: d */
    private boolean f28574d;

    public static void a(float[] fArr, float[] fArr2) {
        n.j(fArr);
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

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            n.j(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] j11 = this.f28573c.j(j10);
        if (j11 == null) {
            return false;
        }
        b(this.f28572b, j11);
        if (!this.f28574d) {
            a(this.f28571a, this.f28572b);
            this.f28574d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f28571a, 0, this.f28572b, 0);
        return true;
    }

    public void d() {
        this.f28573c.c();
        this.f28574d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f28573c.a(j10, fArr);
    }
}
