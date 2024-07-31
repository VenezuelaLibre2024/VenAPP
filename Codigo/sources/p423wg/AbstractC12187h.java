package p423wg;

import kg.C9263a;

/* renamed from: wg.h */
/* loaded from: classes2.dex */
abstract class AbstractC12187h extends AbstractC12189j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12187h(C9263a c9263a) {
        super(c9263a);
    }

    /* renamed from: e */
    private static void m39102e(StringBuilder sb2, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb2.charAt(i12 + i10) - '0';
            if ((i12 & 1) == 0) {
                charAt *= 3;
            }
            i11 += charAt;
        }
        int i13 = 10 - (i11 % 10);
        sb2.append(i13 != 10 ? i13 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m39103f(StringBuilder sb2, int i10) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m39104g(sb2, i10, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m39104g(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int m39150f = m39107b().m39150f((i12 * 10) + i10, 10);
            if (m39150f / 100 == 0) {
                sb2.append('0');
            }
            if (m39150f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m39150f);
        }
        m39102e(sb2, i11);
    }
}
