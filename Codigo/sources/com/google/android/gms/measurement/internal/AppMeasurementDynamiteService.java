package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends zzct {

    /* renamed from: a, reason: collision with root package name */
    w5 f9925a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, wa.u> f9926b = new androidx.collection.a();

    /* loaded from: classes2.dex */
    class a implements wa.v {

        /* renamed from: a, reason: collision with root package name */
        private zzda f9927a;

        a(zzda zzdaVar) {
            this.f9927a = zzdaVar;
        }

        @Override // wa.v
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f9927a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                w5 w5Var = AppMeasurementDynamiteService.this.f9925a;
                if (w5Var != null) {
                    w5Var.zzj().G().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements wa.u {

        /* renamed from: a, reason: collision with root package name */
        private zzda f9929a;

        b(zzda zzdaVar) {
            this.f9929a = zzdaVar;
        }

        @Override // wa.u
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f9929a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                w5 w5Var = AppMeasurementDynamiteService.this.f9925a;
                if (w5Var != null) {
                    w5Var.zzj().G().b("Event listener threw exception", e10);
                }
            }
        }
    }

    private final void f2(zzcv zzcvVar, String str) {
        zza();
        this.f9925a.G().M(zzcvVar, str);
    }

    private final void zza() {
        if (this.f9925a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void beginAdUnitExposure(String str, long j10) {
        zza();
        this.f9925a.t().u(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza();
        this.f9925a.C().Q(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearMeasurementEnabled(long j10) {
        zza();
        this.f9925a.C().K(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void endAdUnitExposure(String str, long j10) {
        zza();
        this.f9925a.t().y(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void generateEventId(zzcv zzcvVar) {
        zza();
        long K0 = this.f9925a.G().K0();
        zza();
        this.f9925a.G().K(zzcvVar, K0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getAppInstanceId(zzcv zzcvVar) {
        zza();
        this.f9925a.zzl().y(new r6(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCachedAppInstanceId(zzcv zzcvVar) {
        zza();
        f2(zzcvVar, this.f9925a.C().d0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        zza();
        this.f9925a.zzl().y(new f9(this, zzcvVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenClass(zzcv zzcvVar) {
        zza();
        f2(zzcvVar, this.f9925a.C().e0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenName(zzcv zzcvVar) {
        zza();
        f2(zzcvVar, this.f9925a.C().f0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getGmpAppId(zzcv zzcvVar) {
        zza();
        f2(zzcvVar, this.f9925a.C().g0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getMaxUserProperties(String str, zzcv zzcvVar) {
        zza();
        this.f9925a.C();
        com.google.android.gms.common.internal.s.f(str);
        zza();
        this.f9925a.G().J(zzcvVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getSessionId(zzcv zzcvVar) {
        zza();
        b7 C = this.f9925a.C();
        C.zzl().y(new y7(C, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getTestFlag(zzcv zzcvVar, int i10) {
        zza();
        if (i10 == 0) {
            this.f9925a.G().M(zzcvVar, this.f9925a.C().h0());
            return;
        }
        if (i10 == 1) {
            this.f9925a.G().K(zzcvVar, this.f9925a.C().c0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f9925a.G().J(zzcvVar, this.f9925a.C().b0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f9925a.G().O(zzcvVar, this.f9925a.C().Z().booleanValue());
                return;
            }
        }
        ib G = this.f9925a.G();
        double doubleValue = this.f9925a.C().a0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            G.f10701a.zzj().G().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar) {
        zza();
        this.f9925a.zzl().y(new i7(this, zzcvVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initForTests(Map map) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initialize(com.google.android.gms.dynamic.b bVar, zzdd zzddVar, long j10) {
        w5 w5Var = this.f9925a;
        if (w5Var == null) {
            this.f9925a = w5.a((Context) com.google.android.gms.common.internal.s.j((Context) com.google.android.gms.dynamic.d.g2(bVar)), zzddVar, Long.valueOf(j10));
        } else {
            w5Var.zzj().G().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void isDataCollectionEnabled(zzcv zzcvVar) {
        zza();
        this.f9925a.zzl().y(new eb(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zza();
        this.f9925a.C().S(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10) {
        zza();
        com.google.android.gms.common.internal.s.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f9925a.zzl().y(new h8(this, zzcvVar, new d0(str2, new z(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logHealthData(int i10, String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        zza();
        this.f9925a.zzj().u(i10, true, false, str, bVar == null ? null : com.google.android.gms.dynamic.d.g2(bVar), bVar2 == null ? null : com.google.android.gms.dynamic.d.g2(bVar2), bVar3 != null ? com.google.android.gms.dynamic.d.g2(bVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityCreated(com.google.android.gms.dynamic.b bVar, Bundle bundle, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivityCreated((Activity) com.google.android.gms.dynamic.d.g2(bVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityDestroyed(com.google.android.gms.dynamic.b bVar, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivityDestroyed((Activity) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityPaused(com.google.android.gms.dynamic.b bVar, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivityPaused((Activity) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityResumed(com.google.android.gms.dynamic.b bVar, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivityResumed((Activity) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.b bVar, zzcv zzcvVar, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        Bundle bundle = new Bundle();
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.d.g2(bVar), bundle);
        }
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f9925a.zzj().G().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStarted(com.google.android.gms.dynamic.b bVar, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivityStarted((Activity) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStopped(com.google.android.gms.dynamic.b bVar, long j10) {
        zza();
        f8 f8Var = this.f9925a.C().f9985c;
        if (f8Var != null) {
            this.f9925a.C().j0();
            f8Var.onActivityStopped((Activity) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void performAction(Bundle bundle, zzcv zzcvVar, long j10) {
        zza();
        zzcvVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        wa.u uVar;
        zza();
        synchronized (this.f9926b) {
            uVar = this.f9926b.get(Integer.valueOf(zzdaVar.zza()));
            if (uVar == null) {
                uVar = new b(zzdaVar);
                this.f9926b.put(Integer.valueOf(zzdaVar.zza()), uVar);
            }
        }
        this.f9925a.C().X(uVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void resetAnalyticsData(long j10) {
        zza();
        b7 C = this.f9925a.C();
        C.M(null);
        C.zzl().y(new s7(C, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zza();
        if (bundle == null) {
            this.f9925a.zzj().B().a("Conditional user property must not be null");
        } else {
            this.f9925a.C().C(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsent(final Bundle bundle, final long j10) {
        zza();
        final b7 C = this.f9925a.C();
        C.zzl().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.f7
            @Override // java.lang.Runnable
            public final void run() {
                b7 b7Var = b7.this;
                Bundle bundle2 = bundle;
                long j11 = j10;
                if (TextUtils.isEmpty(b7Var.k().B())) {
                    b7Var.B(bundle2, 0, j11);
                } else {
                    b7Var.zzj().H().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsentThirdParty(Bundle bundle, long j10) {
        zza();
        this.f9925a.C().B(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setCurrentScreen(com.google.android.gms.dynamic.b bVar, String str, String str2, long j10) {
        zza();
        this.f9925a.D().C((Activity) com.google.android.gms.dynamic.d.g2(bVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDataCollectionEnabled(boolean z10) {
        zza();
        b7 C = this.f9925a.C();
        C.q();
        C.zzl().y(new k7(C, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDefaultEventParameters(Bundle bundle) {
        zza();
        final b7 C = this.f9925a.C();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        C.zzl().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.d7
            @Override // java.lang.Runnable
            public final void run() {
                b7.this.A(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setEventInterceptor(zzda zzdaVar) {
        zza();
        a aVar = new a(zzdaVar);
        if (this.f9925a.zzl().E()) {
            this.f9925a.C().Y(aVar);
        } else {
            this.f9925a.zzl().y(new fa(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setInstanceIdProvider(zzdb zzdbVar) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMeasurementEnabled(boolean z10, long j10) {
        zza();
        this.f9925a.C().K(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMinimumSessionDuration(long j10) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setSessionTimeoutDuration(long j10) {
        zza();
        b7 C = this.f9925a.C();
        C.zzl().y(new m7(C, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserId(final String str, long j10) {
        zza();
        final b7 C = this.f9925a.C();
        if (str != null && TextUtils.isEmpty(str)) {
            C.f10701a.zzj().G().a("User ID must be non-empty or null");
        } else {
            C.zzl().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.g7
                @Override // java.lang.Runnable
                public final void run() {
                    b7 b7Var = b7.this;
                    if (b7Var.k().F(str)) {
                        b7Var.k().D();
                    }
                }
            });
            C.V(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.b bVar, boolean z10, long j10) {
        zza();
        this.f9925a.C().V(str, str2, com.google.android.gms.dynamic.d.g2(bVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        wa.u remove;
        zza();
        synchronized (this.f9926b) {
            remove = this.f9926b.remove(Integer.valueOf(zzdaVar.zza()));
        }
        if (remove == null) {
            remove = new b(zzdaVar);
        }
        this.f9925a.C().t0(remove);
    }
}
