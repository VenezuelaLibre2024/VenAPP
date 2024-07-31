package tg;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends r {

    /* renamed from: d, reason: collision with root package name */
    static final char[] f26893d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    static final int[] f26894e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f26895f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f26896a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private int[] f26897b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    private int f26898c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void i(int i10) {
        int[] iArr = this.f26897b;
        int i11 = this.f26898c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f26898c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f26897b = iArr2;
        }
    }

    private int j() {
        for (int i10 = 1; i10 < this.f26898c; i10 += 2) {
            int l10 = l(i10);
            if (l10 != -1 && h(f26895f, f26893d[l10])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f26897b[i12];
                }
                if (i10 == 1 || this.f26897b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw dg.m.a();
    }

    private void k(kg.a aVar) {
        int i10 = 0;
        this.f26898c = 0;
        int k10 = aVar.k(0);
        int l10 = aVar.l();
        if (k10 >= l10) {
            throw dg.m.a();
        }
        boolean z10 = true;
        while (k10 < l10) {
            if (aVar.h(k10) != z10) {
                i10++;
            } else {
                i(i10);
                z10 = !z10;
                i10 = 1;
            }
            k10++;
        }
        i(i10);
    }

    private int l(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f26898c) {
            return -1;
        }
        int[] iArr = this.f26897b;
        int i12 = a.e.API_PRIORITY_OTHER;
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
            int[] iArr2 = f26894e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    private void m(int i10) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f26896a.length() - 1;
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                break;
            }
            int i13 = f26894e[this.f26896a.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = (i14 & 1) + ((i13 & 1) * 2);
                iArr[i15] = iArr[i15] + this.f26897b[i11 + i14];
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
            int i22 = f26894e[this.f26896a.charAt(i21)];
            for (int i23 = 6; i23 >= 0; i23--) {
                int i24 = (i23 & 1) + ((i22 & 1) * 2);
                float f11 = this.f26897b[i20 + i23];
                if (f11 < fArr2[i24] || f11 > fArr[i24]) {
                    throw dg.m.a();
                }
                i22 >>= 1;
            }
            i20 += 8;
        }
    }

    @Override // tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        Arrays.fill(this.f26897b, 0);
        k(aVar);
        int j10 = j();
        this.f26896a.setLength(0);
        int i11 = j10;
        do {
            int l10 = l(i11);
            if (l10 == -1) {
                throw dg.m.a();
            }
            this.f26896a.append((char) l10);
            i11 += 8;
            if (this.f26896a.length() > 1 && h(f26895f, f26893d[l10])) {
                break;
            }
        } while (i11 < this.f26898c);
        int i12 = i11 - 1;
        int i13 = this.f26897b[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.f26897b[i11 + i15];
        }
        if (i11 < this.f26898c && i13 < i14 / 2) {
            throw dg.m.a();
        }
        m(j10);
        for (int i16 = 0; i16 < this.f26896a.length(); i16++) {
            StringBuilder sb2 = this.f26896a;
            sb2.setCharAt(i16, f26893d[sb2.charAt(i16)]);
        }
        char charAt = this.f26896a.charAt(0);
        char[] cArr = f26895f;
        if (!h(cArr, charAt)) {
            throw dg.m.a();
        }
        StringBuilder sb3 = this.f26896a;
        if (!h(cArr, sb3.charAt(sb3.length() - 1))) {
            throw dg.m.a();
        }
        if (this.f26896a.length() <= 3) {
            throw dg.m.a();
        }
        if (map == null || !map.containsKey(dg.e.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f26896a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f26896a.deleteCharAt(0);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < j10; i18++) {
            i17 += this.f26897b[i18];
        }
        float f10 = i17;
        while (j10 < i12) {
            i17 += this.f26897b[j10];
            j10++;
        }
        float f11 = i10;
        dg.q qVar = new dg.q(this.f26896a.toString(), null, new dg.s[]{new dg.s(f10, f11), new dg.s(i17, f11)}, dg.a.CODABAR);
        qVar.h(dg.r.SYMBOLOGY_IDENTIFIER, "]F0");
        return qVar;
    }
}
