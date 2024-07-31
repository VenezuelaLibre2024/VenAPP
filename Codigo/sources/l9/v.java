package l9;

import android.text.TextUtils;
import android.util.Pair;
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

/* loaded from: classes.dex */
public final class v {

    /* renamed from: h, reason: collision with root package name */
    private final zzdwk f21140h;

    /* renamed from: i, reason: collision with root package name */
    private Map f21141i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f21138f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f21139g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f21133a = ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzgY)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f21134b = ((Long) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzgZ)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21135c = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhe)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21136d = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhc)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f21137e = Collections.synchronizedMap(new u(this));

    public v(zzdwk zzdwkVar) {
        this.f21140h = zzdwkVar;
    }

    private final synchronized void g(final zzdwa zzdwaVar) {
        if (this.f21135c) {
            ArrayDeque arrayDeque = this.f21139g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f21138f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcep.zza.execute(new Runnable() { // from class: l9.b
                @Override // java.lang.Runnable
                public final void run() {
                    v.this.e(zzdwaVar, clone, clone2);
                }
            });
        }
    }

    private final void h(zzdwa zzdwaVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdwaVar.zza());
            this.f21141i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f21141i.put("e_r", str);
            this.f21141i.put("e_id", (String) pair2.first);
            if (this.f21136d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(y.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                j(this.f21141i, "e_type", (String) pair.first);
                j(this.f21141i, "e_agent", (String) pair.second);
            }
            this.f21140h.zzf(this.f21141i);
        }
    }

    private final synchronized void i() {
        long a10 = com.google.android.gms.ads.internal.t.b().a();
        try {
            Iterator it = this.f21137e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a10 - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f21134b) {
                    break;
                }
                this.f21139g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.t.q().zzw(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String b(String str, zzdwa zzdwaVar) {
        Pair pair = (Pair) this.f21137e.get(str);
        zzdwaVar.zza().put("rid", str);
        if (pair == null) {
            zzdwaVar.zza().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.f21137e.remove(str);
        zzdwaVar.zza().put("mhit", "true");
        return str2;
    }

    public final synchronized void d(String str, String str2, zzdwa zzdwaVar) {
        this.f21137e.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.t.b().a()), str2));
        i();
        g(zzdwaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzdwa zzdwaVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        h(zzdwaVar, arrayDeque, "to");
        h(zzdwaVar, arrayDeque2, "of");
    }

    public final synchronized void f(String str) {
        this.f21137e.remove(str);
    }
}
