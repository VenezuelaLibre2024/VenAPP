package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
final class zzbbi extends PushbackInputStream {
    final /* synthetic */ zzbbj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbi(zzbbj zzbbjVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.zza = zzbbjVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zzbbl.zze(this.zza.zzc);
        super.close();
    }
}
