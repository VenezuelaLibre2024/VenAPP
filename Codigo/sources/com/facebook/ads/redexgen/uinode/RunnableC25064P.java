package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.4P */
/* loaded from: assets/audience_network.dex */
public final class RunnableC25064P implements Runnable {
    public static Comparator<C25054O> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<RunnableC25064P> A07;
    public long A00;
    public long A01;
    public ArrayList<C3100Eb> A02 = new ArrayList<>();
    public ArrayList<C25054O> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C25054O>() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C25054O c25054o, C25054O c25054o2) {
                if ((c25054o.A03 == null) != (c25054o2.A03 == null)) {
                    return c25054o.A03 == null ? 1 : -1;
                }
                if (c25054o.A04 != c25054o2.A04) {
                    return c25054o.A04 ? -1 : 1;
                }
                int i10 = c25054o2.A02 - c25054o.A02;
                if (i10 != 0) {
                    return i10;
                }
                int i11 = c25054o.A00;
                int deltaViewVelocity = c25054o2.A00;
                int i12 = i11 - deltaViewVelocity;
                if (i12 != 0) {
                    return i12;
                }
                return 0;
            }
        };
    }

    private AbstractC254856 A00(C3100Eb c3100Eb, int i10, long j10) {
        if (A08(c3100Eb, i10)) {
            return null;
        }
        C25384w c25384w = c3100Eb.A0r;
        try {
            c3100Eb.A1K();
            AbstractC254856 A0I = c25384w.A0I(i10, false, j10);
            if (A0I != null) {
                if (A0I.A0Y() && !A0I.A0Z()) {
                    c25384w.A0T(A0I.A0H);
                } else {
                    c25384w.A0Z(A0I, false);
                }
            }
            return A0I;
        } finally {
            c3100Eb.A1m(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02() {
        /*
            r10 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.Eb> r0 = r10.A02
            int r4 = r0.size()
            r5 = 0
            r3 = 0
        L8:
            r2 = 0
            if (r3 >= r4) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.Eb> r0 = r10.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.Eb r1 = (com.facebook.ads.redexgen.uinode.C3100Eb) r1
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L23
            com.facebook.ads.redexgen.X.Zp r0 = r1.A02
            r0.A04(r1, r2)
            com.facebook.ads.redexgen.X.Zp r0 = r1.A02
            int r0 = r0.A00
            int r5 = r5 + r0
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            r0.ensureCapacity(r5)
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.RunnableC25064P.A06
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L44
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.RunnableC25064P.A06
            java.lang.String r1 = "OH"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "7S"
            r0 = 7
            r2[r0] = r1
            r8 = 0
        L51:
            if (r8 >= r4) goto Lb3
            java.util.ArrayList<com.facebook.ads.redexgen.X.Eb> r0 = r10.A02
            java.lang.Object r9 = r0.get(r8)
            com.facebook.ads.redexgen.X.Eb r9 = (com.facebook.ads.redexgen.uinode.C3100Eb) r9
            int r0 = r9.getWindowVisibility()
            if (r0 == 0) goto L64
        L61:
            int r8 = r8 + 1
            goto L51
        L64:
            com.facebook.ads.redexgen.X.Zp r7 = r9.A02
            int r0 = r7.A01
            int r6 = java.lang.Math.abs(r0)
            int r0 = r7.A02
            int r0 = java.lang.Math.abs(r0)
            int r6 = r6 + r0
            r5 = 0
        L74:
            int r0 = r7.A00
            int r0 = r0 * 2
            if (r5 >= r0) goto L61
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            int r0 = r0.size()
            if (r3 < r0) goto Laa
            com.facebook.ads.redexgen.X.4O r0 = new com.facebook.ads.redexgen.X.4O
            r0.<init>()
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r1 = r10.A03
            r1.add(r0)
        L8c:
            int[] r2 = r7.A03
            int r1 = r5 + 1
            r2 = r2[r1]
            if (r2 > r6) goto La8
            r1 = 1
        L95:
            r0.A04 = r1
            r0.A02 = r6
            r0.A00 = r2
            r0.A03 = r9
            int[] r1 = r7.A03
            r1 = r1[r5]
            r0.A01 = r1
            int r3 = r3 + 1
            int r5 = r5 + 2
            goto L74
        La8:
            r1 = 0
            goto L95
        Laa:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.4O r0 = (com.facebook.ads.redexgen.uinode.C25054O) r0
            goto L8c
        Lb3:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r1 = r10.A03
            java.util.Comparator<com.facebook.ads.redexgen.X.4O> r0 = com.facebook.ads.redexgen.uinode.RunnableC25064P.A04
            java.util.Collections.sort(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.RunnableC25064P.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(long r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r3.A03
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r3.A03
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.4O r1 = (com.facebook.ads.redexgen.uinode.C25054O) r1
            com.facebook.ads.redexgen.X.Eb r0 = r1.A03
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            r3.A06(r1, r4)
            r1.A00()
            int r2 = r2 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.RunnableC25064P.A04(long):void");
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C25054O c25054o, long j10) {
        AbstractC254856 A00 = A00(c25054o.A03, c25054o.A01, c25054o.A04 ? Long.MAX_VALUE : j10);
        if (A00 != null && A00.A09 != null && A00.A0Y() && !A00.A0Z()) {
            A07(A00.A09.get(), j10);
        }
    }

    private void A07(C3100Eb c3100Eb, long j10) {
        if (c3100Eb == null) {
            return;
        }
        if (c3100Eb.A0C) {
            C24934C c24934c = c3100Eb.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c24934c.A06() != 0) {
                    c3100Eb.A1N();
                }
            }
            throw new RuntimeException();
        }
        C4400Zp c4400Zp = c3100Eb.A02;
        c4400Zp.A04(c3100Eb, true);
        if (c4400Zp.A00 != 0) {
            try {
                AbstractC24112q.A01(A01(0, 18, 7));
                c3100Eb.A0s.A05(c3100Eb.A04);
                int i10 = 0;
                while (true) {
                    int i11 = c4400Zp.A00 * 2;
                    int i12 = A06[6].charAt(8);
                    if (i12 == 73) {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i10 < i11) {
                        A00(c3100Eb, c4400Zp.A03[i10], j10);
                        i10 += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                AbstractC24112q.A00();
            }
        }
    }

    public static boolean A08(C3100Eb c3100Eb, int i10) {
        int A062 = c3100Eb.A01.A06();
        for (int i11 = 0; i11 < A062; i11++) {
            AbstractC254856 A0F = C3100Eb.A0F(c3100Eb.A01.A0A(i11));
            int childCount = A0F.A03;
            if (childCount == i10 && !A0F.A0Z()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C3100Eb c3100Eb) {
        this.A02.add(c3100Eb);
    }

    public final void A0A(C3100Eb c3100Eb) {
        this.A02.remove(c3100Eb);
    }

    public final void A0B(C3100Eb c3100Eb, int i10, int i11) {
        if (c3100Eb.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c3100Eb.getNanoTime();
            c3100Eb.post(this);
        }
        c3100Eb.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC24112q.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C3100Eb c3100Eb = this.A02.get(i10);
                if (c3100Eb.getWindowVisibility() == 0) {
                    j10 = Math.max(c3100Eb.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                AbstractC24112q.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(j10) + this.A00);
        } finally {
            this.A01 = 0L;
            AbstractC24112q.A00();
        }
    }
}
