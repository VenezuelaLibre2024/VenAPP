package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Kv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1047Kv {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-49, -36, -19, -44, -48, -62, -49, -19, -31, -45, -47, -29, -32, -45, -19, -30, -35, -39, -45, -36, -20, -7, 10, -14, -5, -2, 10, -20, -17, 10, -18, -6, -7, -1, -16, -7, -1, -56, -58, -47, -47, -54, -41, -28, -55, -44, -46, -58, -50, -45, -6, 24, 37, -34, 43, -41, 42, 43, 24, 41, 43, -41, -8, 44, 27, 32, 28, 37, 26, 28, 5, 28, 43, 46, 38, 41, 34, -8, 26, 43, 32, 45, 32, 43, 48, -27, -41, 4, 24, 34, 28, -41, 42, 44, 41, 28, -41, 43, 31, 24, 43, -41, 32, 43, -34, 42, -41, 32, 37, -41, 48, 38, 44, 41, -41, -8, 37, 27, 41, 38, 32, 27, 4, 24, 37, 32, 29, 28, 42, 43, -27, 47, 36, 35, -41, 29, 32, 35, 28, -27, -88, -69, -73, -75, -92, -62, -72, -75, -81, -60, -64, -65, -13, -30, -25, -29, -20, -31, -29, -52, -29, -14, -11, -19, -16, -23, -30, -76, -84, -71, -86, -84, -82, -65, -76, -63, -76, -65, -60, -58, -45, -55, -41, -44, -50, -55, -49, -36, -46, -32, -35, -41, -46, -100, -41, -36, -30, -45, -36, -30, -100, -49, -47, -30, -41, -35, -36, -100, -60, -73, -77, -59, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -63, -47, -50, -42, -46, -64, -63, -53, -60, -90, -77, -77, -80, -17, -1, -4, 4, 0, -14, -1, -30, -33, -39, -75, -77, -66, -66, -73, -60, -101, -74, -78, -80, -69, -69, -76, -63, -93, -56, -65, -76, -39, -30, -33, -37, -28, -22, -54, -27, -31, -37, -28, -72, -60, -62, -125, -74, -61, -71, -57, -60, -66, -71, -125, -73, -57, -60, -52, -56, -70, -57, -125, -74, -59, -59, -63, -66, -72, -74, -55, -66, -60, -61, -76, -66, -71, -77, -65, -67, 126, -79, -66, -76, -62, -65, -71, -76, 126, -58, -75, -66, -76, -71, -66, -73, -66, -54, -56, -119, -63, -68, -66, -64, -67, -54, -54, -58, -119, -62, -54, -54, -62, -57, -64, -53, -57, -68, -44, -50, -49, -54, -51, -64, -68, -55, -119, -94, -54, -54, -62, -57, -64, -85, -57, -68, -44, -82, -49, -54, -51, -64, -100, -87, -86, -47, -64, -51, -57, -68, -44, -96, -45, -49, -64, -51, -55, -68, -57, -100, -66, -49, -60, -47, -60, -49, -44, 24, 36, 34, -29, 27, 22, 24, 26, 23, 36, 36, 32, -29, 32, 22, 41, 22, 35, 22, -7, 5, 4, -4, -1, -3, -11, 9, 11, 6, 6, 5, 8, 10, 9, -29, 11, 2, 10, -1, -19, -1, 4, -6, 5, 13, -88, -76, -77, -85, -82, -84, -92, -72, -70, -75, -75, -76, -73, -71, -72, -104, -75, -79, -82, -71, -104, -88, -73, -86, -86, -77, -110, -70, -79, -71, -82, -100, -82, -77, -87, -76, -68, -22, -7, -20, -24, -5, -20, -26, -11, -20, -2, -26, -5, -24, -23, -73, -77, -22, -19, -16, -8, -23, -10, -23, -24, -29, -25, -16, -19, -25, -17, -29, -24, -23, -16, -27, -3, -29, -15, -9, -27, -34, -21, -31, -23, -30, -17, -47, -26, -22, -30, 14, 26, 26, 22, -5, 7, 7, 3, -51, -62, -62, 3, -1, -12, 12, -63, -6, 2, 2, -6, -1, -8, -63, -10, 2, 0, -62, 6, 7, 2, 5, -8, -62, -12, 3, 3, 6, -62, -53, -41, -41, -45, -42, -74, -64, -84, -80, -65, -78, -82, -63, -74, -61, -78, -84, -82, -64, -84, -80, -63, -82, -84, -61, Byte.MAX_VALUE, -2, -14, 3, -4, -10, 5, 6, 13, -4, 9, 3, -8, 16, -73, -77, -88, -64, 117, -82, -74, -74, -82, -77, -84, 117, -86, -74, -76, -51, -64, -50, -60, -43, -64, -88, -54, -65, -64, -51, -58, -63, -55, -51, -67, -95, -68, 48, 35, 31, 49, 14, 51, 42, 31};
    }

    static {
        A08();
    }

    private int A00(C1399Yn c1399Yn) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = c1399Yn.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A06(412, 19, 121), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A06(166, 2, 74), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A06(186, 26, 50), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static Intent A02(C1399Yn c1399Yn, Uri uri) {
        Intent A012 = A01(uri);
        A012.addCategory(A06(212, 33, 67));
        A012.addFlags(268435456);
        A012.putExtra(A06(288, 34, 25), c1399Yn.getPackageName());
        A012.putExtra(A06(494, 14, 75), false);
        if (C0988Ih.A1b(c1399Yn)) {
            if (A06(508, 2, 21).equals(uri.getScheme())) {
                A012.setPackage(A06(412, 19, 121));
            }
        }
        return A012;
    }

    public static Intent A03(C1399Yn c1399Yn, Uri uri) {
        Intent A012 = A01(uri);
        A012.setPackage(A06(322, 19, 20));
        A012.putExtra(A06(259, 8, 22), c1399Yn.getPackageName());
        A012.putExtra(A06(614, 7, 91), true);
        return A012;
    }

    private final EnumC05550g A04(C1399Yn c1399Yn, Uri uri, String str, Map<String, String> extraData) throws C1035Kh {
        boolean A05 = AbstractC0989Ii.A05(c1399Yn);
        boolean isInAppBrowserEnabled = A0E(uri);
        if (isInAppBrowserEnabled && A05) {
            A0B(c1399Yn, uri, str, extraData);
            return EnumC05550g.A07;
        }
        c1399Yn.A0E().A8f(A05);
        A09(c1399Yn, uri);
        return EnumC05550g.A06;
    }

    public static EnumC05550g A05(C1047Kv c1047Kv, C1399Yn c1399Yn, Uri uri, String str, Map<String, String> extraData) throws C1035Kh {
        boolean z10 = A0E(uri) && A06(621, 15, 11).equals(uri.getHost());
        boolean isGooglePlayWebLink = A06(608, 6, 85).equals(uri.getScheme());
        if (!isGooglePlayWebLink && !z10) {
            return c1047Kv.A04(c1399Yn, uri, str, extraData);
        }
        try {
            c1047Kv.A0A(c1399Yn, uri, str);
            return EnumC05550g.A02;
        } catch (C1045Kt unused) {
            return c1047Kv.A04(c1399Yn, uri, str, extraData);
        }
    }

    private String A07(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    private void A09(C1399Yn c1399Yn, Uri uri) throws C1035Kh {
        C1037Kj.A0C(c1399Yn, A02(c1399Yn, uri));
    }

    private final void A0A(C1399Yn c1399Yn, Uri uri, String str) throws C1045Kt, C1035Kh {
        if (A0G(c1399Yn)) {
            boolean z10 = (c1399Yn.A0F().A01() && C0988Ih.A1F(c1399Yn)) || (C0988Ih.A1c(c1399Yn) && A0H(c1399Yn));
            if (!z10) {
                boolean shouldTryToOpenSplitScreen = C0988Ih.A1y(c1399Yn);
                if (shouldTryToOpenSplitScreen) {
                    boolean shouldTryToOpenSplitScreen2 = C1037Kj.A0D(c1399Yn, A03(c1399Yn, uri));
                    if (shouldTryToOpenSplitScreen2) {
                        return;
                    }
                }
            }
            boolean shouldTryToOpenSplitScreen3 = A0K(c1399Yn, uri, str);
            if (shouldTryToOpenSplitScreen3) {
                return;
            }
            Intent A02 = A02(c1399Yn, uri);
            A02.setPackage(A06(322, 19, 20));
            if (Build.VERSION.SDK_INT >= 24 && z10) {
                A02.addFlags(268472320);
            }
            C1037Kj.A0C(c1399Yn, A02);
            return;
        }
        throw new C1045Kt();
    }

    private void A0B(C1399Yn c1399Yn, Uri uri, String str, Map<String, String> map) {
        AdActivityIntent A04 = C1037Kj.A04(c1399Yn);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A04.addFlags(268435456);
        }
        A04.putExtra(A06(654, 8, 126), KB.A03);
        A04.putExtra(A06(249, 10, 81), uri.toString());
        A04.putExtra(A06(277, 11, 58), str);
        A04.putExtra(A06(533, 11, 65), System.currentTimeMillis());
        if (map != null) {
            String A06 = A06(267, 10, 19);
            A04.putExtra(A06, map.get(A06));
            String A062 = A06(587, 21, 17);
            A04.putExtra(A062, map.get(A062));
            String A063 = A06(510, 23, 72);
            A04.putExtra(A063, map.get(A063));
            String A064 = A06(646, 8, 28);
            String str2 = map.get(A064);
            if (str2 != null) {
                A04.putExtra(A064, str2);
            }
        }
        try {
            C1037Kj.A0A(c1399Yn, A04);
        } catch (C1035Kh e10) {
            Throwable cause = e10.getCause();
            Throwable th2 = e10;
            if (cause != null) {
                th2 = e10.getCause();
            }
            c1399Yn.A07().A9a(A06(168, 11, 15), C8A.A0D, new C8B(th2));
            Log.e(A06(149, 17, 66), A06(50, 90, 123), th2);
        }
    }

    public static void A0C(C1047Kv c1047Kv, C1399Yn c1399Yn, Uri uri, String str) {
        c1047Kv.A0L(c1399Yn, uri, str);
    }

    public static void A0D(C1047Kv c1047Kv, C1399Yn c1399Yn, Uri uri, String str) throws C1035Kh {
        A05(c1047Kv, c1399Yn, uri, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0E(android.net.Uri r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r4 = 0
            if (r1 < r0) goto L38
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r3 = r0.isCleartextTrafficPermitted()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1047Kv.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1047Kv.A01
            java.lang.String r1 = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK"
            r0 = 7
            r2[r0] = r1
            if (r3 != 0) goto L38
            android.security.NetworkSecurityPolicy r1 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.isCleartextTrafficPermitted(r0)
            if (r0 == 0) goto L5f
        L38:
            r0 = 1
        L39:
            java.lang.String r3 = r5.getScheme()
            if (r0 == 0) goto L4e
            r2 = 544(0x220, float:7.62E-43)
            r1 = 4
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L5d
        L4e:
            r2 = 582(0x246, float:8.16E-43)
            r1 = 5
            r0 = 39
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L5e
        L5d:
            r4 = 1
        L5e:
            return r4
        L5f:
            r0 = 0
            goto L39
        L61:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1047Kv.A0E(android.net.Uri):boolean");
    }

    private boolean A0F(C1399Yn c1399Yn) {
        if (!C0988Ih.A14(c1399Yn)) {
            return false;
        }
        int A0D = C0988Ih.A0D(c1399Yn);
        if (A01[7].charAt(2) != 'a') {
            throw new RuntimeException();
        }
        A01[2] = "JMUKVK1n";
        int A002 = A00(c1399Yn);
        return A0D != -1 && A002 != -1 && A0D <= A002 && Build.VERSION.SDK_INT >= 28;
    }

    private boolean A0G(C1399Yn c1399Yn) {
        Intent playStoreIntent = new Intent(A06(186, 26, 50), AbstractC1050Ky.A00(A06(548, 34, 87)));
        Iterator<ResolveInfo> it = c1399Yn.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.applicationInfo.packageName.equals(A06(322, 19, 20))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0H(C1399Yn c1399Yn) {
        boolean onAndAboveNOS = Build.VERSION.SDK_INT >= 24;
        boolean A0I = A0I(c1399Yn);
        boolean z10 = onAndAboveNOS && A0I;
        boolean supportsSplitScreenMultiWindow = true;
        boolean appResizingSupported = true;
        boolean z11 = true;
        boolean onAndAboveNOS2 = C0988Ih.A1l(c1399Yn);
        if (onAndAboveNOS2) {
            Resources system = Resources.getSystem();
            String A06 = A06(431, 26, 90);
            String A062 = A06(245, 4, 8);
            String A063 = A06(179, 7, 41);
            int identifier = system.getIdentifier(A06, A062, A063);
            if (identifier != 0) {
                supportsSplitScreenMultiWindow = Resources.getSystem().getBoolean(identifier);
            }
            String[] strArr = A01;
            if (strArr[6].length() == strArr[3].length()) {
                A01[5] = "0rfBgNygkjU7mub";
                int identifier2 = system.getIdentifier(A06(457, 37, 9), A062, A063);
                if (identifier2 != 0) {
                    appResizingSupported = Resources.getSystem().getBoolean(identifier2);
                }
                z11 = L6.A0C(c1399Yn);
                z10 &= supportsSplitScreenMultiWindow && appResizingSupported && z11;
                String[] strArr2 = A01;
                if (strArr2[6].length() == strArr2[3].length()) {
                    A01[5] = "kny6086MT0ulmqJ";
                }
            }
            throw new RuntimeException();
        }
        c1399Yn.A0E().AA7(A0I, z10, supportsSplitScreenMultiWindow, appResizingSupported, z11);
        return z10;
    }

    public static boolean A0I(C1399Yn c1399Yn) {
        Activity A0D;
        PackageManager packageManager;
        ActivityInfo activityInfo;
        try {
            A0D = c1399Yn.A0D();
            packageManager = c1399Yn.getPackageManager();
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
            c1399Yn.A0E().AA5(e10.getMessage());
        }
        if (A0D == null || packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 32) {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } else {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), RecognitionOptions.ITF);
        }
        Field declaredField = ActivityInfo.class.getDeclaredField(A06(636, 10, 31));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityInfo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        return false;
    }

    private boolean A0J(C1399Yn c1399Yn, Uri uri, String str) throws C1035Kh {
        try {
            Activity A0D = c1399Yn.A0D();
            String uri2 = uri.toString();
            if (A0D != null && !TextUtils.isEmpty(uri2)) {
                Intent fbIntent = new Intent();
                if (C0988Ih.A15(c1399Yn)) {
                    String A06 = AbstractC1502b5.A06(str);
                    if (TextUtils.isEmpty(A06)) {
                        return false;
                    }
                    fbIntent.putExtra(A06(0, 20, 82), A07(A06));
                }
                fbIntent.setComponent(new ComponentName(A06(412, 19, 121), A06(341, 71, 31)));
                fbIntent.putExtra(A06(140, 9, 39), uri2);
                fbIntent.putExtra(A06(37, 13, 73), A07(A06(20, 17, 111)));
                if (!C1037Kj.A0D(c1399Yn, fbIntent)) {
                    A0D.startActivityForResult(fbIntent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e10) {
            c1399Yn.A0E().A9e(e10.getMessage());
            return false;
        }
    }

    private boolean A0K(C1399Yn c1399Yn, Uri uri, String str) throws C1035Kh {
        return A0F(c1399Yn) && A0J(c1399Yn, uri, str);
    }

    private final boolean A0L(C1399Yn c1399Yn, Uri uri, String str) {
        return C1037Kj.A0H(c1399Yn, uri, str);
    }

    public static boolean A0M(C1047Kv c1047Kv, C1399Yn c1399Yn, Uri uri, String str) {
        try {
            A0D(c1047Kv, c1399Yn, uri, str);
            return true;
        } catch (C1035Kh e10) {
            Throwable cause = e10.getCause();
            Throwable th2 = e10;
            if (cause != null) {
                th2 = e10.getCause();
            }
            c1399Yn.A07().A9a(A06(168, 11, 15), C8A.A05, new C8B(th2));
            return false;
        }
    }
}
