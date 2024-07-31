package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class zzgdm extends zzgds {
    private static final zzgex zza = new zzgex(zzgdm.class);
    private zzfzv zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzgdm(zzfzv zzfzvVar, boolean z10, boolean z11) {
        super(zzfzvVar.size());
        this.zzb = zzfzvVar;
        this.zzc = z10;
        this.zzf = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzf(i10, zzgen.zzp(future));
        } catch (ExecutionException e10) {
            zzI(e10.getCause());
        } catch (Throwable th2) {
            zzI(th2);
        }
    }

    /* renamed from: zzH */
    public final void zzx(zzfzv zzfzvVar) {
        int zzA = zzA();
        int i10 = 0;
        zzfxe.zzj(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfzvVar != null) {
                zzgce it = zzfzvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzd(th2) && zzK(zzC(), th2)) {
            zzJ(th2);
        } else if (th2 instanceof Error) {
            zzJ(th2);
        }
    }

    private static void zzJ(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private static boolean zzK(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        zzfzv zzfzvVar = this.zzb;
        return zzfzvVar != null ? "futures=".concat(zzfzvVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzfzv zzfzvVar = this.zzb;
        zzy(1);
        if ((zzfzvVar != null) && isCancelled()) {
            boolean zzt = zzt();
            zzgce it = zzfzvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable zzl = zzl();
        Objects.requireNonNull(zzl);
        zzK(set, zzl);
    }

    abstract void zzf(int i10, Object obj);

    abstract void zzu();

    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            zzgdl zzgdlVar = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdl
                public final /* synthetic */ zzfzv zzb;

                public /* synthetic */ zzgdl(zzfzv zzfzvVar) {
                    r2 = zzfzvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzgdm.this.zzx(r2);
                }
            };
            zzgce it = this.zzb.iterator();
            while (it.hasNext()) {
                ((com.google.common.util.concurrent.f) it.next()).addListener(zzgdlVar, zzgeb.INSTANCE);
            }
            return;
        }
        zzgce it2 = this.zzb.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            com.google.common.util.concurrent.f fVar = (com.google.common.util.concurrent.f) it2.next();
            fVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdk
                public final /* synthetic */ com.google.common.util.concurrent.f zzb;
                public final /* synthetic */ int zzc;

                public /* synthetic */ zzgdk(com.google.common.util.concurrent.f fVar2, int i102) {
                    r2 = fVar2;
                    r3 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzgdm.this.zzw(r2, r3);
                }
            }, zzgeb.INSTANCE);
            i102++;
        }
    }

    public final /* synthetic */ void zzw(com.google.common.util.concurrent.f fVar, int i10) {
        try {
            if (fVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, fVar);
            }
        } finally {
            zzx(null);
        }
    }

    public void zzy(int i10) {
        this.zzb = null;
    }
}
