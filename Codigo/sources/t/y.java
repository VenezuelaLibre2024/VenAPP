package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.o0;
import androidx.camera.camera2.internal.x2;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.t1;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.y;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a */
    private final boolean f25719a;

    /* renamed from: c */
    private final com.google.common.util.concurrent.f<Void> f25721c;

    /* renamed from: d */
    c.a<Void> f25722d;

    /* renamed from: e */
    private boolean f25723e;

    /* renamed from: b */
    private final Object f25720b = new Object();

    /* renamed from: f */
    private final CameraCaptureSession.CaptureCallback f25724f = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            c.a<Void> aVar = y.this.f25722d;
            if (aVar != null) {
                aVar.d();
                y.this.f25722d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            c.a<Void> aVar = y.this.f25722d;
            if (aVar != null) {
                aVar.c(null);
                y.this.f25722d = null;
            }
        }
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface b {
        com.google.common.util.concurrent.f<Void> a(CameraDevice cameraDevice, r.w wVar, List<r0> list);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface c {
        int a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public y(t1 t1Var) {
        this.f25719a = t1Var.a(s.i.class);
        this.f25721c = i() ? androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: t.w
            public /* synthetic */ w() {
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = y.this.d(aVar);
                return d10;
            }
        }) : a0.f.h(null);
    }

    public /* synthetic */ Object d(c.a aVar) {
        this.f25722d = aVar;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    public com.google.common.util.concurrent.f<Void> c() {
        return a0.f.j(this.f25721c);
    }

    public void f() {
        synchronized (this.f25720b) {
            if (i() && !this.f25723e) {
                this.f25721c.cancel(true);
            }
        }
    }

    public com.google.common.util.concurrent.f<Void> g(CameraDevice cameraDevice, r.w wVar, List<r0> list, List<x2> list2, b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<x2> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        return a0.d.a(a0.f.n(arrayList)).e(new a0.a() { // from class: t.x

            /* renamed from: b */
            public final /* synthetic */ CameraDevice f25716b;

            /* renamed from: c */
            public final /* synthetic */ r.w f25717c;

            /* renamed from: d */
            public final /* synthetic */ List f25718d;

            public /* synthetic */ x(CameraDevice cameraDevice2, r.w wVar2, List list3) {
                r2 = cameraDevice2;
                r3 = wVar2;
                r4 = list3;
            }

            @Override // a0.a
            public final com.google.common.util.concurrent.f apply(Object obj) {
                com.google.common.util.concurrent.f a10;
                a10 = y.b.this.a(r2, r3, r4);
                return a10;
            }
        }, z.a.a());
    }

    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) {
        int a10;
        synchronized (this.f25720b) {
            if (i()) {
                captureCallback = o0.b(this.f25724f, captureCallback);
                this.f25723e = true;
            }
            a10 = cVar.a(captureRequest, captureCallback);
        }
        return a10;
    }

    public boolean i() {
        return this.f25719a;
    }
}
