package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6c */
/* loaded from: assets/audience_network.dex */
public final class C26416c {
    public static InterfaceC223600 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, C224206> A0F;
    public static final Map<String, C26436e> A0G;
    public long A00;
    public C3377JA A01;
    public final C26426d A03;
    public final C26937f A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Boolean bool = (Boolean) ((Future) it2.next()).get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    Log.e(A0E, A08(86, 42, 61), e10);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(ExecutorC3541Lt.A02().submit(it.next()));
        }
    }

    public static void A0F() {
        A0C = new byte[]{124, -81, 122, -81, -85, -126, 125, Byte.MAX_VALUE, 108, -101, 105, -105, 106, -103, -100, -104, 84, 81, 82, -125, 85, Byte.MIN_VALUE, -127, Byte.MIN_VALUE, -119, -89, -87, -82, -85, 102, -71, -70, -89, -72, -70, -85, -86, 116, -113, -83, -81, -76, -75, -70, -77, 108, -81, -69, -71, -68, -72, -79, -64, -79, Byte.MAX_VALUE, -99, -97, -92, -91, -86, -93, 92, -94, -99, -91, -88, -95, -96, 100, -126, -124, -119, -118, -113, -120, 65, -108, -107, -126, -109, -107, -122, -123, 79, 79, 79, -116, -65, -86, -84, -73, -69, -80, -74, -75, 103, -66, -81, -80, -77, -84, 103, -84, -65, -84, -86, -68, -69, -80, -75, -82, 103, -86, -88, -86, -81, -84, 103, -85, -74, -66, -75, -77, -74, -88, -85, -70, 117, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, Byte.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C26416c.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C26416c(C26937f c26937f) {
        this.A04 = c26937f;
        this.A03 = C26426d.A06(c26937f.A01());
        this.A08 = C3348Ih.A2I(c26937f);
        this.A09 = C3348Ih.A2Q(c26937f, C3854Qw.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized InterfaceC223600 A03(C4336Ym c4336Ym) {
        InterfaceC223600 interfaceC223600;
        synchronized (C26416c.class) {
            if (A0A == null) {
                A0A = AbstractC223701.A00(c4336Ym, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final C224307 A00(int i10) {
                        this.A00 = i10;
                        return this;
                    }

                    public final C224307 A01(int i10) {
                        this.A01 = i10;
                        return this;
                    }

                    public final C224307 A02(boolean z10) {
                        this.A02 = z10;
                        return this;
                    }

                    public final C224307 A03(boolean z10) {
                        this.A03 = z10;
                        return this;
                    }

                    public final C224307 A04(boolean z10) {
                        this.A04 = z10;
                        return this;
                    }

                    public final C224408 A05() {
                        return new C224408(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(C3348Ih.A05(c4336Ym)).A02(c4336Ym.A04().A8z()).A01(-1).A03(C3348Ih.A0k(c4336Ym)).A04(C3348Ih.A2P(c4336Ym)).A05(), A05(c4336Ym));
            }
            interfaceC223600 = A0A;
        }
        return interfaceC223600;
    }

    public static C224206 A04(C26937f c26937f, String str) {
        C224206 c224206 = A0F.get(str);
        if (C26446f.A06(c26937f) && c224206 != null) {
            C224206 storedCacheData = new C224206(c224206);
            return storedCacheData;
        }
        C224206 storedCacheData2 = new C224206(str);
        return storedCacheData2;
    }

    public static C4341Yr A05(C4336Ym c4336Ym) {
        return new C4341Yr(c4336Ym);
    }

    public static synchronized List<String> A09(C26937f c26937f) {
        List<String> list;
        synchronized (C26416c.class) {
            if (A0B == null) {
                ArrayList arrayList = new ArrayList();
                A0B = arrayList;
                A0J(arrayList, c26937f);
            }
            list = A0B;
        }
        return list;
    }

    public static void A0H(C26937f c26937f, String str) {
        C26436e c26436e;
        if (C26446f.A06(c26937f) && !TextUtils.isEmpty(str) && (c26436e = A0G.get(str)) != null) {
            c26436e.A00 = A08(186, 4, 35);
            C4336Ym A01 = c26937f.A01();
            C3858R0 A05 = C3858R0.A05(A01);
            String A08 = C3858R0.A08(A01, AbstractC3484Ky.A00(str));
            if (A08 == null) {
                A08 = str;
            }
            C26446f.A04(c26937f, c26436e, A05.A0H(A08));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC3376J9 enumC3376J9) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(174, 12, 111), C3527Lf.A04(this.A00));
        this.A01.A04(enumC3376J9, hashMap);
    }

    public static void A0J(List<String> cacheDirs, C26937f c26937f) {
        A0K(cacheDirs, C4520bn.A01(c26937f));
        A0K(cacheDirs, C26426d.A07(c26937f));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        String str = strArr[3];
        String path2 = strArr[2];
        if (str.length() != path2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        String path3 = A08(0, 0, 127);
        if (path != path3) {
            String path4 = path.toLowerCase(Locale.getDefault());
            list.add(path4);
        }
    }

    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0N(String str, int i10, int i11) {
        if (this.A08) {
            C224206 A04 = A04(this.A04, str);
            A04.A03 = A08(186, 4, 35);
            A04.A01 = i11;
            A04.A00 = i10;
            return A03(this.A04.A01()).AFH(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i10, i11, A08(170, 4, 114));
    }

    public final File A0O(String str) {
        C224206 A04 = A04(this.A04, str);
        A04.A03 = A08(186, 4, 35);
        return A03(this.A04.A01()).AFI(A04);
    }

    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        C224206 A04 = A04(this.A04, str);
        A04.A03 = A08(186, 4, 35);
        String AFK = A03(this.A04.A01()).AFK(A04);
        return AFK != null ? AFK : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        AbstractC3416Jp.A05(A08(RecognitionOptions.ITF, 19, 68), A08(38, 16, 66), A08(16, 8, 19));
    }

    public final void A0U() {
        AbstractC3416Jp.A05(A08(147, 16, 11), A08(54, 14, 50), A08(0, 8, 64));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(InterfaceC26336U interfaceC26336U, C26346V c26346v) {
        AbstractC3416Jp.A05(A08(163, 7, 25), A08(68, 18, 23), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C26446f.A02(this.A04, c26346v, C26446f.A07, A08(24, 14, 60), -1L);
        ExecutorC3541Lt.A03().execute(new C4342Ys(this, new ArrayList(this.A05), c26346v, interfaceC26336U, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C26376Y c26376y) {
        this.A05.add(new CallableC26386Z(this, c26376y));
    }

    public final void A0Y(C26376Y c26376y) {
        c26376y.A05 = true;
        this.A06.add(new CallableC26386Z(this, c26376y));
    }

    public final void A0Z(C26376Y c26376y) {
        c26376y.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC26366X(this, c26376y));
        } else {
            this.A06.add(new CallableC26386Z(this, c26376y));
        }
    }

    public final void A0a(C26376Y c26376y) {
        if (this.A09) {
            this.A05.add(new CallableC26366X(this, c26376y));
        } else {
            this.A05.add(new CallableC26386Z(this, c26376y));
        }
    }

    public final void A0b(final C26396a c26396a) {
        Callable<Boolean> callable = new Callable<Boolean>(c26396a) { // from class: com.facebook.ads.redexgen.X.6b
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C26396a A00;

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                int i13 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i13 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
                    i13++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c26396a;
            }

            private final Boolean A00() {
                C26937f c26937f;
                boolean z10;
                C26937f c26937f2;
                InterfaceC223600 A032;
                boolean z11;
                boolean z12;
                C26426d c26426d;
                Map map;
                if (AbstractC3447KL.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    C224206 c224206 = new C224206(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    c224206.A01 = this.A00.A04;
                    c224206.A00 = this.A00.A03;
                    c26937f = C26416c.this.A04;
                    if (C26446f.A06(c26937f)) {
                        map = C26416c.A0F;
                        map.put(this.A00.A07, c224206);
                    }
                    z10 = C26416c.this.A08;
                    boolean z13 = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z10) {
                            c26426d = C26416c.this.A03;
                            if (c26426d.A0D(this.A00) != null) {
                                z13 = true;
                            }
                        } else {
                            c26937f2 = C26416c.this.A04;
                            A032 = C26416c.A03(c26937f2.A01());
                            z13 = A032.AFH(c224206, false).A01();
                        }
                        C26476i c26476i = this.A00.A00;
                        if (c26476i != null && c26476i.A02()) {
                            int A00 = c26476i.A00();
                            int A01 = c26476i.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z11 = C26416c.this.A08;
                                if (z11) {
                                    A04(this.A00.A07, c224206);
                                } else {
                                    A03(this.A00.A03, this.A00.A04);
                                }
                            } else {
                                z12 = C26416c.this.A08;
                                if (z12) {
                                    c224206.A00 = A00;
                                    c224206.A01 = A01;
                                    A04(this.A00.A07, c224206);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(z13);
                    }
                    throw new RuntimeException();
                } catch (Throwable th2) {
                    AbstractC3447KL.A00(th2, this);
                    return null;
                }
            }

            private void A03(int i10, int i11) {
                C26426d c26426d;
                C26937f c26937f;
                Map map;
                c26426d = C26416c.this.A03;
                c26937f = C26416c.this.A04;
                Bitmap A0E2 = c26426d.A0E(c26937f, this.A00.A07, i10, i11, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C26416c.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, C224206 c224206) {
                C26937f c26937f;
                InterfaceC223600 A032;
                Map map;
                c26937f = C26416c.this.A04;
                A032 = C26416c.A03(c26937f.A01());
                Bitmap A00 = A032.AFH(c224206, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C26416c.this.A07;
                map.put(str, A00);
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
        };
        if (!c26396a.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C26396a c26396a) {
        c26396a.A02 = true;
        A0b(c26396a);
    }

    public final void A0d(C3377JA c3377ja) {
        this.A01 = c3377ja;
    }
}
