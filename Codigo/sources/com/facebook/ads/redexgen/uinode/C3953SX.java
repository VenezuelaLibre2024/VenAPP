package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.SX */
/* loaded from: assets/audience_network.dex */
public class C3953SX extends AbstractC3871RD {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC3369J2 A00;
    public final /* synthetic */ C3528Lg A01;
    public final /* synthetic */ C3785Pp A02;
    public final /* synthetic */ C3951SV A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C3953SX(C3951SV c3951sv, String str, C3785Pp c3785Pp, InterfaceC3369J2 interfaceC3369J2, Map map, C3528Lg c3528Lg) {
        this.A03 = c3951sv;
        this.A04 = str;
        this.A02 = c3785Pp;
        this.A00 = interfaceC3369J2;
        this.A05 = map;
        this.A01 = c3528Lg;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        C3872RE c3872re;
        SparseBooleanArray sparseBooleanArray;
        C3872RE c3872re2;
        C23271U c23271u;
        C4337Yn c4337Yn;
        SparseBooleanArray sparseBooleanArray2;
        c3872re = this.A03.A02;
        if (c3872re.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC3369J2 interfaceC3369J2 = this.A00;
                String str2 = this.A04;
                C3654Ni c3654Ni = new C3654Ni(this.A05);
                c3872re2 = this.A03.A03;
                interfaceC3369J2.A9g(str2, c3654Ni.A03(c3872re2).A02(this.A01).A05());
                c23271u = this.A03.A00;
                c4337Yn = this.A03.A06;
                C23271U.A07(c23271u, c4337Yn);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
