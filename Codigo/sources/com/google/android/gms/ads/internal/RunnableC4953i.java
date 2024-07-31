package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.ads.internal.util.C5005j2;
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

/* renamed from: com.google.android.gms.ads.internal.i */
/* loaded from: classes.dex */
public final class RunnableC4953i implements Runnable, zzave {

    /* renamed from: d */
    protected boolean f9943d;

    /* renamed from: e */
    private final boolean f9944e;

    /* renamed from: f */
    private final boolean f9945f;

    /* renamed from: r */
    private final Executor f9946r;

    /* renamed from: s */
    private final zzfqr f9947s;

    /* renamed from: t */
    private Context f9948t;

    /* renamed from: u */
    private final Context f9949u;

    /* renamed from: v */
    private zzcei f9950v;

    /* renamed from: w */
    private final zzcei f9951w;

    /* renamed from: x */
    private final boolean f9952x;

    /* renamed from: z */
    private int f9954z;

    /* renamed from: a */
    private final List f9940a = new Vector();

    /* renamed from: b */
    private final AtomicReference f9941b = new AtomicReference();

    /* renamed from: c */
    private final AtomicReference f9942c = new AtomicReference();

    /* renamed from: y */
    final CountDownLatch f9953y = new CountDownLatch(1);

    public RunnableC4953i(Context context, zzcei zzceiVar) {
        this.f9948t = context;
        this.f9949u = context;
        this.f9950v = zzceiVar;
        this.f9951w = zzceiVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f9946r = newCachedThreadPool;
        boolean booleanValue = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzcj)).booleanValue();
        this.f9952x = booleanValue;
        this.f9947s = zzfqr.zza(context, newCachedThreadPool, booleanValue);
        this.f9944e = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzcf)).booleanValue();
        this.f9945f = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzck)).booleanValue();
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzci)).booleanValue()) {
            this.f9954z = 2;
        } else {
            this.f9954z = 1;
        }
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzdm)).booleanValue()) {
            this.f9943d = m12541c();
        }
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzdf)).booleanValue()) {
            C4930x.m12474b();
            if (!zzcdv.zzu()) {
                run();
                return;
            }
        }
        zzcep.zza.execute(this);
    }

    /* renamed from: f */
    private final zzave m12536f() {
        return (zzave) (m12543e() == 2 ? this.f9942c : this.f9941b).get();
    }

    /* renamed from: g */
    private final void m12537g() {
        List list = this.f9940a;
        zzave m12536f = m12536f();
        if (list.isEmpty() || m12536f == null) {
            return;
        }
        for (Object[] objArr : this.f9940a) {
            int length = objArr.length;
            if (length == 1) {
                m12536f.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                m12536f.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f9940a.clear();
    }

    /* renamed from: h */
    private final void m12538h(boolean z10) {
        this.f9941b.set(zzavh.zzu(this.f9950v.zza, m12539i(this.f9948t), z10, this.f9954z));
    }

    /* renamed from: i */
    private static final Context m12539i(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m12540b(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzavb.zza(this.f9951w.zza, m12539i(this.f9949u), z10, this.f9952x).zzp();
        } catch (NullPointerException e10) {
            this.f9947s.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e10);
        }
    }

    /* renamed from: c */
    protected final boolean m12541c() {
        Context context = this.f9948t;
        C4952h c4952h = new C4952h(this);
        zzfqr zzfqrVar = this.f9947s;
        return new zzfsn(this.f9948t, zzfrt.zzb(context, zzfqrVar), c4952h, ((Boolean) C4784a0.m12365c().zza(zzbgc.zzcg)).booleanValue()).zzd(1);
    }

    /* renamed from: d */
    public final boolean m12542d() {
        try {
            this.f9953y.await();
            return true;
        } catch (InterruptedException e10) {
            zzcec.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    /* renamed from: e */
    protected final int m12543e() {
        if (!this.f9944e || this.f9943d) {
            return this.f9954z;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzdm)).booleanValue()) {
                this.f9943d = m12541c();
            }
            boolean z10 = this.f9950v.zzd;
            final boolean z11 = false;
            if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzaW)).booleanValue() && z10) {
                z11 = true;
            }
            if (m12543e() == 1) {
                m12538h(z11);
                if (this.f9954z == 2) {
                    this.f9946r.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC4953i.this.m12540b(z11);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzavb zza = zzavb.zza(this.f9950v.zza, m12539i(this.f9948t), z11, this.f9952x);
                    this.f9942c.set(zza);
                    if (this.f9945f && !zza.zzr()) {
                        this.f9954z = 1;
                        m12538h(z11);
                    }
                } catch (NullPointerException e10) {
                    this.f9954z = 1;
                    m12538h(z11);
                    this.f9947s.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e10);
                }
            }
        } finally {
            this.f9953y.countDown();
            this.f9948t = null;
            this.f9950v = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!m12542d()) {
            return "";
        }
        zzave m12536f = m12536f();
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkh)).booleanValue()) {
            C4965t.m12581r();
            C5005j2.m12670i(view, 4, null);
        }
        if (m12536f == null) {
            return "";
        }
        m12537g();
        return m12536f.zzf(m12539i(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzg(Context context) {
        zzave m12536f;
        if (!m12542d() || (m12536f = m12536f()) == null) {
            return "";
        }
        m12537g();
        return m12536f.zzg(m12539i(context));
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkg)).booleanValue()) {
            zzave m12536f = m12536f();
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkh)).booleanValue()) {
                C4965t.m12581r();
                C5005j2.m12670i(view, 2, null);
            }
            return m12536f != null ? m12536f.zzh(context, view, activity) : "";
        }
        if (!m12542d()) {
            return "";
        }
        zzave m12536f2 = m12536f();
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkh)).booleanValue()) {
            C4965t.m12581r();
            C5005j2.m12670i(view, 2, null);
        }
        return m12536f2 != null ? m12536f2.zzh(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzk(MotionEvent motionEvent) {
        zzave m12536f = m12536f();
        if (m12536f == null) {
            this.f9940a.add(new Object[]{motionEvent});
        } else {
            m12537g();
            m12536f.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzl(int i10, int i11, int i12) {
        zzave m12536f = m12536f();
        if (m12536f == null) {
            this.f9940a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            m12537g();
            m12536f.zzl(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzave m12536f;
        if (!m12542d() || (m12536f = m12536f()) == null) {
            return;
        }
        m12536f.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzo(View view) {
        zzave m12536f = m12536f();
        if (m12536f != null) {
            m12536f.zzo(view);
        }
    }
}
