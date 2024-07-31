package com.facebook.ads.redexgen.uinode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.19 */
/* loaded from: assets/audience_network.dex */
public final class C230619 extends BroadcastReceiver {
    public static String[] A03 = {"JgmY627JJ4fVvMUsUI7dBJzvca", "2Fivc7ze9Y6M7vLBAhVCw66dd2zEUTp", "oqNyJxLxp23hnAfKGRpFUMlaCTnSy4au", "HRO7fC4J0U3bXqsrOiWljP6J940cuLTJ", "rhEs9JkkityiMJcgD18RNPKtdGmllPs6", "c8I5EiJJKjWgwuyghylYWruaZ4nXJiut", "YeKDqRnNq5JcEGU0HYsnt6sxK1D4K6hE", "zIQMBMVVQmczFglCifMrZtV9RNUhKeCf"};
    public AbstractC4480b9 A00;
    public InterfaceC230518 A01;
    public String A02;

    public C230619(String str, AbstractC4480b9 abstractC4480b9, InterfaceC230518 interfaceC230518) {
        this.A00 = abstractC4480b9;
        this.A01 = interfaceC230518;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC3821QP.A06.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A09.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A04.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A0A.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A05.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A0C.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A0B.A03(this.A02));
        intentFilter.addAction(EnumC3821QP.A03.A03(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC3821QP enumC3821QP = EnumC3821QP.A06;
        String action2 = this.A02;
        if (enumC3821QP.A03(action2).equals(action)) {
            InterfaceC230518 interfaceC230518 = this.A01;
            AbstractC4480b9 abstractC4480b9 = this.A00;
            String action3 = A03[1];
            if (action3.length() != 11) {
                A03[0] = "z37hhVYNur1y5njE4t22VYTMbB";
                interfaceC230518.AD0(abstractC4480b9);
                return;
            }
        } else {
            EnumC3821QP enumC3821QP2 = EnumC3821QP.A09;
            String action4 = this.A02;
            if (enumC3821QP2.A03(action4).equals(action)) {
                boolean A1V = C3348Ih.A1V(context);
                String[] strArr = A03;
                if (strArr[3].charAt(16) != strArr[4].charAt(16)) {
                    A03[0] = "a2nbOp8yH430aeg70B0MHQFnwN";
                    if (A1V) {
                        InterfaceC230518 interfaceC2305182 = this.A01;
                        AbstractC4480b9 abstractC4480b92 = this.A00;
                        AdError adError = AdError.AD_PRESENTATION_ERROR;
                        String[] strArr2 = A03;
                        if (strArr2[3].charAt(16) != strArr2[4].charAt(16)) {
                            String[] strArr3 = A03;
                            strArr3[2] = "Smm3aT6IchFgLH9ob00fwQqxHFnPPG6O";
                            strArr3[5] = "wzZfDEncWZ9M4YUYJFr8Gzf2lfnMb6hd";
                            interfaceC2305182.AD1(abstractC4480b92, adError);
                            return;
                        }
                        String[] strArr4 = A03;
                        strArr4[6] = "douVyTcHxmEKv1YyJqQbVTsvWWCOpXBn";
                        strArr4[7] = "x6yn97aV8hj96Z0WREVv4HAdEeLr9VIY";
                        interfaceC2305182.AD1(abstractC4480b92, adError);
                        return;
                    }
                    this.A01.AD1(this.A00, AdError.INTERNAL_ERROR);
                    return;
                }
            } else {
                EnumC3821QP enumC3821QP3 = EnumC3821QP.A04;
                String action5 = this.A02;
                if (enumC3821QP3.A03(action5).equals(action)) {
                    this.A01.ACx(this.A00);
                    return;
                }
                EnumC3821QP enumC3821QP4 = EnumC3821QP.A0A;
                String action6 = this.A02;
                if (enumC3821QP4.A03(action6).equals(action)) {
                    this.A01.ACz(this.A00);
                    return;
                }
                EnumC3821QP enumC3821QP5 = EnumC3821QP.A05;
                String action7 = this.A02;
                if (enumC3821QP5.A03(action7).equals(action)) {
                    this.A01.onRewardedVideoClosed();
                    return;
                }
                EnumC3821QP enumC3821QP6 = EnumC3821QP.A0B;
                String action8 = this.A02;
                if (enumC3821QP6.A03(action8).equals(action)) {
                    this.A01.ACv(this.A00);
                    return;
                }
                EnumC3821QP enumC3821QP7 = EnumC3821QP.A0C;
                String action9 = this.A02;
                if (enumC3821QP7.A03(action9).equals(action)) {
                    this.A01.ACw(this.A00);
                    return;
                }
                EnumC3821QP enumC3821QP8 = EnumC3821QP.A03;
                String action10 = this.A02;
                if (!enumC3821QP8.A03(action10).equals(action)) {
                    return;
                }
                this.A01.onRewardedVideoActivityDestroyed();
                return;
            }
        }
        throw new RuntimeException();
    }
}
