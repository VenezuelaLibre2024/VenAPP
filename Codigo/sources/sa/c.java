package sa;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;
import ua.b0;
import ua.c0;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a */
    private final ta.b f25423a;

    /* renamed from: b */
    private final Map f25424b = new HashMap();

    /* renamed from: c */
    private final Map f25425c = new HashMap();

    /* renamed from: d */
    private sa.i f25426d;

    /* loaded from: classes2.dex */
    public interface a {
        void onCameraIdle();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onCameraMove();
    }

    /* renamed from: sa.c$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC0424c {
        void onCameraMoveStarted(int i10);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void onCircleClick(ua.f fVar);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void onInfoWindowClick(ua.m mVar);
    }

    /* loaded from: classes2.dex */
    public interface f {
        void onMapClick(LatLng latLng);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void onMapLongClick(LatLng latLng);
    }

    /* loaded from: classes2.dex */
    public interface h {
        boolean onMarkerClick(ua.m mVar);
    }

    /* loaded from: classes2.dex */
    public interface i {
        void onMarkerDrag(ua.m mVar);

        void onMarkerDragEnd(ua.m mVar);

        void onMarkerDragStart(ua.m mVar);
    }

    /* loaded from: classes2.dex */
    public interface j {
        void onPolygonClick(ua.q qVar);
    }

    /* loaded from: classes2.dex */
    public interface k {
        void onPolylineClick(ua.s sVar);
    }

    /* loaded from: classes2.dex */
    public interface l {
        void onSnapshotReady(Bitmap bitmap);
    }

    public c(ta.b bVar) {
        this.f25423a = (ta.b) com.google.android.gms.common.internal.s.j(bVar);
    }

    public final void A(d dVar) {
        try {
            if (dVar == null) {
                this.f25423a.O1(null);
            } else {
                this.f25423a.O1(new q(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void B(e eVar) {
        try {
            if (eVar == null) {
                this.f25423a.Y(null);
            } else {
                this.f25423a.Y(new p(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void C(f fVar) {
        try {
            if (fVar == null) {
                this.f25423a.F(null);
            } else {
                this.f25423a.F(new x(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void D(g gVar) {
        try {
            if (gVar == null) {
                this.f25423a.B0(null);
            } else {
                this.f25423a.B0(new sa.k(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void E(h hVar) {
        try {
            if (hVar == null) {
                this.f25423a.e1(null);
            } else {
                this.f25423a.e1(new sa.j(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void F(i iVar) {
        try {
            if (iVar == null) {
                this.f25423a.I(null);
            } else {
                this.f25423a.I(new o(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void G(j jVar) {
        try {
            if (jVar == null) {
                this.f25423a.w0(null);
            } else {
                this.f25423a.w0(new r(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void H(k kVar) {
        try {
            if (kVar == null) {
                this.f25423a.a2(null);
            } else {
                this.f25423a.a2(new s(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void I(int i10, int i11, int i12, int i13) {
        try {
            this.f25423a.H0(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void J(boolean z10) {
        try {
            this.f25423a.setTrafficEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void K(l lVar) {
        com.google.android.gms.common.internal.s.k(lVar, "Callback must not be null.");
        L(lVar, null);
    }

    public final void L(l lVar, Bitmap bitmap) {
        com.google.android.gms.common.internal.s.k(lVar, "Callback must not be null.");
        try {
            this.f25423a.C(new t(this, lVar), (com.google.android.gms.dynamic.d) (bitmap != null ? com.google.android.gms.dynamic.d.h2(bitmap) : null));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final ua.f a(ua.g gVar) {
        try {
            com.google.android.gms.common.internal.s.k(gVar, "CircleOptions must not be null.");
            return new ua.f(this.f25423a.M1(gVar));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final ua.m b(ua.n nVar) {
        try {
            com.google.android.gms.common.internal.s.k(nVar, "MarkerOptions must not be null.");
            zzad h10 = this.f25423a.h(nVar);
            if (h10 != null) {
                return nVar.zzb() == 1 ? new ua.a(h10) : new ua.m(h10);
            }
            return null;
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final ua.q c(ua.r rVar) {
        try {
            com.google.android.gms.common.internal.s.k(rVar, "PolygonOptions must not be null");
            return new ua.q(this.f25423a.y0(rVar));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final ua.s d(ua.t tVar) {
        try {
            com.google.android.gms.common.internal.s.k(tVar, "PolylineOptions must not be null");
            return new ua.s(this.f25423a.o(tVar));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final b0 e(c0 c0Var) {
        try {
            com.google.android.gms.common.internal.s.k(c0Var, "TileOverlayOptions must not be null.");
            zzam d02 = this.f25423a.d0(c0Var);
            if (d02 != null) {
                return new b0(d02);
            }
            return null;
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void f(sa.a aVar) {
        try {
            com.google.android.gms.common.internal.s.k(aVar, "CameraUpdate must not be null.");
            this.f25423a.f0(aVar.a());
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final CameraPosition g() {
        try {
            return this.f25423a.z();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final float h() {
        try {
            return this.f25423a.k0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final float i() {
        try {
            return this.f25423a.u0();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final sa.h j() {
        try {
            return new sa.h(this.f25423a.c0());
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final sa.i k() {
        try {
            if (this.f25426d == null) {
                this.f25426d = new sa.i(this.f25423a.z1());
            }
            return this.f25426d;
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final boolean l() {
        try {
            return this.f25423a.D1();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final boolean m() {
        try {
            return this.f25423a.c1();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void n(sa.a aVar) {
        try {
            com.google.android.gms.common.internal.s.k(aVar, "CameraUpdate must not be null.");
            this.f25423a.O0(aVar.a());
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void o() {
        try {
            this.f25423a.s1();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void p(boolean z10) {
        try {
            this.f25423a.setBuildingsEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final boolean q(boolean z10) {
        try {
            return this.f25423a.setIndoorEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void r(LatLngBounds latLngBounds) {
        try {
            this.f25423a.n(latLngBounds);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public boolean s(ua.l lVar) {
        try {
            return this.f25423a.l1(lVar);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void t(int i10) {
        try {
            this.f25423a.setMapType(i10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void u(float f10) {
        try {
            this.f25423a.L(f10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public void v(float f10) {
        try {
            this.f25423a.i1(f10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void w(boolean z10) {
        try {
            this.f25423a.setMyLocationEnabled(z10);
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void x(a aVar) {
        try {
            if (aVar == null) {
                this.f25423a.r(null);
            } else {
                this.f25423a.r(new w(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void y(b bVar) {
        try {
            if (bVar == null) {
                this.f25423a.k1(null);
            } else {
                this.f25423a.k1(new v(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public final void z(InterfaceC0424c interfaceC0424c) {
        try {
            if (interfaceC0424c == null) {
                this.f25423a.A1(null);
            } else {
                this.f25423a.A1(new u(this, interfaceC0424c));
            }
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }
}
