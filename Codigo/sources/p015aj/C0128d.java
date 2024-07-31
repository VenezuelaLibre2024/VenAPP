package p015aj;

import p082eb.C7159o;
import vi.AbstractC11904d;
import vi.AbstractC11913g;
import vi.AbstractC11956y;
import vi.C11901c;
import vi.C11953w0;
import vi.C11955x0;
import vi.InterfaceC11916h;

/* renamed from: aj.d */
/* loaded from: classes3.dex */
public final class C0128d {

    /* renamed from: aj.d$a */
    /* loaded from: classes3.dex */
    private static final class a implements InterfaceC11916h {

        /* renamed from: a */
        private final C11953w0 f532a;

        /* renamed from: aj.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private final class C13150a<ReqT, RespT> extends AbstractC11956y.a<ReqT, RespT> {
            C13150a(AbstractC11913g<ReqT, RespT> abstractC11913g) {
                super(abstractC11913g);
            }

            @Override // vi.AbstractC11956y, vi.AbstractC11913g
            /* renamed from: e */
            public void mo603e(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
                c11953w0.m38312l(a.this.f532a);
                super.mo603e(aVar, c11953w0);
            }
        }

        a(C11953w0 c11953w0) {
            this.f532a = (C11953w0) C7159o.m21313p(c11953w0, "extraHeaders");
        }

        @Override // vi.InterfaceC11916h
        /* renamed from: a */
        public <ReqT, RespT> AbstractC11913g<ReqT, RespT> mo602a(C11955x0<ReqT, RespT> c11955x0, C11901c c11901c, AbstractC11904d abstractC11904d) {
            return new C13150a(abstractC11904d.mo25518h(c11955x0, c11901c));
        }
    }

    /* renamed from: a */
    public static InterfaceC11916h m600a(C11953w0 c11953w0) {
        return new a(c11953w0);
    }
}
