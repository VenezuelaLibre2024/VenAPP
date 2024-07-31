package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba */
/* loaded from: assets/audience_network.dex */
public class C4507ba implements InterfaceC22820k {
    public final /* synthetic */ C4337Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C4507ba(JSONObject jSONObject, C4337Yn c4337Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c4337Yn;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22820k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22820k
    public final Collection<String> A6n() {
        return AbstractC22830l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22820k
    public final EnumC22810j A7E() {
        return AbstractC22830l.A00(this.A02);
    }
}
