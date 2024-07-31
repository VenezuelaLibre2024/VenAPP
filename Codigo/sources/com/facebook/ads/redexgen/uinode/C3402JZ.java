package com.facebook.ads.redexgen.uinode;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.JZ */
/* loaded from: assets/audience_network.dex */
public final class C3402JZ {
    public final InterfaceC3400JX A0B;
    public final boolean A0F;
    public final String A0C = C3402JZ.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C3401JY> A0D = new LinkedList();

    public C3402JZ(C26937f c26937f, InterfaceC3400JX interfaceC3400JX) {
        int nativeViewabilityHistorySamplingRate = AbstractC3350Ij.A0D(c26937f);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c26937f.A08().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC3400JX;
    }

    private int A00() {
        return this.A0B.A6c();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C3401JY c3401jy) {
        synchronized (this.A0D) {
            this.A0D.add(c3401jy);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C3401JY(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 102, A00(), null));
    }

    public final void A0C(C26937f c26937f, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C3401JY(A01(), 103, A00(), null));
        ExecutorC3541Lt.A06.execute(new RunnableC3399JW(this, str, c26937f));
    }
}
