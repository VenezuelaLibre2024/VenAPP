package p067dh;

import kg.C9264b;
import p066dg.C6947h;

/* renamed from: dh.a */
/* loaded from: classes2.dex */
final class C6962a {

    /* renamed from: a */
    private final C9264b f15511a;

    /* renamed from: b */
    private C6971j f15512b;

    /* renamed from: c */
    private C6968g f15513c;

    /* renamed from: d */
    private boolean f15514d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6962a(C9264b c9264b) {
        int m27606j = c9264b.m27606j();
        if (m27606j < 21 || (m27606j & 3) != 1) {
            throw C6947h.m20094a();
        }
        this.f15511a = c9264b;
    }

    /* renamed from: a */
    private int m20122a(int i10, int i11, int i12) {
        return this.f15514d ? this.f15511a.m27603g(i11, i10) : this.f15511a.m27603g(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m20123b() {
        int i10 = 0;
        while (i10 < this.f15511a.m27609m()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f15511a.m27606j(); i12++) {
                if (this.f15511a.m27603g(i10, i12) != this.f15511a.m27603g(i12, i10)) {
                    this.f15511a.m27602e(i12, i10);
                    this.f15511a.m27602e(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m20124c() {
        C6968g m20125d = m20125d();
        C6971j m20126e = m20126e();
        EnumC6964c enumC6964c = EnumC6964c.values()[m20125d.m20150c()];
        int m27606j = this.f15511a.m27606j();
        enumC6964c.m20133h(this.f15511a, m27606j);
        C9264b m20160a = m20126e.m20160a();
        byte[] bArr = new byte[m20126e.m20164h()];
        int i10 = m27606j - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < m27606j; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!m20160a.m27603g(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f15511a.m27603g(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == m20126e.m20164h()) {
            return bArr;
        }
        throw C6947h.m20094a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C6968g m20125d() {
        C6968g c6968g = this.f15513c;
        if (c6968g != null) {
            return c6968g;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = m20122a(i12, 8, i11);
        }
        int m20122a = m20122a(8, 7, m20122a(8, 8, m20122a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            m20122a = m20122a(8, i13, m20122a);
        }
        int m27606j = this.f15511a.m27606j();
        int i14 = m27606j - 7;
        for (int i15 = m27606j - 1; i15 >= i14; i15--) {
            i10 = m20122a(8, i15, i10);
        }
        for (int i16 = m27606j - 8; i16 < m27606j; i16++) {
            i10 = m20122a(i16, 8, i10);
        }
        C6968g m20147a = C6968g.m20147a(m20122a, i10);
        this.f15513c = m20147a;
        if (m20147a != null) {
            return m20147a;
        }
        throw C6947h.m20094a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C6971j m20126e() {
        C6971j c6971j = this.f15512b;
        if (c6971j != null) {
            return c6971j;
        }
        int m27606j = this.f15511a.m27606j();
        int i10 = (m27606j - 17) / 4;
        if (i10 <= 6) {
            return C6971j.m20159i(i10);
        }
        int i11 = m27606j - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = m27606j - 9; i15 >= i11; i15--) {
                i13 = m20122a(i15, i14, i13);
            }
        }
        C6971j m20157c = C6971j.m20157c(i13);
        if (m20157c != null && m20157c.m20162e() == m27606j) {
            this.f15512b = m20157c;
            return m20157c;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = m27606j - 9; i17 >= i11; i17--) {
                i12 = m20122a(i16, i17, i12);
            }
        }
        C6971j m20157c2 = C6971j.m20157c(i12);
        if (m20157c2 == null || m20157c2.m20162e() != m27606j) {
            throw C6947h.m20094a();
        }
        this.f15512b = m20157c2;
        return m20157c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m20127f() {
        if (this.f15513c == null) {
            return;
        }
        EnumC6964c.values()[this.f15513c.m20150c()].m20133h(this.f15511a, this.f15511a.m27606j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m20128g(boolean z10) {
        this.f15512b = null;
        this.f15513c = null;
        this.f15514d = z10;
    }
}
