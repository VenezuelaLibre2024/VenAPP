package p256nj;

import dj.InterfaceC6992q;
import p471yj.C12727a;

/* renamed from: nj.d */
/* loaded from: classes3.dex */
public class C9725d<T> extends AbstractC9723b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: a */
    protected final InterfaceC6992q<? super T> f23917a;

    /* renamed from: b */
    protected T f23918b;

    public C9725d(InterfaceC6992q<? super T> interfaceC6992q) {
        this.f23917a = interfaceC6992q;
    }

    @Override // p241mj.InterfaceC9600j
    public final void clear() {
        lazySet(32);
        this.f23918b = null;
    }

    /* renamed from: d */
    public final void m29157d() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f23917a.mo605a();
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        set(4);
        this.f23918b = null;
    }

    /* renamed from: e */
    public final void m29158e(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        InterfaceC6992q<? super T> interfaceC6992q = this.f23917a;
        if (i10 == 8) {
            this.f23918b = t10;
            lazySet(16);
            t10 = null;
        } else {
            lazySet(2);
        }
        interfaceC6992q.mo607c(t10);
        if (get() != 4) {
            interfaceC6992q.mo605a();
        }
    }

    /* renamed from: f */
    public final void m29159f(Throwable th2) {
        if ((get() & 54) != 0) {
            C12727a.m41995q(th2);
        } else {
            lazySet(2);
            this.f23917a.onError(th2);
        }
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public final boolean mo616h() {
        return get() == 4;
    }

    @Override // p241mj.InterfaceC9600j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p241mj.InterfaceC9596f
    /* renamed from: l */
    public final int mo27706l(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // p241mj.InterfaceC9600j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f23918b;
        this.f23918b = null;
        lazySet(32);
        return t10;
    }
}
