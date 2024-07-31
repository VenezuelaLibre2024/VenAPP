package p067dh;

import java.util.Map;
import kg.C9264b;
import kg.C9267e;
import mg.C9580a;
import mg.C9582c;
import mg.C9584e;
import p066dg.C6943d;
import p066dg.C6947h;
import p066dg.EnumC6944e;

/* renamed from: dh.e */
/* loaded from: classes2.dex */
public final class C6966e {

    /* renamed from: a */
    private final C9582c f15519a = new C9582c(C9580a.f23344l);

    /* renamed from: a */
    private void m20142a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f15519a.m28554a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C9584e unused) {
            throw C6943d.m20090a();
        }
    }

    /* renamed from: b */
    private C9267e m20143b(C6962a c6962a, Map<EnumC6944e, ?> map) {
        C6971j m20126e = c6962a.m20126e();
        EnumC6967f m20151d = c6962a.m20125d().m20151d();
        C6963b[] m20129b = C6963b.m20129b(c6962a.m20124c(), m20126e, m20151d);
        int i10 = 0;
        for (C6963b c6963b : m20129b) {
            i10 += c6963b.m20131c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (C6963b c6963b2 : m20129b) {
            byte[] m20130a = c6963b2.m20130a();
            int m20131c = c6963b2.m20131c();
            m20142a(m20130a, m20131c);
            int i12 = 0;
            while (i12 < m20131c) {
                bArr[i11] = m20130a[i12];
                i12++;
                i11++;
            }
        }
        return C6965d.m20134a(bArr, m20126e, m20151d, map);
    }

    /* renamed from: c */
    public C9267e m20144c(C9264b c9264b, Map<EnumC6944e, ?> map) {
        C6943d e10;
        C6962a c6962a = new C6962a(c9264b);
        C6947h c6947h = null;
        try {
            return m20143b(c6962a, map);
        } catch (C6943d e11) {
            e10 = e11;
            try {
                c6962a.m20127f();
                c6962a.m20128g(true);
                c6962a.m20126e();
                c6962a.m20125d();
                c6962a.m20123b();
                C9267e m20143b = m20143b(c6962a, map);
                m20143b.m27638n(new C6970i(true));
                return m20143b;
            } catch (C6943d | C6947h unused) {
                if (c6947h != null) {
                    throw c6947h;
                }
                throw e10;
            }
        } catch (C6947h e12) {
            e10 = null;
            c6947h = e12;
            c6962a.m20127f();
            c6962a.m20128g(true);
            c6962a.m20126e();
            c6962a.m20125d();
            c6962a.m20123b();
            C9267e m20143b2 = m20143b(c6962a, map);
            m20143b2.m27638n(new C6970i(true));
            return m20143b2;
        }
    }
}
