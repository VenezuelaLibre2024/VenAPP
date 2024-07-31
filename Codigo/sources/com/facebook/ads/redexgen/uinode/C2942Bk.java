package com.facebook.ads.redexgen.uinode;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Bk */
/* loaded from: assets/audience_network.dex */
public final class C2942Bk implements InterfaceC4149Vi, Comparator<C3269HO> {
    public long A00;
    public final long A01;
    public final TreeSet<C3269HO> A02 = new TreeSet<>(this);

    public C2942Bk(long j10) {
        this.A01 = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C3269HO c3269ho, C3269HO c3269ho2) {
        if (c3269ho.A00 - c3269ho2.A00 == 0) {
            return c3269ho.compareTo(c3269ho2);
        }
        return c3269ho.A00 < c3269ho2.A00 ? -1 : 1;
    }

    private void A01(InterfaceC3265HK interfaceC3265HK, long j10) {
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            try {
                interfaceC3265HK.AF9(this.A02.first());
            } catch (C3263HI unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3264HJ
    public final void ADB(InterfaceC3265HK interfaceC3265HK, C3269HO c3269ho) {
        this.A02.add(c3269ho);
        this.A00 += c3269ho.A01;
        A01(interfaceC3265HK, 0L);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3264HJ
    public final void ADC(InterfaceC3265HK interfaceC3265HK, C3269HO c3269ho) {
        this.A02.remove(c3269ho);
        this.A00 -= c3269ho.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3264HJ
    public final void ADD(InterfaceC3265HK interfaceC3265HK, C3269HO c3269ho, C3269HO c3269ho2) {
        ADC(interfaceC3265HK, c3269ho);
        ADB(interfaceC3265HK, c3269ho2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4149Vi
    public final void ADE(InterfaceC3265HK interfaceC3265HK, String str, long j10, long j11) {
        A01(interfaceC3265HK, j11);
    }
}
