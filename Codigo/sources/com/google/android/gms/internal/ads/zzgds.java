package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdb;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgds extends zzgdb.zzi {
    private static final zzgdo zzba;
    private static final zzgex zzbb = new zzgex(zzgds.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgdo zzgdrVar;
        Throwable th2;
        try {
            zzgdrVar = new zzgdp(AtomicReferenceFieldUpdater.newUpdater(zzgds.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgds.class, "remaining"));
            th2 = null;
        } catch (Throwable th3) {
            zzgdrVar = new zzgdr(null);
            th2 = th3;
        }
        zzba = zzgdrVar;
        if (th2 != null) {
            zzbb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzgds(int i10) {
        this.remaining = i10;
    }

    public final int zzA() {
        return zzba.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzba.zzb(this, null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
