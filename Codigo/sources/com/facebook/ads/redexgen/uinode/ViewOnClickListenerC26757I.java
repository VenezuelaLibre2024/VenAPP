package com.facebook.ads.redexgen.uinode;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7I */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC26757I extends AbstractC3822QQ implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final AbstractC3790Pu A00;
    public final AbstractC3721On A01;
    public final AbstractC3679O7 A02;
    public final AbstractC3643NX A03;
    public final C3839Qh A04;

    public ViewOnClickListenerC26757I(C4337Yn c4337Yn) {
        this(c4337Yn, null);
    }

    public ViewOnClickListenerC26757I(C4337Yn c4337Yn, AttributeSet attributeSet) {
        this(c4337Yn, attributeSet, 0);
    }

    public ViewOnClickListenerC26757I(C4337Yn c4337Yn, AttributeSet attributeSet, int i10) {
        super(c4337Yn, attributeSet, i10);
        this.A03 = new AbstractC3643NX() { // from class: com.facebook.ads.redexgen.X.7P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3659Nn c3659Nn) {
                ViewOnClickListenerC26757I.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C278398 c278398) {
                C3839Qh c3839Qh;
                c3839Qh = ViewOnClickListenerC26757I.this.A04;
                c3839Qh.setChecked(true);
            }
        };
        this.A02 = new AbstractC3679O7() { // from class: com.facebook.ads.redexgen.X.7M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3680O8 c3680o8) {
                C3839Qh c3839Qh;
                c3839Qh = ViewOnClickListenerC26757I.this.A04;
                c3839Qh.setChecked(false);
            }
        };
        this.A00 = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.7L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27929H c27929h) {
                C3839Qh c3839Qh;
                c3839Qh = ViewOnClickListenerC26757I.this.A04;
                c3839Qh.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        C3839Qh c3839Qh = new C3839Qh(c4337Yn);
        this.A04 = c3839Qh;
        c3839Qh.setChecked(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(c3839Qh, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3822QQ
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3822QQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            C3930SA videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC3869RB.A07 || videoView.getState() == EnumC3869RB.A05 || videoView.getState() == EnumC3869RB.A06) {
                videoView.A0b(EnumC3818QM.A04, 11);
            } else if (videoView.getState() == EnumC3869RB.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th2) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            AbstractC3447KL.A00(th2, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
