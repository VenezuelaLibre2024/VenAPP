package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0891Ek {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC0837Bs A00;
    public final InterfaceC0839Bu A01;
    public final InterfaceC0837Bs[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, 18, 24, 15, 7, -61, 21, 8, 4, 7, -61, 23, 11, 8, -61, 22, 23, 21, 8, 4, 16, -47, -17, 16, 15, 6, -63, 16, 7, -63, 21, 9, 6, -63, 2, 23, 2, 10, 13, 2, 3, 13, 6, -63, 6, 25, 21, 19, 2, 4, 21, 16, 19, 20, -63, -55};
    }

    static {
        A01();
    }

    public C0891Ek(InterfaceC0837Bs[] interfaceC0837BsArr, InterfaceC0839Bu interfaceC0839Bu) {
        this.A02 = interfaceC0837BsArr;
        this.A01 = interfaceC0839Bu;
    }

    public final InterfaceC0837Bs A02(InterfaceC0838Bt interfaceC0838Bt, Uri uri) throws IOException, InterruptedException {
        InterfaceC0837Bs interfaceC0837Bs = this.A00;
        if (interfaceC0837Bs != null) {
            return interfaceC0837Bs;
        }
        InterfaceC0837Bs[] interfaceC0837BsArr = this.A02;
        int length = interfaceC0837BsArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            InterfaceC0837Bs interfaceC0837Bs2 = interfaceC0837BsArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                interfaceC0838Bt.AFM();
                throw th2;
            }
            if (interfaceC0837Bs2.AGR(interfaceC0838Bt)) {
                this.A00 = interfaceC0837Bs2;
                interfaceC0838Bt.AFM();
                break;
            }
            continue;
            interfaceC0838Bt.AFM();
            i10++;
        }
        InterfaceC0837Bs interfaceC0837Bs3 = this.A00;
        if (interfaceC0837Bs3 != null) {
            interfaceC0837Bs3.A8o(this.A01);
            return this.A00;
        }
        throw new WM(A00(24, 34, 114) + IF.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}