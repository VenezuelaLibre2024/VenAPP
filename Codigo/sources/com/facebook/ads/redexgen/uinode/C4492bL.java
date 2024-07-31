package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bL */
/* loaded from: assets/audience_network.dex */
public class C4492bL extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4491bK A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C4492bL(C4491bK c4491bK, Map map, Map map2) {
        this.A00 = c4491bK;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C230114 c230114;
        C4337Yn c4337Yn;
        C230114 c2301142;
        c230114 = this.A00.A01;
        if (!TextUtils.isEmpty(c230114.A0Y())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c4337Yn = this.A00.A0A;
            InterfaceC3369J2 A09 = c4337Yn.A09();
            c2301142 = this.A00.A01;
            A09.AA4(c2301142.A0Y(), hashMap);
        }
    }
}
