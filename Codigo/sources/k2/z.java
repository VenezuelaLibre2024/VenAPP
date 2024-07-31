package k2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface z {

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(z zVar, String id2, Set<String> tags) {
            kotlin.jvm.internal.n.e(id2, "id");
            kotlin.jvm.internal.n.e(tags, "tags");
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                zVar.b(new y((String) it.next(), id2));
            }
        }
    }

    List<String> a(String str);

    void b(y yVar);

    void c(String str, Set<String> set);
}
