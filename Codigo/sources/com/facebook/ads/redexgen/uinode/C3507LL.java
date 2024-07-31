package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.LL */
/* loaded from: assets/audience_network.dex */
public class C3507LL extends AbstractRunnableC3455KT {
    public static String[] A02 = {"NpaKE5UdtAyMHqvaLPx4AGtZ31wY3C1j", "hZ", "QvlAFGERqyhtEWGueXr2oEhguGRVkueU", "1PB7Q2A0OVus1FFgj1K4N07XZBnviAmq", "QCLV5siYIKSB8enqXDrdMSWnSISBhPag", "u71qdrqstjoPYAgdzxDuhzTAB45rQyDC", "tsgBYsPi1Izoi1wW5rl36QAscdyZX4HE", "imzaDMEG6ltP9AayN9N6Pvq8SnbIyMdS"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3828QW A01;

    public C3507LL(C3828QW c3828qw, int i10) {
        this.A01 = c3828qw;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3930SA videoView;
        C3930SA videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null) {
            int i10 = this.A00;
            if (A02[1].length() == 23) {
                throw new RuntimeException();
            }
            A02[5] = "iSSYmESuchF7uAVhXaEYpov3466pRlYS";
            if (i10 <= 0) {
                videoView2 = this.A01.A00.A00.getVideoView();
                videoView2.A0e(false, 9);
            }
        }
    }
}
