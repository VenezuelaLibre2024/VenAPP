package com.facebook.ads.redexgen.uinode;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.W9 */
/* loaded from: assets/audience_network.dex */
public final class C4176W9 implements InterfaceC3173Fo {
    public static byte[] A04;
    public final int A00;
    public final List<C4177WA> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{19};
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4176W9(java.util.List<com.facebook.ads.redexgen.uinode.C4177WA> r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A01 = r8
            int r0 = r8.size()
            r7.A00 = r0
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A02 = r0
            r6 = 0
        L12:
            int r0 = r7.A00
            if (r6 >= r0) goto L2f
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.WA r5 = (com.facebook.ads.redexgen.uinode.C4177WA) r5
            int r4 = r6 * 2
            long[] r2 = r7.A02
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A02
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L12
        L2f:
            long[] r1 = r7.A02
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A03 = r0
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4176W9.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final List<C3172Fn> A6Z(long j10) {
        ArrayList arrayList = null;
        C4177WA c4177wa = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i10 = 0; i10 < this.A00; i10++) {
            long[] jArr = this.A02;
            if (jArr[i10 * 2] <= j10 && j10 < jArr[(i10 * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C4177WA c4177wa2 = this.A01.get(i10);
                if (c4177wa2.A00()) {
                    if (c4177wa == null) {
                        c4177wa = c4177wa2;
                    } else {
                        String A00 = A00(0, 1, 53);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(c4177wa.A0C).append((CharSequence) A00).append(c4177wa2.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(c4177wa2.A0C);
                        }
                    }
                } else {
                    arrayList.add(c4177wa2);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new C4177WA(normalCueTextBuilder));
        } else if (c4177wa != null) {
            arrayList.add(c4177wa);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final long A70(int i10) {
        boolean z10 = true;
        AbstractC3281Ha.A03(i10 >= 0);
        if (i10 >= this.A03.length) {
            z10 = false;
        }
        AbstractC3281Ha.A03(z10);
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A71() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A7T(long j10) {
        int A0A = AbstractC3322IF.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
