package p107ff;

import android.content.Context;
import android.os.Bundle;
import ck.C2037v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p107ff.InterfaceC7347h;
import p124gk.Continuation;
import p472yk.C12728a;
import p472yk.C12730c;
import p472yk.EnumC12731d;

/* renamed from: ff.b */
/* loaded from: classes2.dex */
public final class C7341b implements InterfaceC7347h {

    /* renamed from: b */
    private static final a f16538b = new a(null);

    /* renamed from: a */
    private final Bundle f16539a;

    /* renamed from: ff.b$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C7341b(Context context) {
        C9322n.m27781e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData;
        this.f16539a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: a */
    public Boolean mo22037a() {
        if (this.f16539a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f16539a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: b */
    public C12728a mo22038b() {
        if (this.f16539a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C12728a.m42015h(C12730c.m42041h(this.f16539a.getInt("firebase_sessions_sessions_restart_timeout"), EnumC12731d.SECONDS));
        }
        return null;
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: c */
    public Double mo22039c() {
        if (this.f16539a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f16539a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p107ff.InterfaceC7347h
    /* renamed from: d */
    public Object mo22040d(Continuation<? super C2037v> continuation) {
        return InterfaceC7347h.a.m22077a(this, continuation);
    }
}
