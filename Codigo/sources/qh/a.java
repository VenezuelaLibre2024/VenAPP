package qh;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f24022a = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f24023b = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f24024c = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f24025d = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

    /* renamed from: e, reason: collision with root package name */
    static final String[] f24026e = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] a() {
        Object[] array;
        ArrayList arrayList = new ArrayList(Arrays.asList(f24025d));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            array = arrayList.toArray(new String[0]);
        } else {
            String[] split = str.split(":");
            int length = split.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str2 = split[i10];
                if (!str2.endsWith("/")) {
                    str2 = str2 + '/';
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            array = arrayList.toArray(new String[0]);
        }
        return (String[]) array;
    }
}
