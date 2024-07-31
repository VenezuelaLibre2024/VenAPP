package p317qj;

import dj.AbstractC6993r;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p205kj.C9287e;
import p205kj.EnumC9284b;

/* renamed from: qj.r */
/* loaded from: classes3.dex */
public final class C10512r<T> extends AbstractC10495a<T, T> {

    /* renamed from: b */
    final AbstractC6993r f26149b;

    /* renamed from: qj.r$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC7578b {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C9287e f26150a = new C9287e();

        /* renamed from: b */
        final InterfaceC6987l<? super T> f26151b;

        a(InterfaceC6987l<? super T> interfaceC6987l) {
            this.f26151b = interfaceC6987l;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26151b.mo20278a();
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            EnumC9284b.m27697o(this, interfaceC7578b);
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            EnumC9284b.m27692b(this);
            this.f26150a.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return EnumC9284b.m27693i(get());
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26151b.onError(th2);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26151b.onSuccess(t10);
        }
    }

    /* renamed from: qj.r$b */
    /* loaded from: classes3.dex */
    static final class b<T> implements Runnable {

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26152a;

        /* renamed from: b */
        final InterfaceC6989n<T> f26153b;

        b(InterfaceC6987l<? super T> interfaceC6987l, InterfaceC6989n<T> interfaceC6989n) {
            this.f26152a = interfaceC6987l;
            this.f26153b = interfaceC6989n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26153b.mo20256a(this.f26152a);
        }
    }

    public C10512r(InterfaceC6989n<T> interfaceC6989n, AbstractC6993r abstractC6993r) {
        super(interfaceC6989n);
        this.f26149b = abstractC6993r;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        a aVar = new a(interfaceC6987l);
        interfaceC6987l.mo20279b(aVar);
        aVar.f26150a.m27708a(this.f26149b.mo20299b(new b(aVar, this.f26089a)));
    }
}
