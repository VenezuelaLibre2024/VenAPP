package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import oc.w;
import zb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzacx<ResultT, CallbackT> implements zzadj<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected g zzc;
    protected a0 zzd;
    protected CallbackT zze;
    protected w zzf;
    protected zzacv<ResultT> zzg;
    protected Executor zzi;
    protected zzafn zzj;
    protected zzafc zzk;
    protected zzaen zzl;
    protected zzafw zzm;
    protected String zzn;
    protected String zzo;
    protected h zzp;
    protected String zzq;
    protected String zzr;
    protected zzyk zzs;
    protected zzafk zzt;
    protected zzafj zzu;
    protected zzagj zzv;
    protected zzagb zzw;
    boolean zzx;
    private boolean zzz;
    protected final zzacz zzb = new zzacz(this);
    protected final List<q0.b> zzh = new ArrayList();
    private boolean zzy = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class zza extends LifecycleCallback {
        private final List<q0.b> zza;

        private zza(j jVar, List<q0.b> list) {
            super(jVar);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<q0.b> list) {
            j fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.b("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacx(int i10) {
        this.zza = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzacx zzacxVar) {
        zzacxVar.zzb();
        s.o(zzacxVar.zzz, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzacx zzacxVar, Status status) {
        w wVar = zzacxVar.zzf;
        if (wVar != null) {
            wVar.zza(status);
        }
    }

    public final zzacx<ResultT, CallbackT> zza(a0 a0Var) {
        this.zzd = (a0) s.k(a0Var, "firebaseUser cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(q0.b bVar, Activity activity, Executor executor, String str) {
        q0.b zza2 = zzadt.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((q0.b) s.j(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) s.j(executor);
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) s.k(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(w wVar) {
        this.zzf = (w) s.k(wVar, "external failure callback cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(g gVar) {
        this.zzc = (g) s.k(gVar, "firebaseApp cannot be null");
        return this;
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, null);
    }
}
