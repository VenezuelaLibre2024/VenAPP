package androidx.webkit.internal;

import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import p073e2.AbstractC7110n;
import p073e2.C7109m;

/* renamed from: androidx.webkit.internal.c1 */
/* loaded from: classes.dex */
public class C1439c1 implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a */
    private final AbstractC7110n.a f6387a;

    public C1439c1(AbstractC7110n.a aVar) {
        this.f6387a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        C7109m m8272c = C1436b1.m8272c((WebMessageBoundaryInterface) C7757a.m23674a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (m8272c != null) {
            this.f6387a.onMessage(new C1448f1(invocationHandler), m8272c);
        }
    }
}
