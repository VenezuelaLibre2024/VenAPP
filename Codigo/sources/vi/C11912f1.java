package vi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: vi.f1 */
/* loaded from: classes3.dex */
final class C11912f1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: vi.f1$a */
    /* loaded from: classes3.dex */
    class a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ b f31531a;

        a(b bVar) {
            this.f31531a = bVar;
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            int mo38063b = this.f31531a.mo38063b(t10) - this.f31531a.mo38063b(t11);
            return mo38063b != 0 ? mo38063b : t10.getClass().getName().compareTo(t11.getClass().getName());
        }
    }

    /* renamed from: vi.f1$b */
    /* loaded from: classes3.dex */
    public interface b<T> {
        /* renamed from: a */
        boolean mo38062a(T t10);

        /* renamed from: b */
        int mo38063b(T t10);
    }

    /* renamed from: a */
    private static <T> T m38124a(Class<T> cls, Class<?> cls2) {
        try {
            return (T) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
        }
    }

    /* renamed from: b */
    static <T> Iterable<T> m38125b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            Object m38124a = m38124a(cls, it.next());
            if (m38124a != null) {
                arrayList.add(m38124a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> Iterable<T> m38126c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m38127d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static <T> List<T> m38128e(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, b<T> bVar) {
        Iterable m38125b = m38127d(classLoader) ? m38125b(cls, iterable) : m38126c(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (T t10 : m38125b) {
            if (bVar.mo38062a(t10)) {
                arrayList.add(t10);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return Collections.unmodifiableList(arrayList);
    }
}
