package androidx.webkit.internal;

import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import p073e2.AbstractC7110n;
import p073e2.C7109m;

/* renamed from: androidx.webkit.internal.b1 */
/* loaded from: classes.dex */
public class C1436b1 implements WebMessageBoundaryInterface {

    /* renamed from: b */
    private static final String[] f6383b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a */
    private C7109m f6384a;

    public C1436b1(C7109m c7109m) {
        this.f6384a = c7109m;
    }

    /* renamed from: a */
    public static boolean m8270a(int i10) {
        if (i10 != 0) {
            return i10 == 1 && C1460j1.f6400C.mo8260d();
        }
        return true;
    }

    /* renamed from: b */
    private static AbstractC7110n[] m8271b(InvocationHandler[] invocationHandlerArr) {
        AbstractC7110n[] abstractC7110nArr = new AbstractC7110n[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            abstractC7110nArr[i10] = new C1448f1(invocationHandlerArr[i10]);
        }
        return abstractC7110nArr;
    }

    /* renamed from: c */
    public static C7109m m8272c(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        AbstractC7110n[] m8271b = m8271b(webMessageBoundaryInterface.getPorts());
        if (!C1460j1.f6400C.mo8260d()) {
            return new C7109m(webMessageBoundaryInterface.getData(), m8271b);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C7757a.m23674a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new C7109m(webMessagePayloadBoundaryInterface.getAsString(), m8271b);
        }
        if (type != 1) {
            return null;
        }
        return new C7109m(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), m8271b);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.f6384a.m20956c();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        C1445e1 c1445e1;
        int m20958e = this.f6384a.m20958e();
        if (m20958e == 0) {
            c1445e1 = new C1445e1(this.f6384a.m20956c());
        } else {
            if (m20958e != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.f6384a.m20958e());
            }
            byte[] m20955b = this.f6384a.m20955b();
            Objects.requireNonNull(m20955b);
            c1445e1 = new C1445e1(m20955b);
        }
        return C7757a.m23676c(c1445e1);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        AbstractC7110n[] m20957d = this.f6384a.m20957d();
        if (m20957d == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[m20957d.length];
        for (int i10 = 0; i10 < m20957d.length; i10++) {
            invocationHandlerArr[i10] = m20957d[i10].mo8324c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return f6383b;
    }
}
