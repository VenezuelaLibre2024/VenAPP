package sj;

import dj.AbstractC6994s;
import dj.InterfaceC6995t;
import dj.InterfaceC6996u;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9076d;

/* renamed from: sj.b */
/* loaded from: classes3.dex */
public final class C10927b<T> extends AbstractC6994s<T> {

    /* renamed from: a */
    final InterfaceC6996u<T> f27816a;

    /* renamed from: b */
    final InterfaceC9076d<? super T> f27817b;

    /* renamed from: sj.b$a */
    /* loaded from: classes3.dex */
    final class a implements InterfaceC6995t<T> {

        /* renamed from: a */
        private final InterfaceC6995t<? super T> f27818a;

        a(InterfaceC6995t<? super T> interfaceC6995t) {
            this.f27818a = interfaceC6995t;
        }

        @Override // dj.InterfaceC6995t
        /* renamed from: b */
        public void mo20313b(InterfaceC7578b interfaceC7578b) {
            this.f27818a.mo20313b(interfaceC7578b);
        }

        @Override // dj.InterfaceC6995t
        public void onError(Throwable th2) {
            this.f27818a.onError(th2);
        }

        @Override // dj.InterfaceC6995t
        public void onSuccess(T t10) {
            try {
                C10927b.this.f27817b.accept(t10);
                this.f27818a.onSuccess(t10);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27818a.onError(th2);
            }
        }
    }

    public C10927b(InterfaceC6996u<T> interfaceC6996u, InterfaceC9076d<? super T> interfaceC9076d) {
        this.f27816a = interfaceC6996u;
        this.f27817b = interfaceC9076d;
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super T> interfaceC6995t) {
        this.f27816a.mo20305c(new a(interfaceC6995t));
    }
}
