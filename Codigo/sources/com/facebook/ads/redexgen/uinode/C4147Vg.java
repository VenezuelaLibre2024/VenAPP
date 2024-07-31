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

/* renamed from: com.facebook.ads.redexgen.X.Vg */
/* loaded from: assets/audience_network.dex */
public final class C4147Vg implements InterfaceC3265HK {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"PZs3vIZtp1syVhF", "iN5G7Jyo65HiG11v5U3JAI3rcjEJu9Fh", "jWadhCo9gqYR1xuZ5eOebDdRLwIuwzoe", "5aVgPmkb9WO9SFxkSTOlcah0CKuDVehn", "Qok3N", "7mg38N8lomez8u4EtBpwlNJo", "Crj8XVI7aaG6XCZYe", "vguL8XPuWTEOQDWRTomV5"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC4149Vi A02;
    public final C3273HS A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC3264HJ>> A05;

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
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized void A4N(File file) throws C3263HI {
        AbstractC3281Ha.A04(!this.A01);
        C4146Vf A00 = C4146Vf.A00(file, this.A03);
        AbstractC3281Ha.A04(A00 != null);
        C3272HR A092 = this.A03.A09(A00.A04);
        AbstractC3281Ha.A01(A092);
        AbstractC3281Ha.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = AbstractC3276HV.A00(A092.A05());
            if (A002 != -1) {
                AbstractC3281Ha.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized NavigableSet<C3269HO> A6H(String str) {
        C3272HR A092;
        AbstractC3281Ha.A04(!this.A01);
        A092 = this.A03.A09(str);
        return (A092 == null || A092.A0C()) ? new TreeSet() : new TreeSet((Collection) A092.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C4147Vg(File file, InterfaceC4149Vi interfaceC4149Vi) {
        this(file, interfaceC4149Vi, null, false);
    }

    public C4147Vg(File file, InterfaceC4149Vi interfaceC4149Vi, C3273HS c3273hs) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC4149Vi;
            this.A03 = c3273hs;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new C3278HX(this, A03(57, 24, 112), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 88) + file);
    }

    public C4147Vg(File file, InterfaceC4149Vi interfaceC4149Vi, byte[] bArr, boolean z10) {
        this(file, interfaceC4149Vi, new C3273HS(file, bArr, z10));
    }

    private C4146Vf A00(String str, long j10) throws C3263HI {
        C4146Vf span;
        C3272HR A092 = this.A03.A09(str);
        if (A092 == null) {
            C4146Vf A02 = C4146Vf.A02(str, j10);
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
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C4146Vf AGV(String str, long j10) throws InterruptedException, C3263HI {
        C4146Vf span;
        while (true) {
            span = AGW(str, j10);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C4146Vf AGW(String str, long j10) throws C3263HI {
        AbstractC3281Ha.A04(!this.A01);
        C4146Vf A00 = A00(str, j10);
        if (A00.A05) {
            C4146Vf cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        C3272HR A0A = this.A03.A0A(str);
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
                C4146Vf A00 = file.length() > 0 ? C4146Vf.A00(file, this.A03) : null;
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
        } catch (C3263HI e10) {
            Log.e(A03(46, 11, 57), A03(81, 25, 105), e10);
        }
    }

    private void A05() throws C3263HI {
        ArrayList arrayList = new ArrayList();
        Iterator<C3272HR> it = this.A03.A0D().iterator();
        while (it.hasNext()) {
            Iterator<C4146Vf> it2 = it.next().A08().iterator();
            while (it2.hasNext()) {
                C4146Vf next = it2.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            A08((C3269HO) arrayList.get(i10), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(C3269HO c3269ho) {
        ArrayList<InterfaceC3264HJ> arrayList = this.A05.get(c3269ho.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADC(this, c3269ho);
            }
        }
        this.A02.ADC(this, c3269ho);
    }

    private void A08(C3269HO c3269ho, boolean z10) throws C3263HI {
        C3272HR A092 = this.A03.A09(c3269ho.A04);
        if (A092 == null || !A092.A0E(c3269ho)) {
            return;
        }
        this.A00 -= c3269ho.A01;
        if (z10) {
            try {
                this.A03.A0H(A092.A03);
                this.A03.A0G();
            } finally {
                A07(c3269ho);
            }
        }
    }

    private void A0A(C4146Vf c4146Vf) {
        this.A03.A0A(c4146Vf.A04).A09(c4146Vf);
        this.A00 += c4146Vf.A01;
        A0B(c4146Vf);
    }

    private void A0B(C4146Vf c4146Vf) {
        ArrayList<InterfaceC3264HJ> arrayList = this.A05.get(c4146Vf.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADB(this, c4146Vf);
            }
        }
        this.A02.ADB(this, c4146Vf);
    }

    private void A0C(C4146Vf c4146Vf, C3269HO c3269ho) {
        ArrayList<InterfaceC3264HJ> arrayList = this.A05.get(c4146Vf.A04);
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
                arrayList.get(i10).ADD(this, c4146Vf, c3269ho);
            }
        }
        this.A02.ADD(this, c4146Vf, c3269ho);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C4147Vg.class) {
            if (A06) {
                return true;
            }
            return A09.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized void A3a(String str, C3277HW c3277hw) throws C3263HI {
        AbstractC3281Ha.A04(!this.A01);
        this.A03.A0I(str, c3277hw);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized long A6F() {
        AbstractC3281Ha.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized long A6G(String str, long j10, long j11) {
        C3272HR cachedContent;
        AbstractC3281Ha.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized long A6W(String str) {
        return AbstractC3276HV.A00(A6X(str));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized InterfaceC3275HU A6X(String str) {
        AbstractC3281Ha.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized void AEZ(C3269HO c3269ho) {
        AbstractC3281Ha.A04(!this.A01);
        C3272HR A092 = this.A03.A09(c3269ho.A04);
        AbstractC3281Ha.A01(A092);
        AbstractC3281Ha.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized void AF9(C3269HO c3269ho) throws C3263HI {
        AbstractC3281Ha.A04(!this.A01);
        A08(c3269ho, true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized void AFx(String str, long j10) throws C3263HI {
        C3277HW mutations = new C3277HW();
        AbstractC3276HV.A05(mutations, j10);
        A3a(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3265HK
    public final synchronized File AGT(String str, long j10, long j11) throws C3263HI {
        C3272HR A092;
        AbstractC3281Ha.A04(!this.A01);
        A092 = this.A03.A09(str);
        AbstractC3281Ha.A01(A092);
        AbstractC3281Ha.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ADE(this, str, j10, j11);
        return C4146Vf.A04(this.A04, A092.A02, j10, System.currentTimeMillis());
    }
}
