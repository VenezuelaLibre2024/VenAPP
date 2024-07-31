package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.az */
/* loaded from: assets/audience_network.dex */
public class C4470az implements InterfaceC23401h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC4476b5 A01;
    public final /* synthetic */ C4474b3 A02;
    public final /* synthetic */ InterfaceC23401h A03;
    public final /* synthetic */ C23411i A04;
    public final /* synthetic */ C4337Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C4470az(C23411i c23411i, C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, C4474b3 c4474b3, int i10, InterfaceC23401h interfaceC23401h, EnumSet enumSet) {
        this.A04 = c23411i;
        this.A05 = c4337Yn;
        this.A01 = abstractC4476b5;
        this.A02 = c4474b3;
        this.A00 = i10;
        this.A03 = interfaceC23401h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C23411i c23411i = this.A04;
        C4337Yn c4337Yn = this.A05;
        EnumSet enumSet = this.A06;
        C4474b3 c4474b3 = this.A02;
        c23411i.A0A(c4337Yn, enumSet, c4474b3, c4474b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23401h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23401h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23401h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23401h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
