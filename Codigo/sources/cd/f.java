package cd;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import vc.b0;
import vc.r0;
import vc.w;
import vc.x;
import vc.y;

/* loaded from: classes.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7059a;

    /* renamed from: b, reason: collision with root package name */
    private final j f7060b;

    /* renamed from: c, reason: collision with root package name */
    private final g f7061c;

    /* renamed from: d, reason: collision with root package name */
    private final w f7062d;

    /* renamed from: e, reason: collision with root package name */
    private final cd.a f7063e;

    /* renamed from: f, reason: collision with root package name */
    private final k f7064f;

    /* renamed from: g, reason: collision with root package name */
    private final x f7065g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f7066h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<d>> f7067i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Void r52) {
            JSONObject a10 = f.this.f7064f.a(f.this.f7060b, true);
            if (a10 != null) {
                d b10 = f.this.f7061c.b(a10);
                f.this.f7063e.c(b10.f7048c, a10);
                f.this.q(a10, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f7060b.f7075f);
                f.this.f7066h.set(b10);
                ((TaskCompletionSource) f.this.f7067i.get()).trySetResult(b10);
            }
            return Tasks.forResult(null);
        }
    }

    f(Context context, j jVar, w wVar, g gVar, cd.a aVar, k kVar, x xVar) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f7066h = atomicReference;
        this.f7067i = new AtomicReference<>(new TaskCompletionSource());
        this.f7059a = context;
        this.f7060b = jVar;
        this.f7062d = wVar;
        this.f7061c = gVar;
        this.f7063e = aVar;
        this.f7064f = kVar;
        this.f7065g = xVar;
        atomicReference.set(b.b(wVar));
    }

    public static f l(Context context, String str, b0 b0Var, zc.b bVar, String str2, String str3, ad.f fVar, x xVar) {
        String g10 = b0Var.g();
        r0 r0Var = new r0();
        return new f(context, new j(str, b0Var.h(), b0Var.i(), b0Var.j(), b0Var, vc.i.h(vc.i.m(context), str, str3, str2), str3, str2, y.b(g10).h()), r0Var, new g(r0Var), new cd.a(fVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), xVar);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b10 = this.f7063e.b();
                if (b10 != null) {
                    d b11 = this.f7061c.b(b10);
                    if (b11 != null) {
                        q(b10, "Loaded cached settings: ");
                        long a10 = this.f7062d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b11.a(a10)) {
                            sc.g.f().i("Cached settings have expired.");
                        }
                        try {
                            sc.g.f().i("Returning cached settings.");
                            dVar = b11;
                        } catch (Exception e10) {
                            e = e10;
                            dVar = b11;
                            sc.g.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        sc.g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    sc.g.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    private String n() {
        return vc.i.q(this.f7059a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        sc.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = vc.i.q(this.f7059a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // cd.i
    public Task<d> a() {
        return this.f7067i.get().getTask();
    }

    @Override // cd.i
    public d b() {
        return this.f7066h.get();
    }

    boolean k() {
        return !n().equals(this.f7060b.f7075f);
    }

    public Task<Void> o(e eVar, Executor executor) {
        d m10;
        if (!k() && (m10 = m(eVar)) != null) {
            this.f7066h.set(m10);
            this.f7067i.get().trySetResult(m10);
            return Tasks.forResult(null);
        }
        d m11 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m11 != null) {
            this.f7066h.set(m11);
            this.f7067i.get().trySetResult(m11);
        }
        return this.f7065g.k(executor).onSuccessTask(executor, new a());
    }

    public Task<Void> p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}
