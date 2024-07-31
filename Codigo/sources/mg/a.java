package mg;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h */
    public static final a f21486h = new a(4201, RecognitionOptions.AZTEC, 1);

    /* renamed from: i */
    public static final a f21487i = new a(1033, RecognitionOptions.UPC_E, 1);

    /* renamed from: j */
    public static final a f21488j;

    /* renamed from: k */
    public static final a f21489k;

    /* renamed from: l */
    public static final a f21490l;

    /* renamed from: m */
    public static final a f21491m;

    /* renamed from: n */
    public static final a f21492n;

    /* renamed from: o */
    public static final a f21493o;

    /* renamed from: a */
    private final int[] f21494a;

    /* renamed from: b */
    private final int[] f21495b;

    /* renamed from: c */
    private final b f21496c;

    /* renamed from: d */
    private final b f21497d;

    /* renamed from: e */
    private final int f21498e;

    /* renamed from: f */
    private final int f21499f;

    /* renamed from: g */
    private final int f21500g;

    static {
        a aVar = new a(67, 64, 1);
        f21488j = aVar;
        f21489k = new a(19, 16, 1);
        f21490l = new a(285, RecognitionOptions.QR_CODE, 0);
        a aVar2 = new a(301, RecognitionOptions.QR_CODE, 1);
        f21491m = aVar2;
        f21492n = aVar2;
        f21493o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f21499f = i10;
        this.f21498e = i11;
        this.f21500g = i12;
        this.f21494a = new int[i11];
        this.f21495b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f21494a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f21495b[this.f21494a[i15]] = i15;
        }
        this.f21496c = new b(this, new int[]{0});
        this.f21497d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f21496c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public int c(int i10) {
        return this.f21494a[i10];
    }

    public int d() {
        return this.f21500g;
    }

    public b e() {
        return this.f21497d;
    }

    public int f() {
        return this.f21498e;
    }

    public b g() {
        return this.f21496c;
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f21494a[(this.f21498e - this.f21495b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i10) {
        if (i10 != 0) {
            return this.f21495b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f21494a;
        int[] iArr2 = this.f21495b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f21498e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f21499f) + ',' + this.f21498e + ')';
    }
}
