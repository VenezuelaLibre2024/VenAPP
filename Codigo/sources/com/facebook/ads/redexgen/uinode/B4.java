package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class B4 extends TS {
    public RelativeLayout A00;
    public MZ A01;
    public InterfaceC1146Oq A02;
    public C1235Sb A03;
    public C1173Pr A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1399Yn A0B;
    public final OP A0C;
    public final AbstractC1176Pu A0D;
    public final AbstractC1143On A0E;
    public final O7 A0F;
    public final NX A0G;
    public final MV A0H;
    public final String A0I;
    public static String[] A0J = {"ZJd3r9AhG0a", "i1M", "myOt", "scTs", "x2qjzjwt5KjNEBlbZiSy7b60v5gMv07i", "l9mbaUlHikXHnlqbzXlarwn", "RgzjkxP8tSu3AToRYAuzqOa1HsgYA", "48ukShptsWaLS3SUfEjE876"};
    public static final int A0L = (int) (LD.A02 * 1.0f);
    public static final int A0M = (int) (LD.A02 * 4.0f);
    public static final int A0K = (int) (LD.A02 * 6.0f);

    public abstract void A19(C1399Yn c1399Yn);

    public B4(OP op, boolean z10, String str, C1235Sb c1235Sb) {
        super(op, z10);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0H = new BH(this);
        this.A0D = new BG(this);
        this.A0F = new BF(this);
        this.A0E = new BD(this);
        this.A0G = new B5(this);
        this.A0C = op;
        this.A03 = c1235Sb;
        this.A0I = str;
        C1399Yn A05 = op.A05();
        this.A0B = A05;
        setGravity(17);
        int i10 = A0L;
        setPadding(i10, 0, i10, i10);
        AbstractC1066Lo.A0M(this, 0);
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
        AbstractC1066Lo.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.TS
    public final void A14() {
        if (A18()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.TS
    public final void A15() {
        if (A18()) {
            A16();
            this.A04.A05(QM.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.TS
    public final void A16() {
        float volume = this.A03.A0P().getVolume();
        if (A18()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                this.A04.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.TS
    public final boolean A17() {
        return A18() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.TS
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

    public final C1173Pr getVideoView() {
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

    public void setCTAInfo(C1Q c1q, Map<String, String> extraData) {
        getCtaButton().setCta(c1q, this.A0I, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC1276Tq(this.A01, this.A0B).A04().A06(new TR(this, null)).A07(str);
    }

    public void setIsVideo(boolean z10) {
        this.A05 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC1146Oq interfaceC1146Oq) {
        this.A02 = interfaceC1146Oq;
    }

    public void setUpImageView(C1399Yn c1399Yn) {
        this.A01 = new MZ(c1399Yn);
        if (C0988Ih.A16(c1399Yn)) {
            AbstractC1115Nl.A00(this.A01, C0988Ih.A17(c1399Yn), new ViewOnClickListenerC1151Ov(this));
        }
        A05(this.A01);
    }

    public void setUpMediaContainer(C1399Yn c1399Yn) {
        RelativeLayout relativeLayout = new RelativeLayout(c1399Yn);
        this.A00 = relativeLayout;
        A05(relativeLayout);
        if (this.A0C.A04().A0l() && C0988Ih.A2N(this.A0B)) {
            this.A00.setOnClickListener(new ViewOnClickListenerC1150Ou(this));
        }
    }

    public void setUpVideoView(C1399Yn c1399Yn) {
        this.A04 = new C1173Pr(c1399Yn, new JA(this.A0I, getAdEventManager()));
        if (C0988Ih.A18(c1399Yn)) {
            AbstractC1115Nl.A00(this.A04, C0988Ih.A19(c1399Yn), new ViewOnClickListenerC1152Ow(this));
        }
        A05(this.A04);
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0J[4] = "V2iAUpZbaEbKk91ZDPvMgym9lCZNc3yl";
    }

    private void setUpView(C1399Yn c1399Yn) {
        setUpImageView(c1399Yn);
        setUpVideoView(c1399Yn);
        setUpMediaContainer(c1399Yn);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A19(c1399Yn);
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