package p485zb;

import android.os.SystemClock;

/* renamed from: zb.r */
/* loaded from: classes.dex */
public abstract class AbstractC12878r {
    /* renamed from: a */
    public static AbstractC12878r m42658a(long j10, long j11, long j12) {
        return new C12861a(j10, j11, j12);
    }

    /* renamed from: e */
    public static AbstractC12878r m42659e() {
        return m42658a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo42600b();

    /* renamed from: c */
    public abstract long mo42601c();

    /* renamed from: d */
    public abstract long mo42602d();
}
