package com.facebook.ads.redexgen.uinode;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.9u */
/* loaded from: assets/audience_network.dex */
public final class C28309u {
    public static String[] A0C = {"Lb1", "HAO", "yCHPPE9w0w81YCKuxFE6L9DmrxkJ2tU0", "DWgdxvM8Y7BV8jWWEqdgbbwmU3UKZQmt", "Bgm", "OOw1FrSehBTCipzYy8xUBx5", "Tcr4i3yvYCwS9F", "vvoyvovICPFY35FJOKkJE7b"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C28289s A04;
    public C28289s A05;
    public C28289s A06;
    public AbstractC2853AH A07;
    public Object A08;
    public boolean A09;
    public final C2851AF A0A = new C2851AF();
    public final C2852AG A0B = new C2852AG();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C28299t A02(int i10, long j10, long j11) {
        C3113Eo c3113Eo = new C3113Eo(i10, j11);
        this.A07.A09(c3113Eo.A02, this.A0A);
        int A04 = this.A0A.A04(j10);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(c3113Eo, A09);
        return new C28299t(c3113Eo, j10, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(c3113Eo, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C28299t A03(C28289s c28289s, long j10) {
        long j11;
        C28299t c28299t = c28289s.A02;
        if (c28299t.A06) {
            int A03 = this.A07.A03(c28299t.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i10 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j12 = c28299t.A04.A03;
            if (this.A07.A0B(i10, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i10, -9223372036854775807L, Math.max(0L, (c28289s.A07() + c28299t.A01) - j10));
                if (A08 == null) {
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j11 = ((Long) A08.second).longValue();
                if (c28289s.A01 == null || !c28289s.A01.A09.equals(obj)) {
                    j12 = this.A02;
                    this.A02 = j12 + 1;
                } else {
                    j12 = c28289s.A01.A02.A04.A03;
                    String[] strArr = A0C;
                    if (strArr[5].length() == strArr[7].length()) {
                        String[] strArr2 = A0C;
                        strArr2[4] = "1Mi";
                        strArr2[1] = "4wM";
                    }
                }
            } else {
                j11 = 0;
            }
            return A06(A07(A03, j11, j12), j11, j11);
        }
        C3113Eo c3113Eo = c28299t.A04;
        this.A07.A09(c3113Eo.A02, this.A0A);
        if (c3113Eo.A01()) {
            int i11 = c3113Eo.A00;
            int A01 = this.A0A.A01(i11);
            if (A01 == -1) {
                return null;
            }
            int A032 = this.A0A.A03(i11, c3113Eo.A01);
            if (A032 >= A01) {
                return A02(c3113Eo.A02, c28299t.A00, c3113Eo.A03);
            }
            if (this.A0A.A0E(i11, A032)) {
                return A01(c3113Eo.A02, i11, A032, c28299t.A00, c3113Eo.A03);
            }
            return null;
        }
        long j13 = c28299t.A02;
        String[] strArr3 = A0C;
        if (strArr3[6].length() == strArr3[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0C;
        strArr4[4] = "Mkh";
        strArr4[1] = "LRN";
        if (j13 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c28299t.A02);
            if (A05 == -1) {
                return A02(c3113Eo.A02, c28299t.A02, c3113Eo.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(c3113Eo.A02, A05, A02, c28299t.A02, c3113Eo.A03);
            }
            return null;
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i12 = A00 - 1;
        if (this.A0A.A09(i12) == Long.MIN_VALUE) {
            C2851AF c2851af = this.A0A;
            if (A0C[3].charAt(17) == 'q') {
                String[] strArr5 = A0C;
                strArr5[6] = "v4RqMCCMyohjhj";
                strArr5[0] = "VaJ";
                if (!c2851af.A0D(i12)) {
                    int A022 = this.A0A.A02(i12);
                    if (!this.A0A.A0E(i12, A022)) {
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() == strArr6[0].length()) {
                            return null;
                        }
                        A0C[2] = "nHRVyYi6CwR1mKhXGjDN4SEBRB6Sc1lP";
                        return null;
                    }
                    long A07 = this.A0A.A07();
                    int i13 = c3113Eo.A02;
                    String[] strArr7 = A0C;
                    if (strArr7[5].length() != strArr7[7].length()) {
                        throw new RuntimeException();
                    }
                    A0C[2] = "rKR9SUNE0wWlvttO7fw3rD4zdQIUaCm2";
                    return A01(i13, i12, A022, A07, c3113Eo.A03);
                }
            }
        }
        if (A0C[2].charAt(9) != 'w') {
            return null;
        }
        String[] strArr8 = A0C;
        strArr8[6] = "OaXxy4ZAPPYV9k";
        strArr8[0] = "tU4";
        return null;
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C28299t A04(C28299t c28299t, C3113Eo c3113Eo) {
        long j10 = c28299t.A03;
        long j11 = c28299t.A02;
        boolean A0A = A0A(c3113Eo, j11);
        boolean A0B = A0B(c3113Eo, A0A);
        this.A07.A09(c3113Eo.A02, this.A0A);
        return new C28299t(c3113Eo, j10, j11, c28299t.A00, c3113Eo.A01() ? this.A0A.A0A(c3113Eo.A00, c3113Eo.A01) : j11 == Long.MIN_VALUE ? this.A0A.A07() : j11, A0A, A0B);
    }

    private long A00(int i10) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i10, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C28289s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid = A0E.A09;
            if (periodUid.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C28289s A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AbstractC2853AH abstractC2853AH = this.A07;
            Object periodUid2 = A0E2.A09;
            int A04 = abstractC2853AH.A04(periodUid2);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j10 = this.A02;
        this.A02 = 1 + j10;
        return j10;
    }

    private C28299t A01(int i10, int i11, int i12, long j10, long j11) {
        long j12;
        C3113Eo c3113Eo = new C3113Eo(i10, i11, i12, j11);
        boolean A0A = A0A(c3113Eo, Long.MIN_VALUE);
        boolean A0B = A0B(c3113Eo, A0A);
        long A0A2 = this.A07.A09(c3113Eo.A02, this.A0A).A0A(c3113Eo.A00, c3113Eo.A01);
        if (i12 == this.A0A.A02(i11)) {
            j12 = this.A0A.A06();
        } else {
            j12 = 0;
        }
        return new C28299t(c3113Eo, j12, Long.MIN_VALUE, j10, A0A2, A0A, A0B);
    }

    private C28299t A05(C28329w c28329w) {
        return A06(c28329w.A04, c28329w.A01, c28329w.A02);
    }

    private C28299t A06(C3113Eo c3113Eo, long j10, long j11) {
        this.A07.A09(c3113Eo.A02, this.A0A);
        if (c3113Eo.A01()) {
            if (!this.A0A.A0E(c3113Eo.A00, c3113Eo.A01)) {
                return null;
            }
            return A01(c3113Eo.A02, c3113Eo.A00, c3113Eo.A01, j10, c3113Eo.A03);
        }
        return A02(c3113Eo.A02, j11, c3113Eo.A03);
    }

    private C3113Eo A07(int i10, long j10, long j11) {
        this.A07.A09(i10, this.A0A);
        int A05 = this.A0A.A05(j10);
        if (A05 == -1) {
            return new C3113Eo(i10, j11);
        }
        return new C3113Eo(i10, A05, this.A0A.A02(A05), j11);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.9s r3 = r13.A0E()
            r6 = 1
            if (r3 != 0) goto L8
            return r6
        L8:
            com.facebook.ads.redexgen.X.AH r7 = r13.A07
            com.facebook.ads.redexgen.X.9t r0 = r3.A02
            com.facebook.ads.redexgen.X.Eo r0 = r0.A04
            int r8 = r0.A02
            com.facebook.ads.redexgen.X.AF r9 = r13.A0A
            com.facebook.ads.redexgen.X.AG r10 = r13.A0B
            int r11 = r13.A01
            boolean r12 = r13.A09
            int r5 = r7.A03(r8, r9, r10, r11, r12)
        L1c:
            com.facebook.ads.redexgen.X.9s r0 = r3.A01
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.9t r0 = r3.A02
            boolean r0 = r0.A06
            if (r0 != 0) goto L29
            com.facebook.ads.redexgen.X.9s r3 = r3.A01
            goto L1c
        L29:
            r0 = -1
            if (r5 == r0) goto L5b
            com.facebook.ads.redexgen.X.9s r0 = r3.A01
            if (r0 == 0) goto L5b
            com.facebook.ads.redexgen.X.9s r0 = r3.A01
            com.facebook.ads.redexgen.X.9t r0 = r0.A02
            com.facebook.ads.redexgen.X.Eo r0 = r0.A04
            int r4 = r0.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C28309u.A0C
            r0 = 3
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L4d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C28309u.A0C
            java.lang.String r1 = "04e"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fTm"
            r0 = 1
            r2[r0] = r1
            if (r4 == r5) goto L76
        L5b:
            boolean r2 = r13.A0S(r3)
            com.facebook.ads.redexgen.X.9t r1 = r3.A02
            com.facebook.ads.redexgen.X.9t r0 = r3.A02
            com.facebook.ads.redexgen.X.Eo r0 = r0.A04
            com.facebook.ads.redexgen.X.9t r0 = r13.A04(r1, r0)
            r3.A02 = r0
            if (r2 == 0) goto L73
            boolean r0 = r13.A0P()
            if (r0 != 0) goto L74
        L73:
            return r6
        L74:
            r6 = 0
            goto L73
        L76:
            com.facebook.ads.redexgen.X.9s r3 = r3.A01
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C28309u.A08():boolean");
    }

    private boolean A09(C28289s c28289s, C28299t c28299t) {
        C28299t c28299t2 = c28289s.A02;
        return c28299t2.A03 == c28299t.A03 && c28299t2.A02 == c28299t.A02 && c28299t2.A04.equals(c28299t.A04);
    }

    private boolean A0A(C3113Eo c3113Eo, long j10) {
        int adGroupCount = this.A07.A09(c3113Eo.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i10 = adGroupCount - 1;
        boolean A01 = c3113Eo.A01();
        if (this.A0A.A09(i10) != Long.MIN_VALUE) {
            return !A01 && j10 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i10);
        if (A0C[3].charAt(17) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "dZB";
        strArr[1] = "bbK";
        if (postrollAdCount == -1) {
            return false;
        }
        if (((A01 && c3113Eo.A00 == i10 && c3113Eo.A01 == postrollAdCount + (-1)) ? 1 : 0) == 0) {
            return !A01 && this.A0A.A02(i10) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(C3113Eo c3113Eo, boolean z10) {
        return !this.A07.A0B(this.A07.A09(c3113Eo.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(c3113Eo.A02, this.A0A, this.A0B, this.A01, this.A09) && z10;
    }

    public final C28289s A0C() {
        C28289s c28289s = this.A05;
        if (c28289s != null) {
            if (c28289s == this.A06) {
                this.A06 = c28289s.A01;
            }
            this.A05.A0D();
            int i10 = this.A00 - 1;
            this.A00 = i10;
            if (i10 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            C28289s c28289s2 = this.A05.A01;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[5] = "umGBE5C5CuHWhY73AVgogVf";
            strArr[7] = "vM8t2ZsrAby17UFg4572Zd2";
            this.A05 = c28289s2;
        } else {
            C28289s c28289s3 = this.A04;
            this.A05 = c28289s3;
            this.A06 = c28289s3;
        }
        return this.A05;
    }

    public final C28289s A0D() {
        C28289s c28289s = this.A06;
        AbstractC3281Ha.A04((c28289s == null || c28289s.A01 == null) ? false : true);
        C28289s c28289s2 = this.A06.A01;
        this.A06 = c28289s2;
        return c28289s2;
    }

    public final C28289s A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C28289s A0F() {
        return this.A04;
    }

    public final C28289s A0G() {
        return this.A05;
    }

    public final C28289s A0H() {
        return this.A06;
    }

    public final C28299t A0I(long j10, C28329w c28329w) {
        C28289s c28289s = this.A04;
        if (c28289s == null) {
            return A05(c28329w);
        }
        return A03(c28289s, j10);
    }

    public final C28299t A0J(C28299t c28299t, int i10) {
        return A04(c28299t, c28299t.A04.A00(i10));
    }

    public final InterfaceC4192WP A0K(InterfaceC2846AA[] interfaceC2846AAArr, AbstractC3228Gj abstractC3228Gj, InterfaceC3231Gm interfaceC3231Gm, InterfaceC3115Eq interfaceC3115Eq, Object obj, C28299t c28299t) {
        long A07;
        C28289s c28289s = this.A04;
        if (c28289s != null) {
            A07 = c28289s.A07() + this.A04.A02.A01;
            String[] strArr = A0C;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "XFCrwzIN7SxWEMf0fznSlHt";
            strArr2[7] = "zDOSpelqL3O1zvPqWZMR4dG";
        } else {
            A07 = c28299t.A03;
        }
        C28289s c28289s2 = new C28289s(interfaceC2846AAArr, A07, abstractC3228Gj, interfaceC3231Gm, interfaceC3115Eq, obj, c28299t);
        if (this.A04 != null) {
            AbstractC3281Ha.A04(A0P());
            this.A04.A01 = c28289s2;
        }
        this.A08 = null;
        this.A04 = c28289s2;
        this.A00++;
        return c28289s2.A08;
    }

    public final C3113Eo A0L(int i10, long j10) {
        return A07(i10, j10, A00(i10));
    }

    public final void A0M(long j10) {
        C28289s c28289s = this.A04;
        if (c28289s != null) {
            c28289s.A0G(j10);
        }
    }

    public final void A0N(AbstractC2853AH abstractC2853AH) {
        this.A07 = abstractC2853AH;
    }

    public final void A0O(boolean z10) {
        C28289s A0E = A0E();
        if (A0E != null) {
            this.A08 = z10 ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z10) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C28289s c28289s = this.A04;
        return c28289s == null || (!c28289s.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i10) {
        this.A01 = i10;
        return A08();
    }

    public final boolean A0S(C28289s c28289s) {
        AbstractC3281Ha.A04(c28289s != null);
        boolean z10 = false;
        String[] strArr = A0C;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "VEc";
        strArr2[1] = "0t0";
        this.A04 = c28289s;
        while (c28289s.A01 != null) {
            c28289s = c28289s.A01;
            if (c28289s == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c28289s.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z10;
    }

    public final boolean A0T(InterfaceC4192WP interfaceC4192WP) {
        C28289s c28289s = this.A04;
        return c28289s != null && c28289s.A08 == interfaceC4192WP;
    }

    public final boolean A0U(C3113Eo c3113Eo, long j10) {
        int i10 = c3113Eo.A02;
        C28289s periodHolder = null;
        for (C28289s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (periodHolder == null) {
                C28299t periodInfo = A0E.A02;
                if (A0C[3].charAt(17) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "pn8srZEQfSJzxw";
                strArr[0] = "zNd";
                A0E.A02 = A0J(periodInfo, i10);
            } else {
                if (i10 == -1 || !A0E.A09.equals(this.A07.A0A(i10, this.A0A, true).A03)) {
                    return true ^ A0S(periodHolder);
                }
                C28299t A03 = A03(periodHolder, j10);
                if (A03 == null) {
                    return true ^ A0S(periodHolder);
                }
                A0E.A02 = A0J(A0E.A02, i10);
                if (!A09(A0E, A03)) {
                    boolean A0S = A0S(periodHolder);
                    String[] strArr2 = A0C;
                    String str = strArr2[4];
                    String str2 = strArr2[1];
                    int length = str.length();
                    int periodIndex = str2.length();
                    if (length != periodIndex) {
                        return true ^ A0S;
                    }
                    String[] strArr3 = A0C;
                    strArr3[5] = "009NTdXku0rfOoGLKxDbxOM";
                    strArr3[7] = "1WlPwvG5U3NzzyaZC20RJwC";
                    return true ^ A0S;
                }
            }
            if (A0E.A02.A06) {
                i10 = this.A07.A03(i10, this.A0A, this.A0B, this.A01, this.A09);
            }
            periodHolder = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z10) {
        this.A09 = z10;
        return A08();
    }
}
