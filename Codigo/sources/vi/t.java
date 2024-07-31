package vi;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class t implements Comparable<t> {

    /* renamed from: d, reason: collision with root package name */
    private static final b f29205d = new b();

    /* renamed from: e, reason: collision with root package name */
    private static final long f29206e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f29207f;

    /* renamed from: r, reason: collision with root package name */
    private static final long f29208r;

    /* renamed from: a, reason: collision with root package name */
    private final c f29209a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29210b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f29211c;

    /* loaded from: classes3.dex */
    private static class b extends c {
        private b() {
        }

        @Override // vi.t.c
        public long a() {
            return System.nanoTime();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f29206e = nanos;
        f29207f = -nanos;
        f29208r = TimeUnit.SECONDS.toNanos(1L);
    }

    private t(c cVar, long j10, long j11, boolean z10) {
        this.f29209a = cVar;
        long min = Math.min(f29206e, Math.max(f29207f, j11));
        this.f29210b = j10 + min;
        this.f29211c = z10 && min <= 0;
    }

    private t(c cVar, long j10, boolean z10) {
        this(cVar, cVar.a(), j10, z10);
    }

    public static t b(long j10, TimeUnit timeUnit) {
        return h(j10, timeUnit, f29205d);
    }

    public static t h(long j10, TimeUnit timeUnit, c cVar) {
        i(timeUnit, "units");
        return new t(cVar, timeUnit.toNanos(j10), true);
    }

    private static <T> T i(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void l(t tVar) {
        if (this.f29209a == tVar.f29209a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f29209a + " and " + tVar.f29209a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        c cVar = this.f29209a;
        if (cVar != null ? cVar == tVar.f29209a : tVar.f29209a == null) {
            return this.f29210b == tVar.f29210b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f29209a, Long.valueOf(this.f29210b)).hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(t tVar) {
        l(tVar);
        long j10 = this.f29210b - tVar.f29210b;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    public boolean n(t tVar) {
        l(tVar);
        return this.f29210b - tVar.f29210b < 0;
    }

    public boolean o() {
        if (!this.f29211c) {
            if (this.f29210b - this.f29209a.a() > 0) {
                return false;
            }
            this.f29211c = true;
        }
        return true;
    }

    public t p(t tVar) {
        l(tVar);
        return n(tVar) ? this : tVar;
    }

    public long q(TimeUnit timeUnit) {
        long a10 = this.f29209a.a();
        if (!this.f29211c && this.f29210b - a10 <= 0) {
            this.f29211c = true;
        }
        return timeUnit.convert(this.f29210b - a10, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long q10 = q(TimeUnit.NANOSECONDS);
        long abs = Math.abs(q10);
        long j10 = f29208r;
        long j11 = abs / j10;
        long abs2 = Math.abs(q10) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (q10 < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (abs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb2.append("s from now");
        if (this.f29209a != f29205d) {
            sb2.append(" (ticker=" + this.f29209a + ")");
        }
        return sb2.toString();
    }
}
