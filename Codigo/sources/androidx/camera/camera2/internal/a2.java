package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a2 {

    /* renamed from: a, reason: collision with root package name */
    final Executor f1798a;

    /* renamed from: b, reason: collision with root package name */
    final Object f1799b = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Set<x2> f1800c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    final Set<x2> f1801d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    final Set<x2> f1802e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f1803f = new a();

    /* loaded from: classes.dex */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        private void b() {
            List<x2> g10;
            synchronized (a2.this.f1799b) {
                g10 = a2.this.g();
                a2.this.f1802e.clear();
                a2.this.f1800c.clear();
                a2.this.f1801d.clear();
            }
            Iterator<x2> it = g10.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }

        private void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (a2.this.f1799b) {
                linkedHashSet.addAll(a2.this.f1802e);
                linkedHashSet.addAll(a2.this.f1800c);
            }
            a2.this.f1798a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z1
                @Override // java.lang.Runnable
                public final void run() {
                    a2.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(Executor executor) {
        this.f1798a = executor;
    }

    private void a(x2 x2Var) {
        x2 next;
        Iterator<x2> it = g().iterator();
        while (it.hasNext() && (next = it.next()) != x2Var) {
            next.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Set<x2> set) {
        for (x2 x2Var : set) {
            x2Var.c().p(x2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraDevice.StateCallback c() {
        return this.f1803f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<x2> d() {
        ArrayList arrayList;
        synchronized (this.f1799b) {
            arrayList = new ArrayList(this.f1800c);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<x2> e() {
        ArrayList arrayList;
        synchronized (this.f1799b) {
            arrayList = new ArrayList(this.f1801d);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<x2> f() {
        ArrayList arrayList;
        synchronized (this.f1799b) {
            arrayList = new ArrayList(this.f1802e);
        }
        return arrayList;
    }

    List<x2> g() {
        ArrayList arrayList;
        synchronized (this.f1799b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(x2 x2Var) {
        synchronized (this.f1799b) {
            this.f1800c.remove(x2Var);
            this.f1801d.remove(x2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(x2 x2Var) {
        synchronized (this.f1799b) {
            this.f1801d.add(x2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(x2 x2Var) {
        a(x2Var);
        synchronized (this.f1799b) {
            this.f1802e.remove(x2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(x2 x2Var) {
        synchronized (this.f1799b) {
            this.f1800c.add(x2Var);
            this.f1802e.remove(x2Var);
        }
        a(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(x2 x2Var) {
        synchronized (this.f1799b) {
            this.f1802e.add(x2Var);
        }
    }
}
