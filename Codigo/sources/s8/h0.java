package s8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import t8.r0;

/* loaded from: classes.dex */
public final class h0 extends f {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f25254e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25255f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f25256g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f25257h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f25258i;

    /* renamed from: j, reason: collision with root package name */
    private long f25259j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25260k;

    /* loaded from: classes.dex */
    public static class a extends k {
        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public h0(Context context) {
        super(false);
        this.f25254e = context.getResources();
        this.f25255f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // s8.j
    public void close() {
        this.f25256g = null;
        try {
            try {
                InputStream inputStream = this.f25258i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f25258i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25257h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f25257h = null;
                    if (this.f25260k) {
                        this.f25260k = false;
                        s();
                    }
                }
            } catch (Throwable th2) {
                this.f25258i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f25257h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f25257h = null;
                        if (this.f25260k) {
                            this.f25260k = false;
                            s();
                        }
                        throw th2;
                    } finally {
                        this.f25257h = null;
                        if (this.f25260k) {
                            this.f25260k = false;
                            s();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(null, e11, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f25256g;
    }

    @Override // s8.j
    public long o(n nVar) {
        int parseInt;
        String str;
        Uri uri = nVar.f25288a;
        this.f25256g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) t8.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) t8.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String str2 = (String) t8.a.e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(str2);
            parseInt = this.f25254e.getIdentifier(sb2.toString(), "raw", this.f25255f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        t(nVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f25254e.openRawResourceFd(parseInt);
            this.f25257h = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, AdError.SERVER_ERROR_CODE);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f25258i = fileInputStream;
            if (length != -1) {
                try {
                    if (nVar.f25294g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(null, e11, AdError.SERVER_ERROR_CODE);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(nVar.f25294g + startOffset) - startOffset;
            if (skip != nVar.f25294g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f25259j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f25259j = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f25259j = j10;
                if (j10 < 0) {
                    throw new k(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = nVar.f25295h;
            if (j11 != -1) {
                long j12 = this.f25259j;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f25259j = j11;
            }
            this.f25260k = true;
            u(nVar);
            long j13 = nVar.f25295h;
            return j13 != -1 ? j13 : this.f25259j;
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25259j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) r0.j(this.f25258i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f25259j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j11 = this.f25259j;
        if (j11 != -1) {
            this.f25259j = j11 - read;
        }
        r(read);
        return read;
    }
}
