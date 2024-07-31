package p286p3;

import p036c4.C1870k;
import p171j3.InterfaceC8975v;

/* renamed from: p3.m */
/* loaded from: classes.dex */
public class C10052m<T> implements InterfaceC8975v<T> {

    /* renamed from: a */
    protected final T f24688a;

    public C10052m(T t10) {
        this.f24688a = (T) C1870k.m9950d(t10);
    }

    @Override // p171j3.InterfaceC8975v
    public final T get() {
        return this.f24688a;
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public final int mo26309p() {
        return 1;
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public void mo26310q() {
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<T> mo26311r() {
        return (Class<T>) this.f24688a.getClass();
    }
}
