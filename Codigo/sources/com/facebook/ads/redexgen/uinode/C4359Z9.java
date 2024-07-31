package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Z9 */
/* loaded from: assets/audience_network.dex */
public class C4359Z9 implements InterfaceC25925o {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C25945q A01;
    public final /* synthetic */ C4107V2 A02;

    public C4359Z9(C25945q c25945q, ImageView imageView, C4107V2 c4107v2) {
        this.A01 = c25945q;
        this.A00 = imageView;
        this.A02 = c4107v2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25925o
    public final void ABi(Drawable drawable) {
        C4107V2.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
