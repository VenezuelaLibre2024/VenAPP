package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.US */
/* loaded from: assets/audience_network.dex */
public class C4071US extends AbstractC25354t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C24723r A00;

    public C4071US(C24723r c24723r) {
        this.A00 = c24723r;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25354t
    public final void A0L(C3100Eb c3100Eb, int i10) {
        int scrollPosition;
        super.A0L(c3100Eb, i10);
        C4399Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        InterfaceC3567MJ interfaceC3567MJ = (InterfaceC3567MJ) c3100Eb.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (interfaceC3567MJ == null) {
            return;
        }
        interfaceC3567MJ.AFr();
    }
}
