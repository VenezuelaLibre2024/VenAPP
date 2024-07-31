package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC1208u1;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.o1 */
/* loaded from: classes.dex */
public final class C1190o1 {

    /* renamed from: f */
    private static final C1190o1 f4941f = new C1190o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f4942a;

    /* renamed from: b */
    private int[] f4943b;

    /* renamed from: c */
    private Object[] f4944c;

    /* renamed from: d */
    private int f4945d;

    /* renamed from: e */
    private boolean f4946e;

    private C1190o1() {
        this(0, new int[8], new Object[8], true);
    }

    private C1190o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4945d = -1;
        this.f4942a = i10;
        this.f4943b = iArr;
        this.f4944c = objArr;
        this.f4946e = z10;
    }

    /* renamed from: b */
    private void m6255b() {
        int i10 = this.f4942a;
        int[] iArr = this.f4943b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f4943b = Arrays.copyOf(iArr, i11);
            this.f4944c = Arrays.copyOf(this.f4944c, i11);
        }
    }

    /* renamed from: c */
    private static boolean m6256c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m6257d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C1190o1 m6258e() {
        return f4941f;
    }

    /* renamed from: h */
    private static int m6259h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    /* renamed from: i */
    private static int m6260i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C1190o1 m6261k(C1190o1 c1190o1, C1190o1 c1190o12) {
        int i10 = c1190o1.f4942a + c1190o12.f4942a;
        int[] copyOf = Arrays.copyOf(c1190o1.f4943b, i10);
        System.arraycopy(c1190o12.f4943b, 0, copyOf, c1190o1.f4942a, c1190o12.f4942a);
        Object[] copyOf2 = Arrays.copyOf(c1190o1.f4944c, i10);
        System.arraycopy(c1190o12.f4944c, 0, copyOf2, c1190o1.f4942a, c1190o12.f4942a);
        return new C1190o1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C1190o1 m6262l() {
        return new C1190o1();
    }

    /* renamed from: p */
    private static void m6263p(int i10, Object obj, InterfaceC1208u1 interfaceC1208u1) {
        int m6426a = C1205t1.m6426a(i10);
        int m6427b = C1205t1.m6427b(i10);
        if (m6427b == 0) {
            interfaceC1208u1.mo6185u(m6426a, ((Long) obj).longValue());
            return;
        }
        if (m6427b == 1) {
            interfaceC1208u1.mo6183s(m6426a, ((Long) obj).longValue());
            return;
        }
        if (m6427b == 2) {
            interfaceC1208u1.mo6160K(m6426a, (AbstractC1167h) obj);
            return;
        }
        if (m6427b != 3) {
            if (m6427b != 5) {
                throw new RuntimeException(C1150b0.m5667d());
            }
            interfaceC1208u1.mo6167c(m6426a, ((Integer) obj).intValue());
        } else if (interfaceC1208u1.mo6184t() == InterfaceC1208u1.a.ASCENDING) {
            interfaceC1208u1.mo6188x(m6426a);
            ((C1190o1) obj).m6271q(interfaceC1208u1);
            interfaceC1208u1.mo6152C(m6426a);
        } else {
            interfaceC1208u1.mo6152C(m6426a);
            ((C1190o1) obj).m6271q(interfaceC1208u1);
            interfaceC1208u1.mo6188x(m6426a);
        }
    }

    /* renamed from: a */
    void m6264a() {
        if (!this.f4946e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1190o1)) {
            return false;
        }
        C1190o1 c1190o1 = (C1190o1) obj;
        int i10 = this.f4942a;
        return i10 == c1190o1.f4942a && m6256c(this.f4943b, c1190o1.f4943b, i10) && m6257d(this.f4944c, c1190o1.f4944c, this.f4942a);
    }

    /* renamed from: f */
    public int m6265f() {
        int m6042Y;
        int i10 = this.f4945d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4942a; i12++) {
            int i13 = this.f4943b[i12];
            int m6426a = C1205t1.m6426a(i13);
            int m6427b = C1205t1.m6427b(i13);
            if (m6427b == 0) {
                m6042Y = AbstractC1176k.m6042Y(m6426a, ((Long) this.f4944c[i12]).longValue());
            } else if (m6427b == 1) {
                m6042Y = AbstractC1176k.m6061o(m6426a, ((Long) this.f4944c[i12]).longValue());
            } else if (m6427b == 2) {
                m6042Y = AbstractC1176k.m6051g(m6426a, (AbstractC1167h) this.f4944c[i12]);
            } else if (m6427b == 3) {
                m6042Y = (AbstractC1176k.m6039V(m6426a) * 2) + ((C1190o1) this.f4944c[i12]).m6265f();
            } else {
                if (m6427b != 5) {
                    throw new IllegalStateException(C1150b0.m5667d());
                }
                m6042Y = AbstractC1176k.m6059m(m6426a, ((Integer) this.f4944c[i12]).intValue());
            }
            i11 += m6042Y;
        }
        this.f4945d = i11;
        return i11;
    }

    /* renamed from: g */
    public int m6266g() {
        int i10 = this.f4945d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4942a; i12++) {
            i11 += AbstractC1176k.m6027J(C1205t1.m6426a(this.f4943b[i12]), (AbstractC1167h) this.f4944c[i12]);
        }
        this.f4945d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f4942a;
        return ((((527 + i10) * 31) + m6259h(this.f4943b, i10)) * 31) + m6260i(this.f4944c, this.f4942a);
    }

    /* renamed from: j */
    public void m6267j() {
        this.f4946e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m6268m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f4942a; i11++) {
            C1204t0.m6423c(sb2, i10, String.valueOf(C1205t1.m6426a(this.f4943b[i11])), this.f4944c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m6269n(int i10, Object obj) {
        m6264a();
        m6255b();
        int[] iArr = this.f4943b;
        int i11 = this.f4942a;
        iArr[i11] = i10;
        this.f4944c[i11] = obj;
        this.f4942a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m6270o(InterfaceC1208u1 interfaceC1208u1) {
        if (interfaceC1208u1.mo6184t() == InterfaceC1208u1.a.DESCENDING) {
            for (int i10 = this.f4942a - 1; i10 >= 0; i10--) {
                interfaceC1208u1.mo6166b(C1205t1.m6426a(this.f4943b[i10]), this.f4944c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f4942a; i11++) {
            interfaceC1208u1.mo6166b(C1205t1.m6426a(this.f4943b[i11]), this.f4944c[i11]);
        }
    }

    /* renamed from: q */
    public void m6271q(InterfaceC1208u1 interfaceC1208u1) {
        if (this.f4942a == 0) {
            return;
        }
        if (interfaceC1208u1.mo6184t() == InterfaceC1208u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f4942a; i10++) {
                m6263p(this.f4943b[i10], this.f4944c[i10], interfaceC1208u1);
            }
            return;
        }
        for (int i11 = this.f4942a - 1; i11 >= 0; i11--) {
            m6263p(this.f4943b[i11], this.f4944c[i11], interfaceC1208u1);
        }
    }
}
