package cd;

import ad.C0103f;
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
import p486zc.C12880b;
import sc.C10889g;
import vc.C11826b0;
import vc.C11839i;
import vc.C11858r0;
import vc.C11869x;
import vc.EnumC11871y;
import vc.InterfaceC11867w;

/* renamed from: cd.f */
/* loaded from: classes.dex */
public class C1949f implements InterfaceC1952i {

    /* renamed from: a */
    private final Context f8011a;

    /* renamed from: b */
    private final C1953j f8012b;

    /* renamed from: c */
    private final C1950g f8013c;

    /* renamed from: d */
    private final InterfaceC11867w f8014d;

    /* renamed from: e */
    private final C1944a f8015e;

    /* renamed from: f */
    private final InterfaceC1954k f8016f;

    /* renamed from: g */
    private final C11869x f8017g;

    /* renamed from: h */
    private final AtomicReference<C1947d> f8018h;

    /* renamed from: i */
    private final AtomicReference<TaskCompletionSource<C1947d>> f8019i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cd.f$a */
    /* loaded from: classes.dex */
    public class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Void r52) {
            JSONObject mo10169a = C1949f.this.f8016f.mo10169a(C1949f.this.f8012b, true);
            if (mo10169a != null) {
                C1947d m10194b = C1949f.this.f8013c.m10194b(mo10169a);
                C1949f.this.f8015e.m10162c(m10194b.f8000c, mo10169a);
                C1949f.this.m10185q(mo10169a, "Loaded settings: ");
                C1949f c1949f = C1949f.this;
                c1949f.m10186r(c1949f.f8012b.f8027f);
                C1949f.this.f8018h.set(m10194b);
                ((TaskCompletionSource) C1949f.this.f8019i.get()).trySetResult(m10194b);
            }
            return Tasks.forResult(null);
        }
    }

    C1949f(Context context, C1953j c1953j, InterfaceC11867w interfaceC11867w, C1950g c1950g, C1944a c1944a, InterfaceC1954k interfaceC1954k, C11869x c11869x) {
        AtomicReference<C1947d> atomicReference = new AtomicReference<>();
        this.f8018h = atomicReference;
        this.f8019i = new AtomicReference<>(new TaskCompletionSource());
        this.f8011a = context;
        this.f8012b = c1953j;
        this.f8014d = interfaceC11867w;
        this.f8013c = c1950g;
        this.f8015e = c1944a;
        this.f8016f = interfaceC1954k;
        this.f8017g = c11869x;
        atomicReference.set(C1945b.m10163b(interfaceC11867w));
    }

    /* renamed from: l */
    public static C1949f m10182l(Context context, String str, C11826b0 c11826b0, C12880b c12880b, String str2, String str3, C0103f c0103f, C11869x c11869x) {
        String m37685g = c11826b0.m37685g();
        C11858r0 c11858r0 = new C11858r0();
        return new C1949f(context, new C1953j(str, c11826b0.m37686h(), c11826b0.m37687i(), c11826b0.m37688j(), c11826b0, C11839i.m37727h(C11839i.m37732m(context), str, str3, str2), str3, str2, EnumC11871y.m37955b(m37685g).m37956h()), c11858r0, new C1950g(c11858r0), new C1944a(c0103f), new C1946c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c12880b), c11869x);
    }

    /* renamed from: m */
    private C1947d m10183m(EnumC1948e enumC1948e) {
        C1947d c1947d = null;
        try {
            if (!EnumC1948e.SKIP_CACHE_LOOKUP.equals(enumC1948e)) {
                JSONObject m10161b = this.f8015e.m10161b();
                if (m10161b != null) {
                    C1947d m10194b = this.f8013c.m10194b(m10161b);
                    if (m10194b != null) {
                        m10185q(m10161b, "Loaded cached settings: ");
                        long mo37894a = this.f8014d.mo37894a();
                        if (!EnumC1948e.IGNORE_CACHE_EXPIRATION.equals(enumC1948e) && m10194b.m10173a(mo37894a)) {
                            C10889g.m33216f().m33223i("Cached settings have expired.");
                        }
                        try {
                            C10889g.m33216f().m33223i("Returning cached settings.");
                            c1947d = m10194b;
                        } catch (Exception e10) {
                            e = e10;
                            c1947d = m10194b;
                            C10889g.m33216f().m33220e("Failed to get cached settings", e);
                            return c1947d;
                        }
                    } else {
                        C10889g.m33216f().m33220e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C10889g.m33216f().m33217b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return c1947d;
    }

    /* renamed from: n */
    private String m10184n() {
        return C11839i.m37736q(this.f8011a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m10185q(JSONObject jSONObject, String str) {
        C10889g.m33216f().m33217b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m10186r(String str) {
        SharedPreferences.Editor edit = C11839i.m37736q(this.f8011a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // cd.InterfaceC1952i
    /* renamed from: a */
    public Task<C1947d> mo10187a() {
        return this.f8019i.get().getTask();
    }

    @Override // cd.InterfaceC1952i
    /* renamed from: b */
    public C1947d mo10188b() {
        return this.f8018h.get();
    }

    /* renamed from: k */
    boolean m10189k() {
        return !m10184n().equals(this.f8012b.f8027f);
    }

    /* renamed from: o */
    public Task<Void> m10190o(EnumC1948e enumC1948e, Executor executor) {
        C1947d m10183m;
        if (!m10189k() && (m10183m = m10183m(enumC1948e)) != null) {
            this.f8018h.set(m10183m);
            this.f8019i.get().trySetResult(m10183m);
            return Tasks.forResult(null);
        }
        C1947d m10183m2 = m10183m(EnumC1948e.IGNORE_CACHE_EXPIRATION);
        if (m10183m2 != null) {
            this.f8018h.set(m10183m2);
            this.f8019i.get().trySetResult(m10183m2);
        }
        return this.f8017g.m37939k(executor).onSuccessTask(executor, new a());
    }

    /* renamed from: p */
    public Task<Void> m10191p(Executor executor) {
        return m10190o(EnumC1948e.USE_CACHE, executor);
    }
}
