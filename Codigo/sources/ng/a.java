package ng;

import dg.c;
import dg.e;
import dg.m;
import dg.o;
import dg.q;
import dg.r;
import dg.s;
import java.util.List;
import java.util.Map;
import kg.g;
import og.d;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f21971b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final d f21972a = new d();

    private static kg.b c(kg.b bVar) {
        int[] l10 = bVar.l();
        int[] h10 = bVar.h();
        if (l10 == null || h10 == null) {
            throw m.a();
        }
        int d10 = d(l10, bVar);
        int i10 = l10[1];
        int i11 = h10[1];
        int i12 = l10[0];
        int i13 = ((h10[0] - i12) + 1) / d10;
        int i14 = ((i11 - i10) + 1) / d10;
        if (i13 <= 0 || i14 <= 0) {
            throw m.a();
        }
        int i15 = d10 / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        kg.b bVar2 = new kg.b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * d10) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (bVar.g((i20 * d10) + i17, i19)) {
                    bVar2.r(i20, i18);
                }
            }
        }
        return bVar2;
    }

    private static int d(int[] iArr, kg.b bVar) {
        int m10 = bVar.m();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < m10 && bVar.g(i10, i11)) {
            i10++;
        }
        if (i10 == m10) {
            throw m.a();
        }
        int i12 = i10 - iArr[0];
        if (i12 != 0) {
            return i12;
        }
        throw m.a();
    }

    @Override // dg.o
    public q a(c cVar) {
        return b(cVar, null);
    }

    @Override // dg.o
    public q b(c cVar, Map<e, ?> map) {
        s[] b10;
        kg.e eVar;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g b11 = new pg.a(cVar.a()).b();
            kg.e b12 = this.f21972a.b(b11.a());
            b10 = b11.b();
            eVar = b12;
        } else {
            eVar = this.f21972a.b(c(cVar.a()));
            b10 = f21971b;
        }
        q qVar = new q(eVar.i(), eVar.e(), b10, dg.a.DATA_MATRIX);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            qVar.h(r.BYTE_SEGMENTS, a10);
        }
        String b13 = eVar.b();
        if (b13 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b13);
        }
        qVar.h(r.SYMBOLOGY_IDENTIFIER, "]d" + eVar.h());
        return qVar;
    }

    @Override // dg.o
    public void reset() {
    }
}
