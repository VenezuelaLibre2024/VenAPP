package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.e0;
import androidx.camera.camera2.internal.compat.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y0 implements r0.b {

    /* renamed from: a, reason: collision with root package name */
    final CameraManager f1932a;

    /* renamed from: b, reason: collision with root package name */
    final Object f1933b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<CameraManager.AvailabilityCallback, r0.a> f1934a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Handler f1935b;

        a(Handler handler) {
            this.f1935b = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(Context context, Object obj) {
        this.f1932a = (CameraManager) context.getSystemService("camera");
        this.f1933b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y0 h(Context context, Handler handler) {
        return new y0(context, new a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.r0.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        r0.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f1933b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f1934a) {
                aVar = aVar2.f1934a.get(availabilityCallback);
                if (aVar == null) {
                    aVar = new r0.a(executor, availabilityCallback);
                    aVar2.f1934a.put(availabilityCallback, aVar);
                }
            }
        } else {
            aVar = null;
        }
        this.f1932a.registerAvailabilityCallback(aVar, aVar2.f1935b);
    }

    @Override // androidx.camera.camera2.internal.compat.r0.b
    public CameraCharacteristics b(String str) {
        try {
            return this.f1932a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.r0.b
    public Set<Set<String>> c() {
        return Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.r0.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        androidx.core.util.h.k(executor);
        androidx.core.util.h.k(stateCallback);
        try {
            this.f1932a.openCamera(str, new e0.b(executor, stateCallback), ((a) this.f1933b).f1935b);
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.r0.b
    public String[] e() {
        try {
            return this.f1932a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.r0.b
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        r0.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f1933b;
            synchronized (aVar2.f1934a) {
                aVar = aVar2.f1934a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g();
        }
        this.f1932a.unregisterAvailabilityCallback(aVar);
    }
}
