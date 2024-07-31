package vi;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: vi.t */
/* loaded from: classes3.dex */
public final class C11946t implements Comparable<C11946t> {

    /* renamed from: d */
    private static final b f31640d = new b();

    /* renamed from: e */
    private static final long f31641e;

    /* renamed from: f */
    private static final long f31642f;

    /* renamed from: r */
    private static final long f31643r;

    /* renamed from: a */
    private final c f31644a;

    /* renamed from: b */
    private final long f31645b;

    /* renamed from: c */
    private volatile boolean f31646c;

    /* renamed from: vi.t$b */
    /* loaded from: classes3.dex */
    private static class b extends c {
        private b() {
        }

        @Override // vi.C11946t.c
        /* renamed from: a */
        public long mo38271a() {
            return System.nanoTime();
        }
    }

    /* renamed from: vi.t$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract long mo38271a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f31641e = nanos;
        f31642f = -nanos;
        f31643r = TimeUnit.SECONDS.toNanos(1L);
    }

    private C11946t(c cVar, long j10, long j11, boolean z10) {
        this.f31644a = cVar;
        long min = Math.min(f31641e, Math.max(f31642f, j11));
        this.f31645b = j10 + min;
        this.f31646c = z10 && min <= 0;
    }

    private C11946t(c cVar, long j10, boolean z10) {
        this(cVar, cVar.mo38271a(), j10, z10);
    }

    /* renamed from: b */
    public static C11946t m38262b(long j10, TimeUnit timeUnit) {
        return m38263h(j10, timeUnit, f31640d);
    }

    /* renamed from: h */
    public static C11946t m38263h(long j10, TimeUnit timeUnit, c cVar) {
        m38264i(timeUnit, "units");
        return new C11946t(cVar, timeUnit.toNanos(j10), true);
    }

    /* renamed from: i */
    private static <T> T m38264i(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    private void m38265l(C11946t c11946t) {
        if (this.f31644a == c11946t.f31644a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f31644a + " and " + c11946t.f31644a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11946t)) {
            return false;
        }
        C11946t c11946t = (C11946t) obj;
        c cVar = this.f31644a;
        if (cVar != null ? cVar == c11946t.f31644a : c11946t.f31644a == null) {
            return this.f31645b == c11946t.f31645b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f31644a, Long.valueOf(this.f31645b)).hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(C11946t c11946t) {
        m38265l(c11946t);
        long j10 = this.f31645b - c11946t.f31645b;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    /* renamed from: n */
    public boolean m38267n(C11946t c11946t) {
        m38265l(c11946t);
        return this.f31645b - c11946t.f31645b < 0;
    }

    /* renamed from: o */
    public boolean m38268o() {
        if (!this.f31646c) {
            if (this.f31645b - this.f31644a.mo38271a() > 0) {
                return false;
            }
            this.f31646c = true;
        }
        return true;
    }

    /* renamed from: p */
    public C11946t m38269p(C11946t c11946t) {
        m38265l(c11946t);
        return m38267n(c11946t) ? this : c11946t;
    }

    /* renamed from: q */
    public long m38270q(TimeUnit timeUnit) {
        long mo38271a = this.f31644a.mo38271a();
        if (!this.f31646c && this.f31645b - mo38271a <= 0) {
            this.f31646c = true;
        }
        return timeUnit.convert(this.f31645b - mo38271a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long m38270q = m38270q(TimeUnit.NANOSECONDS);
        long abs = Math.abs(m38270q);
        long j10 = f31643r;
        long j11 = abs / j10;
        long abs2 = Math.abs(m38270q) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (m38270q < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (abs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb2.append("s from now");
        if (this.f31644a != f31640d) {
            sb2.append(" (ticker=" + this.f31644a + ")");
        }
        return sb2.toString();
    }
}
