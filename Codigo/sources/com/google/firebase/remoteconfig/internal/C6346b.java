package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C6357m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p488ze.AbstractC13005b;
import p488ze.C13011h;
import p488ze.C13012i;
import p488ze.C13015l;
import p488ze.InterfaceC13006c;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
/* loaded from: classes2.dex */
public class C6346b {

    /* renamed from: a */
    private final Set<InterfaceC13006c> f13660a;

    /* renamed from: b */
    private final HttpURLConnection f13661b;

    /* renamed from: c */
    private final C6357m f13662c;

    /* renamed from: d */
    private final C6350f f13663d;

    /* renamed from: e */
    private final InterfaceC13006c f13664e;

    /* renamed from: f */
    private final ScheduledExecutorService f13665f;

    /* renamed from: g */
    private final Random f13666g = new Random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.b$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f13667a;

        /* renamed from: b */
        final /* synthetic */ long f13668b;

        a(int i10, long j10) {
            this.f13667a = i10;
            this.f13668b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6346b.this.m17609d(this.f13667a, this.f13668b);
        }
    }

    public C6346b(HttpURLConnection httpURLConnection, C6357m c6357m, C6350f c6350f, Set<InterfaceC13006c> set, InterfaceC13006c interfaceC13006c, ScheduledExecutorService scheduledExecutorService) {
        this.f13661b = httpURLConnection;
        this.f13662c = c6357m;
        this.f13663d = c6350f;
        this.f13660a = set;
        this.f13664e = interfaceC13006c;
        this.f13665f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m17601b(int i10, long j10) {
        if (i10 == 0) {
            m17608k(new C13015l("Unable to fetch the latest version of the template.", C13012i.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f13665f.schedule(new a(i10, j10), this.f13666g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    private synchronized void m17602c(AbstractC13005b abstractC13005b) {
        Iterator<InterfaceC13006c> it = this.f13660a.iterator();
        while (it.hasNext()) {
            it.next().mo17744a(abstractC13005b);
        }
    }

    /* renamed from: e */
    private static Boolean m17603e(C6357m.a aVar, long j10) {
        if (aVar.m17676d() != null) {
            return Boolean.valueOf(aVar.m17676d().m17636k() >= j10);
        }
        return Boolean.valueOf(aVar.m17678f() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has("featureDisabled") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r9.f13664e.mo17745b(new p488ze.C13015l("The server is temporarily unavailable. Try again in a few minutes.", p488ze.C13012i.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (m17605g() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r6 = r9.f13662c.m17672r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r4 <= r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        m17601b(3, r4);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m17604f(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L95
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.m17607j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L7b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L5b
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L5b
            ze.c r4 = r9.f13664e     // Catch: org.json.JSONException -> L7b
            ze.l r5 = new ze.l     // Catch: org.json.JSONException -> L7b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            ze.i$a r7 = p488ze.C13012i.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L7b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L7b
            r4.mo17745b(r5)     // Catch: org.json.JSONException -> L7b
            goto L95
        L5b:
            boolean r4 = r9.m17605g()     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L62
            goto L95
        L62:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.m r4 = r9.f13662c     // Catch: org.json.JSONException -> L7b
            long r6 = r4.m17672r()     // Catch: org.json.JSONException -> L7b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L7b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L12
            r6 = 3
            r9.m17601b(r6, r4)     // Catch: org.json.JSONException -> L7b
            goto L12
        L7b:
            r4 = move-exception
            ze.h r5 = new ze.h
            java.lang.Throwable r6 = r4.getCause()
            ze.i$a r7 = p488ze.C13012i.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.m17608k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L95:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C6346b.m17604f(java.io.InputStream):void");
    }

    /* renamed from: g */
    private synchronized boolean m17605g() {
        return this.f13660a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Task m17606h(Task task, Task task2, long j10, int i10, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new C13011h("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new C13011h("Failed to get activated config for auto-fetch", task2.getException()));
        }
        C6357m.a aVar = (C6357m.a) task.getResult();
        C6351g c6351g = (C6351g) task2.getResult();
        if (!m17603e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            m17601b(i10, j10);
            return Tasks.forResult(null);
        }
        if (aVar.m17676d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (c6351g == null) {
            c6351g = C6351g.m17629l().m17637a();
        }
        Set<String> m17631f = c6351g.m17631f(aVar.m17676d());
        if (m17631f.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        m17602c(AbstractC13005b.m42983a(m17631f));
        return Tasks.forResult(null);
    }

    /* renamed from: j */
    private String m17607j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    /* renamed from: k */
    private synchronized void m17608k(C13012i c13012i) {
        Iterator<InterfaceC13006c> it = this.f13660a.iterator();
        while (it.hasNext()) {
            it.next().mo17745b(c13012i);
        }
    }

    /* renamed from: d */
    public synchronized Task<Void> m17609d(int i10, final long j10) {
        final int i11;
        final Task<C6357m.a> m17671n;
        final Task<C6351g> m17619e;
        i11 = i10 - 1;
        m17671n = this.f13662c.m17671n(C6357m.b.REALTIME, 3 - i11);
        m17619e = this.f13663d.m17619e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{m17671n, m17619e}).continueWithTask(this.f13665f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m17606h;
                m17606h = C6346b.this.m17606h(m17671n, m17619e, j10, i11, task);
                return m17606h;
            }
        });
    }

    /* renamed from: i */
    public void m17610i() {
        HttpURLConnection httpURLConnection = this.f13661b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                m17604f(inputStream);
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
            }
        } finally {
            this.f13661b.disconnect();
        }
    }
}
