package i2;

import android.os.Build;
import f2.j;
import f2.k;
import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e extends c<h2.b> {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16882f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f16883g;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    static {
        String i10 = j.i("NetworkMeteredCtrlr");
        n.d(i10, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f16883g = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j2.h<h2.b> tracker) {
        super(tracker);
        n.e(tracker, "tracker");
    }

    @Override // i2.c
    public boolean b(u workSpec) {
        n.e(workSpec, "workSpec");
        return workSpec.f20232j.d() == k.METERED;
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b value) {
        n.e(value, "value");
        if (Build.VERSION.SDK_INT < 26) {
            j.e().a(f16883g, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (value.a()) {
                return false;
            }
        } else if (value.a() && value.b()) {
            return false;
        }
        return true;
    }
}
