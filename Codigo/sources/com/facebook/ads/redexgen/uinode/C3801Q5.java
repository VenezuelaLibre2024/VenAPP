package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Q5 */
/* loaded from: assets/audience_network.dex */
public final class C3801Q5 {
    public ViewOnClickListenerC4029Tl A00;
    public final C23091C A01;
    public final C23201N A02;
    public final C23241R A03;
    public final C23331a A04;
    public final C4337Yn A05;
    public final C3377JA A06;
    public static String[] A07 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A0A = (int) (AbstractC3499LD.A02 * 4.0f);
    public static final int A08 = (int) (AbstractC3499LD.A02 * 72.0f);
    public static final int A09 = (int) (AbstractC3499LD.A02 * 8.0f);

    public C3801Q5(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5) {
        this.A05 = c4337Yn;
        this.A06 = new C3377JA(abstractC4476b5.A12(), interfaceC3369J2);
        this.A01 = abstractC4476b5.A0w();
        this.A02 = abstractC4476b5.A0x().A0E();
        this.A04 = abstractC4476b5.A10();
        this.A03 = abstractC4476b5.A0x().A0G();
    }

    private View A00(ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl) {
        C3681O9 c3681o9 = new C3681O9(this.A05, this.A01.A01(), true, false, false);
        c3681o9.A03(this.A02.A06(), this.A02.A01(), null, false, true);
        c3681o9.setAlignment(17);
        C3675O3 c3675o3 = new C3675O3(this.A05);
        AbstractC3536Lo.A0M(c3675o3, 0);
        c3675o3.setRadius(50);
        new AsyncTaskC4034Tq(c3675o3, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i10 = A08;
        linearLayout.addView(c3675o3, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A09;
        imageParams.setMargins(0, i11, 0, i11);
        linearLayout.addView(c3681o9, imageParams);
        if (viewOnClickListenerC4029Tl != null) {
            AbstractC3536Lo.A0J(viewOnClickListenerC4029Tl);
            linearLayout.addView(viewOnClickListenerC4029Tl, imageParams);
            if (TextUtils.isEmpty(viewOnClickListenerC4029Tl.getText())) {
                AbstractC3536Lo.A0H(viewOnClickListenerC4029Tl);
            }
        }
        return linearLayout;
    }

    private C3100Eb A01() {
        C3100Eb c3100Eb = new C3100Eb(this.A05);
        c3100Eb.setLayoutManager(new C4399Zo(this.A05, 0, false));
        c3100Eb.setAdapter(new C3942SM(this.A05, this.A03.A01(), A0A, this.A00));
        return c3100Eb;
    }

    private final EnumC3800Q4 A02() {
        if (!this.A03.A01().isEmpty()) {
            return EnumC3800Q4.A04;
        }
        EnumC3800Q4 enumC3800Q4 = EnumC3800Q4.A03;
        String[] strArr = A07;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A07[4] = "qwlEjiYhEcV8j1J";
        return enumC3800Q4;
    }

    public final Pair<EnumC3800Q4, View> A03(ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl) {
        View A01;
        this.A00 = viewOnClickListenerC4029Tl;
        EnumC3800Q4 A02 = A02();
        switch (C3799Q3.A00[A02.ordinal()]) {
            case 1:
                A01 = A01();
                break;
            default:
                ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl2 = this.A00;
                if (A07[4].length() == 15) {
                    String[] strArr = A07;
                    strArr[3] = "Oe6IO8Uak3tx5GvHWoKp5mKUb4E2rtDt";
                    strArr[7] = "t7tx5cDm578ghKblxCWBuUm65hKnqcQl";
                    A01 = A00(viewOnClickListenerC4029Tl2);
                    break;
                } else {
                    throw new RuntimeException();
                }
        }
        AbstractC3379JC.A04(A01, this.A06, EnumC3376J9.A0S);
        return new Pair<>(A02, A01);
    }
}
