package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cj */
/* loaded from: assets/audience_network.dex */
public final class C2999Cj {
    public static String[] A05 = {"lKy0YI5EGjXv2", "kqfQDU0iwDhqaMHC0BsTfGE6FjC2jeup", "jv6iVn6YCI", "Kbod1kIlqRm2x7YGttwPvO3kKDdBerP9", "AKxPCvcOfBY8Sui08oZDK8EPANpoB5ev", "JY0GDhLNZiQYBqJ9WzpbNW6VWiMf19In", "nhad57ygvI1TjLq62wNjXmGRomNY9pWS", "x2lvOIXYuZTotm1szSwJqESRclSL2a8b"};
    public int A01;
    public boolean A02;
    public final C3000Ck A03 = new C3000Ck();
    public final C3306Hz A04 = new C3306Hz(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i10) {
        int segmentLength;
        this.A01 = 0;
        int i11 = 0;
        do {
            int i12 = this.A01 + i10;
            C3000Ck c3000Ck = this.A03;
            if (A05[0].length() == 13) {
                A05[5] = "SgZ2PRj4NlkJ3BHKSnaMRED72QUEdulA";
                int size = c3000Ck.A02;
                if (i12 >= size) {
                    break;
                }
                int[] iArr = this.A03.A09;
                int i13 = this.A01;
                int size2 = i13 + 1;
                this.A01 = size2;
                segmentLength = iArr[i13 + i10];
                i11 += segmentLength;
            } else {
                throw new RuntimeException();
            }
        } while (segmentLength == 255);
        return i11;
    }

    public final C3000Ck A01() {
        return this.A03;
    }

    public final C3306Hz A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C3306Hz c3306Hz = this.A04;
        byte[] bArr = c3306Hz.A00;
        C3306Hz c3306Hz2 = this.A04;
        if (A05[2].length() == 26) {
            throw new RuntimeException();
        }
        A05[0] = "HnsfJzdopseCo";
        c3306Hz.A00 = Arrays.copyOf(bArr, Math.max(65025, c3306Hz2.A07()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r6 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r10.A04.A05() >= (r10.A04.A07() + r6)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r8 = r10.A04;
        r9 = r8.A00;
        r7 = r10.A04.A07() + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C2999Cj.A05[5].charAt(15) == '3') goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        com.facebook.ads.redexgen.uinode.C2999Cj.A05[2] = "JzmWwV1YqYi";
        r8.A00 = java.util.Arrays.copyOf(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        r11.readFully(r10.A04.A00, r10.A04.A07(), r6);
        r1 = r10.A04;
        r1.A0X(r1.A07() + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        if (r10.A03.A09[r3 - 1] == 255) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        r10.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (r3 != r10.A03.A02) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        r10.A00 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        if (r6 > 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.ads.redexgen.uinode.InterfaceC2951Bt r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C2999Cj.A05(com.facebook.ads.redexgen.X.Bt):boolean");
    }
}
