package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.location.C0923b;
import androidx.core.os.C0946e;
import androidx.core.util.C0979c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.b */
/* loaded from: classes.dex */
public final class C0923b {

    /* renamed from: a */
    static final WeakHashMap<c, WeakReference<d>> f4416a = new WeakHashMap<>();

    /* renamed from: androidx.core.location.b$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static Class<?> f4417a;

        /* renamed from: b */
        private static Method f4418b;

        /* renamed from: a */
        static boolean m4650a(LocationManager locationManager, String str, C0933l c0933l, InterfaceC0922a interfaceC0922a, Looper looper) {
            try {
                if (f4417a == null) {
                    f4417a = Class.forName("android.location.LocationRequest");
                }
                if (f4418b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4417a, LocationListener.class, Looper.class);
                    f4418b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest m4680i = c0933l.m4680i(str);
                if (m4680i != null) {
                    f4418b.invoke(locationManager, m4680i, interfaceC0922a, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        /* renamed from: b */
        static boolean m4651b(LocationManager locationManager, String str, C0933l c0933l, d dVar) {
            try {
                if (f4417a == null) {
                    f4417a = Class.forName("android.location.LocationRequest");
                }
                if (f4418b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4417a, LocationListener.class, Looper.class);
                    f4418b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest m4680i = c0933l.m4680i(str);
                if (m4680i != null) {
                    synchronized (C0923b.f4416a) {
                        f4418b.invoke(locationManager, m4680i, dVar, Looper.getMainLooper());
                        C0923b.m4648a(locationManager, dVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* renamed from: androidx.core.location.b$b */
    /* loaded from: classes.dex */
    private static class b {
        /* renamed from: a */
        static boolean m4652a(LocationManager locationManager, String str) {
            boolean hasProvider;
            hasProvider = locationManager.hasProvider(str);
            return hasProvider;
        }

        /* renamed from: b */
        static boolean m4653b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            boolean registerGnssMeasurementsCallback;
            registerGnssMeasurementsCallback = locationManager.registerGnssMeasurementsCallback(executor, callback);
            return registerGnssMeasurementsCallback;
        }

        /* renamed from: c */
        static void m4654c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.location.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f4419a;

        /* renamed from: b */
        final InterfaceC0922a f4420b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4419a.equals(cVar.f4419a) && this.f4420b.equals(cVar.f4420b);
        }

        public int hashCode() {
            return C0979c.m4813b(this.f4419a, this.f4420b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.location.b$d */
    /* loaded from: classes.dex */
    public static class d implements LocationListener {

        /* renamed from: a */
        volatile c f4421a;

        /* renamed from: b */
        final Executor f4422b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m4661h(int i10) {
            c cVar = this.f4421a;
            if (cVar == null) {
                return;
            }
            cVar.f4420b.onFlushComplete(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m4662i(Location location) {
            c cVar = this.f4421a;
            if (cVar == null) {
                return;
            }
            cVar.f4420b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m4663j(List list) {
            c cVar = this.f4421a;
            if (cVar == null) {
                return;
            }
            cVar.f4420b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m4664k(String str) {
            c cVar = this.f4421a;
            if (cVar == null) {
                return;
            }
            cVar.f4420b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m4665l(String str) {
            c cVar = this.f4421a;
            if (cVar == null) {
                return;
            }
            cVar.f4420b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m4666m(String str, int i10, Bundle bundle) {
            c cVar = this.f4421a;
            if (cVar == null) {
                return;
            }
            cVar.f4420b.onStatusChanged(str, i10, bundle);
        }

        /* renamed from: g */
        public c m4667g() {
            return (c) C0979c.m4814c(this.f4421a);
        }

        /* renamed from: n */
        public void m4668n() {
            this.f4421a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i10) {
            if (this.f4421a == null) {
                return;
            }
            this.f4422b.execute(new Runnable() { // from class: androidx.core.location.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0923b.d.this.m4661h(i10);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.f4421a == null) {
                return;
            }
            this.f4422b.execute(new Runnable() { // from class: androidx.core.location.j
                @Override // java.lang.Runnable
                public final void run() {
                    C0923b.d.this.m4662i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List<Location> list) {
            if (this.f4421a == null) {
                return;
            }
            this.f4422b.execute(new Runnable() { // from class: androidx.core.location.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0923b.d.this.m4663j(list);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.f4421a == null) {
                return;
            }
            this.f4422b.execute(new Runnable() { // from class: androidx.core.location.i
                @Override // java.lang.Runnable
                public final void run() {
                    C0923b.d.this.m4664k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.f4421a == null) {
                return;
            }
            this.f4422b.execute(new Runnable() { // from class: androidx.core.location.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0923b.d.this.m4665l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.f4421a == null) {
                return;
            }
            this.f4422b.execute(new Runnable() { // from class: androidx.core.location.k
                @Override // java.lang.Runnable
                public final void run() {
                    C0923b.d.this.m4666m(str, i10, bundle);
                }
            });
        }
    }

    /* renamed from: a */
    static void m4648a(LocationManager locationManager, d dVar) {
        WeakReference<d> put = f4416a.put(dVar.m4667g(), new WeakReference<>(dVar));
        d dVar2 = put != null ? put.get() : null;
        if (dVar2 != null) {
            dVar2.m4668n();
            locationManager.removeUpdates(dVar2);
        }
    }

    /* renamed from: b */
    public static void m4649b(LocationManager locationManager, String str, C0933l c0933l, InterfaceC0922a interfaceC0922a, Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            b.m4654c(locationManager, str, c0933l.m4679h(), C0946e.m4710a(new Handler(looper)), interfaceC0922a);
        } else {
            if (a.m4650a(locationManager, str, c0933l, interfaceC0922a, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, c0933l.m4673b(), c0933l.m4676e(), interfaceC0922a, looper);
        }
    }
}
