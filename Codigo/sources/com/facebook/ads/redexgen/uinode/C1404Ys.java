package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ys */
/* loaded from: assets/audience_network.dex */
public class C1404Ys extends KT {
    public final /* synthetic */ C6U A00;
    public final /* synthetic */ C6V A01;
    public final /* synthetic */ C07046c A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1404Ys(C07046c c07046c, ArrayList arrayList, C6V c6v, C6U c6u, ArrayList arrayList2) {
        this.A02 = c07046c;
        this.A03 = arrayList;
        this.A01 = c6v;
        this.A00 = c6u;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AtomicBoolean A0D;
        C07277f c07277f;
        Handler handler;
        C07277f c07277f2;
        long j10;
        long j11;
        long j12;
        long j13;
        A0D = C07046c.A0D(this.A03);
        c07277f = this.A02.A04;
        if (c07277f instanceof C1399Yn) {
            c07277f2 = this.A02.A04;
            C1399Yn c1399Yn = (C1399Yn) c07277f2;
            if (this.A01.A00 == -1) {
                if (A0D.get()) {
                    C0S A0E = c1399Yn.A0E();
                    j13 = this.A02.A00;
                    A0E.A48(C1057Lf.A01(j13));
                } else {
                    C0S A0E2 = c1399Yn.A0E();
                    j12 = this.A02.A00;
                    A0E2.A46(C1057Lf.A01(j12));
                }
            } else if (A0D.get()) {
                C0S A0E3 = c1399Yn.A0E();
                j11 = this.A02.A00;
                A0E3.A49(C1057Lf.A01(j11), this.A01.A00);
            } else {
                C0S A0E4 = c1399Yn.A0E();
                j10 = this.A02.A00;
                A0E4.A47(C1057Lf.A01(j10), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C1405Yt(this, A0D));
        C07046c.A0D(this.A04);
    }
}
