package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1527bU extends KT {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C05700w A00;
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

    public C1527bU(C05700w c05700w, String str) {
        this.A00 = c05700w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C07277f c07277f;
        C07277f c07277f2;
        CountDownLatch countDownLatch;
        C05690v c05690v;
        C05690v c05690v2;
        C05690v c05690v3;
        boolean A0J;
        C05690v c05690v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c05690v = this.A00.A02;
            synchronized (c05690v) {
                c05690v2 = this.A00.A02;
                Iterator<String> keys = c05690v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C05700w c05700w = this.A00;
                        c05690v4 = c05700w.A02;
                        c05700w.A0E((C1T) c05690v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c05690v3 = this.A00.A02;
                c05690v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c07277f2 = this.A00.A03;
            AnonymousClass89 A07 = c07277f2.A07();
            String encryptedId = A00(0, 17, 8);
            A07.A9a(encryptedId, C8A.A1B, new C8B(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c07277f = this.A00.A03;
            AnonymousClass89 A072 = c07277f.A07();
            String encryptedId2 = A00(0, 17, 8);
            A072.A9a(encryptedId2, C8A.A1A, new C8B(e11));
        }
    }
}
