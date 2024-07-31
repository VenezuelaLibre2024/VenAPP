package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.No */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3660No extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C4337Yn A03;
    public final ViewOnClickListenerC4029Tl A04;
    public final C3675O3 A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, 12, 12, 13, 28, 9, 17, 20, 27};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0A(int i10);

    public abstract View getExpandableLayout();

    public abstract void setTitleMaxLines(int i10);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC3660No(C4337Yn c4337Yn, int i10, C23221P c23221p, boolean z10, String str, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, C3872RE c3872re, C3528Lg c3528Lg, C23271U c23271u) {
        super(c4337Yn);
        AbstractC3536Lo.A0K(this);
        this.A03 = c4337Yn;
        this.A00 = i10;
        C3675O3 c3675o3 = new C3675O3(c4337Yn);
        this.A05 = c3675o3;
        AbstractC3536Lo.A0M(c3675o3, 0);
        AbstractC3536Lo.A0K(c3675o3);
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl = new ViewOnClickListenerC4029Tl(c4337Yn, str, c23221p, z10, interfaceC3369J2, interfaceC3560MC, c3872re, c3528Lg, c23271u);
        this.A04 = viewOnClickListenerC4029Tl;
        AbstractC3536Lo.A0G(AdError.NO_FILL_ERROR_CODE, viewOnClickListenerC4029Tl);
        this.A01 = AbstractC3690OI.A03(viewOnClickListenerC4029Tl, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c4337Yn);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        AbstractC3536Lo.A0K(relativeLayout);
    }

    public void A09() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC4029Tl getCTAButton() {
        return this.A04;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C23201N c23201n, C23231Q c23231q, String str, String str2, InterfaceC3662Nq interfaceC3662Nq) {
        this.A04.setCta(c23231q, str, new HashMap(), interfaceC3662Nq);
        AsyncTaskC4034Tq asyncTaskC4034Tq = new AsyncTaskC4034Tq(this.A05, this.A03);
        int i10 = this.A00;
        asyncTaskC4034Tq.A05(i10, i10).A07(str2);
    }
}
