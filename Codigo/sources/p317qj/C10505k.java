package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;

/* renamed from: qj.k */
/* loaded from: classes3.dex */
public final class C10505k<T> extends AbstractC10495a<T, Boolean> {

    /* renamed from: qj.k$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6987l<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super Boolean> f26118a;

        /* renamed from: b */
        InterfaceC7578b f26119b;

        a(InterfaceC6987l<? super Boolean> interfaceC6987l) {
            this.f26118a = interfaceC6987l;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26118a.onSuccess(Boolean.TRUE);
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26119b, interfaceC7578b)) {
                this.f26119b = interfaceC7578b;
                this.f26118a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f26119b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26119b.mo616h();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26118a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26118a.onSuccess(Boolean.FALSE);
        }
    }

    public C10505k(InterfaceC6989n<T> interfaceC6989n) {
        super(interfaceC6989n);
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super Boolean> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l));
    }
}
