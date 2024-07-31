package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.av */
/* loaded from: assets/audience_network.dex */
public class C4466av implements InterfaceC26336U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC4476b5 A00;
    public final /* synthetic */ InterfaceC23401h A01;
    public final /* synthetic */ C23411i A02;
    public final /* synthetic */ C4337Yn A03;
    public final /* synthetic */ boolean A04;

    public C4466av(C23411i c23411i, C4337Yn c4337Yn, boolean z10, AbstractC4476b5 abstractC4476b5, InterfaceC23401h interfaceC23401h) {
        this.A02 = c23411i;
        this.A03 = c4337Yn;
        this.A04 = z10;
        this.A00 = abstractC4476b5;
        this.A01 = interfaceC23401h;
    }

    private void A00(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            C4337Yn c4337Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C3348Ih.A1O(c4337Yn) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC3746PC.A01(this.A03, this.A00, 1, new C4467aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void AB2() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void ABB() {
        A00(true);
    }
}
