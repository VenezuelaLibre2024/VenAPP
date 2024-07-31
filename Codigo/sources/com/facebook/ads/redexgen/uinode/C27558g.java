package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.redexgen.X.8g */
/* loaded from: assets/audience_network.dex */
public final class C27558g {
    public static String A00;
    public static EnumC3496LA A01;
    public static byte[] A02;
    public static String[] A03 = {"pgH9SdtSFWTXX0l", "vxegEtvJMZ23RgjyHpc", "ulS7n8X7nNx1Irtm69lPCCFagtwQ2KXJ", "SMp4Mt4DU3EtKobKtaKcK4J1Rc2yK13N", "2t39yg7rltV6biRCRlaAvBIZnsjhSKww", "tY1PV27PV17ox8mww3so5aazg5RDJQQX", "2fotvTqtzlir49zwNSe", "KHZMFPmOyKnxl7a"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-87, -56, -51, -41};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized EnumC3496LA A00(C26937f c26937f) {
        EnumC3496LA enumC3496LA;
        synchronized (C27558g.class) {
            if (A01 == null) {
                A01 = C3497LB.A00(c26937f);
            }
            enumC3496LA = A01;
        }
        return enumC3496LA;
    }

    public static Integer A01(String str) {
        Map<String, Integer> map = A04;
        synchronized (map) {
            Integer num = map.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C26937f c26937f, String str, Map<String, String> params) {
        String str2;
        if (A0A(c26937f)) {
            str2 = C3464Kc.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            String fingerprint = A02(1, 3, 55);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(final C26937f c26937f, boolean z10) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c26937f);
        try {
            final SharedPreferences A002 = AbstractC3440KE.A00(c26937f);
            final C27348K c27348k = new C27348K(c26937f);
            final String str = Build.FINGERPRINT + A02(0, 1, 30) + c27348k.A06();
            A00 = A002.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8f
                public static byte[] A04;
                public static String[] A05 = {"CoyLTTqL9oN", "BQ7yf8H5Dy6", "lyn", "mKjKy3YozjHGjndyHmGPrtRgt1Zkpmof", "kCMvlxHItYqHUu0uJG5AXtsVRpKoPm5F", "PZWzUgGQe3CdPYsrWXqgA6txhpTzavVR", "1z7bJiu6sIQ4w4e4OAYhOvPnvUYdbbgv", "yc5QaeADf08N4Bq6BgqF"};

                public static String A01(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 127);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{24, 61, 51, 46, 61, 45, 17, 29, 31, 92, 19, 28, 22, 0, 29, 27, 22, 92, 4, 23, 28, 22, 27, 28, 21, 100, 116, 102, 119, 110, 112, 96, Byte.MAX_VALUE, 116, 112, 114, 112, 123, 112, 103, 124, 118};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
                
                    if (r1.equals(r0) != false) goto L6;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        r8 = this;
                        r6 = 0
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 31
                        if (r1 >= r0) goto L17
                        r2 = 0
                        r1 = 1
                        r0 = 52
                        java.lang.String r1 = A01(r2, r1, r0)
                        java.lang.String r0 = android.os.Build.VERSION.CODENAME
                        boolean r0 = r1.equals(r0)
                        if (r0 == 0) goto L3e
                    L17:
                        com.facebook.ads.redexgen.X.7f r0 = com.facebook.ads.redexgen.uinode.C26937f.this
                        boolean r0 = com.facebook.ads.redexgen.uinode.C3348Ih.A2G(r0)
                        if (r0 == 0) goto L3e
                        com.facebook.ads.redexgen.X.8K r0 = r2
                        java.lang.String r3 = r0.A0B()
                        r2 = 6
                        r1 = 19
                        r0 = 13
                        java.lang.String r0 = A01(r2, r1, r0)
                        boolean r0 = r0.equals(r3)
                        if (r0 == 0) goto L3e
                        com.facebook.ads.redexgen.X.7f r1 = com.facebook.ads.redexgen.uinode.C26937f.this
                        java.lang.String r0 = r1.getPackageName()
                        java.lang.String r6 = com.facebook.ads.redexgen.uinode.C3502LG.A01(r1, r0)
                    L3e:
                        r5 = 1
                        java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.CallableC27548f.A05
                        r0 = 7
                        r0 = r1[r0]
                        int r1 = r0.length()
                        r0 = 20
                        if (r1 == r0) goto L52
                        java.lang.RuntimeException r0 = new java.lang.RuntimeException
                        r0.<init>()
                        throw r0
                    L52:
                        java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.CallableC27548f.A05
                        java.lang.String r1 = "qQmXUpBlhYC"
                        r0 = 0
                        r2[r0] = r1
                        java.lang.String r1 = "2roBSgd9zyy"
                        r0 = 1
                        r2[r0] = r1
                        if (r6 != 0) goto L8a
                        com.facebook.ads.redexgen.X.7f r1 = com.facebook.ads.redexgen.uinode.C26937f.this
                        java.lang.String r0 = r1.getPackageName()
                        java.lang.String r0 = com.facebook.ads.redexgen.uinode.C3464Kc.A02(r1, r0)
                        com.facebook.ads.redexgen.uinode.C27558g.A00 = r0
                    L6c:
                        android.content.SharedPreferences r0 = r3
                        android.content.SharedPreferences$Editor r2 = r0.edit()
                        java.lang.String r1 = r4
                        java.lang.String r0 = com.facebook.ads.redexgen.uinode.C27558g.A00
                        android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)
                        r0.apply()
                        java.util.concurrent.atomic.AtomicInteger r1 = com.facebook.ads.redexgen.uinode.C27558g.A04()
                        r0 = 2
                        r1.set(r0)
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                        return r0
                    L8a:
                        com.facebook.ads.redexgen.X.7f r0 = com.facebook.ads.redexgen.uinode.C26937f.this
                        boolean r0 = com.facebook.ads.redexgen.uinode.C3348Ih.A1I(r0)
                        if (r0 == 0) goto Le7
                        com.facebook.ads.redexgen.X.7f r1 = com.facebook.ads.redexgen.uinode.C26937f.this
                        java.lang.String r0 = r1.getPackageName()
                        java.lang.String r4 = com.facebook.ads.redexgen.uinode.C3464Kc.A02(r1, r0)
                        r2 = 1
                        r1 = 5
                        r0 = 33
                        java.lang.String r0 = A01(r2, r1, r0)
                        com.facebook.ads.redexgen.X.8B r7 = new com.facebook.ads.redexgen.X.8B
                        r7.<init>(r0)
                        r7.A05(r5)
                        r7.A06(r5)
                        r0 = 0
                        r7.A0A(r0)
                        org.json.JSONObject r3 = new org.json.JSONObject
                        r3.<init>()
                        r2 = 25
                        r1 = 5
                        r0 = 120(0x78, float:1.68E-43)
                        java.lang.String r0 = A01(r2, r1, r0)
                        r3.put(r0, r6)
                        r2 = 30
                        r1 = 5
                        r0 = 108(0x6c, float:1.51E-43)
                        java.lang.String r0 = A01(r2, r1, r0)
                        r3.put(r0, r4)
                        r7.A07(r3)
                        com.facebook.ads.redexgen.X.7f r0 = com.facebook.ads.redexgen.uinode.C26937f.this
                        com.facebook.ads.redexgen.X.89 r4 = r0.A07()
                        int r3 = com.facebook.ads.redexgen.uinode.AbstractC27248A.A1I
                        r2 = 35
                        r1 = 7
                        r0 = 106(0x6a, float:1.49E-43)
                        java.lang.String r0 = A01(r2, r1, r0)
                        r4.A9b(r0, r3, r7)
                    Le7:
                        com.facebook.ads.redexgen.uinode.C27558g.A00 = r6
                        goto L6c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.CallableC27548f.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            AtomicInteger atomicInteger = A05;
            String[] strArr = A03;
            if (strArr[1].length() != strArr[6].length()) {
                Exception e10 = new RuntimeException();
                throw e10;
            }
            String[] strArr2 = A03;
            strArr2[7] = "qnCKfAZ4ZrzI6TW";
            strArr2[0] = "3RwSqq6UclGHbC0";
            atomicInteger.set(0);
        }
    }

    public static void A08(C26937f c26937f, boolean z10, String str) {
        if (A0A(c26937f)) {
            A09(c26937f, z10, str);
        } else {
            A07(c26937f, z10);
        }
    }

    public static void A09(C26937f c26937f, boolean z10, final String str) {
        if (str == null) {
            str = c26937f.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c26937f);
        final C3464Kc c3464Kc = new C3464Kc(c26937f, str);
        try {
            c3464Kc.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8e
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    Map map;
                    Map map2;
                    C3464Kc.this.A05();
                    map = C27558g.A04;
                    synchronized (map) {
                        map2 = C27558g.A04;
                        map2.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            Map<String, Integer> map = A04;
            synchronized (map) {
                map.put(str, 0);
            }
        }
    }

    public static boolean A0A(C26937f c26937f) {
        return ProcessUtils.isRemoteRenderingProcess() || C3348Ih.A2L(c26937f);
    }

    public static boolean A0B(String str) {
        Map<String, Integer> map = A04;
        synchronized (map) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            map.put(str, 1);
            return false;
        }
    }
}
