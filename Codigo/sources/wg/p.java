package wg;

/* loaded from: classes2.dex */
final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f29997b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29998c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw dg.h.a();
        }
        this.f29997b = i11;
        this.f29998c = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f29997b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f29998c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f29997b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f29998c == 10;
    }
}
