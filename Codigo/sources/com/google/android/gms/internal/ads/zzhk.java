package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes2.dex */
final class zzhk {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
