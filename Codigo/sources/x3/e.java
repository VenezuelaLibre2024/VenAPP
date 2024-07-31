package x3;

import h3.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f30375a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f30376b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f30377a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f30378b;

        /* renamed from: c, reason: collision with root package name */
        final j<T, R> f30379c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f30377a = cls;
            this.f30378b = cls2;
            this.f30379c = jVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f30377a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f30378b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        if (!this.f30375a.contains(str)) {
            this.f30375a.add(str);
        }
        list = this.f30376b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f30376b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(String str, j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, jVar));
    }

    public synchronized <T, R> List<j<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f30375a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f30376b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f30379c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f30375a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f30376b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f30378b)) {
                        arrayList.add(aVar.f30378b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f30375a);
        this.f30375a.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f30375a.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f30375a.add(str);
            }
        }
    }
}
