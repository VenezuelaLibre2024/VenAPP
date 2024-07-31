package p477z2;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import p455y2.InterfaceC12583a;

/* renamed from: z2.p */
/* loaded from: classes.dex */
public interface InterfaceC12784p {
    /* renamed from: a */
    default boolean m42413a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* renamed from: b */
    void mo42399b(InterfaceC12764a0 interfaceC12764a0);

    /* renamed from: c */
    void mo42400c(Activity activity, InterfaceC12772e0 interfaceC12772e0, InterfaceC12583a interfaceC12583a);

    /* renamed from: d */
    void mo42401d(InterfaceC12772e0 interfaceC12772e0, InterfaceC12583a interfaceC12583a);

    /* renamed from: e */
    boolean mo42402e(int i10, int i11);

    /* renamed from: f */
    void mo42403f();
}
