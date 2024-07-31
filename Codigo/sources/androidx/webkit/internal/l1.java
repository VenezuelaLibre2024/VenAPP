package androidx.webkit.internal;

import android.net.Uri;
import e2.s;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a */
    WebViewProviderBoundaryInterface f5604a;

    public l1(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f5604a = webViewProviderBoundaryInterface;
    }

    public v0 a(String str, String[] strArr) {
        return v0.b(this.f5604a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, s.b bVar) {
        this.f5604a.addWebMessageListener(str, strArr, hm.a.c(new d1(bVar)));
    }

    public e2.n[] c() {
        InvocationHandler[] createWebMessageChannel = this.f5604a.createWebMessageChannel();
        e2.n[] nVarArr = new e2.n[createWebMessageChannel.length];
        for (int i10 = 0; i10 < createWebMessageChannel.length; i10++) {
            nVarArr[i10] = new f1(createWebMessageChannel[i10]);
        }
        return nVarArr;
    }

    public void d(e2.m mVar, Uri uri) {
        this.f5604a.postMessageToMainFrame(hm.a.c(new b1(mVar)), uri);
    }

    public void e(Executor executor, e2.v vVar) {
        this.f5604a.setWebViewRendererClient(vVar != null ? hm.a.c(new o1(executor, vVar)) : null);
    }
}
