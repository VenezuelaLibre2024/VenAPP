package eg;

import java.nio.charset.Charset;
import java.util.Map;
import kg.C9264b;
import p066dg.EnumC6940a;
import p066dg.EnumC6946g;
import p066dg.InterfaceC6960u;
import p142hg.C7729a;
import p142hg.C7731c;

/* renamed from: eg.c */
/* loaded from: classes2.dex */
public final class C7188c implements InterfaceC6960u {
    /* renamed from: b */
    private static C9264b m21397b(String str, EnumC6940a enumC6940a, int i10, int i11, Charset charset, int i12, int i13) {
        if (enumC6940a == EnumC6940a.AZTEC) {
            return m21398c(C7731c.m23581d(str, i12, i13, charset), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + enumC6940a);
    }

    /* renamed from: c */
    private static C9264b m21398c(C7729a c7729a, int i10, int i11) {
        C9264b m23571a = c7729a.m23571a();
        if (m23571a == null) {
            throw new IllegalStateException();
        }
        int m27609m = m23571a.m27609m();
        int m27606j = m23571a.m27606j();
        int max = Math.max(i10, m27609m);
        int max2 = Math.max(i11, m27606j);
        int min = Math.min(max / m27609m, max2 / m27606j);
        int i12 = (max - (m27609m * min)) / 2;
        int i13 = (max2 - (m27606j * min)) / 2;
        C9264b c9264b = new C9264b(max, max2);
        int i14 = 0;
        while (i14 < m27606j) {
            int i15 = 0;
            int i16 = i12;
            while (i15 < m27609m) {
                if (m23571a.m27603g(i15, i14)) {
                    c9264b.m27613s(i16, i13, min, min);
                }
                i15++;
                i16 += min;
            }
            i14++;
            i13 += min;
        }
        return c9264b;
    }

    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    public C9264b mo10303a(String str, EnumC6940a enumC6940a, int i10, int i11, Map<EnumC6946g, ?> map) {
        int i12 = 0;
        if (map != null) {
            EnumC6946g enumC6946g = EnumC6946g.CHARACTER_SET;
            r0 = map.containsKey(enumC6946g) ? Charset.forName(map.get(enumC6946g).toString()) : null;
            EnumC6946g enumC6946g2 = EnumC6946g.ERROR_CORRECTION;
            r1 = map.containsKey(enumC6946g2) ? Integer.parseInt(map.get(enumC6946g2).toString()) : 33;
            EnumC6946g enumC6946g3 = EnumC6946g.AZTEC_LAYERS;
            if (map.containsKey(enumC6946g3)) {
                i12 = Integer.parseInt(map.get(enumC6946g3).toString());
            }
        }
        return m21397b(str, enumC6940a, i10, i11, r0, r1, i12);
    }
}
