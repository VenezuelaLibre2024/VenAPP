package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p209l0.AbstractC9337a;
import p209l0.C9338b;
import p209l0.C9339c;
import p283p0.AbstractC10031b;
import p283p0.AbstractC10032c;
import p283p0.AbstractC10033d;
import p283p0.C10030a;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* loaded from: classes.dex */
public class C0750g {

    /* renamed from: a */
    boolean f3271a;

    /* renamed from: b */
    private C0754k f3272b;

    /* renamed from: c */
    private C0754k f3273c;

    /* renamed from: d */
    private C0749f f3274d;

    /* renamed from: e */
    private C0749f f3275e;

    /* renamed from: f */
    private AbstractC9337a[] f3276f;

    /* renamed from: g */
    private AbstractC9337a f3277g;

    /* renamed from: h */
    float f3278h;

    /* renamed from: i */
    float f3279i;

    /* renamed from: j */
    private int[] f3280j;

    /* renamed from: k */
    private double[] f3281k;

    /* renamed from: l */
    private double[] f3282l;

    /* renamed from: m */
    private String[] f3283m;

    /* renamed from: n */
    private float[] f3284n;

    /* renamed from: o */
    private ArrayList<C0754k> f3285o;

    /* renamed from: p */
    private HashMap<String, AbstractC10033d> f3286p;

    /* renamed from: q */
    private HashMap<String, AbstractC10032c> f3287q;

    /* renamed from: r */
    private HashMap<String, AbstractC10031b> f3288r;

    /* renamed from: s */
    private C0748e[] f3289s;

    /* renamed from: t */
    private int f3290t;

    /* renamed from: u */
    private View f3291u;

    /* renamed from: v */
    private int f3292v;

    /* renamed from: w */
    private float f3293w;

    /* renamed from: x */
    private Interpolator f3294x;

    /* renamed from: y */
    private boolean f3295y;

    /* renamed from: a */
    private float m3767a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f3279i;
            if (f12 != 1.0d) {
                float f13 = this.f3278h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        C9338b c9338b = this.f3272b.f3361a;
        Iterator<C0754k> it = this.f3285o.iterator();
        float f14 = Float.NaN;
        while (it.hasNext()) {
            C0754k next = it.next();
            C9338b c9338b2 = next.f3361a;
            if (c9338b2 != null) {
                float f15 = next.f3363c;
                if (f15 < f10) {
                    c9338b = c9338b2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = next.f3363c;
                }
            }
        }
        if (c9338b != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) c9338b.m27828a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) c9338b.m27829b(d10);
            }
        }
        return f10;
    }

    /* renamed from: b */
    public void m3768b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f3276f[0].m27825b(d10, dArr);
        this.f3276f[0].m27827d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f3272b.m3807h(d10, this.f3280j, dArr, fArr, dArr2, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m3769c(View view, float f10, long j10, C9339c c9339c) {
        AbstractC10033d.a aVar;
        boolean z10;
        int i10;
        double d10;
        float m3767a = m3767a(f10, null);
        int i11 = this.f3292v;
        if (i11 != AbstractC0747d.f3268a) {
            float f11 = 1.0f / i11;
            float floor = ((float) Math.floor(m3767a / f11)) * f11;
            float f12 = (m3767a % f11) / f11;
            if (!Float.isNaN(this.f3293w)) {
                f12 = (f12 + this.f3293w) % 1.0f;
            }
            Interpolator interpolator = this.f3294x;
            m3767a = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + floor;
        }
        float f13 = m3767a;
        HashMap<String, AbstractC10032c> hashMap = this.f3287q;
        if (hashMap != null) {
            Iterator<AbstractC10032c> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().mo29941b(view, f13);
            }
        }
        HashMap<String, AbstractC10033d> hashMap2 = this.f3286p;
        if (hashMap2 != null) {
            AbstractC10033d.a aVar2 = null;
            boolean z11 = false;
            for (AbstractC10033d abstractC10033d : hashMap2.values()) {
                if (abstractC10033d instanceof AbstractC10033d.a) {
                    aVar2 = (AbstractC10033d.a) abstractC10033d;
                } else {
                    z11 |= abstractC10033d.mo29944b(view, f13, j10, c9339c);
                }
            }
            z10 = z11;
            aVar = aVar2;
        } else {
            aVar = null;
            z10 = false;
        }
        AbstractC9337a[] abstractC9337aArr = this.f3276f;
        if (abstractC9337aArr != null) {
            double d11 = f13;
            abstractC9337aArr[0].m27825b(d11, this.f3281k);
            this.f3276f[0].m27827d(d11, this.f3282l);
            AbstractC9337a abstractC9337a = this.f3277g;
            if (abstractC9337a != null) {
                double[] dArr = this.f3281k;
                if (dArr.length > 0) {
                    abstractC9337a.m27825b(d11, dArr);
                    this.f3277g.m27827d(d11, this.f3282l);
                }
            }
            if (this.f3295y) {
                d10 = d11;
            } else {
                d10 = d11;
                this.f3272b.m3808i(f13, view, this.f3280j, this.f3281k, this.f3282l, null, this.f3271a);
                this.f3271a = false;
            }
            if (this.f3290t != AbstractC0747d.f3268a) {
                if (this.f3291u == null) {
                    this.f3291u = ((View) view.getParent()).findViewById(this.f3290t);
                }
                if (this.f3291u != null) {
                    float top = (r1.getTop() + this.f3291u.getBottom()) / 2.0f;
                    float left = (this.f3291u.getLeft() + this.f3291u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, AbstractC10032c> hashMap3 = this.f3287q;
            if (hashMap3 != null) {
                for (AbstractC10032c abstractC10032c : hashMap3.values()) {
                    if (abstractC10032c instanceof AbstractC10032c.a) {
                        double[] dArr2 = this.f3282l;
                        if (dArr2.length > 1) {
                            ((AbstractC10032c.a) abstractC10032c).m29942c(view, f13, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f3282l;
                i10 = 1;
                z10 |= aVar.m29945c(view, c9339c, f13, j10, dArr3[0], dArr3[1]);
            } else {
                i10 = 1;
            }
            int i12 = i10;
            while (true) {
                AbstractC9337a[] abstractC9337aArr2 = this.f3276f;
                if (i12 >= abstractC9337aArr2.length) {
                    break;
                }
                abstractC9337aArr2[i12].m27826c(d10, this.f3284n);
                C10030a.m29938b(this.f3272b.f3375z.get(this.f3283m[i12 - 1]), view, this.f3284n);
                i12++;
            }
            C0749f c0749f = this.f3274d;
            if (c0749f.f3269a == 0) {
                if (f13 > 0.0f) {
                    if (f13 >= 1.0f) {
                        c0749f = this.f3275e;
                    } else if (this.f3275e.f3270b != c0749f.f3270b) {
                        view.setVisibility(0);
                    }
                }
                view.setVisibility(c0749f.f3270b);
            }
            if (this.f3289s != null) {
                int i13 = 0;
                while (true) {
                    C0748e[] c0748eArr = this.f3289s;
                    if (i13 >= c0748eArr.length) {
                        break;
                    }
                    c0748eArr[i13].m3766a(f13, view);
                    i13++;
                }
            }
        } else {
            i10 = 1;
            C0754k c0754k = this.f3272b;
            float f14 = c0754k.f3365e;
            C0754k c0754k2 = this.f3273c;
            float f15 = f14 + ((c0754k2.f3365e - f14) * f13);
            float f16 = c0754k.f3366f;
            float f17 = f16 + ((c0754k2.f3366f - f16) * f13);
            float f18 = c0754k.f3367r;
            float f19 = c0754k2.f3367r;
            float f20 = c0754k.f3368s;
            float f21 = c0754k2.f3368s;
            float f22 = f15 + 0.5f;
            int i14 = (int) f22;
            float f23 = f17 + 0.5f;
            int i15 = (int) f23;
            int i16 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i17 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f19 != f18 || f21 != f20 || this.f3271a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f3271a = false;
            }
            view.layout(i14, i15, i16, i17);
        }
        HashMap<String, AbstractC10031b> hashMap4 = this.f3288r;
        if (hashMap4 != null) {
            for (AbstractC10031b abstractC10031b : hashMap4.values()) {
                if (abstractC10031b instanceof AbstractC10031b.a) {
                    double[] dArr4 = this.f3282l;
                    ((AbstractC10031b.a) abstractC10031b).m29940c(view, f13, dArr4[0], dArr4[i10]);
                } else {
                    abstractC10031b.mo29939b(view, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.f3272b.f3365e + " y: " + this.f3272b.f3366f + " end: x: " + this.f3273c.f3365e + " y: " + this.f3273c.f3366f;
    }
}
