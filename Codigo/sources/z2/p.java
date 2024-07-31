package z2;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes.dex */
public interface p {
    default boolean a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    void b(a0 a0Var);

    void c(Activity activity, e0 e0Var, y2.a aVar);

    void d(e0 e0Var, y2.a aVar);

    boolean e(int i10, int i11);

    void f();
}
