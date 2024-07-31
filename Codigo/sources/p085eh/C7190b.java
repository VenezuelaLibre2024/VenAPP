package p085eh;

import java.util.ArrayList;
import java.util.List;
import kg.C9264b;
import p066dg.C6952m;
import p066dg.InterfaceC6959t;

/* renamed from: eh.b */
/* loaded from: classes2.dex */
final class C7190b {

    /* renamed from: a */
    private final C9264b f16085a;

    /* renamed from: c */
    private final int f16087c;

    /* renamed from: d */
    private final int f16088d;

    /* renamed from: e */
    private final int f16089e;

    /* renamed from: f */
    private final int f16090f;

    /* renamed from: g */
    private final float f16091g;

    /* renamed from: i */
    private final InterfaceC6959t f16093i;

    /* renamed from: b */
    private final List<C7189a> f16086b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f16092h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7190b(C9264b c9264b, int i10, int i11, int i12, int i13, float f10, InterfaceC6959t interfaceC6959t) {
        this.f16085a = c9264b;
        this.f16087c = i10;
        this.f16088d = i11;
        this.f16089e = i12;
        this.f16090f = i13;
        this.f16091g = f10;
        this.f16093i = interfaceC6959t;
    }

    /* renamed from: a */
    private static float m21401a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    private float m21402b(int i10, int i11, int i12, int i13) {
        C9264b c9264b = this.f16085a;
        int m27606j = c9264b.m27606j();
        int[] iArr = this.f16092h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && c9264b.m27603g(i11, i14)) {
            int i15 = iArr[1];
            if (i15 > i12) {
                break;
            }
            iArr[1] = i15 + 1;
            i14--;
        }
        if (i14 < 0 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i14 >= 0 && !c9264b.m27603g(i11, i14)) {
            int i16 = iArr[0];
            if (i16 > i12) {
                break;
            }
            iArr[0] = i16 + 1;
            i14--;
        }
        if (iArr[0] > i12) {
            return Float.NaN;
        }
        int i17 = i10 + 1;
        while (i17 < m27606j && c9264b.m27603g(i11, i17)) {
            int i18 = iArr[1];
            if (i18 > i12) {
                break;
            }
            iArr[1] = i18 + 1;
            i17++;
        }
        if (i17 == m27606j || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i17 < m27606j && !c9264b.m27603g(i11, i17)) {
            int i19 = iArr[2];
            if (i19 > i12) {
                break;
            }
            iArr[2] = i19 + 1;
            i17++;
        }
        int i20 = iArr[2];
        if (i20 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i20) - i13) * 5 < i13 * 2 && m21403d(iArr)) {
            return m21401a(iArr, i17);
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m21403d(int[] iArr) {
        float f10 = this.f16091g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C7189a m21404e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float m21401a = m21401a(iArr, i11);
        float m21402b = m21402b(i10, (int) m21401a, iArr[1] * 2, i12);
        if (Float.isNaN(m21402b)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C7189a c7189a : this.f16086b) {
            if (c7189a.m21399f(f10, m21402b, m21401a)) {
                return c7189a.m21400g(m21402b, m21401a, f10);
            }
        }
        C7189a c7189a2 = new C7189a(m21401a, m21402b, f10);
        this.f16086b.add(c7189a2);
        InterfaceC6959t interfaceC6959t = this.f16093i;
        if (interfaceC6959t == null) {
            return null;
        }
        interfaceC6959t.mo20121a(c7189a2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C7189a m21405c() {
        C7189a m21404e;
        C7189a m21404e2;
        int i10 = this.f16087c;
        int i11 = this.f16090f;
        int i12 = this.f16089e + i10;
        int i13 = this.f16088d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f16085a.m27603g(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f16085a.m27603g(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else {
                    if (m21403d(iArr) && (m21404e2 = m21404e(iArr, i15, i16)) != null) {
                        return m21404e2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (m21403d(iArr) && (m21404e = m21404e(iArr, i15, i12)) != null) {
                return m21404e;
            }
        }
        if (this.f16086b.isEmpty()) {
            throw C6952m.m20106a();
        }
        return this.f16086b.get(0);
    }
}
