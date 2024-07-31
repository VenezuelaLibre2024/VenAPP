package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.U1 */
/* loaded from: assets/audience_network.dex */
public final class C4045U1 extends AbstractC3644NY {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static final String A0C;
    public static final Set<String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C4337Yn A04;
    public C3634NO A05;
    public InterfaceC3638NS A06;
    public C3641NV A07;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{83, 79, 79, 75, 49, 45, 45, 41, 42};
    }

    static {
        A08();
        A0C = C4045U1.class.getSimpleName();
        HashSet hashSet = new HashSet(2);
        A0D = hashSet;
        A09 = false;
        A0A = false;
        hashSet.add(A05(0, 4, 102));
        hashSet.add(A05(4, 5, 4));
    }

    public C4045U1(C4337Yn c4337Yn, Activity activity, InterfaceC3638NS interfaceC3638NS) {
        super(activity, c4337Yn);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c4337Yn, interfaceC3638NS);
    }

    public C4045U1(C4337Yn c4337Yn, InterfaceC3638NS interfaceC3638NS) {
        super(c4337Yn);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c4337Yn, interfaceC3638NS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC3644NY
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final C3641NV A0E() {
        return new C3641NV(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i10, int i11, Intent intent) {
        if (A08 != null && i10 == 1001) {
            if (Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(C4337Yn c4337Yn, InterfaceC3638NS interfaceC3638NS) {
        this.A04 = c4337Yn;
        this.A06 = interfaceC3638NS;
        this.A05 = new C3634NO(this);
        A09 = AbstractC3349Ii.A03(this.A04);
        A0A = AbstractC3349Ii.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        C3641NV A0E = A0E();
        this.A07 = A0E;
        setWebViewClient(A0E);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3644NY
    public final WebChromeClient A0D() {
        return new C3640NU(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j10) {
        if (this.A00 < 0) {
            this.A00 = j10;
        }
        A07();
    }

    public final void A0G(long j10) {
        if (this.A01 < 0) {
            this.A01 = j10;
        }
        A07();
    }

    public final void A0H(long j10) {
        if (this.A02 < 0) {
            this.A02 = j10;
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3644NY, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        AbstractC3650Ne.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC3639NT interfaceC3639NT) {
        this.A07.A06(new WeakReference<>(interfaceC3639NT));
    }

    public void setInterceptRedirectRequest(InterfaceC3637NR interfaceC3637NR) {
        this.A07.A05(interfaceC3637NR);
    }
}
