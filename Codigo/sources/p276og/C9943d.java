package p276og;

import kg.C9264b;
import kg.C9267e;
import mg.C9580a;
import mg.C9582c;
import mg.C9584e;
import p066dg.C6943d;

/* renamed from: og.d */
/* loaded from: classes2.dex */
public final class C9943d {

    /* renamed from: a */
    private final C9582c f24485a = new C9582c(C9580a.f23345m);

    /* renamed from: a */
    private void m29718a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f24485a.m28554a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C9584e unused) {
            throw C6943d.m20090a();
        }
    }

    /* renamed from: b */
    public C9267e m29719b(C9264b c9264b) {
        C9940a c9940a = new C9940a(c9264b);
        C9941b[] m29705b = C9941b.m29705b(c9940a.m29704c(), c9940a.m29703b());
        int i10 = 0;
        for (C9941b c9941b : m29705b) {
            i10 += c9941b.m29707c();
        }
        byte[] bArr = new byte[i10];
        int length = m29705b.length;
        for (int i11 = 0; i11 < length; i11++) {
            C9941b c9941b2 = m29705b[i11];
            byte[] m29706a = c9941b2.m29706a();
            int m29707c = c9941b2.m29707c();
            m29718a(m29706a, m29707c);
            for (int i12 = 0; i12 < m29707c; i12++) {
                bArr[(i12 * length) + i11] = m29706a[i12];
            }
        }
        return C9942c.m29708a(bArr);
    }
}
