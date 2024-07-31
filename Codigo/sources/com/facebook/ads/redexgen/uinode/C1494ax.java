package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1494ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1502b5 A00;
    public final /* synthetic */ InterfaceC05811h A01;
    public final /* synthetic */ C05821i A02;
    public final /* synthetic */ C1399Yn A03;
    public final /* synthetic */ boolean A04;

    public C1494ax(C05821i c05821i, C1399Yn c1399Yn, boolean z10, AbstractC1502b5 abstractC1502b5, InterfaceC05811h interfaceC05811h) {
        this.A02 = c05821i;
        this.A03 = c1399Yn;
        this.A04 = z10;
        this.A00 = abstractC1502b5;
        this.A01 = interfaceC05811h;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        ArrayList arrayList;
        if (C0988Ih.A1O(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(PC.A01(this.A03, this.A00, 1, new C1495ay(this)));
            return;
        }
        InterfaceC05811h interfaceC05811h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC05811h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
