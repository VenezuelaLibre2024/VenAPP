package x8;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.y2;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import x8.a;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> {

    /* renamed from: a, reason: collision with root package name */
    protected final y2 f30650a;

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        y2 y2Var = new y2();
        this.f30650a = y2Var;
        y2Var.u("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public T a(String str) {
        this.f30650a.s(str);
        return c();
    }

    public T b(Class<Object> cls, Bundle bundle) {
        this.f30650a.t(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f30650a.v("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return c();
    }

    protected abstract T c();

    public T d(String str) {
        com.google.android.gms.common.internal.s.k(str, "Content URL must be non-null.");
        com.google.android.gms.common.internal.s.g(str, "Content URL must be non-empty.");
        int length = str.length();
        com.google.android.gms.common.internal.s.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(RecognitionOptions.UPC_A), Integer.valueOf(str.length()));
        this.f30650a.w(str);
        return c();
    }

    public T e(int i10) {
        this.f30650a.x(i10);
        return c();
    }

    public T f(List<String> list) {
        if (list == null) {
            zzcec.zzj("neighboring content URLs list should not be null");
        } else {
            this.f30650a.z(list);
        }
        return c();
    }

    public T g(String str) {
        this.f30650a.b(str);
        return c();
    }

    @Deprecated
    public final a h(String str) {
        this.f30650a.u(str);
        return c();
    }

    @Deprecated
    public final a i(boolean z10) {
        this.f30650a.y(z10);
        return c();
    }

    @Deprecated
    public final a j(boolean z10) {
        this.f30650a.c(z10);
        return c();
    }
}
