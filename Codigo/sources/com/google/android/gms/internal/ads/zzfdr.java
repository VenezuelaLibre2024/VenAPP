package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfdr {
    public static void zza(AtomicReference atomicReference, zzfdq zzfdqVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfdqVar.zza(obj);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            zzcec.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
