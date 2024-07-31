package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class RE {
    public static byte[] A0G;
    public static String[] A0H = {"4lWoymCKcFFqvR4KGqpukkAdeBkDHFLG", "4SfXhahvn2cvHTwc", "1H78NFRDPNrHyZuRtW6OfnE16", "5zR7eGXCNOES3F", "tNutlosLurIud7dAWRzPLPvdzTHVgEY0", "XrTXE7Mp98Q", "ALMz8CaD4gcY6rgjWR0f79B0Q", "oMfYSWXrIKFBNYq7bMfMNj8ewYt05Dn"};
    public static final String A0I;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public KT A04;
    public RF A05;
    public Map<String, Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final Handler A0B;
    public final View A0C;
    public final C1399Yn A0D;
    public final WeakReference<RD> A0E;
    public final boolean A0F;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A08(java.util.Vector<android.graphics.Rect> r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.RE.A08(java.util.Vector):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static RF A0E(View view, int i10, C1399Yn c1399Yn) {
        if (view == null) {
            A0N(null, false, A0H(353, 16, 31));
            return new RF(C0Q.A08);
        }
        boolean A2H = C0988Ih.A2H(c1399Yn);
        String A0H2 = A0H(415, 37, 113);
        String A0H3 = A0H(331, 22, 99);
        if (A2H) {
            if (view.getParent() == null) {
                A0N(view, false, A0H3);
                return new RF(C0Q.A0K);
            }
            if (!view.isShown()) {
                A0N(view, false, A0H2);
                return new RF(C0Q.A0N);
            }
        } else {
            if (view.getParent() == null) {
                A0N(view, false, A0H3);
                return new RF(C0Q.A0H);
            }
            if (!view.isShown()) {
                A0N(view, false, A0H2);
                return new RF(C0Q.A0H);
            }
        }
        if (view.getWindowVisibility() != 0) {
            A0N(view, false, A0H(528, 37, 99));
            return new RF(C0Q.A0I);
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            A0N(view, false, A0H(295, 36, 57) + view.getMeasuredWidth() + A0H(27, 4, 45) + view.getMeasuredHeight());
            return new RF(C0Q.A0G);
        }
        if (A00(view) < 0.9f) {
            A0N(view, false, A0H(369, 27, 30));
            return new RF(C0Q.A0B);
        }
        view.getWidth();
        view.getHeight();
        if (A0H[4].charAt(15) == 'A') {
            A0H[4] = "6urEtCeD4ew6lB3ALfyGXwnH3LBfrVYN";
            try {
                view.getLocationOnScreen(new int[2]);
                Rect rect = new Rect();
                if (!view.getGlobalVisibleRect(rect)) {
                    return new RF(C0Q.A07);
                }
                int i11 = Build.VERSION.SDK_INT;
                if (A0H[1].length() == 16) {
                    A0H[1] = "Od97VXu84qI514kY";
                    if (i11 >= 17) {
                        ((WindowManager) c1399Yn.getSystemService(A0H(594, 6, 109))).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                    } else {
                        Resources resources = c1399Yn.getResources();
                        if (A0H[5].length() != 11) {
                            throw new RuntimeException();
                        }
                        A0H[5] = "7BlUoPG8r9G";
                        resources.getDisplayMetrics();
                    }
                    Vector<Rect> A0K = A0K(view);
                    int A08 = A08(A0K);
                    A0K.add(rect);
                    float A082 = ((A08(A0K) - A08) * 1.0f) / (view.getMeasuredHeight() * view.getMeasuredWidth());
                    float A01 = A01(i10, view) / 100.0f;
                    if (A082 < A01) {
                        A0N(view, false, String.format(Locale.US, A0H(452, 76, 42), Float.valueOf(A082), Float.valueOf(A01)));
                        return new RF(C0Q.A04, A082);
                    }
                    if (!M5.A03(c1399Yn)) {
                        A0N(view, false, A0H(185, 26, 62));
                        return new RF(C0Q.A0L, A082);
                    }
                    Map<String, String> A012 = M6.A01(c1399Yn);
                    if (C1067Lp.A04(A012)) {
                        A0N(view, false, A0H(156, 29, 77));
                        return new RF(C0Q.A0A, A082);
                    }
                    if (C0988Ih.A1d(c1399Yn) && C1067Lp.A03(A012)) {
                        A0N(view, false, A0H(31, 31, 14));
                        return new RF(C0Q.A05, A082, A012);
                    }
                    A0N(view, true, A0H(396, 19, 63));
                    return new RF(C0Q.A0J, A082, A012);
                }
            } catch (NullPointerException unused) {
                A0N(view, false, A0H(62, 30, 43));
                return new RF(C0Q.A0G);
            }
        }
        throw new RuntimeException();
    }

    public static String A0H(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A0G = new byte[]{-40, -32, -35, -26, -23, 30, -35, -35, -31, -28, 45, 55, -28, -60, 27, 13, 24, 12, -60, 22, 9, 5, 23, 19, 18, -34, -60, -79, -91, -19, -62, -89, -54, -122, -49, -39, -122, -43, -44, -122, -38, -43, -42, -122, -43, -52, -122, -38, -50, -53, -122, -78, -43, -55, -47, -39, -55, -40, -53, -53, -44, -108, -58, -28, -15, -15, -14, -9, -93, -22, -24, -9, -93, -17, -14, -26, -28, -9, -20, -14, -15, -93, -14, -15, -93, -10, -26, -11, -24, -24, -15, -79, -86, -43, -53, -39, -44, -115, -38, -122, -45, -57, -47, -53, -122, -39, -53, -44, -39, -53, -122, -38, -43, -122, -39, -53, -38, -122, -55, -50, -53, -55, -47, -122, -49, -44, -38, -53, -40, -36, -57, -46, -122, -52, -43, -40, -122, -44, -43, -44, -109, -40, -53, -42, -53, -57, -38, -122, -55, -50, -53, -55, -47, -53, -40, -108, -16, 10, 30, 12, 26, 6, 23, 9, -59, 14, 24, -59, 20, 7, 24, 25, 23, 26, 8, 25, 14, 19, 12, -59, 27, 14, 10, 28, -45, -23, -7, 8, -5, -5, 4, -74, -1, 9, -74, 4, 5, 10, -74, -1, 4, 10, -5, 8, -9, -7, 10, -1, 12, -5, -60, -64, -44, -47, -116, -32, -43, -49, -41, -47, -34, -116, -49, -51, -38, -38, -37, -32, -116, -50, -47, -116, -38, -47, -45, -51, -32, -43, -30, -47, 28, 47, 43, 61, -26, -31, -19, -21, -84, -28, -33, -31, -29, -32, -19, -19, -23, -84, -33, -30, -15, -84, -25, -20, -14, -29, -16, -20, -33, -22, -84, -12, -25, -29, -11, -84, -60, -13, -22, -22, -47, -31, -16, -29, -29, -20, -65, -30, -46, -19, -19, -22, -32, -33, -16, -2, -46, -11, -25, -6, -10, 8, -79, -7, -14, 4, -79, -6, -1, 7, -6, 4, -6, -13, -3, -10, -79, -11, -6, -2, -10, -1, 4, -6, 0, -1, 4, -79, -71, 8, -50, 40, -4, 31, 17, 36, 32, 50, -37, 35, 28, 46, -37, 41, 42, -37, 43, 28, 45, 32, 41, 47, -23, -28, -72, -37, -51, -32, -36, -18, -105, -32, -22, -105, -27, -20, -29, -29, -91, -29, -73, -38, -52, -33, -37, -19, -106, -33, -23, -106, -22, -27, -27, -106, -22, -24, -41, -28, -23, -26, -41, -24, -37, -28, -22, -92, 4, -40, -5, -19, 0, -4, 14, -73, 0, 10, -73, 13, 0, 10, 0, -7, 3, -4, -59, 54, 10, 45, 31, 50, 46, 64, -23, 57, 42, 59, 46, 55, 61, -23, 50, 60, -23, 55, 56, 61, -23, 60, 46, 61, -23, 61, 56, -23, 31, 18, 28, 18, 11, 21, 14, -9, -17, -61, -26, -40, -21, -25, -7, -94, -8, -21, -11, -21, -28, -18, -25, -94, -29, -12, -25, -29, -94, -21, -11, -94, -10, -15, -15, -94, -11, -17, -29, -18, -18, -94, -35, -89, -80, -76, -24, -89, -89, -94, -8, -21, -11, -21, -28, -18, -25, -82, -94, -27, -9, -12, -12, -25, -16, -10, -94, -10, -22, -12, -25, -11, -22, -15, -18, -26, -94, -89, -80, -76, -24, -89, -89, -33, 40, -4, 31, 17, 36, 32, 50, -37, 50, 36, 41, 31, 42, 50, -37, 36, 46, -37, 41, 42, 47, -37, 46, 32, 47, -37, 47, 42, -37, 17, 4, 14, 4, -3, 7, 0, -23, 63, 64, 69, -15, 71, 58, 54, 72, 50, 51, 61, 54, 73, 59, 31, 18, 14, 32, 10, 11, 21, 14, 47, 41, 34, 30, 15, 18, 16, 60, 46, 51, 41, 52, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized String A0R() {
        return C0Q.valuesCustom()[this.A05.A01()].toString() + String.format(Locale.US, A0H(0, 9, 96), Float.valueOf(this.A05.A00() * 100.0f));
    }

    static {
        A0M();
        A0I = RE.class.getSimpleName();
    }

    public RE(View view, int i10, int i11, boolean z10, WeakReference<RD> weakReference, C1399Yn c1399Yn) {
        this.A0B = new Handler();
        this.A01 = 0;
        this.A02 = AdError.NETWORK_ERROR_CODE;
        this.A08 = true;
        this.A05 = new RF(C0Q.A0M);
        this.A06 = new HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = c1399Yn;
        this.A0C = view;
        if (view.getId() == -1) {
            AbstractC1066Lo.A0K(view);
        }
        this.A0A = i10;
        this.A0E = weakReference;
        this.A0F = z10;
        if (i11 < 0) {
            if (BuildConfigApi.isDebug()) {
                Log.w(A0I, A0H(211, 29, 20));
            }
            i11 = 0;
        }
        this.A09 = i11;
    }

    public RE(View view, int i10, WeakReference<RD> weakReference, C1399Yn c1399Yn) {
        this(view, i10, 0, false, weakReference, c1399Yn);
    }

    public RE(View view, int i10, boolean z10, WeakReference<RD> weakReference, C1399Yn c1399Yn) {
        this(view, i10, 0, z10, weakReference, c1399Yn);
    }

    public static float A00(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    public static int A01(int i10, View view) {
        int width = view.getWidth() * view.getHeight();
        float onePixelPercentage = width > 0 ? 100.0f / width : 100.0f;
        int viewArea = (int) Math.max(i10, Math.ceil(onePixelPercentage));
        return viewArea;
    }

    public static /* synthetic */ int A05(RE re2) {
        int i10 = re2.A00;
        re2.A00 = i10 + 1;
        return i10;
    }

    public static int A09(int[] iArr, int i10) {
        int i11 = 0;
        int length = iArr.length;
        while (i11 < length) {
            int low = length - i11;
            int i12 = (low / 2) + i11;
            int low2 = iArr[i12];
            if (low2 == i10) {
                return i12;
            }
            int i13 = iArr[i12];
            String[] strArr = A0H;
            String str = strArr[2];
            String str2 = strArr[7];
            int high = str.length();
            int low3 = str2.length();
            if (high == low3) {
                throw new RuntimeException();
            }
            A0H[0] = "QqEyOv5K4c2a7TamOIPTrCyFewVDGSxi";
            if (i13 > i10) {
                length = i12;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public static Vector<Rect> A0K(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        for (int indexOfChild = viewGroup.indexOfChild(view) + 1; indexOfChild < viewGroup.getChildCount(); indexOfChild++) {
            View childAt = viewGroup.getChildAt(indexOfChild);
            boolean z10 = true;
            boolean z11 = !(childAt instanceof C1179Px);
            if ((childAt instanceof TE) && RG.A00(childAt)) {
                z10 = false;
            }
            if (z11 && z10) {
                Vector<Rect> rectVector = A0L(childAt);
                vector.addAll(rectVector);
            }
        }
        Vector<Rect> rectVector2 = A0K(viewGroup);
        vector.addAll(rectVector2);
        return vector;
    }

    public static Vector<Rect> A0L(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!view.isShown() || (Build.VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        boolean isTransparentToolbar = view.getClass().getName().equals(A0H(245, 50, 38)) && view.getBackground() != null && (view.getBackground() instanceof GradientDrawable);
        if ((view instanceof ViewGroup) && (RG.A00(view) || isTransparentToolbar)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Vector<Rect> visibleRectInView = A0L(viewGroup.getChildAt(i10));
                vector.addAll(visibleRectInView);
            }
            return vector;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    public static void A0N(View view, boolean z10, String str) {
        if (BuildConfigApi.isDebug()) {
            String str2 = A0H(240, 5, 110) + view + A0H(9, 4, 108) + (z10 ? A0H(579, 8, 81) : A0H(565, 12, 121)) + A0H(13, 14, 76) + str;
        }
    }

    public final synchronized Map<String, String> A0S() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put(A0H(589, 3, 84), String.valueOf(this.A05.A01()));
        hashMap.put(A0H(587, 2, 97), String.valueOf(this.A05.A00()));
        hashMap.put(A0H(577, 2, 123), new JSONObject(this.A06).toString());
        hashMap.put(A0H(592, 2, 68), C1057Lf.A05(this.A03));
        Map<String, String> viewabilityData = this.A05.A03();
        hashMap.putAll(viewabilityData);
        return hashMap;
    }

    public final synchronized void A0T() {
        this.A05 = new RF(C0Q.A0M);
    }

    public final synchronized void A0U() {
        if (this.A04 != null) {
            A0V();
        }
        if (this.A07) {
            this.A0D.A0E().A3H();
        }
        AnonymousClass77 anonymousClass77 = new AnonymousClass77(this, this.A0D);
        this.A04 = anonymousClass77;
        this.A0B.postDelayed(anonymousClass77, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new RF(C0Q.A0M);
        this.A06 = new HashMap();
    }

    public final synchronized void A0V() {
        if (this.A07) {
            this.A0D.A0E().A3I();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0W(int i10) {
        this.A01 = i10;
    }

    public final void A0X(int i10) {
        if (BuildConfigApi.isDebug() && !this.A0F) {
            Log.w(A0I, A0H(92, 64, 14));
        }
        this.A02 = i10;
    }

    public final void A0Y(boolean z10) {
        this.A07 = z10;
    }

    public final synchronized boolean A0Z() {
        return this.A08;
    }
}
