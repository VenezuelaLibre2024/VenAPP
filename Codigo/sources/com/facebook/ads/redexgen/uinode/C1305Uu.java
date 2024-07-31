package com.facebook.ads.redexgen.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1305Uu extends KT {
    public static byte[] A02;
    public final /* synthetic */ K1 A00;
    public final /* synthetic */ K4 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1399Yn c1399Yn;
        C1399Yn c1399Yn2;
        C1399Yn c1399Yn3;
        C1399Yn c1399Yn4;
        C1399Yn c1399Yn5;
        long j10;
        C1399Yn c1399Yn6;
        String str;
        Map<? extends String, ? extends String> map;
        RL A022;
        C1399Yn c1399Yn7;
        C1399Yn c1399Yn8;
        C1399Yn c1399Yn9;
        C1399Yn c1399Yn10;
        long j11;
        c1399Yn = this.A01.A04;
        if (AbstractC1055Ld.A00(c1399Yn) == EnumC1054Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 92);
            c1399Yn10 = this.A01.A04;
            C0S A0E = c1399Yn10.A0E();
            j11 = this.A01.A00;
            A0E.A2v(C1057Lf.A01(j11), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C1005Jb(adErrorType, A00));
            return;
        }
        c1399Yn2 = this.A01.A04;
        C8J.A08(c1399Yn2);
        c1399Yn3 = this.A01.A04;
        C6E.A07(c1399Yn3);
        C07548l A002 = C07548l.A00();
        c1399Yn4 = this.A01.A04;
        boolean z10 = true;
        Map<String, String> A09 = this.A00.A09(A002.A01(c1399Yn4, true).A6w(this.A00.A05()));
        this.A01.A02 = A09;
        try {
            c1399Yn7 = this.A01.A04;
            PackageManager packageManager = c1399Yn7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 113);
                StringBuilder sb2 = new StringBuilder();
                c1399Yn8 = this.A01.A04;
                StringBuilder append = sb2.append(c1399Yn8.getPackageName()).append(A00(0, 1, 93));
                c1399Yn9 = this.A01.A04;
                A09.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1399Yn9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC1009Jg.A03 && this.A00.A06() != EnumC1009Jg.A05 && this.A00.A06() != EnumC1009Jg.A04 && this.A00.A06() != null) {
                z10 = false;
            }
            c1399Yn6 = this.A01.A04;
            RK A023 = C1210Rc.A02(z10, c1399Yn6);
            str = this.A01.A06;
            RY ry = new RY();
            map = this.A01.A02;
            byte[] A08 = ry.A05(map).A08();
            A022 = this.A01.A02(C1057Lf.A00(), this.A00);
            A023.AE0(str, A08, A022);
        } catch (Exception e10) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e10.getMessage();
            c1399Yn5 = this.A01.A04;
            C0S A0E2 = c1399Yn5.A0E();
            j10 = this.A01.A00;
            A0E2.A2v(C1057Lf.A01(j10), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C1005Jb.A01(adErrorType2, message));
        }
    }

    public C1305Uu(K4 k42, K1 k12) {
        this.A01 = k42;
        this.A00 = k12;
    }
}
