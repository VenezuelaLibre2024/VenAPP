package aj;

import eb.o;
import vi.g;
import vi.h;
import vi.w0;
import vi.x0;
import vi.y;

/* loaded from: classes3.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a implements h {

        /* renamed from: a */
        private final w0 f467a;

        /* renamed from: aj.d$a$a */
        /* loaded from: classes3.dex */
        private final class C0010a<ReqT, RespT> extends y.a<ReqT, RespT> {
            C0010a(g<ReqT, RespT> gVar) {
                super(gVar);
            }

            @Override // vi.y, vi.g
            public void e(g.a<RespT> aVar, w0 w0Var) {
                w0Var.l(a.this.f467a);
                super.e(aVar, w0Var);
            }
        }

        a(w0 w0Var) {
            this.f467a = (w0) o.p(w0Var, "extraHeaders");
        }

        @Override // vi.h
        public <ReqT, RespT> g<ReqT, RespT> a(x0<ReqT, RespT> x0Var, vi.c cVar, vi.d dVar) {
            return new C0010a(dVar.h(x0Var, cVar));
        }
    }

    public static h a(w0 w0Var) {
        return new a(w0Var);
    }
}
