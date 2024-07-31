package p209l0;

import java.text.DecimalFormat;

/* renamed from: l0.e */
/* loaded from: classes.dex */
public abstract class AbstractC9341e {

    /* renamed from: a */
    protected AbstractC9337a f22609a;

    /* renamed from: b */
    protected int[] f22610b = new int[10];

    /* renamed from: c */
    protected float[] f22611c = new float[10];

    /* renamed from: d */
    private int f22612d;

    /* renamed from: e */
    private String f22613e;

    /* renamed from: a */
    public float m27832a(float f10) {
        return (float) this.f22609a.m27824a(f10, 0);
    }

    public String toString() {
        String str = this.f22613e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f22612d; i10++) {
            str = str + "[" + this.f22610b[i10] + " , " + decimalFormat.format(this.f22611c[i10]) + "] ";
        }
        return str;
    }
}
