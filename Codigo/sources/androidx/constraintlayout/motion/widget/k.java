package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k implements Comparable<k> {
    static String[] D = {"position", "x", "y", "width", "height", "pathRotate"};
    int A;
    double[] B;
    double[] C;

    /* renamed from: a, reason: collision with root package name */
    l0.b f2992a;

    /* renamed from: c, reason: collision with root package name */
    float f2994c;

    /* renamed from: d, reason: collision with root package name */
    float f2995d;

    /* renamed from: e, reason: collision with root package name */
    float f2996e;

    /* renamed from: f, reason: collision with root package name */
    float f2997f;

    /* renamed from: r, reason: collision with root package name */
    float f2998r;

    /* renamed from: s, reason: collision with root package name */
    float f2999s;

    /* renamed from: v, reason: collision with root package name */
    int f3002v;

    /* renamed from: w, reason: collision with root package name */
    int f3003w;

    /* renamed from: x, reason: collision with root package name */
    float f3004x;

    /* renamed from: y, reason: collision with root package name */
    g f3005y;

    /* renamed from: z, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.b> f3006z;

    /* renamed from: b, reason: collision with root package name */
    int f2993b = 0;

    /* renamed from: t, reason: collision with root package name */
    float f3000t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    float f3001u = Float.NaN;

    public k() {
        int i10 = d.f2923a;
        this.f3002v = i10;
        this.f3003w = i10;
        this.f3004x = Float.NaN;
        this.f3005y = null;
        this.f3006z = new LinkedHashMap<>();
        this.A = 0;
        this.B = new double[18];
        this.C = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f2995d, kVar.f2995d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float f11 = this.f2996e;
        float f12 = this.f2997f;
        float f13 = this.f2998r;
        float f14 = this.f2999s;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f19;
                f15 = f20;
            } else if (i11 == 2) {
                f12 = f19;
                f17 = f20;
            } else if (i11 == 3) {
                f13 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f14 = f19;
                f18 = f20;
            }
        }
        float f21 = 2.0f;
        float f22 = (f16 / 2.0f) + f15;
        float f23 = (f18 / 2.0f) + f17;
        g gVar = this.f3005y;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d10, fArr3, fArr4);
            float f24 = fArr3[0];
            float f25 = fArr3[1];
            float f26 = fArr4[0];
            float f27 = fArr4[1];
            double d11 = f11;
            double d12 = f12;
            f10 = f13;
            float sin = (float) ((f24 + (Math.sin(d12) * d11)) - (f13 / 2.0f));
            float cos = (float) ((f25 - (d11 * Math.cos(d12))) - (f14 / 2.0f));
            double d13 = f15;
            double d14 = f17;
            float sin2 = (float) (f26 + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            f23 = (float) ((f27 - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f22 = sin2;
            f11 = sin;
            f12 = cos;
            f21 = 2.0f;
        } else {
            f10 = f13;
        }
        fArr[0] = f11 + (f10 / f21) + 0.0f;
        fArr[1] = f12 + (f14 / f21) + 0.0f;
        fArr2[0] = f22;
        fArr2[1] = f23;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void i(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        boolean z11;
        boolean z12;
        float f12;
        float f13 = this.f2996e;
        float f14 = this.f2997f;
        float f15 = this.f2998r;
        float f16 = this.f2999s;
        if (iArr.length != 0 && this.B.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.B = new double[i10];
            this.C = new double[i10];
        }
        Arrays.fill(this.B, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.B;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.C[i12] = dArr2[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr5 = this.B;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f12 = f17;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.B[i13])) {
                    d10 = this.B[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.C[i13];
                if (i13 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i13 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i13 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i13 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i13 == 5) {
                    f17 = f22;
                }
                i13++;
            }
            f17 = f12;
            i13++;
        }
        float f24 = f17;
        g gVar = this.f3005y;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = f13;
            double d12 = f14;
            float sin = (float) ((f25 + (Math.sin(d12) * d11)) - (f15 / 2.0f));
            f11 = f16;
            float cos = (float) ((f26 - (Math.cos(d12) * d11)) - (f16 / 2.0f));
            double d13 = f18;
            double d14 = f19;
            float sin2 = (float) (f27 + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float cos2 = (float) ((f28 - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            if (dArr2.length >= 2) {
                z11 = false;
                dArr2[0] = sin2;
                z12 = true;
                dArr2[1] = cos2;
            } else {
                z11 = false;
                z12 = true;
            }
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (f24 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f13 = sin;
            f14 = cos;
        } else {
            f11 = f16;
            z11 = false;
            z12 = true;
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (0.0f + f24 + Math.toDegrees(Math.atan2(f19 + (f21 / 2.0f), f18 + (f20 / 2.0f)))));
            }
        }
        if (view instanceof c) {
            ((c) view).a(f13, f14, f15 + f13, f14 + f11);
            return;
        }
        float f29 = f13 + 0.5f;
        int i14 = (int) f29;
        float f30 = f14 + 0.5f;
        int i15 = (int) f30;
        int i16 = (int) (f29 + f15);
        int i17 = (int) (f30 + f11);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight()) {
            z11 = z12;
        }
        if (z11 || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }
}
