package p317qj;

import dj.AbstractC6985j;
import dj.InterfaceC6987l;
import dj.InterfaceC6995t;
import dj.InterfaceC6996u;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9079g;
import p205kj.EnumC9284b;

/* renamed from: qj.f */
/* loaded from: classes3.dex */
public final class C10500f<T> extends AbstractC6985j<T> {

    /* renamed from: a */
    final InterfaceC6996u<T> f26100a;

    /* renamed from: b */
    final InterfaceC9079g<? super T> f26101b;

    /* renamed from: qj.f$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6995t<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26102a;

        /* renamed from: b */
        final InterfaceC9079g<? super T> f26103b;

        /* renamed from: c */
        InterfaceC7578b f26104c;

        a(InterfaceC6987l<? super T> interfaceC6987l, InterfaceC9079g<? super T> interfaceC9079g) {
            this.f26102a = interfaceC6987l;
            this.f26103b = interfaceC9079g;
        }

        @Override // dj.InterfaceC6995t
        /* renamed from: b */
        public void mo20313b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26104c, interfaceC7578b)) {
                this.f26104c = interfaceC7578b;
                this.f26102a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            InterfaceC7578b interfaceC7578b = this.f26104c;
            this.f26104c = EnumC9284b.DISPOSED;
            interfaceC7578b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26104c.mo616h();
        }

        @Override // dj.InterfaceC6995t
        public void onError(Throwable th2) {
            this.f26102a.onError(th2);
        }

        @Override // dj.InterfaceC6995t
        public void onSuccess(T t10) {
            try {
                if (this.f26103b.test(t10)) {
                    this.f26102a.onSuccess(t10);
                } else {
                    this.f26102a.mo20278a();
                }
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f26102a.onError(th2);
            }
        }
    }

    public C10500f(InterfaceC6996u<T> interfaceC6996u, InterfaceC9079g<? super T> interfaceC9079g) {
        this.f26100a = interfaceC6996u;
        this.f26101b = interfaceC9079g;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26100a.mo20305c(new a(interfaceC6987l, this.f26101b));
    }
}
