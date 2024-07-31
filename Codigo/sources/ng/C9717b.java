package ng;

import kg.C9264b;
import p066dg.InterfaceC6960u;
import p109fh.C7350b;
import p314qg.C10480e;
import p314qg.C10487l;

/* renamed from: ng.b */
/* loaded from: classes2.dex */
public final class C9717b implements InterfaceC6960u {
    /* renamed from: b */
    private static C9264b m29145b(C7350b c7350b, int i10, int i11) {
        C9264b c9264b;
        int m22096e = c7350b.m22096e();
        int m22095d = c7350b.m22095d();
        int max = Math.max(i10, m22096e);
        int max2 = Math.max(i11, m22095d);
        int min = Math.min(max / m22096e, max2 / m22095d);
        int i12 = (max - (m22096e * min)) / 2;
        int i13 = (max2 - (m22095d * min)) / 2;
        if (i11 < m22095d || i10 < m22096e) {
            c9264b = new C9264b(m22096e, m22095d);
            i12 = 0;
            i13 = 0;
        } else {
            c9264b = new C9264b(i10, i11);
        }
        c9264b.m27599b();
        int i14 = 0;
        while (i14 < m22095d) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < m22096e) {
                if (c7350b.m22093b(i16, i14) == 1) {
                    c9264b.m27613s(i15, i13, min, min);
                }
                i16++;
                i15 += min;
            }
            i14++;
            i13 += min;
        }
        return c9264b;
    }

    /* renamed from: c */
    private static C9264b m29146c(C10480e c10480e, C10487l c10487l, int i10, int i11) {
        int m31541h = c10487l.m31541h();
        int m31540g = c10487l.m31540g();
        C7350b c7350b = new C7350b(c10487l.m31543j(), c10487l.m31542i());
        int i12 = 0;
        for (int i13 = 0; i13 < m31540g; i13++) {
            if (i13 % c10487l.f26060e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < c10487l.m31543j(); i15++) {
                    c7350b.m22098g(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < m31541h; i17++) {
                if (i17 % c10487l.f26059d == 0) {
                    c7350b.m22098g(i16, i12, true);
                    i16++;
                }
                c7350b.m22098g(i16, i12, c10480e.m31441e(i17, i13));
                i16++;
                int i18 = c10487l.f26059d;
                if (i17 % i18 == i18 - 1) {
                    c7350b.m22098g(i16, i12, i13 % 2 == 0);
                    i16++;
                }
            }
            i12++;
            int i19 = c10487l.f26060e;
            if (i13 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < c10487l.m31543j(); i21++) {
                    c7350b.m22098g(i20, i12, true);
                    i20++;
                }
                i12++;
            }
        }
        return m29145b(c7350b, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kg.C9264b mo10303a(java.lang.String r8, p066dg.EnumC6940a r9, int r10, int r11, java.util.Map<p066dg.EnumC6946g, ?> r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C9717b.mo10303a(java.lang.String, dg.a, int, int, java.util.Map):kg.b");
    }
}
