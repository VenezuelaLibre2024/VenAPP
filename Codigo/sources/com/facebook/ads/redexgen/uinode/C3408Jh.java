package com.facebook.ads.redexgen.uinode;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.facebook.ads.redexgen.X.Jh */
/* loaded from: assets/audience_network.dex */
public final class C3408Jh implements InterfaceC3878RK {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC272389 A00;
    public Executor A01;
    public boolean A02;
    public C3883RP A03;
    public final InterfaceC3888RU A04 = new C3419Js();
    public final InterfaceC3893RZ A05;
    public final InterfaceC3894Ra A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC3877RJ A01(AbstractC3890RW abstractC3890RW) throws C3891RX {
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        C3413Jm c3413Jm = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC3890RW.A05(), C3486L0.A04() ? A09() : null);
                A0H(A082, abstractC3890RW);
                A0G(A082, abstractC3890RW);
                if (this.A06.A98()) {
                    this.A06.A9y(A082, abstractC3890RW.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z11 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z10 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z11 || z10)) {
                    try {
                        AbstractC3895Rb.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e10) {
                        this.A00.AA2(A072, AbstractC27248A.A1z, new C27258B(e10));
                    } catch (Exception e11) {
                        this.A00.AA2(A072, AbstractC27248A.A1y, new C27258B(e11));
                    }
                }
                if (A082.getDoOutput() && abstractC3890RW.A06() != null) {
                    A00(A082, abstractC3890RW.A06());
                }
                C3413Jm A06 = A082.getDoInput() ? A06(A082) : new C3413Jm(A082, null);
                if (this.A06.A98()) {
                    this.A06.A9z(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e12) {
                try {
                    try {
                        c3413Jm = A05(null);
                        if (c3413Jm == null || c3413Jm.A83() <= 0) {
                            throw new C3891RX(e12, c3413Jm);
                        }
                        if (this.A06.A98()) {
                            this.A06.A9z(c3413Jm);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return c3413Jm;
                    } catch (Throwable unused) {
                        if (c3413Jm == null || c3413Jm.A83() <= 0) {
                            throw new C3891RX(e12, c3413Jm);
                        }
                        if (this.A06.A98()) {
                            this.A06.A9z(c3413Jm);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return c3413Jm;
                    }
                } catch (Exception unused2) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 53), e12);
                    if (c3413Jm == null || c3413Jm.A83() <= 0) {
                        throw new C3891RX(e12, c3413Jm);
                    }
                    if (this.A06.A98()) {
                        InterfaceC3894Ra interfaceC3894Ra = this.A06;
                        String[] strArr = A08;
                        if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "IlkFDbfWlXmKaUvETbHYmdNk6OEHYi1H";
                        strArr2[2] = "BN3YcSqfdOqAJI6hng3gZMbRThXyngdJ";
                        interfaceC3894Ra.A9z(c3413Jm);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c3413Jm;
                }
            }
        } catch (Throwable th2) {
            if (this.A06.A98()) {
                this.A06.A9z(c3413Jm);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        if (r30.A04 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0189, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018b, code lost:
    
        r7.A9t(r1, r10, 0, r3, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 27)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a5, code lost:
    
        r3 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[EDGE_INSN: B:50:0x0108->B:51:0x0108 BREAK  A[LOOP:0: B:2:0x002a->B:24:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.uinode.InterfaceC3877RJ A0J(com.facebook.ads.redexgen.uinode.AbstractC3890RW r30) throws com.facebook.ads.redexgen.uinode.C3891RX {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3408Jh.A0J(com.facebook.ads.redexgen.X.RW):com.facebook.ads.redexgen.X.RJ");
    }

    static {
        A0A();
        A09 = InterfaceC3878RK.class.getSimpleName();
    }

    public C3408Jh(C3883RP c3883rp, InterfaceC272389 interfaceC272389, Executor executor) {
        A0B();
        this.A03 = c3883rp;
        final C3390JN c3390jn = new C3390JN(c3883rp.A04());
        this.A06 = c3390jn;
        this.A05 = new AbstractC3418Jr(c3390jn) { // from class: com.facebook.ads.redexgen.X.76
        };
        this.A01 = executor;
        this.A00 = interfaceC272389;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.ADq(httpURLConnection);
            if (outputStream != null) {
                this.A05.AHG(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th2) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final InterfaceC3877RJ A02(AbstractC3890RW abstractC3890RW) {
        if (this.A03.A04()) {
            A0C(abstractC3890RW);
        }
        InterfaceC3877RJ interfaceC3877RJ = null;
        try {
            interfaceC3877RJ = A01(abstractC3890RW);
            return interfaceC3877RJ;
        } catch (C3891RX hre) {
            this.A05.ABU(hre);
            return interfaceC3877RJ;
        } catch (Exception e10) {
            this.A05.ABU(new C3891RX(e10, interfaceC3877RJ));
            return interfaceC3877RJ;
        }
    }

    private final InterfaceC3877RJ A03(String str, C3892RY c3892ry, C3886RS c3886rs) {
        return A02(new C3415Jo(str, c3892ry, c3886rs));
    }

    private final InterfaceC3877RJ A04(String str, String str2, byte[] bArr, C3886RS c3886rs) {
        return A02(new C3414Jn(str, null, str2, bArr, c3886rs));
    }

    private final C3413Jm A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AEO(inputStream);
            }
            C3413Jm c3413Jm = new C3413Jm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c3413Jm;
        } catch (Throwable th2) {
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            A08[4] = "eS";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final C3413Jm A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.ADp(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AEO(inputStream);
            }
            C3413Jm c3413Jm = new C3413Jm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c3413Jm;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ADo(str, proxy);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e10);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String property2 = System.getProperty(A07(206, 14, 74));
        int i10 = -1;
        if (property2 != null) {
            try {
                i10 = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String proxyAddress = strArr[0];
        String portStr = strArr[2];
        if (proxyAddress.charAt(28) == portStr.charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!isEmpty && i10 > 0 && i10 <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i10));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (C3408Jh.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC3890RW abstractC3890RW) {
        StringBuilder sb2 = new StringBuilder(A07(182, 10, 17));
        boolean equals = abstractC3890RW.A03().equals(EnumC3889RV.A06);
        String A072 = A07(41, 1, 33);
        if (equals && abstractC3890RW.A06() != null) {
            sb2.append(A07(7, 5, 55));
            sb2.append(new String(abstractC3890RW.A06(), Charset.forName(A07(130, 5, 42))));
            sb2.append(A072);
        }
        Map<String, String> A06 = abstractC3890RW.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb2.append(A07(2, 5, 74));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 118));
            sb2.append(entry.getValue());
            sb2.append(A072);
        }
        sb2.append(A07(0, 2, 109));
        sb2.append(abstractC3890RW.A05());
        sb2.append(A072);
        String sb3 = sb2.toString();
        A0E(sb3, 1, (sb3.length() / 4000) + 1);
    }

    private void A0D(AbstractC3890RW abstractC3890RW, InterfaceC3879RL interfaceC3879RL) {
        this.A04.A63(this, interfaceC3879RL, this.A01).A04(abstractC3890RW);
        if (this.A03.A04()) {
            A0C(abstractC3890RW);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 114) + i10 + A07(65, 1, 35) + i11;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC3879RL interfaceC3879RL, C3886RS c3886rs) {
        C3414Jn req = new C3414Jn(str, null, str2, bArr, c3886rs);
        A0D(req, interfaceC3879RL);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC3890RW abstractC3890RW) {
        Map<String, String> A06 = abstractC3890RW.A02().A06();
        InterfaceC3876RI A05 = abstractC3890RW.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A5o = A05.A5o(this.A03.A03());
            for (String str2 : A5o.keySet()) {
                httpURLConnection.setRequestProperty(str2, A5o.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC3890RW abstractC3890RW) throws IOException {
        C3886RS A02 = abstractC3890RW.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AE6(httpURLConnection, abstractC3890RW.A03(), abstractC3890RW.A04());
    }

    private final boolean A0I(Throwable th2, long j10, AbstractC3890RW abstractC3890RW) {
        C3886RS A02 = abstractC3890RW.A02();
        long elapsedTime = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.A98()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= A00;
    }

    public final C3883RP A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3878RK
    @Deprecated
    public final InterfaceC3877RJ ADy(String str, Map<String, String> parameters) {
        return A03(str, new C3892RY(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3878RK
    @Deprecated
    public final InterfaceC3877RJ ADz(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3878RK
    public final void AE0(String str, byte[] bArr, InterfaceC3879RL interfaceC3879RL) {
        A0F(str, A07(135, 47, 70), bArr, interfaceC3879RL, this.A03.A00());
    }
}