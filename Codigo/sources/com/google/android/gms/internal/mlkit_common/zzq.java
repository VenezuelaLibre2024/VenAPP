package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzq {
    final long zza;
    final long zzb;
    final boolean zzc;

    private zzq(long j10, long j11, boolean z10) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzq zza(final FileDescriptor fileDescriptor) {
        StructStat structStat = (StructStat) zzc(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Os.fstat(fileDescriptor);
            }
        });
        return new zzq(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzq zzb(final String str) {
        StructStat structStat = (StructStat) zzc(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Os.lstat(str);
            }
        });
        return new zzq(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    private static Object zzc(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}