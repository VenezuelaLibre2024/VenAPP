package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.NV */
/* loaded from: assets/audience_network.dex */
public class C3641NV extends WebViewClient {
    public static byte[] A05;
    public InterfaceC3637NR A00 = new InterfaceC3637NR() { // from class: com.facebook.ads.redexgen.X.U2
        @Override // com.facebook.ads.redexgen.uinode.InterfaceC3637NR
        public final boolean A9D(String str) {
            return C3641NV.A04(str);
        }
    };
    public WeakReference<InterfaceC3639NT> A01 = new WeakReference<>(null);
    public final WeakReference<C4337Yn> A02;
    public final WeakReference<InterfaceC3638NS> A03;
    public final WeakReference<C3634NO> A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, 27, 23, 41, 9, 22, 12, 26, 23, 17, 12, -42, 17, 22, 28, 13, 22, 28, -42, 11, 9, 28, 13, 15, 23, 26, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, 28, 24, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, 26, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public C3641NV(WeakReference<C4337Yn> weakReference, WeakReference<InterfaceC3638NS> weakReference2, WeakReference<C3634NO> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C4337Yn c4337Yn) {
        c4337Yn.A07().A9a(A00(11, 11, 101), AbstractC27248A.A09, new C27258B(A00(111, 5, 6) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r0.contains(r2) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3641NV.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(InterfaceC3637NR interfaceC3637NR) {
        this.A00 = interfaceC3637NR;
    }

    public final void A06(WeakReference<InterfaceC3639NT> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C3634NO timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC3638NS interfaceC3638NS = this.A03.get();
        if (interfaceC3638NS != null) {
            interfaceC3638NS.ACT(str);
        }
        InterfaceC3639NT interfaceC3639NT = this.A01.get();
        if (interfaceC3639NT != null) {
            interfaceC3639NT.AAv(webView.canGoBack());
            interfaceC3639NT.ABZ(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC3638NS listener = this.A03.get();
        if (listener != null) {
            listener.ACV(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C4337Yn c4337Yn = this.A02.get();
        if (c4337Yn != null) {
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 27);
            String errorMessage = AbstractC3503LH.A01(i10, sb2.append(A00).append(str).toString(), A00 + str2);
            c4337Yn.A0E().A8h(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C4337Yn c4337Yn = this.A02.get();
        if (c4337Yn != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 27);
            String errorMessage = AbstractC3503LH.A01(errorCode, sb2.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            c4337Yn.A0E().A8h(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C4337Yn context = this.A02.get();
        if (context != null) {
            context.A0E().A8i();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C4337Yn context = this.A02.get();
        if (context != null) {
            context.A0E().A8j();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC3644NY.A02(AbstractC27248A.A2c);
        InterfaceC3638NS listener = this.A03.get();
        if (listener != null) {
            listener.ACs();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
