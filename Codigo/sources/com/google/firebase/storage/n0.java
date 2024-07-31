package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.storage.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class n0 extends e0<b> {
    private static final Random E = new Random();
    static gf.e F = new gf.f();
    static la.f G = la.i.d();
    private volatile String A;
    private volatile long B;
    private int C;
    private final int D;

    /* renamed from: l */
    private final p f12678l;

    /* renamed from: m */
    private final Uri f12679m;

    /* renamed from: n */
    private final long f12680n;

    /* renamed from: o */
    private final gf.b f12681o;

    /* renamed from: p */
    private final AtomicLong f12682p;

    /* renamed from: q */
    private final oc.b f12683q;

    /* renamed from: r */
    private final jc.b f12684r;

    /* renamed from: s */
    private int f12685s;

    /* renamed from: t */
    private gf.c f12686t;

    /* renamed from: u */
    private boolean f12687u;

    /* renamed from: v */
    private volatile o f12688v;

    /* renamed from: w */
    private volatile Uri f12689w;

    /* renamed from: x */
    private volatile Exception f12690x;

    /* renamed from: y */
    private volatile Exception f12691y;

    /* renamed from: z */
    private volatile int f12692z;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ hf.e f12693a;

        a(hf.e eVar) {
            this.f12693a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12693a.B(gf.i.c(n0.this.f12683q), gf.i.b(n0.this.f12684r), n0.this.f12678l.m().m());
        }
    }

    /* loaded from: classes2.dex */
    public class b extends e0<b>.b {

        /* renamed from: c */
        private final long f12695c;

        /* renamed from: d */
        private final Uri f12696d;

        /* renamed from: e */
        private final o f12697e;

        b(Exception exc, long j10, Uri uri, o oVar) {
            super(exc);
            this.f12695c = j10;
            this.f12696d = uri;
            this.f12697e = oVar;
        }

        public long d() {
            return this.f12695c;
        }

        public o e() {
            return this.f12697e;
        }

        public long f() {
            return n0.this.q0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n0(com.google.firebase.storage.p r11, com.google.firebase.storage.o r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.n0.<init>(com.google.firebase.storage.p, com.google.firebase.storage.o, android.net.Uri, android.net.Uri):void");
    }

    public n0(p pVar, o oVar, byte[] bArr) {
        this.f12682p = new AtomicLong(0L);
        this.f12685s = 262144;
        this.f12689w = null;
        this.f12690x = null;
        this.f12691y = null;
        this.f12692z = 0;
        this.C = 0;
        this.D = AdError.NETWORK_ERROR_CODE;
        com.google.android.gms.common.internal.s.j(pVar);
        com.google.android.gms.common.internal.s.j(bArr);
        f w10 = pVar.w();
        this.f12680n = bArr.length;
        this.f12678l = pVar;
        this.f12688v = oVar;
        oc.b c10 = w10.c();
        this.f12683q = c10;
        jc.b b10 = w10.b();
        this.f12684r = b10;
        this.f12679m = null;
        this.f12681o = new gf.b(new ByteArrayInputStream(bArr), 262144);
        this.f12687u = true;
        this.B = w10.h();
        this.f12686t = new gf.c(w10.a().m(), c10, b10, w10.i());
    }

    private void o0() {
        String w10 = this.f12688v != null ? this.f12688v.w() : null;
        if (this.f12679m != null && TextUtils.isEmpty(w10)) {
            w10 = this.f12678l.w().a().m().getContentResolver().getType(this.f12679m);
        }
        if (TextUtils.isEmpty(w10)) {
            w10 = "application/octet-stream";
        }
        hf.j jVar = new hf.j(this.f12678l.x(), this.f12678l.m(), this.f12688v != null ? this.f12688v.q() : null, w10);
        if (v0(jVar)) {
            String q10 = jVar.q("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(q10)) {
                return;
            }
            this.f12689w = Uri.parse(q10);
        }
    }

    private boolean p0(hf.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.C + " milliseconds");
            F.a(this.C + E.nextInt(250));
            boolean u02 = u0(eVar);
            if (u02) {
                this.C = 0;
            }
            return u02;
        } catch (InterruptedException e10) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f12691y = e10;
            return false;
        }
    }

    private boolean r0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    private boolean s0(hf.e eVar) {
        int o10 = eVar.o();
        if (this.f12686t.b(o10)) {
            o10 = -2;
        }
        this.f12692z = o10;
        this.f12691y = eVar.f();
        this.A = eVar.q("X-Goog-Upload-Status");
        return r0(this.f12692z) && this.f12691y == null;
    }

    private boolean t0(boolean z10) {
        hf.i iVar = new hf.i(this.f12678l.x(), this.f12678l.m(), this.f12689w);
        if ("final".equals(this.A)) {
            return false;
        }
        if (z10) {
            if (!v0(iVar)) {
                return false;
            }
        } else if (!u0(iVar)) {
            return false;
        }
        if ("final".equals(iVar.q("X-Goog-Upload-Status"))) {
            e = new IOException("The server has terminated the upload session");
        } else {
            String q10 = iVar.q("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(q10) ? Long.parseLong(q10) : 0L;
            long j10 = this.f12682p.get();
            if (j10 > parseLong) {
                e = new IOException("Unexpected error. The server lost a chunk update.");
            } else {
                if (j10 >= parseLong) {
                    return true;
                }
                try {
                    if (this.f12681o.a((int) r7) != parseLong - j10) {
                        this.f12690x = new IOException("Unexpected end of stream encountered.");
                        return false;
                    }
                    if (this.f12682p.compareAndSet(j10, parseLong)) {
                        return true;
                    }
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f12690x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                } catch (IOException e10) {
                    e = e10;
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                }
            }
        }
        this.f12690x = e;
        return false;
    }

    private boolean u0(hf.e eVar) {
        eVar.B(gf.i.c(this.f12683q), gf.i.b(this.f12684r), this.f12678l.m().m());
        return s0(eVar);
    }

    private boolean v0(hf.e eVar) {
        this.f12686t.d(eVar);
        return s0(eVar);
    }

    private boolean w0() {
        if (!"final".equals(this.A)) {
            return true;
        }
        if (this.f12690x == null) {
            this.f12690x = new IOException("The server has terminated the upload session", this.f12691y);
        }
        j0(64, false);
        return false;
    }

    private boolean x0() {
        if (B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f12690x = new InterruptedException();
            j0(64, false);
            return false;
        }
        if (B() == 32) {
            j0(RecognitionOptions.QR_CODE, false);
            return false;
        }
        if (B() == 8) {
            j0(16, false);
            return false;
        }
        if (!w0()) {
            return false;
        }
        if (this.f12689w == null) {
            if (this.f12690x == null) {
                this.f12690x = new IllegalStateException("Unable to obtain an upload URL.");
            }
            j0(64, false);
            return false;
        }
        if (this.f12690x != null) {
            j0(64, false);
            return false;
        }
        boolean z10 = this.f12691y != null || this.f12692z < 200 || this.f12692z >= 300;
        long b10 = G.b() + this.B;
        long b11 = G.b() + this.C;
        if (z10) {
            if (b11 > b10 || !t0(true)) {
                if (w0()) {
                    j0(64, false);
                }
                return false;
            }
            this.C = Math.max(this.C * 2, AdError.NETWORK_ERROR_CODE);
        }
        return true;
    }

    private void z0() {
        try {
            this.f12681o.d(this.f12685s);
            int min = Math.min(this.f12685s, this.f12681o.b());
            hf.g gVar = new hf.g(this.f12678l.x(), this.f12678l.m(), this.f12689w, this.f12681o.e(), this.f12682p.get(), min, this.f12681o.f());
            if (!p0(gVar)) {
                this.f12685s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f12685s);
                return;
            }
            this.f12682p.getAndAdd(min);
            if (!this.f12681o.f()) {
                this.f12681o.a(min);
                int i10 = this.f12685s;
                if (i10 < 33554432) {
                    this.f12685s = i10 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f12685s);
                    return;
                }
                return;
            }
            try {
                this.f12688v = new o.b(gVar.n(), this.f12678l).a();
                j0(4, false);
                j0(RecognitionOptions.ITF, false);
            } catch (JSONException e10) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + gVar.m(), e10);
                this.f12690x = e10;
            }
        } catch (IOException e11) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e11);
            this.f12690x = e11;
        }
    }

    @Override // com.google.firebase.storage.e0
    public p I() {
        return this.f12678l;
    }

    @Override // com.google.firebase.storage.e0
    public void U() {
        this.f12686t.a();
        hf.h hVar = this.f12689w != null ? new hf.h(this.f12678l.x(), this.f12678l.m(), this.f12689w) : null;
        if (hVar != null) {
            g0.b().f(new a(hVar));
        }
        this.f12690x = n.c(Status.f9296v);
        super.U();
    }

    @Override // com.google.firebase.storage.e0
    protected void c0() {
        this.f12690x = null;
        this.f12691y = null;
        this.f12692z = 0;
        this.A = null;
    }

    @Override // com.google.firebase.storage.e0
    void e0() {
        this.f12686t.c();
        if (!j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f12678l.t() == null) {
            this.f12690x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f12690x != null) {
            return;
        }
        if (this.f12689w == null) {
            o0();
        } else {
            t0(false);
        }
        boolean x02 = x0();
        while (x02) {
            z0();
            x02 = x0();
            if (x02) {
                j0(4, false);
            }
        }
        if (!this.f12687u || B() == 16) {
            return;
        }
        try {
            this.f12681o.c();
        } catch (IOException e10) {
            Log.e("UploadTask", "Unable to close stream.", e10);
        }
    }

    @Override // com.google.firebase.storage.e0
    protected void f0() {
        g0.b().h(E());
    }

    long q0() {
        return this.f12680n;
    }

    @Override // com.google.firebase.storage.e0
    /* renamed from: y0 */
    public b h0() {
        return new b(n.e(this.f12690x != null ? this.f12690x : this.f12691y, this.f12692z), this.f12682p.get(), this.f12689w, this.f12688v);
    }
}
