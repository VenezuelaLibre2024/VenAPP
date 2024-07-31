package gd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cc.InterfaceC1940a;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ee.InterfaceC7183b;
import gd.InterfaceC7552h;
import io.flutter.plugins.firebase.analytics.Constants;
import p081ea.C7142e;
import p105fd.AbstractC7329b;
import p105fd.C7328a;
import p105fd.C7330c;
import p105fd.InterfaceC7331d;
import p485zb.C12867g;

/* renamed from: gd.g */
/* loaded from: classes.dex */
public class C7551g extends AbstractC7329b {

    /* renamed from: a */
    private final AbstractC5105e<C5101a.d.c> f17848a;

    /* renamed from: b */
    private final InterfaceC7183b<InterfaceC1940a> f17849b;

    /* renamed from: c */
    private final C12867g f17850c;

    /* renamed from: gd.g$a */
    /* loaded from: classes.dex */
    static class a extends InterfaceC7552h.a {
        a() {
        }

        @Override // gd.InterfaceC7552h
        /* renamed from: N1 */
        public void mo22925N1(Status status, C7554j c7554j) {
            throw new UnsupportedOperationException();
        }

        @Override // gd.InterfaceC7552h
        /* renamed from: R0 */
        public void mo22926R0(Status status, C7545a c7545a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gd.g$b */
    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a */
        private final TaskCompletionSource<InterfaceC7331d> f17851a;

        b(TaskCompletionSource<InterfaceC7331d> taskCompletionSource) {
            this.f17851a = taskCompletionSource;
        }

        @Override // gd.C7551g.a, gd.InterfaceC7552h
        /* renamed from: N1 */
        public void mo22925N1(Status status, C7554j c7554j) {
            C5191x.m13203b(status, c7554j, this.f17851a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gd.g$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5188w<C7549e, InterfaceC7331d> {

        /* renamed from: d */
        private final Bundle f17852d;

        c(Bundle bundle) {
            super(null, false, 13202);
            this.f17852d = bundle;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.AbstractC5188w
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo13144b(C7549e c7549e, TaskCompletionSource<InterfaceC7331d> taskCompletionSource) {
            c7549e.m22918d(new b(taskCompletionSource), this.f17852d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gd.g$d */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: a */
        private final TaskCompletionSource<C7330c> f17853a;

        /* renamed from: b */
        private final InterfaceC7183b<InterfaceC1940a> f17854b;

        public d(InterfaceC7183b<InterfaceC1940a> interfaceC7183b, TaskCompletionSource<C7330c> taskCompletionSource) {
            this.f17854b = interfaceC7183b;
            this.f17853a = taskCompletionSource;
        }

        @Override // gd.C7551g.a, gd.InterfaceC7552h
        /* renamed from: R0 */
        public void mo22926R0(Status status, C7545a c7545a) {
            Bundle bundle;
            InterfaceC1940a interfaceC1940a;
            C5191x.m13203b(status, c7545a == null ? null : new C7330c(c7545a), this.f17853a);
            if (c7545a == null || (bundle = c7545a.m22907x1().getBundle("scionData")) == null || bundle.keySet() == null || (interfaceC1940a = this.f17854b.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                interfaceC1940a.mo10146a("fdl", str, bundle.getBundle(str));
            }
        }
    }

    /* renamed from: gd.g$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5188w<C7549e, C7330c> {

        /* renamed from: d */
        private final String f17855d;

        /* renamed from: e */
        private final InterfaceC7183b<InterfaceC1940a> f17856e;

        e(InterfaceC7183b<InterfaceC1940a> interfaceC7183b, String str) {
            super(null, false, 13201);
            this.f17855d = str;
            this.f17856e = interfaceC7183b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.AbstractC5188w
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo13144b(C7549e c7549e, TaskCompletionSource<C7330c> taskCompletionSource) {
            c7549e.m22919e(new d(this.f17856e, taskCompletionSource), this.f17855d);
        }
    }

    public C7551g(AbstractC5105e<C5101a.d.c> abstractC5105e, C12867g c12867g, InterfaceC7183b<InterfaceC1940a> interfaceC7183b) {
        this.f17848a = abstractC5105e;
        this.f17850c = (C12867g) C5276s.m13324j(c12867g);
        this.f17849b = interfaceC7183b;
        if (interfaceC7183b.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public C7551g(C12867g c12867g, InterfaceC7183b<InterfaceC1940a> interfaceC7183b) {
        this(new C7548d(c12867g.m42630m()), c12867g, interfaceC7183b);
    }

    /* renamed from: f */
    public static Uri m22920f(Bundle bundle) {
        m22921j(bundle);
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (uri != null) {
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse((String) C5276s.m13324j(bundle.getString("domainUriPrefix")));
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

    /* renamed from: j */
    public static void m22921j(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // p105fd.AbstractC7329b
    /* renamed from: a */
    public C7328a.c mo22023a() {
        return new C7328a.c(this);
    }

    @Override // p105fd.AbstractC7329b
    /* renamed from: b */
    public Task<C7330c> mo22024b(Intent intent) {
        C7330c m22924i;
        Task doWrite = this.f17848a.doWrite(new e(this.f17849b, intent != null ? intent.getDataString() : null));
        return (intent == null || (m22924i = m22924i(intent)) == null) ? doWrite : Tasks.forResult(m22924i);
    }

    @Override // p105fd.AbstractC7329b
    /* renamed from: c */
    public Task<C7330c> mo22025c(Uri uri) {
        return this.f17848a.doWrite(new e(this.f17849b, uri.toString()));
    }

    /* renamed from: g */
    public Task<InterfaceC7331d> m22922g(Bundle bundle) {
        m22921j(bundle);
        return this.f17848a.doWrite(new c(bundle));
    }

    /* renamed from: h */
    public C12867g m22923h() {
        return this.f17850c;
    }

    /* renamed from: i */
    public C7330c m22924i(Intent intent) {
        C7545a c7545a = (C7545a) C7142e.m21236b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", C7545a.CREATOR);
        if (c7545a != null) {
            return new C7330c(c7545a);
        }
        return null;
    }
}
