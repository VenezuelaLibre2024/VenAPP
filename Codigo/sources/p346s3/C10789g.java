package p346s3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.C0245d;
import androidx.core.content.C0854a;
import androidx.core.content.res.C0871f;
import p125h.C7605a;

/* renamed from: s3.g */
/* loaded from: classes.dex */
public final class C10789g {

    /* renamed from: a */
    private static volatile boolean f27243a = true;

    /* renamed from: a */
    public static Drawable m32875a(Context context, int i10, Resources.Theme theme) {
        return m32877c(context, context, i10, theme);
    }

    /* renamed from: b */
    public static Drawable m32876b(Context context, Context context2, int i10) {
        return m32877c(context, context2, i10, null);
    }

    /* renamed from: c */
    private static Drawable m32877c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f27243a) {
                return m32879e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return C0854a.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f27243a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m32878d(context2, i10, theme);
    }

    /* renamed from: d */
    private static Drawable m32878d(Context context, int i10, Resources.Theme theme) {
        return C0871f.m4453d(context.getResources(), i10, theme);
    }

    /* renamed from: e */
    private static Drawable m32879e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            C0245d c0245d = new C0245d(context, theme);
            c0245d.m1184a(theme.getResources().getConfiguration());
            context = c0245d;
        }
        return C7605a.m23112b(context, i10);
    }
}
