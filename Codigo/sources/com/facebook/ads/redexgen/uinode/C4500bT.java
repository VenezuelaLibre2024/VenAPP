package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bT */
/* loaded from: assets/audience_network.dex */
public class C4500bT extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C22930w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C4500bT(C22930w c22930w, String str) {
        this.A00 = c22930w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C26937f c26937f;
        C26937f c26937f2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C22920v c22920v;
        C22920v c22920v2;
        C22920v c22920v3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c22920v = this.A00.A02;
                ((C23261T) c22920v.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c22920v2 = this.A00.A02;
                c22920v2.A07(this.A01);
                c22920v3 = this.A00.A02;
                c22920v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c26937f2 = this.A00.A03;
            c26937f2.A07().A9a(A00, AbstractC27248A.A1B, new C27258B(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c26937f = this.A00.A03;
            c26937f.A07().A9a(A00, AbstractC27248A.A1A, new C27258B(e11));
        }
    }
}
