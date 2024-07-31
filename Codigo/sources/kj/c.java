package kj;

import dj.l;
import dj.q;
import dj.t;

/* loaded from: classes3.dex */
public enum c implements mj.e<Object> {
    INSTANCE,
    NEVER;

    public static void b(dj.c cVar) {
        cVar.b(INSTANCE);
        cVar.a();
    }

    public static void i(l<?> lVar) {
        lVar.b(INSTANCE);
        lVar.a();
    }

    public static void m(q<?> qVar) {
        qVar.b(INSTANCE);
        qVar.a();
    }

    public static void n(Throwable th2, dj.c cVar) {
        cVar.b(INSTANCE);
        cVar.onError(th2);
    }

    public static void o(Throwable th2, l<?> lVar) {
        lVar.b(INSTANCE);
        lVar.onError(th2);
    }

    public static void p(Throwable th2, q<?> qVar) {
        qVar.b(INSTANCE);
        qVar.onError(th2);
    }

    public static void q(Throwable th2, t<?> tVar) {
        tVar.b(INSTANCE);
        tVar.onError(th2);
    }

    @Override // mj.j
    public void clear() {
    }

    @Override // gj.b
    public void dispose() {
    }

    @Override // gj.b
    public boolean h() {
        return this == INSTANCE;
    }

    @Override // mj.j
    public boolean isEmpty() {
        return true;
    }

    @Override // mj.f
    public int l(int i10) {
        return i10 & 2;
    }

    @Override // mj.j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // mj.j
    public Object poll() {
        return null;
    }
}
