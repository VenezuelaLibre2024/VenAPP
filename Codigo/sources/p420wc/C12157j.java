package p420wc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p442xc.AbstractC12426f0;
import sc.C10889g;

/* renamed from: wc.j */
/* loaded from: classes.dex */
public class C12157j {

    /* renamed from: a */
    private final List<AbstractC12156i> f32338a = new ArrayList();

    /* renamed from: b */
    private final int f32339b;

    public C12157j(int i10) {
        this.f32339b = i10;
    }

    /* renamed from: a */
    public List<AbstractC12426f0.e.d.AbstractC13287e> m38990a() {
        List<AbstractC12156i> m38991b = m38991b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < m38991b.size(); i10++) {
            arrayList.add(m38991b.get(i10).m38989h());
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized List<AbstractC12156i> m38991b() {
        return Collections.unmodifiableList(new ArrayList(this.f32338a));
    }

    /* renamed from: c */
    public synchronized boolean m38992c(List<AbstractC12156i> list) {
        this.f32338a.clear();
        if (list.size() <= this.f32339b) {
            return this.f32338a.addAll(list);
        }
        C10889g.m33216f().m33225k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f32339b);
        return this.f32338a.addAll(list.subList(0, this.f32339b));
    }
}
