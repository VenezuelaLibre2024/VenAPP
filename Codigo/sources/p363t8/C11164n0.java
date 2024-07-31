package p363t8;

/* renamed from: t8.n0 */
/* loaded from: classes.dex */
public final class C11164n0 {

    /* renamed from: a */
    private long f29018a;

    /* renamed from: b */
    private long f29019b;

    /* renamed from: c */
    private long f29020c;

    /* renamed from: d */
    private final ThreadLocal<Long> f29021d = new ThreadLocal<>();

    public C11164n0(long j10) {
        m34829g(j10);
    }

    /* renamed from: f */
    public static long m34821f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m34822i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m34823j(long j10) {
        return m34822i(j10) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long m34824a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f29019b == -9223372036854775807L) {
            long j11 = this.f29018a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) C11137a.m34603e(this.f29021d.get())).longValue();
            }
            this.f29019b = j11 - j10;
            notifyAll();
        }
        this.f29020c = j10;
        return j10 + this.f29019b;
    }

    /* renamed from: b */
    public synchronized long m34825b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f29020c;
        if (j11 != -9223372036854775807L) {
            long m34822i = m34822i(j11);
            long j12 = (4294967296L + m34822i) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - m34822i) < Math.abs(j10 - m34822i)) {
                j10 = j13;
            }
        }
        return m34824a(m34821f(j10));
    }

    /* renamed from: c */
    public synchronized long m34826c() {
        long j10;
        j10 = this.f29018a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: d */
    public synchronized long m34827d() {
        long j10;
        j10 = this.f29020c;
        return j10 != -9223372036854775807L ? j10 + this.f29019b : m34826c();
    }

    /* renamed from: e */
    public synchronized long m34828e() {
        return this.f29019b;
    }

    /* renamed from: g */
    public synchronized void m34829g(long j10) {
        this.f29018a = j10;
        this.f29019b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f29020c = -9223372036854775807L;
    }

    /* renamed from: h */
    public synchronized void m34830h(boolean z10, long j10) {
        C11137a.m34605g(this.f29018a == 9223372036854775806L);
        if (this.f29019b != -9223372036854775807L) {
            return;
        }
        if (z10) {
            this.f29021d.set(Long.valueOf(j10));
        } else {
            while (this.f29019b == -9223372036854775807L) {
                wait();
            }
        }
    }
}
