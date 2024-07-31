package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1492av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1502b5 A00;
    public final /* synthetic */ InterfaceC05811h A01;
    public final /* synthetic */ C05821i A02;
    public final /* synthetic */ C1399Yn A03;
    public final /* synthetic */ boolean A04;

    public C1492av(C05821i c05821i, C1399Yn c1399Yn, boolean z10, AbstractC1502b5 abstractC1502b5, InterfaceC05811h interfaceC05811h) {
        this.A02 = c05821i;
        this.A03 = c1399Yn;
        this.A04 = z10;
        this.A00 = abstractC1502b5;
        this.A01 = interfaceC05811h;
    }

    private void A00(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            C1399Yn c1399Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C0988Ih.A1O(c1399Yn) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(PC.A01(this.A03, this.A00, 1, new C1493aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
