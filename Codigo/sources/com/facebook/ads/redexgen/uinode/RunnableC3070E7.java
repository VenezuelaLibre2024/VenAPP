package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.E7 */
/* loaded from: assets/audience_network.dex */
public class RunnableC3070E7 implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"trtHxdWfI8aUUasJnLCFOWNhTEgT5SfR", "ildDLLQ3Py5XZqRSamTTI6YoT50zpskF", "dVw5UxmZMKob3SUb3uvB6OES0lFAFJfM", "IR8fXYoB6j0jxnrkbU78JZ5o5XE94BNQ", "b3RCFjVWO3b8eRQaxF9", "jCTIeE11ZTJ65IoFy1xYkV7ELZ3vCqIN", "TgSfnKfrSSedvNLmmcoIbwvrw3BnVtDY", "eNW8IuS2yi6nO7dU30TIFIzk8f1M77f"};
    public final /* synthetic */ C3079EG A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 26;
            if (A02[0].charAt(19) == 't') {
                throw new RuntimeException();
            }
            A02[6] = "Wfj4XOUJd4uRzIFmDg2tyEJWBqTNOatQ";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 110, 121, 100, 98, 99, 45, 107, 100, 97, 104, 45, 97, 98, 108, 105, 100, 99, 106, 45, 107, 108, 100, 97, 104, 105, 35, 12, 39, 63, 38, 36, 39, 41, 44, 5, 41, 38, 41, 47, 45, 58};
    }

    static {
        A01();
    }

    public RunnableC3070E7(C3079EG c3079eg) {
        this.A00 = c3079eg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadAction[] actions;
        Handler handler;
        C3064Dw c3064Dw;
        DownloadAction.Deserializer[] deserializerArr;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            try {
                c3064Dw = this.A00.A09;
                deserializerArr = this.A00.A0E;
                actions = c3064Dw.A03(deserializerArr);
            } catch (Throwable th2) {
                Log.e(A00(27, 15, 82), A00(0, 27, 23), th2);
                actions = new DownloadAction[0];
            }
            handler = this.A00.A07;
            handler.post(new RunnableC3069E6(this, actions));
        } catch (Throwable th3) {
            AbstractC3447KL.A00(th3, this);
        }
    }
}
