package p035c3;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.C0777b;
import androidx.core.app.C0834t0;
import androidx.core.content.C0854a;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c3.q */
/* loaded from: classes.dex */
final class C1855q implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private b f7773a;

    /* renamed from: b */
    private Activity f7774b;

    /* renamed from: c */
    private int f7775c;

    /* renamed from: d */
    private Map<Integer, Integer> f7776d;

    @FunctionalInterface
    /* renamed from: c3.q$a */
    /* loaded from: classes.dex */
    interface a {
        void onSuccess(int i10);
    }

    @FunctionalInterface
    /* renamed from: c3.q$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: a */
        void mo9873a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* renamed from: c3.q$c */
    /* loaded from: classes.dex */
    interface c {
        /* renamed from: a */
        void mo9874a(boolean z10);
    }

    /* renamed from: a */
    private int m9893a(Context context) {
        List<String> m9902b = C1857s.m9902b(context, 21);
        if (!(m9902b == null || m9902b.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    /* renamed from: b */
    private int m9894b(Context context) {
        return Build.VERSION.SDK_INT < 33 ? C0834t0.m4279f(context).m4283a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private int m9895d(int i10, Context context) {
        boolean isExternalStorageManager;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        if (i10 == 17) {
            return m9894b(context);
        }
        if (i10 == 21) {
            return m9893a(context);
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return m9893a(context);
        }
        List<String> m9902b = C1857s.m9902b(context, i10);
        if (m9902b == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        }
        if (m9902b.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + m9902b + i10);
            return (i10 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        byte b10 = context.getApplicationInfo().targetSdkVersion >= 23;
        for (String str : m9902b) {
            if (b10 != false) {
                if (i10 == 16) {
                    String packageName = context.getPackageName();
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                }
                if (i10 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        return 2;
                    }
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    return isExternalStorageManager ? 1 : 0;
                }
                if (i10 == 23) {
                    return Settings.canDrawOverlays(context) ? 1 : 0;
                }
                if (i10 == 24 && Build.VERSION.SDK_INT >= 26) {
                    canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                    return canRequestPackageInstalls ? 1 : 0;
                }
                if (i10 == 27) {
                    return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                }
                if (i10 == 34) {
                    if (Build.VERSION.SDK_INT < 31) {
                        return 1;
                    }
                    canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                    return canScheduleExactAlarms ? 1 : 0;
                }
                if (C0854a.checkSelfPermission(context, str) != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    /* renamed from: e */
    private void m9896e(String str, int i10) {
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f7774b.getPackageName()));
        }
        this.f7774b.startActivityForResult(intent, i10);
        this.f7775c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m9897c(int i10, Context context, a aVar) {
        aVar.onSuccess(m9895d(i10, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m9898f(List<Integer> list, Activity activity, b bVar, InterfaceC1840b interfaceC1840b) {
        Map<Integer, Integer> map;
        int i10;
        String str;
        int i11;
        String str2;
        if (this.f7775c > 0) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else {
            if (activity != null) {
                this.f7773a = bVar;
                this.f7774b = activity;
                this.f7776d = new HashMap();
                this.f7775c = 0;
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    if (m9895d(num.intValue(), activity) != 1) {
                        List<String> m9902b = C1857s.m9902b(activity, num.intValue());
                        if (m9902b != null && !m9902b.isEmpty()) {
                            int i12 = Build.VERSION.SDK_INT;
                            if (num.intValue() == 16) {
                                str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                                i11 = 209;
                            } else if (i12 >= 30 && num.intValue() == 22) {
                                str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                                i11 = 210;
                            } else if (num.intValue() == 23) {
                                str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                                i11 = 211;
                            } else if (i12 >= 26 && num.intValue() == 24) {
                                str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                                i11 = 212;
                            } else if (num.intValue() == 27) {
                                str = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                                i11 = 213;
                            } else if (i12 < 31 || num.intValue() != 34) {
                                arrayList.addAll(m9902b);
                                this.f7775c += m9902b.size();
                            } else {
                                str = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                                i11 = 214;
                            }
                            m9896e(str, i11);
                        } else if (!this.f7776d.containsKey(num)) {
                            num.intValue();
                            this.f7776d.put(num, 0);
                            if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                map = this.f7776d;
                                i10 = 0;
                            } else {
                                map = this.f7776d;
                                i10 = 2;
                            }
                            map.put(num, i10);
                        }
                    } else if (!this.f7776d.containsKey(num)) {
                        map = this.f7776d;
                        i10 = 1;
                        map.put(num, i10);
                    }
                }
                if (arrayList.size() > 0) {
                    C0777b.m3916g(activity, (String[]) arrayList.toArray(new String[0]), 24);
                }
                if (this.f7775c == 0) {
                    this.f7773a.mo9873a(this.f7776d);
                    return;
                }
                return;
            }
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        }
        interfaceC1840b.onError("PermissionHandler.PermissionManager", str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m9899g(int i10, Activity activity, c cVar, InterfaceC1840b interfaceC1840b) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            interfaceC1840b.onError("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> m9902b = C1857s.m9902b(activity, i10);
        if (m9902b == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.mo9874a(false);
            return;
        }
        if (!m9902b.isEmpty()) {
            cVar.mo9874a(C0777b.m3919j(activity, m9902b.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
        cVar.mo9874a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        boolean canScheduleExactAlarms;
        int i12;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i13;
        if (i10 != 209 && i10 != 210 && i10 != 211 && i10 != 212 && i10 != 213 && i10 != 214) {
            return false;
        }
        boolean z10 = i11 == -1;
        if (i10 == 209) {
            i12 = 16;
            i13 = z10;
        } else if (i10 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            isExternalStorageManager = Environment.isExternalStorageManager();
            i12 = 22;
            i13 = isExternalStorageManager;
        } else if (i10 == 211) {
            i12 = 23;
            i13 = Settings.canDrawOverlays(this.f7774b);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            canRequestPackageInstalls = this.f7774b.getPackageManager().canRequestPackageInstalls();
            i12 = 24;
            i13 = canRequestPackageInstalls;
        } else if (i10 == 213) {
            i12 = 27;
            i13 = ((NotificationManager) this.f7774b.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i10 != 214 || Build.VERSION.SDK_INT < 31) {
                return false;
            }
            canScheduleExactAlarms = ((AlarmManager) this.f7774b.getSystemService("alarm")).canScheduleExactAlarms();
            i12 = 34;
            i13 = canScheduleExactAlarms;
        }
        this.f7776d.put(Integer.valueOf(i12), Integer.valueOf(i13));
        int i14 = this.f7775c - 1;
        this.f7775c = i14;
        if (i14 == 0) {
            this.f7773a.mo9873a(this.f7776d);
        }
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Map<Integer, Integer> map;
        int valueOf;
        int m9908h;
        Map<Integer, Integer> map2;
        int valueOf2;
        if (i10 != 24) {
            this.f7775c = 0;
            return false;
        }
        if (this.f7776d == null) {
            return false;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            int m9906f = C1857s.m9906f(str);
            if (m9906f != 20) {
                int i12 = iArr[i11];
                if (m9906f == 7) {
                    if (!this.f7776d.containsKey(7)) {
                        this.f7776d.put(7, Integer.valueOf(C1857s.m9908h(this.f7774b, str, i12)));
                    }
                    if (!this.f7776d.containsKey(14)) {
                        map = this.f7776d;
                        valueOf = 14;
                        map.put(valueOf, Integer.valueOf(C1857s.m9908h(this.f7774b, str, i12)));
                    }
                    C1857s.m9909i(this.f7774b, m9906f);
                } else if (m9906f == 4) {
                    m9908h = C1857s.m9908h(this.f7774b, str, i12);
                    if (!this.f7776d.containsKey(4)) {
                        map2 = this.f7776d;
                        valueOf2 = 4;
                        map2.put(valueOf2, Integer.valueOf(m9908h));
                    }
                    C1857s.m9909i(this.f7774b, m9906f);
                } else if (m9906f == 3) {
                    m9908h = C1857s.m9908h(this.f7774b, str, i12);
                    if (Build.VERSION.SDK_INT < 29 && !this.f7776d.containsKey(4)) {
                        this.f7776d.put(4, Integer.valueOf(m9908h));
                    }
                    if (!this.f7776d.containsKey(5)) {
                        this.f7776d.put(5, Integer.valueOf(m9908h));
                    }
                    map2 = this.f7776d;
                    valueOf2 = Integer.valueOf(m9906f);
                    map2.put(valueOf2, Integer.valueOf(m9908h));
                    C1857s.m9909i(this.f7774b, m9906f);
                } else {
                    if (!this.f7776d.containsKey(Integer.valueOf(m9906f))) {
                        map = this.f7776d;
                        valueOf = Integer.valueOf(m9906f);
                        map.put(valueOf, Integer.valueOf(C1857s.m9908h(this.f7774b, str, i12)));
                    }
                    C1857s.m9909i(this.f7774b, m9906f);
                }
            }
        }
        int length = this.f7775c - iArr.length;
        this.f7775c = length;
        if (length != 0) {
            return true;
        }
        this.f7773a.mo9873a(this.f7776d);
        return true;
    }
}
