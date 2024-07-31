package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import p186jj.InterfaceC9079g;
import p241mj.InterfaceC9591a;
import p241mj.InterfaceC9597g;
import p404vj.AbstractC11960a;
import p404vj.AbstractC11961b;

/* renamed from: pj.h */
/* loaded from: classes3.dex */
public final class C10182h<T> extends AbstractC10175a<T, T> {

    /* renamed from: c */
    final InterfaceC9079g<? super T> f25057c;

    /* renamed from: pj.h$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AbstractC11960a<T, T> {

        /* renamed from: f */
        final InterfaceC9079g<? super T> f25058f;

        a(InterfaceC9591a<? super T> interfaceC9591a, InterfaceC9079g<? super T> interfaceC9079g) {
            super(interfaceC9591a);
            this.f25058f = interfaceC9079g;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (mo28586f(t10)) {
                return;
            }
            this.f31726b.mo24634i(1L);
        }

        @Override // p241mj.InterfaceC9591a
        /* renamed from: f */
        public boolean mo28586f(T t10) {
            if (this.f31728d) {
                return false;
            }
            if (this.f31729e != 0) {
                return this.f31725a.mo28586f(null);
            }
            try {
                return this.f25058f.test(t10) && this.f31725a.mo28586f(t10);
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
        public T poll() {
            InterfaceC9597g<T> interfaceC9597g = this.f31727c;
            InterfaceC9079g<? super T> interfaceC9079g = this.f25058f;
            while (true) {
                T poll = interfaceC9597g.poll();
                if (poll == null) {
                    return null;
                }
                if (interfaceC9079g.test(poll)) {
                    return poll;
                }
                if (this.f31729e == 2) {
                    interfaceC9597g.mo24634i(1L);
                }
            }
        }
    }

    /* renamed from: pj.h$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends AbstractC11961b<T, T> implements InterfaceC9591a<T> {

        /* renamed from: f */
        final InterfaceC9079g<? super T> f25059f;

        b(InterfaceC8015b<? super T> interfaceC8015b, InterfaceC9079g<? super T> interfaceC9079g) {
            super(interfaceC8015b);
            this.f25059f = interfaceC9079g;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (mo28586f(t10)) {
                return;
            }
            this.f31731b.mo24634i(1L);
        }

        @Override // p241mj.InterfaceC9591a
        /* renamed from: f */
        public boolean mo28586f(T t10) {
            if (this.f31733d) {
                return false;
            }
            if (this.f31734e != 0) {
                this.f31730a.mo24633c(null);
                return true;
            }
            try {
                boolean test = this.f25059f.test(t10);
                if (test) {
                    this.f31730a.mo24633c(t10);
                }
                return test;
            } catch (Throwable th2) {
                m38392g(th2);
                return true;
            }
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return m38393h(i10);
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            InterfaceC9597g<T> interfaceC9597g = this.f31732c;
            InterfaceC9079g<? super T> interfaceC9079g = this.f25059f;
            while (true) {
                T poll = interfaceC9597g.poll();
                if (poll == null) {
                    return null;
                }
                if (interfaceC9079g.test(poll)) {
                    return poll;
                }
                if (this.f31734e == 2) {
                    interfaceC9597g.mo24634i(1L);
                }
            }
        }
    }

    public C10182h(AbstractC6981f<T> abstractC6981f, InterfaceC9079g<? super T> interfaceC9079g) {
        super(abstractC6981f);
        this.f25057c = interfaceC9079g;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        AbstractC6981f<T> abstractC6981f;
        InterfaceC6984i<? super T> bVar;
        if (interfaceC8015b instanceof InterfaceC9591a) {
            abstractC6981f = this.f24989b;
            bVar = new a<>((InterfaceC9591a) interfaceC8015b, this.f25057c);
        } else {
            abstractC6981f = this.f24989b;
            bVar = new b<>(interfaceC8015b, this.f25057c);
        }
        abstractC6981f.m20228H(bVar);
    }
}
