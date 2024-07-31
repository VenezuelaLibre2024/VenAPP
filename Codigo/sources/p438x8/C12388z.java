package p438x8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C4810d5;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.ads.internal.client.InterfaceC4885p2;
import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x8.z */
/* loaded from: classes.dex */
public final class C12388z {

    /* renamed from: a */
    private final InterfaceC4885p2 f33245a;

    /* renamed from: b */
    private final List f33246b = new ArrayList();

    /* renamed from: c */
    private C12373l f33247c;

    private C12388z(InterfaceC4885p2 interfaceC4885p2) {
        this.f33245a = interfaceC4885p2;
        if (interfaceC4885p2 != null) {
            try {
                List zzj = interfaceC4885p2.zzj();
                if (zzj != null) {
                    Iterator it = zzj.iterator();
                    while (it.hasNext()) {
                        C12373l m40019i = C12373l.m40019i((C4810d5) it.next());
                        if (m40019i != null) {
                            this.f33246b.add(m40019i);
                        }
                    }
                }
            } catch (RemoteException e10) {
                zzcec.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        InterfaceC4885p2 interfaceC4885p22 = this.f33245a;
        if (interfaceC4885p22 == null) {
            return;
        }
        try {
            C4810d5 zzf = interfaceC4885p22.zzf();
            if (zzf != null) {
                this.f33247c = C12373l.m40019i(zzf);
            }
        } catch (RemoteException e11) {
            zzcec.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
        }
    }

    /* renamed from: f */
    public static C12388z m40046f(InterfaceC4885p2 interfaceC4885p2) {
        if (interfaceC4885p2 != null) {
            return new C12388z(interfaceC4885p2);
        }
        return null;
    }

    /* renamed from: g */
    public static C12388z m40047g(InterfaceC4885p2 interfaceC4885p2) {
        return new C12388z(interfaceC4885p2);
    }

    /* renamed from: a */
    public List<C12373l> m40048a() {
        return this.f33246b;
    }

    /* renamed from: b */
    public C12373l m40049b() {
        return this.f33247c;
    }

    /* renamed from: c */
    public String m40050c() {
        try {
            InterfaceC4885p2 interfaceC4885p2 = this.f33245a;
            if (interfaceC4885p2 != null) {
                return interfaceC4885p2.zzg();
            }
            return null;
        } catch (RemoteException e10) {
            zzcec.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    /* renamed from: d */
    public Bundle m40051d() {
        try {
            InterfaceC4885p2 interfaceC4885p2 = this.f33245a;
            if (interfaceC4885p2 != null) {
                return interfaceC4885p2.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzh("Could not forward getResponseExtras to ResponseInfo.", e10);
        }
        return new Bundle();
    }

    /* renamed from: e */
    public String m40052e() {
        try {
            InterfaceC4885p2 interfaceC4885p2 = this.f33245a;
            if (interfaceC4885p2 != null) {
                return interfaceC4885p2.zzi();
            }
            return null;
        } catch (RemoteException e10) {
            zzcec.zzh("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    /* renamed from: h */
    public final InterfaceC4885p2 m40053h() {
        return this.f33245a;
    }

    /* renamed from: i */
    public final JSONObject m40054i() {
        JSONObject jSONObject = new JSONObject();
        String m40052e = m40052e();
        if (m40052e == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", m40052e);
        }
        String m40050c = m40050c();
        if (m40050c == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", m40050c);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f33246b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C12373l) it.next()).m40028j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        C12373l c12373l = this.f33247c;
        if (c12373l != null) {
            jSONObject.put("Loaded Adapter Response", c12373l.m40028j());
        }
        Bundle m40051d = m40051d();
        if (m40051d != null) {
            jSONObject.put("Response Extras", C4930x.m12474b().zzh(m40051d));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return m40054i().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
