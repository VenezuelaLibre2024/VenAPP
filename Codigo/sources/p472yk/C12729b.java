package p472yk;

import java.text.DecimalFormat;

/* renamed from: yk.b */
/* loaded from: classes3.dex */
public final class C12729b {

    /* renamed from: a */
    private static final boolean f34552a = false;

    /* renamed from: b */
    private static final ThreadLocal<DecimalFormat>[] f34553b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f34553b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m42033a() {
        return f34552a;
    }
}
