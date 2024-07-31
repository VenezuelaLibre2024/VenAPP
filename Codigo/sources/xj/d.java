package xj;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class d {
    public static long a(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, c(j11, j10)));
        return j11;
    }

    public static long b(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, c(j11, j10)));
        return j11;
    }

    public static long c(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static long d(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                yj.a.q(new IllegalStateException("More produced than requested: " + j12));
                j12 = 0L;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }
}
