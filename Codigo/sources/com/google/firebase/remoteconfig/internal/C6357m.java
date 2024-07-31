package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import cc.InterfaceC1940a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.installations.AbstractC6200g;
import com.google.firebase.remoteconfig.internal.C6357m;
import com.google.firebase.remoteconfig.internal.C6360p;
import ee.InterfaceC7183b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import la.InterfaceC9461f;
import p106fe.InterfaceC7337f;
import p488ze.C13011h;
import p488ze.C13012i;
import p488ze.C13013j;
import p488ze.C13015l;

/* renamed from: com.google.firebase.remoteconfig.internal.m */
/* loaded from: classes2.dex */
public class C6357m {

    /* renamed from: j */
    public static final long f13709j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    static final int[] f13710k = {2, 4, 8, 16, 32, 64, RecognitionOptions.ITF, RecognitionOptions.QR_CODE};

    /* renamed from: a */
    private final InterfaceC7337f f13711a;

    /* renamed from: b */
    private final InterfaceC7183b<InterfaceC1940a> f13712b;

    /* renamed from: c */
    private final Executor f13713c;

    /* renamed from: d */
    private final InterfaceC9461f f13714d;

    /* renamed from: e */
    private final Random f13715e;

    /* renamed from: f */
    private final C6350f f13716f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f13717g;

    /* renamed from: h */
    private final C6360p f13718h;

    /* renamed from: i */
    private final Map<String, String> f13719i;

    /* renamed from: com.google.firebase.remoteconfig.internal.m$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final Date f13720a;

        /* renamed from: b */
        private final int f13721b;

        /* renamed from: c */
        private final C6351g f13722c;

        /* renamed from: d */
        private final String f13723d;

        private a(Date date, int i10, C6351g c6351g, String str) {
            this.f13720a = date;
            this.f13721b = i10;
            this.f13722c = c6351g;
            this.f13723d = str;
        }

        /* renamed from: a */
        public static a m17673a(Date date, C6351g c6351g) {
            return new a(date, 1, c6351g, null);
        }

        /* renamed from: b */
        public static a m17674b(C6351g c6351g, String str) {
            return new a(c6351g.m17633h(), 0, c6351g, str);
        }

        /* renamed from: c */
        public static a m17675c(Date date) {
            return new a(date, 2, null, null);
        }

        /* renamed from: d */
        public C6351g m17676d() {
            return this.f13722c;
        }

        /* renamed from: e */
        String m17677e() {
            return this.f13723d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public int m17678f() {
            return this.f13721b;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.m$b */
    /* loaded from: classes2.dex */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        /* renamed from: b */
        String m17679b() {
            return this.value;
        }
    }

    public C6357m(InterfaceC7337f interfaceC7337f, InterfaceC7183b<InterfaceC1940a> interfaceC7183b, Executor executor, InterfaceC9461f interfaceC9461f, Random random, C6350f c6350f, ConfigFetchHttpClient configFetchHttpClient, C6360p c6360p, Map<String, String> map) {
        this.f13711a = interfaceC7337f;
        this.f13712b = interfaceC7183b;
        this.f13713c = executor;
        this.f13714d = interfaceC9461f;
        this.f13715e = random;
        this.f13716f = c6350f;
        this.f13717g = configFetchHttpClient;
        this.f13718h = c6360p;
        this.f13719i = map;
    }

    /* renamed from: A */
    private C6360p.a m17644A(int i10, Date date) {
        if (m17662t(i10)) {
            m17645B(date);
        }
        return this.f13718h.m17691a();
    }

    /* renamed from: B */
    private void m17645B(Date date) {
        int m17709b = this.f13718h.m17691a().m17709b() + 1;
        this.f13718h.m17701k(m17709b, new Date(date.getTime() + m17660q(m17709b)));
    }

    /* renamed from: C */
    private void m17646C(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f13718h.m17706p(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof C13013j) {
            this.f13718h.m17707q();
        } else {
            this.f13718h.m17705o();
        }
    }

    /* renamed from: f */
    private boolean m17652f(long j10, Date date) {
        Date m17695e = this.f13718h.m17695e();
        if (m17695e.equals(C6360p.f13734e)) {
            return false;
        }
        return date.before(new Date(m17695e.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    /* renamed from: g */
    private C13015l m17653g(C13015l c13015l) {
        String str;
        int m42984a = c13015l.m42984a();
        if (m42984a == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (m42984a == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (m42984a == 429) {
                throw new C13011h("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (m42984a != 500) {
                switch (m42984a) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new C13015l(c13015l.m42984a(), "Fetch failed: " + str, c13015l);
    }

    /* renamed from: h */
    private String m17654h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    /* renamed from: k */
    private a m17655k(String str, String str2, Date date, Map<String, String> map) {
        try {
            a fetch = this.f13717g.fetch(this.f13717g.m17599d(), str, str2, m17661s(), this.f13718h.m17694d(), map, m17659p(), date);
            if (fetch.m17676d() != null) {
                this.f13718h.m17703m(fetch.m17676d().m17636k());
            }
            if (fetch.m17677e() != null) {
                this.f13718h.m17702l(fetch.m17677e());
            }
            this.f13718h.m17699i();
            return fetch;
        } catch (C13015l e10) {
            C6360p.a m17644A = m17644A(e10.m42984a(), date);
            if (m17668z(m17644A, e10.m42984a())) {
                throw new C13013j(m17644A.m17708a().getTime());
            }
            throw m17653g(e10);
        }
    }

    /* renamed from: l */
    private Task<a> m17656l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a m17655k = m17655k(str, str2, date, map);
            return m17655k.m17678f() != 0 ? Tasks.forResult(m17655k) : this.f13716f.m17622k(m17655k.m17676d()).onSuccessTask(this.f13713c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    forResult = Tasks.forResult(C6357m.a.this);
                    return forResult;
                }
            });
        } catch (C13012i e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Task<a> m17663u(Task<C6351g> task, long j10, final Map<String, String> map) {
        Task continueWithTask;
        final Date date = new Date(this.f13714d.mo28130a());
        if (task.isSuccessful() && m17652f(j10, date)) {
            return Tasks.forResult(a.m17675c(date));
        }
        Date m17658o = m17658o(date);
        if (m17658o != null) {
            continueWithTask = Tasks.forException(new C13013j(m17654h(m17658o.getTime() - date.getTime()), m17658o.getTime()));
        } else {
            final Task<String> id2 = this.f13711a.getId();
            final Task<AbstractC6200g> mo16854a = this.f13711a.mo16854a(false);
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, mo16854a}).continueWithTask(this.f13713c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task m17665w;
                    m17665w = C6357m.this.m17665w(id2, mo16854a, date, map, task2);
                    return m17665w;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f13713c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m17666x;
                m17666x = C6357m.this.m17666x(date, task2);
                return m17666x;
            }
        });
    }

    /* renamed from: o */
    private Date m17658o(Date date) {
        Date m17708a = this.f13718h.m17691a().m17708a();
        if (date.before(m17708a)) {
            return m17708a;
        }
        return null;
    }

    /* renamed from: p */
    private Long m17659p() {
        InterfaceC1940a interfaceC1940a = this.f13712b.get();
        if (interfaceC1940a == null) {
            return null;
        }
        return (Long) interfaceC1940a.mo10149d(true).get("_fot");
    }

    /* renamed from: q */
    private long m17660q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f13710k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f13715e.nextInt((int) r0);
    }

    /* renamed from: s */
    private Map<String, String> m17661s() {
        HashMap hashMap = new HashMap();
        InterfaceC1940a interfaceC1940a = this.f13712b.get();
        if (interfaceC1940a == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : interfaceC1940a.mo10149d(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: t */
    private boolean m17662t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Task m17665w(Task task, Task task2, Date date, Map map, Task task3) {
        return !task.isSuccessful() ? Tasks.forException(new C13011h("Firebase Installations failed to get installation ID for fetch.", task.getException())) : !task2.isSuccessful() ? Tasks.forException(new C13011h("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : m17656l((String) task.getResult(), ((AbstractC6200g) task2.getResult()).mo16814b(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Task m17666x(Date date, Task task) {
        m17646C(task, date);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ Task m17667y(Map map, Task task) {
        return m17663u(task, 0L, map);
    }

    /* renamed from: z */
    private boolean m17668z(C6360p.a aVar, int i10) {
        return aVar.m17709b() > 1 || i10 == 429;
    }

    /* renamed from: i */
    public Task<a> m17669i() {
        return m17670j(this.f13718h.m17697g());
    }

    /* renamed from: j */
    public Task<a> m17670j(final long j10) {
        final HashMap hashMap = new HashMap(this.f13719i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.m17679b() + "/1");
        return this.f13716f.m17619e().continueWithTask(this.f13713c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m17663u;
                m17663u = C6357m.this.m17663u(j10, hashMap, task);
                return m17663u;
            }
        });
    }

    /* renamed from: n */
    public Task<a> m17671n(b bVar, int i10) {
        final HashMap hashMap = new HashMap(this.f13719i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.m17679b() + "/" + i10);
        return this.f13716f.m17619e().continueWithTask(this.f13713c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m17667y;
                m17667y = C6357m.this.m17667y(hashMap, task);
                return m17667y;
            }
        });
    }

    /* renamed from: r */
    public long m17672r() {
        return this.f13718h.m17696f();
    }
}
