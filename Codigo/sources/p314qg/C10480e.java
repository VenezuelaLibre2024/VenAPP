package p314qg;

import java.util.Arrays;

/* renamed from: qg.e */
/* loaded from: classes2.dex */
public class C10480e {

    /* renamed from: a */
    private final CharSequence f26022a;

    /* renamed from: b */
    private final int f26023b;

    /* renamed from: c */
    private final int f26024c;

    /* renamed from: d */
    private final byte[] f26025d;

    public C10480e(CharSequence charSequence, int i10, int i11) {
        this.f26022a = charSequence;
        this.f26024c = i10;
        this.f26023b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f26025d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m31433a(int i10) {
        m31437f(this.f26023b - 1, 0, i10, 1);
        m31437f(this.f26023b - 1, 1, i10, 2);
        m31437f(this.f26023b - 1, 2, i10, 3);
        m31437f(0, this.f26024c - 2, i10, 4);
        m31437f(0, this.f26024c - 1, i10, 5);
        m31437f(1, this.f26024c - 1, i10, 6);
        m31437f(2, this.f26024c - 1, i10, 7);
        m31437f(3, this.f26024c - 1, i10, 8);
    }

    /* renamed from: b */
    private void m31434b(int i10) {
        m31437f(this.f26023b - 3, 0, i10, 1);
        m31437f(this.f26023b - 2, 0, i10, 2);
        m31437f(this.f26023b - 1, 0, i10, 3);
        m31437f(0, this.f26024c - 4, i10, 4);
        m31437f(0, this.f26024c - 3, i10, 5);
        m31437f(0, this.f26024c - 2, i10, 6);
        m31437f(0, this.f26024c - 1, i10, 7);
        m31437f(1, this.f26024c - 1, i10, 8);
    }

    /* renamed from: c */
    private void m31435c(int i10) {
        m31437f(this.f26023b - 3, 0, i10, 1);
        m31437f(this.f26023b - 2, 0, i10, 2);
        m31437f(this.f26023b - 1, 0, i10, 3);
        m31437f(0, this.f26024c - 2, i10, 4);
        m31437f(0, this.f26024c - 1, i10, 5);
        m31437f(1, this.f26024c - 1, i10, 6);
        m31437f(2, this.f26024c - 1, i10, 7);
        m31437f(3, this.f26024c - 1, i10, 8);
    }

    /* renamed from: d */
    private void m31436d(int i10) {
        m31437f(this.f26023b - 1, 0, i10, 1);
        m31437f(this.f26023b - 1, this.f26024c - 1, i10, 2);
        m31437f(0, this.f26024c - 3, i10, 3);
        m31437f(0, this.f26024c - 2, i10, 4);
        m31437f(0, this.f26024c - 1, i10, 5);
        m31437f(1, this.f26024c - 3, i10, 6);
        m31437f(1, this.f26024c - 2, i10, 7);
        m31437f(1, this.f26024c - 1, i10, 8);
    }

    /* renamed from: f */
    private void m31437f(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f26023b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f26024c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        m31439i(i11, i10, (this.f26022a.charAt(i12) & (1 << (8 - i13))) != 0);
    }

    /* renamed from: g */
    private boolean m31438g(int i10, int i11) {
        return this.f26025d[(i11 * this.f26024c) + i10] < 0;
    }

    /* renamed from: i */
    private void m31439i(int i10, int i11, boolean z10) {
        this.f26025d[(i11 * this.f26024c) + i10] = z10 ? (byte) 1 : (byte) 0;
    }

    /* renamed from: j */
    private void m31440j(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        m31437f(i13, i14, i12, 1);
        int i15 = i11 - 1;
        m31437f(i13, i15, i12, 2);
        int i16 = i10 - 1;
        m31437f(i16, i14, i12, 3);
        m31437f(i16, i15, i12, 4);
        m31437f(i16, i11, i12, 5);
        m31437f(i10, i14, i12, 6);
        m31437f(i10, i15, i12, 7);
        m31437f(i10, i11, i12, 8);
    }

    /* renamed from: e */
    public final boolean m31441e(int i10, int i11) {
        return this.f26025d[(i11 * this.f26024c) + i10] == 1;
    }

    /* renamed from: h */
    public final void m31442h() {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 4;
        while (true) {
            if (i14 == this.f26023b && i12 == 0) {
                m31433a(i13);
                i13++;
            }
            if (i14 == this.f26023b - 2 && i12 == 0 && this.f26024c % 4 != 0) {
                m31434b(i13);
                i13++;
            }
            if (i14 == this.f26023b - 2 && i12 == 0 && this.f26024c % 8 == 4) {
                m31435c(i13);
                i13++;
            }
            if (i14 == this.f26023b + 4 && i12 == 2 && this.f26024c % 8 == 0) {
                m31436d(i13);
                i13++;
            }
            do {
                if (i14 < this.f26023b && i12 >= 0 && m31438g(i12, i14)) {
                    m31440j(i14, i12, i13);
                    i13++;
                }
                i14 -= 2;
                i12 += 2;
                if (i14 < 0) {
                    break;
                }
            } while (i12 < this.f26024c);
            int i15 = i14 + 1;
            int i16 = i12 + 3;
            do {
                if (i15 >= 0 && i16 < this.f26024c && m31438g(i16, i15)) {
                    m31440j(i15, i16, i13);
                    i13++;
                }
                i15 += 2;
                i16 -= 2;
                i10 = this.f26023b;
                if (i15 >= i10) {
                    break;
                }
            } while (i16 >= 0);
            i14 = i15 + 3;
            i12 = i16 + 1;
            if (i14 >= i10 && i12 >= (i11 = this.f26024c)) {
                break;
            }
        }
        if (m31438g(i11 - 1, i10 - 1)) {
            m31439i(this.f26024c - 1, this.f26023b - 1, true);
            m31439i(this.f26024c - 2, this.f26023b - 2, true);
        }
    }
}
