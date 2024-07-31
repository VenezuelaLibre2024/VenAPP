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
import androidx.core.location.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final WeakHashMap<c, WeakReference<d>> f3744a = new WeakHashMap<>();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f3745a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f3746b;

        static boolean a(LocationManager locationManager, String str, l lVar, androidx.core.location.a aVar, Looper looper) {
            try {
                if (f3745a == null) {
                    f3745a = Class.forName("android.location.LocationRequest");
                }
                if (f3746b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3745a, LocationListener.class, Looper.class);
                    f3746b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i10 = lVar.i(str);
                if (i10 != null) {
                    f3746b.invoke(locationManager, i10, aVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        static boolean b(LocationManager locationManager, String str, l lVar, d dVar) {
            try {
                if (f3745a == null) {
                    f3745a = Class.forName("android.location.LocationRequest");
                }
                if (f3746b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3745a, LocationListener.class, Looper.class);
                    f3746b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i10 = lVar.i(str);
                if (i10 != null) {
                    synchronized (b.f3744a) {
                        f3746b.invoke(locationManager, i10, dVar, Looper.getMainLooper());
                        b.a(locationManager, dVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* renamed from: androidx.core.location.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0045b {
        static boolean a(LocationManager locationManager, String str) {
            boolean hasProvider;
            hasProvider = locationManager.hasProvider(str);
            return hasProvider;
        }

        static boolean b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            boolean registerGnssMeasurementsCallback;
            registerGnssMeasurementsCallback = locationManager.registerGnssMeasurementsCallback(executor, callback);
            return registerGnssMeasurementsCallback;
        }

        static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f3747a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.core.location.a f3748b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3747a.equals(cVar.f3747a) && this.f3748b.equals(cVar.f3748b);
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f3747a, this.f3748b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        volatile c f3749a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f3750b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i10) {
            c cVar = this.f3749a;
            if (cVar == null) {
                return;
            }
            cVar.f3748b.onFlushComplete(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            c cVar = this.f3749a;
            if (cVar == null) {
                return;
            }
            cVar.f3748b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            c cVar = this.f3749a;
            if (cVar == null) {
                return;
            }
            cVar.f3748b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            c cVar = this.f3749a;
            if (cVar == null) {
                return;
            }
            cVar.f3748b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            c cVar = this.f3749a;
            if (cVar == null) {
                return;
            }
            cVar.f3748b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i10, Bundle bundle) {
            c cVar = this.f3749a;
            if (cVar == null) {
                return;
            }
            cVar.f3748b.onStatusChanged(str, i10, bundle);
        }

        public c g() {
            return (c) androidx.core.util.c.c(this.f3749a);
        }

        public void n() {
            this.f3749a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i10) {
            if (this.f3749a == null) {
                return;
            }
            this.f3750b.execute(new Runnable() { // from class: androidx.core.location.g
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.this.h(i10);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.f3749a == null) {
                return;
            }
            this.f3750b.execute(new Runnable() { // from class: androidx.core.location.j
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.this.i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List<Location> list) {
            if (this.f3749a == null) {
                return;
            }
            this.f3750b.execute(new Runnable() { // from class: androidx.core.location.h
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.this.j(list);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.f3749a == null) {
                return;
            }
            this.f3750b.execute(new Runnable() { // from class: androidx.core.location.i
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.this.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.f3749a == null) {
                return;
            }
            this.f3750b.execute(new Runnable() { // from class: androidx.core.location.f
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.this.l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.f3749a == null) {
                return;
            }
            this.f3750b.execute(new Runnable() { // from class: androidx.core.location.k
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.this.m(str, i10, bundle);
                }
            });
        }
    }

    static void a(LocationManager locationManager, d dVar) {
        WeakReference<d> put = f3744a.put(dVar.g(), new WeakReference<>(dVar));
        d dVar2 = put != null ? put.get() : null;
        if (dVar2 != null) {
            dVar2.n();
            locationManager.removeUpdates(dVar2);
        }
    }

    public static void b(LocationManager locationManager, String str, l lVar, androidx.core.location.a aVar, Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C0045b.c(locationManager, str, lVar.h(), androidx.core.os.e.a(new Handler(looper)), aVar);
        } else {
            if (a.a(locationManager, str, lVar, aVar, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, lVar.b(), lVar.e(), aVar, looper);
        }
    }
}
