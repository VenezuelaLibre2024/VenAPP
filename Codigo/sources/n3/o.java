package n3;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface o<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final h3.f f21748a;

        /* renamed from: b, reason: collision with root package name */
        public final List<h3.f> f21749b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f21750c;

        public a(h3.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(h3.f fVar, List<h3.f> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f21748a = (h3.f) c4.k.d(fVar);
            this.f21749b = (List) c4.k.d(list);
            this.f21750c = (com.bumptech.glide.load.data.d) c4.k.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, h3.h hVar);
}
