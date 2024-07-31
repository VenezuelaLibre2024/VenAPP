package p294pc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.p */
/* loaded from: classes.dex */
public class C10149p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pc.p$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final C10132c<?> f24947a;

        /* renamed from: b */
        private final Set<b> f24948b = new HashSet();

        /* renamed from: c */
        private final Set<b> f24949c = new HashSet();

        b(C10132c<?> c10132c) {
            this.f24947a = c10132c;
        }

        /* renamed from: a */
        void m30341a(b bVar) {
            this.f24948b.add(bVar);
        }

        /* renamed from: b */
        void m30342b(b bVar) {
            this.f24949c.add(bVar);
        }

        /* renamed from: c */
        C10132c<?> m30343c() {
            return this.f24947a;
        }

        /* renamed from: d */
        Set<b> m30344d() {
            return this.f24948b;
        }

        /* renamed from: e */
        boolean m30345e() {
            return this.f24948b.isEmpty();
        }

        /* renamed from: f */
        boolean m30346f() {
            return this.f24949c.isEmpty();
        }

        /* renamed from: g */
        void m30347g(b bVar) {
            this.f24949c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pc.p$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final C10137e0<?> f24950a;

        /* renamed from: b */
        private final boolean f24951b;

        private c(C10137e0<?> c10137e0, boolean z10) {
            this.f24950a = c10137e0;
            this.f24951b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f24950a.equals(this.f24950a) && cVar.f24951b == this.f24951b;
        }

        public int hashCode() {
            return ((this.f24950a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f24951b).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m30338a(List<C10132c<?>> list) {
        Set<b> m30340c = m30340c(list);
        Set<b> m30339b = m30339b(m30340c);
        int i10 = 0;
        while (!m30339b.isEmpty()) {
            b next = m30339b.iterator().next();
            m30339b.remove(next);
            i10++;
            for (b bVar : next.m30344d()) {
                bVar.m30347g(next);
                if (bVar.m30346f()) {
                    m30339b.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : m30340c) {
            if (!bVar2.m30346f() && !bVar2.m30345e()) {
                arrayList.add(bVar2.m30343c());
            }
        }
        throw new C10151r(arrayList);
    }

    /* renamed from: b */
    private static Set<b> m30339b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m30346f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<b> m30340c(List<C10132c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C10132c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C10150q c10150q : bVar.m30343c().m30266g()) {
                            if (c10150q.m30360e() && (set = (Set) hashMap.get(new c(c10150q.m30358c(), c10150q.m30362g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m30341a(bVar2);
                                    bVar2.m30342b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C10132c<?> next = it.next();
            b bVar3 = new b(next);
            for (C10137e0<? super Object> c10137e0 : next.m30269j()) {
                c cVar = new c(c10137e0, !next.m30273p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f24951b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c10137e0));
                }
                set2.add(bVar3);
            }
        }
    }
}
