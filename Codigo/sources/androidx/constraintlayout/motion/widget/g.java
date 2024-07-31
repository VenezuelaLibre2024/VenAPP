package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p0.b;
import p0.c;
import p0.d;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    boolean f2926a;

    /* renamed from: b */
    private k f2927b;

    /* renamed from: c */
    private k f2928c;

    /* renamed from: d */
    private f f2929d;

    /* renamed from: e */
    private f f2930e;

    /* renamed from: f */
    private l0.a[] f2931f;

    /* renamed from: g */
    private l0.a f2932g;

    /* renamed from: h */
    float f2933h;

    /* renamed from: i */
    float f2934i;

    /* renamed from: j */
    private int[] f2935j;

    /* renamed from: k */
    private double[] f2936k;

    /* renamed from: l */
    private double[] f2937l;

    /* renamed from: m */
    private String[] f2938m;

    /* renamed from: n */
    private float[] f2939n;

    /* renamed from: o */
    private ArrayList<k> f2940o;

    /* renamed from: p */
    private HashMap<String, p0.d> f2941p;

    /* renamed from: q */
    private HashMap<String, p0.c> f2942q;

    /* renamed from: r */
    private HashMap<String, p0.b> f2943r;

    /* renamed from: s */
    private e[] f2944s;

    /* renamed from: t */
    private int f2945t;

    /* renamed from: u */
    private View f2946u;

    /* renamed from: v */
    private int f2947v;

    /* renamed from: w */
    private float f2948w;

    /* renamed from: x */
    private Interpolator f2949x;

    /* renamed from: y */
    private boolean f2950y;

    private float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f2934i;
            if (f12 != 1.0d) {
                float f13 = this.f2933h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        l0.b bVar = this.f2927b.f2992a;
        Iterator<k> it = this.f2940o.iterator();
        float f14 = Float.NaN;
        while (it.hasNext()) {
            k next = it.next();
            l0.b bVar2 = next.f2992a;
            if (bVar2 != null) {
                float f15 = next.f2994c;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = next.f2994c;
                }
            }
        }
        if (bVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) bVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f2931f[0].b(d10, dArr);
        this.f2931f[0].d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f2927b.h(d10, this.f2935j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f10, long j10, l0.c cVar) {
        d.a aVar;
        boolean z10;
        int i10;
        double d10;
        float a10 = a(f10, null);
        int i11 = this.f2947v;
        if (i11 != d.f2923a) {
            float f11 = 1.0f / i11;
            float floor = ((float) Math.floor(a10 / f11)) * f11;
            float f12 = (a10 % f11) / f11;
            if (!Float.isNaN(this.f2948w)) {
                f12 = (f12 + this.f2948w) % 1.0f;
            }
            Interpolator interpolator = this.f2949x;
            a10 = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + floor;
        }
        float f13 = a10;
        HashMap<String, p0.c> hashMap = this.f2942q;
        if (hashMap != null) {
            Iterator<p0.c> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().b(view, f13);
            }
        }
        HashMap<String, p0.d> hashMap2 = this.f2941p;
        if (hashMap2 != null) {
            d.a aVar2 = null;
            boolean z11 = false;
            for (p0.d dVar : hashMap2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    z11 |= dVar.b(view, f13, j10, cVar);
                }
            }
            z10 = z11;
            aVar = aVar2;
        } else {
            aVar = null;
            z10 = false;
        }
        l0.a[] aVarArr = this.f2931f;
        if (aVarArr != null) {
            double d11 = f13;
            aVarArr[0].b(d11, this.f2936k);
            this.f2931f[0].d(d11, this.f2937l);
            l0.a aVar3 = this.f2932g;
            if (aVar3 != null) {
                double[] dArr = this.f2936k;
                if (dArr.length > 0) {
                    aVar3.b(d11, dArr);
                    this.f2932g.d(d11, this.f2937l);
                }
            }
            if (this.f2950y) {
                d10 = d11;
            } else {
                d10 = d11;
                this.f2927b.i(f13, view, this.f2935j, this.f2936k, this.f2937l, null, this.f2926a);
                this.f2926a = false;
            }
            if (this.f2945t != d.f2923a) {
                if (this.f2946u == null) {
                    this.f2946u = ((View) view.getParent()).findViewById(this.f2945t);
                }
                if (this.f2946u != null) {
                    float top = (r1.getTop() + this.f2946u.getBottom()) / 2.0f;
                    float left = (this.f2946u.getLeft() + this.f2946u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, p0.c> hashMap3 = this.f2942q;
            if (hashMap3 != null) {
                for (p0.c cVar2 : hashMap3.values()) {
                    if (cVar2 instanceof c.a) {
                        double[] dArr2 = this.f2937l;
                        if (dArr2.length > 1) {
                            ((c.a) cVar2).c(view, f13, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f2937l;
                i10 = 1;
                z10 |= aVar.c(view, cVar, f13, j10, dArr3[0], dArr3[1]);
            } else {
                i10 = 1;
            }
            int i12 = i10;
            while (true) {
                l0.a[] aVarArr2 = this.f2931f;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i12].c(d10, this.f2939n);
                p0.a.b(this.f2927b.f3006z.get(this.f2938m[i12 - 1]), view, this.f2939n);
                i12++;
            }
            f fVar = this.f2929d;
            if (fVar.f2924a == 0) {
                if (f13 > 0.0f) {
                    if (f13 >= 1.0f) {
                        fVar = this.f2930e;
                    } else if (this.f2930e.f2925b != fVar.f2925b) {
                        view.setVisibility(0);
                    }
                }
                view.setVisibility(fVar.f2925b);
            }
            if (this.f2944s != null) {
                int i13 = 0;
                while (true) {
                    e[] eVarArr = this.f2944s;
                    if (i13 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i13].a(f13, view);
                    i13++;
                }
            }
        } else {
            i10 = 1;
            k kVar = this.f2927b;
            float f14 = kVar.f2996e;
            k kVar2 = this.f2928c;
            float f15 = f14 + ((kVar2.f2996e - f14) * f13);
            float f16 = kVar.f2997f;
            float f17 = f16 + ((kVar2.f2997f - f16) * f13);
            float f18 = kVar.f2998r;
            float f19 = kVar2.f2998r;
            float f20 = kVar.f2999s;
            float f21 = kVar2.f2999s;
            float f22 = f15 + 0.5f;
            int i14 = (int) f22;
            float f23 = f17 + 0.5f;
            int i15 = (int) f23;
            int i16 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i17 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f19 != f18 || f21 != f20 || this.f2926a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f2926a = false;
            }
            view.layout(i14, i15, i16, i17);
        }
        HashMap<String, p0.b> hashMap4 = this.f2943r;
        if (hashMap4 != null) {
            for (p0.b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr4 = this.f2937l;
                    ((b.a) bVar).c(view, f13, dArr4[0], dArr4[i10]);
                } else {
                    bVar.b(view, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.f2927b.f2996e + " y: " + this.f2927b.f2997f + " end: x: " + this.f2928c.f2996e + " y: " + this.f2928c.f2997f;
    }
}
