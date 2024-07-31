package p396v6;

import gb.C7535b;
import java.math.RoundingMode;
import p137hb.C7690e;
import p363t8.C11172r0;
import p396v6.C11646h0;

/* renamed from: v6.o0 */
/* loaded from: classes.dex */
public class C11660o0 implements C11646h0.e {

    /* renamed from: b */
    protected final int f30427b;

    /* renamed from: c */
    protected final int f30428c;

    /* renamed from: d */
    protected final int f30429d;

    /* renamed from: e */
    protected final int f30430e;

    /* renamed from: f */
    protected final int f30431f;

    /* renamed from: g */
    public final int f30432g;

    /* renamed from: v6.o0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f30433a = 250000;

        /* renamed from: b */
        private int f30434b = 750000;

        /* renamed from: c */
        private int f30435c = 4;

        /* renamed from: d */
        private int f30436d = 250000;

        /* renamed from: e */
        private int f30437e = 50000000;

        /* renamed from: f */
        private int f30438f = 2;

        /* renamed from: g */
        public C11660o0 m36643g() {
            return new C11660o0(this);
        }
    }

    protected C11660o0(a aVar) {
        this.f30427b = aVar.f30433a;
        this.f30428c = aVar.f30434b;
        this.f30429d = aVar.f30435c;
        this.f30430e = aVar.f30436d;
        this.f30431f = aVar.f30437e;
        this.f30432g = aVar.f30438f;
    }

    /* renamed from: b */
    protected static int m36631b(int i10, int i11, int i12) {
        return C7690e.m23413d(((i10 * i11) * i12) / 1000000);
    }

    /* renamed from: d */
    protected static int m36632d(int i10) {
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

    @Override // p396v6.C11646h0.e
    /* renamed from: a */
    public int mo36584a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (m36633c(i10, i11, i12, i13, i14, i15) * d10)) + i13) - 1) / i13) * i13;
    }

    /* renamed from: c */
    protected int m36633c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return m36636g(i10, i14, i13);
        }
        if (i12 == 1) {
            return m36634e(i11);
        }
        if (i12 == 2) {
            return m36635f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    protected int m36634e(int i10) {
        return C7690e.m23413d((this.f30431f * m36632d(i10)) / 1000000);
    }

    /* renamed from: f */
    protected int m36635f(int i10, int i11) {
        int i12 = this.f30430e;
        if (i10 == 5) {
            i12 *= this.f30432g;
        }
        return C7690e.m23413d((i12 * (i11 != -1 ? C7535b.m22880a(i11, 8, RoundingMode.CEILING) : m36632d(i10))) / 1000000);
    }

    /* renamed from: g */
    protected int m36636g(int i10, int i11, int i12) {
        return C11172r0.m34942q(i10 * this.f30429d, m36631b(this.f30427b, i11, i12), m36631b(this.f30428c, i11, i12));
    }
}
