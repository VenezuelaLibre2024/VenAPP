package com.google.firebase.remoteconfig;

import ac.C0095a;
import ac.C0097c;
import af.C0112e;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.C6342a;
import com.google.firebase.remoteconfig.internal.C6350f;
import com.google.firebase.remoteconfig.internal.C6351g;
import com.google.firebase.remoteconfig.internal.C6357m;
import com.google.firebase.remoteconfig.internal.C6359o;
import com.google.firebase.remoteconfig.internal.C6360p;
import com.google.firebase.remoteconfig.internal.C6361q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p106fe.InterfaceC7337f;
import p310qc.C10428j;
import p485zb.C12867g;
import p488ze.InterfaceC13014k;
import p488ze.InterfaceC13017n;

/* renamed from: com.google.firebase.remoteconfig.a */
/* loaded from: classes2.dex */
public class C6342a {

    /* renamed from: n */
    public static final byte[] f13619n = new byte[0];

    /* renamed from: a */
    private final Context f13620a;

    /* renamed from: b */
    private final C12867g f13621b;

    /* renamed from: c */
    private final C0097c f13622c;

    /* renamed from: d */
    private final Executor f13623d;

    /* renamed from: e */
    private final C6350f f13624e;

    /* renamed from: f */
    private final C6350f f13625f;

    /* renamed from: g */
    private final C6350f f13626g;

    /* renamed from: h */
    private final C6357m f13627h;

    /* renamed from: i */
    private final C6359o f13628i;

    /* renamed from: j */
    private final C6360p f13629j;

    /* renamed from: k */
    private final InterfaceC7337f f13630k;

    /* renamed from: l */
    private final C6361q f13631l;

    /* renamed from: m */
    private final C0112e f13632m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6342a(Context context, C12867g c12867g, InterfaceC7337f interfaceC7337f, C0097c c0097c, Executor executor, C6350f c6350f, C6350f c6350f2, C6350f c6350f3, C6357m c6357m, C6359o c6359o, C6360p c6360p, C6361q c6361q, C0112e c0112e) {
        this.f13620a = context;
        this.f13621b = c12867g;
        this.f13630k = interfaceC7337f;
        this.f13622c = c0097c;
        this.f13623d = executor;
        this.f13624e = c6350f;
        this.f13625f = c6350f2;
        this.f13626g = c6350f3;
        this.f13627h = c6357m;
        this.f13628i = c6359o;
        this.f13629j = c6360p;
        this.f13631l = c6361q;
        this.f13632m = c0112e;
    }

    /* renamed from: k */
    private static boolean m17553k(C6351g c6351g, C6351g c6351g2) {
        return c6351g2 == null || !c6351g.m17633h().equals(c6351g2.m17633h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Task m17554l(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        C6351g c6351g = (C6351g) task.getResult();
        return (!task2.isSuccessful() || m17553k(c6351g, (C6351g) task2.getResult())) ? this.f13625f.m17622k(c6351g).continueWith(this.f13623d, new Continuation() { // from class: ze.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                boolean m17557o;
                m17557o = C6342a.this.m17557o(task4);
                return Boolean.valueOf(m17557o);
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Task m17555m(C6357m.a aVar) {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Task m17556n(Void r12) {
        return m17559e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public boolean m17557o(Task<C6351g> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f13624e.m17618d();
        C6351g result = task.getResult();
        if (result == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        m17567s(result.m17630e());
        this.f13632m.m528g(result);
        return true;
    }

    /* renamed from: r */
    static List<Map<String, String>> m17558r(JSONArray jSONArray) {
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

    /* renamed from: e */
    public Task<Boolean> m17559e() {
        final Task<C6351g> m17619e = this.f13624e.m17619e();
        final Task<C6351g> m17619e2 = this.f13625f.m17619e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{m17619e, m17619e2}).continueWithTask(this.f13623d, new Continuation() { // from class: ze.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m17554l;
                m17554l = C6342a.this.m17554l(m17619e, m17619e2, task);
                return m17554l;
            }
        });
    }

    /* renamed from: f */
    public Task<Void> m17560f() {
        return this.f13627h.m17669i().onSuccessTask(C10428j.m31228a(), new SuccessContinuation() { // from class: ze.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m17555m;
                m17555m = C6342a.m17555m((C6357m.a) obj);
                return m17555m;
            }
        });
    }

    /* renamed from: g */
    public Task<Boolean> m17561g() {
        return m17560f().onSuccessTask(this.f13623d, new SuccessContinuation() { // from class: ze.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m17556n;
                m17556n = C6342a.this.m17556n((Void) obj);
                return m17556n;
            }
        });
    }

    /* renamed from: h */
    public Map<String, InterfaceC13017n> m17562h() {
        return this.f13628i.m17688d();
    }

    /* renamed from: i */
    public InterfaceC13014k m17563i() {
        return this.f13629j.m17693c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C0112e m17564j() {
        return this.f13632m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m17565p(boolean z10) {
        this.f13631l.m17713b(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m17566q() {
        this.f13625f.m17619e();
        this.f13626g.m17619e();
        this.f13624e.m17619e();
    }

    /* renamed from: s */
    void m17567s(JSONArray jSONArray) {
        if (this.f13622c == null) {
            return;
        }
        try {
            this.f13622c.m406m(m17558r(jSONArray));
        } catch (C0095a e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }
}
