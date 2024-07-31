package p477z2;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.location.C0923b;
import androidx.core.location.C0933l;
import androidx.core.location.InterfaceC0922a;
import java.util.Iterator;
import java.util.List;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;

/* renamed from: z2.q */
/* loaded from: classes.dex */
class C12785q implements InterfaceC12784p, InterfaceC0922a {

    /* renamed from: a */
    private final LocationManager f34851a;

    /* renamed from: b */
    private final C12770d0 f34852b;

    /* renamed from: c */
    private final C12794z f34853c;

    /* renamed from: d */
    public Context f34854d;

    /* renamed from: e */
    private boolean f34855e = false;

    /* renamed from: f */
    private Location f34856f;

    /* renamed from: g */
    private String f34857g;

    /* renamed from: h */
    private InterfaceC12772e0 f34858h;

    /* renamed from: i */
    private InterfaceC12583a f34859i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z2.q$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34860a;

        static {
            int[] iArr = new int[EnumC12781m.values().length];
            f34860a = iArr;
            try {
                iArr[EnumC12781m.lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34860a[EnumC12781m.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34860a[EnumC12781m.high.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34860a[EnumC12781m.best.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34860a[EnumC12781m.bestForNavigation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34860a[EnumC12781m.medium.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C12785q(Context context, C12794z c12794z) {
        this.f34851a = (LocationManager) context.getSystemService("location");
        this.f34853c = c12794z;
        this.f34854d = context;
        this.f34852b = new C12770d0(context, c12794z);
    }

    /* renamed from: g */
    private static int m42414g(EnumC12781m enumC12781m) {
        int i10 = a.f34860a[enumC12781m.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 104;
        }
        return (i10 == 3 || i10 == 4 || i10 == 5) ? 100 : 102;
    }

    /* renamed from: h */
    private static String m42415h(LocationManager locationManager, EnumC12781m enumC12781m) {
        List<String> providers = locationManager.getProviders(true);
        if (enumC12781m == EnumC12781m.lowest) {
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

    /* renamed from: i */
    static boolean m42416i(Location location, Location location2) {
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

    @Override // p477z2.InterfaceC12784p
    /* renamed from: b */
    public void mo42399b(InterfaceC12764a0 interfaceC12764a0) {
        interfaceC12764a0.mo42358b(this.f34851a == null ? false : m42413a(this.f34854d));
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: c */
    public void mo42400c(Activity activity, InterfaceC12772e0 interfaceC12772e0, InterfaceC12583a interfaceC12583a) {
        long j10;
        float f10;
        int i10;
        if (!m42413a(this.f34854d)) {
            interfaceC12583a.mo10589a(EnumC12584b.locationServicesDisabled);
            return;
        }
        this.f34858h = interfaceC12772e0;
        this.f34859i = interfaceC12583a;
        EnumC12781m enumC12781m = EnumC12781m.best;
        C12794z c12794z = this.f34853c;
        if (c12794z != null) {
            float m42428b = (float) c12794z.m42428b();
            EnumC12781m m42427a = this.f34853c.m42427a();
            j10 = m42427a == EnumC12781m.lowest ? Long.MAX_VALUE : this.f34853c.m42429c();
            i10 = m42414g(m42427a);
            f10 = m42428b;
            enumC12781m = m42427a;
        } else {
            j10 = 0;
            f10 = 0.0f;
            i10 = 102;
        }
        String m42415h = m42415h(this.f34851a, enumC12781m);
        this.f34857g = m42415h;
        if (m42415h == null) {
            interfaceC12583a.mo10589a(EnumC12584b.locationServicesDisabled);
            return;
        }
        C0933l m4683a = new C0933l.c(j10).m4685c(f10).m4686d(j10).m4687e(i10).m4683a();
        this.f34855e = true;
        this.f34852b.m42369d();
        C0923b.m4649b(this.f34851a, this.f34857g, m4683a, this, Looper.getMainLooper());
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: d */
    public void mo42401d(InterfaceC12772e0 interfaceC12772e0, InterfaceC12583a interfaceC12583a) {
        Iterator<String> it = this.f34851a.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = this.f34851a.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && m42416i(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        interfaceC12772e0.mo10588a(location);
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: e */
    public boolean mo42402e(int i10, int i11) {
        return false;
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: f */
    public void mo42403f() {
        this.f34855e = false;
        this.f34852b.m42370e();
        this.f34851a.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public synchronized void onLocationChanged(Location location) {
        if (m42416i(location, this.f34856f)) {
            this.f34856f = location;
            if (this.f34858h != null) {
                this.f34852b.m42368b(location);
                this.f34858h.mo10588a(this.f34856f);
            }
        }
    }

    @Override // androidx.core.location.InterfaceC0922a, android.location.LocationListener
    public void onProviderDisabled(String str) {
        if (str.equals(this.f34857g)) {
            if (this.f34855e) {
                this.f34851a.removeUpdates(this);
            }
            InterfaceC12583a interfaceC12583a = this.f34859i;
            if (interfaceC12583a != null) {
                interfaceC12583a.mo10589a(EnumC12584b.locationServicesDisabled);
            }
            this.f34857g = null;
        }
    }

    @Override // androidx.core.location.InterfaceC0922a, android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // androidx.core.location.InterfaceC0922a, android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        if (i10 == 2) {
            onProviderEnabled(str);
        } else if (i10 == 0) {
            onProviderDisabled(str);
        }
    }
}
