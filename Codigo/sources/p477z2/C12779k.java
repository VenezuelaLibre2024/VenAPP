package p477z2;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.C5202l;
import com.google.android.gms.location.AbstractC5385m;
import com.google.android.gms.location.C5389o;
import com.google.android.gms.location.C5391p;
import com.google.android.gms.location.C5393q;
import com.google.android.gms.location.C5397s;
import com.google.android.gms.location.InterfaceC5373g;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.security.SecureRandom;
import java.util.Objects;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z2.k */
/* loaded from: classes.dex */
public class C12779k implements InterfaceC12784p {

    /* renamed from: a */
    private final Context f34839a;

    /* renamed from: b */
    private final AbstractC5385m f34840b;

    /* renamed from: c */
    private final InterfaceC5373g f34841c;

    /* renamed from: d */
    private final C12770d0 f34842d;

    /* renamed from: e */
    private final int f34843e = m42392s();

    /* renamed from: f */
    private final C12794z f34844f;

    /* renamed from: g */
    private InterfaceC12583a f34845g;

    /* renamed from: h */
    private InterfaceC12772e0 f34846h;

    /* renamed from: z2.k$a */
    /* loaded from: classes.dex */
    class a extends AbstractC5385m {

        /* renamed from: a */
        final /* synthetic */ Context f34847a;

        a(Context context) {
            this.f34847a = context;
        }

        @Override // com.google.android.gms.location.AbstractC5385m
        public synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
            if (!locationAvailability.m13470u1() && !C12779k.this.m42413a(this.f34847a) && C12779k.this.f34845g != null) {
                C12779k.this.f34845g.mo10589a(EnumC12584b.locationServicesDisabled);
            }
        }

        @Override // com.google.android.gms.location.AbstractC5385m
        public synchronized void onLocationResult(LocationResult locationResult) {
            if (C12779k.this.f34846h != null) {
                Location m13504u1 = locationResult.m13504u1();
                C12779k.this.f34842d.m42368b(m13504u1);
                C12779k.this.f34846h.mo10588a(m13504u1);
            } else {
                Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                C12779k.this.f34841c.removeLocationUpdates(C12779k.this.f34840b);
                if (C12779k.this.f34845g != null) {
                    C12779k.this.f34845g.mo10589a(EnumC12584b.errorWhileAcquiringPosition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z2.k$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f34849a;

        static {
            int[] iArr = new int[EnumC12781m.values().length];
            f34849a = iArr;
            try {
                iArr[EnumC12781m.lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34849a[EnumC12781m.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34849a[EnumC12781m.medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C12779k(Context context, C12794z c12794z) {
        this.f34839a = context;
        this.f34841c = C5389o.m13530a(context);
        this.f34844f = c12794z;
        this.f34842d = new C12770d0(context, c12794z);
        this.f34840b = new a(context);
    }

    /* renamed from: p */
    private static LocationRequest m42389p(C12794z c12794z) {
        if (Build.VERSION.SDK_INT < 33) {
            return m42390q(c12794z);
        }
        LocationRequest.C5360a c5360a = new LocationRequest.C5360a(0L);
        if (c12794z != null) {
            c5360a.m13498h(m42398y(c12794z.m42427a()));
            c5360a.m13494d(c12794z.m42429c());
            c5360a.m13497g(c12794z.m42429c());
            c5360a.m13496f((float) c12794z.m42428b());
        }
        return c5360a.m13491a();
    }

    /* renamed from: q */
    private static LocationRequest m42390q(C12794z c12794z) {
        LocationRequest m13472u1 = LocationRequest.m13472u1();
        if (c12794z != null) {
            m13472u1.m13482J1(m42398y(c12794z.m42427a()));
            m13472u1.m13481I1(c12794z.m42429c());
            m13472u1.m13480H1(c12794z.m42429c() / 2);
            m13472u1.m13483K1((float) c12794z.m42428b());
        }
        return m13472u1;
    }

    /* renamed from: r */
    private static C5391p m42391r(LocationRequest locationRequest) {
        C5391p.a aVar = new C5391p.a();
        aVar.m13534a(locationRequest);
        return aVar.m13535b();
    }

    /* renamed from: s */
    private synchronized int m42392s() {
        return new SecureRandom().nextInt(65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m42393t(InterfaceC12583a interfaceC12583a, Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        if (interfaceC12583a != null) {
            interfaceC12583a.mo10589a(EnumC12584b.errorWhileAcquiringPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m42394u(InterfaceC12764a0 interfaceC12764a0, Task task) {
        if (!task.isSuccessful()) {
            interfaceC12764a0.mo42357a(EnumC12584b.locationServicesDisabled);
        }
        C5393q c5393q = (C5393q) task.getResult();
        if (c5393q == null) {
            interfaceC12764a0.mo42357a(EnumC12584b.locationServicesDisabled);
            return;
        }
        C5397s m13536c = c5393q.m13536c();
        boolean z10 = true;
        boolean z11 = m13536c != null && m13536c.m13541x1();
        boolean z12 = m13536c != null && m13536c.m13543z1();
        if (!z11 && !z12) {
            z10 = false;
        }
        interfaceC12764a0.mo42358b(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m42395v(C5393q c5393q) {
        m42397x(this.f34844f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m42396w(Activity activity, InterfaceC12583a interfaceC12583a, Exception exc) {
        if (exc instanceof C5202l) {
            if (activity == null) {
                interfaceC12583a.mo10589a(EnumC12584b.locationServicesDisabled);
                return;
            }
            C5202l c5202l = (C5202l) exc;
            if (c5202l.getStatusCode() == 6) {
                try {
                    c5202l.m13212a(activity, this.f34843e);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        } else if (((C5102b) exc).getStatusCode() == 8502) {
            m42397x(this.f34844f);
            return;
        }
        interfaceC12583a.mo10589a(EnumC12584b.locationServicesDisabled);
    }

    /* renamed from: x */
    private void m42397x(C12794z c12794z) {
        LocationRequest m42389p = m42389p(c12794z);
        this.f34842d.m42369d();
        this.f34841c.requestLocationUpdates(m42389p, this.f34840b, Looper.getMainLooper());
    }

    /* renamed from: y */
    private static int m42398y(EnumC12781m enumC12781m) {
        int i10 = b.f34849a[enumC12781m.ordinal()];
        if (i10 == 1) {
            return 105;
        }
        if (i10 != 2) {
            return i10 != 3 ? 100 : 102;
        }
        return 104;
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: b */
    public void mo42399b(final InterfaceC12764a0 interfaceC12764a0) {
        C5389o.m13531b(this.f34839a).checkLocationSettings(new C5391p.a().m13535b()).addOnCompleteListener(new OnCompleteListener() { // from class: z2.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C12779k.m42394u(InterfaceC12764a0.this, task);
            }
        });
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: c */
    public void mo42400c(final Activity activity, InterfaceC12772e0 interfaceC12772e0, final InterfaceC12583a interfaceC12583a) {
        this.f34846h = interfaceC12772e0;
        this.f34845g = interfaceC12583a;
        C5389o.m13531b(this.f34839a).checkLocationSettings(m42391r(m42389p(this.f34844f))).addOnSuccessListener(new OnSuccessListener() { // from class: z2.i
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C12779k.this.m42395v((C5393q) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: z2.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C12779k.this.m42396w(activity, interfaceC12583a, exc);
            }
        });
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: d */
    public void mo42401d(final InterfaceC12772e0 interfaceC12772e0, final InterfaceC12583a interfaceC12583a) {
        Task<Location> lastLocation = this.f34841c.getLastLocation();
        Objects.requireNonNull(interfaceC12772e0);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: z2.g
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                InterfaceC12772e0.this.mo10588a((Location) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: z2.h
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C12779k.m42393t(InterfaceC12583a.this, exc);
            }
        });
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: e */
    public boolean mo42402e(int i10, int i11) {
        if (i10 == this.f34843e) {
            if (i11 == -1) {
                C12794z c12794z = this.f34844f;
                if (c12794z == null || this.f34846h == null || this.f34845g == null) {
                    return false;
                }
                m42397x(c12794z);
                return true;
            }
            InterfaceC12583a interfaceC12583a = this.f34845g;
            if (interfaceC12583a != null) {
                interfaceC12583a.mo10589a(EnumC12584b.locationServicesDisabled);
            }
        }
        return false;
    }

    @Override // p477z2.InterfaceC12784p
    /* renamed from: f */
    public void mo42403f() {
        this.f34842d.m42370e();
        this.f34841c.removeLocationUpdates(this.f34840b);
    }
}
