package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pr */
/* loaded from: assets/audience_network.dex */
public final class C3787Pr extends FrameLayout {
    public static final int A08 = (int) (AbstractC3499LD.A02 * 16.0f);
    public C2931BZ A00;
    public C3935SF A01;
    public C27939I A02;
    public C3482Kw A03;
    public C26817R A04;
    public C26707C A05;
    public final C4337Yn A06;
    public final C3377JA A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(InterfaceC3369J2 interfaceC3369J2, String str, Map<String, String> map) {
        A02();
        this.A02 = new C27939I(this.A06, interfaceC3369J2, this.A00, str, map);
        if (C3348Ih.A1X(this.A06)) {
            this.A01 = new C3935SF(this.A06, interfaceC3369J2, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C3787Pr(C4337Yn c4337Yn, C3377JA c3377ja) {
        super(c4337Yn);
        this.A07 = c3377ja;
        this.A06 = c4337Yn;
        setUpView(c4337Yn);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        C3935SF c3935sf = this.A01;
        if (c3935sf != null) {
            c3935sf.A0C();
            this.A01 = null;
        }
        C27939I c27939i = this.A02;
        if (c27939i != null) {
            c27939i.A0i();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC27678s abstractC27678s) {
        this.A00.getEventBus().A05(abstractC27678s);
    }

    public final void A05(EnumC3818QM enumC3818QM) {
        this.A00.A0b(enumC3818QM, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public C3930SA getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C4337Yn c4337Yn) {
        this.A00.A0X();
        C26817R c26817r = new C26817R(c4337Yn);
        this.A04 = c26817r;
        this.A00.A0c(c26817r);
        this.A03 = new C3482Kw(c4337Yn, this.A07);
        this.A00.A0c(new C272086(c4337Yn));
        this.A00.A0c(this.A03);
        C26707C c26707c = new C26707C(c4337Yn, true, this.A07);
        this.A05 = c26707c;
        this.A00.A0c(c26707c);
        this.A00.A0c(new C3493L7(this.A05, EnumC3831QZ.A03, true, true));
        if (!this.A00.A0g()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i10 = A08;
        layoutParams.setMargins(i10, i10, i10, i10);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C4337Yn c4337Yn) {
        C2931BZ c2931bz = new C2931BZ(c4337Yn);
        this.A00 = c2931bz;
        c2931bz.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC3536Lo.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC3786Pq(this));
    }

    private void setUpView(C4337Yn c4337Yn) {
        setUpVideo(c4337Yn);
        setUpPlugins(c4337Yn);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f10) {
        this.A00.setVolume(f10);
        this.A03.A09();
    }
}
