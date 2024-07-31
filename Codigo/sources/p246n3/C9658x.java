package p246n3;

import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p246n3.InterfaceC9649o;

/* renamed from: n3.x */
/* loaded from: classes.dex */
public class C9658x<Model> implements InterfaceC9649o<Model, Model> {

    /* renamed from: a */
    private static final C9658x<?> f23717a = new C9658x<>();

    /* renamed from: n3.x$a */
    /* loaded from: classes.dex */
    public static class a<Model> implements InterfaceC9650p<Model, Model> {

        /* renamed from: a */
        private static final a<?> f23718a = new a<>();

        @Deprecated
        public a() {
        }

        /* renamed from: a */
        public static <T> a<T> m28950a() {
            return (a<T>) f23718a;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Model, Model> mo28852d(C9653s c9653s) {
            return C9658x.m28949c();
        }
    }

    /* renamed from: n3.x$b */
    /* loaded from: classes.dex */
    private static class b<Model> implements InterfaceC2133d<Model> {

        /* renamed from: a */
        private final Model f23719a;

        b(Model model) {
            this.f23719a = model;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<Model> mo10760a() {
            return (Class<Model>) this.f23719a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return EnumC7617a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super Model> aVar) {
            aVar.mo10774f(this.f23719a);
        }
    }

    @Deprecated
    public C9658x() {
    }

    /* renamed from: c */
    public static <T> C9658x<T> m28949c() {
        return (C9658x<T>) f23717a;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: a */
    public boolean mo28847a(Model model) {
        return true;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: b */
    public InterfaceC9649o.a<Model> mo28848b(Model model, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(model), new b(model));
    }
}
