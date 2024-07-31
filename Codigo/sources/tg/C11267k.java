package tg;

import kg.C9263a;
import p066dg.EnumC6940a;

/* renamed from: tg.k */
/* loaded from: classes2.dex */
public final class C11267k extends AbstractC11281y {

    /* renamed from: i */
    private final int[] f29225i = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC11281y
    /* renamed from: l */
    public int mo35180l(C9263a c9263a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29225i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m27590l = c9263a.m27590l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < m27590l; i11++) {
            sb2.append((char) (AbstractC11281y.m35245j(c9263a, iArr2, i10, AbstractC11281y.f29254g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = AbstractC11281y.m35246n(c9263a, i10, true, AbstractC11281y.f29252e)[1];
        for (int i14 = 0; i14 < 4 && i13 < m27590l; i14++) {
            sb2.append((char) (AbstractC11281y.m35245j(c9263a, iArr2, i13, AbstractC11281y.f29254g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // tg.AbstractC11281y
    /* renamed from: q */
    EnumC6940a mo35181q() {
        return EnumC6940a.EAN_8;
    }
}
