package androidx.webkit.internal;

import android.webkit.TracingController;
import androidx.webkit.internal.a;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* loaded from: classes.dex */
public class a1 extends e2.l {

    /* renamed from: a */
    private TracingController f5556a;

    /* renamed from: b */
    private TracingControllerBoundaryInterface f5557b;

    public a1() {
        a.g gVar = j1.L;
        if (gVar.c()) {
            this.f5556a = c0.a();
            this.f5557b = null;
        } else {
            if (!gVar.d()) {
                throw j1.a();
            }
            this.f5556a = null;
            this.f5557b = k1.d().getTracingController();
        }
    }

    private TracingControllerBoundaryInterface e() {
        if (this.f5557b == null) {
            this.f5557b = k1.d().getTracingController();
        }
        return this.f5557b;
    }

    private TracingController f() {
        if (this.f5556a == null) {
            this.f5556a = c0.a();
        }
        return this.f5556a;
    }

    @Override // e2.l
    public boolean b() {
        a.g gVar = j1.L;
        if (gVar.c()) {
            return c0.d(f());
        }
        if (gVar.d()) {
            return e().isTracing();
        }
        throw j1.a();
    }

    @Override // e2.l
    public void c(e2.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        a.g gVar = j1.L;
        if (gVar.c()) {
            c0.f(f(), kVar);
        } else {
            if (!gVar.d()) {
                throw j1.a();
            }
            e().start(kVar.b(), kVar.a(), kVar.c());
        }
    }

    @Override // e2.l
    public boolean d(OutputStream outputStream, Executor executor) {
        a.g gVar = j1.L;
        if (gVar.c()) {
            return c0.g(f(), outputStream, executor);
        }
        if (gVar.d()) {
            return e().stop(outputStream, executor);
        }
        throw j1.a();
    }
}
