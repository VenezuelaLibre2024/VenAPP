package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9079g;
import p205kj.EnumC9284b;

/* renamed from: qj.e */
/* loaded from: classes3.dex */
public final class C10499e<T> extends AbstractC10495a<T, T> {

    /* renamed from: b */
    final InterfaceC9079g<? super T> f26096b;

    /* renamed from: qj.e$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6987l<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26097a;

        /* renamed from: b */
        final InterfaceC9079g<? super T> f26098b;

        /* renamed from: c */
        InterfaceC7578b f26099c;

        a(InterfaceC6987l<? super T> interfaceC6987l, InterfaceC9079g<? super T> interfaceC9079g) {
            this.f26097a = interfaceC6987l;
            this.f26098b = interfaceC9079g;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26097a.mo20278a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26099c, interfaceC7578b)) {
                this.f26099c = interfaceC7578b;
                this.f26097a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            InterfaceC7578b interfaceC7578b = this.f26099c;
            this.f26099c = EnumC9284b.DISPOSED;
            interfaceC7578b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26099c.mo616h();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26097a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            try {
                if (this.f26098b.test(t10)) {
                    this.f26097a.onSuccess(t10);
                } else {
                    this.f26097a.mo20278a();
                }
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f26097a.onError(th2);
            }
        }
    }

    public C10499e(InterfaceC6989n<T> interfaceC6989n, InterfaceC9079g<? super T> interfaceC9079g) {
        super(interfaceC6989n);
        this.f26096b = interfaceC9079g;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this.f26096b));
    }
}
