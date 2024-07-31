package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.YP */
/* loaded from: assets/audience_network.dex */
public class C4313YP implements InterfaceC26977j {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C4312YO A01;

    public C4313YP(C4312YO c4312yo, AdvertisingId advertisingId) {
        this.A01 = c4312yo;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26977j
    public final boolean A97() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26977j
    public final String getId() {
        return this.A00.getId();
    }
}
