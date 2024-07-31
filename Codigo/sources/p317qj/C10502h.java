package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;

/* renamed from: qj.h */
/* loaded from: classes3.dex */
public final class C10502h<T, R> extends AbstractC10495a<T, R> {

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> f26109b;

    /* renamed from: qj.h$a */
    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC7578b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: a */
        final InterfaceC6987l<? super R> f26110a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> f26111b;

        /* renamed from: c */
        InterfaceC7578b f26112c;

        /* renamed from: qj.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C13231a implements InterfaceC6987l<R> {
            C13231a() {
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: a */
            public void mo20278a() {
                a.this.f26110a.mo20278a();
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: b */
            public void mo20279b(InterfaceC7578b interfaceC7578b) {
                EnumC9284b.m27697o(a.this, interfaceC7578b);
            }

            @Override // dj.InterfaceC6987l
            public void onError(Throwable th2) {
                a.this.f26110a.onError(th2);
            }

            @Override // dj.InterfaceC6987l
            public void onSuccess(R r10) {
                a.this.f26110a.onSuccess(r10);
            }
        }

        a(InterfaceC6987l<? super R> interfaceC6987l, InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e) {
            this.f26110a = interfaceC6987l;
            this.f26111b = interfaceC9077e;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26110a.mo20278a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26112c, interfaceC7578b)) {
                this.f26112c = interfaceC7578b;
                this.f26110a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            EnumC9284b.m27692b(this);
            this.f26112c.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return EnumC9284b.m27693i(get());
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26110a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            try {
                InterfaceC6989n interfaceC6989n = (InterfaceC6989n) C9513b.m28324d(this.f26111b.apply(t10), "The mapper returned a null MaybeSource");
                if (mo616h()) {
                    return;
                }
                interfaceC6989n.mo20256a(new C13231a());
            } catch (Exception e10) {
                C7744b.m23648b(e10);
                this.f26110a.onError(e10);
            }
        }
    }

    public C10502h(InterfaceC6989n<T> interfaceC6989n, InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e) {
        super(interfaceC6989n);
        this.f26109b = interfaceC9077e;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super R> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this.f26109b));
    }
}
