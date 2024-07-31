package tg;

import kg.C9263a;
import p066dg.C6952m;
import p066dg.EnumC6940a;

/* renamed from: tg.a0 */
/* loaded from: classes2.dex */
public final class C11256a0 extends AbstractC11281y {

    /* renamed from: j */
    private static final int[] f29195j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    static final int[][] f29196k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f29197i = new int[4];

    /* renamed from: s */
    public static String m35176s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: t */
    private static void m35177t(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f29196k[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw C6952m.m20106a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC11281y
    /* renamed from: h */
    public boolean mo35178h(String str) {
        return super.mo35178h(m35176s(str));
    }

    @Override // tg.AbstractC11281y
    /* renamed from: k */
    protected int[] mo35179k(C9263a c9263a, int i10) {
        return AbstractC11281y.m35246n(c9263a, i10, true, f29195j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC11281y
    /* renamed from: l */
    public int mo35180l(C9263a c9263a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29197i;
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
        m35177t(sb2, i11);
        return i10;
    }

    @Override // tg.AbstractC11281y
    /* renamed from: q */
    EnumC6940a mo35181q() {
        return EnumC6940a.UPC_E;
    }
}
