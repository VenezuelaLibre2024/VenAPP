package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class zzaqu extends FilterInputStream {
    private final long zza;
    private long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqu(InputStream inputStream, long j10) {
        super(inputStream);
        this.zza = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zza - this.zzb;
    }
}
