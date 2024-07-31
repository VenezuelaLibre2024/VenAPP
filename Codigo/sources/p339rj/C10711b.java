package p339rj;

import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9079g;
import p205kj.EnumC9284b;
import p471yj.C12727a;

/* renamed from: rj.b */
/* loaded from: classes3.dex */
public final class C10711b<T> extends AbstractC10710a<T, Boolean> {

    /* renamed from: b */
    final InterfaceC9079g<? super T> f27074b;

    /* renamed from: rj.b$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6992q<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6992q<? super Boolean> f27075a;

        /* renamed from: b */
        final InterfaceC9079g<? super T> f27076b;

        /* renamed from: c */
        InterfaceC7578b f27077c;

        /* renamed from: d */
        boolean f27078d;

        a(InterfaceC6992q<? super Boolean> interfaceC6992q, InterfaceC9079g<? super T> interfaceC9079g) {
            this.f27075a = interfaceC6992q;
            this.f27076b = interfaceC9079g;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            if (this.f27078d) {
                return;
            }
            this.f27078d = true;
            this.f27075a.mo607c(Boolean.FALSE);
            this.f27075a.mo605a();
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f27077c, interfaceC7578b)) {
                this.f27077c = interfaceC7578b;
                this.f27075a.mo606b(this);
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            if (this.f27078d) {
                return;
            }
            try {
                if (this.f27076b.test(t10)) {
                    this.f27078d = true;
                    this.f27077c.dispose();
                    this.f27075a.mo607c(Boolean.TRUE);
                    this.f27075a.mo605a();
                }
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27077c.dispose();
                onError(th2);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f27077c.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f27077c.mo616h();
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            if (this.f27078d) {
                C12727a.m41995q(th2);
            } else {
                this.f27078d = true;
                this.f27075a.onError(th2);
            }
        }
    }

    public C10711b(InterfaceC6991p<T> interfaceC6991p, InterfaceC9079g<? super T> interfaceC9079g) {
        super(interfaceC6991p);
        this.f27074b = interfaceC9079g;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    protected void mo608s(InterfaceC6992q<? super Boolean> interfaceC6992q) {
        this.f27073a.mo20285d(new a(interfaceC6992q, this.f27074b));
    }
}
