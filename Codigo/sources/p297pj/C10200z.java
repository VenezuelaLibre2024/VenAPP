package p297pj;

import dj.AbstractC6981f;
import dj.AbstractC6994s;
import dj.InterfaceC6984i;
import dj.InterfaceC6995t;
import im.InterfaceC8016c;
import java.util.Collection;
import java.util.concurrent.Callable;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p205kj.EnumC9285c;
import p224lj.C9513b;
import p241mj.InterfaceC9592b;
import p426wj.EnumC12224g;
import p449xj.EnumC12499b;
import p471yj.C12727a;

/* renamed from: pj.z */
/* loaded from: classes3.dex */
public final class C10200z<T, U extends Collection<? super T>> extends AbstractC6994s<U> implements InterfaceC9592b<U> {

    /* renamed from: a */
    final AbstractC6981f<T> f25211a;

    /* renamed from: b */
    final Callable<U> f25212b;

    /* renamed from: pj.z$a */
    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> implements InterfaceC6984i<T>, InterfaceC7578b {

        /* renamed from: a */
        final InterfaceC6995t<? super U> f25213a;

        /* renamed from: b */
        InterfaceC8016c f25214b;

        /* renamed from: c */
        U f25215c;

        a(InterfaceC6995t<? super U> interfaceC6995t, U u10) {
            this.f25213a = interfaceC6995t;
            this.f25215c = u10;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            this.f25214b = EnumC12224g.CANCELLED;
            this.f25213a.onSuccess(this.f25215c);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            this.f25215c.add(t10);
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25214b, interfaceC8016c)) {
                this.f25214b = interfaceC8016c;
                this.f25213a.mo20313b(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f25214b.cancel();
            this.f25214b = EnumC12224g.CANCELLED;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f25214b == EnumC12224g.CANCELLED;
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            this.f25215c = null;
            this.f25214b = EnumC12224g.CANCELLED;
            this.f25213a.onError(th2);
        }
    }

    public C10200z(AbstractC6981f<T> abstractC6981f) {
        this(abstractC6981f, EnumC12499b.m40923h());
    }

    public C10200z(AbstractC6981f<T> abstractC6981f, Callable<U> callable) {
        this.f25211a = abstractC6981f;
        this.f25212b = callable;
    }

    @Override // p241mj.InterfaceC9592b
    /* renamed from: d */
    public AbstractC6981f<U> mo28587d() {
        return C12727a.m41989k(new C10199y(this.f25211a, this.f25212b));
    }

    @Override // dj.AbstractC6994s
    /* renamed from: k */
    protected void mo20311k(InterfaceC6995t<? super U> interfaceC6995t) {
        try {
            this.f25211a.m20228H(new a(interfaceC6995t, (Collection) C9513b.m28324d(this.f25212b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC9285c.m27705q(th2, interfaceC6995t);
        }
    }
}
