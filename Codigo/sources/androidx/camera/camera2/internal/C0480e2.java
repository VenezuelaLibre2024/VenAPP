package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.concurrent.futures.C0742c;
import java.util.concurrent.Executor;
import p298q.C10214a;
import p407w.InterfaceC12016j;

/* renamed from: androidx.camera.camera2.internal.e2 */
/* loaded from: classes.dex */
public class C0480e2 {

    /* renamed from: a */
    private final C0557u f2277a;

    /* renamed from: b */
    private final C0485f2 f2278b;

    /* renamed from: c */
    private final Executor f2279c;

    /* renamed from: d */
    private boolean f2280d = false;

    /* renamed from: e */
    private C0742c.a<Integer> f2281e;

    /* renamed from: f */
    private C0557u.c f2282f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0480e2(C0557u c0557u, C0427d0 c0427d0, Executor executor) {
        this.f2277a = c0557u;
        this.f2278b = new C0485f2(c0427d0, 0);
        this.f2279c = executor;
    }

    /* renamed from: a */
    private void m2364a() {
        C0742c.a<Integer> aVar = this.f2281e;
        if (aVar != null) {
            aVar.m3758f(new InterfaceC12016j.a("Cancelled by another setExposureCompensationIndex()"));
            this.f2281e = null;
        }
        C0557u.c cVar = this.f2282f;
        if (cVar != null) {
            this.f2277a.m2716W(cVar);
            this.f2282f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2365b(boolean z10) {
        if (z10 == this.f2280d) {
            return;
        }
        this.f2280d = z10;
        if (z10) {
            return;
        }
        this.f2278b.m2377b(0);
        m2364a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2366c(C10214a.a aVar) {
        aVar.m30571e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f2278b.m2376a()));
    }
}
