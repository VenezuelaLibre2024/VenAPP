package p317qj;

import dj.AbstractC6985j;
import dj.AbstractC6994s;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import dj.InterfaceC6995t;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;
import p241mj.InterfaceC9593c;
import p471yj.C12727a;

/* renamed from: qj.l */
/* loaded from: classes3.dex */
public final class C10506l<T> extends AbstractC6994s<Boolean> implements InterfaceC9593c<Boolean> {

    /* renamed from: a */
    final InterfaceC6989n<T> f26120a;

    /* renamed from: qj.l$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6987l<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6995t<? super Boolean> f26121a;

        /* renamed from: b */
        InterfaceC7578b f26122b;

        a(InterfaceC6995t<? super Boolean> interfaceC6995t) {
            this.f26121a = interfaceC6995t;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26122b = EnumC9284b.DISPOSED;
            this.f26121a.onSuccess(Boolean.TRUE);
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26122b, interfaceC7578b)) {
                this.f26122b = interfaceC7578b;
                this.f26121a.mo20313b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f26122b.dispose();
            this.f26122b = EnumC9284b.DISPOSED;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26122b.mo616h();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26122b = EnumC9284b.DISPOSED;
            this.f26121a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26122b = EnumC9284b.DISPOSED;
            this.f26121a.onSuccess(Boolean.FALSE);
        }
    }

    public C10506l(InterfaceC6989n<T> interfaceC6989n) {
        this.f26120a = interfaceC6989n;
    }

    @Override // p241mj.InterfaceC9593c
    /* renamed from: a */
    public AbstractC6985j<Boolean> mo28588a() {
        return C12727a.m41990l(new C10505k(this.f26120a));
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super Boolean> interfaceC6995t) {
        this.f26120a.mo20256a(new a(interfaceC6995t));
    }
}
