package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ys */
/* loaded from: assets/audience_network.dex */
public class C4342Ys extends AbstractRunnableC3455KT {
    public final /* synthetic */ InterfaceC26336U A00;
    public final /* synthetic */ C26346V A01;
    public final /* synthetic */ C26416c A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C4342Ys(C26416c c26416c, ArrayList arrayList, C26346V c26346v, InterfaceC26336U interfaceC26336U, ArrayList arrayList2) {
        this.A02 = c26416c;
        this.A03 = arrayList;
        this.A01 = c26346v;
        this.A00 = interfaceC26336U;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        AtomicBoolean A0D;
        C26937f c26937f;
        Handler handler;
        C26937f c26937f2;
        long j10;
        long j11;
        long j12;
        long j13;
        A0D = C26416c.A0D(this.A03);
        c26937f = this.A02.A04;
        if (c26937f instanceof C4337Yn) {
            c26937f2 = this.A02.A04;
            C4337Yn c4337Yn = (C4337Yn) c26937f2;
            if (this.A01.A00 == -1) {
                if (A0D.get()) {
                    InterfaceC22640S A0E = c4337Yn.A0E();
                    j13 = this.A02.A00;
                    A0E.A48(C3527Lf.A01(j13));
                } else {
                    InterfaceC22640S A0E2 = c4337Yn.A0E();
                    j12 = this.A02.A00;
                    A0E2.A46(C3527Lf.A01(j12));
                }
            } else if (A0D.get()) {
                InterfaceC22640S A0E3 = c4337Yn.A0E();
                j11 = this.A02.A00;
                A0E3.A49(C3527Lf.A01(j11), this.A01.A00);
            } else {
                InterfaceC22640S A0E4 = c4337Yn.A0E();
                j10 = this.A02.A00;
                A0E4.A47(C3527Lf.A01(j10), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C4343Yt(this, A0D));
        C26416c.A0D(this.A04);
    }
}
