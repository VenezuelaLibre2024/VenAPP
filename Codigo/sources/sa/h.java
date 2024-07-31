package sa;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import ua.e0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final ta.d f25431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ta.d dVar) {
        this.f25431a = dVar;
    }

    public LatLng a(Point point) {
        com.google.android.gms.common.internal.s.j(point);
        try {
            return this.f25431a.h0(com.google.android.gms.dynamic.d.h2(point));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public e0 b() {
        try {
            return this.f25431a.G();
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }

    public Point c(LatLng latLng) {
        com.google.android.gms.common.internal.s.j(latLng);
        try {
            return (Point) com.google.android.gms.dynamic.d.g2(this.f25431a.y(latLng));
        } catch (RemoteException e10) {
            throw new ua.v(e10);
        }
    }
}
