package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Tp */
/* loaded from: assets/audience_network.dex */
public final class C4033Tp extends AbstractC23992e {
    public static byte[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC4476b5 A02;
    public final C4337Yn A03;
    public final InterfaceC3369J2 A04;
    public final C3528Lg A05;
    public final InterfaceC3560MC A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A05() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C3675O3 c3675o3 = new C3675O3(this.A03);
        AsyncTaskC4034Tq asyncTaskC4034Tq = new AsyncTaskC4034Tq(c3675o3, this.A03);
        int i10 = A0C;
        asyncTaskC4034Tq.A05(i10, i10).A07(this.A02.A10().A01());
        c3675o3.setFullCircleCorners(true);
        AbstractC3536Lo.A0M(c3675o3, 0);
        AbstractC3536Lo.A0K(c3675o3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        int i11 = A0B;
        layoutParams.setMargins(i11, i11, i11, i11);
        layoutParams.addRule(14);
        relativeLayout.addView(c3675o3, layoutParams);
        TextView textView = new TextView(this.A03);
        AbstractC3536Lo.A0K(textView);
        textView.setTextColor(this.A02.A0w().A01().A06(true));
        textView.setText(this.A02.A0x().A0E().A06());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c3675o3.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        AbstractC3536Lo.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(i11, 0, i11, i11);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C3677O5 c3677o5 = new C3677O5(this.A03, A0A, 5, A09, -1);
        c3677o5.setGravity(16);
        linearLayout.addView(c3677o5, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A0w().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        AbstractC3536Lo.A0X(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A08;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A0x().A0E().A03())) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c3677o5.setRating(Float.parseFloat(this.A02.A0x().A0E().A03()));
            if (this.A02.A0x().A0E().A02() != null) {
                textView2.setText(A03(0, 1, 20) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A0x().A0E().A02())) + A03(1, 1, 41));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A0w().A01().A06(true));
        textView3.setText(this.A02.A0x().A0E().A01());
        textView3.setGravity(17);
        textView3.setPadding(i11, i11, i11, i11);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A06() {
        A07 = new byte[]{110, -124};
    }

    static {
        A06();
        A0B = (int) (AbstractC23992e.A08 * 12.0f);
        A0C = (int) (AbstractC23992e.A08 * 84.0f);
        A0A = (int) (AbstractC23992e.A08 * 14.0f);
        A08 = (int) (AbstractC23992e.A08 * 8.0f);
        A09 = AbstractC24102p.A01(-1, 77);
    }

    public C4033Tp(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn);
        C3528Lg c3528Lg = new C3528Lg();
        this.A05 = c3528Lg;
        this.A03 = c4337Yn;
        this.A02 = abstractC4476b5;
        this.A04 = interfaceC3369J2;
        this.A06 = interfaceC3560MC;
        c3528Lg.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        RelativeLayout relativeLayout = new RelativeLayout(c4337Yn);
        this.A01 = relativeLayout;
        AbstractC3682OA.A00(c4337Yn, relativeLayout, abstractC4476b5.A0x().A0D().A07());
        LinearLayout linearLayout = new LinearLayout(c4337Yn);
        this.A00 = linearLayout;
        linearLayout.setOrientation(1);
        A05();
        A04();
        relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A04() {
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl = new ViewOnClickListenerC4029Tl(this.A03, EnumC3821QP.A04.A02(), this.A02.A0w().A01(), this.A02.A0x().A0F().A06(), this.A04, this.A06, null, this.A05, this.A02.A0y());
        viewOnClickListenerC4029Tl.setViewShowsOverMedia(true);
        AbstractC3536Lo.A0G(AdError.NO_FILL_ERROR_CODE, viewOnClickListenerC4029Tl);
        viewOnClickListenerC4029Tl.setCta(this.A02.A0x().A0F(), this.A02.A12(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i10 = A0B;
        viewOnClickListenerC4029Tl.setPadding(i10, i10, i10, i10);
        layoutParams.setMargins(i10, i10, i10, i10 * 2);
        this.A00.addView(viewOnClickListenerC4029Tl, layoutParams);
    }
}
