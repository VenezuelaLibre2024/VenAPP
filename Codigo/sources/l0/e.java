package l0;

import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    protected a f20787a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f20788b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f20789c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    private int f20790d;

    /* renamed from: e, reason: collision with root package name */
    private String f20791e;

    public float a(float f10) {
        return (float) this.f20787a.a(f10, 0);
    }

    public String toString() {
        String str = this.f20791e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f20790d; i10++) {
            str = str + "[" + this.f20788b[i10] + " , " + decimalFormat.format(this.f20789c[i10]) + "] ";
        }
        return str;
    }
}
