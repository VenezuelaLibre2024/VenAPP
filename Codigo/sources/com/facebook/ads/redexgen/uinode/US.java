package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class US extends AbstractC06704t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C06433r A00;

    public US(C06433r c06433r) {
        this.A00 = c06433r;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06704t
    public final void A0L(C0882Eb c0882Eb, int i10) {
        int scrollPosition;
        super.A0L(c0882Eb, i10);
        C1425Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        MJ mj2 = (MJ) c0882Eb.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (mj2 == null) {
            return;
        }
        mj2.AFr();
    }
}
