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
public abstract class AbstractC1118No extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C1399Yn A03;
    public final ViewOnClickListenerC1271Tl A04;
    public final O3 A05;

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

    public AbstractC1118No(C1399Yn c1399Yn, int i10, C1P c1p, boolean z10, String str, J2 j22, MC mc2, RE re2, C1058Lg c1058Lg, C1U c1u) {
        super(c1399Yn);
        AbstractC1066Lo.A0K(this);
        this.A03 = c1399Yn;
        this.A00 = i10;
        O3 o32 = new O3(c1399Yn);
        this.A05 = o32;
        AbstractC1066Lo.A0M(o32, 0);
        AbstractC1066Lo.A0K(o32);
        ViewOnClickListenerC1271Tl viewOnClickListenerC1271Tl = new ViewOnClickListenerC1271Tl(c1399Yn, str, c1p, z10, j22, mc2, re2, c1058Lg, c1u);
        this.A04 = viewOnClickListenerC1271Tl;
        AbstractC1066Lo.A0G(AdError.NO_FILL_ERROR_CODE, viewOnClickListenerC1271Tl);
        this.A01 = OI.A03(viewOnClickListenerC1271Tl, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c1399Yn);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        AbstractC1066Lo.A0K(relativeLayout);
    }

    public void A09() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC1271Tl getCTAButton() {
        return this.A04;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1N c1n, C1Q c1q, String str, String str2, InterfaceC1120Nq interfaceC1120Nq) {
        this.A04.setCta(c1q, str, new HashMap(), interfaceC1120Nq);
        AsyncTaskC1276Tq asyncTaskC1276Tq = new AsyncTaskC1276Tq(this.A05, this.A03);
        int i10 = this.A00;
        asyncTaskC1276Tq.A05(i10, i10).A07(str2);
    }
}
