package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.SI */
/* loaded from: assets/audience_network.dex */
public final class C3938SI extends LinearLayout implements InterfaceC3807QB {
    public final NativeBannerAd A00;
    public final C4337Yn A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC3499LD.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC3499LD.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC3499LD.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC3499LD.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC3499LD.A02 * 8.0f);

    public C3938SI(C4337Yn c4337Yn, NativeBannerAd nativeBannerAd, C3394JR c3394jr, EnumC3395JS enumC3395JS, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c4337Yn);
        LinearLayout.LayoutParams ctaButtonParams;
        ViewGroup.LayoutParams layoutParams;
        ArrayList<View> arrayList = new ArrayList<>();
        this.A02 = arrayList;
        this.A00 = nativeBannerAd;
        this.A01 = c4337Yn;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC3395JS);
        C3676O4 c3676o4 = new C3676O4(c4337Yn);
        c3676o4.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        c3676o4.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c3676o4, layoutParams2);
        C3804Q8 c3804q8 = new C3804Q8(c4337Yn, nativeBannerAd, enumC3395JS, c3394jr, adOptionsView);
        int i10 = A06;
        c3804q8.setPadding(i10, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c3804q8, layoutParams3);
        if (enumC3395JS != EnumC3395JS.A0A) {
            setPadding(i10, i10, i10, i10);
            setOrientation(1);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, i10);
        } else {
            int i11 = A07;
            setPadding(i11, i11, i11, i11);
            setOrientation(0);
            ctaButtonParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, i11, 0);
        }
        ctaButtonParams.weight = 1.0f;
        addView(linearLayout, ctaButtonParams);
        TextView textView = new TextView(getContext());
        int i12 = A07;
        textView.setPadding(i10, i12, i10, i12);
        c3394jr.A05(textView);
        textView.setText(nativeBannerAd.getAdCallToAction());
        addView(textView, layoutParams);
        arrayList.add(mediaView);
        arrayList.add(textView);
    }

    public static int A00(EnumC3395JS enumC3395JS) {
        switch (C3805Q9.A00[enumC3395JS.ordinal()]) {
            case 1:
                return A04;
            case 2:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3807QB
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3807QB
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3807QB
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
