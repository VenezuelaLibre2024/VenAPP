package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CD implements WP, InterfaceC0839Bu, H6<WT>, H9, FA {
    public static byte[] A0c;
    public static String[] A0d = {"uM3", "HhtEoeszujhq2hqW803X6wAUFNr2yIvk", "llgRlYE2HHrDKVr9Tlv1gg4sawaKL", "gd26Zevc0BeMQVnsPvgEWj4kMHitbDqE", "B56DgxYfwXnRdFUWoxgY8ZwWxUmrPQlR", "o6X9hbG4Io42IRbcZylLcsRNIhbJFPRA", "SBfu1SOz9uKNnyoy8", "5PtJb97AhuhjIJJCziWFyl83Esr9CMYA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C1 A07;
    public WQ A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final C0891Ek A0S;
    public final InterfaceC0892El A0T;
    public final F1 A0U;
    public final InterfaceC0942Gm A0V;
    public final InterfaceC0950Gu A0W;
    public final String A0b;
    public final C1327Vq A0X = new C1327Vq(A07(0, 27, 27));
    public final C0961Hg A0Y = new C0961Hg();
    public final Runnable A0Z = new RunnableC0889Ei(this);
    public final Runnable A0a = new RunnableC0890Ej(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public WO[] A0K = new WO[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{78, 109, 99, 102, 103, 112, 56, 71, 122, 118, 112, 99, 97, 118, 109, 112, 79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AFm(InterfaceC0936Gg[] interfaceC0936GgArr, boolean[] zArr, FB[] fbArr, boolean[] zArr2, long j10) {
        int i10;
        AbstractC0955Ha.A04(this.A0F);
        int i11 = this.A01;
        int i12 = 0;
        while (true) {
            int i13 = 0;
            if (i12 >= interfaceC0936GgArr.length) {
                boolean z10 = !this.A0I ? j10 == 0 : i11 != 0;
                for (int i14 = 0; i14 < interfaceC0936GgArr.length; i14++) {
                    if (fbArr[i14] == null && interfaceC0936GgArr[i14] != null) {
                        InterfaceC0936Gg interfaceC0936Gg = interfaceC0936GgArr[i14];
                        AbstractC0955Ha.A04(interfaceC0936Gg.length() == 1);
                        AbstractC0955Ha.A04(interfaceC0936Gg.A7C(0) == 0);
                        int A00 = this.A09.A00(interfaceC0936Gg.A8A());
                        AbstractC0955Ha.A04(!this.A0L[A00]);
                        this.A01++;
                        this.A0L[A00] = true;
                        fbArr[i14] = new WS(this, A00);
                        zArr2[i14] = true;
                        if (!z10) {
                            WO wo = this.A0K[A00];
                            wo.A0J();
                            z10 = wo.A0D(j10, true, true) == -1 && wo.A0B() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    if (this.A0X.A08()) {
                        WO[] woArr = this.A0K;
                        int length = woArr.length;
                        while (i13 < length) {
                            woArr[i13].A0H();
                            i13++;
                        }
                        this.A0X.A05();
                    } else {
                        WO[] woArr2 = this.A0K;
                        int length2 = woArr2.length;
                        while (i13 < length2) {
                            woArr2[i13].A0I();
                            i13++;
                        }
                    }
                } else if (z10) {
                    j10 = AFl(j10);
                    for (int i15 = 0; i15 < fbArr.length; i15++) {
                        if (fbArr[i15] != null) {
                            zArr2[i15] = true;
                        }
                    }
                }
                this.A0I = true;
                return j10;
            }
            FB fb2 = fbArr[i12];
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            A0d[2] = "mg4ta7ka0nUwB4FGZ9fOP";
            if (fb2 != null && (interfaceC0936GgArr[i12] == null || !zArr[i12])) {
                i10 = ((WS) fbArr[i12]).A00;
                AbstractC0955Ha.A04(this.A0L[i10]);
                this.A01--;
                this.A0L[i10] = false;
                fbArr[i12] = null;
            }
            i12++;
        }
    }

    static {
        A0B();
    }

    public CD(Uri uri, InterfaceC0950Gu interfaceC0950Gu, InterfaceC0837Bs[] interfaceC0837BsArr, int i10, F1 f12, InterfaceC0892El interfaceC0892El, InterfaceC0942Gm interfaceC0942Gm, String str, int i11) {
        this.A0Q = uri;
        this.A0W = interfaceC0950Gu;
        this.A0O = i10;
        this.A0U = f12;
        this.A0T = interfaceC0892El;
        this.A0V = interfaceC0942Gm;
        this.A0b = str;
        this.A0P = i11;
        this.A0S = new C0891Ek(interfaceC0837BsArr, this);
        this.A00 = i10 == -1 ? 3 : i10;
        f12.A03();
    }

    private int A00() {
        int i10 = 0;
        for (WO wo : this.A0K) {
            int extractedSamplesCount = wo.A0C();
            i10 += extractedSamplesCount;
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.H6
    /* renamed from: A01 */
    public final int AC2(WT wt, long j10, long j11, IOException iOException) {
        C0954Gy c0954Gy;
        long j12;
        long j13;
        boolean isErrorFatal = A0N(iOException);
        F1 f12 = this.A0U;
        c0954Gy = wt.A03;
        j12 = wt.A02;
        long j14 = this.A03;
        j13 = wt.A00;
        f12.A0H(c0954Gy, 1, -1, null, 0, null, j12, j14, j10, j11, j13, iOException, isErrorFatal);
        A0E(wt);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(wt, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j10 = Long.MIN_VALUE;
        for (WO wo : this.A0K) {
            long largestQueuedTimestampUs = wo.A0F();
            j10 = Math.max(j10, largestQueuedTimestampUs);
        }
        return j10;
    }

    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (WO wo : this.A0K) {
            if (wo.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6r();
        int i10 = 0;
        while (true) {
            boolean isAudioVideo = true;
            if (i10 >= length) {
                break;
            }
            Format A0G = this.A0K[i10].A0G();
            trackGroupArr[i10] = new TrackGroup(A0G);
            String str = A0G.A0O;
            if (!AbstractC0973Hs.A0B(str) && !AbstractC0973Hs.A09(str)) {
                isAudioVideo = false;
            }
            this.A0N[i10] = isAudioVideo;
            this.A0A |= isAudioVideo;
            i10++;
        }
        this.A09 = new TrackGroupArray(trackGroupArr);
        if (this.A0O == -1 && this.A05 == -1 && this.A07.A6r() == -9223372036854775807L) {
            String[] strArr = A0d;
            String str2 = strArr[4];
            String str3 = strArr[5];
            int charAt = str2.charAt(19);
            int trackCount = str3.charAt(19);
            if (charAt == trackCount) {
                throw new RuntimeException();
            }
            A0d[2] = "7a3gC0RfnKvRSexgB6r2d4KLSEZ";
            this.A00 = 6;
        }
        this.A0F = true;
        this.A0T.AD9(this.A03, this.A07.A9I());
        this.A08.ACj(this);
    }

    private void A0A() {
        C0954Gy c0954Gy;
        long j10;
        WT wt = new WT(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            AbstractC0955Ha.A04(A0I());
            long j11 = this.A03;
            if (j11 != -9223372036854775807L && this.A06 >= j11) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            } else {
                wt.A04(this.A07.A7t(this.A06).A00.A00, this.A06);
                this.A06 = -9223372036854775807L;
            }
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(wt, this, this.A00);
        F1 f12 = this.A0U;
        c0954Gy = wt.A03;
        j10 = wt.A02;
        f12.A0E(c0954Gy, 1, -1, null, 0, null, j10, this.A03, A04);
    }

    private void A0C(int i10) {
        if (!this.A0M[i10]) {
            Format A01 = this.A09.A01(i10).A01(0);
            this.A0U.A06(AbstractC0973Hs.A01(A01.A0O), A01, 0, null, this.A04);
            boolean[] zArr = this.A0M;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            A0d[2] = "eh27oOHcwVOmHzYfi8kDTS";
            zArr[i10] = true;
        }
    }

    private void A0D(int i10) {
        if (this.A0E && this.A0N[i10] && !this.A0K[i10].A0M()) {
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "sgNFiq5UDquEcD4Be";
            strArr2[0] = "0a9";
            this.A06 = 0L;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (WO wo : this.A0K) {
                wo.A0I();
            }
            this.A08.ABC(this);
        }
    }

    private void A0E(WT wt) {
        long j10;
        if (this.A05 != -1) {
            return;
        }
        j10 = wt.A01;
        this.A05 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.H6
    /* renamed from: A0F */
    public final void AC1(WT wt, long j10, long j11) {
        C0954Gy c0954Gy;
        long j12;
        long j13;
        long j14;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j14 = 0;
            } else {
                j14 = 10000 + A02;
            }
            this.A03 = j14;
            this.A0T.AD9(j14, this.A07.A9I());
        }
        F1 f12 = this.A0U;
        c0954Gy = wt.A03;
        j12 = wt.A02;
        long j15 = this.A03;
        j13 = wt.A00;
        f12.A0G(c0954Gy, 1, -1, null, 0, null, j12, j15, j10, j11, j13);
        A0E(wt);
        this.A0B = true;
        this.A08.ABC(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.H6
    /* renamed from: A0G */
    public final void ABz(WT wt, long j10, long j11, boolean z10) {
        C0954Gy c0954Gy;
        long j12;
        long j13;
        F1 f12 = this.A0U;
        c0954Gy = wt.A03;
        j12 = wt.A02;
        long j14 = this.A03;
        j13 = wt.A00;
        f12.A0F(c0954Gy, 1, -1, null, 0, null, j12, j14, j10, j11, j13);
        if (!z10) {
            A0E(wt);
            for (WO wo : this.A0K) {
                wo.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABC(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j10) {
        int length = this.A0K.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return true;
            }
            WO wo = this.A0K[i10];
            wo.A0J();
            int i11 = wo.A0D(j10, true, false);
            boolean seekInsideQueue = i11 != -1;
            if (!seekInsideQueue) {
                if (this.A0N[i10]) {
                    break;
                }
                boolean z10 = this.A0A;
                String[] strArr = A0d;
                String str = strArr[4];
                String str2 = strArr[5];
                int i12 = str.charAt(19);
                int trackCount = str2.charAt(19);
                if (i12 == trackCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0d;
                strArr2[7] = "iCn5X7g6PoYVWCe4GwpQYWYt9drfTGBT";
                strArr2[1] = "IDd3eJ2NBG0wgz78gdspZyWtrcrofueQ";
                if (!z10) {
                    break;
                }
            }
            i10++;
        }
        return false;
    }

    private boolean A0L(WT wt, int i10) {
        C1 c12;
        if (this.A05 != -1 || ((c12 = this.A07) != null && c12.A6r() != -9223372036854775807L)) {
            this.A02 = i10;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "F1SGTXFlfQdsRtCv2";
            strArr[0] = "c29";
            return true;
        }
        if (this.A0F && !A0J()) {
            this.A0E = true;
            return false;
        }
        this.A0D = this.A0F;
        this.A04 = 0L;
        this.A02 = 0;
        for (WO wo : this.A0K) {
            wo.A0I();
        }
        wt.A04(0L, 0L);
        return true;
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof WM;
    }

    public final int A0O(int i10, long j10) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        WO wo = this.A0K[i10];
        if (this.A0B && j10 > wo.A0F()) {
            A0D = wo.A0A();
        } else {
            A0D = wo.A0D(j10, true, true);
            String[] strArr = A0d;
            String str = strArr[4];
            String str2 = strArr[5];
            int skipCount = str.charAt(19);
            if (skipCount == str2.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "NIYG9FQCzFZSe10IE";
            strArr2[0] = "6cN";
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(i10);
        } else {
            A0D(i10);
        }
        return A0D;
    }

    public final int A0P(int i10, C07829p c07829p, C1377Xr c1377Xr, boolean z10) {
        if (A0J()) {
            return -3;
        }
        int A0E = this.A0K[i10].A0E(c07829p, c1377Xr, z10, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i10);
        } else if (A0E == -3) {
            A0D(i10);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (WO wo : this.A0K) {
                wo.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i10) {
        return !A0J() && (this.A0B || this.A0K[i10].A0M());
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final boolean A4T(long j10) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void A5A(long j10, boolean z10) {
        int length = this.A0K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A0K[i10].A0K(j10, z10, this.A0L[i10]);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0839Bu
    public final void A5Y() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A5x(long j10, AD ad2) {
        if (!this.A07.A9I()) {
            return 0L;
        }
        C0 A7t = this.A07.A7t(j10);
        return IF.A0I(j10, ad2, A7t.A00.A01, A7t.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A6D() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j10 = this.A06;
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A0d[3] = "ld4wWqv9tK9nTvU7QEEl8vpde5wWqGSi";
            return j10;
        }
        if (this.A0A) {
            A02 = Long.MAX_VALUE;
            int i10 = this.A0K.length;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.A0N[i11]) {
                    A02 = Math.min(A02, this.A0K[i11].A0F());
                }
            }
        } else {
            A02 = A02();
        }
        if (A02 == Long.MIN_VALUE) {
            return this.A04;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A7U() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6D();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final TrackGroupArray A8B() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AAN() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.uinode.H9
    public final void AC6() {
        for (WO wo : this.A0K) {
            wo.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.FA
    public final void ADS(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AE4(WQ wq, long j10) {
        this.A08 = wq;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AEL() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        boolean z10 = this.A0D;
        String[] strArr = A0d;
        if (strArr[6].length() != strArr[0].length()) {
            A0d[2] = "";
            if (z10 && (this.A0B || A00() > this.A02)) {
                this.A0D = false;
                return this.A04;
            }
            String[] strArr2 = A0d;
            if (strArr2[7].charAt(26) == strArr2[1].charAt(26)) {
                String[] strArr3 = A0d;
                strArr3[4] = "a8TiTKBNhx8jXxPRrcAgh1BUcIw96G2f";
                strArr3[5] = "NHpS1UqcJuZi4hHtySMRiLK65X8yfSYb";
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AER(long j10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0839Bu
    public final void AFi(C1 c12) {
        this.A07 = c12;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AFl(long j10) {
        if (!this.A07.A9I()) {
            j10 = 0;
        }
        this.A04 = j10;
        this.A0D = false;
        if (!A0I()) {
            boolean A0K = A0K(j10);
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "4t4h1X84Q9aXzP6i3O1IFqP61fZwJyic";
            strArr2[5] = "YchhDxV7HDCpyjRy2lVbypcIuIxdt4SR";
            if (A0K) {
                return j10;
            }
        }
        this.A0E = false;
        this.A06 = j10;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (WO wo : this.A0K) {
                wo.A0I();
            }
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0839Bu
    public final C4 AGi(int i10, int i11) {
        int length = this.A0K.length;
        for (int i12 = 0; i12 < length; i12++) {
            int trackCount = this.A0J[i12];
            if (trackCount == i10) {
                return this.A0K[i12];
            }
        }
        WO wo = new WO(this.A0V);
        wo.A0L(this);
        int trackCount2 = length + 1;
        int[] copyOf = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J = copyOf;
        copyOf[length] = i10;
        int trackCount3 = length + 1;
        WO[] woArr = (WO[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K = woArr;
        woArr[length] = wo;
        return wo;
    }
}
