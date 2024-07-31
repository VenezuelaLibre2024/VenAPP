package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class Q0 extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC1502b5 A03;
    public final C05761c A04;
    public final C1399Yn A05;
    public final J2 A06;
    public final InterfaceC1105Nb A07;
    public final C1278Ts A08;
    public final InterfaceC1180Py A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i13] = (byte) (i14 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (LD.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public Q0(C1399Yn c1399Yn, AbstractC1502b5 abstractC1502b5, C05761c c05761c, J2 j22, InterfaceC1180Py interfaceC1180Py, Map<String, String> playableMetricsData) {
        super(c1399Yn);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC1281Tv() { // from class: com.facebook.ads.redexgen.X.9O
            @Override // com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
            public final void AAn() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC1281Tv, com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
            public final void ABW(int i10, String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC1180Py interfaceC1180Py2;
                atomicBoolean = Q0.this.A0B;
                atomicBoolean.set(true);
                interfaceC1180Py2 = Q0.this.A09;
                interfaceC1180Py2.AC4();
            }

            @Override // com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
            public final void ABj() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC1180Py interfaceC1180Py2;
                atomicBoolean = Q0.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = Q0.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC1180Py2 = Q0.this.A09;
                interfaceC1180Py2.ABj();
            }

            @Override // com.facebook.ads.redexgen.uinode.InterfaceC1105Nb
            public final void ADj() {
                InterfaceC1180Py interfaceC1180Py2;
                interfaceC1180Py2 = Q0.this.A09;
                interfaceC1180Py2.ADj();
            }
        };
        this.A05 = c1399Yn;
        this.A03 = abstractC1502b5;
        this.A04 = c05761c;
        this.A06 = j22;
        this.A09 = interfaceC1180Py;
        this.A02 = playableMetricsData;
        C1278Ts A04 = A04();
        this.A08 = A04;
        if (C0988Ih.A1W(c1399Yn)) {
            c1399Yn.A0A().AGv(A04, abstractC1502b5.A12(), false);
        }
        addView(A04, A0F);
    }

    public static /* synthetic */ int A00(Q0 q02) {
        int i10 = q02.A00;
        q02.A00 = i10 + 1;
        return i10;
    }

    private C1278Ts A04() {
        C1278Ts c1278Ts = new C1278Ts(this.A05, (WeakReference<InterfaceC1105Nb>) new WeakReference(this.A07), 10, C0988Ih.A1f(this.A05));
        c1278Ts.setCornerRadius(A0E);
        c1278Ts.setLogMultipleImpressions(false);
        c1278Ts.setCheckAssetsByJavascriptBridge(false);
        c1278Ts.setWebViewTimeoutInMillis(this.A04.A08());
        c1278Ts.setRequestId(this.A03.A0S());
        c1278Ts.setOnTouchListener(new ViewOnTouchListenerC1181Pz(this));
        WebSettings settings = c1278Ts.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c1278Ts.addJavascriptInterface(new Q1(this.A05, this, this.A06, this.A02, this.A03.A12()), A06(0, 12, 104));
        }
        return c1278Ts;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:
    
        if (r3 <= com.facebook.ads.redexgen.uinode.C0988Ih.A0H(r8)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.uinode.Q0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:
    
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:
    
        r3.ABD();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.Q0.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.ABD();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:
    
        r7.A05(0);
        r9.A05.A07().A9a(r6, com.facebook.ads.redexgen.uinode.C8A.A2E, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f2, code lost:
    
        if (r3 <= com.facebook.ads.redexgen.uinode.C0988Ih.A0H(r8)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.Q0.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            C8B c8b = new C8B(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A12());
            } catch (JSONException e10) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e10);
            }
            c8b.A07(jSONObject);
            c8b.A05(1);
            AnonymousClass89 A07 = this.A05.A07();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i10 = C8A.A2G;
            String A06 = A06(155, 15, 98);
            A07.A9b(A06, i10, c8b);
            if (C0988Ih.A0m(this.A05) && AbstractC1055Ld.A00(this.A05) == EnumC1054Lc.A07) {
                this.A05.A07().A9b(A06, C8A.A2F, c8b);
                this.A07.ABW(0, null);
                return;
            }
        }
        try {
            C1278Ts c1278Ts = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            c1278Ts.loadUrl(A0E2);
        } catch (Exception e11) {
            this.A05.A07().A9a(A06(192, 8, 57), C8A.A2d, new C8B(e11));
        }
    }

    public final void A0C() {
        if (C0988Ih.A1W(this.A05)) {
            C1399Yn c1399Yn = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c1399Yn.A0A().AGk(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
        } else {
            this.A08.destroy();
        }
    }

    public C1058Lg getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public RE getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
