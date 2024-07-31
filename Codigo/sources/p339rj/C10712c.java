package p339rj;

import dj.AbstractC6990o;
import dj.AbstractC6994s;
import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import dj.InterfaceC6995t;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9079g;
import p205kj.EnumC9284b;
import p241mj.InterfaceC9594d;
import p471yj.C12727a;

/* renamed from: rj.c */
/* loaded from: classes3.dex */
public final class C10712c<T> extends AbstractC6994s<Boolean> implements InterfaceC9594d<Boolean> {

    /* renamed from: a */
    final InterfaceC6991p<T> f27079a;

    /* renamed from: b */
    final InterfaceC9079g<? super T> f27080b;

    /* renamed from: rj.c$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6992q<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6995t<? super Boolean> f27081a;

        /* renamed from: b */
        final InterfaceC9079g<? super T> f27082b;

        /* renamed from: c */
        InterfaceC7578b f27083c;

        /* renamed from: d */
        boolean f27084d;

        a(InterfaceC6995t<? super Boolean> interfaceC6995t, InterfaceC9079g<? super T> interfaceC9079g) {
            this.f27081a = interfaceC6995t;
            this.f27082b = interfaceC9079g;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            if (this.f27084d) {
                return;
            }
            this.f27084d = true;
            this.f27081a.onSuccess(Boolean.FALSE);
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f27083c, interfaceC7578b)) {
                this.f27083c = interfaceC7578b;
                this.f27081a.mo20313b(this);
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            if (this.f27084d) {
                return;
            }
            try {
                if (this.f27082b.test(t10)) {
                    this.f27084d = true;
                    this.f27083c.dispose();
                    this.f27081a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27083c.dispose();
                onError(th2);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f27083c.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f27083c.mo616h();
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            if (this.f27084d) {
                C12727a.m41995q(th2);
            } else {
                this.f27084d = true;
                this.f27081a.onError(th2);
            }
        }
    }

    public C10712c(InterfaceC6991p<T> interfaceC6991p, InterfaceC9079g<? super T> interfaceC9079g) {
        this.f27079a = interfaceC6991p;
        this.f27080b = interfaceC9079g;
    }

    @Override // p241mj.InterfaceC9594d
    /* renamed from: b */
    public AbstractC6990o<Boolean> mo28589b() {
        return C12727a.m41991m(new C10711b(this.f27079a, this.f27080b));
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super Boolean> interfaceC6995t) {
        this.f27079a.mo20285d(new a(interfaceC6995t, this.f27080b));
    }
}
