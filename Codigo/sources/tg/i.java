package tg;

/* loaded from: classes2.dex */
public final class i extends y {

    /* renamed from: j */
    static final int[] f26921j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f26922i = new int[4];

    private static void s(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f26921j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw dg.m.a();
    }

    @Override // tg.y
    public int l(kg.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f26922i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l10 = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < l10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f26953h);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        s(sb2, i11);
        int i14 = y.n(aVar, i10, true, y.f26950e)[1];
        for (int i15 = 0; i15 < 6 && i14 < l10; i15++) {
            sb2.append((char) (y.j(aVar, iArr2, i14, y.f26952g) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // tg.y
    dg.a q() {
        return dg.a.EAN_13;
    }
}
