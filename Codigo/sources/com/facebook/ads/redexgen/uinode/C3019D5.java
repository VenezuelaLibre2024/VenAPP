package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.D5 */
/* loaded from: assets/audience_network.dex */
public final class C3019D5 {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC3012Cy A05;
    public final C3305Hy A06 = new C3305Hy(new byte[64]);
    public final C3318IB A07;

    public C3019D5(InterfaceC3012Cy interfaceC3012Cy, C3318IB c3318ib) {
        this.A05 = interfaceC3012Cy;
        this.A07 = c3318ib;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long A04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j10 = A04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j10);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AFg();
    }

    public final void A03(C3306Hz c3306Hz) throws C28319v {
        c3306Hz.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c3306Hz.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADt(this.A01, true);
        this.A05.A4R(c3306Hz);
        this.A05.ADs();
    }
}
