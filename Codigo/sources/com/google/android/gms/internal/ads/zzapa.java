package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class zzapa implements zzaoz {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzapa(FileChannel fileChannel, long j10, long j11) {
        this.zza = fileChannel;
        this.zzb = j10;
        this.zzc = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
