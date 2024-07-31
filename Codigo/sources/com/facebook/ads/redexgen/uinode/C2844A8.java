package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.A8 */
/* loaded from: assets/audience_network.dex */
public final class C2844A8 {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC2842A6 A0A;
    public final InterfaceC2843A7 A0B;
    public final AbstractC2853AH A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C2844A8(InterfaceC2842A6 interfaceC2842A6, InterfaceC2843A7 interfaceC2843A7, AbstractC2853AH abstractC2853AH, int i10, Handler handler) {
        this.A0A = interfaceC2842A6;
        this.A0B = interfaceC2843A7;
        this.A0C = abstractC2853AH;
        this.A03 = handler;
        this.A01 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC2843A7 A04() {
        return this.A0B;
    }

    public final C2844A8 A05() {
        AbstractC3281Ha.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            AbstractC3281Ha.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AFp(this);
        return this;
    }

    public final C2844A8 A06(int i10) {
        AbstractC3281Ha.A04(!this.A09);
        this.A00 = i10;
        return this;
    }

    public final C2844A8 A07(Object obj) {
        AbstractC3281Ha.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC2853AH A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC3281Ha.A04(this.A09);
        AbstractC3281Ha.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
