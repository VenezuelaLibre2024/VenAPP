package z2;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.p;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes.dex */
public class k implements p {

    /* renamed from: a */
    private final Context f32288a;

    /* renamed from: b */
    private final com.google.android.gms.location.m f32289b;

    /* renamed from: c */
    private final com.google.android.gms.location.g f32290c;

    /* renamed from: d */
    private final d0 f32291d;

    /* renamed from: e */
    private final int f32292e = s();

    /* renamed from: f */
    private final z f32293f;

    /* renamed from: g */
    private y2.a f32294g;

    /* renamed from: h */
    private e0 f32295h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.google.android.gms.location.m {

        /* renamed from: a */
        final /* synthetic */ Context f32296a;

        a(Context context) {
            this.f32296a = context;
        }

        @Override // com.google.android.gms.location.m
        public synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
            if (!locationAvailability.u1() && !k.this.a(this.f32296a) && k.this.f32294g != null) {
                k.this.f32294g.a(y2.b.locationServicesDisabled);
            }
        }

        @Override // com.google.android.gms.location.m
        public synchronized void onLocationResult(LocationResult locationResult) {
            if (k.this.f32295h != null) {
                Location u12 = locationResult.u1();
                k.this.f32291d.b(u12);
                k.this.f32295h.a(u12);
            } else {
                Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                k.this.f32290c.removeLocationUpdates(k.this.f32289b);
                if (k.this.f32294g != null) {
                    k.this.f32294g.a(y2.b.errorWhileAcquiringPosition);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f32298a;

        static {
            int[] iArr = new int[m.values().length];
            f32298a = iArr;
            try {
                iArr[m.lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32298a[m.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32298a[m.medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(Context context, z zVar) {
        this.f32288a = context;
        this.f32290c = com.google.android.gms.location.o.a(context);
        this.f32293f = zVar;
        this.f32291d = new d0(context, zVar);
        this.f32289b = new a(context);
    }

    private static LocationRequest p(z zVar) {
        if (Build.VERSION.SDK_INT < 33) {
            return q(zVar);
        }
        LocationRequest.a aVar = new LocationRequest.a(0L);
        if (zVar != null) {
            aVar.h(y(zVar.a()));
            aVar.d(zVar.c());
            aVar.g(zVar.c());
            aVar.f((float) zVar.b());
        }
        return aVar.a();
    }

    private static LocationRequest q(z zVar) {
        LocationRequest u12 = LocationRequest.u1();
        if (zVar != null) {
            u12.J1(y(zVar.a()));
            u12.I1(zVar.c());
            u12.H1(zVar.c() / 2);
            u12.K1((float) zVar.b());
        }
        return u12;
    }

    private static com.google.android.gms.location.p r(LocationRequest locationRequest) {
        p.a aVar = new p.a();
        aVar.a(locationRequest);
        return aVar.b();
    }

    private synchronized int s() {
        return new SecureRandom().nextInt(65536);
    }

    public static /* synthetic */ void t(y2.a aVar, Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        if (aVar != null) {
            aVar.a(y2.b.errorWhileAcquiringPosition);
        }
    }

    public static /* synthetic */ void u(a0 a0Var, Task task) {
        if (!task.isSuccessful()) {
            a0Var.a(y2.b.locationServicesDisabled);
        }
        com.google.android.gms.location.q qVar = (com.google.android.gms.location.q) task.getResult();
        if (qVar == null) {
            a0Var.a(y2.b.locationServicesDisabled);
            return;
        }
        com.google.android.gms.location.s c10 = qVar.c();
        boolean z10 = true;
        boolean z11 = c10 != null && c10.x1();
        boolean z12 = c10 != null && c10.z1();
        if (!z11 && !z12) {
            z10 = false;
        }
        a0Var.b(z10);
    }

    public /* synthetic */ void v(com.google.android.gms.location.q qVar) {
        x(this.f32293f);
    }

    public /* synthetic */ void w(Activity activity, y2.a aVar, Exception exc) {
        if (exc instanceof com.google.android.gms.common.api.l) {
            if (activity == null) {
                aVar.a(y2.b.locationServicesDisabled);
                return;
            }
            com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) exc;
            if (lVar.getStatusCode() == 6) {
                try {
                    lVar.a(activity, this.f32292e);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        } else if (((com.google.android.gms.common.api.b) exc).getStatusCode() == 8502) {
            x(this.f32293f);
            return;
        }
        aVar.a(y2.b.locationServicesDisabled);
    }

    private void x(z zVar) {
        LocationRequest p10 = p(zVar);
        this.f32291d.d();
        this.f32290c.requestLocationUpdates(p10, this.f32289b, Looper.getMainLooper());
    }

    private static int y(m mVar) {
        int i10 = b.f32298a[mVar.ordinal()];
        if (i10 == 1) {
            return 105;
        }
        if (i10 != 2) {
            return i10 != 3 ? 100 : 102;
        }
        return 104;
    }

    @Override // z2.p
    public void b(a0 a0Var) {
        com.google.android.gms.location.o.b(this.f32288a).checkLocationSettings(new p.a().b()).addOnCompleteListener(new OnCompleteListener() { // from class: z2.f
            public /* synthetic */ f() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                k.u(a0.this, task);
            }
        });
    }

    @Override // z2.p
    public void c(Activity activity, e0 e0Var, y2.a aVar) {
        this.f32295h = e0Var;
        this.f32294g = aVar;
        com.google.android.gms.location.o.b(this.f32288a).checkLocationSettings(r(p(this.f32293f))).addOnSuccessListener(new OnSuccessListener() { // from class: z2.i
            public /* synthetic */ i() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                k.this.v((com.google.android.gms.location.q) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: z2.j

            /* renamed from: b */
            public final /* synthetic */ Activity f32286b;

            /* renamed from: c */
            public final /* synthetic */ y2.a f32287c;

            public /* synthetic */ j(Activity activity2, y2.a aVar2) {
                r2 = activity2;
                r3 = aVar2;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                k.this.w(r2, r3, exc);
            }
        });
    }

    @Override // z2.p
    public void d(e0 e0Var, y2.a aVar) {
        Task<Location> lastLocation = this.f32290c.getLastLocation();
        Objects.requireNonNull(e0Var);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: z2.g
            public /* synthetic */ g() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                e0.this.a((Location) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: z2.h
            public /* synthetic */ h() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                k.t(y2.a.this, exc);
            }
        });
    }

    @Override // z2.p
    public boolean e(int i10, int i11) {
        if (i10 == this.f32292e) {
            if (i11 == -1) {
                z zVar = this.f32293f;
                if (zVar == null || this.f32295h == null || this.f32294g == null) {
                    return false;
                }
                x(zVar);
                return true;
            }
            y2.a aVar = this.f32294g;
            if (aVar != null) {
                aVar.a(y2.b.locationServicesDisabled);
            }
        }
        return false;
    }

    @Override // z2.p
    public void f() {
        this.f32291d.e();
        this.f32290c.removeLocationUpdates(this.f32289b);
    }
}
