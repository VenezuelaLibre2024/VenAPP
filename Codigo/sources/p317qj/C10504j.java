package p317qj;

import dj.AbstractC6985j;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import dj.InterfaceC6987l;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;

/* renamed from: qj.j */
/* loaded from: classes3.dex */
public final class C10504j<T> extends AbstractC6985j<T> {

    /* renamed from: a */
    final InterfaceC6979d f26115a;

    /* renamed from: qj.j$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC6978c, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26116a;

        /* renamed from: b */
        InterfaceC7578b f26117b;

        a(InterfaceC6987l<? super T> interfaceC6987l) {
            this.f26116a = interfaceC6987l;
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: a */
        public void mo20210a() {
            this.f26117b = EnumC9284b.DISPOSED;
            this.f26116a.mo20278a();
        }

        @Override // dj.InterfaceC6978c
        /* renamed from: b */
        public void mo20211b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26117b, interfaceC7578b)) {
                this.f26117b = interfaceC7578b;
                this.f26116a.mo20279b(this);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f26117b.dispose();
            this.f26117b = EnumC9284b.DISPOSED;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f26117b.mo616h();
        }

        @Override // dj.InterfaceC6978c
        public void onError(Throwable th2) {
            this.f26117b = EnumC9284b.DISPOSED;
            this.f26116a.onError(th2);
        }
    }

    public C10504j(InterfaceC6979d interfaceC6979d) {
        this.f26115a = interfaceC6979d;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        this.f26115a.mo20199a(new a(interfaceC6987l));
    }
}
