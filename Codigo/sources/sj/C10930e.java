package sj;

import dj.AbstractC6981f;
import dj.InterfaceC6995t;
import dj.InterfaceC6996u;
import im.InterfaceC8015b;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;
import p426wj.C12220c;

/* renamed from: sj.e */
/* loaded from: classes3.dex */
public final class C10930e<T> extends AbstractC6981f<T> {

    /* renamed from: b */
    final InterfaceC6996u<? extends T> f27825b;

    /* renamed from: sj.e$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends C12220c<T> implements InterfaceC6995t<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: c */
        InterfaceC7578b f27826c;

        a(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
        }

        @Override // dj.InterfaceC6995t
        /* renamed from: b */
        public void mo20313b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f27826c, interfaceC7578b)) {
                this.f27826c = interfaceC7578b;
                this.f32683a.mo20249d(this);
            }
        }

        @Override // p426wj.C12220c, im.InterfaceC8016c
        public void cancel() {
            super.cancel();
            this.f27826c.dispose();
        }

        @Override // dj.InterfaceC6995t
        public void onError(Throwable th2) {
            this.f32683a.onError(th2);
        }

        @Override // dj.InterfaceC6995t
        public void onSuccess(T t10) {
            m39345e(t10);
        }
    }

    public C10930e(InterfaceC6996u<? extends T> interfaceC6996u) {
        this.f27825b = interfaceC6996u;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    public void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f27825b.mo20305c(new a(interfaceC8015b));
    }
}
