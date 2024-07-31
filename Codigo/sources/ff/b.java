package ff;

import android.content.Context;
import android.os.Bundle;
import ck.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import ff.h;
import gk.Continuation;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f15115b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f15116a;

    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public b(Context context) {
        n.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData;
        this.f15116a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // ff.h
    public Boolean a() {
        if (this.f15116a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f15116a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ff.h
    public yk.a b() {
        if (this.f15116a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return yk.a.h(yk.c.h(this.f15116a.getInt("firebase_sessions_sessions_restart_timeout"), yk.d.SECONDS));
        }
        return null;
    }

    @Override // ff.h
    public Double c() {
        if (this.f15116a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f15116a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // ff.h
    public Object d(Continuation<? super v> continuation) {
        return h.a.a(this, continuation);
    }
}
