package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.P7 */
/* loaded from: assets/audience_network.dex */
public class C3741P7 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ C3745PB A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, 18, 2, 17, 8, 15, 19, 8, 14, 13, -11, -6, -11, -44, 3, -14, 4, -7, 13, 26, 26, 23, 26, -21, 23, 12, 13, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, 30, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public C3741P7(C3745PB c3745pb) {
        this.A00 = c3745pb;
    }

    private void A02(int i10, String str, String str2, boolean z10) {
        C3377JA c3377ja;
        C4337Yn c4337Yn;
        C3732Oy c3732Oy;
        if (z10) {
            this.A00.A0S();
        }
        c3377ja = this.A00.A0D;
        c3377ja.A04(EnumC3376J9.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i10);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c4337Yn = this.A00.A0B;
        c4337Yn.A0E().A5P(jSONObject2);
        c3732Oy = this.A00.A0E;
        c3732Oy.A04(AbstractC27248A.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3377JA c3377ja;
        C4337Yn c4337Yn;
        long j10;
        InterfaceC3743P9 interfaceC3743P9;
        InterfaceC3743P9 interfaceC3743P92;
        c3377ja = this.A00.A0D;
        c3377ja.A04(EnumC3376J9.A0R, null);
        c4337Yn = this.A00.A0B;
        InterfaceC22640S A0E = c4337Yn.A0E();
        j10 = this.A00.A00;
        A0E.A5Q(C3527Lf.A01(j10));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC3743P9 = this.A00.A03;
        if (interfaceC3743P9 == null) {
            return;
        }
        interfaceC3743P92 = this.A00.A03;
        interfaceC3743P92.ADk();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i10, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb2 = new StringBuilder();
        String A00 = A00(0, 0, 48);
        A02(errorCode, sb2.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i10 = webResourceResponse.getStatusCode();
        } else {
            i10 = -1;
        }
        A02(i10, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C4337Yn c4337Yn;
        AbstractC4476b5 abstractC4476b5;
        InterfaceC3744PA interfaceC3744PA;
        InterfaceC3744PA interfaceC3744PA2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String message = jSONObject.toString();
        c4337Yn = this.A00.A0B;
        c4337Yn.A0E().A5L(message);
        abstractC4476b5 = this.A00.A09;
        AbstractC3746PC.A04(abstractC4476b5.A0S());
        interfaceC3744PA = this.A00.A04;
        if (interfaceC3744PA == null) {
            return true;
        }
        interfaceC3744PA2 = this.A00.A04;
        String[] strArr = A02;
        String message2 = strArr[1];
        if (message2.length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        interfaceC3744PA2.ACl();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C4337Yn c4337Yn;
        C26416c c26416c;
        C3757PN c3757pn;
        AbstractC4476b5 abstractC4476b5;
        c4337Yn = this.A00.A0B;
        c26416c = this.A00.A0A;
        c3757pn = this.A00.A0H;
        abstractC4476b5 = this.A00.A09;
        return C3759PP.A00(c4337Yn, c26416c, webResourceRequest, c3757pn, abstractC4476b5.A0f());
    }
}
