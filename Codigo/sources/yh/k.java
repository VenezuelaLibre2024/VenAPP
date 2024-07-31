package yh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final j f31926a;

    /* renamed from: b, reason: collision with root package name */
    final Runnable f31927b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j jVar, Runnable runnable) {
        this.f31926a = jVar;
        this.f31927b = runnable;
    }

    public Integer a() {
        j jVar = this.f31926a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f31926a;
        return jVar != null && jVar.b();
    }
}
