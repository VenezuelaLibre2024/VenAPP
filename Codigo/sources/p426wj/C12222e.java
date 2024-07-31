package p426wj;

import im.InterfaceC8015b;
import java.util.concurrent.atomic.AtomicInteger;
import p241mj.InterfaceC9597g;

/* renamed from: wj.e */
/* loaded from: classes3.dex */
public final class C12222e<T> extends AtomicInteger implements InterfaceC9597g<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: a */
    final T f32685a;

    /* renamed from: b */
    final InterfaceC8015b<? super T> f32686b;

    public C12222e(InterfaceC8015b<? super T> interfaceC8015b, T t10) {
        this.f32686b = interfaceC8015b;
        this.f32685a = t10;
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
        lazySet(2);
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
        lazySet(1);
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
        if (EnumC12224g.m39359p(j10) && compareAndSet(0, 1)) {
            InterfaceC8015b<? super T> interfaceC8015b = this.f32686b;
            interfaceC8015b.mo24633c(this.f32685a);
            if (get() != 2) {
                interfaceC8015b.mo24632a();
            }
        }
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // p241mj.InterfaceC9596f
    /* renamed from: l */
    public int mo27706l(int i10) {
        return i10 & 1;
    }

    @Override // p241mj.InterfaceC9600j
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p241mj.InterfaceC9600j
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f32685a;
    }
}
