package p082eb;

import java.util.concurrent.TimeUnit;

/* renamed from: eb.t */
/* loaded from: classes2.dex */
public final class C7164t {

    /* renamed from: a */
    private final AbstractC7170z f16047a = AbstractC7170z.m21363b();

    /* renamed from: b */
    private boolean f16048b;

    /* renamed from: c */
    private long f16049c;

    /* renamed from: d */
    private long f16050d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eb.t$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16051a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f16051a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16051a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16051a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16051a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16051a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16051a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16051a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C7164t() {
    }

    /* renamed from: a */
    private static String m21341a(TimeUnit timeUnit) {
        switch (a.f16051a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    private static TimeUnit m21342b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* renamed from: c */
    public static C7164t m21343c() {
        return new C7164t();
    }

    /* renamed from: e */
    private long m21344e() {
        return this.f16048b ? (this.f16047a.mo21364a() - this.f16050d) + this.f16049c : this.f16049c;
    }

    /* renamed from: d */
    public long m21345d(TimeUnit timeUnit) {
        return timeUnit.convert(m21344e(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: f */
    public C7164t m21346f() {
        this.f16049c = 0L;
        this.f16048b = false;
        return this;
    }

    /* renamed from: g */
    public C7164t m21347g() {
        C7159o.m21319v(!this.f16048b, "This stopwatch is already running.");
        this.f16048b = true;
        this.f16050d = this.f16047a.mo21364a();
        return this;
    }

    public String toString() {
        long m21344e = m21344e();
        TimeUnit m21342b = m21342b(m21344e);
        return C7158n.m21294b(m21344e / TimeUnit.NANOSECONDS.convert(1L, m21342b)) + " " + m21341a(m21342b);
    }
}
