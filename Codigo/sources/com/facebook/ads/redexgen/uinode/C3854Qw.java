package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qw */
/* loaded from: assets/audience_network.dex */
public final class C3854Qw {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C3080EH A00;
    public final C4168W1 A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public C3854Qw(C4337Yn c4337Yn) {
        C4168W1 c4168w1 = new C4168W1();
        this.A01 = c4168w1;
        InterfaceC3224Gf trackSelectionFactory = new C4175W8(c4168w1);
        this.A00 = AbstractC28159e.A00(new C4295Y7(c4337Yn), new C2946Bo(trackSelectionFactory), new C4297Y9());
    }

    public static String A01(C28139c c28139c) {
        return A00(41, 11, 55) + c28139c.A01 + A00(14, 22, 116) + c28139c.A00 + A00(0, 14, 98) + c28139c.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A6B();
    }

    public final long A06() {
        return this.A00.A6d();
    }

    public final long A07() {
        return this.A00.A6q();
    }

    public final C3852Qu A08() {
        Format vf2 = this.A00.A0L();
        if (vf2 == null) {
            return null;
        }
        return new C3852Qu(vf2.A0F, vf2.A08);
    }

    public final void A09() {
        this.A00.AEV();
    }

    public final void A0A() {
        this.A00.AFk();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f10) {
        this.A00.A0N(f10);
    }

    public final void A0D(long j10) {
        this.A00.AFj(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C4336Ym c4336Ym, Uri uri) {
        if (C3348Ih.A2Q(c4336Ym, A03())) {
            C3858R0 cacheManager = C3858R0.A05(c4336Ym);
            C4194WR c4194wr = new C4194WR(cacheManager.A0F(c4336Ym));
            String A08 = C3858R0.A08(c4336Ym, uri);
            if (A08 != null) {
                c4194wr.A00(A08);
            }
            this.A00.A0P(c4194wr.A01(uri));
            return;
        }
        InterfaceC3115Eq mediaSource = new C4194WR(new C4166Vz(c4336Ym, AbstractC3322IF.A0K(c4336Ym, A00(38, 3, 4)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(InterfaceC3851Qt interfaceC3851Qt) {
        this.A00.A3Q(new C3424Jx(this, interfaceC3851Qt));
    }

    public final void A0H(InterfaceC3853Qv interfaceC3853Qv) {
        this.A00.A0Q(new C3425Jy(this, interfaceC3853Qv));
    }

    public final void A0I(boolean z10) {
        this.A00.AG9(z10);
    }

    public final boolean A0J() {
        return this.A00.A7g();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
