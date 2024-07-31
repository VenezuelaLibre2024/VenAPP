package sa;

import android.os.RemoteException;
import p365ta.InterfaceC11201e;
import ua.C11518v;

/* renamed from: sa.i */
/* loaded from: classes2.dex */
public final class C10864i {

    /* renamed from: a */
    private final InterfaceC11201e f27551a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10864i(InterfaceC11201e interfaceC11201e) {
        this.f27551a = interfaceC11201e;
    }

    /* renamed from: a */
    public boolean m33159a() {
        try {
            return this.f27551a.mo35057X0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public boolean m33160b() {
        try {
            return this.f27551a.mo35058m1();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public boolean m33161c() {
        try {
            return this.f27551a.mo35053E();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public boolean m33162d() {
        try {
            return this.f27551a.mo35060z0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public boolean m33163e() {
        try {
            return this.f27551a.mo35056Q1();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public boolean m33164f() {
        try {
            return this.f27551a.mo35054J0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public boolean m33165g() {
        try {
            return this.f27551a.mo35059p0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public boolean m33166h() {
        try {
            return this.f27551a.mo35055K0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public void m33167i(boolean z10) {
        try {
            this.f27551a.setCompassEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public void m33168j(boolean z10) {
        try {
            this.f27551a.setMapToolbarEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public void m33169k(boolean z10) {
        try {
            this.f27551a.setMyLocationButtonEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: l */
    public void m33170l(boolean z10) {
        try {
            this.f27551a.setRotateGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: m */
    public void m33171m(boolean z10) {
        try {
            this.f27551a.setScrollGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: n */
    public void m33172n(boolean z10) {
        try {
            this.f27551a.setTiltGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: o */
    public void m33173o(boolean z10) {
        try {
            this.f27551a.setZoomControlsEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: p */
    public void m33174p(boolean z10) {
        try {
            this.f27551a.setZoomGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
