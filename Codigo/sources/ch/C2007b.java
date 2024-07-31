package ch;

import java.util.Map;
import kg.C9264b;
import p066dg.EnumC6940a;
import p066dg.EnumC6946g;
import p066dg.InterfaceC6960u;
import p067dh.EnumC6967f;
import p109fh.C7350b;
import p109fh.C7351c;
import p109fh.C7355g;

/* renamed from: ch.b */
/* loaded from: classes2.dex */
public final class C2007b implements InterfaceC6960u {
    /* renamed from: b */
    private static C9264b m10302b(C7355g c7355g, int i10, int i11, int i12) {
        C7350b m22183a = c7355g.m22183a();
        if (m22183a == null) {
            throw new IllegalStateException();
        }
        int m22096e = m22183a.m22096e();
        int m22095d = m22183a.m22095d();
        int i13 = i12 * 2;
        int i14 = m22096e + i13;
        int i15 = i13 + m22095d;
        int max = Math.max(i10, i14);
        int max2 = Math.max(i11, i15);
        int min = Math.min(max / i14, max2 / i15);
        int i16 = (max - (m22096e * min)) / 2;
        int i17 = (max2 - (m22095d * min)) / 2;
        C9264b c9264b = new C9264b(max, max2);
        int i18 = 0;
        while (i18 < m22095d) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < m22096e) {
                if (m22183a.m22093b(i19, i18) == 1) {
                    c9264b.m27613s(i20, i17, min, min);
                }
                i19++;
                i20 += min;
            }
            i18++;
            i17 += min;
        }
        return c9264b;
    }

    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    public C9264b mo10303a(String str, EnumC6940a enumC6940a, int i10, int i11, Map<EnumC6946g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC6940a != EnumC6940a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + enumC6940a);
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        EnumC6967f enumC6967f = EnumC6967f.L;
        int i12 = 4;
        if (map != null) {
            EnumC6946g enumC6946g = EnumC6946g.ERROR_CORRECTION;
            if (map.containsKey(enumC6946g)) {
                enumC6967f = EnumC6967f.valueOf(map.get(enumC6946g).toString());
            }
            EnumC6946g enumC6946g2 = EnumC6946g.MARGIN;
            if (map.containsKey(enumC6946g2)) {
                i12 = Integer.parseInt(map.get(enumC6946g2).toString());
            }
        }
        return m10302b(C7351c.m22112n(str, enumC6967f, map), i10, i11, i12);
    }
}
