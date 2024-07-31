package sa;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ta.e f25432a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ta.e eVar) {
        this.f25432a = eVar;
    }

    public boolean a() {
        try {
            return this.f25432a.X0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean b() {
        try {
            return this.f25432a.m1();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean c() {
        try {
            return this.f25432a.E();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean d() {
        try {
            return this.f25432a.z0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean e() {
        try {
            return this.f25432a.Q1();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean f() {
        try {
            return this.f25432a.J0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean g() {
        try {
            return this.f25432a.p0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean h() {
        try {
            return this.f25432a.K0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f25432a.setCompassEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f25432a.setMapToolbarEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f25432a.setMyLocationButtonEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f25432a.setRotateGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void m(boolean z10) {
        try {
            this.f25432a.setScrollGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void n(boolean z10) {
        try {
            this.f25432a.setTiltGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void o(boolean z10) {
        try {
            this.f25432a.setZoomControlsEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void p(boolean z10) {
        try {
            this.f25432a.setZoomGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }
}
