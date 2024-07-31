package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0859f;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.w */
/* loaded from: classes.dex */
class C0240w {

    /* renamed from: d */
    private static C0240w f1024d;

    /* renamed from: a */
    private final Context f1025a;

    /* renamed from: b */
    private final LocationManager f1026b;

    /* renamed from: c */
    private final a f1027c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.w$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f1028a;

        /* renamed from: b */
        long f1029b;

        a() {
        }
    }

    C0240w(Context context, LocationManager locationManager) {
        this.f1025a = context;
        this.f1026b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0240w m1123a(Context context) {
        if (f1024d == null) {
            Context applicationContext = context.getApplicationContext();
            f1024d = new C0240w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1024d;
    }

    /* renamed from: b */
    private Location m1124b() {
        Location m1125c = C0859f.m4384b(this.f1025a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1125c("network") : null;
        Location m1125c2 = C0859f.m4384b(this.f1025a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m1125c("gps") : null;
        return (m1125c2 == null || m1125c == null) ? m1125c2 != null ? m1125c2 : m1125c : m1125c2.getTime() > m1125c.getTime() ? m1125c2 : m1125c;
    }

    /* renamed from: c */
    private Location m1125c(String str) {
        try {
            if (this.f1026b.isProviderEnabled(str)) {
                return this.f1026b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m1126e() {
        return this.f1027c.f1029b > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m1127f(Location location) {
        long j10;
        a aVar = this.f1027c;
        long currentTimeMillis = System.currentTimeMillis();
        C0239v m1121b = C0239v.m1121b();
        m1121b.m1122a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        m1121b.m1122a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = m1121b.f1023c == 1;
        long j11 = m1121b.f1022b;
        long j12 = m1121b.f1021a;
        m1121b.m1122a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = m1121b.f1022b;
        if (j11 == -1 || j12 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j12 ? j13 + 0 : currentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
        }
        aVar.f1028a = z10;
        aVar.f1029b = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1128d() {
        a aVar = this.f1027c;
        if (m1126e()) {
            return aVar.f1028a;
        }
        Location m1124b = m1124b();
        if (m1124b != null) {
            m1127f(m1124b);
            return aVar.f1028a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
