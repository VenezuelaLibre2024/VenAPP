package p385uh;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C9322n;

/* renamed from: uh.b */
/* loaded from: classes3.dex */
public final class C11561b {

    /* renamed from: a */
    public static final C11561b f30021a = new C11561b();

    /* renamed from: b */
    private static SharedPreferences f30022b;

    private C11561b() {
    }

    /* renamed from: a */
    public final void m36236a(Context context) {
        C9322n.m27781e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
        C9322n.m27780d(sharedPreferences, "getSharedPreferences(...)");
        f30022b = sharedPreferences;
    }
}
