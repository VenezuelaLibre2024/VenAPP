package androidx.webkit.internal;

import android.net.Uri;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p073e2.AbstractC7110n;
import p073e2.AbstractC7118v;
import p073e2.C7109m;
import p073e2.C7115s;

/* renamed from: androidx.webkit.internal.l1 */
/* loaded from: classes.dex */
public class C1466l1 {

    /* renamed from: a */
    WebViewProviderBoundaryInterface f6455a;

    public C1466l1(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f6455a = webViewProviderBoundaryInterface;
    }

    /* renamed from: a */
    public C1492v0 m8383a(String str, String[] strArr) {
        return C1492v0.m8444b(this.f6455a.addDocumentStartJavaScript(str, strArr));
    }

    /* renamed from: b */
    public void m8384b(String str, String[] strArr, C7115s.b bVar) {
        this.f6455a.addWebMessageListener(str, strArr, C7757a.m23676c(new C1442d1(bVar)));
    }

    /* renamed from: c */
    public AbstractC7110n[] m8385c() {
        InvocationHandler[] createWebMessageChannel = this.f6455a.createWebMessageChannel();
        AbstractC7110n[] abstractC7110nArr = new AbstractC7110n[createWebMessageChannel.length];
        for (int i10 = 0; i10 < createWebMessageChannel.length; i10++) {
            abstractC7110nArr[i10] = new C1448f1(createWebMessageChannel[i10]);
        }
        return abstractC7110nArr;
    }

    /* renamed from: d */
    public void m8386d(C7109m c7109m, Uri uri) {
        this.f6455a.postMessageToMainFrame(C7757a.m23676c(new C1436b1(c7109m)), uri);
    }

    /* renamed from: e */
    public void m8387e(Executor executor, AbstractC7118v abstractC7118v) {
        this.f6455a.setWebViewRendererClient(abstractC7118v != null ? C7757a.m23676c(new C1475o1(executor, abstractC7118v)) : null);
    }
}
