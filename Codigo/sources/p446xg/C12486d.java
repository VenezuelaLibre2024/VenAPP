package p446xg;

import bh.C1785d;
import bh.C1786e;
import bh.EnumC1784c;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import kg.C9264b;
import p066dg.EnumC6940a;
import p066dg.EnumC6946g;
import p066dg.InterfaceC6960u;

/* renamed from: xg.d */
/* loaded from: classes2.dex */
public final class C12486d implements InterfaceC6960u {
    /* renamed from: b */
    private static C9264b m40838b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        C9264b c9264b = new C9264b(bArr[0].length + i11, bArr.length + i11);
        c9264b.m27599b();
        int m27606j = (c9264b.m27606j() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    c9264b.m27612r(i13 + i10, m27606j);
                }
            }
            i12++;
            m27606j--;
        }
        return c9264b;
    }

    /* renamed from: c */
    private static C9264b m40839c(C1786e c1786e, String str, int i10, int i11, int i12, int i13, boolean z10) {
        boolean z11;
        c1786e.m9521e(str, i10, z10);
        byte[][] m9507b = c1786e.m9522f().m9507b(1, 4);
        if ((i12 > i11) != (m9507b[0].length < m9507b.length)) {
            m9507b = m40840d(m9507b);
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(i11 / m9507b[0].length, i12 / m9507b.length);
        if (min <= 1) {
            return m40838b(m9507b, i13);
        }
        byte[][] m9507b2 = c1786e.m9522f().m9507b(min, min * 4);
        if (z11) {
            m9507b2 = m40840d(m9507b2);
        }
        return m40838b(m9507b2, i13);
    }

    /* renamed from: d */
    private static byte[][] m40840d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    public C9264b mo10303a(String str, EnumC6940a enumC6940a, int i10, int i11, Map<EnumC6946g, ?> map) {
        if (enumC6940a != EnumC6940a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + enumC6940a);
        }
        C1786e c1786e = new C1786e();
        boolean z10 = false;
        if (map != null) {
            EnumC6946g enumC6946g = EnumC6946g.PDF417_COMPACT;
            if (map.containsKey(enumC6946g)) {
                c1786e.m9523h(Boolean.parseBoolean(map.get(enumC6946g).toString()));
            }
            EnumC6946g enumC6946g2 = EnumC6946g.PDF417_COMPACTION;
            if (map.containsKey(enumC6946g2)) {
                c1786e.m9524i(EnumC1784c.valueOf(map.get(enumC6946g2).toString()));
            }
            EnumC6946g enumC6946g3 = EnumC6946g.PDF417_DIMENSIONS;
            if (map.containsKey(enumC6946g3)) {
                C1785d c1785d = (C1785d) map.get(enumC6946g3);
                c1786e.m9525j(c1785d.m9512a(), c1785d.m9514c(), c1785d.m9513b(), c1785d.m9515d());
            }
            EnumC6946g enumC6946g4 = EnumC6946g.MARGIN;
            r0 = map.containsKey(enumC6946g4) ? Integer.parseInt(map.get(enumC6946g4).toString()) : 30;
            EnumC6946g enumC6946g5 = EnumC6946g.ERROR_CORRECTION;
            r2 = map.containsKey(enumC6946g5) ? Integer.parseInt(map.get(enumC6946g5).toString()) : 2;
            EnumC6946g enumC6946g6 = EnumC6946g.CHARACTER_SET;
            if (map.containsKey(enumC6946g6)) {
                c1786e.m9526k(Charset.forName(map.get(enumC6946g6).toString()));
            }
            EnumC6946g enumC6946g7 = EnumC6946g.PDF417_AUTO_ECI;
            if (map.containsKey(enumC6946g7) && Boolean.parseBoolean(map.get(enumC6946g7).toString())) {
                z10 = true;
            }
        }
        return m40839c(c1786e, str, r2, i10, i11, r0, z10);
    }
}
