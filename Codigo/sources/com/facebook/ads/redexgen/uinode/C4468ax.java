package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.ax */
/* loaded from: assets/audience_network.dex */
public class C4468ax implements InterfaceC260561 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC4476b5 A00;
    public final /* synthetic */ InterfaceC23401h A01;
    public final /* synthetic */ C23411i A02;
    public final /* synthetic */ C4337Yn A03;
    public final /* synthetic */ boolean A04;

    public C4468ax(C23411i c23411i, C4337Yn c4337Yn, boolean z10, AbstractC4476b5 abstractC4476b5, InterfaceC23401h interfaceC23401h) {
        this.A02 = c23411i;
        this.A03 = c4337Yn;
        this.A04 = z10;
        this.A00 = abstractC4476b5;
        this.A01 = interfaceC23401h;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAl() {
        ArrayList arrayList;
        if (C3348Ih.A1O(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC3746PC.A01(this.A03, this.A00, 1, new C4469ay(this)));
            return;
        }
        InterfaceC23401h interfaceC23401h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC23401h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
