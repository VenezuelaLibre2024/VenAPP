package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.FG */
/* loaded from: assets/audience_network.dex */
public final class C3141FG extends AbstractC4457am {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public C3141FG(C4337Yn c4337Yn, C23531u c23531u) {
        super(c4337Yn, c23531u);
    }

    private C4449ae A00(Runnable runnable) {
        return new C4449ae(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4457am
    public final void A0M() {
        AbstractC4480b9 abstractC4480b9 = (AbstractC4480b9) this.A01;
        abstractC4480b9.A00(this.A07.A00);
        abstractC4480b9.A01(this.A07.A01);
        abstractC4480b9.A0I();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4457am
    public final void A0O(InterfaceC22860p interfaceC22860p, C27428S c27428s, C27408Q c27408q, C23541v c23541v) {
        C3157FY c3157fy = (C3157FY) interfaceC22860p;
        C4450af c4450af = new C4450af(this, c23541v, c3157fy);
        if (C3348Ih.A27(this.A0B)) {
            A0F().postDelayed(c4450af, c27428s.A05().A05());
        }
        C4337Yn c4337Yn = this.A0B;
        C4449ae A002 = A00(c4450af);
        boolean z10 = this.A07.A06;
        String str = this.A07.A04;
        C23531u c23531u = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        c3157fy.A0J(c4337Yn, A002, c23541v, z10, str, c23531u.A05);
    }

    public final void A0X(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7e() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC4480b9 rewardedVideoAdapter = (AbstractC4480b9) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
