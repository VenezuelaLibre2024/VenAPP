package p218l9;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l9.v */
/* loaded from: classes.dex */
public final class C9451v {

    /* renamed from: h */
    private final zzdwk f22993h;

    /* renamed from: i */
    private Map f22994i;

    /* renamed from: f */
    private final ArrayDeque f22991f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f22992g = new ArrayDeque();

    /* renamed from: a */
    private final int f22986a = ((Integer) C4784a0.m12365c().zza(zzbgc.zzgY)).intValue();

    /* renamed from: b */
    private final long f22987b = ((Long) C4784a0.m12365c().zza(zzbgc.zzgZ)).longValue();

    /* renamed from: c */
    private final boolean f22988c = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhe)).booleanValue();

    /* renamed from: d */
    private final boolean f22989d = ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhc)).booleanValue();

    /* renamed from: e */
    private final Map f22990e = Collections.synchronizedMap(new C9450u(this));

    public C9451v(zzdwk zzdwkVar) {
        this.f22993h = zzdwkVar;
    }

    /* renamed from: g */
    private final synchronized void m28099g(final zzdwa zzdwaVar) {
        if (this.f22988c) {
            ArrayDeque arrayDeque = this.f22992g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f22991f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcep.zza.execute(new Runnable() { // from class: l9.b
                @Override // java.lang.Runnable
                public final void run() {
                    C9451v.this.m28105e(zzdwaVar, clone, clone2);
                }
            });
        }
    }

    /* renamed from: h */
    private final void m28100h(zzdwa zzdwaVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdwaVar.zza());
            this.f22994i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f22994i.put("e_r", str);
            this.f22994i.put("e_id", (String) pair2.first);
            if (this.f22989d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(C9454y.m28107a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m28102j(this.f22994i, "e_type", (String) pair.first);
                m28102j(this.f22994i, "e_agent", (String) pair.second);
            }
            this.f22993h.zzf(this.f22994i);
        }
    }

    /* renamed from: i */
    private final synchronized void m28101i() {
        long mo28130a = C4965t.m12565b().mo28130a();
        try {
            Iterator it = this.f22990e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (mo28130a - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f22987b) {
                    break;
                }
                this.f22992g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            C4965t.m12580q().zzw(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    /* renamed from: j */
    private static final void m28102j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public final synchronized String m28103b(String str, zzdwa zzdwaVar) {
        Pair pair = (Pair) this.f22990e.get(str);
        zzdwaVar.zza().put("rid", str);
        if (pair == null) {
            zzdwaVar.zza().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.f22990e.remove(str);
        zzdwaVar.zza().put("mhit", "true");
        return str2;
    }

    /* renamed from: d */
    public final synchronized void m28104d(String str, String str2, zzdwa zzdwaVar) {
        this.f22990e.put(str, new Pair(Long.valueOf(C4965t.m12565b().mo28130a()), str2));
        m28101i();
        m28099g(zzdwaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m28105e(zzdwa zzdwaVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m28100h(zzdwaVar, arrayDeque, "to");
        m28100h(zzdwaVar, arrayDeque2, "of");
    }

    /* renamed from: f */
    public final synchronized void m28106f(String str) {
        this.f22990e.remove(str);
    }
}
