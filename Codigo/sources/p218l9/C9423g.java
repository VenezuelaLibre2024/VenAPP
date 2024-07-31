package p218l9;

import com.google.android.gms.internal.ads.zzbbz;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: l9.g */
/* loaded from: classes.dex */
public final class C9423g {

    /* renamed from: a */
    private final String f22932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C9423g(C9419e c9419e, C9421f c9421f) {
        String str;
        str = c9419e.f22926a;
        this.f22932a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final zzbbz m28093a() {
        char c10;
        String str = this.f22932a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? zzbbz.AD_INITIATER_UNSPECIFIED : zzbbz.REWARD_BASED_VIDEO_AD : zzbbz.AD_LOADER : zzbbz.INTERSTITIAL : zzbbz.BANNER;
    }

    /* renamed from: b */
    public final String m28094b() {
        return this.f22932a.toLowerCase(Locale.ROOT);
    }

    /* renamed from: c */
    public final Set m28095c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f22932a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
