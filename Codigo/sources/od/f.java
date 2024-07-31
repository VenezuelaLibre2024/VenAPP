package od;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import od.j;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.e0;

/* loaded from: classes.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final ee.b<q> f22512a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22513b;

    /* renamed from: c, reason: collision with root package name */
    private final ee.b<ye.i> f22514c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<g> f22515d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f22516e;

    private f(final Context context, final String str, Set<g> set, ee.b<ye.i> bVar, Executor executor) {
        this((ee.b<q>) new ee.b() { // from class: od.e
            @Override // ee.b
            public final Object get() {
                q j10;
                j10 = f.j(context, str);
                return j10;
            }
        }, set, executor, bVar, context);
    }

    f(ee.b<q> bVar, Set<g> set, Executor executor, ee.b<ye.i> bVar2, Context context) {
        this.f22512a = bVar;
        this.f22515d = set;
        this.f22516e = executor;
        this.f22514c = bVar2;
        this.f22513b = context;
    }

    public static pc.c<f> g() {
        final e0 a10 = e0.a(dc.a.class, Executor.class);
        return pc.c.d(f.class, i.class, j.class).b(pc.q.j(Context.class)).b(pc.q.j(zb.g.class)).b(pc.q.n(g.class)).b(pc.q.l(ye.i.class)).b(pc.q.k(a10)).f(new pc.g() { // from class: od.d
            @Override // pc.g
            public final Object a(pc.d dVar) {
                f h10;
                h10 = f.h(e0.this, dVar);
                return h10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(e0 e0Var, pc.d dVar) {
        return new f((Context) dVar.get(Context.class), ((zb.g) dVar.get(zb.g.class)).s(), (Set<g>) dVar.c(g.class), (ee.b<ye.i>) dVar.f(ye.i.class), (Executor) dVar.e(e0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            q qVar = this.f22512a.get();
            List<r> c10 = qVar.c();
            qVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                r rVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", rVar.c());
                jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
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
    public static /* synthetic */ q j(Context context, String str) {
        return new q(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            this.f22512a.get().k(System.currentTimeMillis(), this.f22514c.get().a());
        }
        return null;
    }

    @Override // od.i
    public Task<String> a() {
        return androidx.core.os.m.a(this.f22513b) ^ true ? Tasks.forResult("") : Tasks.call(this.f22516e, new Callable() { // from class: od.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i10;
                i10 = f.this.i();
                return i10;
            }
        });
    }

    @Override // od.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = this.f22512a.get();
        if (!qVar.i(currentTimeMillis)) {
            return j.a.NONE;
        }
        qVar.g();
        return j.a.GLOBAL;
    }

    public Task<Void> l() {
        if (this.f22515d.size() > 0 && !(!androidx.core.os.m.a(this.f22513b))) {
            return Tasks.call(this.f22516e, new Callable() { // from class: od.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void k10;
                    k10 = f.this.k();
                    return k10;
                }
            });
        }
        return Tasks.forResult(null);
    }
}
