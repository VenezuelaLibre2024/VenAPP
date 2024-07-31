package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.SW */
/* loaded from: assets/audience_network.dex */
public class C3952SW implements InterfaceC3724Oq {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ C3785Pp A00;
    public final /* synthetic */ C3951SV A01;

    public C3952SW(C3951SV c3951sv, C3785Pp c3785Pp) {
        this.A01 = c3951sv;
        this.A00 = c3785Pp;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3724Oq
    public final void AAn() {
        C3872RE c3872re;
        C3872RE c3872re2;
        C3872RE c3872re3;
        if (this.A00.A02() == 0) {
            c3872re3 = this.A01.A02;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            c3872re3.A0U();
        }
        c3872re = this.A01.A03;
        if (c3872re != null) {
            c3872re2 = this.A01.A03;
            c3872re2.A0U();
        }
    }
}
