package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;

/* renamed from: qj.n */
/* loaded from: classes3.dex */
public final class C10508n<T, R> extends AbstractC10495a<T, R> {

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends R> f26124b;

    /* renamed from: qj.n$a */
    /* loaded from: classes3.dex */
    static final class a<T, R> implements InterfaceC6987l<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super R> f26125a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends R> f26126b;

        /* renamed from: c */
        InterfaceC7578b f26127c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(InterfaceC6987l<? super R> interfaceC6987l, InterfaceC9077e<? super T, ? extends R> interfaceC9077e) {
            this.f26125a = interfaceC6987l;
            this.f26126b = interfaceC9077e;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26125a.mo20278a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26127c, interfaceC7578b)) {
                this.f26127c = interfaceC7578b;
                this.f26125a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            InterfaceC7578b interfaceC7578b = this.f26127c;
            this.f26127c = EnumC9284b.DISPOSED;
            interfaceC7578b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26127c.mo616h();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26125a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            try {
                this.f26125a.onSuccess(C9513b.m28324d(this.f26126b.apply(t10), "The mapper returned a null item"));
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f26125a.onError(th2);
            }
        }
    }

    public C10508n(InterfaceC6989n<T> interfaceC6989n, InterfaceC9077e<? super T, ? extends R> interfaceC9077e) {
        super(interfaceC6989n);
        this.f26124b = interfaceC9077e;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super R> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this.f26124b));
    }
}
