package p339rj;

import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import p123gj.InterfaceC7578b;
import p205kj.C9287e;

/* renamed from: rj.m */
/* loaded from: classes3.dex */
public final class C10722m<T> extends AbstractC10710a<T, T> {

    /* renamed from: b */
    final InterfaceC6991p<? extends T> f27150b;

    /* renamed from: rj.m$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6992q<T> {

        /* renamed from: a */
        final InterfaceC6992q<? super T> f27151a;

        /* renamed from: b */
        final InterfaceC6991p<? extends T> f27152b;

        /* renamed from: d */
        boolean f27154d = true;

        /* renamed from: c */
        final C9287e f27153c = new C9287e();

        a(InterfaceC6992q<? super T> interfaceC6992q, InterfaceC6991p<? extends T> interfaceC6991p) {
            this.f27151a = interfaceC6992q;
            this.f27152b = interfaceC6991p;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            if (!this.f27154d) {
                this.f27151a.mo605a();
            } else {
                this.f27154d = false;
                this.f27152b.mo20285d(this);
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            this.f27153c.m27709b(interfaceC7578b);
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            if (this.f27154d) {
                this.f27154d = false;
            }
            this.f27151a.mo607c(t10);
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            this.f27151a.onError(th2);
        }
    }

    public C10722m(InterfaceC6991p<T> interfaceC6991p, InterfaceC6991p<? extends T> interfaceC6991p2) {
        super(interfaceC6991p);
        this.f27150b = interfaceC6991p2;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    public void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        a aVar = new a(interfaceC6992q, this.f27150b);
        interfaceC6992q.mo606b(aVar.f27153c);
        this.f27073a.mo20285d(aVar);
    }
}
