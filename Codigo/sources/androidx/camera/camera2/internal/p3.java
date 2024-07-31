package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.u;
import androidx.concurrent.futures.c;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    private final u f2156a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.r<Integer> f2157b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2158c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2159d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2160e;

    /* renamed from: f, reason: collision with root package name */
    c.a<Void> f2161f;

    /* renamed from: g, reason: collision with root package name */
    boolean f2162g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p3(u uVar, androidx.camera.camera2.internal.compat.d0 d0Var, Executor executor) {
        this.f2156a = uVar;
        this.f2159d = executor;
        Objects.requireNonNull(d0Var);
        this.f2158c = t.g.a(new l0(d0Var));
        this.f2157b = new androidx.lifecycle.r<>(0);
        uVar.t(new u.c() { // from class: androidx.camera.camera2.internal.n3
            @Override // androidx.camera.camera2.internal.u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean i10;
                i10 = p3.this.i(totalCaptureResult);
                return i10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h(final boolean z10, final c.a aVar) {
        this.f2159d.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o3
            @Override // java.lang.Runnable
            public final void run() {
                p3.this.g(aVar, z10);
            }
        });
        return "enableTorch: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f2161f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f2162g) {
                this.f2161f.c(null);
                this.f2161f = null;
            }
        }
        return false;
    }

    private <T> void k(androidx.lifecycle.r<T> rVar, T t10) {
        if (androidx.camera.core.impl.utils.q.c()) {
            rVar.setValue(t10);
        } else {
            rVar.postValue(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<Void> d(final boolean z10) {
        if (this.f2158c) {
            k(this.f2157b, Integer.valueOf(z10 ? 1 : 0));
            return androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.m3
                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object h10;
                    h10 = p3.this.h(z10, aVar);
                    return h10;
                }
            });
        }
        w.o0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return a0.f.f(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void g(c.a<Void> aVar, boolean z10) {
        if (!this.f2158c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f2160e) {
                k(this.f2157b, 0);
                if (aVar != null) {
                    aVar.f(new j.a("Camera is not active."));
                    return;
                }
                return;
            }
            this.f2162g = z10;
            this.f2156a.w(z10);
            k(this.f2157b, Integer.valueOf(z10 ? 1 : 0));
            c.a<Void> aVar2 = this.f2161f;
            if (aVar2 != null) {
                aVar2.f(new j.a("There is a new enableTorch being set"));
            }
            this.f2161f = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData<Integer> f() {
        return this.f2157b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(boolean z10) {
        if (this.f2160e == z10) {
            return;
        }
        this.f2160e = z10;
        if (z10) {
            return;
        }
        if (this.f2162g) {
            this.f2162g = false;
            this.f2156a.w(false);
            k(this.f2157b, 0);
        }
        c.a<Void> aVar = this.f2161f;
        if (aVar != null) {
            aVar.f(new j.a("Camera is not active."));
            this.f2161f = null;
        }
    }
}
