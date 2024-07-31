package sj;

import dj.AbstractC6994s;
import dj.InterfaceC6995t;
import dj.InterfaceC6996u;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;
import p256nj.C9727f;

/* renamed from: sj.d */
/* loaded from: classes3.dex */
public final class C10929d<T> extends AbstractC6994s<T> {

    /* renamed from: a */
    final InterfaceC6996u<? extends T> f27821a;

    /* renamed from: b */
    final InterfaceC9077e<? super Throwable, ? extends InterfaceC6996u<? extends T>> f27822b;

    /* renamed from: sj.d$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6995t<T>, InterfaceC7578b {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: a */
        final InterfaceC6995t<? super T> f27823a;

        /* renamed from: b */
        final InterfaceC9077e<? super Throwable, ? extends InterfaceC6996u<? extends T>> f27824b;

        a(InterfaceC6995t<? super T> interfaceC6995t, InterfaceC9077e<? super Throwable, ? extends InterfaceC6996u<? extends T>> interfaceC9077e) {
            this.f27823a = interfaceC6995t;
            this.f27824b = interfaceC9077e;
        }

        @Override // dj.InterfaceC6995t
        /* renamed from: b */
        public void mo20313b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27697o(this, interfaceC7578b)) {
                this.f27823a.mo20313b(this);
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

        @Override // dj.InterfaceC6995t
        public void onError(Throwable th2) {
            try {
                ((InterfaceC6996u) C9513b.m28324d(this.f27824b.apply(th2), "The nextFunction returned a null SingleSource.")).mo20305c(new C9727f(this, this.f27823a));
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f27823a.onError(new C7743a(th2, th3));
            }
        }

        @Override // dj.InterfaceC6995t
        public void onSuccess(T t10) {
            this.f27823a.onSuccess(t10);
        }
    }

    public C10929d(InterfaceC6996u<? extends T> interfaceC6996u, InterfaceC9077e<? super Throwable, ? extends InterfaceC6996u<? extends T>> interfaceC9077e) {
        this.f27821a = interfaceC6996u;
        this.f27822b = interfaceC9077e;
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super T> interfaceC6995t) {
        this.f27821a.mo20305c(new a(interfaceC6995t, this.f27822b));
    }
}
