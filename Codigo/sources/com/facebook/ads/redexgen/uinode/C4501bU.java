package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bU */
/* loaded from: assets/audience_network.dex */
public class C4501bU extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C22930w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C4501bU(C22930w c22930w, String str) {
        this.A00 = c22930w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C26937f c26937f;
        C26937f c26937f2;
        CountDownLatch countDownLatch;
        C22920v c22920v;
        C22920v c22920v2;
        C22920v c22920v3;
        boolean A0J;
        C22920v c22920v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c22920v = this.A00.A02;
            synchronized (c22920v) {
                c22920v2 = this.A00.A02;
                Iterator<String> keys = c22920v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C22930w c22930w = this.A00;
                        c22920v4 = c22930w.A02;
                        c22930w.A0E((C23261T) c22920v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c22920v3 = this.A00.A02;
                c22920v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c26937f2 = this.A00.A03;
            InterfaceC272389 A07 = c26937f2.A07();
            String encryptedId = A00(0, 17, 8);
            A07.A9a(encryptedId, AbstractC27248A.A1B, new C27258B(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c26937f = this.A00.A03;
            InterfaceC272389 A072 = c26937f.A07();
            String encryptedId2 = A00(0, 17, 8);
            A072.A9a(encryptedId2, AbstractC27248A.A1A, new C27258B(e11));
        }
    }
}
