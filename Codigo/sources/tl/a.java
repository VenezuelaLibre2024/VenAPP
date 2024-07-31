package tl;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.c;
import ql.c0;
import ql.d0;
import ql.e;
import ql.r;
import ql.t;
import ql.v;
import ql.z;
import rl.d;
import tl.b;
import xk.p;

/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0441a f26977a = new C0441a(null);

    /* renamed from: tl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0441a {
        private C0441a() {
        }

        public /* synthetic */ C0441a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            boolean r10;
            boolean E;
            t.a aVar = new t.a();
            int size = tVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String d10 = tVar.d(i11);
                String l10 = tVar.l(i11);
                r10 = p.r("Warning", d10, true);
                if (r10) {
                    E = p.E(l10, "1", false, 2, null);
                    if (E) {
                        i11 = i12;
                    }
                }
                if (d(d10) || !e(d10) || tVar2.c(d10) == null) {
                    aVar.c(d10, l10);
                }
                i11 = i12;
            }
            int size2 = tVar2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String d11 = tVar2.d(i10);
                if (!d(d11) && e(d11)) {
                    aVar.c(d11, tVar2.l(i10));
                }
                i10 = i13;
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            boolean r10;
            boolean r11;
            boolean r12;
            r10 = p.r("Content-Length", str, true);
            if (r10) {
                return true;
            }
            r11 = p.r("Content-Encoding", str, true);
            if (r11) {
                return true;
            }
            r12 = p.r("Content-Type", str, true);
            return r12;
        }

        private final boolean e(String str) {
            boolean r10;
            boolean r11;
            boolean r12;
            boolean r13;
            boolean r14;
            boolean r15;
            boolean r16;
            boolean r17;
            r10 = p.r("Connection", str, true);
            if (!r10) {
                r11 = p.r("Keep-Alive", str, true);
                if (!r11) {
                    r12 = p.r("Proxy-Authenticate", str, true);
                    if (!r12) {
                        r13 = p.r("Proxy-Authorization", str, true);
                        if (!r13) {
                            r14 = p.r("TE", str, true);
                            if (!r14) {
                                r15 = p.r("Trailers", str, true);
                                if (!r15) {
                                    r16 = p.r("Transfer-Encoding", str, true);
                                    if (!r16) {
                                        r17 = p.r("Upgrade", str, true);
                                        if (!r17) {
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
        public final c0 f(c0 c0Var) {
            return (c0Var == null ? null : c0Var.a()) != null ? c0Var.B().b(null).c() : c0Var;
        }
    }

    public a(c cVar) {
    }

    @Override // ql.v
    public c0 a(v.a chain) {
        n.e(chain, "chain");
        e call = chain.call();
        b b10 = new b.C0442b(System.currentTimeMillis(), chain.o(), null).b();
        a0 b11 = b10.b();
        c0 a10 = b10.a();
        vl.e eVar = call instanceof vl.e ? (vl.e) call : null;
        r m10 = eVar == null ? null : eVar.m();
        if (m10 == null) {
            m10 = r.f24350b;
        }
        if (b11 == null && a10 == null) {
            c0 c10 = new c0.a().s(chain.o()).q(z.HTTP_1_1).g(504).n("Unsatisfiable Request (only-if-cached)").b(d.f25041c).t(-1L).r(System.currentTimeMillis()).c();
            m10.z(call, c10);
            return c10;
        }
        if (b11 == null) {
            n.b(a10);
            c0 c11 = a10.B().d(f26977a.f(a10)).c();
            m10.b(call, c11);
            return c11;
        }
        if (a10 != null) {
            m10.a(call, a10);
        }
        c0 a11 = chain.a(b11);
        if (a10 != null) {
            boolean z10 = false;
            if (a11 != null && a11.g() == 304) {
                z10 = true;
            }
            if (z10) {
                c0.a B = a10.B();
                C0441a c0441a = f26977a;
                B.l(c0441a.c(a10.o(), a11.o())).t(a11.Q()).r(a11.I()).d(c0441a.f(a10)).o(c0441a.f(a11)).c();
                d0 a12 = a11.a();
                n.b(a12);
                a12.close();
                n.b(null);
                throw null;
            }
            d0 a13 = a10.a();
            if (a13 != null) {
                d.m(a13);
            }
        }
        n.b(a11);
        c0.a B2 = a11.B();
        C0441a c0441a2 = f26977a;
        return B2.d(c0441a2.f(a10)).o(c0441a2.f(a11)).c();
    }
}
