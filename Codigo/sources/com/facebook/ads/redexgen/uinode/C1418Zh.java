package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1418Zh implements InterfaceC06594i {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C0882Eb A00;

    public C1418Zh(C0882Eb c0882Eb) {
        this.A00 = c0882Eb;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC06594i
    public final void AAj(AnonymousClass56 anonymousClass56) {
        boolean A0A;
        anonymousClass56.A0X(true);
        if (anonymousClass56.A06 != null && anonymousClass56.A07 == null) {
            anonymousClass56.A06 = null;
        }
        anonymousClass56.A07 = null;
        A0A = anonymousClass56.A0A();
        if (!A0A && !this.A00.A1v(anonymousClass56.A0H) && anonymousClass56.A0c()) {
            C0882Eb c0882Eb = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c0882Eb.removeDetachedView(anonymousClass56.A0H, false);
        }
    }
}
