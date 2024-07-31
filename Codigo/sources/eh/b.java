package eh;

import dg.m;
import dg.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final kg.b f14662a;

    /* renamed from: c, reason: collision with root package name */
    private final int f14664c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14665d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14666e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14667f;

    /* renamed from: g, reason: collision with root package name */
    private final float f14668g;

    /* renamed from: i, reason: collision with root package name */
    private final t f14670i;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f14663b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f14669h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(kg.b bVar, int i10, int i11, int i12, int i13, float f10, t tVar) {
        this.f14662a = bVar;
        this.f14664c = i10;
        this.f14665d = i11;
        this.f14666e = i12;
        this.f14667f = i13;
        this.f14668g = f10;
        this.f14670i = tVar;
    }

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float b(int i10, int i11, int i12, int i13) {
        kg.b bVar = this.f14662a;
        int j10 = bVar.j();
        int[] iArr = this.f14669h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && bVar.g(i11, i14)) {
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
        while (i14 >= 0 && !bVar.g(i11, i14)) {
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
        while (i17 < j10 && bVar.g(i11, i17)) {
            int i18 = iArr[1];
            if (i18 > i12) {
                break;
            }
            iArr[1] = i18 + 1;
            i17++;
        }
        if (i17 == j10 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i17 < j10 && !bVar.g(i11, i17)) {
            int i19 = iArr[2];
            if (i19 > i12) {
                break;
            }
            iArr[2] = i19 + 1;
            i17++;
        }
        int i20 = iArr[2];
        if (i20 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i20) - i13) * 5 < i13 * 2 && d(iArr)) {
            return a(iArr, i17);
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f10 = this.f14668g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float a10 = a(iArr, i11);
        float b10 = b(i10, (int) a10, iArr[1] * 2, i12);
        if (Float.isNaN(b10)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f14663b) {
            if (aVar.f(f10, b10, a10)) {
                return aVar.g(b10, a10, f10);
            }
        }
        a aVar2 = new a(a10, b10, f10);
        this.f14663b.add(aVar2);
        t tVar = this.f14670i;
        if (tVar == null) {
            return null;
        }
        tVar.a(aVar2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c() {
        a e10;
        a e11;
        int i10 = this.f14664c;
        int i11 = this.f14667f;
        int i12 = this.f14666e + i10;
        int i13 = this.f14665d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f14662a.g(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f14662a.g(i16, i15)) {
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
                    if (d(iArr) && (e11 = e(iArr, i15, i16)) != null) {
                        return e11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (e10 = e(iArr, i15, i12)) != null) {
                return e10;
            }
        }
        if (this.f14663b.isEmpty()) {
            throw m.a();
        }
        return this.f14663b.get(0);
    }
}
