package tg;

/* loaded from: classes2.dex */
public final class k extends y {

    /* renamed from: i, reason: collision with root package name */
    private final int[] f26923i = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.y
    public int l(kg.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f26923i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l10 = aVar.l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < l10; i11++) {
            sb2.append((char) (y.j(aVar, iArr2, i10, y.f26952g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = y.n(aVar, i10, true, y.f26950e)[1];
        for (int i14 = 0; i14 < 4 && i13 < l10; i14++) {
            sb2.append((char) (y.j(aVar, iArr2, i13, y.f26952g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // tg.y
    dg.a q() {
        return dg.a.EAN_8;
    }
}
