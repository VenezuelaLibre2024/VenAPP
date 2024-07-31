package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zu */
/* loaded from: assets/audience_network.dex */
public class C4405Zu implements InterfaceC24773w {
    public final /* synthetic */ C3105Eg A00;
    public final /* synthetic */ C24753u A01;

    public C4405Zu(C3105Eg c3105Eg, C24753u c24753u) {
        this.A00 = c3105Eg;
        this.A01 = c24753u;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24773w
    public final Object A4W(int i10) {
        C24733s compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24773w
    public final List<Object> A5h(String str, int i10) {
        List<C24733s> A03 = this.A01.A03(str, i10);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(A03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC24773w
    public final boolean ADx(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
