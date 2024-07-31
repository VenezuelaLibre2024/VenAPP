package sa;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.maps.model.LatLng;
import p365ta.InterfaceC11199d;
import ua.C11485e0;
import ua.C11518v;

/* renamed from: sa.h */
/* loaded from: classes2.dex */
public final class C10863h {

    /* renamed from: a */
    private final InterfaceC11199d f27550a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10863h(InterfaceC11199d interfaceC11199d) {
        this.f27550a = interfaceC11199d;
    }

    /* renamed from: a */
    public LatLng m33156a(Point point) {
        C5276s.m13324j(point);
        try {
            return this.f27550a.mo35104h0(BinderC5314d.m13412h2(point));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public C11485e0 m33157b() {
        try {
            return this.f27550a.mo35103G();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public Point m33158c(LatLng latLng) {
        C5276s.m13324j(latLng);
        try {
            return (Point) BinderC5314d.m13411g2(this.f27550a.mo35105y(latLng));
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
