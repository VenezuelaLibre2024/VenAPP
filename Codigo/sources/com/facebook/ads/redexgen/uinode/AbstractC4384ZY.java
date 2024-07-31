package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZY */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4384ZY extends AbstractC25334r {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public C3100Eb A00;
    public Scroller A01;
    public final AbstractC25354t A02 = new C4385ZZ(this);

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC25304o abstractC25304o, int i10, int i11);

    public abstract View A0D(AbstractC25304o abstractC25304o);

    @Deprecated
    public abstract C4398Zn A0E(AbstractC25304o abstractC25304o);

    public abstract int[] A0H(AbstractC25304o abstractC25304o, View view);

    static {
        A09();
    }

    private final C4398Zn A05(AbstractC25304o abstractC25304o) {
        return A0E(abstractC25304o);
    }

    private void A07() {
        this.A00.A1g(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1f(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(AbstractC25304o abstractC25304o, int i10, int i11) {
        C4398Zn A05;
        if (!(abstractC25304o instanceof InterfaceC254250) || (A05 = A05(abstractC25304o)) == null) {
            return false;
        }
        int A0C = A0C(abstractC25304o, i10, i11);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (A0C == -1) {
            return false;
        }
        A05.A0A(A0C);
        abstractC25304o.A1L(A05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25334r
    public final boolean A0B(int i10, int i11) {
        AbstractC25304o layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && A0A(layoutManager, i10, i11);
    }

    public final void A0F() {
        AbstractC25304o layoutManager;
        View A0D;
        C3100Eb c3100Eb = this.A00;
        if (c3100Eb == null || (layoutManager = c3100Eb.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1c(A0H[0], A0H[1]);
        }
    }

    public final void A0G(C3100Eb c3100Eb) throws IllegalStateException {
        C3100Eb c3100Eb2 = this.A00;
        if (c3100Eb2 == c3100Eb) {
            return;
        }
        if (c3100Eb2 != null) {
            A07();
        }
        this.A00 = c3100Eb;
        if (c3100Eb != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
