package p317qj;

import dj.AbstractC6985j;
import dj.InterfaceC6986k;
import dj.InterfaceC6987l;
import dj.InterfaceC6988m;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p205kj.EnumC9284b;
import p471yj.C12727a;

/* renamed from: qj.c */
/* loaded from: classes3.dex */
public final class C10497c<T> extends AbstractC6985j<T> {

    /* renamed from: a */
    final InterfaceC6988m<T> f26093a;

    /* renamed from: qj.c$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6986k<T>, InterfaceC7578b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final InterfaceC6987l<? super T> f26094a;

        a(InterfaceC6987l<? super T> interfaceC6987l) {
            this.f26094a = interfaceC6987l;
        }

        @Override // dj.InterfaceC6986k
        /* renamed from: a */
        public void mo20277a() {
            InterfaceC7578b andSet;
            InterfaceC7578b interfaceC7578b = get();
            EnumC9284b enumC9284b = EnumC9284b.DISPOSED;
            if (interfaceC7578b == enumC9284b || (andSet = getAndSet(enumC9284b)) == enumC9284b) {
                return;
            }
            try {
                this.f26094a.mo20278a();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        /* renamed from: b */
        public boolean m31577b(Throwable th2) {
            InterfaceC7578b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC7578b interfaceC7578b = get();
            EnumC9284b enumC9284b = EnumC9284b.DISPOSED;
            if (interfaceC7578b == enumC9284b || (andSet = getAndSet(enumC9284b)) == enumC9284b) {
                return false;
            }
            try {
                this.f26094a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
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

        @Override // dj.InterfaceC6986k
        public void onError(Throwable th2) {
            if (m31577b(th2)) {
                return;
            }
            C12727a.m41995q(th2);
        }

        @Override // dj.InterfaceC6986k
        public void onSuccess(T t10) {
            InterfaceC7578b andSet;
            InterfaceC7578b interfaceC7578b = get();
            EnumC9284b enumC9284b = EnumC9284b.DISPOSED;
            if (interfaceC7578b == enumC9284b || (andSet = getAndSet(enumC9284b)) == enumC9284b) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f26094a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f26094a.onSuccess(t10);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C10497c(InterfaceC6988m<T> interfaceC6988m) {
        this.f26093a = interfaceC6988m;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        a aVar = new a(interfaceC6987l);
        interfaceC6987l.mo20279b(aVar);
        try {
            this.f26093a.mo20280a(aVar);
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            aVar.onError(th2);
        }
    }
}
