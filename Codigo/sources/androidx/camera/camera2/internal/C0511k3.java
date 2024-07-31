package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.InterfaceC0575x2;
import androidx.camera.camera2.internal.compat.C0421b;
import androidx.camera.camera2.internal.compat.C0428e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.k3 */
/* loaded from: classes.dex */
final class C0511k3 extends InterfaceC0575x2.a {

    /* renamed from: a */
    private final List<InterfaceC0575x2.a> f2418a;

    /* renamed from: androidx.camera.camera2.internal.k3$a */
    /* loaded from: classes.dex */
    static class a extends InterfaceC0575x2.a {

        /* renamed from: a */
        private final CameraCaptureSession.StateCallback f2419a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f2419a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(List<CameraCaptureSession.StateCallback> list) {
            this(C0519m1.m2554a(list));
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: a */
        public void mo2340a(InterfaceC0575x2 interfaceC0575x2) {
            this.f2419a.onActive(interfaceC0575x2.mo2351l().m2240c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: o */
        public void mo2354o(InterfaceC0575x2 interfaceC0575x2) {
            C0428e.m2218b(this.f2419a, interfaceC0575x2.mo2351l().m2240c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: p */
        public void mo2355p(InterfaceC0575x2 interfaceC0575x2) {
            this.f2419a.onClosed(interfaceC0575x2.mo2351l().m2240c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: q */
        public void mo2356q(InterfaceC0575x2 interfaceC0575x2) {
            this.f2419a.onConfigureFailed(interfaceC0575x2.mo2351l().m2240c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: r */
        public void mo2357r(InterfaceC0575x2 interfaceC0575x2) {
            this.f2419a.onConfigured(interfaceC0575x2.mo2351l().m2240c());
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: s */
        public void mo2358s(InterfaceC0575x2 interfaceC0575x2) {
            this.f2419a.onReady(interfaceC0575x2.mo2351l().m2240c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: t */
        public void mo2359t(InterfaceC0575x2 interfaceC0575x2) {
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: u */
        public void mo2360u(InterfaceC0575x2 interfaceC0575x2, Surface surface) {
            C0421b.m2206a(this.f2419a, interfaceC0575x2.mo2351l().m2240c(), surface);
        }
    }

    C0511k3(List<InterfaceC0575x2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f2418a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static InterfaceC0575x2.a m2544v(InterfaceC0575x2.a... aVarArr) {
        return new C0511k3(Arrays.asList(aVarArr));
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: a */
    public void mo2340a(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2340a(interfaceC0575x2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: o */
    public void mo2354o(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2354o(interfaceC0575x2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: p */
    public void mo2355p(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2355p(interfaceC0575x2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: q */
    public void mo2356q(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2356q(interfaceC0575x2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: r */
    public void mo2357r(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2357r(interfaceC0575x2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: s */
    public void mo2358s(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2358s(interfaceC0575x2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: t */
    public void mo2359t(InterfaceC0575x2 interfaceC0575x2) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2359t(interfaceC0575x2);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: u */
    public void mo2360u(InterfaceC0575x2 interfaceC0575x2, Surface surface) {
        Iterator<InterfaceC0575x2.a> it = this.f2418a.iterator();
        while (it.hasNext()) {
            it.next().mo2360u(interfaceC0575x2, surface);
        }
    }
}
