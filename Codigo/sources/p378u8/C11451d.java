package p378u8;

import p363t8.C11146e0;

/* renamed from: u8.d */
/* loaded from: classes.dex */
public final class C11451d {

    /* renamed from: a */
    public final int f29664a;

    /* renamed from: b */
    public final int f29665b;

    /* renamed from: c */
    public final String f29666c;

    private C11451d(int i10, int i11, String str) {
        this.f29664a = i10;
        this.f29665b = i11;
        this.f29666c = str;
    }

    /* renamed from: a */
    public static C11451d m35776a(C11146e0 c11146e0) {
        String str;
        c11146e0.m34678V(2);
        int m34664H = c11146e0.m34664H();
        int i10 = m34664H >> 1;
        int m34664H2 = ((c11146e0.m34664H() >> 3) & 31) | ((m34664H & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(m34664H2 >= 10 ? "." : ".0");
        sb2.append(m34664H2);
        return new C11451d(i10, m34664H2, sb2.toString());
    }
}
