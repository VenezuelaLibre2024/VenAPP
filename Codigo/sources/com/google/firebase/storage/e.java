package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class e extends e0<a> {

    /* renamed from: l */
    private final Uri f12574l;

    /* renamed from: m */
    private long f12575m;

    /* renamed from: n */
    private p f12576n;

    /* renamed from: o */
    private gf.c f12577o;

    /* renamed from: p */
    private long f12578p = -1;

    /* renamed from: q */
    private String f12579q = null;

    /* renamed from: r */
    private volatile Exception f12580r = null;

    /* renamed from: s */
    private long f12581s = 0;

    /* renamed from: t */
    private int f12582t;

    /* loaded from: classes2.dex */
    public class a extends e0<a>.b {

        /* renamed from: c */
        private final long f12583c;

        a(Exception exc, long j10) {
            super(exc);
            this.f12583c = j10;
        }

        public long d() {
            return this.f12583c;
        }

        public long e() {
            return e.this.m0();
        }
    }

    public e(p pVar, Uri uri) {
        this.f12576n = pVar;
        this.f12574l = uri;
        f w10 = pVar.w();
        this.f12577o = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.i());
    }

    private int l0(InputStream inputStream, byte[] bArr) {
        int read;
        int i10 = 0;
        boolean z10 = false;
        while (i10 != bArr.length && (read = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            try {
                i10 += read;
                z10 = true;
            } catch (IOException e10) {
                this.f12580r = e10;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    private boolean n0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    private boolean o0(hf.e eVar) {
        FileOutputStream fileOutputStream;
        InputStream t10 = eVar.t();
        if (t10 == null) {
            this.f12580r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f12574l.getPath());
        if (!file.exists()) {
            if (this.f12581s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        boolean z10 = true;
        if (this.f12581s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f12581s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            while (z10) {
                int l02 = l0(t10, bArr);
                if (l02 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, l02);
                this.f12575m += l02;
                if (this.f12580r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f12580r);
                    this.f12580r = null;
                    z10 = false;
                }
                if (!j0(4, false)) {
                    z10 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            t10.close();
            return z10;
        } catch (Throwable th2) {
            fileOutputStream.flush();
            fileOutputStream.close();
            t10.close();
            throw th2;
        }
    }

    @Override // com.google.firebase.storage.e0
    public p I() {
        return this.f12576n;
    }

    @Override // com.google.firebase.storage.e0
    public void U() {
        this.f12577o.a();
        this.f12580r = n.c(Status.f9296v);
    }

    @Override // com.google.firebase.storage.e0
    void e0() {
        String str;
        if (this.f12580r != null) {
            j0(64, false);
            return;
        }
        if (!j0(4, false)) {
            return;
        }
        do {
            this.f12575m = 0L;
            this.f12580r = null;
            this.f12577o.c();
            hf.c cVar = new hf.c(this.f12576n.x(), this.f12576n.m(), this.f12581s);
            this.f12577o.e(cVar, false);
            this.f12582t = cVar.o();
            this.f12580r = cVar.f() != null ? cVar.f() : this.f12580r;
            boolean z10 = n0(this.f12582t) && this.f12580r == null && B() == 4;
            if (z10) {
                this.f12578p = cVar.r() + this.f12581s;
                String q10 = cVar.q("ETag");
                if (!TextUtils.isEmpty(q10) && (str = this.f12579q) != null && !str.equals(q10)) {
                    Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                    this.f12581s = 0L;
                    this.f12579q = null;
                    cVar.C();
                    f0();
                    return;
                }
                this.f12579q = q10;
                try {
                    z10 = o0(cVar);
                } catch (IOException e10) {
                    Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e10);
                    this.f12580r = e10;
                }
            }
            cVar.C();
            if (z10 && this.f12580r == null && B() == 4) {
                j0(RecognitionOptions.ITF, false);
                return;
            }
            File file = new File(this.f12574l.getPath());
            if (file.exists()) {
                this.f12581s = file.length();
            } else {
                this.f12581s = 0L;
            }
            if (B() == 8) {
                j0(16, false);
                return;
            }
            if (B() == 32) {
                if (j0(RecognitionOptions.QR_CODE, false)) {
                    return;
                }
                Log.w("FileDownloadTask", "Unable to change download task to final state from " + B());
                return;
            }
        } while (this.f12575m > 0);
        j0(64, false);
    }

    @Override // com.google.firebase.storage.e0
    protected void f0() {
        g0.b().g(E());
    }

    long m0() {
        return this.f12578p;
    }

    @Override // com.google.firebase.storage.e0
    /* renamed from: p0 */
    public a h0() {
        return new a(n.e(this.f12580r, this.f12582t), this.f12575m + this.f12581s);
    }
}
