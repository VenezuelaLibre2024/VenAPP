package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class w {

    /* renamed from: d, reason: collision with root package name */
    private static w f899d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f900a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f901b;

    /* renamed from: c, reason: collision with root package name */
    private final a f902c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f903a;

        /* renamed from: b, reason: collision with root package name */
        long f904b;

        a() {
        }
    }

    w(Context context, LocationManager locationManager) {
        this.f900a = context;
        this.f901b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w a(Context context) {
        if (f899d == null) {
            Context applicationContext = context.getApplicationContext();
            f899d = new w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f899d;
    }

    private Location b() {
        Location c10 = androidx.core.content.f.b(this.f900a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.f.b(this.f900a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f901b.isProviderEnabled(str)) {
                return this.f901b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f902c.f904b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f902c;
        long currentTimeMillis = System.currentTimeMillis();
        v b10 = v.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f898c == 1;
        long j11 = b10.f897b;
        long j12 = b10.f896a;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = b10.f897b;
        if (j11 == -1 || j12 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j12 ? j13 + 0 : currentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
        }
        aVar.f903a = z10;
        aVar.f904b = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f902c;
        if (e()) {
            return aVar.f903a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f903a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
