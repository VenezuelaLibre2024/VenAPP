package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba */
/* loaded from: assets/audience_network.dex */
public class C1533ba implements InterfaceC05590k {
    public final /* synthetic */ C1399Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1533ba(JSONObject jSONObject, C1399Yn c1399Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c1399Yn;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05590k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05590k
    public final Collection<String> A6n() {
        return AbstractC05600l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05590k
    public final EnumC05580j A7E() {
        return AbstractC05600l.A00(this.A02);
    }
}
