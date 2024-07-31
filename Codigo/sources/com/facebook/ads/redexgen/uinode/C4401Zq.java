package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zq */
/* loaded from: assets/audience_network.dex */
public final class C4401Zq implements InterfaceC25124W {
    public static byte[] A07;
    public int A00;
    public InterfaceC24202z<C249049> A01;
    public final InterfaceC248948 A02;
    public final C25134X A03;
    public final ArrayList<C249049> A04;
    public final ArrayList<C249049> A05;
    public final boolean A06;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-86, -76, -85, -43, -58, -34, -47, -44, -58, -55};
    }

    public C4401Zq(InterfaceC248948 interfaceC248948) {
        this(interfaceC248948, false);
    }

    public C4401Zq(InterfaceC248948 interfaceC248948, boolean z10) {
        this.A01 = new C4413a4(30);
        this.A04 = new ArrayList<>();
        this.A05 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC248948;
        this.A06 = z10;
        this.A03 = new C25134X(this);
    }

    private final int A00(int i10, int i11) {
        int count = this.A05.size();
        if (i11 < count) {
            this.A05.get(i11);
            throw new NullPointerException(A01(0, 3, 5));
        }
        return i10;
    }

    private final void A03(List<C249049> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10);
            A0A(null);
        }
        list.clear();
    }

    public final int A04(int i10) {
        return A00(i10, 0);
    }

    public final int A05(int i10) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 5));
        }
        return i10;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            InterfaceC248948 interfaceC248948 = this.A02;
            this.A05.get(0);
            interfaceC248948.ABK(null);
            throw null;
        }
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A07() {
        A06();
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 5));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 5));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(C249049 c249049) {
        if (!this.A06) {
            throw new NullPointerException(A01(3, 7, 35));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i10) {
        return (this.A00 & i10) != 0;
    }
}
