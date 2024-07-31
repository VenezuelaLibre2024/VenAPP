package p297pj;

import dj.AbstractC6981f;
import dj.AbstractC6990o;
import dj.InterfaceC6992q;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import p123gj.InterfaceC7578b;

/* renamed from: pj.n */
/* loaded from: classes3.dex */
public final class C10188n<T> extends AbstractC6981f<T> {

    /* renamed from: b */
    private final AbstractC6990o<T> f25133b;

    /* renamed from: pj.n$a */
    /* loaded from: classes3.dex */
    static class a<T> implements InterfaceC6992q<T>, InterfaceC8016c {

        /* renamed from: a */
        private final InterfaceC8015b<? super T> f25134a;

        /* renamed from: b */
        private InterfaceC7578b f25135b;

        a(InterfaceC8015b<? super T> interfaceC8015b) {
            this.f25134a = interfaceC8015b;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            this.f25134a.mo24632a();
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            this.f25135b = interfaceC7578b;
            this.f25134a.mo20249d(this);
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            this.f25134a.mo24633c(t10);
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            this.f25135b.dispose();
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            this.f25134a.onError(th2);
        }
    }

    public C10188n(AbstractC6990o<T> abstractC6990o) {
        this.f25133b = abstractC6990o;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f25133b.mo20285d(new a(interfaceC8015b));
    }
}
