package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.BK */
/* loaded from: assets/audience_network.dex */
public class C2918BK extends AbstractC4010TS {
    public C3583MZ A00;
    public InterfaceC3724Oq A01;
    public C3787Pr A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C3957Sb A07;
    public final C4337Yn A08;
    public final AbstractC3790Pu A09;
    public final AbstractC3721On A0A;
    public final AbstractC3679O7 A0B;
    public final AbstractC3643NX A0C;
    public final AbstractC3579MV A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C3697OP A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (AbstractC3499LD.A02 * 0.0f);
    public static final int A0M = (int) (AbstractC3499LD.A02 * 9.0f);
    public static final int A0K = (int) (AbstractC3499LD.A02 * 9.0f);

    public C2918BK(C3697OP c3697op, boolean z10, String str, C3957Sb c3957Sb) {
        super(c3697op, z10);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new C2923BP(this);
        this.A09 = new C2922BO(this);
        this.A0B = new C2921BN(this);
        this.A0A = new C2920BM(this);
        this.A0C = new C2919BL(this);
        this.A0I = c3697op;
        this.A07 = c3957Sb;
        this.A0E = str;
        C4337Yn A05 = c3697op.A05();
        this.A08 = A05;
        setGravity(17);
        int i10 = A0L;
        setPadding(i10, 0, i10, i10);
        AbstractC3536Lo.A0M(this, 0);
        setUpView(A05);
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A9R(this.A02.getSimpleVideoView());
            if (C3348Ih.A1r(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AGl(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A01 == null) {
            return;
        }
        if (!A18() || !this.A05) {
            boolean A18 = A18();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A18 || !this.A04) {
                return;
            }
        }
        this.A01.AAn();
    }

    private void A05(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC3536Lo.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final void A14() {
        C3787Pr c3787Pr;
        if (A18() && (c3787Pr = this.A02) != null) {
            c3787Pr.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final void A15() {
        if (A18()) {
            A16();
            C3787Pr c3787Pr = this.A02;
            if (c3787Pr != null) {
                c3787Pr.A05(EnumC3818QM.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final void A16() {
        C3787Pr c3787Pr;
        float volume = this.A07.A0P().getVolume();
        if (!A18() || (c3787Pr = this.A02) == null) {
            return;
        }
        float newVolume = c3787Pr.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final boolean A17() {
        C3787Pr c3787Pr;
        return A18() && (c3787Pr = this.A02) != null && c3787Pr.A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4010TS
    public final boolean A18() {
        return this.A03;
    }

    public final void A19(Map<String, String> extraParams) {
        C3787Pr c3787Pr = this.A02;
        if (c3787Pr != null) {
            c3787Pr.A02();
            if (A18()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C3787Pr getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i10 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z10 = radius == 1;
        if (z10) {
            i10 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int i11 = A0L;
        int radius2 = getWidth();
        float f10 = radius2 - i11;
        int radius3 = getHeight();
        rectF.set(i11, 0.0f, f10, radius3 - i11);
        if (z10) {
            i10 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C23231Q c23231q, Map<String, String> extraData) {
        getCtaButton().setCta(c23231q, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        C3583MZ c3583mz = this.A00;
        if (c3583mz != null) {
            c3583mz.setVisibility(0);
            new AsyncTaskC4034Tq(this.A00, this.A08).A04().A06(new C4026Ti(this, null)).A07(str);
        }
        C3787Pr c3787Pr = this.A02;
        if (c3787Pr != null) {
            c3787Pr.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z10) {
        this.A03 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC3724Oq interfaceC3724Oq) {
        this.A01 = interfaceC3724Oq;
    }

    public void setUpImageView(C4337Yn c4337Yn) {
        this.A00 = new C3583MZ(c4337Yn);
        if (C3348Ih.A16(c4337Yn)) {
            AbstractC3657Nl.A00(this.A00, C3348Ih.A17(c4337Yn), new ViewOnClickListenerC3668Nw(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(C4337Yn c4337Yn) {
        RelativeLayout relativeLayout = new RelativeLayout(c4337Yn);
        this.A06 = relativeLayout;
        A06(relativeLayout);
        C3583MZ c3583mz = this.A00;
        if (c3583mz != null) {
            this.A06.addView(c3583mz);
            A05(this.A00);
        }
        C3787Pr c3787Pr = this.A02;
        if (c3787Pr != null) {
            this.A06.addView(c3787Pr);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C4337Yn c4337Yn) {
        this.A02 = new C3787Pr(c4337Yn, new C3377JA(this.A0E, getAdEventManager()));
        if (C3348Ih.A18(c4337Yn)) {
            AbstractC3657Nl.A00(this.A02, C3348Ih.A19(c4337Yn), new ViewOnClickListenerC3669Nx(this));
        }
        A06(this.A02);
    }

    private void setUpView(C4337Yn c4337Yn) {
        setUpImageView(c4337Yn);
        setUpVideoView(c4337Yn);
        setUpMediaContainer(c4337Yn);
    }

    public void setVideoPlaceholderUrl(String str) {
        C3787Pr c3787Pr = this.A02;
        if (c3787Pr != null) {
            c3787Pr.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        C3583MZ c3583mz = this.A00;
        if (c3583mz != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            c3583mz.setVisibility(8);
        }
        C3787Pr c3787Pr = this.A02;
        if (c3787Pr != null) {
            c3787Pr.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
