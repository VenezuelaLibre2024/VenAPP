package p336rg;

import java.util.Map;
import kg.C9264b;
import kg.C9267e;
import p066dg.C6942c;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;
import p066dg.InterfaceC6954o;
import sg.C10913c;

/* renamed from: rg.a */
/* loaded from: classes2.dex */
public final class C10707a implements InterfaceC6954o {

    /* renamed from: b */
    private static final C6958s[] f27068b = new C6958s[0];

    /* renamed from: a */
    private final C10913c f27069a = new C10913c();

    /* renamed from: c */
    private static C9264b m32585c(C9264b c9264b) {
        int[] m27605i = c9264b.m27605i();
        if (m27605i == null) {
            throw C6952m.m20106a();
        }
        int i10 = m27605i[0];
        int i11 = m27605i[1];
        int i12 = m27605i[2];
        int i13 = m27605i[3];
        C9264b c9264b2 = new C9264b(30, 33);
        for (int i14 = 0; i14 < 33; i14++) {
            int min = Math.min((((i14 * i13) + (i13 / 2)) / 33) + i11, i13 - 1);
            for (int i15 = 0; i15 < 30; i15++) {
                if (c9264b.m27603g(Math.min((((i15 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30, i12 - 1) + i10, min)) {
                    c9264b2.m27612r(i15, i14);
                }
            }
        }
        return c9264b2;
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return mo10301b(c6942c, null);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    public C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        C9267e m33324b = this.f27069a.m33324b(m32585c(c6942c.m20084a()), map);
        C6956q c6956q = new C6956q(m33324b.m27633i(), m33324b.m27629e(), f27068b, EnumC6940a.MAXICODE);
        String m27626b = m33324b.m27626b();
        if (m27626b != null) {
            c6956q.m20115h(EnumC6957r.ERROR_CORRECTION_LEVEL, m27626b);
        }
        return c6956q;
    }

    @Override // p066dg.InterfaceC6954o
    public void reset() {
    }
}
