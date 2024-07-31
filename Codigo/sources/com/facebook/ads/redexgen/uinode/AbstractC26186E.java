package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.6E */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC26186E {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C26166C> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C26166C A00() {
        C26166C c26166c = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C26166C c26166c2 = c26166c;
            if (c26166c2 == null) {
                C26166C A002 = C26166C.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c26166c2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.uinode.C26166C A01(com.facebook.ads.redexgen.uinode.C26937f r5, com.facebook.ads.redexgen.uinode.C26166C r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.6C r0 = com.facebook.ads.redexgen.uinode.AbstractC26236K.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.89 r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.uinode.AbstractC27248A.A1Q
            com.facebook.ads.redexgen.X.8B r3 = new com.facebook.ads.redexgen.X.8B
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A9a(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.AbstractC26186E.A01(com.facebook.ads.redexgen.X.7f, com.facebook.ads.redexgen.X.6C):com.facebook.ads.redexgen.X.6C");
    }

    public static C26166C A02(C26937f c26937f, C26166C c26166c, C26176D c26176d) {
        C26196F c26196f = null;
        try {
            if (AbstractC3347Ig.A06(c26937f) && (c26166c == null || TextUtils.isEmpty(c26166c.A03()))) {
                c26196f = AbstractC26206G.A00(c26937f.getContentResolver());
            }
        } catch (Throwable th2) {
            c26937f.A07().A9a(A04(12, 7, 6), AbstractC27248A.A1S, new C27258B(th2));
        }
        if (c26196f != null && c26196f.A01 != null) {
            A03.set(c26196f.A01);
            c26176d.A05(c26196f.A01);
        }
        if (c26166c == null && c26196f != null && !TextUtils.isEmpty(c26196f.A00)) {
            return new C26166C(c26196f.A00, c26196f.A02, EnumC26156B.A05);
        }
        return c26166c;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C26176D c26176d) {
        A02.set(c26176d.A02());
        A03.set(c26176d.A03());
    }

    public static void A07(C26937f c26937f) {
        long j10;
        C26166C A022;
        try {
            C26176D c26176d = new C26176D(c26937f);
            A06(c26176d);
            if (A08()) {
                return;
            }
            AtomicReference<C26166C> atomicReference = A02;
            C26166C c26166c = atomicReference.get();
            if (c26166c != null && !TextUtils.isEmpty(c26166c.A03())) {
                j10 = c26166c.A01();
            } else {
                j10 = -1;
            }
            if (j10 > 0) {
                long cacheTS = System.currentTimeMillis();
                if (cacheTS - j10 < AbstractC3347Ig.A00(c26937f)) {
                    return;
                }
            }
            if (AbstractC3347Ig.A07(c26937f)) {
                A022 = A01(c26937f, A02(c26937f, null, c26176d));
            } else {
                A022 = A02(c26937f, A01(c26937f, null), c26176d);
            }
            if (A022 != null && !TextUtils.isEmpty(A022.A03())) {
                atomicReference.set(A022);
                c26176d.A04(A022);
            }
        } catch (Throwable t10) {
            c26937f.A07().A9a(A04(12, 7, 6), AbstractC27248A.A1R, new C27258B(t10));
        }
    }

    public static boolean A08() {
        boolean z10 = false;
        boolean updated = C3486L0.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            boolean updated2 = C3486L0.A05(A04);
            if (updated2) {
                A03.set(C3486L0.A01(A04));
                z10 = true;
            }
        }
        boolean A042 = C3486L0.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return z10;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return z10;
            }
        }
        String A043 = A04(19, 13, 79);
        boolean updated3 = C3486L0.A05(A043);
        if (updated3) {
            String A012 = C3486L0.A01(A043);
            AtomicReference<C26166C> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C26166C(A012, false, EnumC26156B.A04));
            return true;
        }
        return z10;
    }
}
