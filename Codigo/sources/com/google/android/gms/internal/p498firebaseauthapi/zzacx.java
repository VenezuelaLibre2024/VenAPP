package com.google.android.gms.internal.p498firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC5147j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.C6112q0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p272oc.InterfaceC9899w;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzacx<ResultT, CallbackT> implements zzadj<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected C12867g zzc;
    protected AbstractC6045a0 zzd;
    protected CallbackT zze;
    protected InterfaceC9899w zzf;
    protected zzacv<ResultT> zzg;
    protected Executor zzi;
    protected zzafn zzj;
    protected zzafc zzk;
    protected zzaen zzl;
    protected zzafw zzm;
    protected String zzn;
    protected String zzo;
    protected AbstractC6072h zzp;
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
    protected final List<C6112q0.b> zzh = new ArrayList();
    private boolean zzy = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class zza extends LifecycleCallback {
        private final List<C6112q0.b> zza;

        private zza(InterfaceC5147j interfaceC5147j, List<C6112q0.b> list) {
            super(interfaceC5147j);
            this.mLifecycleFragment.mo13078a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<C6112q0.b> list) {
            InterfaceC5147j fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.mo13079b("PhoneAuthActivityStopCallback", zza.class)) == null) {
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
        C5276s.m13329o(zzacxVar.zzz, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzacx zzacxVar, Status status) {
        InterfaceC9899w interfaceC9899w = zzacxVar.zzf;
        if (interfaceC9899w != null) {
            interfaceC9899w.zza(status);
        }
    }

    public final zzacx<ResultT, CallbackT> zza(AbstractC6045a0 abstractC6045a0) {
        this.zzd = (AbstractC6045a0) C5276s.m13325k(abstractC6045a0, "firebaseUser cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(C6112q0.b bVar, Activity activity, Executor executor, String str) {
        C6112q0.b zza2 = zzadt.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((C6112q0.b) C5276s.m13324j(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) C5276s.m13324j(executor);
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) C5276s.m13325k(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(InterfaceC9899w interfaceC9899w) {
        this.zzf = (InterfaceC9899w) C5276s.m13325k(interfaceC9899w, "external failure callback cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(C12867g c12867g) {
        this.zzc = (C12867g) C5276s.m13325k(c12867g, "firebaseApp cannot be null");
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
