package p418wa;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import ca.C1916m;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: wa.p */
/* loaded from: classes2.dex */
public final class C12118p {

    /* renamed from: a */
    private final Resources f32208a;

    /* renamed from: b */
    private final String f32209b;

    public C12118p(Context context, String str) {
        C5276s.m13324j(context);
        this.f32208a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f32209b = m38852a(context);
        } else {
            this.f32209b = str;
        }
    }

    /* renamed from: a */
    public static String m38852a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C1916m.f7941a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public final String m38853b(String str) {
        int identifier = this.f32208a.getIdentifier(str, "string", this.f32209b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f32208a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
