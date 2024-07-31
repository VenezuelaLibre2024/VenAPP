package p426wj;

import im.InterfaceC8015b;

/* renamed from: wj.c */
/* loaded from: classes3.dex */
public class C12220c<T> extends AbstractC12218a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: a */
    protected final InterfaceC8015b<? super T> f32683a;

    /* renamed from: b */
    protected T f32684b;

    public C12220c(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f32683a = interfaceC8015b;
    }

    public void cancel() {
        set(4);
        this.f32684b = null;
    }

    @Override // p241mj.InterfaceC9600j
    public final void clear() {
        lazySet(32);
        this.f32684b = null;
    }

    /* renamed from: e */
    public final void m39345e(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                InterfaceC8015b<? super T> interfaceC8015b = this.f32683a;
                interfaceC8015b.mo24633c(t10);
                if (get() != 4) {
                    interfaceC8015b.mo24632a();
                    return;
                }
                return;
            }
            this.f32684b = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f32684b = null;
                return;
            }
        }
        this.f32684b = t10;
        lazySet(16);
        InterfaceC8015b<? super T> interfaceC8015b2 = this.f32683a;
        interfaceC8015b2.mo24633c(t10);
        if (get() != 4) {
            interfaceC8015b2.mo24632a();
        }
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public final void mo24634i(long j10) {
        T t10;
        if (!EnumC12224g.m39359p(j10)) {
            return;
        }
        do {
            int i10 = get();
            if ((i10 & (-2)) != 0) {
                return;
            }
            if (i10 == 1) {
                if (!compareAndSet(1, 3) || (t10 = this.f32684b) == null) {
                    return;
                }
                this.f32684b = null;
                InterfaceC8015b<? super T> interfaceC8015b = this.f32683a;
                interfaceC8015b.mo24633c(t10);
                if (get() != 4) {
                    interfaceC8015b.mo24632a();
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
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
        lazySet(32);
        T t10 = this.f32684b;
        this.f32684b = null;
        return t10;
    }
}
