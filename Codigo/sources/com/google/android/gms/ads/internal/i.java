package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzave;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzfsn;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements Runnable, zzave {

    /* renamed from: d, reason: collision with root package name */
    protected boolean f8856d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8857e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8858f;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f8859r;

    /* renamed from: s, reason: collision with root package name */
    private final zzfqr f8860s;

    /* renamed from: t, reason: collision with root package name */
    private Context f8861t;

    /* renamed from: u, reason: collision with root package name */
    private final Context f8862u;

    /* renamed from: v, reason: collision with root package name */
    private zzcei f8863v;

    /* renamed from: w, reason: collision with root package name */
    private final zzcei f8864w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f8865x;

    /* renamed from: z, reason: collision with root package name */
    private int f8867z;

    /* renamed from: a, reason: collision with root package name */
    private final List f8853a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f8854b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f8855c = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    final CountDownLatch f8866y = new CountDownLatch(1);

    public i(Context context, zzcei zzceiVar) {
        this.f8861t = context;
        this.f8862u = context;
        this.f8863v = zzceiVar;
        this.f8864w = zzceiVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f8859r = newCachedThreadPool;
        boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzcj)).booleanValue();
        this.f8865x = booleanValue;
        this.f8860s = zzfqr.zza(context, newCachedThreadPool, booleanValue);
        this.f8857e = ((Boolean) a0.c().zza(zzbgc.zzcf)).booleanValue();
        this.f8858f = ((Boolean) a0.c().zza(zzbgc.zzck)).booleanValue();
        if (((Boolean) a0.c().zza(zzbgc.zzci)).booleanValue()) {
            this.f8867z = 2;
        } else {
            this.f8867z = 1;
        }
        if (!((Boolean) a0.c().zza(zzbgc.zzdm)).booleanValue()) {
            this.f8856d = c();
        }
        if (!((Boolean) a0.c().zza(zzbgc.zzdf)).booleanValue()) {
            x.b();
            if (!zzcdv.zzu()) {
                run();
                return;
            }
        }
        zzcep.zza.execute(this);
    }

    private final zzave f() {
        return (zzave) (e() == 2 ? this.f8855c : this.f8854b).get();
    }

    private final void g() {
        List list = this.f8853a;
        zzave f10 = f();
        if (list.isEmpty() || f10 == null) {
            return;
        }
        for (Object[] objArr : this.f8853a) {
            int length = objArr.length;
            if (length == 1) {
                f10.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                f10.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f8853a.clear();
    }

    private final void h(boolean z10) {
        this.f8854b.set(zzavh.zzu(this.f8863v.zza, i(this.f8861t), z10, this.f8867z));
    }

    private static final Context i(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzavb.zza(this.f8864w.zza, i(this.f8862u), z10, this.f8865x).zzp();
        } catch (NullPointerException e10) {
            this.f8860s.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e10);
        }
    }

    protected final boolean c() {
        Context context = this.f8861t;
        h hVar = new h(this);
        zzfqr zzfqrVar = this.f8860s;
        return new zzfsn(this.f8861t, zzfrt.zzb(context, zzfqrVar), hVar, ((Boolean) a0.c().zza(zzbgc.zzcg)).booleanValue()).zzd(1);
    }

    public final boolean d() {
        try {
            this.f8866y.await();
            return true;
        } catch (InterruptedException e10) {
            zzcec.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    protected final int e() {
        if (!this.f8857e || this.f8856d) {
            return this.f8867z;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) a0.c().zza(zzbgc.zzdm)).booleanValue()) {
                this.f8856d = c();
            }
            boolean z10 = this.f8863v.zzd;
            final boolean z11 = false;
            if (!((Boolean) a0.c().zza(zzbgc.zzaW)).booleanValue() && z10) {
                z11 = true;
            }
            if (e() == 1) {
                h(z11);
                if (this.f8867z == 2) {
                    this.f8859r.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.this.b(z11);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzavb zza = zzavb.zza(this.f8863v.zza, i(this.f8861t), z11, this.f8865x);
                    this.f8855c.set(zza);
                    if (this.f8858f && !zza.zzr()) {
                        this.f8867z = 1;
                        h(z11);
                    }
                } catch (NullPointerException e10) {
                    this.f8867z = 1;
                    h(z11);
                    this.f8860s.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e10);
                }
            }
        } finally {
            this.f8866y.countDown();
            this.f8861t = null;
            this.f8863v = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!d()) {
            return "";
        }
        zzave f10 = f();
        if (((Boolean) a0.c().zza(zzbgc.zzkh)).booleanValue()) {
            t.r();
            j2.i(view, 4, null);
        }
        if (f10 == null) {
            return "";
        }
        g();
        return f10.zzf(i(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzg(Context context) {
        zzave f10;
        if (!d() || (f10 = f()) == null) {
            return "";
        }
        g();
        return f10.zzg(i(context));
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) a0.c().zza(zzbgc.zzkg)).booleanValue()) {
            zzave f10 = f();
            if (((Boolean) a0.c().zza(zzbgc.zzkh)).booleanValue()) {
                t.r();
                j2.i(view, 2, null);
            }
            return f10 != null ? f10.zzh(context, view, activity) : "";
        }
        if (!d()) {
            return "";
        }
        zzave f11 = f();
        if (((Boolean) a0.c().zza(zzbgc.zzkh)).booleanValue()) {
            t.r();
            j2.i(view, 2, null);
        }
        return f11 != null ? f11.zzh(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzk(MotionEvent motionEvent) {
        zzave f10 = f();
        if (f10 == null) {
            this.f8853a.add(new Object[]{motionEvent});
        } else {
            g();
            f10.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzl(int i10, int i11, int i12) {
        zzave f10 = f();
        if (f10 == null) {
            this.f8853a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            g();
            f10.zzl(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzave f10;
        if (!d() || (f10 = f()) == null) {
            return;
        }
        f10.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzo(View view) {
        zzave f10 = f();
        if (f10 != null) {
            f10.zzo(view);
        }
    }
}
