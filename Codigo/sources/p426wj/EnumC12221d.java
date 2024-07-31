package p426wj;

import im.InterfaceC8015b;
import p241mj.InterfaceC9597g;

/* renamed from: wj.d */
/* loaded from: classes3.dex */
public enum EnumC12221d implements InterfaceC9597g<Object> {
    INSTANCE;

    /* renamed from: b */
    public static void m39346b(InterfaceC8015b<?> interfaceC8015b) {
        interfaceC8015b.mo20249d(INSTANCE);
        interfaceC8015b.mo24632a();
    }

    /* renamed from: h */
    public static void m39347h(Throwable th2, InterfaceC8015b<?> interfaceC8015b) {
        interfaceC8015b.mo20249d(INSTANCE);
        interfaceC8015b.onError(th2);
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
        EnumC12224g.m39359p(j10);
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return true;
    }

    @Override // p241mj.InterfaceC9596f
    /* renamed from: l */
    public int mo27706l(int i10) {
        return i10 & 2;
    }

    @Override // p241mj.InterfaceC9600j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p241mj.InterfaceC9600j
    public Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
