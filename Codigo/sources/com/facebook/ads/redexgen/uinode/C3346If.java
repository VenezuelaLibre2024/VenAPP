package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.If */
/* loaded from: assets/audience_network.dex */
public final class C3346If {
    public static byte[] A06;
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new ServiceConnectionC3345Ie(this);
    public final C4337Yn A03;
    public final String A04;
    public final String A05;

    static {
        A06();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{-35, -50, -33, -50, -38, -20, -50, -37, -20, -30, -30, -42, -47, -18, -33, -16, -33, -21, -3, -18, -16, -19, -14, -19, -31, -19, -22, -3, -12, -29, -16, -15, -25, -19, -20, 6, -9, 8, -9, 3, 21, 8, -5, 7, 11, -5, 9, 10, 21, -1, -6, -67, -50, -48, -40, -50, -44, -46, -100, -48, -36, -38, -35, -36, -37, -46, -37, -31, -115, -37, -36, -31, -115, -45, -36, -30, -37, -47, -115, -36, -33, -115, -38, -42, -32, -32, -42, -37, -44, -115, -35, -46, -33, -38, -42, -32, -32, -42, -36, -37, -32, -12, 22, 19, 7, 9, 23, 23, 13, 18, 11, -60, 22, 9, 21, 25, 9, 23, 24, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -15, -32, -27, -31, -22, -33, -31, -22, -31, -16, -13, -21, -18, -25, -86, -67, -15, -32, -27, -31, -22, -33, -31, -54, -31, -16, -13, -21, -18, -25, -49, -31, -18, -14, -27, -33, -31, 66, 78, 76, 13, 69, 64, 66, 68, 65, 78, 78, 74, 13, 74, 64, 83, 64, 77, 64, 21, 28, 15, 11, 34, 13, 24, 21, 16, 13, 32, 21, 27, 26};
    }

    public C3346If(C4337Yn c4337Yn, String str, String str2) {
        this.A03 = c4337Yn;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(13, 22, 60), 1);
        bundle.putString(A05(0, 13, 43), this.A04);
        bundle.putString(A05(35, 16, 84), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, C27258B c27258b) {
        this.A03.A07().A9a(A05(189, 14, 74), i10, c27258b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i10, C27258B c27258b) {
        c27258b.A05(1);
        this.A03.A07().A9b(A05(189, 14, 74), i10, c27258b);
    }

    public final void A0C() {
        A08(AbstractC27248A.A1t, new C27258B(A05(101, 18, 66), this.A05));
        Intent intent = new Intent();
        intent.setClassName(A05(170, 19, 125), A05(119, 51, 26));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(AbstractC27248A.A1p, new C27258B(A05(51, 50, 11)));
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e10) {
            A07(AbstractC27248A.A1o, new C27258B(e10));
        }
    }
}
