package p354t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0528o0;
import androidx.camera.camera2.internal.InterfaceC0575x2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0668t1;
import androidx.concurrent.futures.C0742c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p320r.C10574w;
import p342s.C10744i;
import p354t.C10960y;
import p474z.C12747a;

/* renamed from: t.y */
/* loaded from: classes.dex */
public class C10960y {

    /* renamed from: a */
    private final boolean f27863a;

    /* renamed from: c */
    private final InterfaceFutureC5920f<Void> f27865c;

    /* renamed from: d */
    C0742c.a<Void> f27866d;

    /* renamed from: e */
    private boolean f27867e;

    /* renamed from: b */
    private final Object f27864b = new Object();

    /* renamed from: f */
    private final CameraCaptureSession.CaptureCallback f27868f = new a();

    /* renamed from: t.y$a */
    /* loaded from: classes.dex */
    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            C0742c.a<Void> aVar = C10960y.this.f27866d;
            if (aVar != null) {
                aVar.m3757d();
                C10960y.this.f27866d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            C0742c.a<Void> aVar = C10960y.this.f27866d;
            if (aVar != null) {
                aVar.m3756c(null);
                C10960y.this.f27866d = null;
            }
        }
    }

    @FunctionalInterface
    /* renamed from: t.y$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceFutureC5920f<Void> mo2391a(CameraDevice cameraDevice, C10574w c10574w, List<AbstractC0661r0> list);
    }

    @FunctionalInterface
    /* renamed from: t.y$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo2367a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public C10960y(C0668t1 c0668t1) {
        this.f27863a = c0668t1.m3237a(C10744i.class);
        this.f27865c = m33448i() ? C0742c.m3752a(new C0742c.c() { // from class: t.w
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m33442d;
                m33442d = C10960y.this.m33442d(aVar);
                return m33442d;
            }
        }) : C0009f.m22h(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m33442d(C0742c.a aVar) {
        this.f27866d = aVar;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    /* renamed from: c */
    public InterfaceFutureC5920f<Void> m33444c() {
        return C0009f.m24j(this.f27865c);
    }

    /* renamed from: f */
    public void m33445f() {
        synchronized (this.f27864b) {
            if (m33448i() && !this.f27867e) {
                this.f27865c.cancel(true);
            }
        }
    }

    /* renamed from: g */
    public InterfaceFutureC5920f<Void> m33446g(final CameraDevice cameraDevice, final C10574w c10574w, final List<AbstractC0661r0> list, List<InterfaceC0575x2> list2, final b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC0575x2> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo2352m());
        }
        return C0007d.m9a(C0009f.m28n(arrayList)).m13e(new InterfaceC0004a() { // from class: t.x
            @Override // p002a0.InterfaceC0004a
            public final InterfaceFutureC5920f apply(Object obj) {
                InterfaceFutureC5920f mo2391a;
                mo2391a = C10960y.b.this.mo2391a(cameraDevice, c10574w, list);
                return mo2391a;
            }
        }, C12747a.m42280a());
    }

    /* renamed from: h */
    public int m33447h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) {
        int mo2367a;
        synchronized (this.f27864b) {
            if (m33448i()) {
                captureCallback = C0528o0.m2592b(this.f27868f, captureCallback);
                this.f27867e = true;
            }
            mo2367a = cVar.mo2367a(captureRequest, captureCallback);
        }
        return mo2367a;
    }

    /* renamed from: i */
    public boolean m33448i() {
        return this.f27863a;
    }
}
