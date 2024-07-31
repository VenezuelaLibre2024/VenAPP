package p094f2;

import androidx.work.AbstractC1523c;
import androidx.work.OverwritingInputMerger;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7288u;

/* renamed from: f2.l */
/* loaded from: classes.dex */
public final class C7279l extends AbstractC7288u {

    /* renamed from: e */
    public static final b f16313e = new b(null);

    /* renamed from: f2.l$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC7288u.a<a, C7279l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends AbstractC1523c> workerClass) {
            super(workerClass);
            C9322n.m27781e(workerClass, "workerClass");
            m21807h().f22008d = OverwritingInputMerger.class.getName();
        }

        @Override // p094f2.AbstractC7288u.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7279l mo21781c() {
            if ((m21804d() && m21807h().f22014j.m21748h()) ? false : true) {
                return new C7279l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // p094f2.AbstractC7288u.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a mo21782g() {
            return this;
        }
    }

    /* renamed from: f2.l$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C7279l m21785a(Class<? extends AbstractC1523c> workerClass) {
            C9322n.m27781e(workerClass, "workerClass");
            return new a(workerClass).m21803b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7279l(a builder) {
        super(builder.m21805e(), builder.m21807h(), builder.m21806f());
        C9322n.m27781e(builder, "builder");
    }

    /* renamed from: e */
    public static final C7279l m21780e(Class<? extends AbstractC1523c> cls) {
        return f16313e.m21785a(cls);
    }
}
