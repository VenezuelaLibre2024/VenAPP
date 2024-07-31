package w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b */
    public static final p f29526b = new a().d(0).b();

    /* renamed from: c */
    public static final p f29527c = new a().d(1).b();

    /* renamed from: a */
    private LinkedHashSet<n> f29528a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final LinkedHashSet<n> f29529a;

        public a() {
            this.f29529a = new LinkedHashSet<>();
        }

        private a(LinkedHashSet<n> linkedHashSet) {
            this.f29529a = new LinkedHashSet<>(linkedHashSet);
        }

        public static a c(p pVar) {
            return new a(pVar.c());
        }

        public a a(n nVar) {
            this.f29529a.add(nVar);
            return this;
        }

        public p b() {
            return new p(this.f29529a);
        }

        public a d(int i10) {
            androidx.core.util.h.n(i10 != -1, "The specified lens facing is invalid.");
            this.f29529a.add(new androidx.camera.core.impl.i1(i10));
            return this;
        }
    }

    p(LinkedHashSet<n> linkedHashSet) {
        this.f29528a = linkedHashSet;
    }

    public LinkedHashSet<androidx.camera.core.impl.c0> a(LinkedHashSet<androidx.camera.core.impl.c0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.c0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        List<o> b10 = b(arrayList);
        LinkedHashSet<androidx.camera.core.impl.c0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<androidx.camera.core.impl.c0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.c0 next = it2.next();
            if (b10.contains(next.b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<o> b(List<o> list) {
        List<o> arrayList = new ArrayList<>(list);
        Iterator<n> it = this.f29528a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<n> c() {
        return this.f29528a;
    }

    public Integer d() {
        Iterator<n> it = this.f29528a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            n next = it.next();
            if (next instanceof androidx.camera.core.impl.i1) {
                Integer valueOf = Integer.valueOf(((androidx.camera.core.impl.i1) next).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public androidx.camera.core.impl.c0 e(LinkedHashSet<androidx.camera.core.impl.c0> linkedHashSet) {
        Iterator<androidx.camera.core.impl.c0> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
