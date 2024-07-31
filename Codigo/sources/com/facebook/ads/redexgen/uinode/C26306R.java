package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6R */
/* loaded from: assets/audience_network.dex */
public final class C26306R {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C26316S A00;
    public final C26326T A01;
    public final C4336Ym A02;
    public final InterfaceC3903Rj A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = C26306R.class.getSimpleName();
    }

    public C26306R(C4336Ym c4336Ym, InterfaceC3290Hj interfaceC3290Hj, C26316S c26316s, C26326T c26326t) {
        this.A02 = c4336Ym;
        InterfaceC3903Rj A4i = interfaceC3290Hj.A4i(EnumC3904Rk.A06);
        this.A03 = A4i;
        this.A00 = c26316s;
        this.A01 = c26326t;
        A4i.A3R(new C4345Yv(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A9C()) {
                this.A02.A04().A8z();
                return;
            }
            String btExtras = this.A03.A6h().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C3348Ih.A0f(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
