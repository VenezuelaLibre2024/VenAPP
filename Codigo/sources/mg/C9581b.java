package mg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mg.b */
/* loaded from: classes2.dex */
public final class C9581b {

    /* renamed from: a */
    private final C9580a f23355a;

    /* renamed from: b */
    private final int[] f23356b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9581b(C9580a c9580a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f23355a = c9580a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f23356b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f23356b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f23356b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C9581b m28541a(C9581b c9581b) {
        if (!this.f23355a.equals(c9581b.f23355a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m28547g()) {
            return c9581b;
        }
        if (c9581b.m28547g()) {
            return this;
        }
        int[] iArr = this.f23356b;
        int[] iArr2 = c9581b.f23356b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = C9580a.m28531a(iArr2[i10 - length], iArr[i10]);
        }
        return new C9581b(this.f23355a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C9581b[] m28542b(C9581b c9581b) {
        if (!this.f23355a.equals(c9581b.f23355a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c9581b.m28547g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C9581b m28537g = this.f23355a.m28537g();
        int m28538h = this.f23355a.m28538h(c9581b.m28544d(c9581b.m28546f()));
        C9581b c9581b2 = this;
        while (c9581b2.m28546f() >= c9581b.m28546f() && !c9581b2.m28547g()) {
            int m28546f = c9581b2.m28546f() - c9581b.m28546f();
            int m28540j = this.f23355a.m28540j(c9581b2.m28544d(c9581b2.m28546f()), m28538h);
            C9581b m28550j = c9581b.m28550j(m28546f, m28540j);
            m28537g = m28537g.m28541a(this.f23355a.m28532b(m28546f, m28540j));
            c9581b2 = c9581b2.m28541a(m28550j);
        }
        return new C9581b[]{m28537g, c9581b2};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m28543c(int i10) {
        if (i10 == 0) {
            return m28544d(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f23356b) {
                i11 = C9580a.m28531a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f23356b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = C9580a.m28531a(this.f23355a.m28540j(i10, i13), this.f23356b[i14]);
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m28544d(int i10) {
        return this.f23356b[(r0.length - 1) - i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m28545e() {
        return this.f23356b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m28546f() {
        return this.f23356b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m28547g() {
        return this.f23356b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C9581b m28548h(int i10) {
        if (i10 == 0) {
            return this.f23355a.m28537g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f23356b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f23355a.m28540j(this.f23356b[i11], i10);
        }
        return new C9581b(this.f23355a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C9581b m28549i(C9581b c9581b) {
        if (!this.f23355a.equals(c9581b.f23355a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m28547g() || c9581b.m28547g()) {
            return this.f23355a.m28537g();
        }
        int[] iArr = this.f23356b;
        int length = iArr.length;
        int[] iArr2 = c9581b.f23356b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = C9580a.m28531a(iArr3[i13], this.f23355a.m28540j(i11, iArr2[i12]));
            }
        }
        return new C9581b(this.f23355a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C9581b m28550j(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f23355a.m28537g();
        }
        int length = this.f23356b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f23355a.m28540j(this.f23356b[i12], i11);
        }
        return new C9581b(this.f23355a, iArr);
    }

    public String toString() {
        char c10;
        if (m28547g()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m28546f() * 8);
        int m28546f = m28546f();
        while (m28546f >= 0) {
            int m28544d = m28544d(m28546f);
            if (m28544d != 0) {
                if (m28544d < 0) {
                    sb2.append(m28546f == m28546f() ? "-" : " - ");
                    m28544d = -m28544d;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m28546f == 0 || m28544d != 1) {
                    int m28539i = this.f23355a.m28539i(m28544d);
                    if (m28539i == 0) {
                        c10 = '1';
                    } else if (m28539i == 1) {
                        c10 = 'a';
                    } else {
                        sb2.append("a^");
                        sb2.append(m28539i);
                    }
                    sb2.append(c10);
                }
                if (m28546f != 0) {
                    if (m28546f == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m28546f);
                    }
                }
            }
            m28546f--;
        }
        return sb2.toString();
    }
}
