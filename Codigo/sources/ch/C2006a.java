package ch;

import java.util.List;
import java.util.Map;
import kg.C9264b;
import kg.C9267e;
import kg.C9269g;
import p066dg.C6942c;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;
import p066dg.InterfaceC6954o;
import p067dh.C6966e;
import p067dh.C6970i;
import p085eh.C7191c;

/* renamed from: ch.a */
/* loaded from: classes2.dex */
public class C2006a implements InterfaceC6954o {

    /* renamed from: b */
    private static final C6958s[] f8060b = new C6958s[0];

    /* renamed from: a */
    private final C6966e f8061a = new C6966e();

    /* renamed from: c */
    private static C9264b m10298c(C9264b c9264b) {
        int[] m27608l = c9264b.m27608l();
        int[] m27604h = c9264b.m27604h();
        if (m27608l == null || m27604h == null) {
            throw C6952m.m20106a();
        }
        float m10299d = m10299d(m27608l, c9264b);
        int i10 = m27608l[1];
        int i11 = m27604h[1];
        int i12 = m27608l[0];
        int i13 = m27604h[0];
        if (i12 >= i13 || i10 >= i11) {
            throw C6952m.m20106a();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= c9264b.m27609m()) {
            throw C6952m.m20106a();
        }
        int round = Math.round(((i13 - i12) + 1) / m10299d);
        int round2 = Math.round((i14 + 1) / m10299d);
        if (round <= 0 || round2 <= 0) {
            throw C6952m.m20106a();
        }
        if (round2 != round) {
            throw C6952m.m20106a();
        }
        int i15 = (int) (m10299d / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((round - 1) * m10299d)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw C6952m.m20106a();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((round2 - 1) * m10299d)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw C6952m.m20106a();
            }
            i16 -= i19;
        }
        C9264b c9264b2 = new C9264b(round, round2);
        for (int i20 = 0; i20 < round2; i20++) {
            int i21 = ((int) (i20 * m10299d)) + i16;
            for (int i22 = 0; i22 < round; i22++) {
                if (c9264b.m27603g(((int) (i22 * m10299d)) + i17, i21)) {
                    c9264b2.m27612r(i22, i20);
                }
            }
        }
        return c9264b2;
    }

    /* renamed from: d */
    private static float m10299d(int[] iArr, C9264b c9264b) {
        int m27606j = c9264b.m27606j();
        int m27609m = c9264b.m27609m();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < m27609m && i11 < m27606j) {
            if (z10 != c9264b.m27603g(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 == m27609m || i11 == m27606j) {
            throw C6952m.m20106a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return mo10301b(c6942c, null);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    public final C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        C6958s[] m27642b;
        C9267e c9267e;
        if (map == null || !map.containsKey(EnumC6944e.PURE_BARCODE)) {
            C9269g m21413e = new C7191c(c6942c.m20084a()).m21413e(map);
            C9267e m20144c = this.f8061a.m20144c(m21413e.m27641a(), map);
            m27642b = m21413e.m27642b();
            c9267e = m20144c;
        } else {
            c9267e = this.f8061a.m20144c(m10298c(c6942c.m20084a()), map);
            m27642b = f8060b;
        }
        if (c9267e.m27628d() instanceof C6970i) {
            ((C6970i) c9267e.m27628d()).m20155a(m27642b);
        }
        C6956q c6956q = new C6956q(c9267e.m27633i(), c9267e.m27629e(), m27642b, EnumC6940a.QR_CODE);
        List<byte[]> m27625a = c9267e.m27625a();
        if (m27625a != null) {
            c6956q.m20115h(EnumC6957r.BYTE_SEGMENTS, m27625a);
        }
        String m27626b = c9267e.m27626b();
        if (m27626b != null) {
            c6956q.m20115h(EnumC6957r.ERROR_CORRECTION_LEVEL, m27626b);
        }
        if (c9267e.m27634j()) {
            c6956q.m20115h(EnumC6957r.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c9267e.m27631g()));
            c6956q.m20115h(EnumC6957r.STRUCTURED_APPEND_PARITY, Integer.valueOf(c9267e.m27630f()));
        }
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]Q" + c9267e.m27632h());
        return c6956q;
    }

    @Override // p066dg.InterfaceC6954o
    public void reset() {
    }
}
