package p339rj;

import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import p186jj.InterfaceC9079g;
import p256nj.AbstractC9722a;

/* renamed from: rj.e */
/* loaded from: classes3.dex */
public final class C10714e<T> extends AbstractC10710a<T, T> {

    /* renamed from: b */
    final InterfaceC9079g<? super T> f27086b;

    /* renamed from: rj.e$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AbstractC9722a<T, T> {

        /* renamed from: f */
        final InterfaceC9079g<? super T> f27087f;

        a(InterfaceC6992q<? super T> interfaceC6992q, InterfaceC9079g<? super T> interfaceC9079g) {
            super(interfaceC6992q);
            this.f27087f = interfaceC9079g;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            if (this.f23916e != 0) {
                this.f23912a.mo607c(null);
                return;
            }
            try {
                if (this.f27087f.test(t10)) {
                    this.f23912a.mo607c(t10);
                }
            } catch (Throwable th2) {
                m29155f(th2);
            }
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return m29156g(i10);
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            T poll;
            do {
                poll = this.f23914c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f27087f.test(poll));
            return poll;
        }
    }

    public C10714e(InterfaceC6991p<T> interfaceC6991p, InterfaceC9079g<? super T> interfaceC9079g) {
        super(interfaceC6991p);
        this.f27086b = interfaceC9079g;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    public void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        this.f27073a.mo20285d(new a(interfaceC6992q, this.f27086b));
    }
}
