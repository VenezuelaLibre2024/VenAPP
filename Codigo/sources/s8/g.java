package s8;

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
import t8.r0;

/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f25242e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f25243f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f25244g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f25245h;

    /* renamed from: i, reason: collision with root package name */
    private long f25246i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25247j;

    /* loaded from: classes.dex */
    public static class a extends k {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public g(Context context) {
        super(false);
        this.f25242e = context.getContentResolver();
    }

    @Override // s8.j
    public void close() {
        this.f25243f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f25245h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f25245h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25244g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f25244g = null;
                    if (this.f25247j) {
                        this.f25247j = false;
                        s();
                    }
                }
            } catch (Throwable th2) {
                this.f25245h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f25244g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f25244g = null;
                        if (this.f25247j) {
                            this.f25247j = false;
                            s();
                        }
                        throw th2;
                    } finally {
                        this.f25244g = null;
                        if (this.f25247j) {
                            this.f25247j = false;
                            s();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(e11, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e12) {
            throw new a(e12, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f25243f;
    }

    @Override // s8.j
    public long o(n nVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        int i10 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = nVar.f25288a;
            this.f25243f = uri;
            t(nVar);
            if ("content".equals(nVar.f25288a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f25242e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f25242e.openAssetFileDescriptor(uri, "r");
            }
            this.f25244g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f25245h = fileInputStream;
            if (length != -1 && nVar.f25294g > length) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(nVar.f25294g + startOffset) - startOffset;
            if (skip != nVar.f25294g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f25246i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f25246i = position;
                    if (position < 0) {
                        throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f25246i = j10;
                if (j10 < 0) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = nVar.f25295h;
            if (j11 != -1) {
                long j12 = this.f25246i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f25246i = j11;
            }
            this.f25247j = true;
            u(nVar);
            long j13 = nVar.f25295h;
            return j13 != -1 ? j13 : this.f25246i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new a(e11, i10);
        }
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25246i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((FileInputStream) r0.j(this.f25245h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f25246i;
        if (j11 != -1) {
            this.f25246i = j11 - read;
        }
        r(read);
        return read;
    }
}
