package sg;

import java.util.Map;
import kg.C9264b;
import kg.C9267e;
import mg.C9580a;
import mg.C9582c;
import mg.C9584e;
import p066dg.C6943d;
import p066dg.C6947h;
import p066dg.EnumC6944e;

/* renamed from: sg.c */
/* loaded from: classes2.dex */
public final class C10913c {

    /* renamed from: a */
    private final C9582c f27749a = new C9582c(C9580a.f23347o);

    /* renamed from: a */
    private void m33323a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[i14 / i15];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f27749a.m28554a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (C9584e unused) {
            throw C6943d.m20090a();
        }
    }

    /* renamed from: b */
    public C9267e m33324b(C9264b c9264b, Map<EnumC6944e, ?> map) {
        int i10;
        byte[] m33313a = new C10911a(c9264b).m33313a();
        m33323a(m33313a, 0, 10, 10, 0);
        int i11 = m33313a[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            m33323a(m33313a, 20, 84, 40, 1);
            m33323a(m33313a, 20, 84, 40, 2);
            i10 = 94;
        } else {
            if (i11 != 5) {
                throw C6947h.m20094a();
            }
            m33323a(m33313a, 20, 68, 56, 1);
            m33323a(m33313a, 20, 68, 56, 2);
            i10 = 78;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(m33313a, 0, bArr, 0, 10);
        System.arraycopy(m33313a, 20, bArr, 10, bArr.length - 10);
        return C10912b.m33314a(bArr, i11);
    }
}
