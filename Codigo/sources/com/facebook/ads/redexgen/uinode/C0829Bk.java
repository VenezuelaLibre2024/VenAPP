package com.facebook.ads.redexgen.uinode;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0829Bk implements InterfaceC1319Vi, Comparator<HO> {
    public long A00;
    public final long A01;
    public final TreeSet<HO> A02 = new TreeSet<>(this);

    public C0829Bk(long j10) {
        this.A01 = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(HO ho, HO ho2) {
        if (ho.A00 - ho2.A00 == 0) {
            return ho.compareTo(ho2);
        }
        return ho.A00 < ho2.A00 ? -1 : 1;
    }

    private void A01(HK hk2, long j10) {
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            try {
                hk2.AF9(this.A02.first());
            } catch (HI unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.HJ
    public final void ADB(HK hk2, HO ho) {
        this.A02.add(ho);
        this.A00 += ho.A01;
        A01(hk2, 0L);
    }

    @Override // com.facebook.ads.redexgen.uinode.HJ
    public final void ADC(HK hk2, HO ho) {
        this.A02.remove(ho);
        this.A00 -= ho.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.HJ
    public final void ADD(HK hk2, HO ho, HO ho2) {
        ADC(hk2, ho);
        ADB(hk2, ho2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1319Vi
    public final void ADE(HK hk2, String str, long j10, long j11) {
        A01(hk2, j11);
    }
}
