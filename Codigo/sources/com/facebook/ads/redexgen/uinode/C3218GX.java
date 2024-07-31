package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: com.facebook.ads.redexgen.X.GX */
/* loaded from: assets/audience_network.dex */
public final class C3218GX implements Comparable<C3218GX> {
    public static String[] A07 = {"eb8CGYK3prt3t", "dQfQVH0VaiNJA", "r8fXA", "r3rHNRtipUDB7ufPa7P3AvdqyjlNLgla", "2m", "YPC8s", "obzEXxZAmH6P4FrObF", "ImIsZWaiqjX9J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public C3218GX(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i10) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = C2946Bo.A0H(i10, false) ? 1 : 0;
        this.A03 = C2946Bo.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3218GX c3218gx) {
        int resultSign;
        int resultSign2;
        int A01;
        int A012;
        int A013;
        int A014;
        int A015;
        int i10 = this.A05;
        int i11 = c3218gx.A05;
        if (i10 != i11) {
            A015 = C2946Bo.A01(i10, i11);
            return A015;
        }
        int i12 = this.A03;
        int i13 = c3218gx.A03;
        if (i12 != i13) {
            A014 = C2946Bo.A01(i12, i13);
            return A014;
        }
        int i14 = this.A02;
        int i15 = c3218gx.A02;
        if (i14 != i15) {
            A013 = C2946Bo.A01(i14, i15);
            return A013;
        }
        if (this.A06.A0D) {
            A012 = C2946Bo.A01(c3218gx.A00, this.A00);
            return A012;
        }
        int i16 = this.A05 != 1 ? -1 : 1;
        int i17 = this.A01;
        int resultSign3 = c3218gx.A01;
        if (i17 != resultSign3) {
            A01 = C2946Bo.A01(i17, resultSign3);
            int i18 = A01 * i16;
            String[] strArr = A07;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "P8pKjaXeFiun6";
            strArr2[0] = "9cxjYqXmdfp1O";
            return i18;
        }
        int i19 = this.A04;
        int resultSign4 = c3218gx.A04;
        if (i19 != resultSign4) {
            resultSign2 = C2946Bo.A01(i19, resultSign4);
            return resultSign2 * i16;
        }
        resultSign = C2946Bo.A01(this.A00, c3218gx.A00);
        return resultSign * i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3218GX c3218gx = (C3218GX) obj;
        if (this.A05 == c3218gx.A05 && this.A03 == c3218gx.A03 && this.A02 == c3218gx.A02 && this.A01 == c3218gx.A01) {
            int i10 = this.A04;
            if (A07[3].charAt(10) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "D3QBn";
            strArr[2] = "QopBq";
            if (i10 == c3218gx.A04 && this.A00 == c3218gx.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A05;
        int i10 = result * 31;
        int result2 = this.A03;
        int result3 = (((i10 + result2) * 31) + this.A02) * 31;
        int result4 = this.A01;
        int result5 = (((result3 + result4) * 31) + this.A04) * 31;
        int result6 = this.A00;
        return result5 + result6;
    }
}
