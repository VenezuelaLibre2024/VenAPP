package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.e;
import com.google.android.gms.location.g;
import com.google.android.gms.location.l;
import com.google.android.gms.location.m;
import com.google.android.gms.location.m0;
import com.google.android.gms.location.n;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbp extends e implements g {
    static final a.g zza;
    public static final a zzb;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzb = new a("LocationServices.API", new zzbm(), gVar);
    }

    public zzbp(Activity activity) {
        super(activity, (a<a.d.c>) zzb, a.d.f9307l, e.a.f9309c);
    }

    public zzbp(Context context) {
        super(context, (a<a.d.c>) zzb, a.d.f9307l, e.a.f9309c);
    }

    private final Task zza(LocationRequest locationRequest, k kVar) {
        zzbo zzboVar = new zzbo(this, kVar, zzax.zza);
        return doRegisterEventListener(q.a().b(new r() { // from class: com.google.android.gms.internal.location.zzay
            public final /* synthetic */ LocationRequest zzb;

            public /* synthetic */ zzay(LocationRequest locationRequest2) {
                r2 = locationRequest2;
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzu(zzbo.this, r2, (TaskCompletionSource) obj2);
            }
        }).f(zzboVar).g(kVar).e(2436).a());
    }

    private final Task zzb(LocationRequest locationRequest, k kVar) {
        zzbo zzboVar = new zzbo(this, kVar, zzbd.zza);
        return doRegisterEventListener(q.a().b(new r() { // from class: com.google.android.gms.internal.location.zzbf
            public final /* synthetic */ LocationRequest zzb;

            public /* synthetic */ zzbf(LocationRequest locationRequest2) {
                r2 = locationRequest2;
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzv(zzbo.this, r2, (TaskCompletionSource) obj2);
            }
        }).f(zzboVar).g(kVar).e(2435).a());
    }

    public final Task<Void> flushLocations() {
        return doWrite(w.a().b(zzav.zza).e(2422).a());
    }

    public final Task<Location> getCurrentLocation(int i10, CancellationToken cancellationToken) {
        e.a aVar = new e.a();
        aVar.b(i10);
        com.google.android.gms.location.e a10 = aVar.a();
        if (cancellationToken != null) {
            s.b(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(w.a().b(new zzbh(a10, cancellationToken)).e(2415).a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task<Location> getCurrentLocation(com.google.android.gms.location.e eVar, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            s.b(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(w.a().b(new zzbh(eVar, cancellationToken)).e(2415).a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.location.g
    public final Task<Location> getLastLocation() {
        return doRead(w.a().b(zzbe.zza).e(2414).a());
    }

    public final Task<Location> getLastLocation(l lVar) {
        return doRead(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzbj
            public /* synthetic */ zzbj() {
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzt(l.this, (TaskCompletionSource) obj2);
            }
        }).e(2414).d(m0.f9858f).a());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        return doRead(w.a().b(zzba.zza).e(2416).a());
    }

    public final Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzbg
            public final /* synthetic */ PendingIntent zza;

            public /* synthetic */ zzbg(PendingIntent pendingIntent2) {
                r1 = pendingIntent2;
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzD(r1, (TaskCompletionSource) obj2, null);
            }
        }).e(2418).a());
    }

    @Override // com.google.android.gms.location.g
    public final Task<Void> removeLocationUpdates(m mVar) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.l.c(mVar, m.class.getSimpleName()), 2418).continueWith(zzbk.zza, zzbc.zza);
    }

    public final Task<Void> removeLocationUpdates(n nVar) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.l.c(nVar, n.class.getSimpleName()), 2418).continueWith(zzbk.zza, zzbl.zza);
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzaz
            public final /* synthetic */ PendingIntent zza;
            public final /* synthetic */ LocationRequest zzb;

            public /* synthetic */ zzaz(PendingIntent pendingIntent2, LocationRequest locationRequest2) {
                r1 = pendingIntent2;
                r2 = locationRequest2;
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzw(r1, r2, (TaskCompletionSource) obj2);
            }
        }).e(2417).a());
    }

    @Override // com.google.android.gms.location.g
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.k(looper, "invalid null looper");
        }
        return zza(locationRequest, com.google.android.gms.common.api.internal.l.a(mVar, looper, m.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, n nVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.k(looper, "invalid null looper");
        }
        return zzb(locationRequest, com.google.android.gms.common.api.internal.l.a(nVar, looper, n.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, m mVar) {
        return zza(locationRequest, com.google.android.gms.common.api.internal.l.b(mVar, executor, m.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, n nVar) {
        return zzb(locationRequest, com.google.android.gms.common.api.internal.l.b(nVar, executor, n.class.getSimpleName()));
    }

    public final Task<Void> setMockLocation(Location location) {
        s.a(location != null);
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzaw
            public final /* synthetic */ Location zza;

            public /* synthetic */ zzaw(Location location2) {
                r1 = location2;
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzz(r1, (TaskCompletionSource) obj2);
            }
        }).e(2421).a());
    }

    public final Task<Void> setMockMode(boolean z10) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzbb
            public final /* synthetic */ boolean zza;

            public /* synthetic */ zzbb(boolean z102) {
                r1 = z102;
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzA(r1, (TaskCompletionSource) obj2);
            }
        }).e(2420).a());
    }
}
