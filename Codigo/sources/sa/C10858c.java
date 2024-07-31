package sa;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;
import p365ta.InterfaceC11195b;
import ua.C11476a;
import ua.C11479b0;
import ua.C11481c0;
import ua.C11486f;
import ua.C11488g;
import ua.C11498l;
import ua.C11500m;
import ua.C11502n;
import ua.C11508q;
import ua.C11510r;
import ua.C11512s;
import ua.C11514t;
import ua.C11518v;

/* renamed from: sa.c */
/* loaded from: classes2.dex */
public class C10858c {

    /* renamed from: a */
    private final InterfaceC11195b f27542a;

    /* renamed from: b */
    private final Map f27543b = new HashMap();

    /* renamed from: c */
    private final Map f27544c = new HashMap();

    /* renamed from: d */
    private C10864i f27545d;

    /* renamed from: sa.c$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onCameraIdle();
    }

    /* renamed from: sa.c$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onCameraMove();
    }

    /* renamed from: sa.c$c */
    /* loaded from: classes2.dex */
    public interface c {
        void onCameraMoveStarted(int i10);
    }

    /* renamed from: sa.c$d */
    /* loaded from: classes2.dex */
    public interface d {
        void onCircleClick(C11486f c11486f);
    }

    /* renamed from: sa.c$e */
    /* loaded from: classes2.dex */
    public interface e {
        void onInfoWindowClick(C11500m c11500m);
    }

    /* renamed from: sa.c$f */
    /* loaded from: classes2.dex */
    public interface f {
        void onMapClick(LatLng latLng);
    }

    /* renamed from: sa.c$g */
    /* loaded from: classes2.dex */
    public interface g {
        void onMapLongClick(LatLng latLng);
    }

    /* renamed from: sa.c$h */
    /* loaded from: classes2.dex */
    public interface h {
        boolean onMarkerClick(C11500m c11500m);
    }

    /* renamed from: sa.c$i */
    /* loaded from: classes2.dex */
    public interface i {
        void onMarkerDrag(C11500m c11500m);

        void onMarkerDragEnd(C11500m c11500m);

        void onMarkerDragStart(C11500m c11500m);
    }

    /* renamed from: sa.c$j */
    /* loaded from: classes2.dex */
    public interface j {
        void onPolygonClick(C11508q c11508q);
    }

    /* renamed from: sa.c$k */
    /* loaded from: classes2.dex */
    public interface k {
        void onPolylineClick(C11512s c11512s);
    }

    /* renamed from: sa.c$l */
    /* loaded from: classes2.dex */
    public interface l {
        void onSnapshotReady(Bitmap bitmap);
    }

    public C10858c(InterfaceC11195b interfaceC11195b) {
        this.f27542a = (InterfaceC11195b) C5276s.m13324j(interfaceC11195b);
    }

    /* renamed from: A */
    public final void m33109A(d dVar) {
        try {
            if (dVar == null) {
                this.f27542a.mo35071O1(null);
            } else {
                this.f27542a.mo35071O1(new BinderC10872q(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: B */
    public final void m33110B(e eVar) {
        try {
            if (eVar == null) {
                this.f27542a.mo35072Y(null);
            } else {
                this.f27542a.mo35072Y(new BinderC10871p(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: C */
    public final void m33111C(f fVar) {
        try {
            if (fVar == null) {
                this.f27542a.mo35065F(null);
            } else {
                this.f27542a.mo35065F(new BinderC10879x(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: D */
    public final void m33112D(g gVar) {
        try {
            if (gVar == null) {
                this.f27542a.mo35062B0(null);
            } else {
                this.f27542a.mo35062B0(new BinderC10866k(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: E */
    public final void m33113E(h hVar) {
        try {
            if (hVar == null) {
                this.f27542a.mo35077e1(null);
            } else {
                this.f27542a.mo35077e1(new BinderC10865j(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: F */
    public final void m33114F(i iVar) {
        try {
            if (iVar == null) {
                this.f27542a.mo35067I(null);
            } else {
                this.f27542a.mo35067I(new BinderC10870o(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: G */
    public final void m33115G(j jVar) {
        try {
            if (jVar == null) {
                this.f27542a.mo35089w0(null);
            } else {
                this.f27542a.mo35089w0(new BinderC10873r(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: H */
    public final void m33116H(k kVar) {
        try {
            if (kVar == null) {
                this.f27542a.mo35073a2(null);
            } else {
                this.f27542a.mo35073a2(new BinderC10874s(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: I */
    public final void m33117I(int i10, int i11, int i12, int i13) {
        try {
            this.f27542a.mo35066H0(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: J */
    public final void m33118J(boolean z10) {
        try {
            this.f27542a.setTrafficEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: K */
    public final void m33119K(l lVar) {
        C5276s.m13325k(lVar, "Callback must not be null.");
        m33120L(lVar, null);
    }

    /* renamed from: L */
    public final void m33120L(l lVar, Bitmap bitmap) {
        C5276s.m13325k(lVar, "Callback must not be null.");
        try {
            this.f27542a.mo35063C(new BinderC10875t(this, lVar), (BinderC5314d) (bitmap != null ? BinderC5314d.m13412h2(bitmap) : null));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: a */
    public final C11486f m33121a(C11488g c11488g) {
        try {
            C5276s.m13325k(c11488g, "CircleOptions must not be null.");
            return new C11486f(this.f27542a.mo35069M1(c11488g));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public final C11500m m33122b(C11502n c11502n) {
        try {
            C5276s.m13325k(c11502n, "MarkerOptions must not be null.");
            zzad mo35079h = this.f27542a.mo35079h(c11502n);
            if (mo35079h != null) {
                return c11502n.zzb() == 1 ? new C11476a(mo35079h) : new C11500m(mo35079h);
            }
            return null;
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public final C11508q m33123c(C11510r c11510r) {
        try {
            C5276s.m13325k(c11510r, "PolygonOptions must not be null");
            return new C11508q(this.f27542a.mo35090y0(c11510r));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public final C11512s m33124d(C11514t c11514t) {
        try {
            C5276s.m13325k(c11514t, "PolylineOptions must not be null");
            return new C11512s(this.f27542a.mo35085o(c11514t));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public final C11479b0 m33125e(C11481c0 c11481c0) {
        try {
            C5276s.m13325k(c11481c0, "TileOverlayOptions must not be null.");
            zzam mo35076d0 = this.f27542a.mo35076d0(c11481c0);
            if (mo35076d0 != null) {
                return new C11479b0(mo35076d0);
            }
            return null;
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public final void m33126f(C10856a c10856a) {
        try {
            C5276s.m13325k(c10856a, "CameraUpdate must not be null.");
            this.f27542a.mo35078f0(c10856a.m33096a());
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public final CameraPosition m33127g() {
        try {
            return this.f27542a.mo35091z();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public final float m33128h() {
        try {
            return this.f27542a.mo35081k0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public final float m33129i() {
        try {
            return this.f27542a.mo35088u0();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public final C10863h m33130j() {
        try {
            return new C10863h(this.f27542a.mo35074c0());
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public final C10864i m33131k() {
        try {
            if (this.f27545d == null) {
                this.f27545d = new C10864i(this.f27542a.mo35092z1());
            }
            return this.f27545d;
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: l */
    public final boolean m33132l() {
        try {
            return this.f27542a.mo35064D1();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: m */
    public final boolean m33133m() {
        try {
            return this.f27542a.mo35075c1();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: n */
    public final void m33134n(C10856a c10856a) {
        try {
            C5276s.m13325k(c10856a, "CameraUpdate must not be null.");
            this.f27542a.mo35070O0(c10856a.m33096a());
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: o */
    public void m33135o() {
        try {
            this.f27542a.mo35087s1();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: p */
    public final void m33136p(boolean z10) {
        try {
            this.f27542a.setBuildingsEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: q */
    public final boolean m33137q(boolean z10) {
        try {
            return this.f27542a.setIndoorEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: r */
    public void m33138r(LatLngBounds latLngBounds) {
        try {
            this.f27542a.mo35084n(latLngBounds);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: s */
    public boolean m33139s(C11498l c11498l) {
        try {
            return this.f27542a.mo35083l1(c11498l);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: t */
    public final void m33140t(int i10) {
        try {
            this.f27542a.setMapType(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: u */
    public void m33141u(float f10) {
        try {
            this.f27542a.mo35068L(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: v */
    public void m33142v(float f10) {
        try {
            this.f27542a.mo35080i1(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: w */
    public final void m33143w(boolean z10) {
        try {
            this.f27542a.setMyLocationEnabled(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: x */
    public final void m33144x(a aVar) {
        try {
            if (aVar == null) {
                this.f27542a.mo35086r(null);
            } else {
                this.f27542a.mo35086r(new BinderC10878w(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: y */
    public final void m33145y(b bVar) {
        try {
            if (bVar == null) {
                this.f27542a.mo35082k1(null);
            } else {
                this.f27542a.mo35082k1(new BinderC10877v(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: z */
    public final void m33146z(c cVar) {
        try {
            if (cVar == null) {
                this.f27542a.mo35061A1(null);
            } else {
                this.f27542a.mo35061A1(new BinderC10876u(this, cVar));
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
