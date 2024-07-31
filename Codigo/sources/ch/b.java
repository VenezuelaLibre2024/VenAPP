package ch;

import dg.u;
import dh.f;
import fh.c;
import fh.g;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements u {
    private static kg.b b(g gVar, int i10, int i11, int i12) {
        fh.b a10 = gVar.a();
        if (a10 == null) {
            throw new IllegalStateException();
        }
        int e10 = a10.e();
        int d10 = a10.d();
        int i13 = i12 * 2;
        int i14 = e10 + i13;
        int i15 = i13 + d10;
        int max = Math.max(i10, i14);
        int max2 = Math.max(i11, i15);
        int min = Math.min(max / i14, max2 / i15);
        int i16 = (max - (e10 * min)) / 2;
        int i17 = (max2 - (d10 * min)) / 2;
        kg.b bVar = new kg.b(max, max2);
        int i18 = 0;
        while (i18 < d10) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < e10) {
                if (a10.b(i19, i18) == 1) {
                    bVar.s(i20, i17, min, min);
                }
                i19++;
                i20 += min;
            }
            i18++;
            i17 += min;
        }
        return bVar;
    }

    @Override // dg.u
    public kg.b a(String str, dg.a aVar, int i10, int i11, Map<dg.g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != dg.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        f fVar = f.L;
        int i12 = 4;
        if (map != null) {
            dg.g gVar = dg.g.ERROR_CORRECTION;
            if (map.containsKey(gVar)) {
                fVar = f.valueOf(map.get(gVar).toString());
            }
            dg.g gVar2 = dg.g.MARGIN;
            if (map.containsKey(gVar2)) {
                i12 = Integer.parseInt(map.get(gVar2).toString());
            }
        }
        return b(c.n(str, fVar, map), i10, i11, i12);
    }
}
