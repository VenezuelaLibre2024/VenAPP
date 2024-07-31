package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    private static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityOptions f3480a;

        a(ActivityOptions activityOptions) {
            this.f3480a = activityOptions;
        }

        @Override // androidx.core.app.d
        public Bundle b() {
            return this.f3480a.toBundle();
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static ActivityOptions a(Context context, int i10, int i11) {
            return ActivityOptions.makeCustomAnimation(context, i10, i11);
        }

        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13);
        }

        static ActivityOptions c(View view, Bitmap bitmap, int i10, int i11) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11);
        }
    }

    protected d() {
    }

    public static d a(Context context, int i10, int i11) {
        return new a(b.a(context, i10, i11));
    }

    public Bundle b() {
        throw null;
    }
}
