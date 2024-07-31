package wj;

/* loaded from: classes3.dex */
public enum d implements mj.g<Object> {
    INSTANCE;

    public static void b(im.b<?> bVar) {
        bVar.d(INSTANCE);
        bVar.a();
    }

    public static void h(Throwable th2, im.b<?> bVar) {
        bVar.d(INSTANCE);
        bVar.onError(th2);
    }

    @Override // im.c
    public void cancel() {
    }

    @Override // mj.j
    public void clear() {
    }

    @Override // im.c
    public void i(long j10) {
        g.p(j10);
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

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
