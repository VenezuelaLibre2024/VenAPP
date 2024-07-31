package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.utils.C0688q;
import androidx.concurrent.futures.C0742c;
import androidx.lifecycle.C1320r;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002a0.C0009f;
import p354t.C10942g;
import p407w.C12029o0;
import p407w.InterfaceC12016j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.p3 */
/* loaded from: classes.dex */
public final class C0536p3 {

    /* renamed from: a */
    private final C0557u f2477a;

    /* renamed from: b */
    private final C1320r<Integer> f2478b;

    /* renamed from: c */
    private final boolean f2479c;

    /* renamed from: d */
    private final Executor f2480d;

    /* renamed from: e */
    private boolean f2481e;

    /* renamed from: f */
    C0742c.a<Void> f2482f;

    /* renamed from: g */
    boolean f2483g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0536p3(C0557u c0557u, C0427d0 c0427d0, Executor executor) {
        this.f2477a = c0557u;
        this.f2480d = executor;
        Objects.requireNonNull(c0427d0);
        this.f2479c = C10942g.m33414a(new C0513l0(c0427d0));
        this.f2478b = new C1320r<>(0);
        c0557u.m2736t(new C0557u.c() { // from class: androidx.camera.camera2.internal.n3
            @Override // androidx.camera.camera2.internal.C0557u.c
            /* renamed from: a */
            public final boolean mo2390a(TotalCaptureResult totalCaptureResult) {
                boolean m2604i;
                m2604i = C0536p3.this.m2604i(totalCaptureResult);
                return m2604i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m2603h(final boolean z10, final C0742c.a aVar) {
        this.f2480d.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o3
            @Override // java.lang.Runnable
            public final void run() {
                C0536p3.this.m2602g(aVar, z10);
            }
        });
        return "enableTorch: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ boolean m2604i(TotalCaptureResult totalCaptureResult) {
        if (this.f2482f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f2483g) {
                this.f2482f.m3756c(null);
                this.f2482f = null;
            }
        }
        return false;
    }

    /* renamed from: k */
    private <T> void m2605k(C1320r<T> c1320r, T t10) {
        if (C0688q.m3341c()) {
            c1320r.setValue(t10);
        } else {
            c1320r.postValue(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceFutureC5920f<Void> m2606d(final boolean z10) {
        if (this.f2479c) {
            m2605k(this.f2478b, Integer.valueOf(z10 ? 1 : 0));
            return C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.m3
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m2603h;
                    m2603h = C0536p3.this.m2603h(z10, aVar);
                    return m2603h;
                }
            });
        }
        C12029o0.m38638a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return C0009f.m20f(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m2602g(C0742c.a<Void> aVar, boolean z10) {
        if (!this.f2479c) {
            if (aVar != null) {
                aVar.m3758f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f2481e) {
                m2605k(this.f2478b, 0);
                if (aVar != null) {
                    aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
                    return;
                }
                return;
            }
            this.f2483g = z10;
            this.f2477a.m2739w(z10);
            m2605k(this.f2478b, Integer.valueOf(z10 ? 1 : 0));
            C0742c.a<Void> aVar2 = this.f2482f;
            if (aVar2 != null) {
                aVar2.m3758f(new InterfaceC12016j.a("There is a new enableTorch being set"));
            }
            this.f2482f = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public LiveData<Integer> m2608f() {
        return this.f2478b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m2609j(boolean z10) {
        if (this.f2481e == z10) {
            return;
        }
        this.f2481e = z10;
        if (z10) {
            return;
        }
        if (this.f2483g) {
            this.f2483g = false;
            this.f2477a.m2739w(false);
            m2605k(this.f2478b, 0);
        }
        C0742c.a<Void> aVar = this.f2482f;
        if (aVar != null) {
            aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
            this.f2482f = null;
        }
    }
}
