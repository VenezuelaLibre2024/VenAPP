package p283p0;

import android.view.View;
import p209l0.AbstractC9340d;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public abstract class AbstractC10031b extends AbstractC9340d {

    /* renamed from: p0.b$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC10031b {
        @Override // p283p0.AbstractC10031b
        /* renamed from: b */
        public void mo29939b(View view, float f10) {
        }

        /* renamed from: c */
        public void m29940c(View view, float f10, double d10, double d11) {
            view.setRotation(m27830a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* renamed from: b */
    public abstract void mo29939b(View view, float f10);
}
