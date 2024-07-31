package ac;

import android.content.Context;
import cc.InterfaceC1940a;
import ee.InterfaceC7183b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ac.c */
/* loaded from: classes.dex */
public class C0097c {

    /* renamed from: a */
    private final InterfaceC7183b<InterfaceC1940a> f361a;

    /* renamed from: b */
    private final String f362b;

    /* renamed from: c */
    private Integer f363c = null;

    public C0097c(Context context, InterfaceC7183b<InterfaceC1940a> interfaceC7183b, String str) {
        this.f361a = interfaceC7183b;
        this.f362b = str;
    }

    /* renamed from: a */
    private void m392a(InterfaceC1940a.c cVar) {
        this.f361a.get().mo10152g(cVar);
    }

    /* renamed from: b */
    private void m393b(List<C0096b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(m396f());
        int m399i = m399i();
        for (C0096b c0096b : list) {
            while (arrayDeque.size() >= m399i) {
                m400k(((InterfaceC1940a.c) arrayDeque.pollFirst()).f7973b);
            }
            InterfaceC1940a.c m390f = c0096b.m390f(this.f362b);
            m392a(m390f);
            arrayDeque.offer(m390f);
        }
    }

    /* renamed from: c */
    private static List<C0096b> m394c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0096b.m384b(it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private boolean m395d(List<C0096b> list, C0096b c0096b) {
        String m387c = c0096b.m387c();
        String m389e = c0096b.m389e();
        for (C0096b c0096b2 : list) {
            if (c0096b2.m387c().equals(m387c) && c0096b2.m389e().equals(m389e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private List<InterfaceC1940a.c> m396f() {
        return this.f361a.get().mo10151f(this.f362b, "");
    }

    /* renamed from: g */
    private ArrayList<C0096b> m397g(List<C0096b> list, List<C0096b> list2) {
        ArrayList<C0096b> arrayList = new ArrayList<>();
        for (C0096b c0096b : list) {
            if (!m395d(list2, c0096b)) {
                arrayList.add(c0096b);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private ArrayList<InterfaceC1940a.c> m398h(List<C0096b> list, List<C0096b> list2) {
        ArrayList<InterfaceC1940a.c> arrayList = new ArrayList<>();
        for (C0096b c0096b : list) {
            if (!m395d(list2, c0096b)) {
                arrayList.add(c0096b.m390f(this.f362b));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private int m399i() {
        if (this.f363c == null) {
            this.f363c = Integer.valueOf(this.f361a.get().mo10150e(this.f362b));
        }
        return this.f363c.intValue();
    }

    /* renamed from: k */
    private void m400k(String str) {
        this.f361a.get().clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: l */
    private void m401l(Collection<InterfaceC1940a.c> collection) {
        Iterator<InterfaceC1940a.c> it = collection.iterator();
        while (it.hasNext()) {
            m400k(it.next().f7973b);
        }
    }

    /* renamed from: n */
    private void m402n(List<C0096b> list) {
        if (list.isEmpty()) {
            m405j();
            return;
        }
        List<C0096b> m404e = m404e();
        m401l(m398h(m404e, list));
        m393b(m397g(list, m404e));
    }

    /* renamed from: p */
    private void m403p() {
        if (this.f361a.get() == null) {
            throw new C0095a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    /* renamed from: e */
    public List<C0096b> m404e() {
        m403p();
        List<InterfaceC1940a.c> m396f = m396f();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1940a.c> it = m396f.iterator();
        while (it.hasNext()) {
            arrayList.add(C0096b.m383a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m405j() {
        m403p();
        m401l(m396f());
    }

    /* renamed from: m */
    public void m406m(List<Map<String, String>> list) {
        m403p();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        m402n(m394c(list));
    }

    /* renamed from: o */
    public void m407o(C0096b c0096b) {
        m403p();
        C0096b.m385h(c0096b);
        ArrayList arrayList = new ArrayList();
        Map<String, String> m391g = c0096b.m391g();
        m391g.remove("triggerEvent");
        arrayList.add(C0096b.m384b(m391g));
        m393b(arrayList);
    }
}
