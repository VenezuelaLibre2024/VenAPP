package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import p073e2.C7109m;
import p073e2.C7115s;

/* renamed from: androidx.webkit.internal.d1 */
/* loaded from: classes.dex */
public class C1442d1 implements WebMessageListenerBoundaryInterface {

    /* renamed from: a */
    private C7115s.b f6388a;

    public C1442d1(C7115s.b bVar) {
        this.f6388a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        C7109m m8272c = C1436b1.m8272c((WebMessageBoundaryInterface) C7757a.m23674a(WebMessageBoundaryInterface.class, invocationHandler));
        if (m8272c != null) {
            this.f6388a.onPostMessage(webView, m8272c, uri, z10, C1483r0.m8415c(invocationHandler2));
        }
    }
}
