package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class GQ implements Comparable<GQ> {
    public final int A00;
    public final GM A01;

    public GQ(int i10, GM gm2) {
        this.A00 = i10;
        this.A01 = gm2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GQ gq) {
        return this.A00 - gq.A00;
    }
}
