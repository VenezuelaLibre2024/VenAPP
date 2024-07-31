package ch;

import dg.c;
import dg.m;
import dg.o;
import dg.q;
import dg.r;
import dg.s;
import dh.e;
import dh.i;
import java.util.List;
import java.util.Map;
import kg.g;

/* loaded from: classes2.dex */
public class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f7108b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final e f7109a = new e();

    private static kg.b c(kg.b bVar) {
        int[] l10 = bVar.l();
        int[] h10 = bVar.h();
        if (l10 == null || h10 == null) {
            throw m.a();
        }
        float d10 = d(l10, bVar);
        int i10 = l10[1];
        int i11 = h10[1];
        int i12 = l10[0];
        int i13 = h10[0];
        if (i12 >= i13 || i10 >= i11) {
            throw m.a();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= bVar.m()) {
            throw m.a();
        }
        int round = Math.round(((i13 - i12) + 1) / d10);
        int round2 = Math.round((i14 + 1) / d10);
        if (round <= 0 || round2 <= 0) {
            throw m.a();
        }
        if (round2 != round) {
            throw m.a();
        }
        int i15 = (int) (d10 / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((round - 1) * d10)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw m.a();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((round2 - 1) * d10)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw m.a();
            }
            i16 -= i19;
        }
        kg.b bVar2 = new kg.b(round, round2);
        for (int i20 = 0; i20 < round2; i20++) {
            int i21 = ((int) (i20 * d10)) + i16;
            for (int i22 = 0; i22 < round; i22++) {
                if (bVar.g(((int) (i22 * d10)) + i17, i21)) {
                    bVar2.r(i22, i20);
                }
            }
        }
        return bVar2;
    }

    private static float d(int[] iArr, kg.b bVar) {
        int j10 = bVar.j();
        int m10 = bVar.m();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < m10 && i11 < j10) {
            if (z10 != bVar.g(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 == m10 || i11 == j10) {
            throw m.a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // dg.o
    public q a(c cVar) {
        return b(cVar, null);
    }

    @Override // dg.o
    public final q b(c cVar, Map<dg.e, ?> map) {
        s[] b10;
        kg.e eVar;
        if (map == null || !map.containsKey(dg.e.PURE_BARCODE)) {
            g e10 = new eh.c(cVar.a()).e(map);
            kg.e c10 = this.f7109a.c(e10.a(), map);
            b10 = e10.b();
            eVar = c10;
        } else {
            eVar = this.f7109a.c(c(cVar.a()), map);
            b10 = f7108b;
        }
        if (eVar.d() instanceof i) {
            ((i) eVar.d()).a(b10);
        }
        q qVar = new q(eVar.i(), eVar.e(), b10, dg.a.QR_CODE);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            qVar.h(r.BYTE_SEGMENTS, a10);
        }
        String b11 = eVar.b();
        if (b11 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b11);
        }
        if (eVar.j()) {
            qVar.h(r.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.g()));
            qVar.h(r.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.f()));
        }
        qVar.h(r.SYMBOLOGY_IDENTIFIER, "]Q" + eVar.h());
        return qVar;
    }

    @Override // dg.o
    public void reset() {
    }
}
