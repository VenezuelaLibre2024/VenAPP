package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.E8 */
/* loaded from: assets/audience_network.dex */
public class RunnableC3071E8 implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C3079EG A00;
    public final /* synthetic */ DownloadAction[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{30, 53, 45, 52, 54, 53, 59, 62, 23, 59, 52, 59, 61, 63, 40, 105, 92, 75, 74, 80, 74, 77, 80, 87, 94, 25, 88, 90, 77, 80, 86, 87, 74, 25, 95, 88, 80, 85, 92, 93, 23};
    }

    public RunnableC3071E8(C3079EG c3079eg, DownloadAction[] downloadActionArr) {
        this.A00 = c3079eg;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3064Dw c3064Dw;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            try {
                c3064Dw = this.A00.A09;
                c3064Dw.A02(this.A01);
            } catch (IOException e10) {
                Log.e(A00(0, 15, 36), A00(15, 26, 71), e10);
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
