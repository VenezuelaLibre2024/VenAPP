package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class h0 extends e0<d> {

    /* renamed from: l, reason: collision with root package name */
    private p f12624l;

    /* renamed from: m, reason: collision with root package name */
    private gf.c f12625m;

    /* renamed from: p, reason: collision with root package name */
    private b f12628p;

    /* renamed from: r, reason: collision with root package name */
    private long f12630r;

    /* renamed from: s, reason: collision with root package name */
    private long f12631s;

    /* renamed from: t, reason: collision with root package name */
    private InputStream f12632t;

    /* renamed from: u, reason: collision with root package name */
    private hf.e f12633u;

    /* renamed from: v, reason: collision with root package name */
    private String f12634v;

    /* renamed from: n, reason: collision with root package name */
    private volatile Exception f12626n = null;

    /* renamed from: o, reason: collision with root package name */
    private volatile int f12627o = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f12629q = -1;

    /* loaded from: classes2.dex */
    class a implements Callable<InputStream> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream call() {
            return h0.this.o0();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(d dVar, InputStream inputStream);
    }

    /* loaded from: classes2.dex */
    static class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private h0 f12636a;

        /* renamed from: b, reason: collision with root package name */
        private InputStream f12637b;

        /* renamed from: c, reason: collision with root package name */
        private Callable<InputStream> f12638c;

        /* renamed from: d, reason: collision with root package name */
        private IOException f12639d;

        /* renamed from: e, reason: collision with root package name */
        private long f12640e;

        /* renamed from: f, reason: collision with root package name */
        private long f12641f;

        /* renamed from: r, reason: collision with root package name */
        private boolean f12642r;

        c(Callable<InputStream> callable, h0 h0Var) {
            this.f12636a = h0Var;
            this.f12638c = callable;
        }

        private void b() {
            h0 h0Var = this.f12636a;
            if (h0Var != null && h0Var.B() == 32) {
                throw new com.google.firebase.storage.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            b();
            if (this.f12639d != null) {
                try {
                    InputStream inputStream = this.f12637b;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f12637b = null;
                if (this.f12641f == this.f12640e) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f12639d);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f12640e, this.f12639d);
                this.f12641f = this.f12640e;
                this.f12639d = null;
            }
            if (this.f12642r) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f12637b != null) {
                return true;
            }
            try {
                this.f12637b = this.f12638c.call();
                return true;
            } catch (Exception e10) {
                if (e10 instanceof IOException) {
                    throw ((IOException) e10);
                }
                throw new IOException("Unable to open stream", e10);
            }
        }

        private void f(long j10) {
            h0 h0Var = this.f12636a;
            if (h0Var != null) {
                h0Var.q0(j10);
            }
            this.f12640e += j10;
        }

        @Override // java.io.InputStream
        public int available() {
            while (e()) {
                try {
                    return this.f12637b.available();
                } catch (IOException e10) {
                    this.f12639d = e10;
                }
            }
            throw this.f12639d;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.f12637b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f12642r = true;
            h0 h0Var = this.f12636a;
            if (h0Var != null && h0Var.f12633u != null) {
                this.f12636a.f12633u.C();
                this.f12636a.f12633u = null;
            }
            b();
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
            while (e()) {
                try {
                    int read = this.f12637b.read();
                    if (read != -1) {
                        f(1L);
                    }
                    return read;
                } catch (IOException e10) {
                    this.f12639d = e10;
                }
            }
            throw this.f12639d;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (e()) {
                while (i11 > 262144) {
                    try {
                        int read = this.f12637b.read(bArr, i10, 262144);
                        if (read == -1) {
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        i12 += read;
                        i10 += read;
                        i11 -= read;
                        f(read);
                        b();
                    } catch (IOException e10) {
                        this.f12639d = e10;
                    }
                }
                if (i11 > 0) {
                    int read2 = this.f12637b.read(bArr, i10, i11);
                    if (read2 == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    i10 += read2;
                    i12 += read2;
                    i11 -= read2;
                    f(read2);
                }
                if (i11 == 0) {
                    return i12;
                }
            }
            throw this.f12639d;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long j11 = 0;
            while (e()) {
                while (j10 > 262144) {
                    try {
                        long skip = this.f12637b.skip(262144L);
                        if (skip < 0) {
                            if (j11 == 0) {
                                return -1L;
                            }
                            return j11;
                        }
                        j11 += skip;
                        j10 -= skip;
                        f(skip);
                        b();
                    } catch (IOException e10) {
                        this.f12639d = e10;
                    }
                }
                if (j10 > 0) {
                    long skip2 = this.f12637b.skip(j10);
                    if (skip2 < 0) {
                        if (j11 == 0) {
                            return -1L;
                        }
                        return j11;
                    }
                    j11 += skip2;
                    j10 -= skip2;
                    f(skip2);
                }
                if (j10 == 0) {
                    return j11;
                }
            }
            throw this.f12639d;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends e0<d>.b {

        /* renamed from: c, reason: collision with root package name */
        private final long f12643c;

        d(Exception exc, long j10) {
            super(exc);
            this.f12643c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(p pVar) {
        this.f12624l = pVar;
        f w10 = pVar.w();
        this.f12625m = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream o0() {
        String str;
        this.f12625m.c();
        hf.e eVar = this.f12633u;
        if (eVar != null) {
            eVar.C();
        }
        hf.c cVar = new hf.c(this.f12624l.x(), this.f12624l.m(), this.f12630r);
        this.f12633u = cVar;
        boolean z10 = false;
        this.f12625m.e(cVar, false);
        this.f12627o = this.f12633u.o();
        this.f12626n = this.f12633u.f() != null ? this.f12633u.f() : this.f12626n;
        if (p0(this.f12627o) && this.f12626n == null && B() == 4) {
            z10 = true;
        }
        if (!z10) {
            throw new IOException("Could not open resulting stream.");
        }
        String q10 = this.f12633u.q("ETag");
        if (!TextUtils.isEmpty(q10) && (str = this.f12634v) != null && !str.equals(q10)) {
            this.f12627o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        this.f12634v = q10;
        this.f12629q = this.f12633u.r() + this.f12630r;
        return this.f12633u.t();
    }

    private boolean p0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.e0
    public p I() {
        return this.f12624l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.storage.e0
    public void U() {
        this.f12625m.a();
        this.f12626n = n.c(Status.f9296v);
    }

    @Override // com.google.firebase.storage.e0
    protected void X() {
        this.f12631s = this.f12630r;
    }

    @Override // com.google.firebase.storage.e0
    public boolean a0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.e0
    public boolean d0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.e0
    void e0() {
        if (this.f12626n != null) {
            j0(64, false);
            return;
        }
        if (j0(4, false)) {
            c cVar = new c(new a(), this);
            this.f12632t = new BufferedInputStream(cVar);
            try {
                cVar.e();
                b bVar = this.f12628p;
                if (bVar != null) {
                    try {
                        bVar.a(g0(), this.f12632t);
                    } catch (Exception e10) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e10);
                        this.f12626n = e10;
                    }
                }
            } catch (IOException e11) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e11);
                this.f12626n = e11;
            }
            if (this.f12632t == null) {
                this.f12633u.C();
                this.f12633u = null;
            }
            if (this.f12626n == null && B() == 4) {
                j0(4, false);
                j0(RecognitionOptions.ITF, false);
                return;
            }
            if (j0(B() == 32 ? RecognitionOptions.QR_CODE : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + B());
        }
    }

    @Override // com.google.firebase.storage.e0
    protected void f0() {
        g0.b().g(E());
    }

    void q0(long j10) {
        long j11 = this.f12630r + j10;
        this.f12630r = j11;
        if (this.f12631s + 262144 <= j11) {
            if (B() == 4) {
                j0(4, false);
            } else {
                this.f12631s = this.f12630r;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 r0(b bVar) {
        com.google.android.gms.common.internal.s.j(bVar);
        com.google.android.gms.common.internal.s.n(this.f12628p == null);
        this.f12628p = bVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.e0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public d h0() {
        return new d(n.e(this.f12626n, this.f12627o), this.f12631s);
    }
}
