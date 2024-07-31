package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.B4 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2902B4 extends AbstractC4010TS {
    public RelativeLayout A00;
    public C3583MZ A01;
    public InterfaceC3724Oq A02;
    public C3957Sb A03;
    public C3787Pr A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C4337Yn A0B;
    public final C3697OP A0C;
    public final AbstractC3790Pu A0D;
    public final AbstractC3721On A0E;
    public final AbstractC3679O7 A0F;
    public final AbstractC3643NX A0G;
    public final AbstractC3579MV A0H;
    public final String A0I;
    public static String[] A0J = {"ZJd3r9AhG0a", "i1M", "myOt", "scTs", "x2qjzjwt5KjNEBlbZiSy7b60v5gMv07i", "l9mbaUlHikXHnlqbzXlarwn", "RgzjkxP8tSu3AToRYAuzqOa1HsgYA", "48ukShptsWaLS3SUfEjE876"};
    public static final int A0L = (int) (AbstractC3499LD.A02 * 1.0f);
    public static final int A0M = (int) (AbstractC3499LD.A02 * 4.0f);
    public static final int A0K = (int) (AbstractC3499LD.A02 * 6.0f);

    public abstract void A19(C4337Yn c4337Yn);

    public AbstractC2902B4(C3697OP c3697op, boolean z10, String str, C3957Sb c3957Sb) {
        super(c3697op, z10);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0H = new C2915BH(this);
        this.A0D = new C2914BG(this);
        this.A0F = new C2913BF(this);
        this.A0E = new C2911BD(this);
        this.A0G = new C2903B5(this);
        this.A0C = c3697op;
        this.A03 = c3957Sb;
        this.A0I = str;
        C4337Yn A05 = c3697op.A05();
        this.A0B = A05;
        setGravity(17);
        int i10 = A0L;
        setPadding(i10, 0, i10, i10);
        AbstractC3536Lo.A0M(this, 0);
        setUpView(A05);
        Paint paint = new Paint();
        this.A08 = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A02 == null) {
            return;
        }
        if ((A18() && this.A07) || (!A18() && this.A06)) {
            this.A02.AAn();
        }
    }

    private void A05(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC3536Lo.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final void A14() {
        if (A18()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final void A15() {
        if (A18()) {
            A16();
            this.A04.A05(EnumC3818QM.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final void A16() {
        float volume = this.A03.A0P().getVolume();
        if (A18()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                this.A04.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final boolean A17() {
        return A18() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final boolean A18() {
        return this.A05;
    }

    public final void A1A(Map<String, String> extraParams) {
        this.A04.A02();
        if (A18()) {
            this.A04.A04(getAdEventManager(), this.A0I, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C3787Pr getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i10 = A0K;
        path.addRoundRect(rectF, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0L, 0.0f, getWidth() - r3, getHeight() - r3);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i11 = A0M;
        path2.addRoundRect(rectF2, i11, i11, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A03(str, str2, null, true, false);
    }

    public void setCTAInfo(C23231Q c23231q, Map<String, String> extraData) {
        getCtaButton().setCta(c23231q, this.A0I, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC4034Tq(this.A01, this.A0B).A04().A06(new C4009TR(this, null)).A07(str);
    }

    public void setIsVideo(boolean z10) {
        this.A05 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC3724Oq interfaceC3724Oq) {
        this.A02 = interfaceC3724Oq;
    }

    public void setUpImageView(C4337Yn c4337Yn) {
        this.A01 = new C3583MZ(c4337Yn);
        if (C3348Ih.A16(c4337Yn)) {
            AbstractC3657Nl.A00(this.A01, C3348Ih.A17(c4337Yn), new ViewOnClickListenerC3729Ov(this));
        }
        A05(this.A01);
    }

    public void setUpMediaContainer(C4337Yn c4337Yn) {
        RelativeLayout relativeLayout = new RelativeLayout(c4337Yn);
        this.A00 = relativeLayout;
        A05(relativeLayout);
        if (this.A0C.A04().A0l() && C3348Ih.A2N(this.A0B)) {
            this.A00.setOnClickListener(new ViewOnClickListenerC3728Ou(this));
        }
    }

    public void setUpVideoView(C4337Yn c4337Yn) {
        this.A04 = new C3787Pr(c4337Yn, new C3377JA(this.A0I, getAdEventManager()));
        if (C3348Ih.A18(c4337Yn)) {
            AbstractC3657Nl.A00(this.A04, C3348Ih.A19(c4337Yn), new ViewOnClickListenerC3730Ow(this));
        }
        A05(this.A04);
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0J[4] = "V2iAUpZbaEbKk91ZDPvMgym9lCZNc3yl";
    }

    private void setUpView(C4337Yn c4337Yn) {
        setUpImageView(c4337Yn);
        setUpVideoView(c4337Yn);
        setUpMediaContainer(c4337Yn);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A19(c4337Yn);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0G);
    }
}
