package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.WW */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4199WW implements InterfaceC3115Eq {
    public static String[] A05 = {"2", "A1R5XmGNdue", "Xf2fF", "2MZr802CwBgh98iwI2LX9r8AFH0stAP", "PWtCslqWMOhLlWMecFeGOSMcL", "Nab9jbcw8W2RSLeSFi8qaY40Uhnm56i", "UlYKNWRAV2IAyBS", "QHLbHyQnMMy3J3Z"};
    public InterfaceC4294Y6 A00;
    public AbstractC2853AH A01;
    public Object A02;
    public final ArrayList<InterfaceC3114Ep> A04 = new ArrayList<>(1);
    public final C3126F1 A03 = new C3126F1();

    public abstract void A02();

    public abstract void A03(InterfaceC4294Y6 interfaceC4294Y6, boolean z10);

    public final C3126F1 A00(C3113Eo c3113Eo) {
        return this.A03.A02(0, c3113Eo, 0L);
    }

    public final void A01(AbstractC2853AH abstractC2853AH, Object obj) {
        this.A01 = abstractC2853AH;
        this.A02 = obj;
        Iterator<InterfaceC3114Ep> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ADA(this, abstractC2853AH, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final void A3O(Handler handler, InterfaceC3129F4 interfaceC3129F4) {
        this.A03.A07(handler, interfaceC3129F4);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final void AE7(InterfaceC4294Y6 interfaceC4294Y6, boolean z10, InterfaceC3114Ep interfaceC3114Ep) {
        InterfaceC4294Y6 interfaceC4294Y62 = this.A00;
        AbstractC3281Ha.A03(interfaceC4294Y62 == null || interfaceC4294Y62 == interfaceC4294Y6);
        this.A04.add(interfaceC3114Ep);
        if (this.A00 == null) {
            this.A00 = interfaceC4294Y6;
            A03(interfaceC4294Y6, z10);
        } else {
            AbstractC2853AH abstractC2853AH = this.A01;
            if (abstractC2853AH == null) {
                return;
            }
            interfaceC3114Ep.ADA(this, abstractC2853AH, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final void AEb(InterfaceC3114Ep interfaceC3114Ep) {
        this.A04.remove(interfaceC3114Ep);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            if (A05[2].length() == 23) {
                throw new RuntimeException();
            }
            A05[2] = "TEgrTEJPhaeJK53iaQZF";
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final void AF7(InterfaceC3129F4 interfaceC3129F4) {
        this.A03.A0D(interfaceC3129F4);
    }
}
