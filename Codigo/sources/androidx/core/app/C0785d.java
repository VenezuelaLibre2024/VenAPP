package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public class C0785d {

    /* renamed from: androidx.core.app.d$a */
    /* loaded from: classes.dex */
    private static class a extends C0785d {

        /* renamed from: a */
        private final ActivityOptions f4131a;

        a(ActivityOptions activityOptions) {
            this.f4131a = activityOptions;
        }

        @Override // androidx.core.app.C0785d
        /* renamed from: b */
        public Bundle mo3949b() {
            return this.f4131a.toBundle();
        }
    }

    /* renamed from: androidx.core.app.d$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static ActivityOptions m3950a(Context context, int i10, int i11) {
            return ActivityOptions.makeCustomAnimation(context, i10, i11);
        }

        /* renamed from: b */
        static ActivityOptions m3951b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13);
        }

        /* renamed from: c */
        static ActivityOptions m3952c(View view, Bitmap bitmap, int i10, int i11) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11);
        }
    }

    protected C0785d() {
    }

    /* renamed from: a */
    public static C0785d m3948a(Context context, int i10, int i11) {
        return new a(b.m3950a(context, i10, i11));
    }

    /* renamed from: b */
    public Bundle mo3949b() {
        throw null;
    }
}
