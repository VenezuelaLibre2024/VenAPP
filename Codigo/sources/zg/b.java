package zg;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f */
    public static final b f32808f = new b(929, 3);

    /* renamed from: a */
    private final int[] f32809a;

    /* renamed from: b */
    private final int[] f32810b;

    /* renamed from: c */
    private final c f32811c;

    /* renamed from: d */
    private final c f32812d;

    /* renamed from: e */
    private final int f32813e;

    private b(int i10, int i11) {
        this.f32813e = i10;
        this.f32809a = new int[i10];
        this.f32810b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f32809a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f32810b[this.f32809a[i14]] = i14;
        }
        this.f32811c = new c(this, new int[]{0});
        this.f32812d = new c(this, new int[]{1});
    }

    public int a(int i10, int i11) {
        return (i10 + i11) % this.f32813e;
    }

    public c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f32811c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new c(this, iArr);
    }

    public int c(int i10) {
        return this.f32809a[i10];
    }

    public c d() {
        return this.f32812d;
    }

    public int e() {
        return this.f32813e;
    }

    public c f() {
        return this.f32811c;
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.f32809a[(this.f32813e - this.f32810b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f32810b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f32809a;
        int[] iArr2 = this.f32810b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f32813e - 1)];
    }

    public int j(int i10, int i11) {
        int i12 = this.f32813e;
        return ((i10 + i12) - i11) % i12;
    }
}
