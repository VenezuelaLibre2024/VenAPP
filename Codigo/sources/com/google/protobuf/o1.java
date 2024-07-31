package com.google.protobuf;

import com.google.protobuf.u1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: f */
    private static final o1 f13302f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f13303a;

    /* renamed from: b */
    private int[] f13304b;

    /* renamed from: c */
    private Object[] f13305c;

    /* renamed from: d */
    private int f13306d;

    /* renamed from: e */
    private boolean f13307e;

    private o1() {
        this(0, new int[8], new Object[8], true);
    }

    private o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f13306d = -1;
        this.f13303a = i10;
        this.f13304b = iArr;
        this.f13305c = objArr;
        this.f13307e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f13304b;
        if (i10 > iArr.length) {
            int i11 = this.f13303a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f13304b = Arrays.copyOf(iArr, i10);
            this.f13305c = Arrays.copyOf(this.f13305c, i10);
        }
    }

    public static o1 c() {
        return f13302f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public static o1 j(o1 o1Var, o1 o1Var2) {
        int i10 = o1Var.f13303a + o1Var2.f13303a;
        int[] copyOf = Arrays.copyOf(o1Var.f13304b, i10);
        System.arraycopy(o1Var2.f13304b, 0, copyOf, o1Var.f13303a, o1Var2.f13303a);
        Object[] copyOf2 = Arrays.copyOf(o1Var.f13305c, i10);
        System.arraycopy(o1Var2.f13305c, 0, copyOf2, o1Var.f13303a, o1Var2.f13303a);
        return new o1(i10, copyOf, copyOf2, true);
    }

    public static o1 k() {
        return new o1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, u1 u1Var) {
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
            u1Var.L(a10, (g) obj);
            return;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(b0.e());
            }
            u1Var.c(a10, ((Integer) obj).intValue());
        } else if (u1Var.t() == u1.a.ASCENDING) {
            u1Var.x(a10);
            ((o1) obj).r(u1Var);
            u1Var.C(a10);
        } else {
            u1Var.C(a10);
            ((o1) obj).r(u1Var);
            u1Var.x(a10);
        }
    }

    void a() {
        if (!this.f13307e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int X;
        int i10 = this.f13306d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f13303a; i12++) {
            int i13 = this.f13304b[i12];
            int a10 = t1.a(i13);
            int b10 = t1.b(i13);
            if (b10 == 0) {
                X = j.X(a10, ((Long) this.f13305c[i12]).longValue());
            } else if (b10 == 1) {
                X = j.o(a10, ((Long) this.f13305c[i12]).longValue());
            } else if (b10 == 2) {
                X = j.g(a10, (g) this.f13305c[i12]);
            } else if (b10 == 3) {
                X = (j.U(a10) * 2) + ((o1) this.f13305c[i12]).d();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(b0.e());
                }
                X = j.m(a10, ((Integer) this.f13305c[i12]).intValue());
            }
            i11 += X;
        }
        this.f13306d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f13306d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f13303a; i12++) {
            i11 += j.J(t1.a(this.f13304b[i12]), (g) this.f13305c[i12]);
        }
        this.f13306d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f13303a;
        return i10 == o1Var.f13303a && o(this.f13304b, o1Var.f13304b, i10) && l(this.f13305c, o1Var.f13305c, this.f13303a);
    }

    public void h() {
        this.f13307e = false;
    }

    public int hashCode() {
        int i10 = this.f13303a;
        return ((((527 + i10) * 31) + f(this.f13304b, i10)) * 31) + g(this.f13305c, this.f13303a);
    }

    public o1 i(o1 o1Var) {
        if (o1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f13303a + o1Var.f13303a;
        b(i10);
        System.arraycopy(o1Var.f13304b, 0, this.f13304b, this.f13303a, o1Var.f13303a);
        System.arraycopy(o1Var.f13305c, 0, this.f13305c, this.f13303a, o1Var.f13303a);
        this.f13303a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f13303a; i11++) {
            t0.d(sb2, i10, String.valueOf(t1.a(this.f13304b[i11])), this.f13305c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f13303a + 1);
        int[] iArr = this.f13304b;
        int i11 = this.f13303a;
        iArr[i11] = i10;
        this.f13305c[i11] = obj;
        this.f13303a = i11 + 1;
    }

    public void p(u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            for (int i10 = this.f13303a - 1; i10 >= 0; i10--) {
                u1Var.b(t1.a(this.f13304b[i10]), this.f13305c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f13303a; i11++) {
            u1Var.b(t1.a(this.f13304b[i11]), this.f13305c[i11]);
        }
    }

    public void r(u1 u1Var) {
        if (this.f13303a == 0) {
            return;
        }
        if (u1Var.t() == u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f13303a; i10++) {
                q(this.f13304b[i10], this.f13305c[i10], u1Var);
            }
            return;
        }
        for (int i11 = this.f13303a - 1; i11 >= 0; i11--) {
            q(this.f13304b[i11], this.f13305c[i11], u1Var);
        }
    }
}
