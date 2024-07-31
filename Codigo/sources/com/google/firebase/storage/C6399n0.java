package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.storage.C6400o;
import gf.C7560b;
import gf.C7561c;
import gf.C7564f;
import gf.C7567i;
import gf.InterfaceC7563e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import la.C9464i;
import la.InterfaceC9461f;
import org.json.JSONException;
import p141hf.AbstractC7722e;
import p141hf.C7724g;
import p141hf.C7725h;
import p141hf.C7726i;
import p141hf.C7727j;
import p180jc.InterfaceC9036b;
import p272oc.InterfaceC9835b;

/* renamed from: com.google.firebase.storage.n0 */
/* loaded from: classes2.dex */
public class C6399n0 extends AbstractC6381e0<b> {

    /* renamed from: E */
    private static final Random f13910E = new Random();

    /* renamed from: F */
    static InterfaceC7563e f13911F = new C7564f();

    /* renamed from: G */
    static InterfaceC9461f f13912G = C9464i.m28142d();

    /* renamed from: A */
    private volatile String f13913A;

    /* renamed from: B */
    private volatile long f13914B;

    /* renamed from: C */
    private int f13915C;

    /* renamed from: D */
    private final int f13916D;

    /* renamed from: l */
    private final C6401p f13917l;

    /* renamed from: m */
    private final Uri f13918m;

    /* renamed from: n */
    private final long f13919n;

    /* renamed from: o */
    private final C7560b f13920o;

    /* renamed from: p */
    private final AtomicLong f13921p;

    /* renamed from: q */
    private final InterfaceC9835b f13922q;

    /* renamed from: r */
    private final InterfaceC9036b f13923r;

    /* renamed from: s */
    private int f13924s;

    /* renamed from: t */
    private C7561c f13925t;

    /* renamed from: u */
    private boolean f13926u;

    /* renamed from: v */
    private volatile C6400o f13927v;

    /* renamed from: w */
    private volatile Uri f13928w;

    /* renamed from: x */
    private volatile Exception f13929x;

    /* renamed from: y */
    private volatile Exception f13930y;

    /* renamed from: z */
    private volatile int f13931z;

    /* renamed from: com.google.firebase.storage.n0$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7722e f13932a;

        a(AbstractC7722e abstractC7722e) {
            this.f13932a = abstractC7722e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13932a.m23549B(C7567i.m22971c(C6399n0.this.f13922q), C7567i.m22970b(C6399n0.this.f13923r), C6399n0.this.f13917l.m17999m().m42630m());
        }
    }

    /* renamed from: com.google.firebase.storage.n0$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractC6381e0<b>.b {

        /* renamed from: c */
        private final long f13934c;

        /* renamed from: d */
        private final Uri f13935d;

        /* renamed from: e */
        private final C6400o f13936e;

        b(Exception exc, long j10, Uri uri, C6400o c6400o) {
            super(exc);
            this.f13934c = j10;
            this.f13935d = uri;
            this.f13936e = c6400o;
        }

        /* renamed from: d */
        public long m17939d() {
            return this.f13934c;
        }

        /* renamed from: e */
        public C6400o m17940e() {
            return this.f13936e;
        }

        /* renamed from: f */
        public long m17941f() {
            return C6399n0.this.m17937q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public C6399n0(com.google.firebase.storage.C6401p r11, com.google.firebase.storage.C6400o r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.C6399n0.<init>(com.google.firebase.storage.p, com.google.firebase.storage.o, android.net.Uri, android.net.Uri):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6399n0(C6401p c6401p, C6400o c6400o, byte[] bArr) {
        this.f13921p = new AtomicLong(0L);
        this.f13924s = 262144;
        this.f13928w = null;
        this.f13929x = null;
        this.f13930y = null;
        this.f13931z = 0;
        this.f13915C = 0;
        this.f13916D = AdError.NETWORK_ERROR_CODE;
        C5276s.m13324j(c6401p);
        C5276s.m13324j(bArr);
        C6382f m18009w = c6401p.m18009w();
        this.f13919n = bArr.length;
        this.f13917l = c6401p;
        this.f13927v = c6400o;
        InterfaceC9835b m17861c = m18009w.m17861c();
        this.f13922q = m17861c;
        InterfaceC9036b m17860b = m18009w.m17860b();
        this.f13923r = m17860b;
        this.f13918m = null;
        this.f13920o = new C7560b(new ByteArrayInputStream(bArr), 262144);
        this.f13926u = true;
        this.f13914B = m18009w.m17863h();
        this.f13925t = new C7561c(m18009w.m17859a().m42630m(), m17861c, m17860b, m18009w.m17864i());
    }

    /* renamed from: o0 */
    private void m17927o0() {
        String m17971w = this.f13927v != null ? this.f13927v.m17971w() : null;
        if (this.f13918m != null && TextUtils.isEmpty(m17971w)) {
            m17971w = this.f13917l.m18009w().m17859a().m42630m().getContentResolver().getType(this.f13918m);
        }
        if (TextUtils.isEmpty(m17971w)) {
            m17971w = "application/octet-stream";
        }
        C7727j c7727j = new C7727j(this.f13917l.m18010x(), this.f13917l.m17999m(), this.f13927v != null ? this.f13927v.m17965q() : null, m17971w);
        if (m17933v0(c7727j)) {
            String m23564q = c7727j.m23564q("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(m23564q)) {
                return;
            }
            this.f13928w = Uri.parse(m23564q);
        }
    }

    /* renamed from: p0 */
    private boolean m17928p0(AbstractC7722e abstractC7722e) {
        try {
            Log.d("UploadTask", "Waiting " + this.f13915C + " milliseconds");
            f13911F.mo22964a(this.f13915C + f13910E.nextInt(250));
            boolean m17932u0 = m17932u0(abstractC7722e);
            if (m17932u0) {
                this.f13915C = 0;
            }
            return m17932u0;
        } catch (InterruptedException e10) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f13930y = e10;
            return false;
        }
    }

    /* renamed from: r0 */
    private boolean m17929r0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: s0 */
    private boolean m17930s0(AbstractC7722e abstractC7722e) {
        int m23562o = abstractC7722e.m23562o();
        if (this.f13925t.m22957b(m23562o)) {
            m23562o = -2;
        }
        this.f13931z = m23562o;
        this.f13930y = abstractC7722e.m23555f();
        this.f13913A = abstractC7722e.m23564q("X-Goog-Upload-Status");
        return m17929r0(this.f13931z) && this.f13930y == null;
    }

    /* renamed from: t0 */
    private boolean m17931t0(boolean z10) {
        C7726i c7726i = new C7726i(this.f13917l.m18010x(), this.f13917l.m17999m(), this.f13928w);
        if ("final".equals(this.f13913A)) {
            return false;
        }
        if (z10) {
            if (!m17933v0(c7726i)) {
                return false;
            }
        } else if (!m17932u0(c7726i)) {
            return false;
        }
        if ("final".equals(c7726i.m23564q("X-Goog-Upload-Status"))) {
            e = new IOException("The server has terminated the upload session");
        } else {
            String m23564q = c7726i.m23564q("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(m23564q) ? Long.parseLong(m23564q) : 0L;
            long j10 = this.f13921p.get();
            if (j10 > parseLong) {
                e = new IOException("Unexpected error. The server lost a chunk update.");
            } else {
                if (j10 >= parseLong) {
                    return true;
                }
                try {
                    if (this.f13920o.m22950a((int) r7) != parseLong - j10) {
                        this.f13929x = new IOException("Unexpected end of stream encountered.");
                        return false;
                    }
                    if (this.f13921p.compareAndSet(j10, parseLong)) {
                        return true;
                    }
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f13929x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                } catch (IOException e10) {
                    e = e10;
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                }
            }
        }
        this.f13929x = e;
        return false;
    }

    /* renamed from: u0 */
    private boolean m17932u0(AbstractC7722e abstractC7722e) {
        abstractC7722e.m23549B(C7567i.m22971c(this.f13922q), C7567i.m22970b(this.f13923r), this.f13917l.m17999m().m42630m());
        return m17930s0(abstractC7722e);
    }

    /* renamed from: v0 */
    private boolean m17933v0(AbstractC7722e abstractC7722e) {
        this.f13925t.m22959d(abstractC7722e);
        return m17930s0(abstractC7722e);
    }

    /* renamed from: w0 */
    private boolean m17934w0() {
        if (!"final".equals(this.f13913A)) {
            return true;
        }
        if (this.f13929x == null) {
            this.f13929x = new IOException("The server has terminated the upload session", this.f13930y);
        }
        m17837j0(64, false);
        return false;
    }

    /* renamed from: x0 */
    private boolean m17935x0() {
        if (m17817B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f13929x = new InterruptedException();
            m17837j0(64, false);
            return false;
        }
        if (m17817B() == 32) {
            m17837j0(RecognitionOptions.QR_CODE, false);
            return false;
        }
        if (m17817B() == 8) {
            m17837j0(16, false);
            return false;
        }
        if (!m17934w0()) {
            return false;
        }
        if (this.f13928w == null) {
            if (this.f13929x == null) {
                this.f13929x = new IllegalStateException("Unable to obtain an upload URL.");
            }
            m17837j0(64, false);
            return false;
        }
        if (this.f13929x != null) {
            m17837j0(64, false);
            return false;
        }
        boolean z10 = this.f13930y != null || this.f13931z < 200 || this.f13931z >= 300;
        long mo28131b = f13912G.mo28131b() + this.f13914B;
        long mo28131b2 = f13912G.mo28131b() + this.f13915C;
        if (z10) {
            if (mo28131b2 > mo28131b || !m17931t0(true)) {
                if (m17934w0()) {
                    m17837j0(64, false);
                }
                return false;
            }
            this.f13915C = Math.max(this.f13915C * 2, AdError.NETWORK_ERROR_CODE);
        }
        return true;
    }

    /* renamed from: z0 */
    private void m17936z0() {
        try {
            this.f13920o.m22953d(this.f13924s);
            int min = Math.min(this.f13924s, this.f13920o.m22951b());
            C7724g c7724g = new C7724g(this.f13917l.m18010x(), this.f13917l.m17999m(), this.f13928w, this.f13920o.m22954e(), this.f13921p.get(), min, this.f13920o.m22955f());
            if (!m17928p0(c7724g)) {
                this.f13924s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f13924s);
                return;
            }
            this.f13921p.getAndAdd(min);
            if (!this.f13920o.m22955f()) {
                this.f13920o.m22950a(min);
                int i10 = this.f13924s;
                if (i10 < 33554432) {
                    this.f13924s = i10 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f13924s);
                    return;
                }
                return;
            }
            try {
                this.f13927v = new C6400o.b(c7724g.m23561n(), this.f13917l).m17977a();
                m17837j0(4, false);
                m17837j0(RecognitionOptions.ITF, false);
            } catch (JSONException e10) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + c7724g.m23560m(), e10);
                this.f13929x = e10;
            }
        } catch (IOException e11) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e11);
            this.f13929x = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: I */
    public C6401p mo17785I() {
        return this.f13917l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: U */
    public void mo17786U() {
        this.f13925t.m22956a();
        C7725h c7725h = this.f13928w != null ? new C7725h(this.f13917l.m18010x(), this.f13917l.m17999m(), this.f13928w) : null;
        if (c7725h != null) {
            C6385g0.m17878b().m17883f(new a(c7725h));
        }
        this.f13929x = C6398n.m17918c(Status.f10404v);
        super.mo17786U();
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: c0 */
    protected void mo17832c0() {
        this.f13929x = null;
        this.f13930y = null;
        this.f13931z = 0;
        this.f13913A = null;
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: e0 */
    void mo17787e0() {
        this.f13925t.m22958c();
        if (!m17837j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f13917l.m18006t() == null) {
            this.f13929x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f13929x != null) {
            return;
        }
        if (this.f13928w == null) {
            m17927o0();
        } else {
            m17931t0(false);
        }
        boolean m17935x0 = m17935x0();
        while (m17935x0) {
            m17936z0();
            m17935x0 = m17935x0();
            if (m17935x0) {
                m17837j0(4, false);
            }
        }
        if (!this.f13926u || m17817B() == 16) {
            return;
        }
        try {
            this.f13920o.m22952c();
        } catch (IOException e10) {
            Log.e("UploadTask", "Unable to close stream.", e10);
        }
    }

    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: f0 */
    protected void mo17788f0() {
        C6385g0.m17878b().m17885h(m17820E());
    }

    /* renamed from: q0 */
    long m17937q0() {
        return this.f13919n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.AbstractC6381e0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b mo17789h0() {
        return new b(C6398n.m17920e(this.f13929x != null ? this.f13929x : this.f13930y, this.f13931z), this.f13921p.get(), this.f13928w, this.f13927v);
    }
}
