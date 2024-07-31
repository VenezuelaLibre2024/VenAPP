package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: f */
    private static final o1 f4230f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f4231a;

    /* renamed from: b */
    private int[] f4232b;

    /* renamed from: c */
    private Object[] f4233c;

    /* renamed from: d */
    private int f4234d;

    /* renamed from: e */
    private boolean f4235e;

    private o1() {
        this(0, new int[8], new Object[8], true);
    }

    private o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4234d = -1;
        this.f4231a = i10;
        this.f4232b = iArr;
        this.f4233c = objArr;
        this.f4235e = z10;
    }

    private void b() {
        int i10 = this.f4231a;
        int[] iArr = this.f4232b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f4232b = Arrays.copyOf(iArr, i11);
            this.f4233c = Arrays.copyOf(this.f4233c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static o1 e() {
        return f4230f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public static o1 k(o1 o1Var, o1 o1Var2) {
        int i10 = o1Var.f4231a + o1Var2.f4231a;
        int[] copyOf = Arrays.copyOf(o1Var.f4232b, i10);
        System.arraycopy(o1Var2.f4232b, 0, copyOf, o1Var.f4231a, o1Var2.f4231a);
        Object[] copyOf2 = Arrays.copyOf(o1Var.f4233c, i10);
        System.arraycopy(o1Var2.f4233c, 0, copyOf2, o1Var.f4231a, o1Var2.f4231a);
        return new o1(i10, copyOf, copyOf2, true);
    }

    public static o1 l() {
        return new o1();
    }

    private static void p(int i10, Object obj, u1 u1Var) {
        int a10 = t1.a(i10);
        int b10 = t1.b(i10);
        if (b10 == 0) {
            u1Var.u(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 1) {
            u1Var.s(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 2) {
            u1Var.K(a10, (h) obj);
            return;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(b0.d());
            }
            u1Var.c(a10, ((Integer) obj).intValue());
        } else if (u1Var.t() == u1.a.ASCENDING) {
            u1Var.x(a10);
            ((o1) obj).q(u1Var);
            u1Var.C(a10);
        } else {
            u1Var.C(a10);
            ((o1) obj).q(u1Var);
            u1Var.x(a10);
        }
    }

    void a() {
        if (!this.f4235e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f4231a;
        return i10 == o1Var.f4231a && c(this.f4232b, o1Var.f4232b, i10) && d(this.f4233c, o1Var.f4233c, this.f4231a);
    }

    public int f() {
        int Y;
        int i10 = this.f4234d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4231a; i12++) {
            int i13 = this.f4232b[i12];
            int a10 = t1.a(i13);
            int b10 = t1.b(i13);
            if (b10 == 0) {
                Y = k.Y(a10, ((Long) this.f4233c[i12]).longValue());
            } else if (b10 == 1) {
                Y = k.o(a10, ((Long) this.f4233c[i12]).longValue());
            } else if (b10 == 2) {
                Y = k.g(a10, (h) this.f4233c[i12]);
            } else if (b10 == 3) {
                Y = (k.V(a10) * 2) + ((o1) this.f4233c[i12]).f();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(b0.d());
                }
                Y = k.m(a10, ((Integer) this.f4233c[i12]).intValue());
            }
            i11 += Y;
        }
        this.f4234d = i11;
        return i11;
    }

    public int g() {
        int i10 = this.f4234d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4231a; i12++) {
            i11 += k.J(t1.a(this.f4232b[i12]), (h) this.f4233c[i12]);
        }
        this.f4234d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f4231a;
        return ((((527 + i10) * 31) + h(this.f4232b, i10)) * 31) + i(this.f4233c, this.f4231a);
    }

    public void j() {
        this.f4235e = false;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f4231a; i11++) {
            t0.c(sb2, i10, String.valueOf(t1.a(this.f4232b[i11])), this.f4233c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f4232b;
        int i11 = this.f4231a;
        iArr[i11] = i10;
        this.f4233c[i11] = obj;
        this.f4231a = i11 + 1;
    }

    public void o(u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            for (int i10 = this.f4231a - 1; i10 >= 0; i10--) {
                u1Var.b(t1.a(this.f4232b[i10]), this.f4233c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f4231a; i11++) {
            u1Var.b(t1.a(this.f4232b[i11]), this.f4233c[i11]);
        }
    }

    public void q(u1 u1Var) {
        if (this.f4231a == 0) {
            return;
        }
        if (u1Var.t() == u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f4231a; i10++) {
                p(this.f4232b[i10], this.f4233c[i10], u1Var);
            }
            return;
        }
        for (int i11 = this.f4231a - 1; i11 >= 0; i11--) {
            p(this.f4232b[i11], this.f4233c[i11], u1Var);
        }
    }
}
