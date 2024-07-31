package p273od;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.C0954m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ee.InterfaceC7183b;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p063dc.InterfaceC6879a;
import p273od.InterfaceC9920j;
import p294pc.C10132c;
import p294pc.C10137e0;
import p294pc.C10150q;
import p294pc.InterfaceC10134d;
import p294pc.InterfaceC10140g;
import p485zb.C12867g;
import ye.InterfaceC12683i;

/* renamed from: od.f */
/* loaded from: classes.dex */
public class C9916f implements InterfaceC9919i, InterfaceC9920j {

    /* renamed from: a */
    private final InterfaceC7183b<C9927q> f24445a;

    /* renamed from: b */
    private final Context f24446b;

    /* renamed from: c */
    private final InterfaceC7183b<InterfaceC12683i> f24447c;

    /* renamed from: d */
    private final Set<InterfaceC9917g> f24448d;

    /* renamed from: e */
    private final Executor f24449e;

    private C9916f(final Context context, final String str, Set<InterfaceC9917g> set, InterfaceC7183b<InterfaceC12683i> interfaceC7183b, Executor executor) {
        this((InterfaceC7183b<C9927q>) new InterfaceC7183b() { // from class: od.e
            @Override // ee.InterfaceC7183b
            public final Object get() {
                C9927q m29634j;
                m29634j = C9916f.m29634j(context, str);
                return m29634j;
            }
        }, set, executor, interfaceC7183b, context);
    }

    C9916f(InterfaceC7183b<C9927q> interfaceC7183b, Set<InterfaceC9917g> set, Executor executor, InterfaceC7183b<InterfaceC12683i> interfaceC7183b2, Context context) {
        this.f24445a = interfaceC7183b;
        this.f24448d = set;
        this.f24449e = executor;
        this.f24447c = interfaceC7183b2;
        this.f24446b = context;
    }

    /* renamed from: g */
    public static C10132c<C9916f> m29631g() {
        final C10137e0 m30306a = C10137e0.m30306a(InterfaceC6879a.class, Executor.class);
        return C10132c.m30258d(C9916f.class, InterfaceC9919i.class, InterfaceC9920j.class).m30279b(C10150q.m30353j(Context.class)).m30279b(C10150q.m30353j(C12867g.class)).m30279b(C10150q.m30357n(InterfaceC9917g.class)).m30279b(C10150q.m30355l(InterfaceC12683i.class)).m30279b(C10150q.m30354k(m30306a)).m30283f(new InterfaceC10140g() { // from class: od.d
            @Override // p294pc.InterfaceC10140g
            /* renamed from: a */
            public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
                C9916f m29632h;
                m29632h = C9916f.m29632h(C10137e0.this, interfaceC10134d);
                return m29632h;
            }
        }).m30281d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C9916f m29632h(C10137e0 c10137e0, InterfaceC10134d interfaceC10134d) {
        return new C9916f((Context) interfaceC10134d.get(Context.class), ((C12867g) interfaceC10134d.get(C12867g.class)).m42633s(), (Set<InterfaceC9917g>) interfaceC10134d.m30296c(InterfaceC9917g.class), (InterfaceC7183b<InterfaceC12683i>) interfaceC10134d.mo30299f(InterfaceC12683i.class), (Executor) interfaceC10134d.mo30298e(c10137e0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m29633i() {
        String byteArrayOutputStream;
        synchronized (this) {
            C9927q c9927q = this.f24445a.get();
            List<AbstractC9928r> m29653c = c9927q.m29653c();
            c9927q.m29652b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < m29653c.size(); i10++) {
                AbstractC9928r abstractC9928r = m29653c.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC9928r.mo29626c());
                jSONObject.put("dates", new JSONArray((Collection) abstractC9928r.mo29625b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C9927q m29634j(Context context, String str) {
        return new C9927q(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m29635k() {
        synchronized (this) {
            this.f24445a.get().m29658k(System.currentTimeMillis(), this.f24447c.get().mo41719a());
        }
        return null;
    }

    @Override // p273od.InterfaceC9919i
    /* renamed from: a */
    public Task<String> mo29636a() {
        return C0954m.m4737a(this.f24446b) ^ true ? Tasks.forResult("") : Tasks.call(this.f24449e, new Callable() { // from class: od.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m29633i;
                m29633i = C9916f.this.m29633i();
                return m29633i;
            }
        });
    }

    @Override // p273od.InterfaceC9920j
    /* renamed from: b */
    public synchronized InterfaceC9920j.a mo29637b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C9927q c9927q = this.f24445a.get();
        if (!c9927q.m29656i(currentTimeMillis)) {
            return InterfaceC9920j.a.NONE;
        }
        c9927q.m29655g();
        return InterfaceC9920j.a.GLOBAL;
    }

    /* renamed from: l */
    public Task<Void> m29638l() {
        if (this.f24448d.size() > 0 && !(!C0954m.m4737a(this.f24446b))) {
            return Tasks.call(this.f24449e, new Callable() { // from class: od.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m29635k;
                    m29635k = C9916f.this.m29635k();
                    return m29635k;
                }
            });
        }
        return Tasks.forResult(null);
    }
}
