package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: f */
    private static final o1 f11474f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f11475a;

    /* renamed from: b */
    private int[] f11476b;

    /* renamed from: c */
    private Object[] f11477c;

    /* renamed from: d */
    private int f11478d;

    /* renamed from: e */
    private boolean f11479e;

    private o1() {
        this(0, new int[8], new Object[8], true);
    }

    private o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f11478d = -1;
        this.f11475a = i10;
        this.f11476b = iArr;
        this.f11477c = objArr;
        this.f11479e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f11476b;
        if (i10 > iArr.length) {
            int i11 = this.f11475a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f11476b = Arrays.copyOf(iArr, i10);
            this.f11477c = Arrays.copyOf(this.f11477c, i10);
        }
    }

    public static o1 c() {
        return f11474f;
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
        int i10 = o1Var.f11475a + o1Var2.f11475a;
        int[] copyOf = Arrays.copyOf(o1Var.f11476b, i10);
        System.arraycopy(o1Var2.f11476b, 0, copyOf, o1Var.f11475a, o1Var2.f11475a);
        Object[] copyOf2 = Arrays.copyOf(o1Var.f11477c, i10);
        System.arraycopy(o1Var2.f11477c, 0, copyOf2, o1Var.f11475a, o1Var2.f11475a);
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
            u1Var.M(a10, (h) obj);
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
        if (!this.f11479e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int W;
        int i10 = this.f11478d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11475a; i12++) {
            int i13 = this.f11476b[i12];
            int a10 = t1.a(i13);
            int b10 = t1.b(i13);
            if (b10 == 0) {
                W = k.W(a10, ((Long) this.f11477c[i12]).longValue());
            } else if (b10 == 1) {
                W = k.o(a10, ((Long) this.f11477c[i12]).longValue());
            } else if (b10 == 2) {
                W = k.g(a10, (h) this.f11477c[i12]);
            } else if (b10 == 3) {
                W = (k.T(a10) * 2) + ((o1) this.f11477c[i12]).d();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(b0.e());
                }
                W = k.m(a10, ((Integer) this.f11477c[i12]).intValue());
            }
            i11 += W;
        }
        this.f11478d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f11478d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11475a; i12++) {
            i11 += k.I(t1.a(this.f11476b[i12]), (h) this.f11477c[i12]);
        }
        this.f11478d = i11;
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
        int i10 = this.f11475a;
        return i10 == o1Var.f11475a && o(this.f11476b, o1Var.f11476b, i10) && l(this.f11477c, o1Var.f11477c, this.f11475a);
    }

    public void h() {
        this.f11479e = false;
    }

    public int hashCode() {
        int i10 = this.f11475a;
        return ((((527 + i10) * 31) + f(this.f11476b, i10)) * 31) + g(this.f11477c, this.f11475a);
    }

    public o1 i(o1 o1Var) {
        if (o1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f11475a + o1Var.f11475a;
        b(i10);
        System.arraycopy(o1Var.f11476b, 0, this.f11476b, this.f11475a, o1Var.f11475a);
        System.arraycopy(o1Var.f11477c, 0, this.f11477c, this.f11475a, o1Var.f11475a);
        this.f11475a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f11475a; i11++) {
            t0.d(sb2, i10, String.valueOf(t1.a(this.f11476b[i11])), this.f11477c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f11475a + 1);
        int[] iArr = this.f11476b;
        int i11 = this.f11475a;
        iArr[i11] = i10;
        this.f11477c[i11] = obj;
        this.f11475a = i11 + 1;
    }

    public void p(u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            for (int i10 = this.f11475a - 1; i10 >= 0; i10--) {
                u1Var.b(t1.a(this.f11476b[i10]), this.f11477c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f11475a; i11++) {
            u1Var.b(t1.a(this.f11476b[i11]), this.f11477c[i11]);
        }
    }

    public void r(u1 u1Var) {
        if (this.f11475a == 0) {
            return;
        }
        if (u1Var.t() == u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f11475a; i10++) {
                q(this.f11476b[i10], this.f11477c[i10], u1Var);
            }
            return;
        }
        for (int i11 = this.f11475a - 1; i11 >= 0; i11--) {
            q(this.f11476b[i11], this.f11477c[i11], u1Var);
        }
    }
}
