package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.VY */
/* loaded from: assets/audience_network.dex */
public final class C4139VY implements InterfaceC3381JE {
    public static byte[] A04;
    public static String[] A05 = {"Y66c6k3Hy3UvBBfpHck", "fJ4NdAtGEgbYsoLarolV0m2U2ouke5wB", "RcyYmVgVLeSkKDa12w3", "KskJyNeVQ7IEAjxWCckPmucmu9amULkO", "1ed8Y", "R", "mHN6PRZU6o6WB3AjYfdaJfhjKiNadrGW", "OPv53LJXnFYa9uQB3GUlIx9f3blXJ2fU"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC4140VZ A00;
    public C4558ca<C3355Io, C3360It> A01;
    public final C4336Ym A02;
    public final C4552cU A03 = C4552cU.A01();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].charAt(19) != 'V') {
                throw new RuntimeException();
            }
            A05[1] = "obfng8wQuS9GtxnUf86VO2yIawxGqzEf";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{-29, -9, -12, -81, -4, -12, -13, -8, -16, -81, -14, 1, -12, -16, 3, -8, 5, -12, -81, 5, -8, -12, 6, -81, -8, 2, -81, -3, 4, -5, -5, -67, -57, -32, -28, -41, -39, -37, -27, -26, -41, -28, -37, -32, -39, -110, -45, -110, -32, -25, -34, -34, -110, -43, -28, -41, -45, -26, -37, -24, -41, -110, -24, -37, -41, -23, -109, 6, 25, 21, 39, 32, 31, 25, 30, 36, -12, 17, 36, 17, -48, 25, 35, -48, 30, 37, 28, 28, -47, 4, -10, -12, 0, -1, -11, -16, -12, -7, -14, -1, -1, -10, -3};
    }

    static {
        A02();
        A06 = C4139VY.class.getSimpleName();
    }

    public C4139VY(C4336Ym c4336Ym) {
        this.A02 = c4336Ym;
    }

    private void A01() {
        this.A02.A07().A9a(A00(89, 14, 40), 3600, new C27258B(A00(67, 22, 71)));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3381JE
    public final void ABG() {
        C4558ca<C3355Io, C3360It> c4558ca = this.A01;
        if (c4558ca != null) {
            c4558ca.A03.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3381JE
    public final void ADg() {
        C4558ca<C3355Io, C3360It> c4558ca = this.A01;
        if (c4558ca != null) {
            c4558ca.A03.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3381JE
    public final void AGk(View view) {
        if (this.A01 == null) {
            this.A02.A07().A9a(A00(89, 14, 40), 3600, new C27258B(A00(32, 35, 9)));
            return;
        }
        this.A03.A06(view);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3381JE
    public final void AGv(View view, String str, boolean z10) {
        AGw(view, str, z10, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3381JE
    public final void AGw(View view, String str, boolean z10, boolean z11) {
        AGx(view, str, z10, z11, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3381JE
    public final void AGx(View view, String str, boolean z10, boolean z11, boolean z12) {
        if (view != null) {
            ViewOnAttachStateChangeListenerC4140VZ viewOnAttachStateChangeListenerC4140VZ = new ViewOnAttachStateChangeListenerC4140VZ(view);
            this.A00 = viewOnAttachStateChangeListenerC4140VZ;
            this.A03.A08(viewOnAttachStateChangeListenerC4140VZ, view);
            if (z11) {
                ViewOnAttachStateChangeListenerC4140VZ viewOnAttachStateChangeListenerC4140VZ2 = this.A00;
                String[] strArr = A05;
                if (strArr[0].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "hwPcHACCkDldKsuu7a1";
                strArr2[2] = "KVS16a9OP0E0NreE4Vx";
                viewOnAttachStateChangeListenerC4140VZ2.A03();
            }
            C4558ca<C3355Io, C3360It> A062 = C4558ca.A00(new C3355Io(this.A02, view, str, z10, z12), new C3360It(), A06).A05(new C4141Va(new C4138VX())).A06();
            this.A01 = A062;
            this.A03.A07(view, A062);
            return;
        }
        this.A02.A07().A9a(A00(89, 14, 40), 3600, new C27258B(A00(0, 32, 38)));
    }
}
