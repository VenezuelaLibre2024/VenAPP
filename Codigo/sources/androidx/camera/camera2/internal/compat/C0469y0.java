package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C0429e0;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.core.util.C0984h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.y0 */
/* loaded from: classes.dex */
public class C0469y0 implements C0455r0.b {

    /* renamed from: a */
    final CameraManager f2235a;

    /* renamed from: b */
    final Object f2236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.compat.y0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final Map<CameraManager.AvailabilityCallback, C0455r0.a> f2237a = new HashMap();

        /* renamed from: b */
        final Handler f2238b;

        a(Handler handler) {
            this.f2238b = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0469y0(Context context, Object obj) {
        this.f2235a = (CameraManager) context.getSystemService("camera");
        this.f2236b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C0469y0 m2305h(Context context, Handler handler) {
        return new C0469y0(context, new a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: a */
    public void mo2290a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        C0455r0.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f2236b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f2237a) {
                aVar = aVar2.f2237a.get(availabilityCallback);
                if (aVar == null) {
                    aVar = new C0455r0.a(executor, availabilityCallback);
                    aVar2.f2237a.put(availabilityCallback, aVar);
                }
            }
        } else {
            aVar = null;
        }
        this.f2235a.registerAvailabilityCallback(aVar, aVar2.f2238b);
    }

    @Override // androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: b */
    public CameraCharacteristics mo2291b(String str) {
        try {
            return this.f2235a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: c */
    public Set<Set<String>> mo2292c() {
        return Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: d */
    public void mo2293d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        C0984h.m4833k(executor);
        C0984h.m4833k(stateCallback);
        try {
            this.f2235a.openCamera(str, new C0429e0.b(executor, stateCallback), ((a) this.f2236b).f2238b);
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: e */
    public String[] mo2294e() {
        try {
            return this.f2235a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: f */
    public void mo2295f(CameraManager.AvailabilityCallback availabilityCallback) {
        C0455r0.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f2236b;
            synchronized (aVar2.f2237a) {
                aVar = aVar2.f2237a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.m2288g();
        }
        this.f2235a.unregisterAvailabilityCallback(aVar);
    }
}
