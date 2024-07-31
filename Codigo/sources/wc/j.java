package wc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f29873a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f29874b;

    public j(int i10) {
        this.f29874b = i10;
    }

    public List<f0.e.d.AbstractC0519e> a() {
        List<i> b10 = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10.size(); i10++) {
            arrayList.add(b10.get(i10).h());
        }
        return arrayList;
    }

    public synchronized List<i> b() {
        return Collections.unmodifiableList(new ArrayList(this.f29873a));
    }

    public synchronized boolean c(List<i> list) {
        this.f29873a.clear();
        if (list.size() <= this.f29874b) {
            return this.f29873a.addAll(list);
        }
        sc.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f29874b);
        return this.f29873a.addAll(list.subList(0, this.f29874b));
    }
}
