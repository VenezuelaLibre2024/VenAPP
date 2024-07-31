package tg;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class r implements dg.o {
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: p -> 0x00cc, TRY_LEAVE, TryCatch #3 {p -> 0x00cc, blocks: (B:34:0x0076, B:36:0x007c), top: B:33:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private dg.q d(dg.c r22, java.util.Map<dg.e, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.r.d(dg.c, java.util.Map):dg.q");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static float e(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(kg.a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int l10 = aVar.l();
        if (i10 >= l10) {
            throw dg.m.a();
        }
        boolean z10 = !aVar.h(i10);
        while (i10 < l10) {
            if (aVar.h(i10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != l10) {
                throw dg.m.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void g(kg.a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        boolean h10 = aVar.h(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.h(i10) != h10) {
                length--;
                h10 = !h10;
            }
        }
        if (length >= 0) {
            throw dg.m.a();
        }
        f(aVar, i10 + 1, iArr);
    }

    @Override // dg.o
    public dg.q a(dg.c cVar) {
        return b(cVar, null);
    }

    @Override // dg.o
    public dg.q b(dg.c cVar, Map<dg.e, ?> map) {
        try {
            return d(cVar, map);
        } catch (dg.m e10) {
            if (!(map != null && map.containsKey(dg.e.TRY_HARDER)) || !cVar.e()) {
                throw e10;
            }
            dg.c f10 = cVar.f();
            dg.q d10 = d(f10, map);
            Map<dg.r, Object> d11 = d10.d();
            int i10 = 270;
            if (d11 != null) {
                dg.r rVar = dg.r.ORIENTATION;
                if (d11.containsKey(rVar)) {
                    i10 = (((Integer) d11.get(rVar)).intValue() + 270) % 360;
                }
            }
            d10.h(dg.r.ORIENTATION, Integer.valueOf(i10));
            dg.s[] e11 = d10.e();
            if (e11 != null) {
                int c10 = f10.c();
                for (int i11 = 0; i11 < e11.length; i11++) {
                    e11[i11] = new dg.s((c10 - e11[i11].d()) - 1.0f, e11[i11].c());
                }
            }
            return d10;
        }
    }

    public abstract dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map);

    @Override // dg.o
    public void reset() {
    }
}
