package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import gf.C7561c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p141hf.AbstractC7722e;
import p141hf.C7720c;

/* renamed from: com.google.firebase.storage.h0 */
/* loaded from: classes2.dex */
public class C6387h0 extends AbstractC6381e0<d> {

    /* renamed from: l */
    private C6401p f13856l;

    /* renamed from: m */
    private C7561c f13857m;

    /* renamed from: p */
    private b f13860p;

    /* renamed from: r */
    private long f13862r;

    /* renamed from: s */
    private long f13863s;

    /* renamed from: t */
    private InputStream f13864t;

    /* renamed from: u */
    private AbstractC7722e f13865u;

    /* renamed from: v */
    private String f13866v;

    /* renamed from: n */
    private volatile Exception f13858n = null;

    /* renamed from: o */
    private volatile int f13859o = 0;

    /* renamed from: q */
    private long f13861q = -1;

    /* renamed from: com.google.firebase.storage.h0$a */
    /* loaded from: classes2.dex */
    class a implements Callable<InputStream> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream call() {
            return C6387h0.this.m17890o0();
        }
    }

    /* renamed from: com.google.firebase.storage.h0$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo17896a(d dVar, InputStream inputStream);
    }

    /* renamed from: com.google.firebase.storage.h0$c */
    /* loaded from: classes2.dex */
    static class c extends InputStream {

        /* renamed from: a */
        private C6387h0 f13868a;

        /* renamed from: b */
        private InputStream f13869b;

        /* renamed from: c */
        private Callable<InputStream> f13870c;

        /* renamed from: d */
        private IOException f13871d;

        /* renamed from: e */
        private long f13872e;

        /* renamed from: f */
        private long f13873f;

        /* renamed from: r */
        private boolean f13874r;

        c(Callable<InputStream> callable, C6387h0 c6387h0) {
            this.f13868a = c6387h0;
            this.f13870c = callable;
        }

        /* renamed from: b */
        private void m17898b() {
            C6387h0 c6387h0 = this.f13868a;
            if (c6387h0 != null && c6387h0.m17817B() == 32) {
                throw new C6372a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public boolean m17899e() {
            m17898b();
            if (this.f13871d != null) {
                try {
                    InputStream inputStream = this.f13869b;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f13869b = null;
                if (this.f13873f == this.f13872e) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f13871d);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f13872e, this.f13871d);
                this.f13873f = this.f13872e;
                this.f13871d = null;
            }
            if (this.f13874r) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f13869b != null) {
                return true;
            }
            try {
                this.f13869b = this.f13870c.call();
                return true;
            } catch (Exception e10) {
                if (e10 instanceof IOException) {
                    throw ((IOException) e10);
                }
                throw new IOException("Unable to open stream", e10);
            }
        }

        /* renamed from: f */
        private void m17900f(long j10) {
            C6387h0 c6387h0 = this.f13868a;
            if (c6387h0 != null) {
                c6387h0.m17892q0(j10);
            }
            this.f13872e += j10;
        }

        @Override // java.io.InputStream
        public int available() {
            while (m17899e()) {
                try {
                    return this.f13869b.available();
                } catch (IOException e10) {
                    this.f13871d = e10;
                }
            }
            throw this.f13871d;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.f13869b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13874r = true;
            C6387h0 c6387h0 = this.f13868a;
            if (c6387h0 != null && c6387h0.f13865u != null) {
                this.f13868a.f13865u.m23550C();
                this.f13868a.f13865u = null;
            }
            m17898b();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            while (m17899e()) {
                try {
                    int read = this.f13869b.read();
                    if (read != -1) {
                        m17900f(1L);
                    }
                    return read;
                } catch (IOException e10) {
                    this.f13871d = e10;
                }
            }
            throw this.f13871d;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (m17899e()) {
                while (i11 > 262144) {
                    try {
                        int read = this.f13869b.read(bArr, i10, 262144);
                        if (read == -1) {
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        i12 += read;
                        i10 += read;
                        i11 -= read;
                        m17900f(read);
                        m17898b();
                    } catch (IOException e10) {
                        this.f13871d = e10;
                    }
                }
                if (i11 > 0) {
                    int read2 = this.f13869b.read(bArr, i10, i11);
                    if (read2 == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    i10 += read2;
                    i12 += read2;
                    i11 -= read2;
                    m17900f(read2);
                }
                if (i11 == 0) {
                    return i12;
                }
            }
            throw this.f13871d;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long j11 = 0;
            while (m17899e()) {
                while (j10 > 262144) {
                    try {
                        long skip = this.f13869b.skip(262144L);
                        if (skip < 0) {
                            if (j11 == 0) {
                                return -1L;
                            }
                            return j11;
                        }
                        j11 += skip;
                        j10 -= skip;
                        m17900f(skip);
                        m17898b();
                    } catch (IOException e10) {
                        this.f13871d = e10;
                    }
                }
                if (j10 > 0) {
                    long skip2 = this.f13869b.skip(j10);
                    if (skip2 < 0) {
                        if (j11 == 0) {
                            return -1L;
                        }
                        return j11;
                    }
                    j11 += skip2;
                    j10 -= skip2;
                    m17900f(skip2);
                }
                if (j10 == 0) {
                    return j11;
                }
            }
            throw this.f13871d;
        }
    }

    /* renamed from: com.google.firebase.storage.h0$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractC6381e0<d>.b {

        /* renamed from: c */
        private final long f13875c;

        d(Exception exc, long j10) {
            super(exc);
            this.f13875c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6387h0(C6401p c6401p) {
        this.f13856l = c6401p;
        C6382f m18009w = c6401p.m18009w();
        this.f13857m = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17864i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public InputStream m17890o0() {
        String str;
        this.f13857m.m22958c();
        AbstractC7722e abstractC7722e = this.f13865u;
        if (abstractC7722e != null) {
            abstractC7722e.m23550C();
        }
        C7720c c7720c = new C7720c(this.f13856l.m18010x(), this.f13856l.m17999m(), this.f13862r);
        this.f13865u = c7720c;
        boolean z10 = false;
        this.f13857m.m22960e(c7720c, false);
        this.f13859o = this.f13865u.m23562o();
        this.f13858n = this.f13865u.m23555f() != null ? this.f13865u.m23555f() : this.f13858n;
        if (m17891p0(this.f13859o) && this.f13858n == null && m17817B() == 4) {
            z10 = true;
        }
        if (!z10) {
            throw new IOException("Could not open resulting stream.");
        }
        String m23564q = this.f13865u.m23564q("ETag");
        if (!TextUtils.isEmpty(m23564q) && (str = this.f13866v) != null && !str.equals(m23564q)) {
            this.f13859o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        this.f13866v = m23564q;
        this.f13861q = this.f13865u.m23565r() + this.f13862r;
        return this.f13865u.m23567t();
    }

    /* renamed from: p0 */
    private boolean m17891p0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: I */
    public C6401p mo17785I() {
        return this.f13856l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: U */
    public void mo17786U() {
        this.f13857m.m22956a();
        this.f13858n = C6398n.m17918c(Status.f10404v);
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: X */
    protected void mo17827X() {
        this.f13863s = this.f13862r;
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: a0 */
    public boolean mo17830a0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: d0 */
    public boolean mo17833d0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: e0 */
    void mo17787e0() {
        if (this.f13858n != null) {
            m17837j0(64, false);
            return;
        }
        if (m17837j0(4, false)) {
            c cVar = new c(new a(), this);
            this.f13864t = new BufferedInputStream(cVar);
            try {
                cVar.m17899e();
                b bVar = this.f13860p;
                if (bVar != null) {
                    try {
                        bVar.mo17896a(m17834g0(), this.f13864t);
                    } catch (Exception e10) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e10);
                        this.f13858n = e10;
                    }
                }
            } catch (IOException e11) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e11);
                this.f13858n = e11;
            }
            if (this.f13864t == null) {
                this.f13865u.m23550C();
                this.f13865u = null;
            }
            if (this.f13858n == null && m17817B() == 4) {
                m17837j0(4, false);
                m17837j0(RecognitionOptions.ITF, false);
                return;
            }
            if (m17837j0(m17817B() == 32 ? RecognitionOptions.QR_CODE : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + m17817B());
        }
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: f0 */
    protected void mo17788f0() {
        C6385g0.m17878b().m17884g(m17820E());
    }

    /* renamed from: q0 */
    void m17892q0(long j10) {
        long j11 = this.f13862r + j10;
        this.f13862r = j11;
        if (this.f13863s + 262144 <= j11) {
            if (m17817B() == 4) {
                m17837j0(4, false);
            } else {
                this.f13863s = this.f13862r;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public C6387h0 m17893r0(b bVar) {
        C5276s.m13324j(bVar);
        C5276s.m13328n(this.f13860p == null);
        this.f13860p = bVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public d mo17789h0() {
        return new d(C6398n.m17920e(this.f13858n, this.f13859o), this.f13863s);
    }
}
