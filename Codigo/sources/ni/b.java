package ni;

import android.app.Activity;
import com.google.android.libraries.barhopper.RecognitionOptions;
import defpackage.d;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Activity f21977a;

    private final boolean a() {
        Activity activity = this.f21977a;
        n.b(activity);
        return (activity.getWindow().getAttributes().flags & RecognitionOptions.ITF) != 0;
    }

    public final defpackage.b b() {
        if (this.f21977a != null) {
            return new defpackage.b(Boolean.valueOf(a()));
        }
        throw new a();
    }

    public final void c(Activity activity) {
        this.f21977a = activity;
    }

    public final void d(d message) {
        n.e(message, "message");
        Activity activity = this.f21977a;
        if (activity == null) {
            throw new a();
        }
        n.b(activity);
        boolean a10 = a();
        Boolean a11 = message.a();
        n.b(a11);
        if (a11.booleanValue()) {
            if (a10) {
                return;
            }
            activity.getWindow().addFlags(RecognitionOptions.ITF);
        } else if (a10) {
            activity.getWindow().clearFlags(RecognitionOptions.ITF);
        }
    }
}
