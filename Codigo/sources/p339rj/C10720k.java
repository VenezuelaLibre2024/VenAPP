package p339rj;

import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p256nj.AbstractC9722a;

/* renamed from: rj.k */
/* loaded from: classes3.dex */
public final class C10720k<T, U> extends AbstractC10710a<T, U> {

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends U> f27144b;

    /* renamed from: rj.k$a */
    /* loaded from: classes3.dex */
    static final class a<T, U> extends AbstractC9722a<T, U> {

        /* renamed from: f */
        final InterfaceC9077e<? super T, ? extends U> f27145f;

        a(InterfaceC6992q<? super U> interfaceC6992q, InterfaceC9077e<? super T, ? extends U> interfaceC9077e) {
            super(interfaceC6992q);
            this.f27145f = interfaceC9077e;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            if (this.f23915d) {
                return;
            }
            if (this.f23916e != 0) {
                this.f23912a.mo607c(null);
                return;
            }
            try {
                this.f23912a.mo607c(C9513b.m28324d(this.f27145f.apply(t10), "The mapper function returned a null value."));
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
        public U poll() {
            T poll = this.f23914c.poll();
            if (poll != null) {
                return (U) C9513b.m28324d(this.f27145f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C10720k(InterfaceC6991p<T> interfaceC6991p, InterfaceC9077e<? super T, ? extends U> interfaceC9077e) {
        super(interfaceC6991p);
        this.f27144b = interfaceC9077e;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    public void mo608s(InterfaceC6992q<? super U> interfaceC6992q) {
        this.f27073a.mo20285d(new a(interfaceC6992q, this.f27144b));
    }
}
