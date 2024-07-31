package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.u;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import q.a;
import w.j;

/* loaded from: classes.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    private final u f1974a;

    /* renamed from: b, reason: collision with root package name */
    private final f2 f1975b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f1976c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1977d = false;

    /* renamed from: e, reason: collision with root package name */
    private c.a<Integer> f1978e;

    /* renamed from: f, reason: collision with root package name */
    private u.c f1979f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(u uVar, androidx.camera.camera2.internal.compat.d0 d0Var, Executor executor) {
        this.f1974a = uVar;
        this.f1975b = new f2(d0Var, 0);
        this.f1976c = executor;
    }

    private void a() {
        c.a<Integer> aVar = this.f1978e;
        if (aVar != null) {
            aVar.f(new j.a("Cancelled by another setExposureCompensationIndex()"));
            this.f1978e = null;
        }
        u.c cVar = this.f1979f;
        if (cVar != null) {
            this.f1974a.W(cVar);
            this.f1979f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z10) {
        if (z10 == this.f1977d) {
            return;
        }
        this.f1977d = z10;
        if (z10) {
            return;
        }
        this.f1975b.b(0);
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a.C0388a c0388a) {
        c0388a.e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f1975b.a()));
    }
}
