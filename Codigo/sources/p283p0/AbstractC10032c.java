package p283p0;

import android.view.View;
import p209l0.AbstractC9341e;

/* renamed from: p0.c */
/* loaded from: classes.dex */
public abstract class AbstractC10032c extends AbstractC9341e {

    /* renamed from: p0.c$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC10032c {
        @Override // p283p0.AbstractC10032c
        /* renamed from: b */
        public void mo29941b(View view, float f10) {
        }

        /* renamed from: c */
        public void m29942c(View view, float f10, double d10, double d11) {
            view.setRotation(m27832a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* renamed from: b */
    public abstract void mo29941b(View view, float f10);
}
