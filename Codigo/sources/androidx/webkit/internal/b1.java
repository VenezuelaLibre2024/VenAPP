package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public class b1 implements WebMessageBoundaryInterface {

    /* renamed from: b */
    private static final String[] f5558b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a */
    private e2.m f5559a;

    public b1(e2.m mVar) {
        this.f5559a = mVar;
    }

    public static boolean a(int i10) {
        if (i10 != 0) {
            return i10 == 1 && j1.C.d();
        }
        return true;
    }

    private static e2.n[] b(InvocationHandler[] invocationHandlerArr) {
        e2.n[] nVarArr = new e2.n[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            nVarArr[i10] = new f1(invocationHandlerArr[i10]);
        }
        return nVarArr;
    }

    public static e2.m c(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        e2.n[] b10 = b(webMessageBoundaryInterface.getPorts());
        if (!j1.C.d()) {
            return new e2.m(webMessageBoundaryInterface.getData(), b10);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) hm.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new e2.m(webMessagePayloadBoundaryInterface.getAsString(), b10);
        }
        if (type != 1) {
            return null;
        }
        return new e2.m(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), b10);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.f5559a.c();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        e1 e1Var;
        int e10 = this.f5559a.e();
        if (e10 == 0) {
            e1Var = new e1(this.f5559a.c());
        } else {
            if (e10 != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.f5559a.e());
            }
            byte[] b10 = this.f5559a.b();
            Objects.requireNonNull(b10);
            e1Var = new e1(b10);
        }
        return hm.a.c(e1Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        e2.n[] d10 = this.f5559a.d();
        if (d10 == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[d10.length];
        for (int i10 = 0; i10 < d10.length; i10++) {
            invocationHandlerArr[i10] = d10[i10].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return f5558b;
    }
}
