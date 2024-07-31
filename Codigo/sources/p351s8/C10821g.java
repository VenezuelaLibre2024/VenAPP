package p351s8;

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
import p363t8.C11172r0;

/* renamed from: s8.g */
/* loaded from: classes.dex */
public final class C10821g extends AbstractC10819f {

    /* renamed from: e */
    private final ContentResolver f27361e;

    /* renamed from: f */
    private Uri f27362f;

    /* renamed from: g */
    private AssetFileDescriptor f27363g;

    /* renamed from: h */
    private FileInputStream f27364h;

    /* renamed from: i */
    private long f27365i;

    /* renamed from: j */
    private boolean f27366j;

    /* renamed from: s8.g$a */
    /* loaded from: classes.dex */
    public static class a extends C10829k {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public C10821g(Context context) {
        super(false);
        this.f27361e = context.getContentResolver();
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f27362f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f27364h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f27364h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f27363g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f27363g = null;
                    if (this.f27366j) {
                        this.f27366j = false;
                        m32995s();
                    }
                }
            } catch (Throwable th2) {
                this.f27364h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f27363g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f27363g = null;
                        if (this.f27366j) {
                            this.f27366j = false;
                            m32995s();
                        }
                        throw th2;
                    } finally {
                        this.f27363g = null;
                        if (this.f27366j) {
                            this.f27366j = false;
                            m32995s();
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

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f27362f;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        AssetFileDescriptor openAssetFileDescriptor;
        int i10 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = c10835n.f27407a;
            this.f27362f = uri;
            m32996t(c10835n);
            if ("content".equals(c10835n.f27407a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f27361e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f27361e.openAssetFileDescriptor(uri, "r");
            }
            this.f27363g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f27364h = fileInputStream;
            if (length != -1 && c10835n.f27413g > length) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c10835n.f27413g + startOffset) - startOffset;
            if (skip != c10835n.f27413g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f27365i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f27365i = position;
                    if (position < 0) {
                        throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f27365i = j10;
                if (j10 < 0) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = c10835n.f27414h;
            if (j11 != -1) {
                long j12 = this.f27365i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f27365i = j11;
            }
            this.f27366j = true;
            m32997u(c10835n);
            long j13 = c10835n.f27414h;
            return j13 != -1 ? j13 : this.f27365i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new a(e11, i10);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f27365i;
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
        int read = ((FileInputStream) C11172r0.m34928j(this.f27364h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f27365i;
        if (j11 != -1) {
            this.f27365i = j11 - read;
        }
        m32994r(read);
        return read;
    }
}
