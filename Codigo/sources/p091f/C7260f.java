package p091f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0208a;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: f.f */
/* loaded from: classes.dex */
public final class C7260f extends AbstractC7255a<Intent, C0208a> {

    /* renamed from: a */
    public static final a f16265a = new a(null);

    /* renamed from: f.f$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo7118a(Context context, Intent input) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        return input;
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0208a mo7119c(int i10, Intent intent) {
        return new C0208a(i10, intent);
    }
}
