package ng;

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
import p276og.C9943d;
import pg.C10170a;

/* renamed from: ng.a */
/* loaded from: classes2.dex */
public final class C9716a implements InterfaceC6954o {

    /* renamed from: b */
    private static final C6958s[] f23904b = new C6958s[0];

    /* renamed from: a */
    private final C9943d f23905a = new C9943d();

    /* renamed from: c */
    private static C9264b m29143c(C9264b c9264b) {
        int[] m27608l = c9264b.m27608l();
        int[] m27604h = c9264b.m27604h();
        if (m27608l == null || m27604h == null) {
            throw C6952m.m20106a();
        }
        int m29144d = m29144d(m27608l, c9264b);
        int i10 = m27608l[1];
        int i11 = m27604h[1];
        int i12 = m27608l[0];
        int i13 = ((m27604h[0] - i12) + 1) / m29144d;
        int i14 = ((i11 - i10) + 1) / m29144d;
        if (i13 <= 0 || i14 <= 0) {
            throw C6952m.m20106a();
        }
        int i15 = m29144d / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        C9264b c9264b2 = new C9264b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * m29144d) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (c9264b.m27603g((i20 * m29144d) + i17, i19)) {
                    c9264b2.m27612r(i20, i18);
                }
            }
        }
        return c9264b2;
    }

    /* renamed from: d */
    private static int m29144d(int[] iArr, C9264b c9264b) {
        int m27609m = c9264b.m27609m();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < m27609m && c9264b.m27603g(i10, i11)) {
            i10++;
        }
        if (i10 == m27609m) {
            throw C6952m.m20106a();
        }
        int i12 = i10 - iArr[0];
        if (i12 != 0) {
            return i12;
        }
        throw C6952m.m20106a();
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return mo10301b(c6942c, null);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    public C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        C6958s[] m27642b;
        C9267e c9267e;
        if (map == null || !map.containsKey(EnumC6944e.PURE_BARCODE)) {
            C9269g m30445b = new C10170a(c6942c.m20084a()).m30445b();
            C9267e m29719b = this.f23905a.m29719b(m30445b.m27641a());
            m27642b = m30445b.m27642b();
            c9267e = m29719b;
        } else {
            c9267e = this.f23905a.m29719b(m29143c(c6942c.m20084a()));
            m27642b = f23904b;
        }
        C6956q c6956q = new C6956q(c9267e.m27633i(), c9267e.m27629e(), m27642b, EnumC6940a.DATA_MATRIX);
        List<byte[]> m27625a = c9267e.m27625a();
        if (m27625a != null) {
            c6956q.m20115h(EnumC6957r.BYTE_SEGMENTS, m27625a);
        }
        String m27626b = c9267e.m27626b();
        if (m27626b != null) {
            c6956q.m20115h(EnumC6957r.ERROR_CORRECTION_LEVEL, m27626b);
        }
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]d" + c9267e.m27632h());
        return c6956q;
    }

    @Override // p066dg.InterfaceC6954o
    public void reset() {
    }
}
