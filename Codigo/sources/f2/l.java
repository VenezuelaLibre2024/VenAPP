package f2;

import androidx.work.OverwritingInputMerger;
import f2.u;

/* loaded from: classes.dex */
public final class l extends u {

    /* renamed from: e, reason: collision with root package name */
    public static final b f14890e = new b(null);

    /* loaded from: classes.dex */
    public static final class a extends u.a<a, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.c> workerClass) {
            super(workerClass);
            kotlin.jvm.internal.n.e(workerClass, "workerClass");
            h().f20226d = OverwritingInputMerger.class.getName();
        }

        @Override // f2.u.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public l c() {
            if ((d() && h().f20232j.h()) ? false : true) {
                return new l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // f2.u.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final l a(Class<? extends androidx.work.c> workerClass) {
            kotlin.jvm.internal.n.e(workerClass, "workerClass");
            return new a(workerClass).b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a builder) {
        super(builder.e(), builder.h(), builder.f());
        kotlin.jvm.internal.n.e(builder, "builder");
    }

    public static final l e(Class<? extends androidx.work.c> cls) {
        return f14890e.a(cls);
    }
}
