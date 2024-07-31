package ac;

import android.content.Context;
import cc.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ee.b<cc.a> f310a;

    /* renamed from: b, reason: collision with root package name */
    private final String f311b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f312c = null;

    public c(Context context, ee.b<cc.a> bVar, String str) {
        this.f310a = bVar;
        this.f311b = str;
    }

    private void a(a.c cVar) {
        this.f310a.get().g(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        for (b bVar : list) {
            while (arrayDeque.size() >= i10) {
                k(((a.c) arrayDeque.pollFirst()).f7021b);
            }
            a.c f10 = bVar.f(this.f311b);
            a(f10);
            arrayDeque.offer(f10);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<b> list, b bVar) {
        String c10 = bVar.c();
        String e10 = bVar.e();
        for (b bVar2 : list) {
            if (bVar2.c().equals(c10) && bVar2.e().equals(e10)) {
                return true;
            }
        }
        return false;
    }

    private List<a.c> f() {
        return this.f310a.get().f(this.f311b, "");
    }

    private ArrayList<b> g(List<b> list, List<b> list2) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!d(list2, bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<b> list, List<b> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!d(list2, bVar)) {
                arrayList.add(bVar.f(this.f311b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f312c == null) {
            this.f312c = Integer.valueOf(this.f310a.get().e(this.f311b));
        }
        return this.f312c.intValue();
    }

    private void k(String str) {
        this.f310a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f7021b);
        }
    }

    private void n(List<b> list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<b> e10 = e();
        l(h(e10, list));
        b(g(list, e10));
    }

    private void p() {
        if (this.f310a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List<b> e() {
        p();
        List<a.c> f10 = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = f10.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a(it.next()));
        }
        return arrayList;
    }

    public void j() {
        p();
        l(f());
    }

    public void m(List<Map<String, String>> list) {
        p();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }

    public void o(b bVar) {
        p();
        b.h(bVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> g10 = bVar.g();
        g10.remove("triggerEvent");
        arrayList.add(b.b(g10));
        b(arrayList);
    }
}
