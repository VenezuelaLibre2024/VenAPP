package p133h7;

import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;

/* renamed from: h7.d */
/* loaded from: classes.dex */
public class C7657d implements InterfaceC12621k {

    /* renamed from: d */
    public static final InterfaceC12626p f18126d = new InterfaceC12626p() { // from class: h7.c
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m23260d;
            m23260d = C7657d.m23260d();
            return m23260d;
        }
    };

    /* renamed from: a */
    private InterfaceC12623m f18127a;

    /* renamed from: b */
    private AbstractC7662i f18128b;

    /* renamed from: c */
    private boolean f18129c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC12621k[] m23260d() {
        return new InterfaceC12621k[]{new C7657d()};
    }

    /* renamed from: g */
    private static C11146e0 m23261g(C11146e0 c11146e0) {
        c11146e0.m34677U(0);
        return c11146e0;
    }

    /* renamed from: h */
    private boolean m23262h(InterfaceC12622l interfaceC12622l) {
        AbstractC7662i c7661h;
        C7659f c7659f = new C7659f();
        if (c7659f.m23269a(interfaceC12622l, true) && (c7659f.f18136b & 2) == 2) {
            int min = Math.min(c7659f.f18143i, 8);
            C11146e0 c11146e0 = new C11146e0(min);
            interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, min);
            if (C7655b.m23254p(m23261g(c11146e0))) {
                c7661h = new C7655b();
            } else if (C7663j.m23288r(m23261g(c11146e0))) {
                c7661h = new C7663j();
            } else if (C7661h.m23274o(m23261g(c11146e0))) {
                c7661h = new C7661h();
            }
            this.f18128b = c7661h;
            return true;
        }
        return false;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        AbstractC7662i abstractC7662i = this.f18128b;
        if (abstractC7662i != null) {
            abstractC7662i.m23284m(j10, j11);
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f18127a = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        try {
            return m23262h(interfaceC12622l);
        } catch (C11005b3 unused) {
            return false;
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        C11137a.m34607i(this.f18127a);
        if (this.f18128b == null) {
            if (!m23262h(interfaceC12622l)) {
                throw C11005b3.m33715a("Failed to determine bitstream type", null);
            }
            interfaceC12622l.mo41534f();
        }
        if (!this.f18129c) {
            InterfaceC12609b0 mo308d = this.f18127a.mo308d(0, 1);
            this.f18127a.mo324q();
            this.f18128b.m23281d(this.f18127a, mo308d);
            this.f18129c = true;
        }
        return this.f18128b.m23283g(interfaceC12622l, c12635y);
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
