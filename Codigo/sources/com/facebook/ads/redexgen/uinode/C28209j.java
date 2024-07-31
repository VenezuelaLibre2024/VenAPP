package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9j */
/* loaded from: assets/audience_network.dex */
public final class C28209j implements Comparable<C28209j> {
    public int A00;
    public long A01;
    public Object A02;
    public final C2844A8 A03;

    public C28209j(C2844A8 c2844a8) {
        this.A03 = c2844a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C28209j c28209j) {
        Object obj = this.A02;
        if ((obj == null) != (c28209j.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i10 = this.A00 - c28209j.A00;
        if (i10 != 0) {
            return i10;
        }
        int comparePeriodIndex = AbstractC3322IF.A07(this.A01, c28209j.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
