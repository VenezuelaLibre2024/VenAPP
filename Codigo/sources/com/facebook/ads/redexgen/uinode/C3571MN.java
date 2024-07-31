package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.MN */
/* loaded from: assets/audience_network.dex */
public final class C3571MN extends AdNativeComponentView {
    public static final int A01 = (int) (AbstractC3499LD.A02 * 1.0f);
    public final ImageView A00;

    public C3571MN(C4337Yn c4337Yn) {
        super(c4337Yn);
        C3583MZ c3583mz = new C3583MZ(c4337Yn);
        this.A00 = c3583mz;
        c3583mz.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC3504LI.A04(c3583mz, EnumC3504LI.A0A);
        addView(c3583mz, new ViewGroup.LayoutParams(-1, -1));
        AbstractC3536Lo.A0M(c3583mz, -2130706433);
        int i10 = A01;
        setPadding(i10, i10, i10, i10);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
