package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ix, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC1002Ix extends Handler {
    public static byte[] A02;
    public static final String A03;
    public final Context A00;
    public final VW A01;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{101, 93, 96, 102, 93, 95, -105, -92, -92, -95, -76, -98, -88, -76, -101, -86, -93, -93, -102, -95, -76, -95, -92, -100, -100, -102, -103, -11, -10, -12, 1, -29, -26, 1, -21, -26, 1, -19, -25, -5, -118, -117, -119, -106, -118, 124, -119, -115, Byte.MIN_VALUE, 122, 124, -106, 124, -113, -117, -119, 120, -118, -59, -58, -60, -47, -59, -73, -60, -56, -69, -75, -73, -47, -59, -74, -67, -47, -56, -73, -60, -59, -69, -63, -64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PackageManager packageManager;
        if (KL.A02(this)) {
            return;
        }
        try {
            Messenger messenger = message.replyTo;
            if (message.what == 1) {
                if (messenger != null) {
                    VW.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String string = message.getData().getString(A03(27, 13, 121));
            if (string == null) {
                return;
            }
            C1399Yn A05 = C06785c.A05(this.A00, string);
            A05.A0E().AG1(message.getData().getBoolean(A03(6, 21, 44), false));
            String str = null;
            if (Build.VERSION.SDK_INT >= 21 && (packageManager = this.A00.getPackageManager()) != null) {
                str = packageManager.getNameForUid(message.sendingUid);
            }
            if (str == null) {
                if (messenger != null) {
                    VW.A00().A07(20, string, null, messenger);
                }
                A05.A0E().AEk();
                return;
            }
            switch (message.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    C0999Iu A04 = VW.A00().A04(string);
                    if (A04 == null) {
                        A04 = VW.A00().A05(string, messenger, str);
                    }
                    AnonymousClass26 A042 = C2L.A04(A05, message.getData(), str);
                    if (A04.A00 == null) {
                        A04.A00 = A01(A042, string);
                    } else if (A04.A00 instanceof C1464aT) {
                        ((C1464aT) A04.A00).A0G(A042.A0B(), A042.A07());
                    }
                    VW.A00().A07(1011, string, A00(), messenger);
                    return;
                case 1012:
                case AdError.CACHE_ERROR_CODE /* 2002 */:
                    VW.A00().A08(string);
                    return;
                case AdError.SERVER_ERROR_CODE /* 2000 */:
                    if (messenger == null) {
                        return;
                    }
                    C0999Iu A043 = VW.A00().A04(string);
                    if (A043 == null) {
                        A043 = VW.A00().A05(string, messenger, str);
                    }
                    C2F A052 = C2L.A05(A05, message.getData(), str);
                    if (A043.A00 == null) {
                        A043.A00 = A02(A052, string);
                    } else if (A043.A00 instanceof C1461aQ) {
                        ((C1461aQ) A043.A00).A0J(A052.A05, A052.A02, A052.A08);
                    }
                    VW.A00().A07(AdError.INTERNAL_ERROR_CODE, string, A00(), messenger);
                    return;
                case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                    AnonymousClass23 A032 = VW.A00().A03(string);
                    if (A032 instanceof C1461aQ) {
                        RewardData A01 = C2M.A01(message.getData());
                        C1461aQ c1461aQ = (C1461aQ) A032;
                        if (A01 != null) {
                            c1461aQ.A0I(A01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }

    static {
        A04();
        A03 = HandlerC1002Ix.class.getSimpleName();
    }

    public HandlerC1002Ix(Context context) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A01 = VW.A00();
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(58, 23, 73), A03(0, 6, 6));
        bundle.putString(A03(40, 18, 14), new JSONObject().toString());
        return bundle;
    }

    private C1464aT A01(AnonymousClass26 anonymousClass26, String str) {
        C1464aT c1464aT = new C1464aT(anonymousClass26, this.A01, str);
        c1464aT.A0G(anonymousClass26.A0B(), anonymousClass26.A07());
        return c1464aT;
    }

    private C1461aQ A02(C2F c2f, String str) {
        C1461aQ c1461aQ = new C1461aQ(c2f, this.A01, str);
        c1461aQ.A0J(c2f.A05, c2f.A02, c2f.A08);
        return c1461aQ;
    }
}
