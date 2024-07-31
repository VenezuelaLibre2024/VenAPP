package gd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import fd.a;
import gd.h;
import io.flutter.plugins.firebase.analytics.Constants;

/* loaded from: classes.dex */
public class g extends fd.b {

    /* renamed from: a */
    private final com.google.android.gms.common.api.e<a.d.c> f16211a;

    /* renamed from: b */
    private final ee.b<cc.a> f16212b;

    /* renamed from: c */
    private final zb.g f16213c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends h.a {
        a() {
        }

        @Override // gd.h
        public void N1(Status status, j jVar) {
            throw new UnsupportedOperationException();
        }

        @Override // gd.h
        public void R0(Status status, gd.a aVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a */
        private final TaskCompletionSource<fd.d> f16214a;

        b(TaskCompletionSource<fd.d> taskCompletionSource) {
            this.f16214a = taskCompletionSource;
        }

        @Override // gd.g.a, gd.h
        public void N1(Status status, j jVar) {
            x.b(status, jVar, this.f16214a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends w<gd.e, fd.d> {

        /* renamed from: d */
        private final Bundle f16215d;

        c(Bundle bundle) {
            super(null, false, 13202);
            this.f16215d = bundle;
        }

        @Override // com.google.android.gms.common.api.internal.w
        /* renamed from: f */
        public void b(gd.e eVar, TaskCompletionSource<fd.d> taskCompletionSource) {
            eVar.d(new b(taskCompletionSource), this.f16215d);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: a */
        private final TaskCompletionSource<fd.c> f16216a;

        /* renamed from: b */
        private final ee.b<cc.a> f16217b;

        public d(ee.b<cc.a> bVar, TaskCompletionSource<fd.c> taskCompletionSource) {
            this.f16217b = bVar;
            this.f16216a = taskCompletionSource;
        }

        @Override // gd.g.a, gd.h
        public void R0(Status status, gd.a aVar) {
            Bundle bundle;
            cc.a aVar2;
            x.b(status, aVar == null ? null : new fd.c(aVar), this.f16216a);
            if (aVar == null || (bundle = aVar.x1().getBundle("scionData")) == null || bundle.keySet() == null || (aVar2 = this.f16217b.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                aVar2.a("fdl", str, bundle.getBundle(str));
            }
        }
    }

    /* loaded from: classes.dex */
    static final class e extends w<gd.e, fd.c> {

        /* renamed from: d */
        private final String f16218d;

        /* renamed from: e */
        private final ee.b<cc.a> f16219e;

        e(ee.b<cc.a> bVar, String str) {
            super(null, false, 13201);
            this.f16218d = str;
            this.f16219e = bVar;
        }

        @Override // com.google.android.gms.common.api.internal.w
        /* renamed from: f */
        public void b(gd.e eVar, TaskCompletionSource<fd.c> taskCompletionSource) {
            eVar.e(new d(this.f16219e, taskCompletionSource), this.f16218d);
        }
    }

    public g(com.google.android.gms.common.api.e<a.d.c> eVar, zb.g gVar, ee.b<cc.a> bVar) {
        this.f16211a = eVar;
        this.f16213c = (zb.g) s.j(gVar);
        this.f16212b = bVar;
        if (bVar.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public g(zb.g gVar, ee.b<cc.a> bVar) {
        this(new gd.d(gVar.m()), gVar, bVar);
    }

    public static Uri f(Bundle bundle) {
        j(bundle);
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (uri != null) {
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse((String) s.j(bundle.getString("domainUriPrefix")));
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        Bundle bundle2 = bundle.getBundle(Constants.PARAMETERS);
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
        return builder.build();
    }

    public static void j(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // fd.b
    public a.c a() {
        return new a.c(this);
    }

    @Override // fd.b
    public Task<fd.c> b(Intent intent) {
        fd.c i10;
        Task doWrite = this.f16211a.doWrite(new e(this.f16212b, intent != null ? intent.getDataString() : null));
        return (intent == null || (i10 = i(intent)) == null) ? doWrite : Tasks.forResult(i10);
    }

    @Override // fd.b
    public Task<fd.c> c(Uri uri) {
        return this.f16211a.doWrite(new e(this.f16212b, uri.toString()));
    }

    public Task<fd.d> g(Bundle bundle) {
        j(bundle);
        return this.f16211a.doWrite(new c(bundle));
    }

    public zb.g h() {
        return this.f16213c;
    }

    public fd.c i(Intent intent) {
        gd.a aVar = (gd.a) ea.e.b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", gd.a.CREATOR);
        if (aVar != null) {
            return new fd.c(aVar);
        }
        return null;
    }
}
