package mg;

/* renamed from: mg.c */
/* loaded from: classes2.dex */
public final class C9582c {

    /* renamed from: a */
    private final C9580a f23357a;

    public C9582c(C9580a c9580a) {
        this.f23357a = c9580a;
    }

    /* renamed from: b */
    private int[] m28551b(C9581b c9581b) {
        int m28546f = c9581b.m28546f();
        int i10 = 0;
        if (m28546f == 1) {
            return new int[]{c9581b.m28544d(1)};
        }
        int[] iArr = new int[m28546f];
        for (int i11 = 1; i11 < this.f23357a.m28536f() && i10 < m28546f; i11++) {
            if (c9581b.m28543c(i11) == 0) {
                iArr[i10] = this.f23357a.m28538h(i11);
                i10++;
            }
        }
        if (i10 == m28546f) {
            return iArr;
        }
        throw new C9584e("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m28552c(C9581b c9581b, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int m28538h = this.f23357a.m28538h(iArr[i10]);
            int i11 = 1;
            for (int i12 = 0; i12 < length; i12++) {
                if (i10 != i12) {
                    int m28540j = this.f23357a.m28540j(iArr[i12], m28538h);
                    i11 = this.f23357a.m28540j(i11, (m28540j & 1) == 0 ? m28540j | 1 : m28540j & (-2));
                }
            }
            iArr2[i10] = this.f23357a.m28540j(c9581b.m28543c(m28538h), this.f23357a.m28538h(i11));
            if (this.f23357a.m28534d() != 0) {
                iArr2[i10] = this.f23357a.m28540j(iArr2[i10], m28538h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C9581b[] m28553d(C9581b c9581b, C9581b c9581b2, int i10) {
        if (c9581b.m28546f() < c9581b2.m28546f()) {
            c9581b2 = c9581b;
            c9581b = c9581b2;
        }
        C9581b m28537g = this.f23357a.m28537g();
        C9581b m28535e = this.f23357a.m28535e();
        do {
            C9581b c9581b3 = c9581b2;
            c9581b2 = c9581b;
            c9581b = c9581b3;
            C9581b c9581b4 = m28535e;
            C9581b c9581b5 = m28537g;
            m28537g = c9581b4;
            if (c9581b.m28546f() * 2 < i10) {
                int m28544d = m28537g.m28544d(0);
                if (m28544d == 0) {
                    throw new C9584e("sigmaTilde(0) was zero");
                }
                int m28538h = this.f23357a.m28538h(m28544d);
                return new C9581b[]{m28537g.m28548h(m28538h), c9581b.m28548h(m28538h)};
            }
            if (c9581b.m28547g()) {
                throw new C9584e("r_{i-1} was zero");
            }
            C9581b m28537g2 = this.f23357a.m28537g();
            int m28538h2 = this.f23357a.m28538h(c9581b.m28544d(c9581b.m28546f()));
            while (c9581b2.m28546f() >= c9581b.m28546f() && !c9581b2.m28547g()) {
                int m28546f = c9581b2.m28546f() - c9581b.m28546f();
                int m28540j = this.f23357a.m28540j(c9581b2.m28544d(c9581b2.m28546f()), m28538h2);
                m28537g2 = m28537g2.m28541a(this.f23357a.m28532b(m28546f, m28540j));
                c9581b2 = c9581b2.m28541a(c9581b.m28550j(m28546f, m28540j));
            }
            m28535e = m28537g2.m28549i(m28537g).m28541a(c9581b5);
        } while (c9581b2.m28546f() < c9581b.m28546f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + c9581b2 + ", rLast: " + c9581b);
    }

    /* renamed from: a */
    public void m28554a(int[] iArr, int i10) {
        C9581b c9581b = new C9581b(this.f23357a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            C9580a c9580a = this.f23357a;
            int m28543c = c9581b.m28543c(c9580a.m28533c(c9580a.m28534d() + i11));
            iArr2[(i10 - 1) - i11] = m28543c;
            if (m28543c != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        C9581b[] m28553d = m28553d(this.f23357a.m28532b(i10, 1), new C9581b(this.f23357a, iArr2), i10);
        C9581b c9581b2 = m28553d[0];
        C9581b c9581b3 = m28553d[1];
        int[] m28551b = m28551b(c9581b2);
        int[] m28552c = m28552c(c9581b3, m28551b);
        for (int i12 = 0; i12 < m28551b.length; i12++) {
            int length = (iArr.length - 1) - this.f23357a.m28539i(m28551b[i12]);
            if (length < 0) {
                throw new C9584e("Bad error location");
            }
            iArr[length] = C9580a.m28531a(iArr[length], m28552c[i12]);
        }
    }
}
