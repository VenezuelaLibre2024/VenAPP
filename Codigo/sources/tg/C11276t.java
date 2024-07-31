package tg;

import java.util.Map;
import kg.C9263a;
import p066dg.C6942c;
import p066dg.C6947h;
import p066dg.C6956q;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;

/* renamed from: tg.t */
/* loaded from: classes2.dex */
public final class C11276t extends AbstractC11281y {

    /* renamed from: i */
    private final AbstractC11281y f29241i = new C11265i();

    /* renamed from: s */
    private static C6956q m35232s(C6956q c6956q) {
        String m20113f = c6956q.m20113f();
        if (m20113f.charAt(0) != '0') {
            throw C6947h.m20094a();
        }
        C6956q c6956q2 = new C6956q(m20113f.substring(1), null, c6956q.m20112e(), EnumC6940a.UPC_A);
        if (c6956q.m20111d() != null) {
            c6956q2.m20114g(c6956q.m20111d());
        }
        return c6956q2;
    }

    @Override // tg.AbstractC11274r, p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return m35232s(this.f29241i.mo10300a(c6942c));
    }

    @Override // tg.AbstractC11274r, p066dg.InterfaceC6954o
    /* renamed from: b */
    public C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        return m35232s(this.f29241i.mo10301b(c6942c, map));
    }

    @Override // tg.AbstractC11281y, tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        return m35232s(this.f29241i.mo35175c(i10, c9263a, map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC11281y
    /* renamed from: l */
    public int mo35180l(C9263a c9263a, int[] iArr, StringBuilder sb2) {
        return this.f29241i.mo35180l(c9263a, iArr, sb2);
    }

    @Override // tg.AbstractC11281y
    /* renamed from: m */
    public C6956q mo35233m(int i10, C9263a c9263a, int[] iArr, Map<EnumC6944e, ?> map) {
        return m35232s(this.f29241i.mo35233m(i10, c9263a, iArr, map));
    }

    @Override // tg.AbstractC11281y
    /* renamed from: q */
    EnumC6940a mo35181q() {
        return EnumC6940a.UPC_A;
    }
}
