package p438x8;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C4939y2;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import p438x8.AbstractC12351a;

/* renamed from: x8.a */
/* loaded from: classes.dex */
public abstract class AbstractC12351a<T extends AbstractC12351a<T>> {

    /* renamed from: a */
    protected final C4939y2 f33170a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12351a() {
        C4939y2 c4939y2 = new C4939y2();
        this.f33170a = c4939y2;
        c4939y2.m12503u("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* renamed from: a */
    public T m39940a(String str) {
        this.f33170a.m12501s(str);
        return mo39942c();
    }

    /* renamed from: b */
    public T m39941b(Class<Object> cls, Bundle bundle) {
        this.f33170a.m12502t(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f33170a.m12504v("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return mo39942c();
    }

    /* renamed from: c */
    protected abstract T mo39942c();

    /* renamed from: d */
    public T m39943d(String str) {
        C5276s.m13325k(str, "Content URL must be non-null.");
        C5276s.m13321g(str, "Content URL must be non-empty.");
        int length = str.length();
        C5276s.m13317c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(RecognitionOptions.UPC_A), Integer.valueOf(str.length()));
        this.f33170a.m12505w(str);
        return mo39942c();
    }

    /* renamed from: e */
    public T m39944e(int i10) {
        this.f33170a.m12506x(i10);
        return mo39942c();
    }

    /* renamed from: f */
    public T m39945f(List<String> list) {
        if (list == null) {
            zzcec.zzj("neighboring content URLs list should not be null");
        } else {
            this.f33170a.m12508z(list);
        }
        return mo39942c();
    }

    /* renamed from: g */
    public T m39946g(String str) {
        this.f33170a.m12498b(str);
        return mo39942c();
    }

    @Deprecated
    /* renamed from: h */
    public final AbstractC12351a m39947h(String str) {
        this.f33170a.m12503u(str);
        return mo39942c();
    }

    @Deprecated
    /* renamed from: i */
    public final AbstractC12351a m39948i(boolean z10) {
        this.f33170a.m12507y(z10);
        return mo39942c();
    }

    @Deprecated
    /* renamed from: j */
    public final AbstractC12351a m39949j(boolean z10) {
        this.f33170a.m12499c(z10);
        return mo39942c();
    }
}
