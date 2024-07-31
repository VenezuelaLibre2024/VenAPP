package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1528bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C05700w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1528bV(C05700w c05700w, JSONObject jSONObject) {
        this.A00 = c05700w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C07277f c07277f;
        C07277f c07277f2;
        CountDownLatch countDownLatch;
        C05690v c05690v;
        C05690v c05690v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c05690v = this.A00.A02;
            synchronized (c05690v) {
                c05690v2 = this.A00.A02;
                c05690v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e10) {
            c07277f2 = this.A00.A03;
            c07277f2.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c07277f = this.A00.A03;
            c07277f.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e11));
        }
    }
}
