package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.google.android.gms.common.api.C5101a;

/* renamed from: com.facebook.ads.redexgen.X.Ec */
/* loaded from: assets/audience_network.dex */
public final class C3101Ec extends AbstractC4384ZY {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    public AbstractC25144Y A00;
    public AbstractC25144Y A01;

    private int A00(AbstractC25304o abstractC25304o, View view, AbstractC25144Y abstractC25144Y) {
        int containerCenter;
        int A0F = abstractC25144Y.A0F(view) + (abstractC25144Y.A0D(view) / 2);
        if (abstractC25304o.A1T()) {
            int A0A = abstractC25144Y.A0A();
            int childCenter = abstractC25144Y.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = abstractC25144Y.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private View A01(AbstractC25304o abstractC25304o, AbstractC25144Y abstractC25144Y) {
        int childCenter;
        int A0W = abstractC25304o.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC25304o.A1T()) {
            int A0A = abstractC25144Y.A0A();
            int A0B = abstractC25144Y.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            int childCount = A0B / 2;
            childCenter = A0A + childCount;
        } else {
            int childCount2 = abstractC25144Y.A06();
            childCenter = childCount2 / 2;
        }
        int i10 = C5101a.e.API_PRIORITY_OTHER;
        for (int absClosest = 0; absClosest < A0W; absClosest++) {
            View A0t = abstractC25304o.A0t(absClosest);
            int A0F = abstractC25144Y.A0F(A0t);
            int childCount3 = abstractC25144Y.A0D(A0t);
            int childCount4 = Math.abs((A0F + (childCount3 / 2)) - childCenter);
            if (childCount4 < i10) {
                i10 = childCount4;
                view = A0t;
            }
        }
        return view;
    }

    private View A02(AbstractC25304o abstractC25304o, AbstractC25144Y abstractC25144Y) {
        int A0W = abstractC25304o.A0W();
        if (A0W == 0) {
            return null;
        }
        View closestChild = null;
        int childStart = C5101a.e.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < A0W; i10++) {
            View A0t = abstractC25304o.A0t(i10);
            int childCount = abstractC25144Y.A0F(A0t);
            if (childCount < childStart) {
                childStart = childCount;
                if (A02[3].length() != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                closestChild = A0t;
            }
        }
        return closestChild;
    }

    private AbstractC25144Y A03(AbstractC25304o abstractC25304o) {
        AbstractC25144Y abstractC25144Y = this.A00;
        if (abstractC25144Y == null || abstractC25144Y.A02 != abstractC25304o) {
            this.A00 = AbstractC25144Y.A00(abstractC25304o);
        }
        return this.A00;
    }

    private AbstractC25144Y A04(AbstractC25304o abstractC25304o) {
        AbstractC25144Y abstractC25144Y = this.A01;
        if (abstractC25144Y == null || abstractC25144Y.A02 != abstractC25304o) {
            this.A01 = AbstractC25144Y.A01(abstractC25304o);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r4.x < 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r4.y >= 0.0f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC4384ZY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0C(com.facebook.ads.redexgen.uinode.AbstractC25304o r10, int r11, int r12) {
        /*
            r9 = this;
            int r8 = r10.A0Z()
            r4 = -1
            if (r8 != 0) goto L8
            return r4
        L8:
            r1 = 0
            boolean r0 = r10.A21()
            if (r0 == 0) goto L1a
            com.facebook.ads.redexgen.X.4Y r0 = r9.A04(r10)
            android.view.View r1 = r9.A02(r10, r0)
        L17:
            if (r1 != 0) goto L42
            return r4
        L1a:
            boolean r0 = r10.A20()
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.4Y r3 = r9.A03(r10)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C3101Ec.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3101Ec.A02
            java.lang.String r1 = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo"
            r0 = 4
            r2[r0] = r1
            android.view.View r1 = r9.A02(r10, r3)
            goto L17
        L42:
            int r3 = r10.A0p(r1)
            if (r3 != r4) goto L49
            return r4
        L49:
            boolean r0 = r10.A20()
            r7 = 0
            if (r0 == 0) goto La1
            if (r11 <= 0) goto L9f
            r6 = 1
        L53:
            r5 = 0
            boolean r0 = r10 instanceof com.facebook.ads.redexgen.uinode.InterfaceC254250
            if (r0 == 0) goto L89
            com.facebook.ads.redexgen.X.50 r10 = (com.facebook.ads.redexgen.uinode.InterfaceC254250) r10
            int r0 = r8 + (-1)
            android.graphics.PointF r4 = r10.A4O(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C3101Ec.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3101Ec.A02
            java.lang.String r1 = "yuw4mNpzW34AqVSRehlxNeo"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkUUhZpWZ02e"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L89
        L7a:
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L87
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
        L87:
            r7 = 1
        L88:
            r5 = r7
        L89:
            if (r5 == 0) goto L90
            if (r6 == 0) goto L8f
            int r3 = r3 + (-1)
        L8f:
            return r3
        L90:
            if (r6 == 0) goto L8f
            int r3 = r3 + 1
            goto L8f
        L95:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3101Ec.A02
            java.lang.String r1 = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L89
            goto L7a
        L9f:
            r6 = 0
            goto L53
        La1:
            if (r12 <= 0) goto La5
            r6 = 1
            goto L53
        La5:
            r6 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3101Ec.A0C(com.facebook.ads.redexgen.X.4o, int, int):int");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4384ZY
    public final View A0D(AbstractC25304o abstractC25304o) {
        if (abstractC25304o.A21()) {
            return A01(abstractC25304o, A04(abstractC25304o));
        }
        if (abstractC25304o.A20()) {
            return A01(abstractC25304o, A03(abstractC25304o));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4384ZY
    public final C4398Zn A0E(AbstractC25304o abstractC25304o) {
        if (!(abstractC25304o instanceof InterfaceC254250)) {
            return null;
        }
        return new C3102Ed(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4384ZY
    public final int[] A0H(AbstractC25304o abstractC25304o, View view) {
        int[] iArr = new int[2];
        if (abstractC25304o.A20()) {
            iArr[0] = A00(abstractC25304o, view, A03(abstractC25304o));
        } else {
            iArr[0] = 0;
        }
        boolean A21 = abstractC25304o.A21();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (A21) {
            iArr[1] = A00(abstractC25304o, view, A04(abstractC25304o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
