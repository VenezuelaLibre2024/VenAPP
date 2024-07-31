package androidx.webkit.internal;

import android.webkit.TracingController;
import androidx.webkit.internal.AbstractC1431a;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import p073e2.AbstractC7108l;
import p073e2.C7107k;

/* renamed from: androidx.webkit.internal.a1 */
/* loaded from: classes.dex */
public class C1433a1 extends AbstractC7108l {

    /* renamed from: a */
    private TracingController f6381a;

    /* renamed from: b */
    private TracingControllerBoundaryInterface f6382b;

    public C1433a1() {
        AbstractC1431a.g gVar = C1460j1.f6409L;
        if (gVar.mo8259c()) {
            this.f6381a = C1438c0.m8286a();
            this.f6382b = null;
        } else {
            if (!gVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            this.f6381a = null;
            this.f6382b = C1463k1.m8377d().getTracingController();
        }
    }

    /* renamed from: e */
    private TracingControllerBoundaryInterface m8262e() {
        if (this.f6382b == null) {
            this.f6382b = C1463k1.m8377d().getTracingController();
        }
        return this.f6382b;
    }

    /* renamed from: f */
    private TracingController m8263f() {
        if (this.f6381a == null) {
            this.f6381a = C1438c0.m8286a();
        }
        return this.f6381a;
    }

    @Override // p073e2.AbstractC7108l
    /* renamed from: b */
    public boolean mo8264b() {
        AbstractC1431a.g gVar = C1460j1.f6409L;
        if (gVar.mo8259c()) {
            return C1438c0.m8289d(m8263f());
        }
        if (gVar.mo8260d()) {
            return m8262e().isTracing();
        }
        throw C1460j1.m8361a();
    }

    @Override // p073e2.AbstractC7108l
    /* renamed from: c */
    public void mo8265c(C7107k c7107k) {
        if (c7107k == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        AbstractC1431a.g gVar = C1460j1.f6409L;
        if (gVar.mo8259c()) {
            C1438c0.m8291f(m8263f(), c7107k);
        } else {
            if (!gVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8262e().start(c7107k.m20946b(), c7107k.m20945a(), c7107k.m20947c());
        }
    }

    @Override // p073e2.AbstractC7108l
    /* renamed from: d */
    public boolean mo8266d(OutputStream outputStream, Executor executor) {
        AbstractC1431a.g gVar = C1460j1.f6409L;
        if (gVar.mo8259c()) {
            return C1438c0.m8292g(m8263f(), outputStream, executor);
        }
        if (gVar.mo8260d()) {
            return m8262e().stop(outputStream, executor);
        }
        throw C1460j1.m8361a();
    }
}
