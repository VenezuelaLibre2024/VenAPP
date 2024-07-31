package androidx.camera.core.impl;

import android.content.Context;

/* loaded from: classes.dex */
public interface l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final l2 f2554a = new a();

    /* loaded from: classes.dex */
    class a implements l2 {
        a() {
        }

        @Override // androidx.camera.core.impl.l2
        public n0 a(b bVar, int i10) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* loaded from: classes.dex */
    public interface c {
        l2 a(Context context);
    }

    n0 a(b bVar, int i10);
}
