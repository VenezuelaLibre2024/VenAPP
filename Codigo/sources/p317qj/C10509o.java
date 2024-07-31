package p317qj;

import dj.AbstractC6993r;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;

/* renamed from: qj.o */
/* loaded from: classes3.dex */
public final class C10509o<T> extends AbstractC10495a<T, T> {

    /* renamed from: b */
    final AbstractC6993r f26128b;

    /* renamed from: qj.o$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC7578b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26129a;

        /* renamed from: b */
        final AbstractC6993r f26130b;

        /* renamed from: c */
        T f26131c;

        /* renamed from: d */
        Throwable f26132d;

        a(InterfaceC6987l<? super T> interfaceC6987l, AbstractC6993r abstractC6993r) {
            this.f26129a = interfaceC6987l;
            this.f26130b = abstractC6993r;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            EnumC9284b.m27694l(this, this.f26130b.mo20299b(this));
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27697o(this, interfaceC7578b)) {
                this.f26129a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            EnumC9284b.m27692b(this);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return EnumC9284b.m27693i(get());
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26132d = th2;
            EnumC9284b.m27694l(this, this.f26130b.mo20299b(this));
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26131c = t10;
            EnumC9284b.m27694l(this, this.f26130b.mo20299b(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f26132d;
            if (th2 != null) {
                this.f26132d = null;
                this.f26129a.onError(th2);
                return;
            }
            T t10 = this.f26131c;
            if (t10 == null) {
                this.f26129a.mo20278a();
            } else {
                this.f26131c = null;
                this.f26129a.onSuccess(t10);
            }
        }
    }

    public C10509o(InterfaceC6989n<T> interfaceC6989n, AbstractC6993r abstractC6993r) {
        super(interfaceC6989n);
        this.f26128b = abstractC6993r;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this.f26128b));
    }
}
