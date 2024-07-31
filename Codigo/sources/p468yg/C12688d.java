package p468yg;

/* renamed from: yg.d */
/* loaded from: classes2.dex */
final class C12688d {

    /* renamed from: a */
    private final int f34392a;

    /* renamed from: b */
    private final int f34393b;

    /* renamed from: c */
    private final int f34394c;

    /* renamed from: d */
    private final int f34395d;

    /* renamed from: e */
    private int f34396e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12688d(int i10, int i11, int i12, int i13) {
        this.f34392a = i10;
        this.f34393b = i11;
        this.f34394c = i12;
        this.f34395d = i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m41760a() {
        return this.f34394c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m41761b() {
        return this.f34393b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m41762c() {
        return this.f34396e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m41763d() {
        return this.f34392a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m41764e() {
        return this.f34395d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m41765f() {
        return this.f34393b - this.f34392a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m41766g() {
        return m41767h(this.f34396e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m41767h(int i10) {
        return i10 != -1 && this.f34394c == (i10 % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m41768i(int i10) {
        this.f34396e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m41769j() {
        this.f34396e = ((this.f34395d / 30) * 3) + (this.f34394c / 3);
    }

    public String toString() {
        return this.f34396e + "|" + this.f34395d;
    }
}
