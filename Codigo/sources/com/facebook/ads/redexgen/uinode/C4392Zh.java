package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zh */
/* loaded from: assets/audience_network.dex */
public class C4392Zh implements InterfaceC25244i {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C3100Eb A00;

    public C4392Zh(C3100Eb c3100Eb) {
        this.A00 = c3100Eb;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25244i
    public final void AAj(AbstractC254856 abstractC254856) {
        boolean A0A;
        abstractC254856.A0X(true);
        if (abstractC254856.A06 != null && abstractC254856.A07 == null) {
            abstractC254856.A06 = null;
        }
        abstractC254856.A07 = null;
        A0A = abstractC254856.A0A();
        if (!A0A && !this.A00.A1v(abstractC254856.A0H) && abstractC254856.A0c()) {
            C3100Eb c3100Eb = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c3100Eb.removeDetachedView(abstractC254856.A0H, false);
        }
    }
}
