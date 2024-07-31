package p378u8;

import java.util.Collections;
import java.util.List;
import p361t6.C11005b3;
import p363t8.C11145e;
import p363t8.C11146e0;
import p363t8.C11179x;

/* renamed from: u8.f */
/* loaded from: classes.dex */
public final class C11453f {

    /* renamed from: a */
    public final List<byte[]> f29681a;

    /* renamed from: b */
    public final int f29682b;

    /* renamed from: c */
    public final int f29683c;

    /* renamed from: d */
    public final int f29684d;

    /* renamed from: e */
    public final float f29685e;

    /* renamed from: f */
    public final int f29686f;

    /* renamed from: g */
    public final int f29687g;

    /* renamed from: h */
    public final int f29688h;

    /* renamed from: i */
    public final String f29689i;

    private C11453f(List<byte[]> list, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.f29681a = list;
        this.f29682b = i10;
        this.f29683c = i11;
        this.f29684d = i12;
        this.f29685e = f10;
        this.f29689i = str;
        this.f29686f = i13;
        this.f29687g = i14;
        this.f29688h = i15;
    }

    /* renamed from: a */
    public static C11453f m35791a(C11146e0 c11146e0) {
        int i10;
        int i11;
        try {
            c11146e0.m34678V(21);
            int m34664H = c11146e0.m34664H() & 3;
            int m34664H2 = c11146e0.m34664H();
            int m34683f = c11146e0.m34683f();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < m34664H2; i14++) {
                c11146e0.m34678V(1);
                int m34670N = c11146e0.m34670N();
                for (int i15 = 0; i15 < m34670N; i15++) {
                    int m34670N2 = c11146e0.m34670N();
                    i13 += m34670N2 + 4;
                    c11146e0.m34678V(m34670N2);
                }
            }
            c11146e0.m34677U(m34683f);
            byte[] bArr = new byte[i13];
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f10 = 1.0f;
            String str = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < m34664H2) {
                int m34664H3 = c11146e0.m34664H() & 63;
                int m34670N3 = c11146e0.m34670N();
                int i23 = i12;
                while (i23 < m34670N3) {
                    int m34670N4 = c11146e0.m34670N();
                    byte[] bArr2 = C11179x.f29069a;
                    int i24 = m34664H2;
                    System.arraycopy(bArr2, i12, bArr, i22, bArr2.length);
                    int length = i22 + bArr2.length;
                    System.arraycopy(c11146e0.m34682e(), c11146e0.m34683f(), bArr, length, m34670N4);
                    if (m34664H3 == 33 && i23 == 0) {
                        C11179x.a m35021h = C11179x.m35021h(bArr, length, length + m34670N4);
                        int i25 = m35021h.f29080h;
                        i17 = m35021h.f29081i;
                        int i26 = m35021h.f29083k;
                        int i27 = m35021h.f29084l;
                        int i28 = m35021h.f29085m;
                        float f11 = m35021h.f29082j;
                        i10 = m34664H3;
                        i11 = m34670N3;
                        i16 = i25;
                        i20 = i28;
                        str = C11145e.m34646c(m35021h.f29073a, m35021h.f29074b, m35021h.f29075c, m35021h.f29076d, m35021h.f29077e, m35021h.f29078f);
                        i19 = i27;
                        f10 = f11;
                        i18 = i26;
                    } else {
                        i10 = m34664H3;
                        i11 = m34670N3;
                    }
                    i22 = length + m34670N4;
                    c11146e0.m34678V(m34670N4);
                    i23++;
                    m34664H2 = i24;
                    m34664H3 = i10;
                    m34670N3 = i11;
                    i12 = 0;
                }
                i21++;
                i12 = 0;
            }
            return new C11453f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), m34664H + 1, i16, i17, f10, str, i18, i19, i20);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C11005b3.m33715a("Error parsing HEVC config", e10);
        }
    }
}
