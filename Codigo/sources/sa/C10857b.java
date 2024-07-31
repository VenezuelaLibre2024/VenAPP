package sa;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p365ta.InterfaceC11193a;
import ua.C11518v;

/* renamed from: sa.b */
/* loaded from: classes2.dex */
public final class C10857b {

    /* renamed from: a */
    private static InterfaceC11193a f27541a;

    /* renamed from: a */
    public static C10856a m33097a(CameraPosition cameraPosition) {
        C5276s.m13325k(cameraPosition, "cameraPosition must not be null");
        try {
            return new C10856a(m33108l().mo35047U(cameraPosition));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public static C10856a m33098b(LatLng latLng) {
        C5276s.m13325k(latLng, "latLng must not be null");
        try {
            return new C10856a(m33108l().mo35046L0(latLng));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public static C10856a m33099c(LatLngBounds latLngBounds, int i10) {
        C5276s.m13325k(latLngBounds, "bounds must not be null");
        try {
            return new C10856a(m33108l().mo35048e(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public static C10856a m33100d(LatLng latLng, float f10) {
        C5276s.m13325k(latLng, "latLng must not be null");
        try {
            return new C10856a(m33108l().mo35051m0(latLng, f10));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public static C10856a m33101e(float f10, float f11) {
        try {
            return new C10856a(m33108l().mo35052n0(f10, f11));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public static C10856a m33102f(float f10) {
        try {
            return new C10856a(m33108l().zoomBy(f10));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public static C10856a m33103g(float f10, Point point) {
        C5276s.m13325k(point, "focus must not be null");
        try {
            return new C10856a(m33108l().mo35049f1(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public static C10856a m33104h() {
        try {
            return new C10856a(m33108l().zoomIn());
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public static C10856a m33105i() {
        try {
            return new C10856a(m33108l().zoomOut());
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public static C10856a m33106j(float f10) {
        try {
            return new C10856a(m33108l().mo35050i0(f10));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public static void m33107k(InterfaceC11193a interfaceC11193a) {
        f27541a = (InterfaceC11193a) C5276s.m13324j(interfaceC11193a);
    }

    /* renamed from: l */
    private static InterfaceC11193a m33108l() {
        return (InterfaceC11193a) C5276s.m13325k(f27541a, "CameraUpdateFactory is not initialized");
    }
}
