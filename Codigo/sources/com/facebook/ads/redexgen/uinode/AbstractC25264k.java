package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4k */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC25264k {
    public static byte[] A06;
    public static String[] A07 = {"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", "n3", "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    public InterfaceC25244i A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{85, 84, 123, 84, 83, 87, 91, 78, 83, 85, 84, 73, 124, 83, 84, 83, 73, 82, 95, 94};
    }

    public abstract boolean A0D(AbstractC254856 abstractC254856);

    public abstract boolean A0E(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2);

    public abstract boolean A0F(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2);

    public abstract boolean A0G(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2);

    public abstract boolean A0H(AbstractC254856 abstractC254856, AbstractC254856 abstractC2548562, C25254j c25254j, C25254j c25254j2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AbstractC254856 abstractC254856);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AbstractC254856 abstractC254856) {
        int i10;
        i10 = abstractC254856.A0C;
        int i11 = i10 & 14;
        if (abstractC254856.A0Z()) {
            return 4;
        }
        int flags = i11 & 4;
        if (flags == 0) {
            int A0J = abstractC254856.A0J();
            int A0G = abstractC254856.A0G();
            String[] strArr = A07;
            String str = strArr[3];
            String str2 = strArr[1];
            int oldPos = str.length();
            int flags2 = str2.length();
            if (oldPos == flags2) {
                throw new RuntimeException();
            }
            A07[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
            if (A0J != -1 && A0G != -1 && A0J != A0G) {
                return i11 | RecognitionOptions.PDF417;
            }
            return i11;
        }
        return i11;
    }

    private final C25254j A01() {
        return new C25254j();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final C25254j A08(C254553 c254553, AbstractC254856 abstractC254856) {
        return A01().A01(abstractC254856);
    }

    public final C25254j A09(C254553 c254553, AbstractC254856 abstractC254856, int i10, List<Object> payloads) {
        return A01().A01(abstractC254856);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 16));
        }
        this.A05.clear();
    }

    public final void A0B(InterfaceC25244i interfaceC25244i) {
        this.A04 = interfaceC25244i;
    }

    public final void A0C(AbstractC254856 abstractC254856) {
        InterfaceC25244i interfaceC25244i = this.A04;
        if (interfaceC25244i != null) {
            interfaceC25244i.AAj(abstractC254856);
        }
    }

    public boolean A0M(AbstractC254856 abstractC254856, List<Object> payloads) {
        return A0D(abstractC254856);
    }
}
