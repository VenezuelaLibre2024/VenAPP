package com.google.protobuf;

import com.google.protobuf.InterfaceC6624u1;
import java.util.Arrays;

/* renamed from: com.google.protobuf.o1 */
/* loaded from: classes2.dex */
public final class C6606o1 {

    /* renamed from: f */
    private static final C6606o1 f14576f = new C6606o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f14577a;

    /* renamed from: b */
    private int[] f14578b;

    /* renamed from: c */
    private Object[] f14579c;

    /* renamed from: d */
    private int f14580d;

    /* renamed from: e */
    private boolean f14581e;

    private C6606o1() {
        this(0, new int[8], new Object[8], true);
    }

    private C6606o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f14580d = -1;
        this.f14577a = i10;
        this.f14578b = iArr;
        this.f14579c = objArr;
        this.f14581e = z10;
    }

    /* renamed from: b */
    private void m18978b(int i10) {
        int[] iArr = this.f14578b;
        if (i10 > iArr.length) {
            int i11 = this.f14577a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f14578b = Arrays.copyOf(iArr, i10);
            this.f14579c = Arrays.copyOf(this.f14579c, i10);
        }
    }

    /* renamed from: c */
    public static C6606o1 m18979c() {
        return f14576f;
    }

    /* renamed from: f */
    private static int m18980f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    /* renamed from: g */
    private static int m18981g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C6606o1 m18982j(C6606o1 c6606o1, C6606o1 c6606o12) {
        int i10 = c6606o1.f14577a + c6606o12.f14577a;
        int[] copyOf = Arrays.copyOf(c6606o1.f14578b, i10);
        System.arraycopy(c6606o12.f14578b, 0, copyOf, c6606o1.f14577a, c6606o12.f14577a);
        Object[] copyOf2 = Arrays.copyOf(c6606o1.f14579c, i10);
        System.arraycopy(c6606o12.f14579c, 0, copyOf2, c6606o1.f14577a, c6606o12.f14577a);
        return new C6606o1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C6606o1 m18983k() {
        return new C6606o1();
    }

    /* renamed from: l */
    private static boolean m18984l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private static boolean m18985o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private static void m18986q(int i10, Object obj, InterfaceC6624u1 interfaceC6624u1) {
        int m19188a = C6621t1.m19188a(i10);
        int m19189b = C6621t1.m19189b(i10);
        if (m19189b == 0) {
            interfaceC6624u1.mo18899u(m19188a, ((Long) obj).longValue());
            return;
        }
        if (m19189b == 1) {
            interfaceC6624u1.mo18897s(m19188a, ((Long) obj).longValue());
            return;
        }
        if (m19189b == 2) {
            interfaceC6624u1.mo18875L(m19188a, (AbstractC6580g) obj);
            return;
        }
        if (m19189b != 3) {
            if (m19189b != 5) {
                throw new RuntimeException(C6566b0.m18400e());
            }
            interfaceC6624u1.mo18881c(m19188a, ((Integer) obj).intValue());
        } else if (interfaceC6624u1.mo18898t() == InterfaceC6624u1.a.ASCENDING) {
            interfaceC6624u1.mo18902x(m19188a);
            ((C6606o1) obj).m18995r(interfaceC6624u1);
            interfaceC6624u1.mo18866C(m19188a);
        } else {
            interfaceC6624u1.mo18866C(m19188a);
            ((C6606o1) obj).m18995r(interfaceC6624u1);
            interfaceC6624u1.mo18902x(m19188a);
        }
    }

    /* renamed from: a */
    void m18987a() {
        if (!this.f14581e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int m18988d() {
        int m18728X;
        int i10 = this.f14580d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14577a; i12++) {
            int i13 = this.f14578b[i12];
            int m19188a = C6621t1.m19188a(i13);
            int m19189b = C6621t1.m19189b(i13);
            if (m19189b == 0) {
                m18728X = AbstractC6589j.m18728X(m19188a, ((Long) this.f14579c[i12]).longValue());
            } else if (m19189b == 1) {
                m18728X = AbstractC6589j.m18747o(m19188a, ((Long) this.f14579c[i12]).longValue());
            } else if (m19189b == 2) {
                m18728X = AbstractC6589j.m18738g(m19188a, (AbstractC6580g) this.f14579c[i12]);
            } else if (m19189b == 3) {
                m18728X = (AbstractC6589j.m18725U(m19188a) * 2) + ((C6606o1) this.f14579c[i12]).m18988d();
            } else {
                if (m19189b != 5) {
                    throw new IllegalStateException(C6566b0.m18400e());
                }
                m18728X = AbstractC6589j.m18745m(m19188a, ((Integer) this.f14579c[i12]).intValue());
            }
            i11 += m18728X;
        }
        this.f14580d = i11;
        return i11;
    }

    /* renamed from: e */
    public int m18989e() {
        int i10 = this.f14580d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14577a; i12++) {
            i11 += AbstractC6589j.m18714J(C6621t1.m19188a(this.f14578b[i12]), (AbstractC6580g) this.f14579c[i12]);
        }
        this.f14580d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6606o1)) {
            return false;
        }
        C6606o1 c6606o1 = (C6606o1) obj;
        int i10 = this.f14577a;
        return i10 == c6606o1.f14577a && m18985o(this.f14578b, c6606o1.f14578b, i10) && m18984l(this.f14579c, c6606o1.f14579c, this.f14577a);
    }

    /* renamed from: h */
    public void m18990h() {
        this.f14581e = false;
    }

    public int hashCode() {
        int i10 = this.f14577a;
        return ((((527 + i10) * 31) + m18980f(this.f14578b, i10)) * 31) + m18981g(this.f14579c, this.f14577a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C6606o1 m18991i(C6606o1 c6606o1) {
        if (c6606o1.equals(m18979c())) {
            return this;
        }
        m18987a();
        int i10 = this.f14577a + c6606o1.f14577a;
        m18978b(i10);
        System.arraycopy(c6606o1.f14578b, 0, this.f14578b, this.f14577a, c6606o1.f14577a);
        System.arraycopy(c6606o1.f14579c, 0, this.f14579c, this.f14577a, c6606o1.f14577a);
        this.f14577a = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m18992m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f14577a; i11++) {
            C6620t0.m19185d(sb2, i10, String.valueOf(C6621t1.m19188a(this.f14578b[i11])), this.f14579c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m18993n(int i10, Object obj) {
        m18987a();
        m18978b(this.f14577a + 1);
        int[] iArr = this.f14578b;
        int i11 = this.f14577a;
        iArr[i11] = i10;
        this.f14579c[i11] = obj;
        this.f14577a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m18994p(InterfaceC6624u1 interfaceC6624u1) {
        if (interfaceC6624u1.mo18898t() == InterfaceC6624u1.a.DESCENDING) {
            for (int i10 = this.f14577a - 1; i10 >= 0; i10--) {
                interfaceC6624u1.mo18880b(C6621t1.m19188a(this.f14578b[i10]), this.f14579c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f14577a; i11++) {
            interfaceC6624u1.mo18880b(C6621t1.m19188a(this.f14578b[i11]), this.f14579c[i11]);
        }
    }

    /* renamed from: r */
    public void m18995r(InterfaceC6624u1 interfaceC6624u1) {
        if (this.f14577a == 0) {
            return;
        }
        if (interfaceC6624u1.mo18898t() == InterfaceC6624u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f14577a; i10++) {
                m18986q(this.f14578b[i10], this.f14579c[i10], interfaceC6624u1);
            }
            return;
        }
        for (int i11 = this.f14577a - 1; i11 >= 0; i11--) {
            m18986q(this.f14578b[i11], this.f14579c[i11], interfaceC6624u1);
        }
    }
}
