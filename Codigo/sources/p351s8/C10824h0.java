package p351s8;

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
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: s8.h0 */
/* loaded from: classes.dex */
public final class C10824h0 extends AbstractC10819f {

    /* renamed from: e */
    private final Resources f27373e;

    /* renamed from: f */
    private final String f27374f;

    /* renamed from: g */
    private Uri f27375g;

    /* renamed from: h */
    private AssetFileDescriptor f27376h;

    /* renamed from: i */
    private InputStream f27377i;

    /* renamed from: j */
    private long f27378j;

    /* renamed from: k */
    private boolean f27379k;

    /* renamed from: s8.h0$a */
    /* loaded from: classes.dex */
    public static class a extends C10829k {
        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public C10824h0(Context context) {
        super(false);
        this.f27373e = context.getResources();
        this.f27374f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f27375g = null;
        try {
            try {
                InputStream inputStream = this.f27377i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f27377i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f27376h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f27376h = null;
                    if (this.f27379k) {
                        this.f27379k = false;
                        m32995s();
                    }
                }
            } catch (Throwable th2) {
                this.f27377i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f27376h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f27376h = null;
                        if (this.f27379k) {
                            this.f27379k = false;
                            m32995s();
                        }
                        throw th2;
                    } finally {
                        this.f27376h = null;
                        if (this.f27379k) {
                            this.f27379k = false;
                            m32995s();
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

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f27375g;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        int parseInt;
        String str;
        Uri uri = c10835n.f27407a;
        this.f27375g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C11137a.m34603e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) C11137a.m34603e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String str2 = (String) C11137a.m34603e(uri.getPath());
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
            parseInt = this.f27373e.getIdentifier(sb2.toString(), "raw", this.f27374f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        m32996t(c10835n);
        try {
            AssetFileDescriptor openRawResourceFd = this.f27373e.openRawResourceFd(parseInt);
            this.f27376h = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, AdError.SERVER_ERROR_CODE);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f27377i = fileInputStream;
            if (length != -1) {
                try {
                    if (c10835n.f27413g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(null, e11, AdError.SERVER_ERROR_CODE);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(c10835n.f27413g + startOffset) - startOffset;
            if (skip != c10835n.f27413g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f27378j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f27378j = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f27378j = j10;
                if (j10 < 0) {
                    throw new C10829k(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = c10835n.f27414h;
            if (j11 != -1) {
                long j12 = this.f27378j;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f27378j = j11;
            }
            this.f27379k = true;
            m32997u(c10835n);
            long j13 = c10835n.f27414h;
            return j13 != -1 ? j13 : this.f27378j;
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f27378j;
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
        int read = ((InputStream) C11172r0.m34928j(this.f27377i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f27378j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j11 = this.f27378j;
        if (j11 != -1) {
            this.f27378j = j11 - read;
        }
        m32994r(read);
        return read;
    }
}
