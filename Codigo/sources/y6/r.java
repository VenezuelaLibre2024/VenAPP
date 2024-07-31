package y6;

import java.util.Arrays;
import java.util.List;
import t6.b3;
import y6.t;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public t f31769a;

        public a(t tVar) {
            this.f31769a = tVar;
        }
    }

    public static boolean a(l lVar) {
        t8.e0 e0Var = new t8.e0(4);
        lVar.q(e0Var.e(), 0, 4);
        return e0Var.J() == 1716281667;
    }

    public static int b(l lVar) {
        lVar.f();
        t8.e0 e0Var = new t8.e0(2);
        lVar.q(e0Var.e(), 0, 2);
        int N = e0Var.N();
        int i10 = N >> 2;
        lVar.f();
        if (i10 == 16382) {
            return N;
        }
        throw b3.a("First frame does not start with sync code.", null);
    }

    public static l7.a c(l lVar, boolean z10) {
        l7.a a10 = new w().a(lVar, z10 ? null : q7.h.f23578b);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static l7.a d(l lVar, boolean z10) {
        lVar.f();
        long i10 = lVar.i();
        l7.a c10 = c(lVar, z10);
        lVar.n((int) (lVar.i() - i10));
        return c10;
    }

    public static boolean e(l lVar, a aVar) {
        t a10;
        lVar.f();
        t8.d0 d0Var = new t8.d0(new byte[4]);
        lVar.q(d0Var.f26645a, 0, 4);
        boolean g10 = d0Var.g();
        int h10 = d0Var.h(7);
        int h11 = d0Var.h(24) + 4;
        if (h10 == 0) {
            a10 = h(lVar);
        } else {
            t tVar = aVar.f31769a;
            if (tVar == null) {
                throw new IllegalArgumentException();
            }
            if (h10 == 3) {
                a10 = tVar.b(g(lVar, h11));
            } else if (h10 == 4) {
                a10 = tVar.c(j(lVar, h11));
            } else {
                if (h10 != 6) {
                    lVar.n(h11);
                    return g10;
                }
                t8.e0 e0Var = new t8.e0(h11);
                lVar.readFully(e0Var.e(), 0, h11);
                e0Var.V(4);
                a10 = tVar.a(com.google.common.collect.w.w(o7.a.a(e0Var)));
            }
        }
        aVar.f31769a = a10;
        return g10;
    }

    public static t.a f(t8.e0 e0Var) {
        e0Var.V(1);
        int K = e0Var.K();
        long f10 = e0Var.f() + K;
        int i10 = K / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long A = e0Var.A();
            if (A == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = A;
            jArr2[i11] = e0Var.A();
            e0Var.V(2);
            i11++;
        }
        e0Var.V((int) (f10 - e0Var.f()));
        return new t.a(jArr, jArr2);
    }

    private static t.a g(l lVar, int i10) {
        t8.e0 e0Var = new t8.e0(i10);
        lVar.readFully(e0Var.e(), 0, i10);
        return f(e0Var);
    }

    private static t h(l lVar) {
        byte[] bArr = new byte[38];
        lVar.readFully(bArr, 0, 38);
        return new t(bArr, 4);
    }

    public static void i(l lVar) {
        t8.e0 e0Var = new t8.e0(4);
        lVar.readFully(e0Var.e(), 0, 4);
        if (e0Var.J() != 1716281667) {
            throw b3.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(l lVar, int i10) {
        t8.e0 e0Var = new t8.e0(i10);
        lVar.readFully(e0Var.e(), 0, i10);
        e0Var.V(4);
        return Arrays.asList(e0.j(e0Var, false, false).f31730b);
    }
}
