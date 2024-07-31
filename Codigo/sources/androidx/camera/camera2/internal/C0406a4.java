package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.C0712q;
import androidx.camera.core.C0715t;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0627h1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.camera.core.impl.utils.C0675d;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p032c0.C1826a;
import p092f0.C7265e;
import p092f0.InterfaceC7263c;
import p342s.C10749k0;
import p342s.C10750l;
import p407w.C12029o0;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.a4 */
/* loaded from: classes.dex */
public final class C0406a4 implements InterfaceC0571w3 {

    /* renamed from: a */
    private final C0427d0 f2110a;

    /* renamed from: b */
    final C7265e f2111b;

    /* renamed from: c */
    private boolean f2112c = false;

    /* renamed from: d */
    private boolean f2113d = false;

    /* renamed from: e */
    private boolean f2114e;

    /* renamed from: f */
    private boolean f2115f;

    /* renamed from: g */
    C0715t f2116g;

    /* renamed from: h */
    private AbstractC0637k f2117h;

    /* renamed from: i */
    private AbstractC0661r0 f2118i;

    /* renamed from: j */
    ImageWriter f2119j;

    /* renamed from: androidx.camera.camera2.internal.a4$a */
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
                C0406a4.this.f2119j = C1826a.m9830c(inputSurface, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0406a4(C0427d0 c0427d0) {
        this.f2114e = false;
        this.f2115f = false;
        this.f2110a = c0427d0;
        this.f2114e = C0412b4.m2192a(c0427d0, 4);
        this.f2115f = C10750l.m32699a(C10749k0.class) != null;
        this.f2111b = new C7265e(3, new InterfaceC7263c() { // from class: androidx.camera.camera2.internal.z3
            @Override // p092f0.InterfaceC7263c
            /* renamed from: a */
            public final void mo2864a(Object obj) {
                ((InterfaceC0710o) obj).close();
            }
        });
    }

    /* renamed from: j */
    private void m2170j() {
        C7265e c7265e = this.f2111b;
        while (!c7265e.m21729c()) {
            c7265e.m21727a().close();
        }
        AbstractC0661r0 abstractC0661r0 = this.f2118i;
        if (abstractC0661r0 != null) {
            C0715t c0715t = this.f2116g;
            if (c0715t != null) {
                abstractC0661r0.m3230k().addListener(new RunnableC0581y3(c0715t), C12747a.m42283d());
                this.f2116g = null;
            }
            abstractC0661r0.m3223d();
            this.f2118i = null;
        }
        ImageWriter imageWriter = this.f2119j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f2119j = null;
        }
    }

    /* renamed from: k */
    private Map<Integer, Size> m2171k(C0427d0 c0427d0) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c0427d0.m2215a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            C12029o0.m38640c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new C0675d(true));
                hashMap.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private boolean m2172l(C0427d0 c0427d0, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0427d0.m2215a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
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
    /* renamed from: m */
    public /* synthetic */ void m2173m(InterfaceC0623g1 interfaceC0623g1) {
        try {
            InterfaceC0710o mo2894b = interfaceC0623g1.mo2894b();
            if (mo2894b != null) {
                this.f2111b.m21739d(mo2894b);
            }
        } catch (IllegalStateException e10) {
            C12029o0.m38640c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: a */
    public void mo2175a(C0701y1.b bVar) {
        m2170j();
        if (this.f2112c || this.f2115f) {
            return;
        }
        Map<Integer, Size> m2171k = m2171k(this.f2110a);
        if (this.f2114e && !m2171k.isEmpty() && m2171k.containsKey(34) && m2172l(this.f2110a, 34)) {
            Size size = m2171k.get(34);
            C0712q c0712q = new C0712q(size.getWidth(), size.getHeight(), 34, 9);
            this.f2117h = c0712q.m3495m();
            this.f2116g = new C0715t(c0712q);
            c0712q.mo2898f(new InterfaceC0623g1.a() { // from class: androidx.camera.camera2.internal.x3
                @Override // androidx.camera.core.impl.InterfaceC0623g1.a
                /* renamed from: a */
                public final void mo2863a(InterfaceC0623g1 interfaceC0623g1) {
                    C0406a4.this.m2173m(interfaceC0623g1);
                }
            }, C12747a.m42282c());
            C0627h1 c0627h1 = new C0627h1(this.f2116g.getSurface(), new Size(this.f2116g.getWidth(), this.f2116g.getHeight()), 34);
            this.f2118i = c0627h1;
            C0715t c0715t = this.f2116g;
            InterfaceFutureC5920f<Void> m3230k = c0627h1.m3230k();
            Objects.requireNonNull(c0715t);
            m3230k.addListener(new RunnableC0581y3(c0715t), C12747a.m42283d());
            bVar.m3403l(this.f2118i);
            bVar.m3395d(this.f2117h);
            bVar.m3402k(new a());
            bVar.m3409s(new InputConfiguration(this.f2116g.getWidth(), this.f2116g.getHeight(), this.f2116g.mo2895c()));
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: b */
    public boolean mo2176b() {
        return this.f2112c;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: c */
    public void mo2177c(boolean z10) {
        this.f2113d = z10;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: d */
    public void mo2178d(boolean z10) {
        this.f2112c = z10;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: e */
    public InterfaceC0710o mo2179e() {
        try {
            return this.f2111b.m21727a();
        } catch (NoSuchElementException unused) {
            C12029o0.m38640c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: f */
    public boolean mo2180f(InterfaceC0710o interfaceC0710o) {
        Image mo2884k1 = interfaceC0710o.mo2884k1();
        ImageWriter imageWriter = this.f2119j;
        if (imageWriter != null && mo2884k1 != null) {
            try {
                C1826a.m9831d(imageWriter, mo2884k1);
                return true;
            } catch (IllegalStateException e10) {
                C12029o0.m38640c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0571w3
    /* renamed from: g */
    public boolean mo2181g() {
        return this.f2113d;
    }
}
