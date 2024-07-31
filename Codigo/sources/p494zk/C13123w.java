package p494zk;

import hk.C7752d;
import p124gk.Continuation;

/* renamed from: zk.w */
/* loaded from: classes3.dex */
final class C13123w<T> extends C13050d2 implements InterfaceC13119v<T> {
    public C13123w(InterfaceC13125w1 interfaceC13125w1) {
        super(true);
        m43115b0(interfaceC13125w1);
    }

    @Override // p494zk.InterfaceC13119v
    /* renamed from: B */
    public boolean mo43306B(T t10) {
        return m43121l0(t10);
    }

    @Override // p494zk.C13050d2
    /* renamed from: V */
    public boolean mo43111V() {
        return true;
    }

    @Override // p494zk.InterfaceC13104r0
    /* renamed from: g */
    public T mo43291g() {
        return (T) m43107M();
    }

    @Override // p494zk.InterfaceC13104r0
    /* renamed from: i0 */
    public Object mo43292i0(Continuation<? super T> continuation) {
        Object m43126u = m43126u(continuation);
        C7752d.m23655c();
        return m43126u;
    }

    @Override // p494zk.InterfaceC13119v
    /* renamed from: y */
    public boolean mo43307y(Throwable th2) {
        return m43121l0(new C13033a0(th2, false, 2, null));
    }
}
