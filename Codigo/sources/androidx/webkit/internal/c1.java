package androidx.webkit.internal;

import e2.n;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* loaded from: classes.dex */
public class c1 implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final n.a f5562a;

    public c1(n.a aVar) {
        this.f5562a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        e2.m c10 = b1.c((WebMessageBoundaryInterface) hm.a.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (c10 != null) {
            this.f5562a.onMessage(new f1(invocationHandler), c10);
        }
    }
}
