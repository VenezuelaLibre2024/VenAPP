package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6T */
/* loaded from: assets/audience_network.dex */
public final class C26326T {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", "", "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;
    public C4336Ym A00;
    public String A01;
    public final C3511LP A02 = new C3511LP(300000000000L, new C4344Yu(this));

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, Byte.MAX_VALUE, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, 61, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static InterfaceC27578i A00(C4336Ym c4336Ym) {
        if (C3348Ih.A10(c4336Ym)) {
            return C27588j.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        C4308YK A00 = C27588j.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C4336Ym c4336Ym;
        synchronized (this) {
            c4336Ym = this.A00;
        }
        if (c4336Ym == null) {
            return;
        }
        String A042 = C27608l.A00().A01(c4336Ym, true).A04(A00(c4336Ym));
        synchronized (this) {
            this.A01 = A042;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(C4336Ym c4336Ym) {
        this.A00 = c4336Ym;
        c4336Ym.A07().AAL();
        if (this.A00.A06().AGJ() || ((A05.get() && C3348Ih.A1Y(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
