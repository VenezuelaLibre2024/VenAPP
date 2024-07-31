package cc;

import android.content.Context;
import android.os.Bundle;
import cc.a;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.analytics.connector.internal.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import zb.g;

/* loaded from: classes.dex */
public class b implements cc.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile cc.a f7035c;

    /* renamed from: a, reason: collision with root package name */
    private final va.a f7036a;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, com.google.firebase.analytics.connector.internal.a> f7037b;

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0120a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f7038a;

        a(String str) {
            this.f7038a = str;
        }

        @Override // cc.a.InterfaceC0120a
        public void a(Set<String> set) {
            if (!b.this.k(this.f7038a) || !this.f7038a.equals("fiam") || set == null || set.isEmpty()) {
                return;
            }
            b.this.f7037b.get(this.f7038a).a(set);
        }
    }

    private b(va.a aVar) {
        s.j(aVar);
        this.f7036a = aVar;
        this.f7037b = new ConcurrentHashMap();
    }

    public static cc.a h(g gVar, Context context, nd.d dVar) {
        s.j(gVar);
        s.j(context);
        s.j(dVar);
        s.j(context.getApplicationContext());
        if (f7035c == null) {
            synchronized (b.class) {
                if (f7035c == null) {
                    Bundle bundle = new Bundle(1);
                    if (gVar.y()) {
                        dVar.d(zb.b.class, new Executor() { // from class: cc.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new nd.b() { // from class: cc.d
                            @Override // nd.b
                            public final void a(nd.a aVar) {
                                b.i(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", gVar.x());
                    }
                    f7035c = new b(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return f7035c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(nd.a aVar) {
        boolean z10 = ((zb.b) aVar.a()).f32512a;
        synchronized (b.class) {
            ((b) s.j(f7035c)).f7036a.v(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(String str) {
        return (str.isEmpty() || !this.f7037b.containsKey(str) || this.f7037b.get(str) == null) ? false : true;
    }

    @Override // cc.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.m(str) && com.google.firebase.analytics.connector.internal.b.e(str2, bundle) && com.google.firebase.analytics.connector.internal.b.i(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle);
            this.f7036a.n(str, str2, bundle);
        }
    }

    @Override // cc.a
    public a.InterfaceC0120a b(String str, a.b bVar) {
        s.j(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.m(str) || k(str)) {
            return null;
        }
        va.a aVar = this.f7036a;
        com.google.firebase.analytics.connector.internal.a eVar = "fiam".equals(str) ? new e(aVar, bVar) : "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.g(aVar, bVar) : null;
        if (eVar == null) {
            return null;
        }
        this.f7037b.put(str, eVar);
        return new a(str);
    }

    @Override // cc.a
    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.m(str) && com.google.firebase.analytics.connector.internal.b.f(str, str2)) {
            this.f7036a.u(str, str2, obj);
        }
    }

    @Override // cc.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.e(str2, bundle)) {
            this.f7036a.b(str, str2, bundle);
        }
    }

    @Override // cc.a
    public Map<String, Object> d(boolean z10) {
        return this.f7036a.m(null, null, z10);
    }

    @Override // cc.a
    public int e(String str) {
        return this.f7036a.l(str);
    }

    @Override // cc.a
    public List<a.c> f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f7036a.g(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.b(it.next()));
        }
        return arrayList;
    }

    @Override // cc.a
    public void g(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.h(cVar)) {
            this.f7036a.r(com.google.firebase.analytics.connector.internal.b.a(cVar));
        }
    }
}
