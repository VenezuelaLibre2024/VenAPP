package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import e2.s;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class d1 implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private s.b f5563a;

    public d1(s.b bVar) {
        this.f5563a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        e2.m c10 = b1.c((WebMessageBoundaryInterface) hm.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (c10 != null) {
            this.f5563a.onPostMessage(webView, c10, uri, z10, r0.c(invocationHandler2));
        }
    }
}
