package wa;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f29743a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29744b;

    public p(Context context, String str) {
        com.google.android.gms.common.internal.s.j(context);
        this.f29743a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f29744b = a(context);
        } else {
            this.f29744b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(ca.m.f6992a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f29743a.getIdentifier(str, "string", this.f29744b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f29743a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
