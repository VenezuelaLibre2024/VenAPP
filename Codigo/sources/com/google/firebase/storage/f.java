package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f12598a;

    /* renamed from: b, reason: collision with root package name */
    private final ee.b<oc.b> f12599b;

    /* renamed from: c, reason: collision with root package name */
    private final ee.b<jc.b> f12600c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12601d;

    /* renamed from: e, reason: collision with root package name */
    private long f12602e = 600000;

    /* renamed from: f, reason: collision with root package name */
    private long f12603f = 60000;

    /* renamed from: g, reason: collision with root package name */
    private long f12604g = 600000;

    /* renamed from: h, reason: collision with root package name */
    private long f12605h = 120000;

    /* renamed from: i, reason: collision with root package name */
    private id.a f12606i;

    /* loaded from: classes2.dex */
    class a implements jc.a {
        a() {
        }

        @Override // jc.a
        public void a(ec.d dVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str, zb.g gVar, ee.b<oc.b> bVar, ee.b<jc.b> bVar2) {
        this.f12601d = str;
        this.f12598a = gVar;
        this.f12599b = bVar;
        this.f12600c = bVar2;
        if (bVar2 == null || bVar2.get() == null) {
            return;
        }
        bVar2.get().b(new a());
    }

    private String d() {
        return this.f12601d;
    }

    public static f f(zb.g gVar, String str) {
        com.google.android.gms.common.internal.s.b(gVar != null, "Null is not a valid value for the FirebaseApp.");
        com.google.android.gms.common.internal.s.b(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return g(gVar, gf.i.d(gVar, str));
        } catch (UnsupportedEncodingException e10) {
            Log.e("FirebaseStorage", "Unable to parse url:" + str, e10);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    private static f g(zb.g gVar, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        com.google.android.gms.common.internal.s.k(gVar, "Provided FirebaseApp must not be null.");
        g gVar2 = (g) gVar.k(g.class);
        com.google.android.gms.common.internal.s.k(gVar2, "Firebase Storage component is not present.");
        return gVar2.a(host);
    }

    private p m(Uri uri) {
        com.google.android.gms.common.internal.s.k(uri, "uri must not be null");
        String d10 = d();
        com.google.android.gms.common.internal.s.b(TextUtils.isEmpty(d10) || uri.getAuthority().equalsIgnoreCase(d10), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new p(uri, this);
    }

    public zb.g a() {
        return this.f12598a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jc.b b() {
        ee.b<jc.b> bVar = this.f12600c;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public oc.b c() {
        ee.b<oc.b> bVar = this.f12599b;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public id.a e() {
        return this.f12606i;
    }

    public long h() {
        return this.f12603f;
    }

    public long i() {
        return this.f12604g;
    }

    public long j() {
        return this.f12605h;
    }

    public long k() {
        return this.f12602e;
    }

    public p l() {
        if (TextUtils.isEmpty(d())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return m(new Uri.Builder().scheme("gs").authority(d()).path("/").build());
    }

    public p n(String str) {
        com.google.android.gms.common.internal.s.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return l().h(str);
    }

    public void o(long j10) {
        this.f12604g = j10;
    }

    public void p(long j10) {
        this.f12605h = j10;
    }

    public void q(long j10) {
        this.f12602e = j10;
    }

    public void r(String str, int i10) {
        this.f12606i = new id.a(str, i10);
    }
}
