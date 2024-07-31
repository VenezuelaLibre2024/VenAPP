package p317qj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;

/* renamed from: qj.g */
/* loaded from: classes3.dex */
public final class C10501g<T> extends AbstractC6977b {

    /* renamed from: a */
    final InterfaceC6989n<T> f26105a;

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends InterfaceC6979d> f26106b;

    /* renamed from: qj.g$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC6978c, InterfaceC7578b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: a */
        final InterfaceC6978c f26107a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends InterfaceC6979d> f26108b;

        a(InterfaceC6978c interfaceC6978c, InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e) {
            this.f26107a = interfaceC6978c;
            this.f26108b = interfaceC9077e;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26107a.mo20210a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            EnumC9284b.m27694l(this, interfaceC7578b);
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
            this.f26107a.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            try {
                InterfaceC6979d interfaceC6979d = (InterfaceC6979d) C9513b.m28324d(this.f26108b.apply(t10), "The mapper returned a null CompletableSource");
                if (mo616h()) {
                    return;
                }
                interfaceC6979d.mo20199a(this);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                onError(th2);
            }
        }
    }

    public C10501g(InterfaceC6989n<T> interfaceC6989n, InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e) {
        this.f26105a = interfaceC6989n;
        this.f26106b = interfaceC9077e;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        a aVar = new a(interfaceC6978c, this.f26106b);
        interfaceC6978c.mo20211b(aVar);
        this.f26105a.mo20256a(aVar);
    }
}
