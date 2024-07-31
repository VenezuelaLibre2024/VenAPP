package p090em;

import dm.C7056b;
import dm.C7057b0;
import dm.C7071o;
import dm.C7075s;
import kotlin.jvm.internal.C9322n;

/* renamed from: em.a */
/* loaded from: classes3.dex */
public final class C7251a {

    /* renamed from: a */
    private static final byte[] f16252a = C7057b0.m20742a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m21692a() {
        return f16252a;
    }

    /* renamed from: b */
    public static final String m21693b(C7056b c7056b, long j10) {
        C9322n.m27781e(c7056b, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c7056b.m20729l(j11) == ((byte) 13)) {
                String m20725i0 = c7056b.m20725i0(j11);
                c7056b.skip(2L);
                return m20725i0;
            }
        }
        String m20725i02 = c7056b.m20725i0(j10);
        c7056b.skip(1L);
        return m20725i02;
    }

    /* renamed from: c */
    public static final int m21694c(C7056b c7056b, C7071o options, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        C7075s c7075s;
        C9322n.m27781e(c7056b, "<this>");
        C9322n.m27781e(options, "options");
        C7075s c7075s2 = c7056b.f15638a;
        if (c7075s2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = c7075s2.f15681a;
        int i14 = c7075s2.f15682b;
        int i15 = c7075s2.f15683c;
        int[] m20822l = options.m20822l();
        C7075s c7075s3 = c7075s2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = m20822l[i17];
            int i20 = i18 + 1;
            int i21 = m20822l[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c7075s3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == m20822l[i20]) {
                        i11 = m20822l[i20 + i19];
                        if (i10 == i15) {
                            c7075s3 = c7075s3.f15686f;
                            C9322n.m27778b(c7075s3);
                            i10 = c7075s3.f15682b;
                            bArr = c7075s3.f15681a;
                            i15 = c7075s3.f15683c;
                            if (c7075s3 == c7075s2) {
                                c7075s3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != m20822l[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    C9322n.m27778b(c7075s3);
                    C7075s c7075s4 = c7075s3.f15686f;
                    C9322n.m27778b(c7075s4);
                    i13 = c7075s4.f15682b;
                    byte[] bArr2 = c7075s4.f15681a;
                    i12 = c7075s4.f15683c;
                    if (c7075s4 != c7075s2) {
                        c7075s = c7075s4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        c7075s = null;
                    }
                } else {
                    C7075s c7075s5 = c7075s3;
                    i12 = i15;
                    i13 = i25;
                    c7075s = c7075s5;
                }
                if (z11) {
                    i11 = m20822l[i26];
                    i10 = i13;
                    i15 = i12;
                    c7075s3 = c7075s;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                c7075s3 = c7075s;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    /* renamed from: d */
    public static /* synthetic */ int m21695d(C7056b c7056b, C7071o c7071o, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m21694c(c7056b, c7071o, z10);
    }
}
