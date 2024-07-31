package p389v;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.concurrent.futures.C0742c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.Executor;
import p002a0.C0009f;
import p298q.C10214a;
import p407w.InterfaceC12016j;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C11597g {

    /* renamed from: c */
    private final C0557u f30166c;

    /* renamed from: d */
    final Executor f30167d;

    /* renamed from: g */
    C0742c.a<Void> f30170g;

    /* renamed from: a */
    private boolean f30164a = false;

    /* renamed from: b */
    private boolean f30165b = false;

    /* renamed from: e */
    final Object f30168e = new Object();

    /* renamed from: f */
    private C10214a.a f30169f = new C10214a.a();

    /* renamed from: h */
    private final C0557u.c f30171h = new C0557u.c() { // from class: v.d
        @Override // androidx.camera.camera2.internal.C0557u.c
        /* renamed from: a */
        public final boolean mo2390a(TotalCaptureResult totalCaptureResult) {
            boolean m36354q;
            m36354q = C11597g.this.m36354q(totalCaptureResult);
            return m36354q;
        }
    };

    public C11597g(C0557u c0557u, Executor executor) {
        this.f30166c = c0557u;
        this.f30167d = executor;
    }

    /* renamed from: h */
    private void m36348h(C11600j c11600j) {
        synchronized (this.f30168e) {
            for (InterfaceC0649n0.a<?> aVar : c11600j.mo3195e()) {
                this.f30169f.mo2932a().mo3178r(aVar, c11600j.mo3191a(aVar));
            }
        }
    }

    /* renamed from: j */
    private void m36349j() {
        synchronized (this.f30168e) {
            this.f30169f = new C10214a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m36351n(final C0742c.a aVar) {
        this.f30167d.execute(new Runnable() { // from class: v.e
            @Override // java.lang.Runnable
            public final void run() {
                C11597g.this.m36350m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m36353p(final C0742c.a aVar) {
        this.f30167d.execute(new Runnable() { // from class: v.f
            @Override // java.lang.Runnable
            public final void run() {
                C11597g.this.m36352o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean m36354q(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f30170g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.C0620f2
            if (r0 == 0) goto L32
            androidx.camera.core.impl.f2 r3 = (androidx.camera.core.impl.C0620f2) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.m3071d(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f30170g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r3 = r2.f30170g
            r2.f30170g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.m3756c(r1)
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389v.C11597g.m36354q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m36355r(boolean z10) {
        if (this.f30164a == z10) {
            return;
        }
        this.f30164a = z10;
        if (z10) {
            if (this.f30165b) {
                m36358v();
            }
        } else {
            C0742c.a<Void> aVar = this.f30170g;
            if (aVar != null) {
                aVar.m3758f(new InterfaceC12016j.a("The camera control has became inactive."));
                this.f30170g = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m36352o(C0742c.a<Void> aVar) {
        this.f30165b = true;
        C0742c.a<Void> aVar2 = this.f30170g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f30170g = aVar;
        if (this.f30164a) {
            m36358v();
        }
        if (aVar2 != null) {
            aVar2.m3758f(new InterfaceC12016j.a("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: v */
    private void m36358v() {
        this.f30166c.m2727d0();
        this.f30165b = false;
    }

    /* renamed from: g */
    public InterfaceFutureC5920f<Void> m36359g(C11600j c11600j) {
        m36348h(c11600j);
        return C0009f.m24j(C0742c.m3752a(new C0742c.c() { // from class: v.c
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m36351n;
                m36351n = C11597g.this.m36351n(aVar);
                return m36351n;
            }
        }));
    }

    /* renamed from: i */
    public InterfaceFutureC5920f<Void> m36360i() {
        m36349j();
        return C0009f.m24j(C0742c.m3752a(new C0742c.c() { // from class: v.b
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m36353p;
                m36353p = C11597g.this.m36353p(aVar);
                return m36353p;
            }
        }));
    }

    /* renamed from: k */
    public C10214a m36361k() {
        C10214a m30569c;
        synchronized (this.f30168e) {
            if (this.f30170g != null) {
                this.f30169f.mo2932a().mo3178r(C10214a.f25251N, Integer.valueOf(this.f30170g.hashCode()));
            }
            m30569c = this.f30169f.m30569c();
        }
        return m30569c;
    }

    /* renamed from: l */
    public C0557u.c m36362l() {
        return this.f30171h;
    }

    /* renamed from: s */
    public void m36363s(final boolean z10) {
        this.f30167d.execute(new Runnable() { // from class: v.a
            @Override // java.lang.Runnable
            public final void run() {
                C11597g.this.m36355r(z10);
            }
        });
    }
}
