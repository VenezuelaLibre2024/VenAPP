package p317qj;

import dj.AbstractC6981f;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import im.InterfaceC8015b;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;
import p426wj.C12220c;

/* renamed from: qj.t */
/* loaded from: classes3.dex */
public final class C10514t<T> extends AbstractC6981f<T> {

    /* renamed from: b */
    final InterfaceC6989n<T> f26159b;

    /* renamed from: qj.t$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends C12220c<T> implements InterfaceC6987l<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: c */
        InterfaceC7578b f26160c;

        a(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f32683a.mo24632a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26160c, interfaceC7578b)) {
                this.f26160c = interfaceC7578b;
                this.f32683a.mo20249d(this);
            }
        }

        @Override // p426wj.C12220c, im.InterfaceC8016c
        public void cancel() {
            super.cancel();
            this.f26160c.dispose();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f32683a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            m39345e(t10);
        }
    }

    public C10514t(InterfaceC6989n<T> interfaceC6989n) {
        this.f26159b = interfaceC6989n;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f26159b.mo20256a(new a(interfaceC8015b));
    }
}
