package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import gf.C7561c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p141hf.AbstractC7722e;
import p141hf.C7720c;

/* renamed from: com.google.firebase.storage.e */
/* loaded from: classes2.dex */
public class C6380e extends AbstractC6381e0<a> {

    /* renamed from: l */
    private final Uri f13806l;

    /* renamed from: m */
    private long f13807m;

    /* renamed from: n */
    private C6401p f13808n;

    /* renamed from: o */
    private C7561c f13809o;

    /* renamed from: p */
    private long f13810p = -1;

    /* renamed from: q */
    private String f13811q = null;

    /* renamed from: r */
    private volatile Exception f13812r = null;

    /* renamed from: s */
    private long f13813s = 0;

    /* renamed from: t */
    private int f13814t;

    /* renamed from: com.google.firebase.storage.e$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC6381e0<a>.b {

        /* renamed from: c */
        private final long f13815c;

        a(Exception exc, long j10) {
            super(exc);
            this.f13815c = j10;
        }

        /* renamed from: d */
        public long m17792d() {
            return this.f13815c;
        }

        /* renamed from: e */
        public long m17793e() {
            return C6380e.this.m17790m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6380e(C6401p c6401p, Uri uri) {
        this.f13808n = c6401p;
        this.f13806l = uri;
        C6382f m18009w = c6401p.m18009w();
        this.f13809o = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17864i());
    }

    /* renamed from: l0 */
    private int m17782l0(InputStream inputStream, byte[] bArr) {
        int read;
        int i10 = 0;
        boolean z10 = false;
        while (i10 != bArr.length && (read = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            try {
                i10 += read;
                z10 = true;
            } catch (IOException e10) {
                this.f13812r = e10;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    /* renamed from: n0 */
    private boolean m17783n0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: o0 */
    private boolean m17784o0(AbstractC7722e abstractC7722e) {
        FileOutputStream fileOutputStream;
        InputStream m23567t = abstractC7722e.m23567t();
        if (m23567t == null) {
            this.f13812r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f13806l.getPath());
        if (!file.exists()) {
            if (this.f13813s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        boolean z10 = true;
        if (this.f13813s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f13813s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            while (z10) {
                int m17782l0 = m17782l0(m23567t, bArr);
                if (m17782l0 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, m17782l0);
                this.f13807m += m17782l0;
                if (this.f13812r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f13812r);
                    this.f13812r = null;
                    z10 = false;
                }
                if (!m17837j0(4, false)) {
                    z10 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            m23567t.close();
            return z10;
        } catch (Throwable th2) {
            fileOutputStream.flush();
            fileOutputStream.close();
            m23567t.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: I */
    public C6401p mo17785I() {
        return this.f13808n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: U */
    public void mo17786U() {
        this.f13809o.m22956a();
        this.f13812r = C6398n.m17918c(Status.f10404v);
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: e0 */
    void mo17787e0() {
        String str;
        if (this.f13812r != null) {
            m17837j0(64, false);
            return;
        }
        if (!m17837j0(4, false)) {
            return;
        }
        do {
            this.f13807m = 0L;
            this.f13812r = null;
            this.f13809o.m22958c();
            C7720c c7720c = new C7720c(this.f13808n.m18010x(), this.f13808n.m17999m(), this.f13813s);
            this.f13809o.m22960e(c7720c, false);
            this.f13814t = c7720c.m23562o();
            this.f13812r = c7720c.m23555f() != null ? c7720c.m23555f() : this.f13812r;
            boolean z10 = m17783n0(this.f13814t) && this.f13812r == null && m17817B() == 4;
            if (z10) {
                this.f13810p = c7720c.m23565r() + this.f13813s;
                String m23564q = c7720c.m23564q("ETag");
                if (!TextUtils.isEmpty(m23564q) && (str = this.f13811q) != null && !str.equals(m23564q)) {
                    Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                    this.f13813s = 0L;
                    this.f13811q = null;
                    c7720c.m23550C();
                    mo17788f0();
                    return;
                }
                this.f13811q = m23564q;
                try {
                    z10 = m17784o0(c7720c);
                } catch (IOException e10) {
                    Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e10);
                    this.f13812r = e10;
                }
            }
            c7720c.m23550C();
            if (z10 && this.f13812r == null && m17817B() == 4) {
                m17837j0(RecognitionOptions.ITF, false);
                return;
            }
            File file = new File(this.f13806l.getPath());
            if (file.exists()) {
                this.f13813s = file.length();
            } else {
                this.f13813s = 0L;
            }
            if (m17817B() == 8) {
                m17837j0(16, false);
                return;
            }
            if (m17817B() == 32) {
                if (m17837j0(RecognitionOptions.QR_CODE, false)) {
                    return;
                }
                Log.w("FileDownloadTask", "Unable to change download task to final state from " + m17817B());
                return;
            }
        } while (this.f13807m > 0);
        m17837j0(64, false);
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: f0 */
    protected void mo17788f0() {
        C6385g0.m17878b().m17884g(m17820E());
    }

    /* renamed from: m0 */
    long m17790m0() {
        return this.f13810p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public a mo17789h0() {
        return new a(C6398n.m17920e(this.f13812r, this.f13814t), this.f13807m + this.f13813s);
    }
}
