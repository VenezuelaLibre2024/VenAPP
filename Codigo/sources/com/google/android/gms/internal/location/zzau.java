package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.f;
import com.google.android.gms.location.l;
import com.google.android.gms.location.m;
import com.google.android.gms.location.n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzau implements f {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(e eVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzah
            public /* synthetic */ zzah() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                e eVar2 = e.this;
                if (task.isSuccessful()) {
                    eVar2.setResult(Status.f9292r);
                    return;
                }
                if (task.isCanceled()) {
                    eVar2.setFailedResult(Status.f9296v);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof b) {
                    eVar2.setFailedResult(((b) exception).getStatus());
                } else {
                    eVar2.setFailedResult(Status.f9294t);
                }
            }
        });
        return taskCompletionSource;
    }

    public final i<Status> flushLocations(com.google.android.gms.common.api.f fVar) {
        return fVar.b(new zzaj(this, fVar));
    }

    public final Location getLastLocation(com.google.android.gms.common.api.f fVar) {
        boolean await;
        boolean z10 = false;
        s.b(fVar != null, "GoogleApiClient parameter is required.");
        zzda zzdaVar = (zzda) fVar.d(zzbp.zza);
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            zzdaVar.zzt(new l.a().a(), taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzai
                public final /* synthetic */ AtomicReference zza;
                public final /* synthetic */ CountDownLatch zzb;

                public /* synthetic */ zzai(AtomicReference atomicReference2, CountDownLatch countDownLatch2) {
                    r1 = atomicReference2;
                    r2 = countDownLatch2;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = r1;
                    CountDownLatch countDownLatch2 = r2;
                    if (task.isSuccessful()) {
                        atomicReference2.set((Location) task.getResult());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            await = countDownLatch2.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                if (await) {
                    return (Location) atomicReference2.get();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(com.google.android.gms.common.api.f fVar) {
        s.b(fVar != null, "GoogleApiClient parameter is required.");
        try {
            return ((zzda) fVar.d(zzbp.zza)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final i<Status> removeLocationUpdates(com.google.android.gms.common.api.f fVar, PendingIntent pendingIntent) {
        return fVar.b(new zzao(this, fVar, pendingIntent));
    }

    public final i<Status> removeLocationUpdates(com.google.android.gms.common.api.f fVar, m mVar) {
        return fVar.b(new zzap(this, fVar, mVar));
    }

    public final i<Status> removeLocationUpdates(com.google.android.gms.common.api.f fVar, n nVar) {
        return fVar.b(new zzan(this, fVar, nVar));
    }

    public final i<Status> requestLocationUpdates(com.google.android.gms.common.api.f fVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return fVar.b(new zzam(this, fVar, pendingIntent, locationRequest));
    }

    public final i<Status> requestLocationUpdates(com.google.android.gms.common.api.f fVar, LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.k(looper, "invalid null looper");
        }
        return fVar.b(new zzal(this, fVar, com.google.android.gms.common.api.internal.l.a(mVar, looper, m.class.getSimpleName()), locationRequest));
    }

    public final i<Status> requestLocationUpdates(com.google.android.gms.common.api.f fVar, LocationRequest locationRequest, n nVar) {
        Looper myLooper = Looper.myLooper();
        s.k(myLooper, "invalid null looper");
        return fVar.b(new zzak(this, fVar, com.google.android.gms.common.api.internal.l.a(nVar, myLooper, n.class.getSimpleName()), locationRequest));
    }

    public final i<Status> requestLocationUpdates(com.google.android.gms.common.api.f fVar, LocationRequest locationRequest, n nVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.k(looper, "invalid null looper");
        }
        return fVar.b(new zzak(this, fVar, com.google.android.gms.common.api.internal.l.a(nVar, looper, n.class.getSimpleName()), locationRequest));
    }

    public final i<Status> setMockLocation(com.google.android.gms.common.api.f fVar, Location location) {
        return fVar.b(new zzar(this, fVar, location));
    }

    public final i<Status> setMockMode(com.google.android.gms.common.api.f fVar, boolean z10) {
        return fVar.b(new zzaq(this, fVar, z10));
    }
}
