package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class zzgt extends zzgq {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgt(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzgs(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzfy.zza;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j10;
        try {
            try {
                Uri normalizeScheme = zzhbVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzhbVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme));
                    i10 = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new zzgs(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e10) {
                        e = e10;
                        if (true == (e instanceof FileNotFoundException)) {
                            i10 = 2005;
                        }
                        throw new zzgs(e, i10);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzhbVar.zzf > length) {
                    throw new zzgs(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(zzhbVar.zzf + startOffset) - startOffset;
                if (skip != zzhbVar.zzf) {
                    throw new zzgs(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j10 = -1;
                    } else {
                        j10 = size - channel.position();
                        this.zze = j10;
                        if (j10 < 0) {
                            throw new zzgs(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    j10 = length - skip;
                    this.zze = j10;
                    if (j10 < 0) {
                        throw new zzgs(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long j11 = zzhbVar.zzg;
                if (j11 != -1) {
                    if (j10 != -1) {
                        j11 = Math.min(j10, j11);
                    }
                    this.zze = j11;
                }
                this.zzf = true;
                zzj(zzhbVar);
                long j12 = zzhbVar.zzg;
                return j12 != -1 ? j12 : this.zze;
            } catch (IOException e11) {
                e = e11;
                i10 = AdError.SERVER_ERROR_CODE;
            }
        } catch (zzgs e12) {
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e10) {
                        throw new zzgs(e10, AdError.SERVER_ERROR_CODE);
                    }
                } catch (IOException e11) {
                    throw new zzgs(e11, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th3;
            } catch (IOException e12) {
                throw new zzgs(e12, AdError.SERVER_ERROR_CODE);
            }
        }
    }
}
