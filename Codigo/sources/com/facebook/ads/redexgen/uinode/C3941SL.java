package com.facebook.ads.redexgen.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.SL */
/* loaded from: assets/audience_network.dex */
public final class C3941SL extends C3676O4 {
    public final ImageView A00;
    public final C4337Yn A01;

    public C3941SL(C4337Yn c4337Yn) {
        super(c4337Yn);
        this.A01 = c4337Yn;
        ImageView imageView = new ImageView(c4337Yn);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC4034Tq downloadImageTask = new AsyncTaskC4034Tq(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
