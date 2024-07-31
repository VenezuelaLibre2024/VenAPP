package com.facebook.ads.redexgen.uinode;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7H */
/* loaded from: assets/audience_network.dex */
public final class C26747H extends AbstractC3822QQ {
    public static String[] A01 = {"4h8fvEACfo1aNbNL", "KiY64Fil", "L", "TPcthrsJz3ToBiwYAQ4xewU", "cWfSExW1cmjdZd3Ek8eXqqhjC3VFU", "NINEnIjXlG8iO8hrf55I2V2lHb1VufX", "CO", "8GF4DU4RrtKBXlYvExHV9F2Nh74lSozH"};
    public final AbstractC27678s<C3659Nn> A00;

    public C26747H(C4337Yn c4337Yn) {
        this(c4337Yn, null);
    }

    public C26747H(C4337Yn c4337Yn, AttributeSet attributeSet) {
        this(c4337Yn, attributeSet, 0);
    }

    public C26747H(C4337Yn c4337Yn, AttributeSet attributeSet, int i10) {
        super(c4337Yn, attributeSet, i10);
        this.A00 = new C3463Kb(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3822QQ
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            C3930SA videoView = getVideoView();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            videoView.getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3822QQ
    public final void A08() {
        if (getVideoView() != null) {
            C27668r<AbstractC27678s, C27658q> eventBus = getVideoView().getEventBus();
            AbstractC27678s<C3659Nn> abstractC27678s = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4Zu3PRCBzV1MZjgNBq7KORh";
            strArr2[1] = "VnRIjxfO";
            eventBus.A06(abstractC27678s);
        }
        setVisibility(8);
        super.A08();
    }
}
