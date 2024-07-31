package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p241mj.InterfaceC9591a;
import p404vj.AbstractC11960a;
import p404vj.AbstractC11961b;

/* renamed from: pj.q */
/* loaded from: classes3.dex */
public final class C10191q<T, U> extends AbstractC10175a<T, U> {

    /* renamed from: c */
    final InterfaceC9077e<? super T, ? extends U> f25137c;

    /* renamed from: pj.q$a */
    /* loaded from: classes3.dex */
    static final class a<T, U> extends AbstractC11960a<T, U> {

        /* renamed from: f */
        final InterfaceC9077e<? super T, ? extends U> f25138f;

        a(InterfaceC9591a<? super U> interfaceC9591a, InterfaceC9077e<? super T, ? extends U> interfaceC9077e) {
            super(interfaceC9591a);
            this.f25138f = interfaceC9077e;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f31728d) {
                return;
            }
            if (this.f31729e != 0) {
                this.f31725a.mo24633c(null);
                return;
            }
            try {
                this.f31725a.mo24633c(C9513b.m28324d(this.f25138f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                m38388g(th2);
            }
        }

        @Override // p241mj.InterfaceC9591a
        /* renamed from: f */
        public boolean mo28586f(T t10) {
            if (this.f31728d) {
                return false;
            }
            try {
                return this.f31725a.mo28586f(C9513b.m28324d(this.f25138f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                m38388g(th2);
                return true;
            }
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return m38389h(i10);
        }

        @Override // p241mj.InterfaceC9600j
        public U poll() {
            T poll = this.f31727c.poll();
            if (poll != null) {
                return (U) C9513b.m28324d(this.f25138f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* renamed from: pj.q$b */
    /* loaded from: classes3.dex */
    static final class b<T, U> extends AbstractC11961b<T, U> {

        /* renamed from: f */
        final InterfaceC9077e<? super T, ? extends U> f25139f;

        b(InterfaceC8015b<? super U> interfaceC8015b, InterfaceC9077e<? super T, ? extends U> interfaceC9077e) {
            super(interfaceC8015b);
            this.f25139f = interfaceC9077e;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f31733d) {
                return;
            }
            if (this.f31734e != 0) {
                this.f31730a.mo24633c(null);
                return;
            }
            try {
                this.f31730a.mo24633c(C9513b.m28324d(this.f25139f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                m38392g(th2);
            }
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return m38393h(i10);
        }

        @Override // p241mj.InterfaceC9600j
        public U poll() {
            T poll = this.f31732c.poll();
            if (poll != null) {
                return (U) C9513b.m28324d(this.f25139f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C10191q(AbstractC6981f<T> abstractC6981f, InterfaceC9077e<? super T, ? extends U> interfaceC9077e) {
        super(abstractC6981f);
        this.f25137c = interfaceC9077e;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super U> interfaceC8015b) {
        AbstractC6981f<T> abstractC6981f;
        InterfaceC6984i<? super T> bVar;
        if (interfaceC8015b instanceof InterfaceC9591a) {
            abstractC6981f = this.f24989b;
            bVar = new a<>((InterfaceC9591a) interfaceC8015b, this.f25137c);
        } else {
            abstractC6981f = this.f24989b;
            bVar = new b<>(interfaceC8015b, this.f25137c);
        }
        abstractC6981f.m20228H(bVar);
    }
}
