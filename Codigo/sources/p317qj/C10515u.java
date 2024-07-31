package p317qj;

import dj.AbstractC6990o;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import dj.InterfaceC6992q;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;
import p256nj.C9725d;

/* renamed from: qj.u */
/* loaded from: classes3.dex */
public final class C10515u<T> extends AbstractC6990o<T> {

    /* renamed from: a */
    final InterfaceC6989n<T> f26161a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qj.u$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends C9725d<T> implements InterfaceC6987l<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: c */
        InterfaceC7578b f26162c;

        a(InterfaceC6992q<? super T> interfaceC6992q) {
            super(interfaceC6992q);
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            m29157d();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f26162c, interfaceC7578b)) {
                this.f26162c = interfaceC7578b;
                this.f23917a.mo606b(this);
            }
        }

        @Override // p256nj.C9725d, p123gj.InterfaceC7578b
        public void dispose() {
            super.dispose();
            this.f26162c.dispose();
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            m29159f(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            m29158e(t10);
        }
    }

    public C10515u(InterfaceC6989n<T> interfaceC6989n) {
        this.f26161a = interfaceC6989n;
    }

    /* renamed from: v */
    public static <T> InterfaceC6987l<T> m31580v(InterfaceC6992q<? super T> interfaceC6992q) {
        return new a(interfaceC6992q);
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    protected void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        this.f26161a.mo20256a(m31580v(interfaceC6992q));
    }
}
