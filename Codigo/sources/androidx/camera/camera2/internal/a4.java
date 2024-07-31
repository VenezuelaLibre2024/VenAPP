package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.y1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a4 implements w3 {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.camera2.internal.compat.d0 f1807a;

    /* renamed from: b, reason: collision with root package name */
    final f0.e f1808b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1809c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1810d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1811e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1812f;

    /* renamed from: g, reason: collision with root package name */
    androidx.camera.core.t f1813g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.k f1814h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.camera.core.impl.r0 f1815i;

    /* renamed from: j, reason: collision with root package name */
    ImageWriter f1816j;

    /* loaded from: classes.dex */
    class a extends CameraCaptureSession.StateCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                a4.this.f1816j = c0.a.c(inputSurface, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a4(androidx.camera.camera2.internal.compat.d0 d0Var) {
        this.f1811e = false;
        this.f1812f = false;
        this.f1807a = d0Var;
        this.f1811e = b4.a(d0Var, 4);
        this.f1812f = s.l.a(s.k0.class) != null;
        this.f1808b = new f0.e(3, new f0.c() { // from class: androidx.camera.camera2.internal.z3
            @Override // f0.c
            public final void a(Object obj) {
                ((androidx.camera.core.o) obj).close();
            }
        });
    }

    private void j() {
        f0.e eVar = this.f1808b;
        while (!eVar.c()) {
            eVar.a().close();
        }
        androidx.camera.core.impl.r0 r0Var = this.f1815i;
        if (r0Var != null) {
            androidx.camera.core.t tVar = this.f1813g;
            if (tVar != null) {
                r0Var.k().addListener(new y3(tVar), z.a.d());
                this.f1813g = null;
            }
            r0Var.d();
            this.f1815i = null;
        }
        ImageWriter imageWriter = this.f1816j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f1816j = null;
        }
    }

    private Map<Integer, Size> k(androidx.camera.camera2.internal.compat.d0 d0Var) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) d0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            w.o0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new androidx.camera.core.impl.utils.d(true));
                hashMap.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return hashMap;
    }

    private boolean l(androidx.camera.camera2.internal.compat.d0 d0Var, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) d0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(androidx.camera.core.impl.g1 g1Var) {
        try {
            androidx.camera.core.o b10 = g1Var.b();
            if (b10 != null) {
                this.f1808b.d(b10);
            }
        } catch (IllegalStateException e10) {
            w.o0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    @Override // androidx.camera.camera2.internal.w3
    public void a(y1.b bVar) {
        j();
        if (this.f1809c || this.f1812f) {
            return;
        }
        Map<Integer, Size> k10 = k(this.f1807a);
        if (this.f1811e && !k10.isEmpty() && k10.containsKey(34) && l(this.f1807a, 34)) {
            Size size = k10.get(34);
            androidx.camera.core.q qVar = new androidx.camera.core.q(size.getWidth(), size.getHeight(), 34, 9);
            this.f1814h = qVar.m();
            this.f1813g = new androidx.camera.core.t(qVar);
            qVar.f(new g1.a() { // from class: androidx.camera.camera2.internal.x3
                @Override // androidx.camera.core.impl.g1.a
                public final void a(androidx.camera.core.impl.g1 g1Var) {
                    a4.this.m(g1Var);
                }
            }, z.a.c());
            androidx.camera.core.impl.h1 h1Var = new androidx.camera.core.impl.h1(this.f1813g.getSurface(), new Size(this.f1813g.getWidth(), this.f1813g.getHeight()), 34);
            this.f1815i = h1Var;
            androidx.camera.core.t tVar = this.f1813g;
            com.google.common.util.concurrent.f<Void> k11 = h1Var.k();
            Objects.requireNonNull(tVar);
            k11.addListener(new y3(tVar), z.a.d());
            bVar.l(this.f1815i);
            bVar.d(this.f1814h);
            bVar.k(new a());
            bVar.s(new InputConfiguration(this.f1813g.getWidth(), this.f1813g.getHeight(), this.f1813g.c()));
        }
    }

    @Override // androidx.camera.camera2.internal.w3
    public boolean b() {
        return this.f1809c;
    }

    @Override // androidx.camera.camera2.internal.w3
    public void c(boolean z10) {
        this.f1810d = z10;
    }

    @Override // androidx.camera.camera2.internal.w3
    public void d(boolean z10) {
        this.f1809c = z10;
    }

    @Override // androidx.camera.camera2.internal.w3
    public androidx.camera.core.o e() {
        try {
            return this.f1808b.a();
        } catch (NoSuchElementException unused) {
            w.o0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.w3
    public boolean f(androidx.camera.core.o oVar) {
        Image k12 = oVar.k1();
        ImageWriter imageWriter = this.f1816j;
        if (imageWriter != null && k12 != null) {
            try {
                c0.a.d(imageWriter, k12);
                return true;
            } catch (IllegalStateException e10) {
                w.o0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.w3
    public boolean g() {
        return this.f1810d;
    }
}
