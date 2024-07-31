package uh;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27698a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f27699b;

    private b() {
    }

    public final void a(Context context) {
        n.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
        n.d(sharedPreferences, "getSharedPreferences(...)");
        f27699b = sharedPreferences;
    }
}
