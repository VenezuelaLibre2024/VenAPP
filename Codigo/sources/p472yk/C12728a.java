package p472yk;

import com.facebook.ads.AdError;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p450xk.C12525q;
import uk.C11582i;

/* renamed from: yk.a */
/* loaded from: classes3.dex */
public final class C12728a implements Comparable<C12728a> {

    /* renamed from: b */
    public static final a f34547b = new a(null);

    /* renamed from: c */
    private static final long f34548c = m42017m(0);

    /* renamed from: d */
    private static final long f34549d;

    /* renamed from: e */
    private static final long f34550e;

    /* renamed from: a */
    private final long f34551a;

    /* renamed from: yk.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    static {
        long m42038e;
        long m42038e2;
        m42038e = C12730c.m42038e(4611686018427387903L);
        f34549d = m42038e;
        m42038e2 = C12730c.m42038e(-4611686018427387903L);
        f34550e = m42038e2;
    }

    private /* synthetic */ C12728a(long j10) {
        this.f34551a = j10;
    }

    /* renamed from: A */
    public static int m42004A(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: B */
    public static final boolean m42005B(long j10) {
        return !m42008E(j10);
    }

    /* renamed from: C */
    private static final boolean m42006C(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* renamed from: D */
    private static final boolean m42007D(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* renamed from: E */
    public static final boolean m42008E(long j10) {
        return j10 == f34549d || j10 == f34550e;
    }

    /* renamed from: F */
    public static final boolean m42009F(long j10) {
        return j10 < 0;
    }

    /* renamed from: G */
    public static final boolean m42010G(long j10) {
        return j10 > 0;
    }

    /* renamed from: H */
    public static final long m42011H(long j10, EnumC12731d unit) {
        C9322n.m27781e(unit, "unit");
        if (j10 == f34549d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f34550e) {
            return Long.MIN_VALUE;
        }
        return C12732e.m42045a(m42030z(j10), m42029y(j10), unit);
    }

    /* renamed from: I */
    public static String m42012I(long j10) {
        int i10;
        long j11;
        StringBuilder sb2;
        int i11;
        int i12;
        String str;
        boolean z10;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f34549d) {
            return "Infinity";
        }
        if (j10 == f34550e) {
            return "-Infinity";
        }
        boolean m42009F = m42009F(j10);
        StringBuilder sb3 = new StringBuilder();
        if (m42009F) {
            sb3.append('-');
        }
        long m42019o = m42019o(j10);
        long m42021q = m42021q(m42019o);
        int m42020p = m42020p(m42019o);
        int m42026v = m42026v(m42019o);
        int m42028x = m42028x(m42019o);
        int m42027w = m42027w(m42019o);
        int i13 = 0;
        boolean z11 = m42021q != 0;
        boolean z12 = m42020p != 0;
        boolean z13 = m42026v != 0;
        boolean z14 = (m42028x == 0 && m42027w == 0) ? false : true;
        if (z11) {
            sb3.append(m42021q);
            sb3.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(m42020p);
            sb3.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(m42026v);
            sb3.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            if (m42028x != 0 || z11 || z12 || z13) {
                i10 = 9;
                j11 = j10;
                sb2 = sb3;
                i11 = m42028x;
                i12 = m42027w;
                str = "s";
                z10 = false;
            } else {
                if (m42027w >= 1000000) {
                    i11 = m42027w / 1000000;
                    i12 = m42027w % 1000000;
                    i10 = 6;
                    str = "ms";
                } else if (m42027w >= 1000) {
                    i11 = m42027w / AdError.NETWORK_ERROR_CODE;
                    i12 = m42027w % AdError.NETWORK_ERROR_CODE;
                    i10 = 3;
                    str = "us";
                } else {
                    sb3.append(m42027w);
                    sb3.append("ns");
                    i13 = i16;
                }
                z10 = false;
                j11 = j10;
                sb2 = sb3;
            }
            m42014b(j11, sb2, i11, i12, i10, str, z10);
            i13 = i16;
        }
        if (m42009F && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        String sb4 = sb3.toString();
        C9322n.m27780d(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: J */
    public static final long m42013J(long j10) {
        long m42037d;
        m42037d = C12730c.m42037d(-m42030z(j10), ((int) j10) & 1);
        return m42037d;
    }

    /* renamed from: b */
    private static final void m42014b(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        String m41085h0;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            m41085h0 = C12525q.m41085h0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = m41085h0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (m41085h0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                i15 = ((i15 + 2) / 3) * 3;
            }
            sb2.append((CharSequence) m41085h0, 0, i15);
            C9322n.m27780d(sb2, "this.append(value, startIndex, endIndex)");
        }
        sb2.append(str);
    }

    /* renamed from: h */
    public static final /* synthetic */ C12728a m42015h(long j10) {
        return new C12728a(j10);
    }

    /* renamed from: l */
    public static int m42016l(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return C9322n.m27783g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m42009F(j10) ? -i10 : i10;
    }

    /* renamed from: m */
    public static long m42017m(long j10) {
        if (C12729b.m42033a()) {
            if (m42007D(j10)) {
                if (!new C11582i(-4611686018426999999L, 4611686018426999999L).m36281k(m42030z(j10))) {
                    throw new AssertionError(m42030z(j10) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new C11582i(-4611686018427387903L, 4611686018427387903L).m36281k(m42030z(j10))) {
                    throw new AssertionError(m42030z(j10) + " ms is out of milliseconds range");
                }
                if (new C11582i(-4611686018426L, 4611686018426L).m36281k(m42030z(j10))) {
                    throw new AssertionError(m42030z(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    /* renamed from: n */
    public static boolean m42018n(long j10, Object obj) {
        return (obj instanceof C12728a) && j10 == ((C12728a) obj).m42031K();
    }

    /* renamed from: o */
    public static final long m42019o(long j10) {
        return m42009F(j10) ? m42013J(j10) : j10;
    }

    /* renamed from: p */
    public static final int m42020p(long j10) {
        if (m42008E(j10)) {
            return 0;
        }
        return (int) (m42022r(j10) % 24);
    }

    /* renamed from: q */
    public static final long m42021q(long j10) {
        return m42011H(j10, EnumC12731d.DAYS);
    }

    /* renamed from: r */
    public static final long m42022r(long j10) {
        return m42011H(j10, EnumC12731d.HOURS);
    }

    /* renamed from: s */
    public static final long m42023s(long j10) {
        return (m42006C(j10) && m42005B(j10)) ? m42030z(j10) : m42011H(j10, EnumC12731d.MILLISECONDS);
    }

    /* renamed from: t */
    public static final long m42024t(long j10) {
        return m42011H(j10, EnumC12731d.MINUTES);
    }

    /* renamed from: u */
    public static final long m42025u(long j10) {
        return m42011H(j10, EnumC12731d.SECONDS);
    }

    /* renamed from: v */
    public static final int m42026v(long j10) {
        if (m42008E(j10)) {
            return 0;
        }
        return (int) (m42024t(j10) % 60);
    }

    /* renamed from: w */
    public static final int m42027w(long j10) {
        if (m42008E(j10)) {
            return 0;
        }
        boolean m42006C = m42006C(j10);
        long m42030z = m42030z(j10);
        return (int) (m42006C ? C12730c.m42040g(m42030z % AdError.NETWORK_ERROR_CODE) : m42030z % 1000000000);
    }

    /* renamed from: x */
    public static final int m42028x(long j10) {
        if (m42008E(j10)) {
            return 0;
        }
        return (int) (m42025u(j10) % 60);
    }

    /* renamed from: y */
    private static final EnumC12731d m42029y(long j10) {
        return m42007D(j10) ? EnumC12731d.NANOSECONDS : EnumC12731d.MILLISECONDS;
    }

    /* renamed from: z */
    private static final long m42030z(long j10) {
        return j10 >> 1;
    }

    /* renamed from: K */
    public final /* synthetic */ long m42031K() {
        return this.f34551a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C12728a c12728a) {
        return m42032i(c12728a.m42031K());
    }

    public boolean equals(Object obj) {
        return m42018n(this.f34551a, obj);
    }

    public int hashCode() {
        return m42004A(this.f34551a);
    }

    /* renamed from: i */
    public int m42032i(long j10) {
        return m42016l(this.f34551a, j10);
    }

    public String toString() {
        return m42012I(this.f34551a);
    }
}
