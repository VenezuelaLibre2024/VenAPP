package p317qj;

import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;

/* renamed from: qj.p */
/* loaded from: classes3.dex */
public final class C10510p<T> extends AbstractC10495a<T, T> {

    /* renamed from: b */
    final InterfaceC9077e<? super Throwable, ? extends InterfaceC6989n<? extends T>> f26133b;

    /* renamed from: c */
    final boolean f26134c;

    /* renamed from: qj.p$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC7578b {
        private static final long serialVersionUID = 2026620218879969836L;

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26135a;

        /* renamed from: b */
        final InterfaceC9077e<? super Throwable, ? extends InterfaceC6989n<? extends T>> f26136b;

        /* renamed from: c */
        final boolean f26137c;

        /* renamed from: qj.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C13232a<T> implements InterfaceC6987l<T> {

            /* renamed from: a */
            final InterfaceC6987l<? super T> f26138a;

            /* renamed from: b */
            final AtomicReference<InterfaceC7578b> f26139b;

            C13232a(InterfaceC6987l<? super T> interfaceC6987l, AtomicReference<InterfaceC7578b> atomicReference) {
                this.f26138a = interfaceC6987l;
                this.f26139b = atomicReference;
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: a */
            public void mo20278a() {
                this.f26138a.mo20278a();
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: b */
            public void mo20279b(InterfaceC7578b interfaceC7578b) {
                EnumC9284b.m27697o(this.f26139b, interfaceC7578b);
            }

            @Override // dj.InterfaceC6987l
            public void onError(Throwable th2) {
                this.f26138a.onError(th2);
            }

            @Override // dj.InterfaceC6987l
            public void onSuccess(T t10) {
                this.f26138a.onSuccess(t10);
            }
        }

        a(InterfaceC6987l<? super T> interfaceC6987l, InterfaceC9077e<? super Throwable, ? extends InterfaceC6989n<? extends T>> interfaceC9077e, boolean z10) {
            this.f26135a = interfaceC6987l;
            this.f26136b = interfaceC9077e;
            this.f26137c = z10;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26135a.mo20278a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27697o(this, interfaceC7578b)) {
                this.f26135a.mo20279b(this);
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
            if (!this.f26137c && !(th2 instanceof Exception)) {
                this.f26135a.onError(th2);
                return;
            }
            try {
                InterfaceC6989n interfaceC6989n = (InterfaceC6989n) C9513b.m28324d(this.f26136b.apply(th2), "The resumeFunction returned a null MaybeSource");
                EnumC9284b.m27694l(this, null);
                interfaceC6989n.mo20256a(new C13232a(this.f26135a, this));
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f26135a.onError(new C7743a(th2, th3));
            }
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26135a.onSuccess(t10);
        }
    }

    public C10510p(InterfaceC6989n<T> interfaceC6989n, InterfaceC9077e<? super Throwable, ? extends InterfaceC6989n<? extends T>> interfaceC9077e, boolean z10) {
        super(interfaceC6989n);
        this.f26133b = interfaceC9077e;
        this.f26134c = z10;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26089a.mo20256a(new a(interfaceC6987l, this.f26133b, this.f26134c));
    }
}
