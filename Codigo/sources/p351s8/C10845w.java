package p351s8;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: s8.w */
/* loaded from: classes.dex */
public final class C10845w extends AbstractC10819f {

    /* renamed from: e */
    private RandomAccessFile f27511e;

    /* renamed from: f */
    private Uri f27512f;

    /* renamed from: g */
    private long f27513g;

    /* renamed from: h */
    private boolean f27514h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.w$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m33086b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: s8.w$b */
    /* loaded from: classes.dex */
    public static class b extends C10829k {
        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }

        public b(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C10845w() {
        super(false);
    }

    /* renamed from: v */
    private static RandomAccessFile m33084v(Uri uri) {
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) C11137a.m34603e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (C11172r0.f29040a < 21 || !a.m33086b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new b(e12, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f27512f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f27511e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f27511e = null;
            if (this.f27514h) {
                this.f27514h = false;
                m32995s();
            }
        }
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f27512f;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        Uri uri = c10835n.f27407a;
        this.f27512f = uri;
        m32996t(c10835n);
        RandomAccessFile m33084v = m33084v(uri);
        this.f27511e = m33084v;
        try {
            m33084v.seek(c10835n.f27413g);
            long j10 = c10835n.f27414h;
            if (j10 == -1) {
                j10 = this.f27511e.length() - c10835n.f27413g;
            }
            this.f27513g = j10;
            if (j10 < 0) {
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.f27514h = true;
            m32997u(c10835n);
            return this.f27513g;
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f27513g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C11172r0.m34928j(this.f27511e)).read(bArr, i10, (int) Math.min(this.f27513g, i11));
            if (read > 0) {
                this.f27513g -= read;
                m32994r(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, AdError.SERVER_ERROR_CODE);
        }
    }
}
