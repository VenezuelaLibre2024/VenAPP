package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve */
/* loaded from: assets/audience_network.dex */
public final class C4145Ve implements InterfaceC3297Hq {
    public long A00;
    public long A01;
    public C28339x A02 = C28339x.A04;
    public boolean A03;
    public final InterfaceC3284Hd A04;

    public C4145Ve(InterfaceC3284Hd interfaceC3284Hd) {
        this.A04 = interfaceC3284Hd;
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final C28339x A7h() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5T = this.A04.A5T();
            long positionUs = this.A00;
            long j10 = A5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = AbstractC28079W.A00(j10);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j10);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final C28339x AGA(C28339x c28339x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c28339x;
        return c28339x;
    }
}
