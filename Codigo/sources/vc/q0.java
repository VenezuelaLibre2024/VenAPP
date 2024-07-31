package vc;

import android.app.ApplicationExitInfo;
import android.content.Context;
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
import xc.f0;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a */
    private final t f28877a;

    /* renamed from: b */
    private final ad.e f28878b;

    /* renamed from: c */
    private final bd.b f28879c;

    /* renamed from: d */
    private final wc.e f28880d;

    /* renamed from: e */
    private final wc.n f28881e;

    /* renamed from: f */
    private final b0 f28882f;

    q0(t tVar, ad.e eVar, bd.b bVar, wc.e eVar2, wc.n nVar, b0 b0Var) {
        this.f28877a = tVar;
        this.f28878b = eVar;
        this.f28879c = bVar;
        this.f28880d = eVar2;
        this.f28881e = nVar;
        this.f28882f = b0Var;
    }

    private f0.e.d c(f0.e.d dVar, wc.e eVar, wc.n nVar) {
        f0.e.d.b h10 = dVar.h();
        String c10 = eVar.c();
        if (c10 != null) {
            h10.d(f0.e.d.AbstractC0518d.a().b(c10).a());
        } else {
            sc.g.f().i("No log data to include with this event.");
        }
        List<f0.c> m10 = m(nVar.f());
        List<f0.c> m11 = m(nVar.g());
        if (!m10.isEmpty() || !m11.isEmpty()) {
            h10.b(dVar.b().i().e(m10).g(m11).a());
        }
        return h10.a();
    }

    private f0.e.d d(f0.e.d dVar) {
        return e(c(dVar, this.f28880d, this.f28881e), this.f28881e);
    }

    private f0.e.d e(f0.e.d dVar, wc.n nVar) {
        List<f0.e.d.AbstractC0519e> h10 = nVar.h();
        if (h10.isEmpty()) {
            return dVar;
        }
        f0.e.d.b h11 = dVar.h();
        h11.e(f0.e.d.f.a().b(h10).a());
        return h11.a();
    }

    private static f0.a f(ApplicationExitInfo applicationExitInfo) {
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
                str = g(traceInputStream);
            }
        } catch (IOException e10) {
            sc.g f10 = sc.g.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb2.append(applicationExitInfo2);
            sb2.append(" Error: ");
            sb2.append(e10);
            f10.k(sb2.toString());
        }
        f0.a.b a10 = f0.a.a();
        importance = applicationExitInfo.getImportance();
        f0.a.b c10 = a10.c(importance);
        processName = applicationExitInfo.getProcessName();
        f0.a.b e11 = c10.e(processName);
        reason = applicationExitInfo.getReason();
        f0.a.b g10 = e11.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        f0.a.b i10 = g10.i(timestamp);
        pid = applicationExitInfo.getPid();
        f0.a.b d10 = i10.d(pid);
        pss = applicationExitInfo.getPss();
        f0.a.b f11 = d10.f(pss);
        rss = applicationExitInfo.getRss();
        return f11.h(rss).j(str).a();
    }

    public static String g(InputStream inputStream) {
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

    public static q0 h(Context context, b0 b0Var, ad.f fVar, a aVar, wc.e eVar, wc.n nVar, dd.d dVar, cd.i iVar, g0 g0Var, m mVar) {
        return new q0(new t(context, b0Var, aVar, dVar, iVar), new ad.e(fVar, iVar, mVar), bd.b.b(context, iVar, g0Var), eVar, nVar, b0Var);
    }

    private u i(u uVar) {
        if (uVar.b().g() != null) {
            return uVar;
        }
        return u.a(uVar.b().r(this.f28882f.d()), uVar.d(), uVar.c());
    }

    private ApplicationExitInfo l(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long q10 = this.f28878b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            timestamp = applicationExitInfo.getTimestamp();
            if (timestamp < q10) {
                return null;
            }
            reason = applicationExitInfo.getReason();
            if (reason == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    private static List<f0.c> m(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(f0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: vc.o0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int o10;
                o10 = q0.o((f0.c) obj, (f0.c) obj2);
                return o10;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ int o(f0.c cVar, f0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public boolean r(Task<u> task) {
        if (!task.isSuccessful()) {
            sc.g.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        u result = task.getResult();
        sc.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + result.d());
        File c10 = result.c();
        if (c10.delete()) {
            sc.g.f().b("Deleted report file: " + c10.getPath());
            return true;
        }
        sc.g.f().k("Crashlytics could not delete report file: " + c10.getPath());
        return true;
    }

    private void s(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f28878b.y(d(this.f28877a.d(th2, thread, str2, j10, 4, 8, z10)), str, str2.equals("crash"));
    }

    public void j(String str, List<e0> list, f0.a aVar) {
        sc.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<e0> it = list.iterator();
        while (it.hasNext()) {
            f0.d.b a10 = it.next().a();
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        this.f28878b.l(str, f0.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void k(long j10, String str) {
        this.f28878b.k(str, j10);
    }

    public boolean n() {
        return this.f28878b.r();
    }

    public SortedSet<String> p() {
        return this.f28878b.p();
    }

    public void q(String str, long j10) {
        this.f28878b.z(this.f28877a.e(str, j10));
    }

    public void t(Throwable th2, Thread thread, String str, long j10) {
        sc.g.f().i("Persisting fatal event for session " + str);
        s(th2, thread, str, "crash", j10, true);
    }

    public void u(Throwable th2, Thread thread, String str, long j10) {
        sc.g.f().i("Persisting non-fatal event for session " + str);
        s(th2, thread, str, "error", j10, false);
    }

    public void v(String str, List<ApplicationExitInfo> list, wc.e eVar, wc.n nVar) {
        ApplicationExitInfo l10 = l(str, list);
        if (l10 == null) {
            sc.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        f0.e.d c10 = this.f28877a.c(f(l10));
        sc.g.f().b("Persisting anr for session " + str);
        this.f28878b.y(e(c(c10, eVar, nVar), nVar), str, true);
    }

    public void w() {
        this.f28878b.i();
    }

    public Task<Void> x(Executor executor) {
        return y(executor, null);
    }

    public Task<Void> y(Executor executor, String str) {
        List<u> w10 = this.f28878b.w();
        ArrayList arrayList = new ArrayList();
        for (u uVar : w10) {
            if (str == null || str.equals(uVar.d())) {
                arrayList.add(this.f28879c.c(i(uVar), str != null).continueWith(executor, new Continuation() { // from class: vc.p0
                    public /* synthetic */ p0() {
                    }

                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean r10;
                        r10 = q0.this.r(task);
                        return Boolean.valueOf(r10);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
