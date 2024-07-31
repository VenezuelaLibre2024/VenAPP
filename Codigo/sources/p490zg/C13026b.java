package p490zg;

/* renamed from: zg.b */
/* loaded from: classes2.dex */
public final class C13026b {

    /* renamed from: f */
    public static final C13026b f35359f = new C13026b(929, 3);

    /* renamed from: a */
    private final int[] f35360a;

    /* renamed from: b */
    private final int[] f35361b;

    /* renamed from: c */
    private final C13027c f35362c;

    /* renamed from: d */
    private final C13027c f35363d;

    /* renamed from: e */
    private final int f35364e;

    private C13026b(int i10, int i11) {
        this.f35364e = i10;
        this.f35360a = new int[i10];
        this.f35361b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f35360a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f35361b[this.f35360a[i14]] = i14;
        }
        this.f35362c = new C13027c(this, new int[]{0});
        this.f35363d = new C13027c(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m42996a(int i10, int i11) {
        return (i10 + i11) % this.f35364e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C13027c m42997b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f35362c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C13027c(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m42998c(int i10) {
        return this.f35360a[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C13027c m42999d() {
        return this.f35363d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m43000e() {
        return this.f35364e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C13027c m43001f() {
        return this.f35362c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m43002g(int i10) {
        if (i10 != 0) {
            return this.f35360a[(this.f35364e - this.f35361b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m43003h(int i10) {
        if (i10 != 0) {
            return this.f35361b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m43004i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f35360a;
        int[] iArr2 = this.f35361b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f35364e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m43005j(int i10, int i11) {
        int i12 = this.f35364e;
        return ((i10 + i12) - i11) % i12;
    }
}
