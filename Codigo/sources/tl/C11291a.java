package tl;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10527d0;
import p319ql.AbstractC10543r;
import p319ql.C10521a0;
import p319ql.C10524c;
import p319ql.C10525c0;
import p319ql.C10545t;
import p319ql.EnumC10551z;
import p319ql.InterfaceC10528e;
import p319ql.InterfaceC10547v;
import p341rl.C10727d;
import p406vl.C11978e;
import p450xk.C12524p;
import tl.C11292b;

/* renamed from: tl.a */
/* loaded from: classes3.dex */
public final class C11291a implements InterfaceC10547v {

    /* renamed from: a */
    public static final a f29279a = new a(null);

    /* renamed from: tl.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C10545t m35274c(C10545t c10545t, C10545t c10545t2) {
            boolean m41037r;
            boolean m41031E;
            C10545t.a aVar = new C10545t.a();
            int size = c10545t.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String m31846d = c10545t.m31846d(i11);
                String m31849l = c10545t.m31849l(i11);
                m41037r = C12524p.m41037r("Warning", m31846d, true);
                if (m41037r) {
                    m41031E = C12524p.m41031E(m31849l, "1", false, 2, null);
                    if (m41031E) {
                        i11 = i12;
                    }
                }
                if (m35275d(m31846d) || !m35276e(m31846d) || c10545t2.m31845c(m31846d) == null) {
                    aVar.m31853c(m31846d, m31849l);
                }
                i11 = i12;
            }
            int size2 = c10545t2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String m31846d2 = c10545t2.m31846d(i10);
                if (!m35275d(m31846d2) && m35276e(m31846d2)) {
                    aVar.m31853c(m31846d2, c10545t2.m31849l(i10));
                }
                i10 = i13;
            }
            return aVar.m31855e();
        }

        /* renamed from: d */
        private final boolean m35275d(String str) {
            boolean m41037r;
            boolean m41037r2;
            boolean m41037r3;
            m41037r = C12524p.m41037r("Content-Length", str, true);
            if (m41037r) {
                return true;
            }
            m41037r2 = C12524p.m41037r("Content-Encoding", str, true);
            if (m41037r2) {
                return true;
            }
            m41037r3 = C12524p.m41037r("Content-Type", str, true);
            return m41037r3;
        }

        /* renamed from: e */
        private final boolean m35276e(String str) {
            boolean m41037r;
            boolean m41037r2;
            boolean m41037r3;
            boolean m41037r4;
            boolean m41037r5;
            boolean m41037r6;
            boolean m41037r7;
            boolean m41037r8;
            m41037r = C12524p.m41037r("Connection", str, true);
            if (!m41037r) {
                m41037r2 = C12524p.m41037r("Keep-Alive", str, true);
                if (!m41037r2) {
                    m41037r3 = C12524p.m41037r("Proxy-Authenticate", str, true);
                    if (!m41037r3) {
                        m41037r4 = C12524p.m41037r("Proxy-Authorization", str, true);
                        if (!m41037r4) {
                            m41037r5 = C12524p.m41037r("TE", str, true);
                            if (!m41037r5) {
                                m41037r6 = C12524p.m41037r("Trailers", str, true);
                                if (!m41037r6) {
                                    m41037r7 = C12524p.m41037r("Transfer-Encoding", str, true);
                                    if (!m41037r7) {
                                        m41037r8 = C12524p.m41037r("Upgrade", str, true);
                                        if (!m41037r8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final C10525c0 m35277f(C10525c0 c10525c0) {
            return (c10525c0 == null ? null : c10525c0.m31641a()) != null ? c10525c0.m31635B().m31662b(null).m31663c() : c10525c0;
        }
    }

    public C11291a(C10524c c10524c) {
    }

    @Override // p319ql.InterfaceC10547v
    /* renamed from: a */
    public C10525c0 mo31938a(InterfaceC10547v.a chain) {
        C9322n.m27781e(chain, "chain");
        InterfaceC10528e call = chain.call();
        C11292b m35286b = new C11292b.b(System.currentTimeMillis(), chain.mo31940o(), null).m35286b();
        C10521a0 m35279b = m35286b.m35279b();
        C10525c0 m35278a = m35286b.m35278a();
        C11978e c11978e = call instanceof C11978e ? (C11978e) call : null;
        AbstractC10543r m38444m = c11978e == null ? null : c11978e.m38444m();
        if (m38444m == null) {
            m38444m = AbstractC10543r.f26444b;
        }
        if (m35279b == null && m35278a == null) {
            C10525c0 m31663c = new C10525c0.a().m31677s(chain.mo31940o()).m31675q(EnumC10551z.HTTP_1_1).m31665g(504).m31672n("Unsatisfiable Request (only-if-cached)").m31662b(C10727d.f27160c).m31678t(-1L).m31676r(System.currentTimeMillis()).m31663c();
            m38444m.m31834z(call, m31663c);
            return m31663c;
        }
        if (m35279b == null) {
            C9322n.m27778b(m35278a);
            C10525c0 m31663c2 = m35278a.m31635B().m31664d(f29279a.m35277f(m35278a)).m31663c();
            m38444m.m31810b(call, m31663c2);
            return m31663c2;
        }
        if (m35278a != null) {
            m38444m.m31809a(call, m35278a);
        }
        C10525c0 mo31939a = chain.mo31939a(m35279b);
        if (m35278a != null) {
            boolean z10 = false;
            if (mo31939a != null && mo31939a.m31645g() == 304) {
                z10 = true;
            }
            if (z10) {
                C10525c0.a m31635B = m35278a.m31635B();
                a aVar = f29279a;
                m31635B.m31670l(aVar.m35274c(m35278a.m31649o(), mo31939a.m31649o())).m31678t(mo31939a.m31640Q()).m31676r(mo31939a.m31638I()).m31664d(aVar.m35277f(m35278a)).m31673o(aVar.m35277f(mo31939a)).m31663c();
                AbstractC10527d0 m31641a = mo31939a.m31641a();
                C9322n.m27778b(m31641a);
                m31641a.close();
                C9322n.m27778b(null);
                throw null;
            }
            AbstractC10527d0 m31641a2 = m35278a.m31641a();
            if (m31641a2 != null) {
                C10727d.m32653m(m31641a2);
            }
        }
        C9322n.m27778b(mo31939a);
        C10525c0.a m31635B2 = mo31939a.m31635B();
        a aVar2 = f29279a;
        return m31635B2.m31664d(aVar2.m35277f(m35278a)).m31673o(aVar2.m35277f(mo31939a)).m31663c();
    }
}
