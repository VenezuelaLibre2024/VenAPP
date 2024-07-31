package oc;

/* loaded from: classes.dex */
final class n1 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    private String f22419a;

    /* renamed from: b, reason: collision with root package name */
    private String f22420b;

    @Override // oc.j1
    public final g1 a() {
        return new k1(this.f22419a, this.f22420b);
    }

    @Override // oc.j1
    public final j1 b(String str) {
        this.f22420b = str;
        return this;
    }

    @Override // oc.j1
    public final j1 c(String str) {
        this.f22419a = str;
        return this;
    }
}
