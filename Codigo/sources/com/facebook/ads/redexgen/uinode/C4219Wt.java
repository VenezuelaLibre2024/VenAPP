package com.facebook.ads.redexgen.uinode;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: com.facebook.ads.redexgen.X.Wt */
/* loaded from: assets/audience_network.dex */
public final class C4219Wt implements InterfaceC3026DD {
    public static String[] A06 = {"f3ASEvE0MACuH7PXtcW6SQzpVLuDWBs6", "UAkl7YLcJ73MhJIfOQ7gtBxP58V39hXf", "sKTt9gGYn0qCOxzPnchEZBW", "TIj2tKxLfGdHgu1Q1GnzrxOOh9OPKkUY", "NlS114awdnJt6ePSWIiXVyR", "Ttbg6FQm3oQML", "hnRFaN1D1NI4WPLkXSYbmAvKq8H9o2zk", "6DjXFLFEMVHWeegs6rtlgiLmiwpKRWRw"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC3020D6 A04;
    public final C3306Hz A05 = new C3306Hz(32);

    public C4219Wt(InterfaceC3020D6 interfaceC3020D6) {
        this.A04 = interfaceC3020D6;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3026DD
    public final void A4S(C3306Hz c3306Hz, boolean z10) {
        int i10 = -1;
        if (z10) {
            int A0E = c3306Hz.A0E();
            int A062 = c3306Hz.A06();
            String[] strArr = A06;
            String str = strArr[4];
            String str2 = strArr[2];
            int payloadStartOffset = str.length();
            if (payloadStartOffset != str2.length()) {
                throw new RuntimeException();
            }
            A06[5] = "fX8Qw0M3arh1i";
            i10 = A062 + A0E;
        }
        if (this.A03) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            c3306Hz.A0Y(i10);
            this.A00 = 0;
        }
        while (c3306Hz.A04() > 0) {
            int payloadStartPosition = this.A00;
            if (payloadStartPosition < 3) {
                if (payloadStartPosition == 0) {
                    int tableId = c3306Hz.A0E();
                    c3306Hz.A0Y(c3306Hz.A06() - 1);
                    if (tableId == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int tableId2 = c3306Hz.A04();
                int min = Math.min(tableId2, 3 - this.A00);
                c3306Hz.A0c(this.A05.A00, this.A00, min);
                int payloadStartPosition2 = this.A00 + min;
                this.A00 = payloadStartPosition2;
                if (payloadStartPosition2 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int A0E2 = this.A05.A0E();
                    int headerBytesToRead = this.A05.A0E();
                    this.A02 = (A0E2 & RecognitionOptions.ITF) != 0;
                    this.A01 = (((A0E2 & 15) << 8) | headerBytesToRead) + 3;
                    int headerBytesToRead2 = this.A05.A05();
                    if (headerBytesToRead2 < this.A01) {
                        byte[] bArr = this.A05.A00;
                        C3306Hz c3306Hz2 = this.A05;
                        int headerBytesToRead3 = this.A01;
                        c3306Hz2.A0W(Math.min(4098, Math.max(headerBytesToRead3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int A04 = c3306Hz.A04();
                int headerBytesToRead4 = this.A01;
                int min2 = Math.min(A04, headerBytesToRead4 - this.A00);
                c3306Hz.A0c(this.A05.A00, this.A00, min2);
                int payloadStartPosition3 = this.A00 + min2;
                this.A00 = payloadStartPosition3;
                int bodyBytesToRead = this.A01;
                if (payloadStartPosition3 != bodyBytesToRead) {
                    continue;
                } else {
                    if (this.A02) {
                        if (AbstractC3322IF.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0W(this.A01 - 4);
                    } else {
                        this.A05.A0W(bodyBytesToRead);
                    }
                    this.A04.A4R(this.A05);
                    this.A00 = 0;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3026DD
    public final void A8q(C3318IB c3318ib, InterfaceC2952Bu interfaceC2952Bu, C3025DC c3025dc) {
        this.A04.A8q(c3318ib, interfaceC2952Bu, c3025dc);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3026DD
    public final void AFg() {
        this.A03 = true;
    }
}
