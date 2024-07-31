package f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class f extends f.a<Intent, androidx.activity.result.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14842a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // f.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        n.e(context, "context");
        n.e(input, "input");
        return input;
    }

    @Override // f.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
