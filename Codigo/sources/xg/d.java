package xg;

import bh.e;
import dg.g;
import dg.u;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d implements u {
    private static kg.b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        kg.b bVar = new kg.b(bArr[0].length + i11, bArr.length + i11);
        bVar.b();
        int j10 = (bVar.j() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.r(i13 + i10, j10);
                }
            }
            i12++;
            j10--;
        }
        return bVar;
    }

    private static kg.b c(e eVar, String str, int i10, int i11, int i12, int i13, boolean z10) {
        boolean z11;
        eVar.e(str, i10, z10);
        byte[][] b10 = eVar.f().b(1, 4);
        if ((i12 > i11) != (b10[0].length < b10.length)) {
            b10 = d(b10);
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(i11 / b10[0].length, i12 / b10.length);
        if (min <= 1) {
            return b(b10, i13);
        }
        byte[][] b11 = eVar.f().b(min, min * 4);
        if (z11) {
            b11 = d(b11);
        }
        return b(b11, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // dg.u
    public kg.b a(String str, dg.a aVar, int i10, int i11, Map<g, ?> map) {
        if (aVar != dg.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
        }
        e eVar = new e();
        boolean z10 = false;
        if (map != null) {
            g gVar = g.PDF417_COMPACT;
            if (map.containsKey(gVar)) {
                eVar.h(Boolean.parseBoolean(map.get(gVar).toString()));
            }
            g gVar2 = g.PDF417_COMPACTION;
            if (map.containsKey(gVar2)) {
                eVar.i(bh.c.valueOf(map.get(gVar2).toString()));
            }
            g gVar3 = g.PDF417_DIMENSIONS;
            if (map.containsKey(gVar3)) {
                bh.d dVar = (bh.d) map.get(gVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            g gVar4 = g.MARGIN;
            r0 = map.containsKey(gVar4) ? Integer.parseInt(map.get(gVar4).toString()) : 30;
            g gVar5 = g.ERROR_CORRECTION;
            r2 = map.containsKey(gVar5) ? Integer.parseInt(map.get(gVar5).toString()) : 2;
            g gVar6 = g.CHARACTER_SET;
            if (map.containsKey(gVar6)) {
                eVar.k(Charset.forName(map.get(gVar6).toString()));
            }
            g gVar7 = g.PDF417_AUTO_ECI;
            if (map.containsKey(gVar7) && Boolean.parseBoolean(map.get(gVar7).toString())) {
                z10 = true;
            }
        }
        return c(eVar, str, r2, i10, i11, r0, z10);
    }
}
