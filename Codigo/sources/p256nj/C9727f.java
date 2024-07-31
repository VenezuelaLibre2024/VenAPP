package p256nj;

import dj.InterfaceC6995t;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9284b;

/* renamed from: nj.f */
/* loaded from: classes3.dex */
public final class C9727f<T> implements InterfaceC6995t<T> {

    /* renamed from: a */
    final AtomicReference<InterfaceC7578b> f23919a;

    /* renamed from: b */
    final InterfaceC6995t<? super T> f23920b;

    public C9727f(AtomicReference<InterfaceC7578b> atomicReference, InterfaceC6995t<? super T> interfaceC6995t) {
        this.f23919a = atomicReference;
        this.f23920b = interfaceC6995t;
    }

    @Override // dj.InterfaceC6995t
    /* renamed from: b */
    public void mo20313b(InterfaceC7578b interfaceC7578b) {
        EnumC9284b.m27694l(this.f23919a, interfaceC7578b);
    }

    @Override // dj.InterfaceC6995t
    public void onError(Throwable th2) {
        this.f23920b.onError(th2);
    }

    @Override // dj.InterfaceC6995t
    public void onSuccess(T t10) {
        this.f23920b.onSuccess(t10);
    }
}
