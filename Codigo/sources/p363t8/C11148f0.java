package p363t8;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: t8.f0 */
/* loaded from: classes.dex */
public final class C11148f0 {

    /* renamed from: a */
    private byte[] f28957a;

    /* renamed from: b */
    private int f28958b;

    /* renamed from: c */
    private int f28959c;

    /* renamed from: d */
    private int f28960d;

    public C11148f0(byte[] bArr, int i10, int i11) {
        m34714i(bArr, i10, i11);
    }

    /* renamed from: a */
    private void m34705a() {
        int i10;
        int i11 = this.f28959c;
        C11137a.m34605g(i11 >= 0 && (i11 < (i10 = this.f28958b) || (i11 == i10 && this.f28960d == 0)));
    }

    /* renamed from: f */
    private int m34706f() {
        int i10 = 0;
        while (!m34710d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? m34711e(i10) : 0);
    }

    /* renamed from: j */
    private boolean m34707j(int i10) {
        if (2 <= i10 && i10 < this.f28958b) {
            byte[] bArr = this.f28957a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m34708b(int i10) {
        int i11 = this.f28959c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f28960d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f28958b) {
                break;
            }
            if (m34707j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f28958b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m34709c() {
        int i10 = this.f28959c;
        int i11 = this.f28960d;
        int i12 = 0;
        while (this.f28959c < this.f28958b && !m34710d()) {
            i12++;
        }
        boolean z10 = this.f28959c == this.f28958b;
        this.f28959c = i10;
        this.f28960d = i11;
        return !z10 && m34708b((i12 * 2) + 1);
    }

    /* renamed from: d */
    public boolean m34710d() {
        boolean z10 = (this.f28957a[this.f28959c] & (RecognitionOptions.ITF >> this.f28960d)) != 0;
        m34715k();
        return z10;
    }

    /* renamed from: e */
    public int m34711e(int i10) {
        int i11;
        this.f28960d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f28960d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f28960d = i13;
            byte[] bArr = this.f28957a;
            int i14 = this.f28959c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!m34707j(i14 + 1)) {
                r3 = 1;
            }
            this.f28959c = i14 + r3;
        }
        byte[] bArr2 = this.f28957a;
        int i15 = this.f28959c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f28960d = 0;
            this.f28959c = i15 + (m34707j(i15 + 1) ? 2 : 1);
        }
        m34705a();
        return i16;
    }

    /* renamed from: g */
    public int m34712g() {
        int m34706f = m34706f();
        return (m34706f % 2 == 0 ? -1 : 1) * ((m34706f + 1) / 2);
    }

    /* renamed from: h */
    public int m34713h() {
        return m34706f();
    }

    /* renamed from: i */
    public void m34714i(byte[] bArr, int i10, int i11) {
        this.f28957a = bArr;
        this.f28959c = i10;
        this.f28958b = i11;
        this.f28960d = 0;
        m34705a();
    }

    /* renamed from: k */
    public void m34715k() {
        int i10 = this.f28960d + 1;
        this.f28960d = i10;
        if (i10 == 8) {
            this.f28960d = 0;
            int i11 = this.f28959c;
            this.f28959c = i11 + (m34707j(i11 + 1) ? 2 : 1);
        }
        m34705a();
    }

    /* renamed from: l */
    public void m34716l(int i10) {
        int i11 = this.f28959c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f28959c = i13;
        int i14 = this.f28960d + (i10 - (i12 * 8));
        this.f28960d = i14;
        if (i14 > 7) {
            this.f28959c = i13 + 1;
            this.f28960d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f28959c) {
                m34705a();
                return;
            } else if (m34707j(i11)) {
                this.f28959c++;
                i11 += 2;
            }
        }
    }
}
