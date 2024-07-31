package i2;

import f2.j;
import f2.k;
import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class f extends c<h2.b> {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16884f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f16885g;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    static {
        String i10 = j.i("NetworkNotRoamingCtrlr");
        n.d(i10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f16885g = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j2.h<h2.b> tracker) {
        super(tracker);
        n.e(tracker, "tracker");
    }

    @Override // i2.c
    public boolean b(u workSpec) {
        n.e(workSpec, "workSpec");
        return workSpec.f20232j.d() == k.NOT_ROAMING;
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b value) {
        n.e(value, "value");
        return (value.a() && value.c()) ? false : true;
    }
}
