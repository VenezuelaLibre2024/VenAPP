package sj;

import dj.AbstractC6994s;
import dj.InterfaceC6995t;
import dj.InterfaceC6996u;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9076d;

/* renamed from: sj.a */
/* loaded from: classes3.dex */
public final class C10926a<T> extends AbstractC6994s<T> {

    /* renamed from: a */
    final InterfaceC6996u<T> f27812a;

    /* renamed from: b */
    final InterfaceC9076d<? super Throwable> f27813b;

    /* renamed from: sj.a$a */
    /* loaded from: classes3.dex */
    final class a implements InterfaceC6995t<T> {

        /* renamed from: a */
        private final InterfaceC6995t<? super T> f27814a;

        a(InterfaceC6995t<? super T> interfaceC6995t) {
            this.f27814a = interfaceC6995t;
        }

        @Override // dj.InterfaceC6995t
        /* renamed from: b */
        public void mo20313b(InterfaceC7578b interfaceC7578b) {
            this.f27814a.mo20313b(interfaceC7578b);
        }

        @Override // dj.InterfaceC6995t
        public void onError(Throwable th2) {
            try {
                C10926a.this.f27813b.accept(th2);
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                th2 = new C7743a(th2, th3);
            }
            this.f27814a.onError(th2);
        }

        @Override // dj.InterfaceC6995t
        public void onSuccess(T t10) {
            this.f27814a.onSuccess(t10);
        }
    }

    public C10926a(InterfaceC6996u<T> interfaceC6996u, InterfaceC9076d<? super Throwable> interfaceC9076d) {
        this.f27812a = interfaceC6996u;
        this.f27813b = interfaceC9076d;
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super T> interfaceC6995t) {
        this.f27812a.mo20305c(new a(interfaceC6995t));
    }
}
