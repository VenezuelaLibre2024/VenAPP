package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.UE */
/* loaded from: assets/audience_network.dex */
public class C4058UE implements InterfaceC3794Py {
    public static byte[] A01;
    public final /* synthetic */ C4057UD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{29, 27, 13, 26, 11, 4, 1, 11, 3};
    }

    public C4058UE(C4057UD c4057ud) {
        this.A00 = c4057ud;
    }

    public /* synthetic */ C4058UE(C4057UD c4057ud, C4064UK c4064uk) {
        this(c4057ud);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3794Py
    public final void ABD() {
        this.A00.A0U(true, A00(0, 9, 55));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3794Py
    public final void ABj() {
        AbstractC4476b5 abstractC4476b5;
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3593Mj interfaceC3593Mj;
        InterfaceC3369J2 interfaceC3369J2;
        AbstractC4476b5 abstractC4476b52;
        C3796Q0 c3796q0;
        C3796Q0 c3796q02;
        AbstractC4476b5 abstractC4476b53;
        C4337Yn c4337Yn;
        AbstractC4476b5 abstractC4476b54;
        C4337Yn c4337Yn2;
        abstractC4476b5 = this.A00.A0F;
        if (!TextUtils.isEmpty(abstractC4476b5.A12())) {
            interfaceC3369J2 = this.A00.A0J;
            abstractC4476b52 = this.A00.A0F;
            String A12 = abstractC4476b52.A12();
            C3654Ni c3654Ni = new C3654Ni();
            c3796q0 = this.A00.A07;
            C3654Ni A03 = c3654Ni.A03(c3796q0.getViewabilityChecker());
            c3796q02 = this.A00.A07;
            interfaceC3369J2.A9g(A12, A03.A02(c3796q02.getTouchDataRecorder()).A05());
            abstractC4476b53 = this.A00.A0F;
            C23271U A0y = abstractC4476b53.A0y();
            c4337Yn = this.A00.A0I;
            C23271U.A07(A0y, c4337Yn);
            abstractC4476b54 = this.A00.A0F;
            AbstractC23832O.A00(abstractC4476b54.A0N());
            c4337Yn2 = this.A00.A0I;
            c4337Yn2.A0E().A2k();
        }
        interfaceC3560MC = this.A00.A0N;
        interfaceC3593Mj = this.A00.A0O;
        interfaceC3560MC.A43(interfaceC3593Mj.A7B());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3794Py
    public final void AC4() {
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3593Mj interfaceC3593Mj;
        interfaceC3560MC = this.A00.A0N;
        interfaceC3593Mj = this.A00.A0O;
        interfaceC3560MC.A43(interfaceC3593Mj.A6y());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3794Py
    public final void ADj() {
        InterfaceC3560MC interfaceC3560MC;
        interfaceC3560MC = this.A00.A0N;
        interfaceC3560MC.AB0(15);
    }
}
