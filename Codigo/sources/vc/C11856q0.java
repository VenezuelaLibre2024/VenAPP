package vc;

import ad.C0102e;
import ad.C0103f;
import android.app.ApplicationExitInfo;
import android.content.Context;
import bd.C1723b;
import cd.InterfaceC1952i;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p064dd.InterfaceC6886d;
import p420wc.C12152e;
import p420wc.C12161n;
import p442xc.AbstractC12426f0;
import sc.C10889g;

/* renamed from: vc.q0 */
/* loaded from: classes.dex */
public class C11856q0 {

    /* renamed from: a */
    private final C11861t f31311a;

    /* renamed from: b */
    private final C0102e f31312b;

    /* renamed from: c */
    private final C1723b f31313c;

    /* renamed from: d */
    private final C12152e f31314d;

    /* renamed from: e */
    private final C12161n f31315e;

    /* renamed from: f */
    private final C11826b0 f31316f;

    C11856q0(C11861t c11861t, C0102e c0102e, C1723b c1723b, C12152e c12152e, C12161n c12161n, C11826b0 c11826b0) {
        this.f31311a = c11861t;
        this.f31312b = c0102e;
        this.f31313c = c1723b;
        this.f31314d = c12152e;
        this.f31315e = c12161n;
        this.f31316f = c11826b0;
    }

    /* renamed from: c */
    private AbstractC12426f0.e.d m37844c(AbstractC12426f0.e.d dVar, C12152e c12152e, C12161n c12161n) {
        AbstractC12426f0.e.d.b mo40275h = dVar.mo40275h();
        String m38933c = c12152e.m38933c();
        if (m38933c != null) {
            mo40275h.mo40370d(AbstractC12426f0.e.d.AbstractC13286d.m40388a().mo40391b(m38933c).mo40390a());
        } else {
            C10889g.m33216f().m33223i("No log data to include with this event.");
        }
        List<AbstractC12426f0.c> m37852m = m37852m(c12161n.m39003f());
        List<AbstractC12426f0.c> m37852m2 = m37852m(c12161n.m39004g());
        if (!m37852m.isEmpty() || !m37852m2.isEmpty()) {
            mo40275h.mo40368b(dVar.mo40269b().mo40284i().mo40289e(m37852m).mo40291g(m37852m2).mo40285a());
        }
        return mo40275h.mo40367a();
    }

    /* renamed from: d */
    private AbstractC12426f0.e.d m37845d(AbstractC12426f0.e.d dVar) {
        return m37846e(m37844c(dVar, this.f31314d, this.f31315e), this.f31315e);
    }

    /* renamed from: e */
    private AbstractC12426f0.e.d m37846e(AbstractC12426f0.e.d dVar, C12161n c12161n) {
        List<AbstractC12426f0.e.d.AbstractC13287e> m39005h = c12161n.m39005h();
        if (m39005h.isEmpty()) {
            return dVar;
        }
        AbstractC12426f0.e.d.b mo40275h = dVar.mo40275h();
        mo40275h.mo40371e(AbstractC12426f0.e.d.f.m40408a().mo40411b(m39005h).mo40410a());
        return mo40275h.mo40367a();
    }

    /* renamed from: f */
    private static AbstractC12426f0.a m37847f(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m37848g(traceInputStream);
            }
        } catch (IOException e10) {
            C10889g m33216f = C10889g.m33216f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb2.append(applicationExitInfo2);
            sb2.append(" Error: ");
            sb2.append(e10);
            m33216f.m33225k(sb2.toString());
        }
        AbstractC12426f0.a.b m40190a = AbstractC12426f0.a.m40190a();
        importance = applicationExitInfo.getImportance();
        AbstractC12426f0.a.b mo40139c = m40190a.mo40139c(importance);
        processName = applicationExitInfo.getProcessName();
        AbstractC12426f0.a.b mo40141e = mo40139c.mo40141e(processName);
        reason = applicationExitInfo.getReason();
        AbstractC12426f0.a.b mo40143g = mo40141e.mo40143g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        AbstractC12426f0.a.b mo40145i = mo40143g.mo40145i(timestamp);
        pid = applicationExitInfo.getPid();
        AbstractC12426f0.a.b mo40140d = mo40145i.mo40140d(pid);
        pss = applicationExitInfo.getPss();
        AbstractC12426f0.a.b mo40142f = mo40140d.mo40142f(pss);
        rss = applicationExitInfo.getRss();
        return mo40142f.mo40144h(rss).mo40146j(str).mo40137a();
    }

    /* renamed from: g */
    public static String m37848g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: h */
    public static C11856q0 m37849h(Context context, C11826b0 c11826b0, C0103f c0103f, C11823a c11823a, C12152e c12152e, C12161n c12161n, InterfaceC6886d interfaceC6886d, InterfaceC1952i interfaceC1952i, C11836g0 c11836g0, C11847m c11847m) {
        return new C11856q0(new C11861t(context, c11826b0, c11823a, interfaceC6886d, interfaceC1952i), new C0102e(c0103f, interfaceC1952i, c11847m), C1723b.m9331b(context, interfaceC1952i, c11836g0), c12152e, c12161n, c11826b0);
    }

    /* renamed from: i */
    private AbstractC11863u m37850i(AbstractC11863u abstractC11863u) {
        if (abstractC11863u.mo37672b().mo40105g() != null) {
            return abstractC11863u;
        }
        return AbstractC11863u.m37926a(abstractC11863u.mo37672b().m40187r(this.f31316f.m37683d()), abstractC11863u.mo37674d(), abstractC11863u.mo37673c());
    }

    /* renamed from: l */
    private ApplicationExitInfo m37851l(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long m436q = this.f31312b.m436q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            timestamp = applicationExitInfo.getTimestamp();
            if (timestamp < m436q) {
                return null;
            }
            reason = applicationExitInfo.getReason();
            if (reason == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: m */
    private static List<AbstractC12426f0.c> m37852m(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC12426f0.c.m40192a().mo40172b(entry.getKey()).mo40173c(entry.getValue()).mo40171a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: vc.o0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m37853o;
                m37853o = C11856q0.m37853o((AbstractC12426f0.c) obj, (AbstractC12426f0.c) obj2);
                return m37853o;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ int m37853o(AbstractC12426f0.c cVar, AbstractC12426f0.c cVar2) {
        return cVar.mo40169b().compareTo(cVar2.mo40169b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m37854r(Task<AbstractC11863u> task) {
        if (!task.isSuccessful()) {
            C10889g.m33216f().m33226l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        AbstractC11863u result = task.getResult();
        C10889g.m33216f().m33217b("Crashlytics report successfully enqueued to DataTransport: " + result.mo37674d());
        File mo37673c = result.mo37673c();
        if (mo37673c.delete()) {
            C10889g.m33216f().m33217b("Deleted report file: " + mo37673c.getPath());
            return true;
        }
        C10889g.m33216f().m33225k("Crashlytics could not delete report file: " + mo37673c.getPath());
        return true;
    }

    /* renamed from: s */
    private void m37855s(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f31312b.m439y(m37845d(this.f31311a.m37924d(th2, thread, str2, j10, 4, 8, z10)), str, str2.equals("crash"));
    }

    /* renamed from: j */
    public void m37856j(String str, List<InterfaceC11832e0> list, AbstractC12426f0.a aVar) {
        C10889g.m33216f().m33217b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC11832e0> it = list.iterator();
        while (it.hasNext()) {
            AbstractC12426f0.d.b mo37669a = it.next().mo37669a();
            if (mo37669a != null) {
                arrayList.add(mo37669a);
            }
        }
        this.f31312b.m434l(str, AbstractC12426f0.d.m40193a().mo40180b(Collections.unmodifiableList(arrayList)).mo40179a(), aVar);
    }

    /* renamed from: k */
    public void m37857k(long j10, String str) {
        this.f31312b.m433k(str, j10);
    }

    /* renamed from: n */
    public boolean m37858n() {
        return this.f31312b.m437r();
    }

    /* renamed from: p */
    public SortedSet<String> m37859p() {
        return this.f31312b.m435p();
    }

    /* renamed from: q */
    public void m37860q(String str, long j10) {
        this.f31312b.m440z(this.f31311a.m37925e(str, j10));
    }

    /* renamed from: t */
    public void m37861t(Throwable th2, Thread thread, String str, long j10) {
        C10889g.m33216f().m33223i("Persisting fatal event for session " + str);
        m37855s(th2, thread, str, "crash", j10, true);
    }

    /* renamed from: u */
    public void m37862u(Throwable th2, Thread thread, String str, long j10) {
        C10889g.m33216f().m33223i("Persisting non-fatal event for session " + str);
        m37855s(th2, thread, str, "error", j10, false);
    }

    /* renamed from: v */
    public void m37863v(String str, List<ApplicationExitInfo> list, C12152e c12152e, C12161n c12161n) {
        ApplicationExitInfo m37851l = m37851l(str, list);
        if (m37851l == null) {
            C10889g.m33216f().m33223i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC12426f0.e.d m37923c = this.f31311a.m37923c(m37847f(m37851l));
        C10889g.m33216f().m33217b("Persisting anr for session " + str);
        this.f31312b.m439y(m37846e(m37844c(m37923c, c12152e, c12161n), c12161n), str, true);
    }

    /* renamed from: w */
    public void m37864w() {
        this.f31312b.m432i();
    }

    /* renamed from: x */
    public Task<Void> m37865x(Executor executor) {
        return m37866y(executor, null);
    }

    /* renamed from: y */
    public Task<Void> m37866y(Executor executor, String str) {
        List<AbstractC11863u> m438w = this.f31312b.m438w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC11863u abstractC11863u : m438w) {
            if (str == null || str.equals(abstractC11863u.mo37674d())) {
                arrayList.add(this.f31313c.m9334c(m37850i(abstractC11863u), str != null).continueWith(executor, new Continuation() { // from class: vc.p0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean m37854r;
                        m37854r = C11856q0.this.m37854r(task);
                        return Boolean.valueOf(m37854r);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
