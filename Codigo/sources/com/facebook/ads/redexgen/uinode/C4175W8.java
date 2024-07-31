package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* renamed from: com.facebook.ads.redexgen.X.W8 */
/* loaded from: assets/audience_network.dex */
public final class C4175W8 implements InterfaceC3224Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC3234Gp A06;
    public final InterfaceC3284Hd A07;

    public C4175W8(InterfaceC3234Gp interfaceC3234Gp) {
        this(interfaceC3234Gp, ModuleDescriptor.MODULE_VERSION, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC3284Hd.A00);
    }

    public C4175W8(InterfaceC3234Gp interfaceC3234Gp, int i10, int i11, int i12, float f10, float f11, long j10, InterfaceC3284Hd interfaceC3284Hd) {
        this.A06 = interfaceC3234Gp;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A01 = f11;
        this.A05 = j10;
        this.A07 = interfaceC3284Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3224Gf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2947Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C2947Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
