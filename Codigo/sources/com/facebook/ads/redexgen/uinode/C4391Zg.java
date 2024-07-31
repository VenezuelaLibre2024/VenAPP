package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zg */
/* loaded from: assets/audience_network.dex */
public class C4391Zg implements InterfaceC255159 {
    public final /* synthetic */ AbstractC25304o A00;

    public C4391Zg(AbstractC25304o abstractC25304o) {
        this.A00 = abstractC25304o;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final View A6M(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A6O(View view) {
        return this.A00.A0n(view) + ((C25314p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A6P(View view) {
        return this.A00.A0k(view) - ((C25314p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A7a() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A7b() {
        return this.A00.A0e();
    }
}
