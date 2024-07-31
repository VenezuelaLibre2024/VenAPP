package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import ze.i;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: q, reason: collision with root package name */
    static final int[] f12527q = {2, 4, 8, 16, 32, 64, RecognitionOptions.ITF, RecognitionOptions.QR_CODE};

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f12528r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Set<ze.c> f12529a;

    /* renamed from: c, reason: collision with root package name */
    private int f12531c;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f12535g;

    /* renamed from: h, reason: collision with root package name */
    private final m f12536h;

    /* renamed from: i, reason: collision with root package name */
    private final zb.g f12537i;

    /* renamed from: j, reason: collision with root package name */
    private final fe.f f12538j;

    /* renamed from: k, reason: collision with root package name */
    f f12539k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f12540l;

    /* renamed from: m, reason: collision with root package name */
    private final String f12541m;

    /* renamed from: p, reason: collision with root package name */
    private final p f12544p;

    /* renamed from: f, reason: collision with root package name */
    private final int f12534f = 8;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12530b = false;

    /* renamed from: n, reason: collision with root package name */
    private final Random f12542n = new Random();

    /* renamed from: o, reason: collision with root package name */
    private final la.f f12543o = la.i.d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f12532d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12533e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ze.c {
        b() {
        }

        @Override // ze.c
        public void a(ze.b bVar) {
        }

        @Override // ze.c
        public void b(ze.i iVar) {
            t.this.j();
            t.this.u(iVar);
        }
    }

    public t(zb.g gVar, fe.f fVar, m mVar, f fVar2, Context context, String str, Set<ze.c> set, p pVar, ScheduledExecutorService scheduledExecutorService) {
        this.f12529a = set;
        this.f12535g = scheduledExecutorService;
        this.f12531c = Math.max(8 - pVar.h().b(), 1);
        this.f12537i = gVar;
        this.f12536h = mVar;
        this.f12538j = fVar;
        this.f12539k = fVar2;
        this.f12540l = context;
        this.f12541m = str;
        this.f12544p = pVar;
    }

    private void D(Date date) {
        int b10 = this.f12544p.h().b() + 1;
        this.f12544p.n(b10, new Date(date.getTime() + m(b10)));
    }

    private synchronized boolean f() {
        boolean z10;
        if (!this.f12529a.isEmpty() && !this.f12530b && !this.f12532d) {
            z10 = this.f12533e ? false : true;
        }
        return z10;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.f12537i.r().c()));
        hashMap.put("namespace", this.f12541m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f12536h.r()));
        hashMap.put("appId", this.f12537i.r().c());
        hashMap.put("sdkVersion", "21.6.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.f12532d = true;
    }

    private static String k(String str) {
        Matcher matcher = f12528r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String l() {
        try {
            Context context = this.f12540l;
            byte[] a10 = la.a.a(context, context.getPackageName());
            if (a10 != null) {
                return la.k.c(a10, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f12540l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f12540l.getPackageName());
            return null;
        }
    }

    private long m(int i10) {
        int length = f12527q.length;
        if (i10 >= length) {
            i10 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i10 - 1]) / 2) + this.f12542n.nextInt((int) r0);
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.f12537i.r().c()), str);
    }

    private URL o() {
        try {
            return new URL(n(this.f12541m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.firebase.remoteconfig.internal.t] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.net.HttpURLConnection] */
    public /* synthetic */ Task q(Task task, Task task2) {
        Integer num;
        Throwable th2;
        Integer num2;
        ze.l lVar;
        boolean z10;
        try {
            try {
            } catch (IOException e10) {
                e = e10;
                task = 0;
                num2 = null;
            } catch (Throwable th3) {
                num = null;
                th2 = th3;
                task = 0;
            }
            if (!task.isSuccessful()) {
                throw new IOException(task.getException());
            }
            y(true);
            task = (HttpURLConnection) task.getResult();
            try {
                num2 = Integer.valueOf(task.getResponseCode());
            } catch (IOException e11) {
                e = e11;
                num2 = null;
            } catch (Throwable th4) {
                num = null;
                th2 = th4;
                g(task);
                y(false);
                boolean z11 = num == null || p(num.intValue());
                if (z11) {
                    D(new Date(this.f12543o.a()));
                }
                if (z11 || num.intValue() == 200) {
                    w();
                } else {
                    String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format = t(task.getErrorStream());
                    }
                    u(new ze.l(num.intValue(), format, i.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th2;
            }
            try {
                if (num2.intValue() == 200) {
                    v();
                    this.f12544p.j();
                    B(task).i();
                }
                g(task);
                y(false);
                z10 = p(num2.intValue());
                if (z10) {
                    D(new Date(this.f12543o.a()));
                }
            } catch (IOException e12) {
                e = e12;
                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                g(task);
                y(false);
                boolean z12 = num2 == null || p(num2.intValue());
                if (z12) {
                    D(new Date(this.f12543o.a()));
                }
                if (!z12 && num2.intValue() != 200) {
                    String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                    if (num2.intValue() == 403) {
                        format2 = t(task.getErrorStream());
                    }
                    lVar = new ze.l(num2.intValue(), format2, i.a.CONFIG_UPDATE_STREAM_ERROR);
                    u(lVar);
                    return Tasks.forResult(null);
                }
                w();
                return Tasks.forResult(null);
            }
            if (!z10 && num2.intValue() != 200) {
                String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                if (num2.intValue() == 403) {
                    format3 = t(task.getErrorStream());
                }
                lVar = new ze.l(num2.intValue(), format3, i.a.CONFIG_UPDATE_STREAM_ERROR);
                u(lVar);
                return Tasks.forResult(null);
            }
            w();
            return Tasks.forResult(null);
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task r(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new ze.h("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new ze.h("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.g) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e10) {
            return Tasks.forException(new ze.h("Failed to open HTTP stream connection", e10));
        }
    }

    private synchronized void s(long j10) {
        if (f()) {
            int i10 = this.f12531c;
            if (i10 > 0) {
                this.f12531c = i10 - 1;
                this.f12535g.schedule(new a(), j10, TimeUnit.MILLISECONDS);
            } else if (!this.f12533e) {
                u(new ze.h("Unable to connect to the server. Check your connection and try again.", i.a.CONFIG_UPDATE_STREAM_ERROR));
            }
        }
    }

    private String t(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(ze.i iVar) {
        Iterator<ze.c> it = this.f12529a.iterator();
        while (it.hasNext()) {
            it.next().b(iVar);
        }
    }

    private synchronized void v() {
        this.f12531c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f12537i.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f12540l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z10) {
        this.f12530b = z10;
    }

    public void A(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.b B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f12536h, this.f12539k, this.f12529a, new b(), this.f12535g);
    }

    public void C() {
        s(0L);
    }

    public void e() {
        if (f()) {
            if (new Date(this.f12543o.a()).before(this.f12544p.h().a())) {
                w();
            } else {
                final Task<HttpURLConnection> h10 = h();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{h10}).continueWith(this.f12535g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.r
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Task q10;
                        q10 = t.this.q(h10, task);
                        return q10;
                    }
                });
            }
        }
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public Task<HttpURLConnection> h() {
        final Task<com.google.firebase.installations.g> a10 = this.f12538j.a(false);
        final Task<String> id2 = this.f12538j.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{a10, id2}).continueWithTask(this.f12535g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.s
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task r10;
                r10 = t.this.r(a10, id2, task);
                return r10;
            }
        });
    }

    public synchronized void w() {
        s(Math.max(0L, this.f12544p.h().a().getTime() - new Date(this.f12543o.a()).getTime()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z10) {
        this.f12533e = z10;
    }
}
