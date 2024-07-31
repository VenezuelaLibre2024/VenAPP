package yk;

import com.facebook.ads.AdError;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import uk.i;
import xk.q;

/* loaded from: classes3.dex */
public final class a implements Comparable<a> {

    /* renamed from: b, reason: collision with root package name */
    public static final C0535a f32011b = new C0535a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f32012c = m(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f32013d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f32014e;

    /* renamed from: a, reason: collision with root package name */
    private final long f32015a;

    /* renamed from: yk.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0535a {
        private C0535a() {
        }

        public /* synthetic */ C0535a(g gVar) {
            this();
        }
    }

    static {
        long e10;
        long e11;
        e10 = c.e(4611686018427387903L);
        f32013d = e10;
        e11 = c.e(-4611686018427387903L);
        f32014e = e11;
    }

    private /* synthetic */ a(long j10) {
        this.f32015a = j10;
    }

    public static int A(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean B(long j10) {
        return !E(j10);
    }

    private static final boolean C(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean D(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean E(long j10) {
        return j10 == f32013d || j10 == f32014e;
    }

    public static final boolean F(long j10) {
        return j10 < 0;
    }

    public static final boolean G(long j10) {
        return j10 > 0;
    }

    public static final long H(long j10, d unit) {
        n.e(unit, "unit");
        if (j10 == f32013d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f32014e) {
            return Long.MIN_VALUE;
        }
        return e.a(z(j10), y(j10), unit);
    }

    public static String I(long j10) {
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
        if (j10 == f32013d) {
            return "Infinity";
        }
        if (j10 == f32014e) {
            return "-Infinity";
        }
        boolean F = F(j10);
        StringBuilder sb3 = new StringBuilder();
        if (F) {
            sb3.append('-');
        }
        long o10 = o(j10);
        long q10 = q(o10);
        int p10 = p(o10);
        int v10 = v(o10);
        int x10 = x(o10);
        int w10 = w(o10);
        int i13 = 0;
        boolean z11 = q10 != 0;
        boolean z12 = p10 != 0;
        boolean z13 = v10 != 0;
        boolean z14 = (x10 == 0 && w10 == 0) ? false : true;
        if (z11) {
            sb3.append(q10);
            sb3.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(p10);
            sb3.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(v10);
            sb3.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            if (x10 != 0 || z11 || z12 || z13) {
                i10 = 9;
                j11 = j10;
                sb2 = sb3;
                i11 = x10;
                i12 = w10;
                str = "s";
                z10 = false;
            } else {
                if (w10 >= 1000000) {
                    i11 = w10 / 1000000;
                    i12 = w10 % 1000000;
                    i10 = 6;
                    str = "ms";
                } else if (w10 >= 1000) {
                    i11 = w10 / AdError.NETWORK_ERROR_CODE;
                    i12 = w10 % AdError.NETWORK_ERROR_CODE;
                    i10 = 3;
                    str = "us";
                } else {
                    sb3.append(w10);
                    sb3.append("ns");
                    i13 = i16;
                }
                z10 = false;
                j11 = j10;
                sb2 = sb3;
            }
            b(j11, sb2, i11, i12, i10, str, z10);
            i13 = i16;
        }
        if (F && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        String sb4 = sb3.toString();
        n.d(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public static final long J(long j10) {
        long d10;
        d10 = c.d(-z(j10), ((int) j10) & 1);
        return d10;
    }

    private static final void b(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        String h02;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            h02 = q.h0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = h02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (h02.charAt(length) != '0') {
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
            sb2.append((CharSequence) h02, 0, i15);
            n.d(sb2, "this.append(value, startIndex, endIndex)");
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a h(long j10) {
        return new a(j10);
    }

    public static int l(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return n.g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return F(j10) ? -i10 : i10;
    }

    public static long m(long j10) {
        if (b.a()) {
            if (D(j10)) {
                if (!new i(-4611686018426999999L, 4611686018426999999L).k(z(j10))) {
                    throw new AssertionError(z(j10) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new i(-4611686018427387903L, 4611686018427387903L).k(z(j10))) {
                    throw new AssertionError(z(j10) + " ms is out of milliseconds range");
                }
                if (new i(-4611686018426L, 4611686018426L).k(z(j10))) {
                    throw new AssertionError(z(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).K();
    }

    public static final long o(long j10) {
        return F(j10) ? J(j10) : j10;
    }

    public static final int p(long j10) {
        if (E(j10)) {
            return 0;
        }
        return (int) (r(j10) % 24);
    }

    public static final long q(long j10) {
        return H(j10, d.DAYS);
    }

    public static final long r(long j10) {
        return H(j10, d.HOURS);
    }

    public static final long s(long j10) {
        return (C(j10) && B(j10)) ? z(j10) : H(j10, d.MILLISECONDS);
    }

    public static final long t(long j10) {
        return H(j10, d.MINUTES);
    }

    public static final long u(long j10) {
        return H(j10, d.SECONDS);
    }

    public static final int v(long j10) {
        if (E(j10)) {
            return 0;
        }
        return (int) (t(j10) % 60);
    }

    public static final int w(long j10) {
        if (E(j10)) {
            return 0;
        }
        boolean C = C(j10);
        long z10 = z(j10);
        return (int) (C ? c.g(z10 % AdError.NETWORK_ERROR_CODE) : z10 % 1000000000);
    }

    public static final int x(long j10) {
        if (E(j10)) {
            return 0;
        }
        return (int) (u(j10) % 60);
    }

    private static final d y(long j10) {
        return D(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    private static final long z(long j10) {
        return j10 >> 1;
    }

    public final /* synthetic */ long K() {
        return this.f32015a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return i(aVar.K());
    }

    public boolean equals(Object obj) {
        return n(this.f32015a, obj);
    }

    public int hashCode() {
        return A(this.f32015a);
    }

    public int i(long j10) {
        return l(this.f32015a, j10);
    }

    public String toString() {
        return I(this.f32015a);
    }
}
