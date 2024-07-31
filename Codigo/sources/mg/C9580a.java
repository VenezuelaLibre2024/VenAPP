package mg;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: mg.a */
/* loaded from: classes2.dex */
public final class C9580a {

    /* renamed from: h */
    public static final C9580a f23340h = new C9580a(4201, RecognitionOptions.AZTEC, 1);

    /* renamed from: i */
    public static final C9580a f23341i = new C9580a(1033, RecognitionOptions.UPC_E, 1);

    /* renamed from: j */
    public static final C9580a f23342j;

    /* renamed from: k */
    public static final C9580a f23343k;

    /* renamed from: l */
    public static final C9580a f23344l;

    /* renamed from: m */
    public static final C9580a f23345m;

    /* renamed from: n */
    public static final C9580a f23346n;

    /* renamed from: o */
    public static final C9580a f23347o;

    /* renamed from: a */
    private final int[] f23348a;

    /* renamed from: b */
    private final int[] f23349b;

    /* renamed from: c */
    private final C9581b f23350c;

    /* renamed from: d */
    private final C9581b f23351d;

    /* renamed from: e */
    private final int f23352e;

    /* renamed from: f */
    private final int f23353f;

    /* renamed from: g */
    private final int f23354g;

    static {
        C9580a c9580a = new C9580a(67, 64, 1);
        f23342j = c9580a;
        f23343k = new C9580a(19, 16, 1);
        f23344l = new C9580a(285, RecognitionOptions.QR_CODE, 0);
        C9580a c9580a2 = new C9580a(301, RecognitionOptions.QR_CODE, 1);
        f23345m = c9580a2;
        f23346n = c9580a2;
        f23347o = c9580a;
    }

    public C9580a(int i10, int i11, int i12) {
        this.f23353f = i10;
        this.f23352e = i11;
        this.f23354g = i12;
        this.f23348a = new int[i11];
        this.f23349b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f23348a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f23349b[this.f23348a[i15]] = i15;
        }
        this.f23350c = new C9581b(this, new int[]{0});
        this.f23351d = new C9581b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m28531a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C9581b m28532b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f23350c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C9581b(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m28533c(int i10) {
        return this.f23348a[i10];
    }

    /* renamed from: d */
    public int m28534d() {
        return this.f23354g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C9581b m28535e() {
        return this.f23351d;
    }

    /* renamed from: f */
    public int m28536f() {
        return this.f23352e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C9581b m28537g() {
        return this.f23350c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m28538h(int i10) {
        if (i10 != 0) {
            return this.f23348a[(this.f23352e - this.f23349b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m28539i(int i10) {
        if (i10 != 0) {
            return this.f23349b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m28540j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f23348a;
        int[] iArr2 = this.f23349b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f23352e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f23353f) + ',' + this.f23352e + ')';
    }
}
