package tg;

import kg.C9263a;
import p066dg.C6952m;
import p066dg.EnumC6940a;

/* renamed from: tg.i */
/* loaded from: classes2.dex */
public final class C11265i extends AbstractC11281y {

    /* renamed from: j */
    static final int[] f29223j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f29224i = new int[4];

    /* renamed from: s */
    private static void m35213s(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f29223j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw C6952m.m20106a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC11281y
    /* renamed from: l */
    public int mo35180l(C9263a c9263a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29224i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m27590l = c9263a.m27590l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < m27590l; i12++) {
            int m35245j = AbstractC11281y.m35245j(c9263a, iArr2, i10, AbstractC11281y.f29255h);
            sb2.append((char) ((m35245j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (m35245j >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        m35213s(sb2, i11);
        int i14 = AbstractC11281y.m35246n(c9263a, i10, true, AbstractC11281y.f29252e)[1];
        for (int i15 = 0; i15 < 6 && i14 < m27590l; i15++) {
            sb2.append((char) (AbstractC11281y.m35245j(c9263a, iArr2, i14, AbstractC11281y.f29254g) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // tg.AbstractC11281y
    /* renamed from: q */
    EnumC6940a mo35181q() {
        return EnumC6940a.EAN_13;
    }
}
