package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV */
/* loaded from: assets/audience_network.dex */
public class C4502bV extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public final /* synthetic */ C22930w A00;
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

    public C4502bV(C22930w c22930w, JSONObject jSONObject) {
        this.A00 = c22930w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C26937f c26937f;
        C26937f c26937f2;
        CountDownLatch countDownLatch;
        C22920v c22920v;
        C22920v c22920v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c22920v = this.A00.A02;
            synchronized (c22920v) {
                c22920v2 = this.A00.A02;
                c22920v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e10) {
            c26937f2 = this.A00.A03;
            c26937f2.A07().A9a(A00(0, 17, 116), AbstractC27248A.A1B, new C27258B(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c26937f = this.A00.A03;
            c26937f.A07().A9a(A00(0, 17, 116), AbstractC27248A.A1A, new C27258B(e11));
        }
    }
}
