package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0935Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0945Gp A06;
    public final InterfaceC0958Hd A07;

    public W8(InterfaceC0945Gp interfaceC0945Gp) {
        this(interfaceC0945Gp, ModuleDescriptor.MODULE_VERSION, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0958Hd.A00);
    }

    public W8(InterfaceC0945Gp interfaceC0945Gp, int i10, int i11, int i12, float f10, float f11, long j10, InterfaceC0958Hd interfaceC0958Hd) {
        this.A06 = interfaceC0945Gp;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A01 = f11;
        this.A05 = j10;
        this.A07 = interfaceC0958Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0935Gf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0834Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C0834Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
