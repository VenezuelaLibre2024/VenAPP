package eg;

import dg.g;
import dg.u;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements u {
    private static kg.b b(String str, dg.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == dg.a.AZTEC) {
            return c(hg.c.d(str, i12, i13, charset), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
    }

    private static kg.b c(hg.a aVar, int i10, int i11) {
        kg.b a10 = aVar.a();
        if (a10 == null) {
            throw new IllegalStateException();
        }
        int m10 = a10.m();
        int j10 = a10.j();
        int max = Math.max(i10, m10);
        int max2 = Math.max(i11, j10);
        int min = Math.min(max / m10, max2 / j10);
        int i12 = (max - (m10 * min)) / 2;
        int i13 = (max2 - (j10 * min)) / 2;
        kg.b bVar = new kg.b(max, max2);
        int i14 = 0;
        while (i14 < j10) {
            int i15 = 0;
            int i16 = i12;
            while (i15 < m10) {
                if (a10.g(i15, i14)) {
                    bVar.s(i16, i13, min, min);
                }
                i15++;
                i16 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar;
    }

    @Override // dg.u
    public kg.b a(String str, dg.a aVar, int i10, int i11, Map<g, ?> map) {
        int i12 = 0;
        if (map != null) {
            g gVar = g.CHARACTER_SET;
            r0 = map.containsKey(gVar) ? Charset.forName(map.get(gVar).toString()) : null;
            g gVar2 = g.ERROR_CORRECTION;
            r1 = map.containsKey(gVar2) ? Integer.parseInt(map.get(gVar2).toString()) : 33;
            g gVar3 = g.AZTEC_LAYERS;
            if (map.containsKey(gVar3)) {
                i12 = Integer.parseInt(map.get(gVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, r0, r1, i12);
    }
}
