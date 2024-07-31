package p490zg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zg.c */
/* loaded from: classes2.dex */
public final class C13027c {

    /* renamed from: a */
    private final C13026b f35365a;

    /* renamed from: b */
    private final int[] f35366b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13027c(C13026b c13026b, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f35365a = c13026b;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f35366b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f35366b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f35366b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C13027c m43006a(C13027c c13027c) {
        if (!this.f35365a.equals(c13027c.f35365a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m43010e()) {
            return c13027c;
        }
        if (c13027c.m43010e()) {
            return this;
        }
        int[] iArr = this.f35366b;
        int[] iArr2 = c13027c.f35366b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = this.f35365a.m42996a(iArr2[i10 - length], iArr[i10]);
        }
        return new C13027c(this.f35365a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m43007b(int i10) {
        if (i10 == 0) {
            return m43008c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f35366b) {
                i11 = this.f35365a.m42996a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f35366b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            C13026b c13026b = this.f35365a;
            i13 = c13026b.m42996a(c13026b.m43004i(i10, i13), this.f35366b[i14]);
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m43008c(int i10) {
        return this.f35366b[(r0.length - 1) - i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m43009d() {
        return this.f35366b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m43010e() {
        return this.f35366b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C13027c m43011f(int i10) {
        if (i10 == 0) {
            return this.f35365a.m43001f();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f35366b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f35365a.m43004i(this.f35366b[i11], i10);
        }
        return new C13027c(this.f35365a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C13027c m43012g(C13027c c13027c) {
        if (!this.f35365a.equals(c13027c.f35365a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m43010e() || c13027c.m43010e()) {
            return this.f35365a.m43001f();
        }
        int[] iArr = this.f35366b;
        int length = iArr.length;
        int[] iArr2 = c13027c.f35366b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                C13026b c13026b = this.f35365a;
                iArr3[i13] = c13026b.m42996a(iArr3[i13], c13026b.m43004i(i11, iArr2[i12]));
            }
        }
        return new C13027c(this.f35365a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C13027c m43013h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f35365a.m43001f();
        }
        int length = this.f35366b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f35365a.m43004i(this.f35366b[i12], i11);
        }
        return new C13027c(this.f35365a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C13027c m43014i() {
        int length = this.f35366b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f35365a.m43005j(0, this.f35366b[i10]);
        }
        return new C13027c(this.f35365a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C13027c m43015j(C13027c c13027c) {
        if (this.f35365a.equals(c13027c.f35365a)) {
            return c13027c.m43010e() ? this : m43006a(c13027c.m43014i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m43009d() * 8);
        for (int m43009d = m43009d(); m43009d >= 0; m43009d--) {
            int m43008c = m43008c(m43009d);
            if (m43008c != 0) {
                if (m43008c < 0) {
                    sb2.append(" - ");
                    m43008c = -m43008c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m43009d == 0 || m43008c != 1) {
                    sb2.append(m43008c);
                }
                if (m43009d != 0) {
                    if (m43009d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m43009d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
