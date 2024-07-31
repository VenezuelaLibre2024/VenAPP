package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.LX */
/* loaded from: assets/audience_network.dex */
public final class C3519LX implements InterfaceC3819QN {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    public C3930SA A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC3721On A07 = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.8p
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C278398 c278398) {
            Handler handler;
            boolean A0D;
            handler = C3519LX.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = C3519LX.this.A0D(EnumC3840Qi.A05);
            if (A0D) {
                C3519LX.this.A03();
                C3519LX.this.A06(true, false);
            }
            C3519LX.this.A03 = true;
        }
    };
    public final AbstractC3790Pu A06 = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.8R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C27929H c27929h) {
            C3519LX.this.A03();
            C3519LX.this.A06(false, false);
            C3519LX.this.A03 = true;
        }
    };
    public final AbstractC3679O7 A08 = new C27398P(this);
    public final AbstractC3636NQ A09 = new AbstractC3636NQ() { // from class: com.facebook.ads.redexgen.X.8O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C277893 c277893) {
            boolean z10;
            boolean A0D;
            z10 = C3519LX.this.A02;
            if (z10) {
                return;
            }
            A0D = C3519LX.this.A0D(EnumC3840Qi.A05);
            if (!A0D) {
                return;
            }
            C3519LX.this.A03();
            C3519LX.this.A06(true, false);
        }
    };
    public final AbstractC3581MX A0A = new C27378N(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC3841Qj> A0B = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;

    public C3519LX(boolean z10) {
        this.A02 = z10;
    }

    public static /* synthetic */ int A00(C3519LX c3519lx) {
        return c3519lx.A00;
    }

    public static /* synthetic */ Handler A01(C3519LX c3519lx) {
        return c3519lx.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC3841Qj> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(C3519LX c3519lx) {
        c3519lx.A03();
    }

    public static /* synthetic */ void A05(C3519LX c3519lx, boolean z10, boolean z11) {
        c3519lx.A06(z10, z11);
    }

    public void A06(boolean z10, boolean z11) {
        for (InterfaceC3841Qj interfaceC3841Qj : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC3841Qj.A3Y(z10, z11);
        }
    }

    public static /* synthetic */ boolean A07(C3519LX c3519lx) {
        return c3519lx.A03;
    }

    public static /* synthetic */ boolean A08(C3519LX c3519lx) {
        return c3519lx.A02;
    }

    public static /* synthetic */ boolean A09(C3519LX c3519lx) {
        return c3519lx.A04;
    }

    public static /* synthetic */ boolean A0A(C3519LX c3519lx, EnumC3840Qi enumC3840Qi) {
        return c3519lx.A0D(enumC3840Qi);
    }

    public static /* synthetic */ boolean A0B(C3519LX c3519lx, boolean z10) {
        c3519lx.A03 = z10;
        return z10;
    }

    public static /* synthetic */ boolean A0C(C3519LX c3519lx, boolean z10) {
        c3519lx.A04 = z10;
        return z10;
    }

    public boolean A0D(EnumC3840Qi enumC3840Qi) {
        Iterator<InterfaceC3841Qj> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A82() != enumC3840Qi) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i10) {
        this.A00 = i10;
    }

    public final void A0I(InterfaceC3841Qj interfaceC3841Qj) {
        this.A0B.add(interfaceC3841Qj);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void A9R(C3930SA c3930sa) {
        this.A01 = c3930sa;
        c3930sa.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3819QN
    public final void AGl(C3930SA c3930sa) {
        A03();
        c3930sa.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
