package l9;

import com.google.android.gms.internal.ads.zzbbz;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final String f21079a;

    public /* synthetic */ g(e eVar, f fVar) {
        String str;
        str = eVar.f21073a;
        this.f21079a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbbz a() {
        char c10;
        String str = this.f21079a;
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

    public final String b() {
        return this.f21079a.toLowerCase(Locale.ROOT);
    }

    public final Set c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f21079a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
