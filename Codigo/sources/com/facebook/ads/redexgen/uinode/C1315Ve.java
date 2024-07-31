package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1315Ve implements InterfaceC0971Hq {
    public long A00;
    public long A01;
    public C07909x A02 = C07909x.A04;
    public boolean A03;
    public final InterfaceC0958Hd A04;

    public C1315Ve(InterfaceC0958Hd interfaceC0958Hd) {
        this.A04 = interfaceC0958Hd;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5T();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7k());
            this.A03 = false;
        }
    }

    public final void A02(long j10) {
        this.A01 = j10;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0971Hq
    public final C07909x A7h() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0971Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5T = this.A04.A5T();
            long positionUs = this.A00;
            long j10 = A5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j10);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j10);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0971Hq
    public final C07909x AGA(C07909x c07909x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c07909x;
        return c07909x;
    }
}
