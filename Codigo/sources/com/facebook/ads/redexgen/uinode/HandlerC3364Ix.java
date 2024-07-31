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

/* renamed from: com.facebook.ads.redexgen.X.Ix */
/* loaded from: assets/audience_network.dex */
public final class HandlerC3364Ix extends Handler {
    public static byte[] A02;
    public static final String A03;
    public final Context A00;
    public final C4137VW A01;

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
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PackageManager packageManager;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            Messenger messenger = message.replyTo;
            if (message.what == 1) {
                if (messenger != null) {
                    C4137VW.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String string = message.getData().getString(A03(27, 13, 121));
            if (string == null) {
                return;
            }
            C4337Yn A05 = C25805c.A05(this.A00, string);
            A05.A0E().AG1(message.getData().getBoolean(A03(6, 21, 44), false));
            String str = null;
            if (Build.VERSION.SDK_INT >= 21 && (packageManager = this.A00.getPackageManager()) != null) {
                str = packageManager.getNameForUid(message.sendingUid);
            }
            if (str == null) {
                if (messenger != null) {
                    C4137VW.A00().A07(20, string, null, messenger);
                }
                A05.A0E().AEk();
                return;
            }
            switch (message.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    C3361Iu A04 = C4137VW.A00().A04(string);
                    if (A04 == null) {
                        A04 = C4137VW.A00().A05(string, messenger, str);
                    }
                    C236526 A042 = AbstractC23802L.A04(A05, message.getData(), str);
                    if (A04.A00 == null) {
                        A04.A00 = A01(A042, string);
                    } else if (A04.A00 instanceof C4438aT) {
                        ((C4438aT) A04.A00).A0G(A042.A0B(), A042.A07());
                    }
                    C4137VW.A00().A07(1011, string, A00(), messenger);
                    return;
                case 1012:
                case AdError.CACHE_ERROR_CODE /* 2002 */:
                    C4137VW.A00().A08(string);
                    return;
                case AdError.SERVER_ERROR_CODE /* 2000 */:
                    if (messenger == null) {
                        return;
                    }
                    C3361Iu A043 = C4137VW.A00().A04(string);
                    if (A043 == null) {
                        A043 = C4137VW.A00().A05(string, messenger, str);
                    }
                    C23742F A052 = AbstractC23802L.A05(A05, message.getData(), str);
                    if (A043.A00 == null) {
                        A043.A00 = A02(A052, string);
                    } else if (A043.A00 instanceof C4435aQ) {
                        ((C4435aQ) A043.A00).A0J(A052.A05, A052.A02, A052.A08);
                    }
                    C4137VW.A00().A07(AdError.INTERNAL_ERROR_CODE, string, A00(), messenger);
                    return;
                case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                    InterfaceC236223 A032 = C4137VW.A00().A03(string);
                    if (A032 instanceof C4435aQ) {
                        RewardData A01 = AbstractC23812M.A01(message.getData());
                        C4435aQ c4435aQ = (C4435aQ) A032;
                        if (A01 != null) {
                            c4435aQ.A0I(A01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    static {
        A04();
        A03 = HandlerC3364Ix.class.getSimpleName();
    }

    public HandlerC3364Ix(Context context) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A01 = C4137VW.A00();
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(58, 23, 73), A03(0, 6, 6));
        bundle.putString(A03(40, 18, 14), new JSONObject().toString());
        return bundle;
    }

    private C4438aT A01(C236526 c236526, String str) {
        C4438aT c4438aT = new C4438aT(c236526, this.A01, str);
        c4438aT.A0G(c236526.A0B(), c236526.A07());
        return c4438aT;
    }

    private C4435aQ A02(C23742F c23742f, String str) {
        C4435aQ c4435aQ = new C4435aQ(c23742f, this.A01, str);
        c4435aQ.A0J(c23742f.A05, c23742f.A02, c23742f.A08);
        return c4435aQ;
    }
}
