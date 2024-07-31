package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8Y */
/* loaded from: assets/audience_network.dex */
public final class C27478Y {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
            i13++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-55, -11, -55, -57, -12, -59, -54, -53, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C4321YX A00() {
        return new C4321YX();
    }

    public static C4320YW A01(C4336Ym c4336Ym) {
        return new C4320YW(c4336Ym);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC3530Li.A01.execute(new C4322YY(initListener, initResult));
    }

    public static void A06(C4336Ym c4336Ym) {
        if (AbstractC3350Ij.A0P(c4336Ym) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C271480(Thread.getDefaultUncaughtExceptionHandler(), c4336Ym, new C4318YU());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e10) {
                c4336Ym.A07().A9a(A02(181, 7, 62), AbstractC27248A.A1X, new C27258B(e10));
            }
        }
    }

    public static void A07(C4336Ym c4336Ym) {
        A0G(c4336Ym, null, null, 3);
    }

    public static void A08(C4336Ym c4336Ym) {
        A0G(c4336Ym, null, null, 3);
    }

    public static void A09(C4336Ym c4336Ym) {
        if (C3348Ih.A1u(c4336Ym)) {
            A0E(c4336Ym, 0);
        }
        if (C3348Ih.A21(c4336Ym)) {
            A0B(c4336Ym);
        }
    }

    public static void A0A(C4336Ym c4336Ym) {
        if (C3348Ih.A1v(c4336Ym)) {
            A0F(c4336Ym, null, 3);
        }
    }

    public static void A0B(C4336Ym c4336Ym) {
        ExecutorC3541Lt.A06.execute(new C4323YZ(c4336Ym));
    }

    public static void A0C(C4336Ym c4336Ym) {
        if (AbstractC3351Ik.A0A(c4336Ym)) {
            new HandlerC23712C(c4336Ym).A0A(AbstractC3351Ik.A01.get());
        }
        C271884.A0C(c4336Ym, new C4317YT(c4336Ym), new C4327Yd(), BuildConfigApi.isDebug());
        c4336Ym.A09();
    }

    public static void A0E(C4336Ym c4336Ym, int i10) {
        AbstractC26927e.A01(c4336Ym);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC3416Jp.A02();
        }
        A06(c4336Ym);
        AbstractC3458KW.A00(C3348Ih.A0l(c4336Ym), BuildConfigApi.isDebug(), A00(), A01(c4336Ym));
        C26266N.A03(C3348Ih.A03(c4336Ym));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C3896Rc.A09(new C4319YV(c4336Ym));
        }
        if (i10 == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c4336Ym.A07().AA2(A02(178, 3, 33), AbstractC27248A.A0R, new C27258B(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c4336Ym, AudienceNetworkActivity.class);
        ExecutorC3541Lt.A05(c4336Ym);
        C3380JD.A05(c4336Ym);
        C22930w.A01(c4336Ym);
        if (C3348Ih.A0x(c4336Ym)) {
            AbstractC25615J.A00(c4336Ym);
        }
        if (C3348Ih.A1W(c4336Ym)) {
            C4309YL.A02().A7s(c4336Ym);
        }
    }

    public static void A0F(C4336Ym c4336Ym, AudienceNetworkAds.InitListener initListener, int i10) {
        AbstractC26927e.A01(c4336Ym);
        boolean z10 = false;
        synchronized (C27478Y.class) {
            boolean execute = A00;
            if (!execute) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                }
                A00 = true;
                z10 = true;
            }
        }
        if (z10) {
            A0E(c4336Ym, i10);
            ExecutorC3541Lt.A08.execute(new C4324Ya(c4336Ym, initListener));
        } else {
            if (i10 != 1) {
                return;
            }
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C27468X(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C4336Ym c4336Ym, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
        AbstractC3416Jp.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        C3896Rc.A06();
        A0F(c4336Ym, initListener, i10);
    }

    public static synchronized boolean A0H() {
        boolean z10;
        synchronized (C27478Y.class) {
            z10 = A00;
        }
        return z10;
    }
}
