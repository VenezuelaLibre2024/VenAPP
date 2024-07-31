package tg;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Map;
import kg.C9263a;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;

/* renamed from: tg.a */
/* loaded from: classes2.dex */
public final class C11255a extends AbstractC11274r {

    /* renamed from: d */
    static final char[] f29189d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f29190e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f29191f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f29192a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f29193b = new int[80];

    /* renamed from: c */
    private int f29194c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m35169h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m35170i(int i10) {
        int[] iArr = this.f29193b;
        int i11 = this.f29194c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f29194c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f29193b = iArr2;
        }
    }

    /* renamed from: j */
    private int m35171j() {
        for (int i10 = 1; i10 < this.f29194c; i10 += 2) {
            int m35173l = m35173l(i10);
            if (m35173l != -1 && m35169h(f29191f, f29189d[m35173l])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f29193b[i12];
                }
                if (i10 == 1 || this.f29193b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw C6952m.m20106a();
    }

    /* renamed from: k */
    private void m35172k(C9263a c9263a) {
        int i10 = 0;
        this.f29194c = 0;
        int m27589k = c9263a.m27589k(0);
        int m27590l = c9263a.m27590l();
        if (m27589k >= m27590l) {
            throw C6952m.m20106a();
        }
        boolean z10 = true;
        while (m27589k < m27590l) {
            if (c9263a.m27586h(m27589k) != z10) {
                i10++;
            } else {
                m35170i(i10);
                z10 = !z10;
                i10 = 1;
            }
            m27589k++;
        }
        m35170i(i10);
    }

    /* renamed from: l */
    private int m35173l(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f29194c) {
            return -1;
        }
        int[] iArr = this.f29193b;
        int i12 = C5101a.e.API_PRIORITY_OTHER;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = RecognitionOptions.ITF;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f29190e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    /* renamed from: m */
    private void m35174m(int i10) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f29192a.length() - 1;
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                break;
            }
            int i13 = f29190e[this.f29192a.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = (i14 & 1) + ((i13 & 1) * 2);
                iArr[i15] = iArr[i15] + this.f29193b[i11 + i14];
                iArr2[i15] = iArr2[i15] + 1;
                i13 >>= 1;
            }
            i11 += 8;
            i12++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i16 = 0; i16 < 2; i16++) {
            fArr2[i16] = 0.0f;
            int i17 = i16 + 2;
            int i18 = iArr[i17];
            int i19 = iArr2[i17];
            float f10 = ((iArr[i16] / iArr2[i16]) + (i18 / i19)) / 2.0f;
            fArr2[i17] = f10;
            fArr[i16] = f10;
            fArr[i17] = ((i18 * 2.0f) + 1.5f) / i19;
        }
        int i20 = i10;
        for (int i21 = 0; i21 <= length; i21++) {
            int i22 = f29190e[this.f29192a.charAt(i21)];
            for (int i23 = 6; i23 >= 0; i23--) {
                int i24 = (i23 & 1) + ((i22 & 1) * 2);
                float f11 = this.f29193b[i20 + i23];
                if (f11 < fArr2[i24] || f11 > fArr[i24]) {
                    throw C6952m.m20106a();
                }
                i22 >>= 1;
            }
            i20 += 8;
        }
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        Arrays.fill(this.f29193b, 0);
        m35172k(c9263a);
        int m35171j = m35171j();
        this.f29192a.setLength(0);
        int i11 = m35171j;
        do {
            int m35173l = m35173l(i11);
            if (m35173l == -1) {
                throw C6952m.m20106a();
            }
            this.f29192a.append((char) m35173l);
            i11 += 8;
            if (this.f29192a.length() > 1 && m35169h(f29191f, f29189d[m35173l])) {
                break;
            }
        } while (i11 < this.f29194c);
        int i12 = i11 - 1;
        int i13 = this.f29193b[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.f29193b[i11 + i15];
        }
        if (i11 < this.f29194c && i13 < i14 / 2) {
            throw C6952m.m20106a();
        }
        m35174m(m35171j);
        for (int i16 = 0; i16 < this.f29192a.length(); i16++) {
            StringBuilder sb2 = this.f29192a;
            sb2.setCharAt(i16, f29189d[sb2.charAt(i16)]);
        }
        char charAt = this.f29192a.charAt(0);
        char[] cArr = f29191f;
        if (!m35169h(cArr, charAt)) {
            throw C6952m.m20106a();
        }
        StringBuilder sb3 = this.f29192a;
        if (!m35169h(cArr, sb3.charAt(sb3.length() - 1))) {
            throw C6952m.m20106a();
        }
        if (this.f29192a.length() <= 3) {
            throw C6952m.m20106a();
        }
        if (map == null || !map.containsKey(EnumC6944e.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f29192a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f29192a.deleteCharAt(0);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < m35171j; i18++) {
            i17 += this.f29193b[i18];
        }
        float f10 = i17;
        while (m35171j < i12) {
            i17 += this.f29193b[m35171j];
            m35171j++;
        }
        float f11 = i10;
        C6956q c6956q = new C6956q(this.f29192a.toString(), null, new C6958s[]{new C6958s(f10, f11), new C6958s(i17, f11)}, EnumC6940a.CODABAR);
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]F0");
        return c6956q;
    }
}
