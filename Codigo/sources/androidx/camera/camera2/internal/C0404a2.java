package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.a2 */
/* loaded from: classes.dex */
public class C0404a2 {

    /* renamed from: a */
    final Executor f2101a;

    /* renamed from: b */
    final Object f2102b = new Object();

    /* renamed from: c */
    final Set<InterfaceC0575x2> f2103c = new LinkedHashSet();

    /* renamed from: d */
    final Set<InterfaceC0575x2> f2104d = new LinkedHashSet();

    /* renamed from: e */
    final Set<InterfaceC0575x2> f2105e = new LinkedHashSet();

    /* renamed from: f */
    private final CameraDevice.StateCallback f2106f = new a();

    /* renamed from: androidx.camera.camera2.internal.a2$a */
    /* loaded from: classes.dex */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        /* renamed from: b */
        private void m2165b() {
            List<InterfaceC0575x2> m2158g;
            synchronized (C0404a2.this.f2102b) {
                m2158g = C0404a2.this.m2158g();
                C0404a2.this.f2105e.clear();
                C0404a2.this.f2103c.clear();
                C0404a2.this.f2104d.clear();
            }
            Iterator<InterfaceC0575x2> it = m2158g.iterator();
            while (it.hasNext()) {
                it.next().mo2344e();
            }
        }

        /* renamed from: c */
        private void m2166c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C0404a2.this.f2102b) {
                linkedHashSet.addAll(C0404a2.this.f2105e);
                linkedHashSet.addAll(C0404a2.this.f2103c);
            }
            C0404a2.this.f2101a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z1
                @Override // java.lang.Runnable
                public final void run() {
                    C0404a2.m2153b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m2165b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m2166c();
            m2165b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            m2166c();
            m2165b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0404a2(Executor executor) {
        this.f2101a = executor;
    }

    /* renamed from: a */
    private void m2152a(InterfaceC0575x2 interfaceC0575x2) {
        InterfaceC0575x2 next;
        Iterator<InterfaceC0575x2> it = m2158g().iterator();
        while (it.hasNext() && (next = it.next()) != interfaceC0575x2) {
            next.mo2344e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2153b(Set<InterfaceC0575x2> set) {
        for (InterfaceC0575x2 interfaceC0575x2 : set) {
            interfaceC0575x2.mo2342c().mo2355p(interfaceC0575x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CameraDevice.StateCallback m2154c() {
        return this.f2106f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<InterfaceC0575x2> m2155d() {
        ArrayList arrayList;
        synchronized (this.f2102b) {
            arrayList = new ArrayList(this.f2103c);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public List<InterfaceC0575x2> m2156e() {
        ArrayList arrayList;
        synchronized (this.f2102b) {
            arrayList = new ArrayList(this.f2104d);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<InterfaceC0575x2> m2157f() {
        ArrayList arrayList;
        synchronized (this.f2102b) {
            arrayList = new ArrayList(this.f2105e);
        }
        return arrayList;
    }

    /* renamed from: g */
    List<InterfaceC0575x2> m2158g() {
        ArrayList arrayList;
        synchronized (this.f2102b) {
            arrayList = new ArrayList();
            arrayList.addAll(m2155d());
            arrayList.addAll(m2157f());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2159h(InterfaceC0575x2 interfaceC0575x2) {
        synchronized (this.f2102b) {
            this.f2103c.remove(interfaceC0575x2);
            this.f2104d.remove(interfaceC0575x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m2160i(InterfaceC0575x2 interfaceC0575x2) {
        synchronized (this.f2102b) {
            this.f2104d.add(interfaceC0575x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m2161j(InterfaceC0575x2 interfaceC0575x2) {
        m2152a(interfaceC0575x2);
        synchronized (this.f2102b) {
            this.f2105e.remove(interfaceC0575x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m2162k(InterfaceC0575x2 interfaceC0575x2) {
        synchronized (this.f2102b) {
            this.f2103c.add(interfaceC0575x2);
            this.f2105e.remove(interfaceC0575x2);
        }
        m2152a(interfaceC0575x2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m2163l(InterfaceC0575x2 interfaceC0575x2) {
        synchronized (this.f2102b) {
            this.f2105e.add(interfaceC0575x2);
        }
    }
}
