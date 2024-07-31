package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3G */
/* loaded from: assets/audience_network.dex */
public final class C24363G extends AbstractC26486j implements InterfaceC3297Hq {
    public static byte[] A0E;
    public static String[] A0F = {"2QlMa6qwn7PgdSN4l85jvs7nWajl1MES", "7IDLWOxlh1sFSIB31zRzFYQ7PMnWp72Y", "sIqK", "BoflpFUQeBwwM6pd17Qd", "rQg4TubfQMsXj8fsx3Kc9qFAo71Wl6cI", "0mBM", "Xb0wUTlMwSXhcbJOEuklFsawZUYnk", "6gVYRFlBQUgMJoz7eJC1LBuasB8Ybt5d"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C2880Ai A0C;
    public final InterfaceC2886Ao A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{37, 39, 50, 68, 57, 47, 41, 68, 11, 11, 9, 68, 14, 15, 9, 6, 4, 17, 103, 46, 38, 38, 46, 37, 44, 103, 59, 40, 62, 103, 45, 44, 42, 38, 45, 44, 59, 111, 96, 106, 124, 97, 103, 106, 32, 125, 97, 104, 122, 121, 111, 124, 107, 32, 98, 107, 111, 96, 108, 111, 109, 101, 108, 120, 105, 100, 98, 34, Byte.MAX_VALUE, 108, 122, 61, 54, 63, 48, 48, 59, 50, 115, 61, 49, 43, 48, 42, 59, 54, 33, 60, 63, 39, 54, 13, 0, 23, 10, 20, 9, 17, 0, 82, 94, 71, 18, 86, 81, 79, 74, 75, 18, 76, 86, 69, 90, 3, 7, 3, 11, 47, 45, 54, 48, 45, 54, 43, 38, 125, 111, 99, 126, 98, 107, 35, 124, 111, 122, 107, 29, 15, 3, 29, 27, 0, 9, 72, 87, 64, 93, 84, 94, 70, 87};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C24363G(Context context, InterfaceC3031DM interfaceC3031DM, InterfaceC2934Bc<FrameworkMediaCrypto> interfaceC2934Bc, boolean z10, Handler handler, InterfaceC2881Aj interfaceC2881Aj, C2866AU c2866au, InterfaceC2873Ab... interfaceC2873AbArr) {
        this(context, interfaceC3031DM, interfaceC2934Bc, z10, handler, interfaceC2881Aj, new C4286Xy(c2866au, interfaceC2873AbArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C24363G(Context context, InterfaceC3031DM interfaceC3031DM, InterfaceC2934Bc<FrameworkMediaCrypto> interfaceC2934Bc, boolean z10, Handler handler, InterfaceC2881Aj interfaceC2881Aj, InterfaceC2886Ao interfaceC2886Ao) {
        super(1, interfaceC3031DM, interfaceC2934Bc, z10);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC2886Ao;
        this.A0C = new C2880Ai(handler, interfaceC2881Aj);
        interfaceC2886Ao.AG4(new C4284Xw(this));
    }

    private int A00(C3029DG c3029dg, Format format) {
        PackageManager packageManager;
        if (AbstractC3322IF.A02 < 24 && A04(15, 22, 10).equals(c3029dg.A02)) {
            boolean z10 = true;
            if (AbstractC3322IF.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 77));
                if (needsRawDecoderWorkaround) {
                    z10 = false;
                }
            }
            if (z10) {
                return -1;
            }
        }
        return format.A09;
    }

    private final int A01(C3029DG c3029dg, Format format, Format[] formatArr) {
        int maxInputSize = A00(c3029dg, format);
        return maxInputSize;
    }

    private final MediaFormat A02(Format format, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 45), str);
        mediaFormat.setInteger(A04(71, 13, 29), format.A05);
        mediaFormat.setInteger(A04(125, 11, 77), format.A0C);
        AbstractC3037DS.A06(mediaFormat, format.A0P);
        AbstractC3037DS.A04(mediaFormat, A04(99, 14, 124), i10);
        if (AbstractC3322IF.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 28), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A6e = this.A0D.A6e(A91());
        if (A6e != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                A6e = Math.max(newCurrentPositionUs, A6e);
            }
            this.A05 = A6e;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (AbstractC3322IF.A02 < 24 && A04(0, 15, 41).equals(str)) {
            if (A04(136, 7, 45).equals(AbstractC3322IF.A05)) {
                if (!AbstractC3322IF.A03.startsWith(A04(143, 8, 113)) && !AbstractC3322IF.A03.startsWith(A04(84, 7, 16))) {
                    boolean startsWith = AbstractC3322IF.A03.startsWith(A04(91, 8, 38));
                    if (A0F[0].charAt(11) == 'E') {
                        throw new RuntimeException();
                    }
                    A0F[7] = "opGrTNmI0QvRBzLgsKXfoISibxDPDheH";
                    if (startsWith) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = AbstractC3299Hs.A00(str);
        return A00 != 0 && this.A0D.A90(A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A13() {
        super.A13();
        this.A0D.AE2();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A15() {
        try {
            this.A0D.AEV();
            try {
                super.A15();
                this.A0U.A00();
                this.A0C.A04(this.A0U);
                String[] strArr = A0F;
                if (strArr[5].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0F[0] = "oD9vMZ2y7vvHJ8P8Vn8jWHJMMQFHYWzQ";
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.A15();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A16(long j10, boolean z10) throws C28139c {
        super.A16(j10, z10);
        this.A0D.reset();
        this.A05 = j10;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A17(boolean z10) throws C28139c {
        super.A17(z10);
        this.A0C.A05(this.A0U);
        int i10 = A12().A00;
        if (i10 != 0) {
            this.A0D.A5W(i10);
        } else {
            this.A0D.A59();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final int A1B(MediaCodec mediaCodec, C3029DG c3029dg, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r6 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        r1 = r17.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r5.A0G(r1) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        r1 = r17.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        if (r1 == r0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r5.A0F(r17.A05) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r6 != (-1)) goto L115;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1C(com.facebook.ads.redexgen.uinode.InterfaceC3031DM r15, com.facebook.ads.redexgen.uinode.InterfaceC2934Bc<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r16, com.facebook.ads.internal.exoplayer2.thirdparty.Format r17) throws com.facebook.ads.redexgen.uinode.C3034DP {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C24363G.A1C(com.facebook.ads.redexgen.X.DM, com.facebook.ads.redexgen.X.Bc, com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final C3029DG A1F(InterfaceC3031DM interfaceC3031DM, Format format, boolean z10) throws C3034DP {
        C3029DG passthroughDecoderInfo;
        if (A09(format.A0O) && (passthroughDecoderInfo = interfaceC3031DM.A7c()) != null) {
            return passthroughDecoderInfo;
        }
        return super.A1F(interfaceC3031DM, format, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final void A1I() throws C28139c {
        try {
            this.A0D.AE3();
        } catch (C2885An e10) {
            throw C28139c.A01(e10, A0z());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x006a */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1L(android.media.MediaCodec r11, android.media.MediaFormat r12) throws com.facebook.ads.redexgen.uinode.C28139c {
        /*
            r10 = this;
            android.media.MediaFormat r3 = r10.A06
            if (r3 == 0) goto L29
            r2 = 113(0x71, float:1.58E-43)
            r1 = 4
            r0 = 45
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r3 = r3.getString(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C24363G.A0F
            r0 = 5
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            int r3 = r10.A04
            goto L3e
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C24363G.A0F
            java.lang.String r1 = "rkxX"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "9ODr"
            r0 = 2
            r2[r0] = r1
            int r3 = com.facebook.ads.redexgen.uinode.AbstractC3299Hs.A00(r3)
            android.media.MediaFormat r12 = r10.A06
        L3e:
            r2 = 71
            r1 = 13
            r0 = 29
            java.lang.String r0 = A04(r2, r1, r0)
            int r4 = r12.getInteger(r0)
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 11
            r0 = 77
            java.lang.String r0 = A04(r2, r1, r0)
            int r5 = r12.getInteger(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L71
            r1 = 6
            if (r4 != r1) goto L71
            int r0 = r10.A00
            if (r0 >= r1) goto L71
            int[] r7 = new int[r0]
            r1 = 0
        L68:
            int r0 = r10.A00
            if (r1 >= r0) goto L72
            r7[r1] = r1
            int r1 = r1 + 1
            goto L68
        L71:
            r7 = 0
        L72:
            com.facebook.ads.redexgen.X.Ao r2 = r10.A0D     // Catch: com.facebook.ads.redexgen.uinode.C2882Ak -> L7d
            r6 = 0
            int r8 = r10.A02     // Catch: com.facebook.ads.redexgen.uinode.C2882Ak -> L7d
            int r9 = r10.A03     // Catch: com.facebook.ads.redexgen.uinode.C2882Ak -> L7d
            r2.A4P(r3, r4, r5, r6, r7, r8, r9)     // Catch: com.facebook.ads.redexgen.uinode.C2882Ak -> L7d
            return
        L7d:
            r1 = move-exception
            int r0 = r10.A0z()
            com.facebook.ads.redexgen.X.9c r0 = com.facebook.ads.redexgen.uinode.C28139c.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C24363G.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final void A1M(Format format) throws C28139c {
        int i10;
        super.A1M(format);
        this.A0C.A03(format);
        if (A04(62, 9, 78).equals(format.A0O)) {
            i10 = format.A0A;
        } else {
            i10 = 2;
        }
        this.A04 = i10;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final void A1N(C4279Xr c4279Xr) {
        if (this.A07 && !c4279Xr.A03()) {
            if (Math.abs(c4279Xr.A00 - this.A05) > 500000) {
                this.A05 = c4279Xr.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final void A1O(C3029DG c3029dg, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c3029dg, format, A1A());
        this.A09 = A08(c3029dg.A02);
        this.A0A = c3029dg.A04;
        MediaFormat A02 = A02(format, c3029dg.A01 == null ? A04(62, 9, 78) : c3029dg.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            String A04 = A04(113, 4, 45);
            String codecMimeType = format.A0O;
            A02.setString(A04, codecMimeType);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final void A1P(String str, long j10, long j11) {
        this.A0C.A06(str, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j
    public final boolean A1Q(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws C28139c {
        if (this.A0A && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A08++;
            this.A0D.A8U();
            return true;
        }
        try {
            if (!this.A0D.A8R(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A06++;
            return true;
        } catch (C2883Al | C2885An e10) {
            throw C28139c.A01(e10, A0z());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3085EM, com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final InterfaceC3297Hq A7N() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final C28339x A7h() {
        return this.A0D.A7h();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final long A7k() {
        if (A81() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3085EM, com.facebook.ads.redexgen.uinode.InterfaceC2843A7
    public final void A8V(int i10, Object obj) throws C28139c {
        switch (i10) {
            case 2:
                this.A0D.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0D.AFs((C2865AT) obj);
                return;
            default:
                super.A8V(i10, obj);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final boolean A91() {
        return super.A91() && this.A0D.A91();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC26486j, com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final boolean A9C() {
        return this.A0D.A8Z() || super.A9C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3297Hq
    public final C28339x AGA(C28339x c28339x) {
        return this.A0D.AGA(c28339x);
    }
}
