package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.U6 */
/* loaded from: assets/audience_network.dex */
public final class C4050U6 extends AbstractC3598Mo {
    public static final int A03 = (int) (AbstractC3499LD.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C23872S A01;
    public final C4337Yn A02;

    public C4050U6(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, C23331a c23331a, InterfaceC3561MD interfaceC3561MD, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn, interfaceC3369J2, str, c23331a, interfaceC3561MD, interfaceC3560MC);
        this.A02 = c4337Yn;
        this.A01 = AbstractC23882T.A00(c4337Yn.A01());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A00 = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC3536Lo.A0M(relativeLayout, -1728053248);
        relativeLayout.setOnClickListener(new ViewOnClickListenerC3603Mt(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            AbstractC3536Lo.A0V(this, transitionSet);
            return;
        }
        AbstractC3536Lo.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0L() {
        C23912W A0A = this.A01.A0A();
        C3613N3 c3613n3 = new C3613N3(this.A02);
        c3613n3.setInfo(EnumC3544Lw.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c3613n3.setOnClickListener(new ViewOnClickListenerC3604Mu(this));
        C23912W A0B = this.A01.A0B();
        C3613N3 c3613n32 = new C3613N3(this.A02);
        c3613n32.setInfo(EnumC3544Lw.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c3613n32.setOnClickListener(new ViewOnClickListenerC3605Mv(this));
        C3613N3 c3613n33 = new C3613N3(this.A02);
        c3613n33.setInfo(EnumC3544Lw.AD_CHOICES_ICON, this.A01.A0M(), "");
        c3613n33.setOnClickListener(new ViewOnClickListenerC3606Mw(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i10 = A03;
        linearLayout.setPadding(i10 * 2, i10, i10 * 2, i10);
        AbstractC3536Lo.A0M(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c3613n3, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c3613n32, layoutParams);
        }
        linearLayout.addView(c3613n33, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0M() {
        AbstractC3536Lo.A0I(this);
        this.A00.removeAllViews();
        AbstractC3536Lo.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0N(C23912W c23912w, EnumC23892U enumC23892U) {
        String A0E;
        int i10;
        if (enumC23892U == EnumC23892U.A04) {
            return;
        }
        boolean z10 = enumC23892U == EnumC23892U.A05;
        C3596Mm c3596Mm = new C3596Mm(this.A02, this.A0B);
        if (z10) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C3596Mm A0E2 = c3596Mm.A0I(A0E).A0H(this.A01.A0D()).A0F(c23912w.A04()).A0E(z10 ? EnumC3544Lw.REPORT_AD : EnumC3544Lw.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        C3597Mn adHiddenView = A0E2.A0D(i10).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        AbstractC3536Lo.A0M(adHiddenView, -1);
        AbstractC3536Lo.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0O(C23912W c23912w, EnumC23892U enumC23892U) {
        String A0H;
        boolean z10 = enumC23892U == EnumC23892U.A05;
        C4337Yn c4337Yn = this.A02;
        InterfaceC3600Mq interfaceC3600Mq = this.A0B;
        if (z10) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C3616N6 c3616n6 = new C3616N6(c4337Yn, c23912w, interfaceC3600Mq, A0H, z10 ? EnumC3544Lw.REPORT_AD : EnumC3544Lw.HIDE_AD);
        c3616n6.setClickable(true);
        AbstractC3536Lo.A0M(c3616n6, -1);
        int i10 = A03;
        c3616n6.setPadding(i10 * 2, i10, i10 * 2, i10);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(c3616n6, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final boolean A0P() {
        return false;
    }
}
