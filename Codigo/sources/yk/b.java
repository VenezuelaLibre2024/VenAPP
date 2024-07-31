package yk;

import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f32016a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f32017b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f32017b = threadLocalArr;
    }

    public static final boolean a() {
        return f32016a;
    }
}
