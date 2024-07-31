package v6;

import java.math.RoundingMode;
import v6.h0;

/* loaded from: classes.dex */
public class o0 implements h0.e {

    /* renamed from: b */
    protected final int f28077b;

    /* renamed from: c */
    protected final int f28078c;

    /* renamed from: d */
    protected final int f28079d;

    /* renamed from: e */
    protected final int f28080e;

    /* renamed from: f */
    protected final int f28081f;

    /* renamed from: g */
    public final int f28082g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f28083a = 250000;

        /* renamed from: b */
        private int f28084b = 750000;

        /* renamed from: c */
        private int f28085c = 4;

        /* renamed from: d */
        private int f28086d = 250000;

        /* renamed from: e */
        private int f28087e = 50000000;

        /* renamed from: f */
        private int f28088f = 2;

        public o0 g() {
            return new o0(this);
        }
    }

    protected o0(a aVar) {
        this.f28077b = aVar.f28083a;
        this.f28078c = aVar.f28084b;
        this.f28079d = aVar.f28085c;
        this.f28080e = aVar.f28086d;
        this.f28081f = aVar.f28087e;
        this.f28082g = aVar.f28088f;
    }

    protected static int b(int i10, int i11, int i12) {
        return hb.e.d(((i10 * i11) * i12) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // v6.h0.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14, i15) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i10) {
        return hb.e.d((this.f28081f * d(i10)) / 1000000);
    }

    protected int f(int i10, int i11) {
        int i12 = this.f28080e;
        if (i10 == 5) {
            i12 *= this.f28082g;
        }
        return hb.e.d((i12 * (i11 != -1 ? gb.b.a(i11, 8, RoundingMode.CEILING) : d(i10))) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return t8.r0.q(i10 * this.f28079d, b(this.f28077b, i11, i12), b(this.f28078c, i11, i12));
    }
}
