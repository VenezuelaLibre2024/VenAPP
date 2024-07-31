package p3;

import j3.v;

/* loaded from: classes.dex */
public class m<T> implements v<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final T f22755a;

    public m(T t10) {
        this.f22755a = (T) c4.k.d(t10);
    }

    @Override // j3.v
    public final T get() {
        return this.f22755a;
    }

    @Override // j3.v
    public final int p() {
        return 1;
    }

    @Override // j3.v
    public void q() {
    }

    @Override // j3.v
    public Class<T> r() {
        return (Class<T>) this.f22755a.getClass();
    }
}
