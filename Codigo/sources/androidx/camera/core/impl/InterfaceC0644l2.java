package androidx.camera.core.impl;

import android.content.Context;

/* renamed from: androidx.camera.core.impl.l2 */
/* loaded from: classes.dex */
public interface InterfaceC0644l2 {

    /* renamed from: a */
    public static final InterfaceC0644l2 f2893a = new a();

    /* renamed from: androidx.camera.core.impl.l2$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0644l2 {
        a() {
        }

        @Override // androidx.camera.core.impl.InterfaceC0644l2
        /* renamed from: a */
        public InterfaceC0649n0 mo2542a(b bVar, int i10) {
            return null;
        }
    }

    /* renamed from: androidx.camera.core.impl.l2$b */
    /* loaded from: classes.dex */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* renamed from: androidx.camera.core.impl.l2$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC0644l2 mo3180a(Context context);
    }

    /* renamed from: a */
    InterfaceC0649n0 mo2542a(b bVar, int i10);
}
