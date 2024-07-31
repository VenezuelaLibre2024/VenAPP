package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.UD */
/* loaded from: assets/audience_network.dex */
public final class C4057UD extends RelativeLayout implements InterfaceC3561MD {
    public static byte[] A0X;
    public static String[] A0Y = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final RelativeLayout.LayoutParams A0i;
    public View A00;
    public RelativeLayout A01;
    public RelativeLayout A02;
    public Toast A03;
    public C25735V A04;
    public C3495L9 A05;
    public ViewOnClickListenerC4029Tl A06;
    public C3796Q0 A07;
    public C3803Q7 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AbstractC4476b5 A0F;
    public final C23351c A0G;
    public final InterfaceC25715T A0H;
    public final C4337Yn A0I;
    public final InterfaceC3369J2 A0J;
    public final C3377JA A0K;
    public final C3495L9 A0L;
    public final ViewOnSystemUiVisibilityChangeListenerC3523Lb A0M;
    public final InterfaceC3560MC A0N;
    public final InterfaceC3593Mj A0O;
    public final InterfaceC3672O0 A0P;
    public final C3673O1 A0Q;
    public final C3801Q5 A0R;
    public final AtomicBoolean A0S;
    public final AtomicBoolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final AbstractC3559MB A0W;

    public static String A0D(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A0X = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -77, -68, -71, -77, -69, -81, -61, -65, -59, -62, -77, -75, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -55, -68, -49, -60, -47, -64, -70, -66, -57, -60, -66, -58, -43, -47, -58, -56, -54, -46, -54, -45, -39, -65, -78, -60, -82, -65, -79, -78, -79, -84, -61, -74, -79, -78, -68, -80, -98, -101, -81, -94, -98, -80, -104, -100, -91, -94, -100, -92};
    }

    static {
        A0N();
        A0g = (int) (AbstractC3499LD.A02 * 64.0f);
        A0b = (int) (AbstractC3499LD.A02 * 16.0f);
        A0h = (int) (AbstractC3499LD.A02 * 12.0f);
        A0Z = (int) (AbstractC3499LD.A02 * 10.0f);
        A0i = new RelativeLayout.LayoutParams(-1, -1);
        A0c = (int) (AbstractC3499LD.A02 * 48.0f);
        A0d = (int) (AbstractC3499LD.A02 * 16.0f);
        A0f = (int) (AbstractC3499LD.A02 * 14.0f);
        A0e = AbstractC24102p.A01(-1, 77);
        A0a = (int) (AbstractC3499LD.A02 * 8.0f);
    }

    public C4057UD(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, AbstractC4476b5 abstractC4476b5, String str, InterfaceC3593Mj interfaceC3593Mj) {
        super(c4337Yn);
        int A07;
        this.A0H = new C4064UK(this);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A0T = atomicBoolean;
        this.A0S = new AtomicBoolean(false);
        this.A0C = false;
        this.A0E = true;
        this.A0A = false;
        this.A09 = false;
        this.A0I = c4337Yn;
        this.A0N = interfaceC3560MC;
        this.A0J = interfaceC3369J2;
        this.A0F = abstractC4476b5;
        C23351c A06 = abstractC4476b5.A0x().A0D().A06();
        this.A0G = A06;
        this.A0K = new C3377JA(abstractC4476b5.A12(), interfaceC3369J2);
        this.A0O = interfaceC3593Mj;
        this.A08 = new C3803Q7(c4337Yn, interfaceC3593Mj, str, interfaceC3560MC);
        this.A0B = abstractC4476b5.A0x().A0M() && abstractC4476b5.A0x().A0D().A02() > 0;
        boolean A0A = abstractC4476b5.A0x().A0D().A0A();
        this.A0V = A0A;
        if (A06 == null) {
            interfaceC3560MC.A43(interfaceC3593Mj.A6y());
            interfaceC3560MC.A43(interfaceC3593Mj.A6u());
        }
        if (this.A0B && A0A) {
            A07 = abstractC4476b5.A0x().A0D().A02();
        } else {
            A07 = A06.A07();
        }
        atomicBoolean.set(!A06.A0I());
        C4064UK c4064uk = null;
        this.A0L = new C3495L9(A07, new C4059UF(this, c4064uk));
        this.A0U = C3348Ih.A0j(c4337Yn);
        FullScreenAdToolbar A072 = A07();
        this.A0W = A072;
        this.A0R = new C3801Q5(c4337Yn, interfaceC3369J2, abstractC4476b5);
        AbstractC3682OA.A00(c4337Yn, this, abstractC4476b5.A0x().A0D().A07());
        ViewOnSystemUiVisibilityChangeListenerC3523Lb viewOnSystemUiVisibilityChangeListenerC3523Lb = new ViewOnSystemUiVisibilityChangeListenerC3523Lb(this);
        this.A0M = viewOnSystemUiVisibilityChangeListenerC3523Lb;
        viewOnSystemUiVisibilityChangeListenerC3523Lb.A05(EnumC3522La.A03);
        if (C3348Ih.A1q(c4337Yn)) {
            A072.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0D(56, 9, 61), interfaceC3593Mj.A7f());
        this.A07 = new C3796Q0(c4337Yn, abstractC4476b5, A06, interfaceC3369J2, new C4058UE(this, c4064uk), hashMap);
        A0K();
        interfaceC3560MC.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        C4063UJ c4063uj = new C4063UJ(this);
        this.A0P = c4063uj;
        this.A0Q = new C3673O1(c4337Yn, A072, abstractC4476b5, (C3930SA) null, interfaceC3560MC, c4063uj, this.A06, this.A01, this.A07);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0I, this.A0N, this.A0K, 0, this.A0F.A0r());
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A06(this.A0F.A0w().A01(), ViewOnClickListenerC4029Tl.A08(this.A0F));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0F.A10(), this.A0F.A12(), this.A0G.A07(), this.A0F.A11());
        fullScreenAdToolbar.setToolbarListener(new C4060UG(this));
        return fullScreenAdToolbar;
    }

    private ViewOnClickListenerC4029Tl A09() {
        C3796Q0 c3796q0 = this.A07;
        if (c3796q0 == null || c3796q0.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        ViewOnClickListenerC4029Tl button = new ViewOnClickListenerC4029Tl(this.A0I, this.A0O.A6R(), this.A0F.A0w().A01(), this.A0J, this.A0N, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0F.A0y());
        AbstractC3536Lo.A0K(button);
        button.setText(this.A0F.A0x().A0F().A04());
        button.setTextSize(14.0f);
        button.setIncludeFontPadding(false);
        int i10 = A0Z;
        button.setPadding(i10, i10, i10, i10);
        button.setOnClickListener(new ViewOnClickListenerC3576MS(this));
        return button;
    }

    private C3681O9 A0B() {
        C3681O9 c3681o9 = new C3681O9(this.A0I, this.A0F.A0w().A01(), true, 16, 14, 0);
        c3681o9.A03(this.A0F.A0x().A0E().A06(), this.A0F.A0x().A0E().A05(), null, false, true);
        TextView descriptionTv = c3681o9.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c3681o9.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c3681o9;
    }

    private void A0G() {
        int i10 = A0c;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C3675O3 c3675o3 = new C3675O3(this.A0I);
        AbstractC3536Lo.A0M(c3675o3, 0);
        AbstractC3536Lo.A0K(c3675o3);
        new AsyncTaskC4034Tq(c3675o3, this.A0I).A05(i10, i10).A07(this.A0F.A10().A01());
        TextView textView = new TextView(this.A0I);
        AbstractC3536Lo.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0F.A0w().A01().A06(true));
        textView.setText(this.A0F.A0x().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C3677O5 c3677o5 = new C3677O5(this.A0I, A0f, 5, A0e, -1);
        c3677o5.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0I);
        textView2.setTextColor(this.A0F.A0w().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        int i11 = A0a;
        starRatingContainerParams.leftMargin = i11;
        LinearLayout linearLayout = new LinearLayout(this.A0I);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, A0d);
        layoutParams3.topMargin = i11 / 2;
        layoutParams3.addRule(3, textView.getId());
        linearLayout.addView(c3677o5, layoutParams2);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = i11;
        layoutParams4.addRule(1, c3675o3.getId());
        layoutParams4.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams3);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0Y[4].length() != 18) {
                throw new RuntimeException();
            }
            A0Y[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams4);
            this.A02.addView(c3675o3, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0F.A0x().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c3677o5.setRating(Float.parseFloat(this.A0F.A0x().A0E().A03()));
        if (this.A0F.A0x().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0D(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0F.A0x().A0E().A02())) + A0D(1, 1, 78));
    }

    private void A0H() {
        if (this.A0G.A0I()) {
            A0J();
        } else {
            A0M();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0M.A05(EnumC3522La.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0D = true;
        if (this.A0F.A0x().A0M()) {
            this.A08.A05();
            this.A0N.A44(this.A0O.A5s(), new C27929H(0, 0));
        }
    }

    private void A0J() {
        C3776Pg A0B = new C3774Pe(this.A0I, this.A0F.A0x().A0E(), this.A0F.A10()).A08(this.A0F.A0w().A01()).A0A(this.A0G.A0G()).A09(this.A0G.A0D()).A07(AdError.SERVER_ERROR_CODE).A0B();
        AbstractC3379JC.A04(A0B, this.A0K, EnumC3376J9.A0U);
        addView(A0B, A0i);
        A0B.A04(new C4062UI(this));
    }

    private void A0K() {
        this.A06 = A09();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A01 = relativeLayout;
        AbstractC3536Lo.A0K(relativeLayout);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        int i10 = A0b;
        int i11 = A0h;
        iconAndMetaDataContainerParams.setMargins(i10, i11, i10, i11);
        iconAndMetaDataContainerParams.addRule(12);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.A02 = relativeLayout2;
        AbstractC3536Lo.A0K(relativeLayout2);
        if (this.A0U) {
            A0G();
        } else {
            RelativeLayout relativeLayout3 = this.A02;
            C3681O9 A0B = A0B();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout3.addView(A0B, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, i10, 0);
        this.A01.addView(this.A02, layoutParams);
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl = this.A06;
        if (viewOnClickListenerC4029Tl != null) {
            layoutParams.addRule(0, viewOnClickListenerC4029Tl.getId());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(6, this.A02.getId());
            layoutParams2.addRule(8, this.A02.getId());
            this.A01.addView(this.A06, layoutParams2);
        }
        AbstractC3536Lo.A0K(this.A0W);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(i10, 0, i10, 0);
        layoutParams3.addRule(3, this.A0W.getId());
        layoutParams3.addRule(2, this.A01.getId());
        this.A0W.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0W, adWebViewParams);
        addView(this.A07, layoutParams3);
        addView(this.A01, iconAndMetaDataContainerParams);
        if (this.A0G.A0J()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        new C3377JA(this.A0F.A12(), this.A0J).A04(EnumC3376J9.A0r, null);
        this.A0S.set(true);
        AbstractC3536Lo.A0T(this);
        AbstractC3536Lo.A0H(this.A07);
        AbstractC3536Lo.A0a(this.A0Q, this.A00, this.A07);
        AbstractC3536Lo.A0L(this.A0W);
        AbstractC3536Lo.A0L(this.A06);
        Pair<EnumC3800Q4, View> A03 = this.A0R.A03(this.A06);
        this.A00 = (View) A03.second;
        switch (C3577MT.A00[((EnumC3800Q4) A03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0W.getToolbarHeight(), 0, 0);
                AbstractC3536Lo.A0L(this.A01);
                RelativeLayout relativeLayout = this.A01;
                if (relativeLayout != null) {
                    int id2 = relativeLayout.getId();
                    if (A0Y[5].charAt(2) == 'm') {
                        throw new RuntimeException();
                    }
                    A0Y[0] = "6k4i0rLafWNu6HrnPvo1bAEbeaagXJGg";
                    layoutParams.addRule(2, id2);
                }
                addView(this.A00, layoutParams);
                return;
            case 2:
                RelativeLayout relativeLayout2 = this.A01;
                if (relativeLayout2 != null) {
                    AbstractC3536Lo.A0a(relativeLayout2);
                }
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        AbstractC3536Lo.A0T(this);
        if (!this.A0G.A0J()) {
            C3796Q0 c3796q0 = this.A07;
            if (A0Y[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            c3796q0.A0B();
        }
        this.A0W.setVisibility(0);
        this.A07.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0F.A0u() > 0 && this.A05 == null) {
            C3495L9 c3495l9 = new C3495L9(this.A0F.A0u(), new C4061UH(this));
            this.A05 = c3495l9;
            c3495l9.A07();
        }
        this.A0L.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(int i10) {
        String valueOf = String.valueOf(i10);
        Toast toast = this.A03;
        String A0C = this.A0G.A0C();
        String progress = A0D(2, 6, 31);
        AbstractC3536Lo.A0Y(toast, A0C.replace(progress, valueOf), 49, 0, A0g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U(boolean z10, String str) {
        this.A0A = true;
        HashMap hashMap = new HashMap();
        hashMap.put(A0D(8, 12, 121), z10 ? A0D(79, 13, 17) : A0D(44, 12, 51));
        hashMap.put(A0D(20, 12, 40), str);
        new C3663Nr(this.A0I, this.A0O.A6R(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0J, this.A0F.A0y(), this.A0N).A07(this.A0F.A12(), this.A0F.A0x().A0F().A05(), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0V() {
        if (!this.A0F.A0P().equals(A0D(65, 14, 37))) {
            if (this.A0F.A0P().equals(A0D(32, 12, 100))) {
                AbstractC4476b5 abstractC4476b5 = this.A0F;
                if (A0Y[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0Y[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (abstractC4476b5.A0x().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0W() {
        return this.A0V && !this.A0C && !this.A0E && this.A0G.A07() < this.A0F.A0x().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void A9Q(Intent intent, Bundle bundle, C25735V c25735v) {
        this.A04 = c25735v;
        c25735v.A0N(this.A0H);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACW(boolean z10) {
        this.A0L.A06();
        this.A09 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACu(boolean z10) {
        if (this.A0V && this.A0E) {
            return;
        }
        boolean z11 = this.A0C;
        if (A0Y[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0Y[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z11 && this.A0T.get() && !this.A0L.A05()) {
            this.A0L.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public String getCurrentClientToken() {
        return this.A0F.A12();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        this.A0M.A03();
        C25735V c25735v = this.A04;
        if (c25735v != null) {
            c25735v.A0O(this.A0H);
        }
        if (this.A07 != null) {
            AbstractC4476b5 abstractC4476b5 = this.A0F;
            if (A0Y[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0Y[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(abstractC4476b5.A12())) {
                this.A0J.A9X(this.A0F.A12(), new C3654Ni().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0L.A06();
        this.A0W.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            ACu(false);
        } else {
            ACW(false);
        }
    }

    public void setListener(InterfaceC3560MC interfaceC3560MC) {
    }

    public void setServerSideRewardHandler(C3803Q7 c3803q7) {
        this.A08 = c3803q7;
    }
}
