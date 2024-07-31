package ng;

import dg.u;
import qg.e;
import qg.l;

/* loaded from: classes2.dex */
public final class b implements u {
    private static kg.b b(fh.b bVar, int i10, int i11) {
        kg.b bVar2;
        int e10 = bVar.e();
        int d10 = bVar.d();
        int max = Math.max(i10, e10);
        int max2 = Math.max(i11, d10);
        int min = Math.min(max / e10, max2 / d10);
        int i12 = (max - (e10 * min)) / 2;
        int i13 = (max2 - (d10 * min)) / 2;
        if (i11 < d10 || i10 < e10) {
            bVar2 = new kg.b(e10, d10);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new kg.b(i10, i11);
        }
        bVar2.b();
        int i14 = 0;
        while (i14 < d10) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < e10) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.s(i15, i13, min, min);
                }
                i16++;
                i15 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar2;
    }

    private static kg.b c(e eVar, l lVar, int i10, int i11) {
        int h10 = lVar.h();
        int g10 = lVar.g();
        fh.b bVar = new fh.b(lVar.j(), lVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < g10; i13++) {
            if (i13 % lVar.f24018e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < lVar.j(); i15++) {
                    bVar.g(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < h10; i17++) {
                if (i17 % lVar.f24017d == 0) {
                    bVar.g(i16, i12, true);
                    i16++;
                }
                bVar.g(i16, i12, eVar.e(i17, i13));
                i16++;
                int i18 = lVar.f24017d;
                if (i17 % i18 == i18 - 1) {
                    bVar.g(i16, i12, i13 % 2 == 0);
                    i16++;
                }
            }
            i12++;
            int i19 = lVar.f24018e;
            if (i13 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < lVar.j(); i21++) {
                    bVar.g(i20, i12, true);
                    i20++;
                }
                i12++;
            }
        }
        return b(bVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // dg.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kg.b a(java.lang.String r8, dg.a r9, int r10, int r11, java.util.Map<dg.g, ?> r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.b.a(java.lang.String, dg.a, int, int, java.util.Map):kg.b");
    }
}
