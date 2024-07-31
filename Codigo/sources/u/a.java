package u;

import androidx.camera.camera2.internal.compat.h;
import androidx.camera.camera2.internal.compat.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.o;
import w.o0;
import x.a;

/* loaded from: classes.dex */
public class a implements x.a {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f26993a;

    /* renamed from: f, reason: collision with root package name */
    private int f26998f = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f26995c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private Set<Set<String>> f26997e = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final List<a.InterfaceC0488a> f26994b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<o> f26996d = new ArrayList();

    public a(r0 r0Var) {
        this.f26993a = r0Var;
        e();
    }

    private void e() {
        try {
            this.f26997e = this.f26993a.e();
        } catch (h unused) {
            o0.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = this.f26997e.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                if (!this.f26995c.containsKey(str)) {
                    this.f26995c.put(str, new ArrayList());
                }
                if (!this.f26995c.containsKey(str2)) {
                    this.f26995c.put(str2, new ArrayList());
                }
                this.f26995c.get(str).add((String) arrayList.get(1));
                this.f26995c.get(str2).add((String) arrayList.get(0));
            }
        }
    }

    @Override // x.a
    public String a(String str) {
        if (!this.f26995c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f26995c.get(str)) {
            Iterator<o> it = this.f26996d.iterator();
            while (it.hasNext()) {
                if (str2.equals(v.h.a(it.next()).b())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // x.a
    public int b() {
        return this.f26998f;
    }

    @Override // x.a
    public void c(int i10) {
        if (i10 != this.f26998f) {
            Iterator<a.InterfaceC0488a> it = this.f26994b.iterator();
            while (it.hasNext()) {
                it.next().a(this.f26998f, i10);
            }
        }
        if (this.f26998f == 2 && i10 != 2) {
            this.f26996d.clear();
        }
        this.f26998f = i10;
    }

    @Override // x.a
    public void d(a.InterfaceC0488a interfaceC0488a) {
        this.f26994b.add(interfaceC0488a);
    }
}
