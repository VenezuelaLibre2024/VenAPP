package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;

/* renamed from: qj.s */
/* loaded from: classes3.dex */
public final class C10513s<T> extends AbstractC10495a<T, T> {

    /* renamed from: b */
    final InterfaceC6989n<? extends T> f26154b;

    /* renamed from: qj.s$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC7578b {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26155a;

        /* renamed from: b */
        final InterfaceC6989n<? extends T> f26156b;

        /* renamed from: qj.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C13233a<T> implements InterfaceC6987l<T> {

            /* renamed from: a */
            final InterfaceC6987l<? super T> f26157a;

            /* renamed from: b */
            final AtomicReference<InterfaceC7578b> f26158b;

            C13233a(InterfaceC6987l<? super T> interfaceC6987l, AtomicReference<InterfaceC7578b> atomicReference) {
                this.f26157a = interfaceC6987l;
                this.f26158b = atomicReference;
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: a */
            public void mo20278a() {
                this.f26157a.mo20278a();
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: b */
            public void mo20279b(InterfaceC7578b interfaceC7578b) {
                EnumC9284b.m27697o(this.f26158b, interfaceC7578b);
            }

            @Override // dj.InterfaceC6987l
            public void onError(Throwable th2) {
                this.f26157a.onError(th2);
            }

            @Override // dj.InterfaceC6987l
            public void onSuccess(T t10) {
                this.f26157a.onSuccess(t10);
            }
        }

        a(InterfaceC6987l<? super T> interfaceC6987l, InterfaceC6989n<? extends T> interfaceC6989n) {
            this.f26155a = interfaceC6987l;
            this.f26156b = interfaceC6989n;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            InterfaceC7578b interfaceC7578b = get();
            if (interfaceC7578b == EnumC9284b.DISPOSED || !compareAndSet(interfaceC7578b, null)) {
                return;
            }
            this.f26156b.mo20256a(new C13233a(this.f26155a, this));
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27697o(this, interfaceC7578b)) {
                this.f26155a.mo20279b(this);
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
            this.f26155a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26155a.onSuccess(t10);
        }
    }

    public C10513s(InterfaceC6989n<T> interfaceC6989n, InterfaceC6989n<? extends T> interfaceC6989n2) {
        super(interfaceC6989n);
        this.f26154b = interfaceC6989n2;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this.f26154b));
    }
}
