package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UE implements InterfaceC1180Py {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

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

    public UE(UD ud2) {
        this.A00 = ud2;
    }

    public /* synthetic */ UE(UD ud2, UK uk2) {
        this(ud2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1180Py
    public final void ABD() {
        this.A00.A0U(true, A00(0, 9, 55));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1180Py
    public final void ABj() {
        AbstractC1502b5 abstractC1502b5;
        MC mc2;
        InterfaceC1087Mj interfaceC1087Mj;
        J2 j22;
        AbstractC1502b5 abstractC1502b52;
        Q0 q02;
        Q0 q03;
        AbstractC1502b5 abstractC1502b53;
        C1399Yn c1399Yn;
        AbstractC1502b5 abstractC1502b54;
        C1399Yn c1399Yn2;
        abstractC1502b5 = this.A00.A0F;
        if (!TextUtils.isEmpty(abstractC1502b5.A12())) {
            j22 = this.A00.A0J;
            abstractC1502b52 = this.A00.A0F;
            String A12 = abstractC1502b52.A12();
            C1112Ni c1112Ni = new C1112Ni();
            q02 = this.A00.A07;
            C1112Ni A03 = c1112Ni.A03(q02.getViewabilityChecker());
            q03 = this.A00.A07;
            j22.A9g(A12, A03.A02(q03.getTouchDataRecorder()).A05());
            abstractC1502b53 = this.A00.A0F;
            C1U A0y = abstractC1502b53.A0y();
            c1399Yn = this.A00.A0I;
            C1U.A07(A0y, c1399Yn);
            abstractC1502b54 = this.A00.A0F;
            C2O.A00(abstractC1502b54.A0N());
            c1399Yn2 = this.A00.A0I;
            c1399Yn2.A0E().A2k();
        }
        mc2 = this.A00.A0N;
        interfaceC1087Mj = this.A00.A0O;
        mc2.A43(interfaceC1087Mj.A7B());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1180Py
    public final void AC4() {
        MC mc2;
        InterfaceC1087Mj interfaceC1087Mj;
        mc2 = this.A00.A0N;
        interfaceC1087Mj = this.A00.A0O;
        mc2.A43(interfaceC1087Mj.A6y());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1180Py
    public final void ADj() {
        MC mc2;
        mc2 = this.A00.A0N;
        mc2.AB0(15);
    }
}
