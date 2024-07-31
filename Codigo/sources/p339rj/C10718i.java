package p339rj;

import dj.AbstractC6990o;
import dj.InterfaceC6992q;
import java.util.Iterator;
import p145hj.C7744b;
import p205kj.EnumC9285c;
import p224lj.C9513b;
import p256nj.AbstractC9724c;

/* renamed from: rj.i */
/* loaded from: classes3.dex */
public final class C10718i<T> extends AbstractC6990o<T> {

    /* renamed from: a */
    final Iterable<? extends T> f27136a;

    /* renamed from: rj.i$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AbstractC9724c<T> {

        /* renamed from: a */
        final InterfaceC6992q<? super T> f27137a;

        /* renamed from: b */
        final Iterator<? extends T> f27138b;

        /* renamed from: c */
        volatile boolean f27139c;

        /* renamed from: d */
        boolean f27140d;

        /* renamed from: e */
        boolean f27141e;

        /* renamed from: f */
        boolean f27142f;

        a(InterfaceC6992q<? super T> interfaceC6992q, Iterator<? extends T> it) {
            this.f27137a = interfaceC6992q;
            this.f27138b = it;
        }

        /* renamed from: a */
        void m32606a() {
            while (!mo616h()) {
                try {
                    this.f27137a.mo607c(C9513b.m28324d(this.f27138b.next(), "The iterator returned a null value"));
                    if (mo616h()) {
                        return;
                    }
                    if (!this.f27138b.hasNext()) {
                        if (mo616h()) {
                            return;
                        }
                        this.f27137a.mo605a();
                        return;
                    }
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    this.f27137a.onError(th2);
                    return;
                }
            }
        }

        @Override // p241mj.InterfaceC9600j
        public void clear() {
            this.f27141e = true;
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f27139c = true;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f27139c;
        }

        @Override // p241mj.InterfaceC9600j
        public boolean isEmpty() {
            return this.f27141e;
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f27140d = true;
            return 1;
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            if (this.f27141e) {
                return null;
            }
            if (!this.f27142f) {
                this.f27142f = true;
            } else if (!this.f27138b.hasNext()) {
                this.f27141e = true;
                return null;
            }
            return (T) C9513b.m28324d(this.f27138b.next(), "The iterator returned a null value");
        }
    }

    public C10718i(Iterable<? extends T> iterable) {
        this.f27136a = iterable;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    public void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        try {
            Iterator<? extends T> it = this.f27136a.iterator();
            if (!it.hasNext()) {
                EnumC9285c.m27701m(interfaceC6992q);
                return;
            }
            a aVar = new a(interfaceC6992q, it);
            interfaceC6992q.mo606b(aVar);
            if (aVar.f27140d) {
                return;
            }
            aVar.m32606a();
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC9285c.m27704p(th2, interfaceC6992q);
        }
    }
}
