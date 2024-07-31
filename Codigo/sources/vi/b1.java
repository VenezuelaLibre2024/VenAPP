package vi;

/* loaded from: classes3.dex */
abstract class b1<ReqT, RespT> extends g<ReqT, RespT> {
    @Override // vi.g
    public void a(String str, Throwable th2) {
        f().a(str, th2);
    }

    @Override // vi.g
    public void b() {
        f().b();
    }

    @Override // vi.g
    public void c(int i10) {
        f().c(i10);
    }

    protected abstract g<?, ?> f();

    public String toString() {
        return eb.i.c(this).d("delegate", f()).toString();
    }
}
