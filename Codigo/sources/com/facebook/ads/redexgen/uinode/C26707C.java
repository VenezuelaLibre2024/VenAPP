package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C */
/* loaded from: assets/audience_network.dex */
public final class C26707C extends AbstractC3822QQ {
    public final Paint A00;
    public final C4337Yn A01;
    public final C3377JA A02;
    public final AbstractC3790Pu A03;
    public final AbstractC3721On A04;
    public final AbstractC3679O7 A05;
    public final C3839Qh A06;

    public C26707C(C4337Yn c4337Yn, boolean z10, C3377JA c3377ja) {
        super(c4337Yn);
        this.A04 = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C278398 c278398) {
                C3839Qh c3839Qh;
                c3839Qh = C26707C.this.A06;
                c3839Qh.setChecked(true);
            }
        };
        this.A05 = new AbstractC3679O7() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3680O8 c3680o8) {
                C3839Qh c3839Qh;
                c3839Qh = C26707C.this.A06;
                c3839Qh.setChecked(false);
            }
        };
        this.A03 = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27929H c27929h) {
                C3839Qh c3839Qh;
                c3839Qh = C26707C.this.A06;
                c3839Qh.setChecked(true);
            }
        };
        this.A02 = c3377ja;
        this.A01 = c4337Yn;
        C3839Qh c3839Qh = new C3839Qh(c4337Yn, z10);
        this.A06 = c3839Qh;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        c3839Qh.setLayoutParams(layoutParams);
        c3839Qh.setChecked(true);
        c3839Qh.setClickable(false);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        if (z10) {
            paint.setColor(-1728053248);
        } else {
            paint.setColor(-1);
            paint.setAlpha(204);
        }
        AbstractC3536Lo.A0M(this, 0);
        addView(c3839Qh);
        setGravity(17);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layout.addRule(13);
        setLayoutParams(layout);
        AbstractC3536Lo.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3822QQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC3836Qe(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3822QQ
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i10 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i10 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f10 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f10, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
