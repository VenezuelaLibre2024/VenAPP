package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.installations.AbstractC6200g;
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
import la.C9456a;
import la.C9464i;
import la.C9466k;
import la.InterfaceC9461f;
import org.json.JSONObject;
import p106fe.InterfaceC7337f;
import p485zb.C12867g;
import p488ze.AbstractC13005b;
import p488ze.C13011h;
import p488ze.C13012i;
import p488ze.C13015l;
import p488ze.InterfaceC13006c;

/* renamed from: com.google.firebase.remoteconfig.internal.t */
/* loaded from: classes2.dex */
public class C6364t {

    /* renamed from: q */
    static final int[] f13759q = {2, 4, 8, 16, 32, 64, RecognitionOptions.ITF, RecognitionOptions.QR_CODE};

    /* renamed from: r */
    private static final Pattern f13760r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Set<InterfaceC13006c> f13761a;

    /* renamed from: c */
    private int f13763c;

    /* renamed from: g */
    private final ScheduledExecutorService f13767g;

    /* renamed from: h */
    private final C6357m f13768h;

    /* renamed from: i */
    private final C12867g f13769i;

    /* renamed from: j */
    private final InterfaceC7337f f13770j;

    /* renamed from: k */
    C6350f f13771k;

    /* renamed from: l */
    private final Context f13772l;

    /* renamed from: m */
    private final String f13773m;

    /* renamed from: p */
    private final C6360p f13776p;

    /* renamed from: f */
    private final int f13766f = 8;

    /* renamed from: b */
    private boolean f13762b = false;

    /* renamed from: n */
    private final Random f13774n = new Random();

    /* renamed from: o */
    private final InterfaceC9461f f13775o = C9464i.m28142d();

    /* renamed from: d */
    private boolean f13764d = false;

    /* renamed from: e */
    private boolean f13765e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.t$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6364t.this.m17739e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.t$b */
    /* loaded from: classes2.dex */
    public class b implements InterfaceC13006c {
        b() {
        }

        @Override // p488ze.InterfaceC13006c
        /* renamed from: a */
        public void mo17744a(AbstractC13005b abstractC13005b) {
        }

        @Override // p488ze.InterfaceC13006c
        /* renamed from: b */
        public void mo17745b(C13012i c13012i) {
            C6364t.this.m17721j();
            C6364t.this.m17732u(c13012i);
        }
    }

    public C6364t(C12867g c12867g, InterfaceC7337f interfaceC7337f, C6357m c6357m, C6350f c6350f, Context context, String str, Set<InterfaceC13006c> set, C6360p c6360p, ScheduledExecutorService scheduledExecutorService) {
        this.f13761a = set;
        this.f13767g = scheduledExecutorService;
        this.f13763c = Math.max(8 - c6360p.m17698h().m17711b(), 1);
        this.f13769i = c12867g;
        this.f13768h = c6357m;
        this.f13770j = interfaceC7337f;
        this.f13771k = c6350f;
        this.f13772l = context;
        this.f13773m = str;
        this.f13776p = c6360p;
    }

    /* renamed from: D */
    private void m17714D(Date date) {
        int m17711b = this.f13776p.m17698h().m17711b() + 1;
        this.f13776p.m17704n(m17711b, new Date(date.getTime() + m17724m(m17711b)));
    }

    /* renamed from: f */
    private synchronized boolean m17719f() {
        boolean z10;
        if (!this.f13761a.isEmpty() && !this.f13762b && !this.f13764d) {
            z10 = this.f13765e ? false : true;
        }
        return z10;
    }

    /* renamed from: i */
    private JSONObject m17720i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m17722k(this.f13769i.m42632r().m42644c()));
        hashMap.put("namespace", this.f13773m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f13768h.m17672r()));
        hashMap.put("appId", this.f13769i.m42632r().m42644c());
        hashMap.put("sdkVersion", "21.6.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public synchronized void m17721j() {
        this.f13764d = true;
    }

    /* renamed from: k */
    private static String m17722k(String str) {
        Matcher matcher = f13760r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: l */
    private String m17723l() {
        try {
            Context context = this.f13772l;
            byte[] m28113a = C9456a.m28113a(context, context.getPackageName());
            if (m28113a != null) {
                return C9466k.m28155c(m28113a, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f13772l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f13772l.getPackageName());
            return null;
        }
    }

    /* renamed from: m */
    private long m17724m(int i10) {
        int length = f13759q.length;
        if (i10 >= length) {
            i10 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i10 - 1]) / 2) + this.f13774n.nextInt((int) r0);
    }

    /* renamed from: n */
    private String m17725n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m17722k(this.f13769i.m42632r().m42644c()), str);
    }

    /* renamed from: o */
    private URL m17726o() {
        try {
            return new URL(m17725n(this.f13773m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    /* renamed from: p */
    private boolean m17727p(int i10) {
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
    /* renamed from: q */
    public /* synthetic */ Task m17728q(Task task, Task task2) {
        Integer num;
        Throwable th2;
        Integer num2;
        C13015l c13015l;
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
            m17735y(true);
            task = (HttpURLConnection) task.getResult();
            try {
                num2 = Integer.valueOf(task.getResponseCode());
            } catch (IOException e11) {
                e = e11;
                num2 = null;
            } catch (Throwable th4) {
                num = null;
                th2 = th4;
                m17740g(task);
                m17735y(false);
                boolean z11 = num == null || m17727p(num.intValue());
                if (z11) {
                    m17714D(new Date(this.f13775o.mo28130a()));
                }
                if (z11 || num.intValue() == 200) {
                    m17742w();
                } else {
                    String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format = m17731t(task.getErrorStream());
                    }
                    m17732u(new C13015l(num.intValue(), format, C13012i.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th2;
            }
            try {
                if (num2.intValue() == 200) {
                    m17733v();
                    this.f13776p.m17700j();
                    m17737B(task).m17610i();
                }
                m17740g(task);
                m17735y(false);
                z10 = m17727p(num2.intValue());
                if (z10) {
                    m17714D(new Date(this.f13775o.mo28130a()));
                }
            } catch (IOException e12) {
                e = e12;
                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                m17740g(task);
                m17735y(false);
                boolean z12 = num2 == null || m17727p(num2.intValue());
                if (z12) {
                    m17714D(new Date(this.f13775o.mo28130a()));
                }
                if (!z12 && num2.intValue() != 200) {
                    String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                    if (num2.intValue() == 403) {
                        format2 = m17731t(task.getErrorStream());
                    }
                    c13015l = new C13015l(num2.intValue(), format2, C13012i.a.CONFIG_UPDATE_STREAM_ERROR);
                    m17732u(c13015l);
                    return Tasks.forResult(null);
                }
                m17742w();
                return Tasks.forResult(null);
            }
            if (!z10 && num2.intValue() != 200) {
                String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                if (num2.intValue() == 403) {
                    format3 = m17731t(task.getErrorStream());
                }
                c13015l = new C13015l(num2.intValue(), format3, C13012i.a.CONFIG_UPDATE_STREAM_ERROR);
                m17732u(c13015l);
                return Tasks.forResult(null);
            }
            m17742w();
            return Tasks.forResult(null);
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Task m17729r(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new C13011h("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new C13011h("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m17726o().openConnection();
            m17736A(httpURLConnection, (String) task2.getResult(), ((AbstractC6200g) task.getResult()).mo16814b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e10) {
            return Tasks.forException(new C13011h("Failed to open HTTP stream connection", e10));
        }
    }

    /* renamed from: s */
    private synchronized void m17730s(long j10) {
        if (m17719f()) {
            int i10 = this.f13763c;
            if (i10 > 0) {
                this.f13763c = i10 - 1;
                this.f13767g.schedule(new a(), j10, TimeUnit.MILLISECONDS);
            } else if (!this.f13765e) {
                m17732u(new C13011h("Unable to connect to the server. Check your connection and try again.", C13012i.a.CONFIG_UPDATE_STREAM_ERROR));
            }
        }
    }

    /* renamed from: t */
    private String m17731t(InputStream inputStream) {
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
    /* renamed from: u */
    public synchronized void m17732u(C13012i c13012i) {
        Iterator<InterfaceC13006c> it = this.f13761a.iterator();
        while (it.hasNext()) {
            it.next().mo17745b(c13012i);
        }
    }

    /* renamed from: v */
    private synchronized void m17733v() {
        this.f13763c = 8;
    }

    /* renamed from: x */
    private void m17734x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f13769i.m42632r().m42643b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f13772l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m17723l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: y */
    private synchronized void m17735y(boolean z10) {
        this.f13762b = z10;
    }

    /* renamed from: A */
    public void m17736A(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        m17734x(httpURLConnection, str2);
        byte[] bytes = m17720i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: B */
    public synchronized C6346b m17737B(HttpURLConnection httpURLConnection) {
        return new C6346b(httpURLConnection, this.f13768h, this.f13771k, this.f13761a, new b(), this.f13767g);
    }

    /* renamed from: C */
    public void m17738C() {
        m17730s(0L);
    }

    /* renamed from: e */
    public void m17739e() {
        if (m17719f()) {
            if (new Date(this.f13775o.mo28130a()).before(this.f13776p.m17698h().m17710a())) {
                m17742w();
            } else {
                final Task<HttpURLConnection> m17741h = m17741h();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{m17741h}).continueWith(this.f13767g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.r
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Task m17728q;
                        m17728q = C6364t.this.m17728q(m17741h, task);
                        return m17728q;
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public void m17740g(HttpURLConnection httpURLConnection) {
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

    /* renamed from: h */
    public Task<HttpURLConnection> m17741h() {
        final Task<AbstractC6200g> mo16854a = this.f13770j.mo16854a(false);
        final Task<String> id2 = this.f13770j.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{mo16854a, id2}).continueWithTask(this.f13767g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.s
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m17729r;
                m17729r = C6364t.this.m17729r(mo16854a, id2, task);
                return m17729r;
            }
        });
    }

    /* renamed from: w */
    public synchronized void m17742w() {
        m17730s(Math.max(0L, this.f13776p.m17698h().m17710a().getTime() - new Date(this.f13775o.mo28130a()).getTime()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m17743z(boolean z10) {
        this.f13765e = z10;
    }
}
