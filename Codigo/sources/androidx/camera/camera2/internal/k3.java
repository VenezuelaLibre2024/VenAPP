package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class k3 extends x2.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<x2.a> f2098a;

    /* loaded from: classes.dex */
    static class a extends x2.a {

        /* renamed from: a, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f2099a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f2099a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(List<CameraCaptureSession.StateCallback> list) {
            this(m1.a(list));
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void a(x2 x2Var) {
            this.f2099a.onActive(x2Var.l().c());
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void o(x2 x2Var) {
            androidx.camera.camera2.internal.compat.e.b(this.f2099a, x2Var.l().c());
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void p(x2 x2Var) {
            this.f2099a.onClosed(x2Var.l().c());
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void q(x2 x2Var) {
            this.f2099a.onConfigureFailed(x2Var.l().c());
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void r(x2 x2Var) {
            this.f2099a.onConfigured(x2Var.l().c());
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void s(x2 x2Var) {
            this.f2099a.onReady(x2Var.l().c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.camera2.internal.x2.a
        public void t(x2 x2Var) {
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void u(x2 x2Var, Surface surface) {
            androidx.camera.camera2.internal.compat.b.a(this.f2099a, x2Var.l().c(), surface);
        }
    }

    k3(List<x2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f2098a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x2.a v(x2.a... aVarArr) {
        return new k3(Arrays.asList(aVarArr));
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void a(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().a(x2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void o(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().o(x2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void p(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().p(x2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void q(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().q(x2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void r(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().r(x2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void s(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().s(x2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.x2.a
    public void t(x2 x2Var) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().t(x2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void u(x2 x2Var, Surface surface) {
        Iterator<x2.a> it = this.f2098a.iterator();
        while (it.hasNext()) {
            it.next().u(x2Var, surface);
        }
    }
}
