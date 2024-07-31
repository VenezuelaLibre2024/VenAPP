package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.NH */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3627NH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C3629NJ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 18, 20, 22, 39, 28, 41, 28, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C4337Yn c4337Yn;
        C4337Yn c4337Yn2;
        C4337Yn c4337Yn3;
        InterfaceC3628NI interfaceC3628NI;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 33);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, AbstractC3484Ky.A00(str3));
            intent.addFlags(268435456);
            c4337Yn = this.A00.A0B;
            c4337Yn.A0E().A8g();
            try {
                c4337Yn3 = this.A00.A0B;
                C3471Kj.A0C(c4337Yn3, intent);
                interfaceC3628NI = this.A00.A05;
                interfaceC3628NI.ACR();
            } catch (C3469Kh e10) {
                Throwable cause = e10.getCause();
                Throwable th2 = e10;
                if (cause != null) {
                    th2 = e10.getCause();
                }
                c4337Yn2 = this.A00.A0B;
                c4337Yn2.A07().A9a(A00(11, 11, 113), AbstractC27248A.A00, new C27258B(th2));
            }
        } catch (Throwable th3) {
            AbstractC3447KL.A00(th3, this);
        }
    }

    public ViewOnClickListenerC3627NH(C3629NJ c3629nj) {
        this.A00 = c3629nj;
    }
}
