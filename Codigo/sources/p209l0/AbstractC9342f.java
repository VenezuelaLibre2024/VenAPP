package p209l0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: l0.f */
/* loaded from: classes.dex */
public abstract class AbstractC9342f {

    /* renamed from: a */
    protected AbstractC9337a f22614a;

    /* renamed from: e */
    protected int f22618e;

    /* renamed from: f */
    protected String f22619f;

    /* renamed from: i */
    protected long f22622i;

    /* renamed from: b */
    protected int f22615b = 0;

    /* renamed from: c */
    protected int[] f22616c = new int[10];

    /* renamed from: d */
    protected float[][] f22617d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g */
    protected float[] f22620g = new float[3];

    /* renamed from: h */
    protected boolean f22621h = false;

    /* renamed from: j */
    protected float f22623j = Float.NaN;

    public String toString() {
        String str = this.f22619f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f22618e; i10++) {
            str = str + "[" + this.f22616c[i10] + " , " + decimalFormat.format(this.f22617d[i10]) + "] ";
        }
        return str;
    }
}
