package s8;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import t8.r0;

/* loaded from: classes.dex */
public final class w extends f {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f25392e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f25393f;

    /* renamed from: g, reason: collision with root package name */
    private long f25394g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25395h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends k {
        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }

        public b(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public w() {
        super(false);
    }

    private static RandomAccessFile v(Uri uri) {
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) t8.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (r0.f26744a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new b(e12, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // s8.j
    public void close() {
        this.f25393f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f25392e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f25392e = null;
            if (this.f25395h) {
                this.f25395h = false;
                s();
            }
        }
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f25393f;
    }

    @Override // s8.j
    public long o(n nVar) {
        Uri uri = nVar.f25288a;
        this.f25393f = uri;
        t(nVar);
        RandomAccessFile v10 = v(uri);
        this.f25392e = v10;
        try {
            v10.seek(nVar.f25294g);
            long j10 = nVar.f25295h;
            if (j10 == -1) {
                j10 = this.f25392e.length() - nVar.f25294g;
            }
            this.f25394g = j10;
            if (j10 < 0) {
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.f25395h = true;
            u(nVar);
            return this.f25394g;
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f25394g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) r0.j(this.f25392e)).read(bArr, i10, (int) Math.min(this.f25394g, i11));
            if (read > 0) {
                this.f25394g -= read;
                r(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }
}
