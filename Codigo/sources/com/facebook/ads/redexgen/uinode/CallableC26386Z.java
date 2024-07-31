package com.facebook.ads.redexgen.uinode;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.6Z */
/* loaded from: assets/audience_network.dex */
public class CallableC26386Z implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03 = {"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    public final C26376Y A00;
    public final /* synthetic */ C26416c A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    static {
        A02();
    }

    public CallableC26386Z(C26416c c26416c, C26376Y c26376y) {
        this.A01 = c26416c;
        this.A00 = c26376y;
    }

    private final Boolean A00() {
        String A01;
        C26937f c26937f;
        C26937f c26937f2;
        InterfaceC223600 A032;
        Map map;
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 63);
            } else {
                A01 = A01(6, 5, 125);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            C224206 c224206 = new C224206(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            c224206.A04 = this.A00.A03;
            c224206.A02 = this.A00.A01;
            c224206.A05 = this.A00.A04;
            c26937f = this.A01.A04;
            if (C26446f.A06(c26937f)) {
                map = C26416c.A0F;
                map.put(this.A00.A08, c224206);
            }
            c26937f2 = this.A01.A04;
            A032 = C26416c.A03(c26937f2.A01());
            return Boolean.valueOf(A032.AFJ(c224206) != null);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }
}
