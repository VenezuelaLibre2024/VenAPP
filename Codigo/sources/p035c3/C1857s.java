package p035c3;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.C0777b;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: c3.s */
/* loaded from: classes.dex */
public class C1857s {
    /* renamed from: a */
    private static String m9901a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && m9904d(context, null, str)) {
            return str;
        }
        if (i10 >= 29) {
            if (i10 < 29 || !m9904d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return null;
            }
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (m9904d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (m9904d(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e5, code lost:
    
        if (m9904d(r4, r0, "android.permission.RECORD_AUDIO") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x023b, code lost:
    
        if (m9904d(r4, r0, "android.permission.CAMERA") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0252, code lost:
    
        if (m9904d(r4, r0, "android.permission.WRITE_CALENDAR") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (m9904d(r4, r0, "android.permission.SYSTEM_ALERT_WINDOW") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023d, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if (m9904d(r4, r0, "android.permission.BLUETOOTH") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        if (m9904d(r4, r0, "android.permission.ACTIVITY_RECOGNITION") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (m9904d(r4, r0, "android.permission.ACCESS_MEDIA_LOCATION") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00de, code lost:
    
        if (m9904d(r4, r0, "android.permission.POST_NOTIFICATIONS") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
    
        if (m9904d(r4, r0, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0101, code lost:
    
        if (r5 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0151, code lost:
    
        if (m9904d(r4, r0, "android.permission.BODY_SENSORS") != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015f, code lost:
    
        if (m9904d(r4, r0, "android.permission.READ_MEDIA_IMAGES") != false) goto L170;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> m9902b(android.content.Context r4, int r5) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c3.C1857s.m9902b(android.content.Context, int):java.util.List");
    }

    /* renamed from: c */
    private static PackageInfo m9903c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        return i10 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(packageName, RecognitionOptions.AZTEC);
    }

    /* renamed from: d */
    private static boolean m9904d(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e10);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo m9903c = m9903c(context);
        if (m9903c == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(m9903c.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static boolean m9905e(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !C0777b.m3919j(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m9906f(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                if (str.equals("android.permission.READ_SMS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1928411001:
                if (str.equals("android.permission.READ_CALENDAR")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1925850455:
                if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1921431796:
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1813079487:
                if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1783097621:
                if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1561629405:
                if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1479758289:
                if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1238066820:
                if (str.equals("android.permission.BODY_SENSORS")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1164582768:
                if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -909527021:
                if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c10 = 11;
                    break;
                }
                break;
            case -901151997:
                if (str.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -895679497:
                if (str.equals("android.permission.RECEIVE_MMS")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -895673731:
                if (str.equals("android.permission.RECEIVE_SMS")) {
                    c10 = 14;
                    break;
                }
                break;
            case -798669607:
                if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c10 = 15;
                    break;
                }
                break;
            case -406040016:
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c10 = 16;
                    break;
                }
                break;
            case -63024214:
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c10 = 17;
                    break;
                }
                break;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 52602690:
                if (str.equals("android.permission.SEND_SMS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 112197485:
                if (str.equals("android.permission.CALL_PHONE")) {
                    c10 = 20;
                    break;
                }
                break;
            case 175802396:
                if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c10 = 21;
                    break;
                }
                break;
            case 214526995:
                if (str.equals("android.permission.WRITE_CONTACTS")) {
                    c10 = 22;
                    break;
                }
                break;
            case 361658321:
                if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                    c10 = 23;
                    break;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c10 = 24;
                    break;
                }
                break;
            case 603653886:
                if (str.equals("android.permission.WRITE_CALENDAR")) {
                    c10 = 25;
                    break;
                }
                break;
            case 610633091:
                if (str.equals("android.permission.WRITE_CALL_LOG")) {
                    c10 = 26;
                    break;
                }
                break;
            case 691260818:
                if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 710297143:
                if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 784519842:
                if (str.equals("android.permission.USE_SIP")) {
                    c10 = 29;
                    break;
                }
                break;
            case 970694249:
                if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1166454870:
                if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1271781903:
                if (str.equals("android.permission.GET_ACCOUNTS")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c10 = '!';
                    break;
                }
                break;
            case 1777263169:
                if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 1780337063:
                if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c10 = '#';
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c10 = '$';
                    break;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2024715147:
                if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2062356686:
                if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2114579147:
                if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2133799037:
                if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c10 = ')';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '\b':
            case '\r':
            case 14:
            case 19:
                return 13;
            case 1:
            case 25:
                return 0;
            case 2:
                return 17;
            case 3:
            case '\n':
            case '\f':
            case 18:
            case 20:
            case 26:
            case 29:
            case ')':
                return 8;
            case 4:
            case 17:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case '\t':
                return 12;
            case 11:
                return 31;
            case 15:
                return 30;
            case 16:
            case '!':
                return 15;
            case 21:
                return 9;
            case 22:
            case ' ':
            case '%':
                return 2;
            case 23:
                return 35;
            case 24:
                return 1;
            case 27:
                return 33;
            case 28:
                return 32;
            case 30:
                return 34;
            case 31:
                return 29;
            case '\"':
                return 24;
            case '#':
                return 19;
            case '$':
                return 7;
            case '&':
                return 4;
            case '\'':
                return 28;
            case '(':
                return 18;
            default:
                return 20;
        }
    }

    /* renamed from: g */
    private static void m9907g(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m9908h(Activity activity, String str, int i10) {
        boolean z10 = true;
        if (i10 != -1) {
            return 1;
        }
        boolean m9910j = m9910j(activity, str);
        boolean z11 = !m9905e(activity, str);
        if (!m9910j) {
            z10 = z11;
        } else if (z11) {
            z10 = false;
        }
        if (!m9910j && z10) {
            m9907g(activity, str);
        }
        return (m9910j && z10) ? 4 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m9909i(Activity activity, int i10) {
        List<String> m9902b;
        if (activity == null || (m9902b = m9902b(activity, i10)) == null) {
            return;
        }
        m9902b.isEmpty();
    }

    /* renamed from: j */
    private static boolean m9910j(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
