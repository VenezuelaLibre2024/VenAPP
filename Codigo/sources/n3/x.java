package n3;

import com.bumptech.glide.load.data.d;
import n3.o;

/* loaded from: classes.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final x<?> f21784a = new x<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f21785a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f21785a;
        }

        @Override // n3.p
        public o<Model, Model> d(s sVar) {
            return x.c();
        }
    }

    /* loaded from: classes.dex */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a, reason: collision with root package name */
        private final Model f21786a;

        b(Model model) {
            this.f21786a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f21786a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.f(this.f21786a);
        }
    }

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) f21784a;
    }

    @Override // n3.o
    public boolean a(Model model) {
        return true;
    }

    @Override // n3.o
    public o.a<Model> b(Model model, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(model), new b(model));
    }
}
