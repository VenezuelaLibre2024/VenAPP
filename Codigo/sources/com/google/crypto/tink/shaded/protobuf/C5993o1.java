package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o1 */
/* loaded from: classes2.dex */
public final class C5993o1 {

    /* renamed from: f */
    private static final C5993o1 f12689f = new C5993o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f12690a;

    /* renamed from: b */
    private int[] f12691b;

    /* renamed from: c */
    private Object[] f12692c;

    /* renamed from: d */
    private int f12693d;

    /* renamed from: e */
    private boolean f12694e;

    private C5993o1() {
        this(0, new int[8], new Object[8], true);
    }

    private C5993o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f12693d = -1;
        this.f12690a = i10;
        this.f12691b = iArr;
        this.f12692c = objArr;
        this.f12694e = z10;
    }

    /* renamed from: b */
    private void m15914b(int i10) {
        int[] iArr = this.f12691b;
        if (i10 > iArr.length) {
            int i11 = this.f12690a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f12691b = Arrays.copyOf(iArr, i10);
            this.f12692c = Arrays.copyOf(this.f12692c, i10);
        }
    }

    /* renamed from: c */
    public static C5993o1 m15915c() {
        return f12689f;
    }

    /* renamed from: f */
    private static int m15916f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    /* renamed from: g */
    private static int m15917g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C5993o1 m15918j(C5993o1 c5993o1, C5993o1 c5993o12) {
        int i10 = c5993o1.f12690a + c5993o12.f12690a;
        int[] copyOf = Arrays.copyOf(c5993o1.f12691b, i10);
        System.arraycopy(c5993o12.f12691b, 0, copyOf, c5993o1.f12690a, c5993o12.f12690a);
        Object[] copyOf2 = Arrays.copyOf(c5993o1.f12692c, i10);
        System.arraycopy(c5993o12.f12692c, 0, copyOf2, c5993o1.f12690a, c5993o12.f12690a);
        return new C5993o1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C5993o1 m15919k() {
        return new C5993o1();
    }

    /* renamed from: l */
    private static boolean m15920l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private static boolean m15921o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private static void m15922q(int i10, Object obj, InterfaceC6011u1 interfaceC6011u1) {
        int m16092a = C6008t1.m16092a(i10);
        int m16093b = C6008t1.m16093b(i10);
        if (m16093b == 0) {
            interfaceC6011u1.mo15844u(m16092a, ((Long) obj).longValue());
            return;
        }
        if (m16093b == 1) {
            interfaceC6011u1.mo15842s(m16092a, ((Long) obj).longValue());
            return;
        }
        if (m16093b == 2) {
            interfaceC6011u1.mo15821M(m16092a, (AbstractC5970h) obj);
            return;
        }
        if (m16093b != 3) {
            if (m16093b != 5) {
                throw new RuntimeException(C5953b0.m15326e());
            }
            interfaceC6011u1.mo15826c(m16092a, ((Integer) obj).intValue());
        } else if (interfaceC6011u1.mo15843t() == InterfaceC6011u1.a.ASCENDING) {
            interfaceC6011u1.mo15847x(m16092a);
            ((C5993o1) obj).m15931r(interfaceC6011u1);
            interfaceC6011u1.mo15811C(m16092a);
        } else {
            interfaceC6011u1.mo15811C(m16092a);
            ((C5993o1) obj).m15931r(interfaceC6011u1);
            interfaceC6011u1.mo15847x(m16092a);
        }
    }

    /* renamed from: a */
    void m15923a() {
        if (!this.f12694e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int m15924d() {
        int m15724W;
        int i10 = this.f12693d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12690a; i12++) {
            int i13 = this.f12691b[i12];
            int m16092a = C6008t1.m16092a(i13);
            int m16093b = C6008t1.m16093b(i13);
            if (m16093b == 0) {
                m15724W = AbstractC5979k.m15724W(m16092a, ((Long) this.f12692c[i12]).longValue());
            } else if (m16093b == 1) {
                m15724W = AbstractC5979k.m15742o(m16092a, ((Long) this.f12692c[i12]).longValue());
            } else if (m16093b == 2) {
                m15724W = AbstractC5979k.m15734g(m16092a, (AbstractC5970h) this.f12692c[i12]);
            } else if (m16093b == 3) {
                m15724W = (AbstractC5979k.m15721T(m16092a) * 2) + ((C5993o1) this.f12692c[i12]).m15924d();
            } else {
                if (m16093b != 5) {
                    throw new IllegalStateException(C5953b0.m15326e());
                }
                m15724W = AbstractC5979k.m15740m(m16092a, ((Integer) this.f12692c[i12]).intValue());
            }
            i11 += m15724W;
        }
        this.f12693d = i11;
        return i11;
    }

    /* renamed from: e */
    public int m15925e() {
        int i10 = this.f12693d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12690a; i12++) {
            i11 += AbstractC5979k.m15710I(C6008t1.m16092a(this.f12691b[i12]), (AbstractC5970h) this.f12692c[i12]);
        }
        this.f12693d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5993o1)) {
            return false;
        }
        C5993o1 c5993o1 = (C5993o1) obj;
        int i10 = this.f12690a;
        return i10 == c5993o1.f12690a && m15921o(this.f12691b, c5993o1.f12691b, i10) && m15920l(this.f12692c, c5993o1.f12692c, this.f12690a);
    }

    /* renamed from: h */
    public void m15926h() {
        this.f12694e = false;
    }

    public int hashCode() {
        int i10 = this.f12690a;
        return ((((527 + i10) * 31) + m15916f(this.f12691b, i10)) * 31) + m15917g(this.f12692c, this.f12690a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C5993o1 m15927i(C5993o1 c5993o1) {
        if (c5993o1.equals(m15915c())) {
            return this;
        }
        m15923a();
        int i10 = this.f12690a + c5993o1.f12690a;
        m15914b(i10);
        System.arraycopy(c5993o1.f12691b, 0, this.f12691b, this.f12690a, c5993o1.f12690a);
        System.arraycopy(c5993o1.f12692c, 0, this.f12692c, this.f12690a, c5993o1.f12690a);
        this.f12690a = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m15928m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f12690a; i11++) {
            C6007t0.m16089d(sb2, i10, String.valueOf(C6008t1.m16092a(this.f12691b[i11])), this.f12692c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m15929n(int i10, Object obj) {
        m15923a();
        m15914b(this.f12690a + 1);
        int[] iArr = this.f12691b;
        int i11 = this.f12690a;
        iArr[i11] = i10;
        this.f12692c[i11] = obj;
        this.f12690a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m15930p(InterfaceC6011u1 interfaceC6011u1) {
        if (interfaceC6011u1.mo15843t() == InterfaceC6011u1.a.DESCENDING) {
            for (int i10 = this.f12690a - 1; i10 >= 0; i10--) {
                interfaceC6011u1.mo15825b(C6008t1.m16092a(this.f12691b[i10]), this.f12692c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f12690a; i11++) {
            interfaceC6011u1.mo15825b(C6008t1.m16092a(this.f12691b[i11]), this.f12692c[i11]);
        }
    }

    /* renamed from: r */
    public void m15931r(InterfaceC6011u1 interfaceC6011u1) {
        if (this.f12690a == 0) {
            return;
        }
        if (interfaceC6011u1.mo15843t() == InterfaceC6011u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f12690a; i10++) {
                m15922q(this.f12691b[i10], this.f12692c[i10], interfaceC6011u1);
            }
            return;
        }
        for (int i11 = this.f12690a - 1; i11 >= 0; i11--) {
            m15922q(this.f12691b[i11], this.f12692c[i11], interfaceC6011u1);
        }
    }
}
