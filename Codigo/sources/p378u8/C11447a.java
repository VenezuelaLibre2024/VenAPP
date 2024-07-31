package p378u8;

import java.util.ArrayList;
import java.util.List;
import p361t6.C11005b3;
import p363t8.C11145e;
import p363t8.C11146e0;
import p363t8.C11179x;

/* renamed from: u8.a */
/* loaded from: classes.dex */
public final class C11447a {

    /* renamed from: a */
    public final List<byte[]> f29637a;

    /* renamed from: b */
    public final int f29638b;

    /* renamed from: c */
    public final int f29639c;

    /* renamed from: d */
    public final int f29640d;

    /* renamed from: e */
    public final float f29641e;

    /* renamed from: f */
    public final String f29642f;

    private C11447a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f29637a = list;
        this.f29638b = i10;
        this.f29639c = i11;
        this.f29640d = i12;
        this.f29641e = f10;
        this.f29642f = str;
    }

    /* renamed from: a */
    private static byte[] m35768a(C11146e0 c11146e0) {
        int m34670N = c11146e0.m34670N();
        int m34683f = c11146e0.m34683f();
        c11146e0.m34678V(m34670N);
        return C11145e.m34647d(c11146e0.m34682e(), m34683f, m34670N);
    }

    /* renamed from: b */
    public static C11447a m35769b(C11146e0 c11146e0) {
        int i10;
        int i11;
        float f10;
        String str;
        try {
            c11146e0.m34678V(4);
            int m34664H = (c11146e0.m34664H() & 3) + 1;
            if (m34664H == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m34664H2 = c11146e0.m34664H() & 31;
            for (int i12 = 0; i12 < m34664H2; i12++) {
                arrayList.add(m35768a(c11146e0));
            }
            int m34664H3 = c11146e0.m34664H();
            for (int i13 = 0; i13 < m34664H3; i13++) {
                arrayList.add(m35768a(c11146e0));
            }
            if (m34664H2 > 0) {
                C11179x.c m35025l = C11179x.m35025l((byte[]) arrayList.get(0), m34664H, ((byte[]) arrayList.get(0)).length);
                int i14 = m35025l.f29094f;
                int i15 = m35025l.f29095g;
                float f11 = m35025l.f29096h;
                str = C11145e.m34644a(m35025l.f29089a, m35025l.f29090b, m35025l.f29091c);
                i10 = i14;
                i11 = i15;
                f10 = f11;
            } else {
                i10 = -1;
                i11 = -1;
                f10 = 1.0f;
                str = null;
            }
            return new C11447a(arrayList, m34664H, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C11005b3.m33715a("Error parsing AVC config", e10);
        }
    }
}
