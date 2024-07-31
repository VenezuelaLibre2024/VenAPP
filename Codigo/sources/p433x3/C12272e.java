package p433x3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129h3.InterfaceC7626j;

/* renamed from: x3.e */
/* loaded from: classes.dex */
public class C12272e {

    /* renamed from: a */
    private final List<String> f32887a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<a<?, ?>>> f32888b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.e$a */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a */
        private final Class<T> f32889a;

        /* renamed from: b */
        final Class<R> f32890b;

        /* renamed from: c */
        final InterfaceC7626j<T, R> f32891c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC7626j<T, R> interfaceC7626j) {
            this.f32889a = cls;
            this.f32890b = cls2;
            this.f32891c = interfaceC7626j;
        }

        /* renamed from: a */
        public boolean m39515a(Class<?> cls, Class<?> cls2) {
            return this.f32889a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f32890b);
        }
    }

    /* renamed from: c */
    private synchronized List<a<?, ?>> m39510c(String str) {
        List<a<?, ?>> list;
        if (!this.f32887a.contains(str)) {
            this.f32887a.add(str);
        }
        list = this.f32888b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f32888b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void m39511a(String str, InterfaceC7626j<T, R> interfaceC7626j, Class<T> cls, Class<R> cls2) {
        m39510c(str).add(new a<>(cls, cls2, interfaceC7626j));
    }

    /* renamed from: b */
    public synchronized <T, R> List<InterfaceC7626j<T, R>> m39512b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f32887a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f32888b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m39515a(cls, cls2)) {
                        arrayList.add(aVar.f32891c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> m39513d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f32887a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f32888b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m39515a(cls, cls2) && !arrayList.contains(aVar.f32890b)) {
                        arrayList.add(aVar.f32890b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m39514e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f32887a);
        this.f32887a.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f32887a.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f32887a.add(str);
            }
        }
    }
}
