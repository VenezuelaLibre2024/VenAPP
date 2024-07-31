package p369u;

import androidx.camera.camera2.internal.compat.C0434h;
import androidx.camera.camera2.internal.compat.C0455r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p389v.C11598h;
import p407w.C12029o0;
import p407w.InterfaceC12028o;
import p429x.InterfaceC12249a;

/* renamed from: u.a */
/* loaded from: classes.dex */
public class C11293a implements InterfaceC12249a {

    /* renamed from: a */
    private final C0455r0 f29295a;

    /* renamed from: f */
    private int f29300f = 0;

    /* renamed from: c */
    private final Map<String, List<String>> f29297c = new HashMap();

    /* renamed from: e */
    private Set<Set<String>> f29299e = new HashSet();

    /* renamed from: b */
    private final List<InterfaceC12249a.a> f29296b = new ArrayList();

    /* renamed from: d */
    private List<InterfaceC12028o> f29298d = new ArrayList();

    public C11293a(C0455r0 c0455r0) {
        this.f29295a = c0455r0;
        m35287e();
    }

    /* renamed from: e */
    private void m35287e() {
        try {
            this.f29299e = this.f29295a.m2278e();
        } catch (C0434h unused) {
            C12029o0.m38640c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = this.f29299e.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                if (!this.f29297c.containsKey(str)) {
                    this.f29297c.put(str, new ArrayList());
                }
                if (!this.f29297c.containsKey(str2)) {
                    this.f29297c.put(str2, new ArrayList());
                }
                this.f29297c.get(str).add((String) arrayList.get(1));
                this.f29297c.get(str2).add((String) arrayList.get(0));
            }
        }
    }

    @Override // p429x.InterfaceC12249a
    /* renamed from: a */
    public String mo35288a(String str) {
        if (!this.f29297c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f29297c.get(str)) {
            Iterator<InterfaceC12028o> it = this.f29298d.iterator();
            while (it.hasNext()) {
                if (str2.equals(C11598h.m36364a(it.next()).m36365b())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // p429x.InterfaceC12249a
    /* renamed from: b */
    public int mo35289b() {
        return this.f29300f;
    }

    @Override // p429x.InterfaceC12249a
    /* renamed from: c */
    public void mo35290c(int i10) {
        if (i10 != this.f29300f) {
            Iterator<InterfaceC12249a.a> it = this.f29296b.iterator();
            while (it.hasNext()) {
                it.next().mo3090a(this.f29300f, i10);
            }
        }
        if (this.f29300f == 2 && i10 != 2) {
            this.f29298d.clear();
        }
        this.f29300f = i10;
    }

    @Override // p429x.InterfaceC12249a
    /* renamed from: d */
    public void mo35291d(InterfaceC12249a.a aVar) {
        this.f29296b.add(aVar);
    }
}
