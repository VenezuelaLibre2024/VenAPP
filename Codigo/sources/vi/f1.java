package vi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
final class f1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    class a<T> implements Comparator<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f29097a;

        a(b bVar) {
            this.f29097a = bVar;
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            int b10 = this.f29097a.b(t10) - this.f29097a.b(t11);
            return b10 != 0 ? b10 : t10.getClass().getName().compareTo(t11.getClass().getName());
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T> {
        boolean a(T t10);

        int b(T t10);
    }

    private static <T> T a(Class<T> cls, Class<?> cls2) {
        try {
            return (T) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
        }
    }

    static <T> Iterable<T> b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            Object a10 = a(cls, it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static <T> Iterable<T> c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> List<T> e(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, b<T> bVar) {
        Iterable b10 = d(classLoader) ? b(cls, iterable) : c(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (T t10 : b10) {
            if (bVar.a(t10)) {
                arrayList.add(t10);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return Collections.unmodifiableList(arrayList);
    }
}
