package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class G6 {
    public G0 A00;
    public G2 A01;
    public final int A02;
    public final int A03;
    public final SparseArray<G4> A08 = new SparseArray<>();
    public final SparseArray<C0930Fz> A06 = new SparseArray<>();
    public final SparseArray<G1> A07 = new SparseArray<>();
    public final SparseArray<C0930Fz> A04 = new SparseArray<>();
    public final SparseArray<G1> A05 = new SparseArray<>();

    public G6(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}