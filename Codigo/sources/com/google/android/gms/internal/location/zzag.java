package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g0;
import com.google.android.gms.location.m0;
import com.google.android.gms.location.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzag extends e {
    static final a.g zza;
    public static final a zzb;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzb = new a("ActivityRecognition.API", new zzad(), gVar);
    }

    public zzag(Activity activity) {
        super(activity, (a<a.d.c>) zzb, a.d.f9307l, e.a.f9309c);
    }

    public zzag(Context context) {
        super(context, (a<a.d.c>) zzb, a.d.f9307l, e.a.f9309c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzx
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                s.k(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzl(pendingIntent2, new t(zzafVar));
            }
        }).e(2406).a());
    }

    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzy
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                ((zzf) obj).zzp(pendingIntent2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).e(2402).a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzab
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                s.k(pendingIntent2, "PendingIntent must be specified.");
                s.k(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzp(pendingIntent2, new t(zzafVar));
            }
        }).e(2411).a());
    }

    public final Task<Void> requestActivityTransitionUpdates(final d dVar, final PendingIntent pendingIntent) {
        dVar.u1(getContextAttributionTag());
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzaa
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                d dVar2 = d.this;
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                s.k(dVar2, "activityTransitionRequest must be specified.");
                s.k(pendingIntent2, "PendingIntent must be specified.");
                s.k(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzq(dVar2, pendingIntent2, new t(zzafVar));
            }
        }).e(2405).a());
    }

    public final Task<Void> requestActivityUpdates(long j10, final PendingIntent pendingIntent) {
        com.google.android.gms.location.w wVar = new com.google.android.gms.location.w();
        wVar.a(j10);
        final g0 b10 = wVar.b();
        b10.u1(getContextAttributionTag());
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzz
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                g0 g0Var = g0.this;
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                s.k(g0Var, "ActivityRecognitionRequest can't be null.");
                s.k(pendingIntent2, "PendingIntent must be specified.");
                s.k(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzs(g0Var, pendingIntent2, new t(zzafVar));
            }
        }).e(2401).a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final v vVar) {
        s.k(pendingIntent, "PendingIntent must be specified.");
        return doRead(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzac
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzag zzagVar = zzag.this;
                ((zzo) ((zzf) obj).getService()).zzt(pendingIntent, vVar, new zzae(zzagVar, (TaskCompletionSource) obj2));
            }
        }).d(m0.f9854b).e(2410).a());
    }
}
