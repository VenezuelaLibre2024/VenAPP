package kg;

import p066dg.AbstractC6941b;
import p066dg.AbstractC6949j;
import p066dg.C6952m;

/* renamed from: kg.k */
/* loaded from: classes2.dex */
public class C9273k extends AbstractC6941b {

    /* renamed from: d */
    private static final byte[] f22509d = new byte[0];

    /* renamed from: b */
    private byte[] f22510b;

    /* renamed from: c */
    private final int[] f22511c;

    public C9273k(AbstractC6949j abstractC6949j) {
        super(abstractC6949j);
        this.f22510b = f22509d;
        this.f22511c = new int[32];
    }

    /* renamed from: g */
    private static int m27659g(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 <= length / 16) {
            throw C6952m.m20106a();
        }
        int i21 = i12 - 1;
        int i22 = -1;
        int i23 = i21;
        while (i21 > i15) {
            int i24 = i21 - i15;
            int i25 = i24 * i24 * (i12 - i21) * (i11 - iArr[i21]);
            if (i25 > i22) {
                i23 = i21;
                i22 = i25;
            }
            i21--;
        }
        return i23 << 3;
    }

    /* renamed from: h */
    private void m27660h(int i10) {
        if (this.f22510b.length < i10) {
            this.f22510b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f22511c[i11] = 0;
        }
    }

    @Override // p066dg.AbstractC6941b
    /* renamed from: b */
    public C9264b mo20079b() {
        AbstractC6949j m20082e = m20082e();
        int m20102d = m20082e.m20102d();
        int m20101a = m20082e.m20101a();
        C9264b c9264b = new C9264b(m20102d, m20101a);
        m27660h(m20102d);
        int[] iArr = this.f22511c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] mo20097c = m20082e.mo20097c((m20101a * i10) / 5, this.f22510b);
            int i11 = (m20102d * 4) / 5;
            for (int i12 = m20102d / 5; i12 < i11; i12++) {
                int i13 = (mo20097c[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int m27659g = m27659g(iArr);
        byte[] mo20096b = m20082e.mo20096b();
        for (int i14 = 0; i14 < m20101a; i14++) {
            int i15 = i14 * m20102d;
            for (int i16 = 0; i16 < m20102d; i16++) {
                if ((mo20096b[i15 + i16] & 255) < m27659g) {
                    c9264b.m27612r(i16, i14);
                }
            }
        }
        return c9264b;
    }

    @Override // p066dg.AbstractC6941b
    /* renamed from: c */
    public C9263a mo20080c(int i10, C9263a c9263a) {
        AbstractC6949j m20082e = m20082e();
        int m20102d = m20082e.m20102d();
        if (c9263a == null || c9263a.m27590l() < m20102d) {
            c9263a = new C9263a(m20102d);
        } else {
            c9263a.m27584d();
        }
        m27660h(m20102d);
        byte[] mo20097c = m20082e.mo20097c(i10, this.f22510b);
        int[] iArr = this.f22511c;
        for (int i11 = 0; i11 < m20102d; i11++) {
            int i12 = (mo20097c[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int m27659g = m27659g(iArr);
        if (m20102d < 3) {
            for (int i13 = 0; i13 < m20102d; i13++) {
                if ((mo20097c[i13] & 255) < m27659g) {
                    c9263a.m27594s(i13);
                }
            }
        } else {
            int i14 = 1;
            int i15 = mo20097c[0] & 255;
            int i16 = mo20097c[1] & 255;
            while (i14 < m20102d - 1) {
                int i17 = i14 + 1;
                int i18 = mo20097c[i17] & 255;
                if ((((i16 * 4) - i15) - i18) / 2 < m27659g) {
                    c9263a.m27594s(i14);
                }
                i15 = i16;
                i14 = i17;
                i16 = i18;
            }
        }
        return c9263a;
    }
}
