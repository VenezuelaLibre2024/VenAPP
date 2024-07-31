package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1496az implements InterfaceC05811h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1502b5 A01;
    public final /* synthetic */ C1500b3 A02;
    public final /* synthetic */ InterfaceC05811h A03;
    public final /* synthetic */ C05821i A04;
    public final /* synthetic */ C1399Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C1496az(C05821i c05821i, C1399Yn c1399Yn, AbstractC1502b5 abstractC1502b5, C1500b3 c1500b3, int i10, InterfaceC05811h interfaceC05811h, EnumSet enumSet) {
        this.A04 = c05821i;
        this.A05 = c1399Yn;
        this.A01 = abstractC1502b5;
        this.A02 = c1500b3;
        this.A00 = i10;
        this.A03 = interfaceC05811h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C05821i c05821i = this.A04;
        C1399Yn c1399Yn = this.A05;
        EnumSet enumSet = this.A06;
        C1500b3 c1500b3 = this.A02;
        c05821i.A0A(c1399Yn, enumSet, c1500b3, c1500b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05811h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05811h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05811h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05811h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
