package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.Collection;
import java.util.concurrent.Callable;
import p145hj.C7744b;
import p224lj.C9513b;
import p426wj.C12220c;
import p426wj.EnumC12221d;
import p426wj.EnumC12224g;

/* renamed from: pj.y */
/* loaded from: classes3.dex */
public final class C10199y<T, U extends Collection<? super T>> extends AbstractC10175a<T, U> {

    /* renamed from: c */
    final Callable<U> f25209c;

    /* renamed from: pj.y$a */
    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> extends C12220c<U> implements InterfaceC6984i<T>, InterfaceC8016c {
        private static final long serialVersionUID = -8134157938864266736L;

        /* renamed from: c */
        InterfaceC8016c f25210c;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC8015b<? super U> interfaceC8015b, U u10) {
            super(interfaceC8015b);
            this.f32684b = u10;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            m39345e(this.f32684b);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            Collection collection = (Collection) this.f32684b;
            if (collection != null) {
                collection.add(t10);
            }
        }

        @Override // p426wj.C12220c, im.InterfaceC8016c
        public void cancel() {
            super.cancel();
            this.f25210c.cancel();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25210c, interfaceC8016c)) {
                this.f25210c = interfaceC8016c;
                this.f32683a.mo20249d(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            this.f32684b = null;
            this.f32683a.onError(th2);
        }
    }

    public C10199y(AbstractC6981f<T> abstractC6981f, Callable<U> callable) {
        super(abstractC6981f);
        this.f25209c = callable;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super U> interfaceC8015b) {
        try {
            this.f24989b.m20228H(new a(interfaceC8015b, (Collection) C9513b.m28324d(this.f25209c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC12221d.m39347h(th2, interfaceC8015b);
        }
    }
}
