package cc;

import android.content.Context;
import android.os.Bundle;
import cc.InterfaceC1940a;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.analytics.connector.internal.C6033b;
import com.google.firebase.analytics.connector.internal.C6036e;
import com.google.firebase.analytics.connector.internal.C6038g;
import com.google.firebase.analytics.connector.internal.InterfaceC6032a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p254nd.C9705a;
import p254nd.InterfaceC9706b;
import p254nd.InterfaceC9708d;
import p485zb.C12862b;
import p485zb.C12867g;
import va.C11784a;

/* renamed from: cc.b */
/* loaded from: classes.dex */
public class C1941b implements InterfaceC1940a {

    /* renamed from: c */
    private static volatile InterfaceC1940a f7987c;

    /* renamed from: a */
    private final C11784a f7988a;

    /* renamed from: b */
    final Map<String, InterfaceC6032a> f7989b;

    /* renamed from: cc.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC1940a.a {

        /* renamed from: a */
        private final /* synthetic */ String f7990a;

        a(String str) {
            this.f7990a = str;
        }

        @Override // cc.InterfaceC1940a.a
        /* renamed from: a */
        public void mo10153a(Set<String> set) {
            if (!C1941b.this.m10158k(this.f7990a) || !this.f7990a.equals("fiam") || set == null || set.isEmpty()) {
                return;
            }
            C1941b.this.f7989b.get(this.f7990a).mo16314a(set);
        }
    }

    private C1941b(C11784a c11784a) {
        C5276s.m13324j(c11784a);
        this.f7988a = c11784a;
        this.f7989b = new ConcurrentHashMap();
    }

    /* renamed from: h */
    public static InterfaceC1940a m10155h(C12867g c12867g, Context context, InterfaceC9708d interfaceC9708d) {
        C5276s.m13324j(c12867g);
        C5276s.m13324j(context);
        C5276s.m13324j(interfaceC9708d);
        C5276s.m13324j(context.getApplicationContext());
        if (f7987c == null) {
            synchronized (C1941b.class) {
                if (f7987c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c12867g.m42635y()) {
                        interfaceC9708d.mo29100d(C12862b.class, new Executor() { // from class: cc.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC9706b() { // from class: cc.d
                            @Override // p254nd.InterfaceC9706b
                            /* renamed from: a */
                            public final void mo10159a(C9705a c9705a) {
                                C1941b.m10156i(c9705a);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", c12867g.m42634x());
                    }
                    f7987c = new C1941b(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return f7987c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m10156i(C9705a c9705a) {
        boolean z10 = ((C12862b) c9705a.m29095a()).f35063a;
        synchronized (C1941b.class) {
            ((C1941b) C5276s.m13324j(f7987c)).f7988a.m37272v(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m10158k(String str) {
        return (str.isEmpty() || !this.f7989b.containsKey(str) || this.f7989b.get(str) == null) ? false : true;
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: a */
    public void mo10146a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C6033b.m16327m(str) && C6033b.m16319e(str2, bundle) && C6033b.m16323i(str, str2, bundle)) {
            C6033b.m16318d(str, str2, bundle);
            this.f7988a.m37264n(str, str2, bundle);
        }
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: b */
    public InterfaceC1940a.a mo10147b(String str, InterfaceC1940a.b bVar) {
        C5276s.m13324j(bVar);
        if (!C6033b.m16327m(str) || m10158k(str)) {
            return null;
        }
        C11784a c11784a = this.f7988a;
        InterfaceC6032a c6036e = "fiam".equals(str) ? new C6036e(c11784a, bVar) : "clx".equals(str) ? new C6038g(c11784a, bVar) : null;
        if (c6036e == null) {
            return null;
        }
        this.f7989b.put(str, c6036e);
        return new a(str);
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: c */
    public void mo10148c(String str, String str2, Object obj) {
        if (C6033b.m16327m(str) && C6033b.m16320f(str, str2)) {
            this.f7988a.m37271u(str, str2, obj);
        }
    }

    @Override // cc.InterfaceC1940a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || C6033b.m16319e(str2, bundle)) {
            this.f7988a.m37253b(str, str2, bundle);
        }
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: d */
    public Map<String, Object> mo10149d(boolean z10) {
        return this.f7988a.m37263m(null, null, z10);
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: e */
    public int mo10150e(String str) {
        return this.f7988a.m37262l(str);
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: f */
    public List<InterfaceC1940a.c> mo10151f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f7988a.m37258g(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(C6033b.m16316b(it.next()));
        }
        return arrayList;
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: g */
    public void mo10152g(InterfaceC1940a.c cVar) {
        if (C6033b.m16322h(cVar)) {
            this.f7988a.m37268r(C6033b.m16315a(cVar));
        }
    }
}
