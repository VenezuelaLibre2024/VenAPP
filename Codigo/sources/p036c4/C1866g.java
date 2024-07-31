package p036c4;

import android.os.SystemClock;

/* renamed from: c4.g */
/* loaded from: classes.dex */
public final class C1866g {

    /* renamed from: a */
    private static final double f7793a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m9933a(long j10) {
        return (m9934b() - j10) * f7793a;
    }

    /* renamed from: b */
    public static long m9934b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
