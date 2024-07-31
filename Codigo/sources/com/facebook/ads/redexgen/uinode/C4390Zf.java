package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zf */
/* loaded from: assets/audience_network.dex */
public class C4390Zf implements InterfaceC255159 {
    public final /* synthetic */ AbstractC25304o A00;

    public C4390Zf(AbstractC25304o abstractC25304o) {
        this.A00 = abstractC25304o;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final View A6M(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A6O(View view) {
        return this.A00.A0j(view) + ((C25314p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A6P(View view) {
        return this.A00.A0o(view) - ((C25314p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A7a() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC255159
    public final int A7b() {
        return this.A00.A0g();
    }
}
