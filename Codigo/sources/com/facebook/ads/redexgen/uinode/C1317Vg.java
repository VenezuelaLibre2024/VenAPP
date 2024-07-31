package com.facebook.ads.redexgen.uinode;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Vg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1317Vg implements HK {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"PZs3vIZtp1syVhF", "iN5G7Jyo65HiG11v5U3JAI3rcjEJu9Fh", "jWadhCo9gqYR1xuZ5eOebDdRLwIuwzoe", "5aVgPmkb9WO9SFxkSTOlcah0CKuDVehn", "Qok3N", "7mg38N8lomez8u4EtBpwlNJo", "Crj8XVI7aaG6XCZYe", "vguL8XPuWTEOQDWRTomV5"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC1319Vi A02;
    public final HS A03;
    public final File A04;
    public final HashMap<String, ArrayList<HJ>> A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        String[] strArr = A08;
        if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        A08[3] = "N0vjWbyGqBS98Run3kOI6tTmnpu8bGoB";
        A07 = new byte[]{67, 108, 109, 118, 106, 103, 112, 34, 81, 107, 111, 114, 110, 103, 65, 99, 97, 106, 103, 34, 107, 108, 113, 118, 99, 108, 97, 103, 34, 119, 113, 103, 113, 34, 118, 106, 103, 34, 100, 109, 110, 102, 103, 112, 56, 34, 48, 10, 14, 19, 15, 6, 32, 2, 0, 11, 6, 121, 67, 71, 90, 70, 79, 105, 75, 73, 66, 79, 4, 67, 68, 67, 94, 67, 75, 70, 67, 80, 79, 2, 3, 96, 71, 92, 65, 90, 93, 84, 19, 90, 93, 87, 86, 75, 19, 85, 90, 95, 86, 19, 85, 82, 90, 95, 86, 87, 20, 22, 20, 31, 18, 19, 40, 20, 24, 25, 3, 18, 25, 3, 40, 30, 25, 19, 18, 15, 89, 18, 15, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized void A4N(File file) throws HI {
        AbstractC0955Ha.A04(!this.A01);
        C1316Vf A00 = C1316Vf.A00(file, this.A03);
        AbstractC0955Ha.A04(A00 != null);
        HR A092 = this.A03.A09(A00.A04);
        AbstractC0955Ha.A01(A092);
        AbstractC0955Ha.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = HV.A00(A092.A05());
            if (A002 != -1) {
                AbstractC0955Ha.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized NavigableSet<HO> A6H(String str) {
        HR A092;
        AbstractC0955Ha.A04(!this.A01);
        A092 = this.A03.A09(str);
        return (A092 == null || A092.A0C()) ? new TreeSet() : new TreeSet((Collection) A092.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C1317Vg(File file, InterfaceC1319Vi interfaceC1319Vi) {
        this(file, interfaceC1319Vi, null, false);
    }

    public C1317Vg(File file, InterfaceC1319Vi interfaceC1319Vi, HS hs) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC1319Vi;
            this.A03 = hs;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new HX(this, A03(57, 24, 112), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 88) + file);
    }

    public C1317Vg(File file, InterfaceC1319Vi interfaceC1319Vi, byte[] bArr, boolean z10) {
        this(file, interfaceC1319Vi, new HS(file, bArr, z10));
    }

    private C1316Vf A00(String str, long j10) throws HI {
        C1316Vf span;
        HR A092 = this.A03.A09(str);
        if (A092 == null) {
            C1316Vf A02 = C1316Vf.A02(str, j10);
            if (A08[7].length() == 15) {
                throw new RuntimeException();
            }
            A08[3] = "R7TEvDOiyk4OKBf9PsOT39P5pIR22NMD";
            return A02;
        }
        while (true) {
            span = A092.A06(j10);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.HK
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C1316Vf AGV(String str, long j10) throws InterruptedException, HI {
        C1316Vf span;
        while (true) {
            span = AGW(str, j10);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.HK
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C1316Vf AGW(String str, long j10) throws HI {
        AbstractC0955Ha.A04(!this.A01);
        C1316Vf A00 = A00(str, j10);
        if (A00.A05) {
            C1316Vf cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        HR A0A = this.A03.A0A(str);
        if (A0A.A0D()) {
            return null;
        }
        A0A.A0B(true);
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 45))) {
                C1316Vf A00 = file.length() > 0 ? C1316Vf.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (HI e10) {
            Log.e(A03(46, 11, 57), A03(81, 25, 105), e10);
        }
    }

    private void A05() throws HI {
        ArrayList arrayList = new ArrayList();
        Iterator<HR> it = this.A03.A0D().iterator();
        while (it.hasNext()) {
            Iterator<C1316Vf> it2 = it.next().A08().iterator();
            while (it2.hasNext()) {
                C1316Vf next = it2.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            A08((HO) arrayList.get(i10), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(HO ho) {
        ArrayList<HJ> arrayList = this.A05.get(ho.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADC(this, ho);
            }
        }
        this.A02.ADC(this, ho);
    }

    private void A08(HO ho, boolean z10) throws HI {
        HR A092 = this.A03.A09(ho.A04);
        if (A092 == null || !A092.A0E(ho)) {
            return;
        }
        this.A00 -= ho.A01;
        if (z10) {
            try {
                this.A03.A0H(A092.A03);
                this.A03.A0G();
            } finally {
                A07(ho);
            }
        }
    }

    private void A0A(C1316Vf c1316Vf) {
        this.A03.A0A(c1316Vf.A04).A09(c1316Vf);
        this.A00 += c1316Vf.A01;
        A0B(c1316Vf);
    }

    private void A0B(C1316Vf c1316Vf) {
        ArrayList<HJ> arrayList = this.A05.get(c1316Vf.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADB(this, c1316Vf);
            }
        }
        this.A02.ADB(this, c1316Vf);
    }

    private void A0C(C1316Vf c1316Vf, HO ho) {
        ArrayList<HJ> arrayList = this.A05.get(c1316Vf.A04);
        if (arrayList != null) {
            int size = arrayList.size();
            String[] strArr = A08;
            if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YjLi8Ea68WiaTq3";
            strArr2[4] = "ACi8R";
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADD(this, c1316Vf, ho);
            }
        }
        this.A02.ADD(this, c1316Vf, ho);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C1317Vg.class) {
            if (A06) {
                return true;
            }
            return A09.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized void A3a(String str, HW hw) throws HI {
        AbstractC0955Ha.A04(!this.A01);
        this.A03.A0I(str, hw);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized long A6F() {
        AbstractC0955Ha.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized long A6G(String str, long j10, long j11) {
        HR cachedContent;
        AbstractC0955Ha.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized long A6W(String str) {
        return HV.A00(A6X(str));
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized HU A6X(String str) {
        AbstractC0955Ha.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized void AEZ(HO ho) {
        AbstractC0955Ha.A04(!this.A01);
        HR A092 = this.A03.A09(ho.A04);
        AbstractC0955Ha.A01(A092);
        AbstractC0955Ha.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized void AF9(HO ho) throws HI {
        AbstractC0955Ha.A04(!this.A01);
        A08(ho, true);
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized void AFx(String str, long j10) throws HI {
        HW mutations = new HW();
        HV.A05(mutations, j10);
        A3a(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.uinode.HK
    public final synchronized File AGT(String str, long j10, long j11) throws HI {
        HR A092;
        AbstractC0955Ha.A04(!this.A01);
        A092 = this.A03.A09(str);
        AbstractC0955Ha.A01(A092);
        AbstractC0955Ha.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ADE(this, str, j10, j11);
        return C1316Vf.A04(this.A04, A092.A02, j10, System.currentTimeMillis());
    }
}
