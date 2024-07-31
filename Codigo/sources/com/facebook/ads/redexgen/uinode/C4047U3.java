package com.facebook.ads.redexgen.uinode;

import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.U3 */
/* loaded from: assets/audience_network.dex */
public class C4047U3 implements InterfaceC3639NT {
    public final /* synthetic */ C3629NJ A00;

    public C4047U3(C3629NJ c3629nj) {
        this.A00 = c3629nj;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3639NT
    public final void AAv(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A08;
        if (z11) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3639NT
    public final void ABZ(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A08;
        if (z11) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }
}
