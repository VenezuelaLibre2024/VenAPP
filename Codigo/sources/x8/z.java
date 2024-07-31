package x8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    private final p2 f30725a;

    /* renamed from: b */
    private final List f30726b = new ArrayList();

    /* renamed from: c */
    private l f30727c;

    private z(p2 p2Var) {
        this.f30725a = p2Var;
        if (p2Var != null) {
            try {
                List zzj = p2Var.zzj();
                if (zzj != null) {
                    Iterator it = zzj.iterator();
                    while (it.hasNext()) {
                        l i10 = l.i((d5) it.next());
                        if (i10 != null) {
                            this.f30726b.add(i10);
                        }
                    }
                }
            } catch (RemoteException e10) {
                zzcec.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        p2 p2Var2 = this.f30725a;
        if (p2Var2 == null) {
            return;
        }
        try {
            d5 zzf = p2Var2.zzf();
            if (zzf != null) {
                this.f30727c = l.i(zzf);
            }
        } catch (RemoteException e11) {
            zzcec.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
        }
    }

    public static z f(p2 p2Var) {
        if (p2Var != null) {
            return new z(p2Var);
        }
        return null;
    }

    public static z g(p2 p2Var) {
        return new z(p2Var);
    }

    public List<l> a() {
        return this.f30726b;
    }

    public l b() {
        return this.f30727c;
    }

    public String c() {
        try {
            p2 p2Var = this.f30725a;
            if (p2Var != null) {
                return p2Var.zzg();
            }
            return null;
        } catch (RemoteException e10) {
            zzcec.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    public Bundle d() {
        try {
            p2 p2Var = this.f30725a;
            if (p2Var != null) {
                return p2Var.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzh("Could not forward getResponseExtras to ResponseInfo.", e10);
        }
        return new Bundle();
    }

    public String e() {
        try {
            p2 p2Var = this.f30725a;
            if (p2Var != null) {
                return p2Var.zzi();
            }
            return null;
        } catch (RemoteException e10) {
            zzcec.zzh("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    public final p2 h() {
        return this.f30725a;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String e10 = e();
        if (e10 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", e10);
        }
        String c10 = c();
        if (c10 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", c10);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f30726b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((l) it.next()).j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        l lVar = this.f30727c;
        if (lVar != null) {
            jSONObject.put("Loaded Adapter Response", lVar.j());
        }
        Bundle d10 = d();
        if (d10 != null) {
            jSONObject.put("Response Extras", com.google.android.gms.ads.internal.client.x.b().zzh(d10));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return i().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
