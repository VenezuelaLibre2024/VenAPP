package yg;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f31856a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31857b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31858c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31859d;

    /* renamed from: e, reason: collision with root package name */
    private int f31860e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i10, int i11, int i12, int i13) {
        this.f31856a = i10;
        this.f31857b = i11;
        this.f31858c = i12;
        this.f31859d = i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f31858c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f31857b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f31860e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f31856a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f31859d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f31857b - this.f31856a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return h(this.f31860e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(int i10) {
        return i10 != -1 && this.f31858c == (i10 % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10) {
        this.f31860e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f31860e = ((this.f31859d / 30) * 3) + (this.f31858c / 3);
    }

    public String toString() {
        return this.f31860e + "|" + this.f31859d;
    }
}
