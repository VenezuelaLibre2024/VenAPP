package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Y */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC25144Y {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC25304o A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, 29, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public AbstractC25144Y(AbstractC25304o abstractC25304o) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC25304o;
    }

    public /* synthetic */ AbstractC25144Y(AbstractC25304o abstractC25304o, C4397Zm c4397Zm) {
        this(abstractC25304o);
    }

    public static C4397Zm A00(AbstractC25304o abstractC25304o) {
        return new C4397Zm(abstractC25304o);
    }

    public static C4396Zl A01(AbstractC25304o abstractC25304o) {
        return new C4396Zl(abstractC25304o);
    }

    public static AbstractC25144Y A02(AbstractC25304o abstractC25304o, int i10) {
        switch (i10) {
            case 0:
                return A00(abstractC25304o);
            case 1:
                return A01(abstractC25304o);
            default:
                throw new IllegalArgumentException(A03(0, 19, 11));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
