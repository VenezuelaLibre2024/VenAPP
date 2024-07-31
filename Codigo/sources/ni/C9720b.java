package ni;

import android.app.Activity;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.C9322n;
import p000.C1589b;
import p000.C6803d;

/* renamed from: ni.b */
/* loaded from: classes3.dex */
public final class C9720b {

    /* renamed from: a */
    private Activity f23910a;

    /* renamed from: a */
    private final boolean m29149a() {
        Activity activity = this.f23910a;
        C9322n.m27778b(activity);
        return (activity.getWindow().getAttributes().flags & RecognitionOptions.ITF) != 0;
    }

    /* renamed from: b */
    public final C1589b m29150b() {
        if (this.f23910a != null) {
            return new C1589b(Boolean.valueOf(m29149a()));
        }
        throw new C9719a();
    }

    /* renamed from: c */
    public final void m29151c(Activity activity) {
        this.f23910a = activity;
    }

    /* renamed from: d */
    public final void m29152d(C6803d message) {
        C9322n.m27781e(message, "message");
        Activity activity = this.f23910a;
        if (activity == null) {
            throw new C9719a();
        }
        C9322n.m27778b(activity);
        boolean m29149a = m29149a();
        Boolean m19681a = message.m19681a();
        C9322n.m27778b(m19681a);
        if (m19681a.booleanValue()) {
            if (m29149a) {
                return;
            }
            activity.getWindow().addFlags(RecognitionOptions.ITF);
        } else if (m29149a) {
            activity.getWindow().clearFlags(RecognitionOptions.ITF);
        }
    }
}
