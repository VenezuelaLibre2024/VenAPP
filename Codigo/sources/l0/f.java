package l0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected a f20792a;

    /* renamed from: e, reason: collision with root package name */
    protected int f20796e;

    /* renamed from: f, reason: collision with root package name */
    protected String f20797f;

    /* renamed from: i, reason: collision with root package name */
    protected long f20800i;

    /* renamed from: b, reason: collision with root package name */
    protected int f20793b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f20794c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f20795d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    protected float[] f20798g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f20799h = false;

    /* renamed from: j, reason: collision with root package name */
    protected float f20801j = Float.NaN;

    public String toString() {
        String str = this.f20797f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f20796e; i10++) {
            str = str + "[" + this.f20794c[i10] + " , " + decimalFormat.format(this.f20795d[i10]) + "] ";
        }
        return str;
    }
}
