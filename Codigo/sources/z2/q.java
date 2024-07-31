package z2;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.location.l;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q implements p, androidx.core.location.a {

    /* renamed from: a */
    private final LocationManager f32300a;

    /* renamed from: b */
    private final d0 f32301b;

    /* renamed from: c */
    private final z f32302c;

    /* renamed from: d */
    public Context f32303d;

    /* renamed from: e */
    private boolean f32304e = false;

    /* renamed from: f */
    private Location f32305f;

    /* renamed from: g */
    private String f32306g;

    /* renamed from: h */
    private e0 f32307h;

    /* renamed from: i */
    private y2.a f32308i;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32309a;

        static {
            int[] iArr = new int[m.values().length];
            f32309a = iArr;
            try {
                iArr[m.lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32309a[m.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32309a[m.high.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32309a[m.best.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32309a[m.bestForNavigation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32309a[m.medium.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public q(Context context, z zVar) {
        this.f32300a = (LocationManager) context.getSystemService("location");
        this.f32302c = zVar;
        this.f32303d = context;
        this.f32301b = new d0(context, zVar);
    }

    private static int g(m mVar) {
        int i10 = a.f32309a[mVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 104;
        }
        return (i10 == 3 || i10 == 4 || i10 == 5) ? 100 : 102;
    }

    private static String h(LocationManager locationManager, m mVar) {
        List<String> providers = locationManager.getProviders(true);
        if (mVar == m.lowest) {
            return "passive";
        }
        if (providers.contains("fused") && Build.VERSION.SDK_INT >= 31) {
            return "fused";
        }
        if (providers.contains("gps")) {
            return "gps";
        }
        if (providers.contains("network")) {
            return "network";
        }
        if (providers.isEmpty()) {
            return null;
        }
        return providers.get(0);
    }

    static boolean i(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > 120000;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (z11) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0.0f;
        boolean z14 = accuracy < 0.0f;
        boolean z15 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z14) {
            return true;
        }
        if (!z12 || z13) {
            return z12 && !z15 && equals;
        }
        return true;
    }

    @Override // z2.p
    public void b(a0 a0Var) {
        a0Var.b(this.f32300a == null ? false : a(this.f32303d));
    }

    @Override // z2.p
    public void c(Activity activity, e0 e0Var, y2.a aVar) {
        long j10;
        float f10;
        int i10;
        if (!a(this.f32303d)) {
            aVar.a(y2.b.locationServicesDisabled);
            return;
        }
        this.f32307h = e0Var;
        this.f32308i = aVar;
        m mVar = m.best;
        z zVar = this.f32302c;
        if (zVar != null) {
            float b10 = (float) zVar.b();
            m a10 = this.f32302c.a();
            j10 = a10 == m.lowest ? Long.MAX_VALUE : this.f32302c.c();
            i10 = g(a10);
            f10 = b10;
            mVar = a10;
        } else {
            j10 = 0;
            f10 = 0.0f;
            i10 = 102;
        }
        String h10 = h(this.f32300a, mVar);
        this.f32306g = h10;
        if (h10 == null) {
            aVar.a(y2.b.locationServicesDisabled);
            return;
        }
        androidx.core.location.l a11 = new l.c(j10).c(f10).d(j10).e(i10).a();
        this.f32304e = true;
        this.f32301b.d();
        androidx.core.location.b.b(this.f32300a, this.f32306g, a11, this, Looper.getMainLooper());
    }

    @Override // z2.p
    public void d(e0 e0Var, y2.a aVar) {
        Iterator<String> it = this.f32300a.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = this.f32300a.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && i(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        e0Var.a(location);
    }

    @Override // z2.p
    public boolean e(int i10, int i11) {
        return false;
    }

    @Override // z2.p
    public void f() {
        this.f32304e = false;
        this.f32301b.e();
        this.f32300a.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public synchronized void onLocationChanged(Location location) {
        if (i(location, this.f32305f)) {
            this.f32305f = location;
            if (this.f32307h != null) {
                this.f32301b.b(location);
                this.f32307h.a(this.f32305f);
            }
        }
    }

    @Override // androidx.core.location.a, android.location.LocationListener
    public void onProviderDisabled(String str) {
        if (str.equals(this.f32306g)) {
            if (this.f32304e) {
                this.f32300a.removeUpdates(this);
            }
            y2.a aVar = this.f32308i;
            if (aVar != null) {
                aVar.a(y2.b.locationServicesDisabled);
            }
            this.f32306g = null;
        }
    }

    @Override // androidx.core.location.a, android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // androidx.core.location.a, android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        if (i10 == 2) {
            onProviderEnabled(str);
        } else if (i10 == 0) {
            onProviderDisabled(str);
        }
    }
}
