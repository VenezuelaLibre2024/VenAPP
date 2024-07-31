package sa;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    private static ta.a f25422a;

    public static a a(CameraPosition cameraPosition) {
        com.google.android.gms.common.internal.s.k(cameraPosition, "cameraPosition must not be null");
        try {
            return new a(l().U(cameraPosition));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a b(LatLng latLng) {
        com.google.android.gms.common.internal.s.k(latLng, "latLng must not be null");
        try {
            return new a(l().L0(latLng));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a c(LatLngBounds latLngBounds, int i10) {
        com.google.android.gms.common.internal.s.k(latLngBounds, "bounds must not be null");
        try {
            return new a(l().e(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a d(LatLng latLng, float f10) {
        com.google.android.gms.common.internal.s.k(latLng, "latLng must not be null");
        try {
            return new a(l().m0(latLng, f10));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a e(float f10, float f11) {
        try {
            return new a(l().n0(f10, f11));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a f(float f10) {
        try {
            return new a(l().zoomBy(f10));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a g(float f10, Point point) {
        com.google.android.gms.common.internal.s.k(point, "focus must not be null");
        try {
            return new a(l().f1(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a h() {
        try {
            return new a(l().zoomIn());
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a i() {
        try {
            return new a(l().zoomOut());
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static a j(float f10) {
        try {
            return new a(l().i0(f10));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public static void k(ta.a aVar) {
        f25422a = (ta.a) com.google.android.gms.common.internal.s.j(aVar);
    }

    private static ta.a l() {
        return (ta.a) com.google.android.gms.common.internal.s.k(f25422a, "CameraUpdateFactory is not initialized");
    }
}
