package com.google.firebase.remoteconfig;

import af.e;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.j;
import zb.g;
import ze.k;
import ze.n;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f12387n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Context f12388a;

    /* renamed from: b, reason: collision with root package name */
    private final g f12389b;

    /* renamed from: c, reason: collision with root package name */
    private final ac.c f12390c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f12391d;

    /* renamed from: e, reason: collision with root package name */
    private final f f12392e;

    /* renamed from: f, reason: collision with root package name */
    private final f f12393f;

    /* renamed from: g, reason: collision with root package name */
    private final f f12394g;

    /* renamed from: h, reason: collision with root package name */
    private final m f12395h;

    /* renamed from: i, reason: collision with root package name */
    private final o f12396i;

    /* renamed from: j, reason: collision with root package name */
    private final p f12397j;

    /* renamed from: k, reason: collision with root package name */
    private final fe.f f12398k;

    /* renamed from: l, reason: collision with root package name */
    private final q f12399l;

    /* renamed from: m, reason: collision with root package name */
    private final e f12400m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, g gVar, fe.f fVar, ac.c cVar, Executor executor, f fVar2, f fVar3, f fVar4, m mVar, o oVar, p pVar, q qVar, e eVar) {
        this.f12388a = context;
        this.f12389b = gVar;
        this.f12398k = fVar;
        this.f12390c = cVar;
        this.f12391d = executor;
        this.f12392e = fVar2;
        this.f12393f = fVar3;
        this.f12394g = fVar4;
        this.f12395h = mVar;
        this.f12396i = oVar;
        this.f12397j = pVar;
        this.f12399l = qVar;
        this.f12400m = eVar;
    }

    private static boolean k(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task l(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.g gVar = (com.google.firebase.remoteconfig.internal.g) task.getResult();
        return (!task2.isSuccessful() || k(gVar, (com.google.firebase.remoteconfig.internal.g) task2.getResult())) ? this.f12393f.k(gVar).continueWith(this.f12391d, new Continuation() { // from class: ze.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                boolean o10;
                o10 = com.google.firebase.remoteconfig.a.this.o(task4);
                return Boolean.valueOf(o10);
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task m(m.a aVar) {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task n(Void r12) {
        return e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(Task<com.google.firebase.remoteconfig.internal.g> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f12392e.d();
        com.google.firebase.remoteconfig.internal.g result = task.getResult();
        if (result == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        s(result.e());
        this.f12400m.g(result);
        return true;
    }

    static List<Map<String, String>> r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public Task<Boolean> e() {
        final Task<com.google.firebase.remoteconfig.internal.g> e10 = this.f12392e.e();
        final Task<com.google.firebase.remoteconfig.internal.g> e11 = this.f12393f.e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{e10, e11}).continueWithTask(this.f12391d, new Continuation() { // from class: ze.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task l10;
                l10 = com.google.firebase.remoteconfig.a.this.l(e10, e11, task);
                return l10;
            }
        });
    }

    public Task<Void> f() {
        return this.f12395h.i().onSuccessTask(j.a(), new SuccessContinuation() { // from class: ze.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m10;
                m10 = com.google.firebase.remoteconfig.a.m((m.a) obj);
                return m10;
            }
        });
    }

    public Task<Boolean> g() {
        return f().onSuccessTask(this.f12391d, new SuccessContinuation() { // from class: ze.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task n10;
                n10 = com.google.firebase.remoteconfig.a.this.n((Void) obj);
                return n10;
            }
        });
    }

    public Map<String, n> h() {
        return this.f12396i.d();
    }

    public k i() {
        return this.f12397j.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e j() {
        return this.f12400m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(boolean z10) {
        this.f12399l.b(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f12393f.e();
        this.f12394g.e();
        this.f12392e.e();
    }

    void s(JSONArray jSONArray) {
        if (this.f12390c == null) {
            return;
        }
        try {
            this.f12390c.m(r(jSONArray));
        } catch (ac.a e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }
}
