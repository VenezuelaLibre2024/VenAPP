package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;

/* renamed from: com.facebook.ads.redexgen.X.O1 */
/* loaded from: assets/audience_network.dex */
public final class C3673O1 extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public AbstractC3559MB A00;
    public final AbstractC4476b5 A01;
    public final C4337Yn A02;
    public final InterfaceC3560MC A03;
    public final InterfaceC3672O0 A04;
    public final C3930SA A05;
    public final View[] A06;

    public C3673O1(C3697OP c3697op, AbstractC4476b5 abstractC4476b5, C3930SA c3930sa, C3451KP c3451kp, AbstractC3660No abstractC3660No, InterfaceC3560MC interfaceC3560MC, InterfaceC3672O0 interfaceC3672O0) {
        this(c3697op, abstractC4476b5, c3930sa, interfaceC3560MC, interfaceC3672O0, c3451kp, abstractC3660No);
    }

    public C3673O1(C3697OP c3697op, AbstractC4476b5 abstractC4476b5, C3930SA c3930sa, InterfaceC3560MC interfaceC3560MC, InterfaceC3672O0 interfaceC3672O0, View... viewArr) {
        this(c3697op.A05(), c3697op.A08(), abstractC4476b5, c3930sa, interfaceC3560MC, interfaceC3672O0, viewArr);
    }

    public C3673O1(C4337Yn c4337Yn, AbstractC3559MB abstractC3559MB, AbstractC4476b5 abstractC4476b5, C3930SA c3930sa, InterfaceC3560MC interfaceC3560MC, InterfaceC3672O0 interfaceC3672O0, View... viewArr) {
        super(c4337Yn);
        this.A02 = c4337Yn;
        this.A00 = abstractC3559MB;
        this.A01 = abstractC4476b5;
        this.A06 = viewArr;
        this.A03 = interfaceC3560MC;
        this.A05 = c3930sa;
        this.A04 = interfaceC3672O0;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0J = this.A01.A0J();
        if (A0J == null) {
            title = this.A01.A0z().A05();
        } else {
            title = this.A01.A0z().A06(A0J.getCurrency(), A0J.getQuantity());
        }
        C3574MQ c3574mq = new C3574MQ(this.A02, -1, -16777216, title, null, this.A01.A0z().A04(), this.A01.A0z().A03(), AbstractC3545Lx.A01(EnumC3544Lw.REWARD_ICON));
        c3574mq.A02.setOnClickListener(new ViewOnClickListenerC3670Ny(this));
        c3574mq.A01.setOnClickListener(new ViewOnClickListenerC3671Nz(this));
        addView(c3574mq, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        C3930SA c3930sa = this.A05;
        if (c3930sa != null) {
            c3930sa.A0a(EnumC3813QH.A07);
        }
        this.A04.AAh();
        if (!this.A01.A0x().A0O()) {
            this.A01.A15(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        C3930SA c3930sa = this.A05;
        if (c3930sa != null && !c3930sa.A0j()) {
            this.A05.A0f(false, false, 11);
            AbstractC3536Lo.A0N(this.A05, 4);
        }
        AbstractC3559MB abstractC3559MB = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC3559MB != null) {
            AbstractC3536Lo.A0H(abstractC3559MB);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            AbstractC3536Lo.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACC();
    }
}
