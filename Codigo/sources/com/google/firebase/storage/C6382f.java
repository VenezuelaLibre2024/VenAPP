package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import ec.AbstractC7174d;
import ee.InterfaceC7183b;
import gf.C7567i;
import id.C7960a;
import java.io.UnsupportedEncodingException;
import p180jc.InterfaceC9035a;
import p180jc.InterfaceC9036b;
import p272oc.InterfaceC9835b;
import p485zb.C12867g;

/* renamed from: com.google.firebase.storage.f */
/* loaded from: classes2.dex */
public class C6382f {

    /* renamed from: a */
    private final C12867g f13830a;

    /* renamed from: b */
    private final InterfaceC7183b<InterfaceC9835b> f13831b;

    /* renamed from: c */
    private final InterfaceC7183b<InterfaceC9036b> f13832c;

    /* renamed from: d */
    private final String f13833d;

    /* renamed from: e */
    private long f13834e = 600000;

    /* renamed from: f */
    private long f13835f = 60000;

    /* renamed from: g */
    private long f13836g = 600000;

    /* renamed from: h */
    private long f13837h = 120000;

    /* renamed from: i */
    private C7960a f13838i;

    /* renamed from: com.google.firebase.storage.f$a */
    /* loaded from: classes2.dex */
    class a implements InterfaceC9035a {
        a() {
        }

        @Override // p180jc.InterfaceC9035a
        /* renamed from: a */
        public void mo17873a(AbstractC7174d abstractC7174d) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6382f(String str, C12867g c12867g, InterfaceC7183b<InterfaceC9835b> interfaceC7183b, InterfaceC7183b<InterfaceC9036b> interfaceC7183b2) {
        this.f13833d = str;
        this.f13830a = c12867g;
        this.f13831b = interfaceC7183b;
        this.f13832c = interfaceC7183b2;
        if (interfaceC7183b2 == null || interfaceC7183b2.get() == null) {
            return;
        }
        interfaceC7183b2.get().mo23458b(new a());
    }

    /* renamed from: d */
    private String m17855d() {
        return this.f13833d;
    }

    /* renamed from: f */
    public static C6382f m17856f(C12867g c12867g, String str) {
        C5276s.m13316b(c12867g != null, "Null is not a valid value for the FirebaseApp.");
        C5276s.m13316b(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return m17857g(c12867g, C7567i.m22972d(c12867g, str));
        } catch (UnsupportedEncodingException e10) {
            Log.e("FirebaseStorage", "Unable to parse url:" + str, e10);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    /* renamed from: g */
    private static C6382f m17857g(C12867g c12867g, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        C5276s.m13325k(c12867g, "Provided FirebaseApp must not be null.");
        C6384g c6384g = (C6384g) c12867g.m42629k(C6384g.class);
        C5276s.m13325k(c6384g, "Firebase Storage component is not present.");
        return c6384g.m17877a(host);
    }

    /* renamed from: m */
    private C6401p m17858m(Uri uri) {
        C5276s.m13325k(uri, "uri must not be null");
        String m17855d = m17855d();
        C5276s.m13316b(TextUtils.isEmpty(m17855d) || uri.getAuthority().equalsIgnoreCase(m17855d), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new C6401p(uri, this);
    }

    /* renamed from: a */
    public C12867g m17859a() {
        return this.f13830a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC9036b m17860b() {
        InterfaceC7183b<InterfaceC9036b> interfaceC7183b = this.f13832c;
        if (interfaceC7183b != null) {
            return interfaceC7183b.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceC9835b m17861c() {
        InterfaceC7183b<InterfaceC9835b> interfaceC7183b = this.f13831b;
        if (interfaceC7183b != null) {
            return interfaceC7183b.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C7960a m17862e() {
        return this.f13838i;
    }

    /* renamed from: h */
    public long m17863h() {
        return this.f13835f;
    }

    /* renamed from: i */
    public long m17864i() {
        return this.f13836g;
    }

    /* renamed from: j */
    public long m17865j() {
        return this.f13837h;
    }

    /* renamed from: k */
    public long m17866k() {
        return this.f13834e;
    }

    /* renamed from: l */
    public C6401p m17867l() {
        if (TextUtils.isEmpty(m17855d())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return m17858m(new Uri.Builder().scheme("gs").authority(m17855d()).path("/").build());
    }

    /* renamed from: n */
    public C6401p m17868n(String str) {
        C5276s.m13316b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return m17867l().m17996h(str);
    }

    /* renamed from: o */
    public void m17869o(long j10) {
        this.f13836g = j10;
    }

    /* renamed from: p */
    public void m17870p(long j10) {
        this.f13837h = j10;
    }

    /* renamed from: q */
    public void m17871q(long j10) {
        this.f13834e = j10;
    }

    /* renamed from: r */
    public void m17872r(String str, int i10) {
        this.f13838i = new C7960a(str, i10);
    }
}
