package c3;

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
import androidx.core.app.t0;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class q implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    private b f6824a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f6825b;

    /* renamed from: c, reason: collision with root package name */
    private int f6826c;

    /* renamed from: d, reason: collision with root package name */
    private Map<Integer, Integer> f6827d;

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface a {
        void onSuccess(int i10);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface c {
        void a(boolean z10);
    }

    private int a(Context context) {
        List<String> b10 = s.b(context, 21);
        if (!(b10 == null || b10.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b(Context context) {
        return Build.VERSION.SDK_INT < 33 ? t0.f(context).a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int d(int i10, Context context) {
        boolean isExternalStorageManager;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        if (i10 == 17) {
            return b(context);
        }
        if (i10 == 21) {
            return a(context);
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return a(context);
        }
        List<String> b10 = s.b(context, i10);
        if (b10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        }
        if (b10.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b10 + i10);
            return (i10 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        byte b11 = context.getApplicationInfo().targetSdkVersion >= 23;
        for (String str : b10) {
            if (b11 != false) {
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
                if (androidx.core.content.a.checkSelfPermission(context, str) != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    private void e(String str, int i10) {
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f6825b.getPackageName()));
        }
        this.f6825b.startActivityForResult(intent, i10);
        this.f6826c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i10, Context context, a aVar) {
        aVar.onSuccess(d(i10, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(List<Integer> list, Activity activity, b bVar, c3.b bVar2) {
        Map<Integer, Integer> map;
        int i10;
        String str;
        int i11;
        String str2;
        if (this.f6826c > 0) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else {
            if (activity != null) {
                this.f6824a = bVar;
                this.f6825b = activity;
                this.f6827d = new HashMap();
                this.f6826c = 0;
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    if (d(num.intValue(), activity) != 1) {
                        List<String> b10 = s.b(activity, num.intValue());
                        if (b10 != null && !b10.isEmpty()) {
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
                                arrayList.addAll(b10);
                                this.f6826c += b10.size();
                            } else {
                                str = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                                i11 = 214;
                            }
                            e(str, i11);
                        } else if (!this.f6827d.containsKey(num)) {
                            num.intValue();
                            this.f6827d.put(num, 0);
                            if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                map = this.f6827d;
                                i10 = 0;
                            } else {
                                map = this.f6827d;
                                i10 = 2;
                            }
                            map.put(num, i10);
                        }
                    } else if (!this.f6827d.containsKey(num)) {
                        map = this.f6827d;
                        i10 = 1;
                        map.put(num, i10);
                    }
                }
                if (arrayList.size() > 0) {
                    androidx.core.app.b.g(activity, (String[]) arrayList.toArray(new String[0]), 24);
                }
                if (this.f6826c == 0) {
                    this.f6824a.a(this.f6827d);
                    return;
                }
                return;
            }
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        }
        bVar2.onError("PermissionHandler.PermissionManager", str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10, Activity activity, c cVar, c3.b bVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.onError("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b10 = s.b(activity, i10);
        if (b10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.a(false);
            return;
        }
        if (!b10.isEmpty()) {
            cVar.a(androidx.core.app.b.j(activity, b10.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
        cVar.a(false);
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
            i13 = Settings.canDrawOverlays(this.f6825b);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            canRequestPackageInstalls = this.f6825b.getPackageManager().canRequestPackageInstalls();
            i12 = 24;
            i13 = canRequestPackageInstalls;
        } else if (i10 == 213) {
            i12 = 27;
            i13 = ((NotificationManager) this.f6825b.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i10 != 214 || Build.VERSION.SDK_INT < 31) {
                return false;
            }
            canScheduleExactAlarms = ((AlarmManager) this.f6825b.getSystemService("alarm")).canScheduleExactAlarms();
            i12 = 34;
            i13 = canScheduleExactAlarms;
        }
        this.f6827d.put(Integer.valueOf(i12), Integer.valueOf(i13));
        int i14 = this.f6826c - 1;
        this.f6826c = i14;
        if (i14 == 0) {
            this.f6824a.a(this.f6827d);
        }
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Map<Integer, Integer> map;
        int valueOf;
        int h10;
        Map<Integer, Integer> map2;
        int valueOf2;
        if (i10 != 24) {
            this.f6826c = 0;
            return false;
        }
        if (this.f6827d == null) {
            return false;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            int f10 = s.f(str);
            if (f10 != 20) {
                int i12 = iArr[i11];
                if (f10 == 7) {
                    if (!this.f6827d.containsKey(7)) {
                        this.f6827d.put(7, Integer.valueOf(s.h(this.f6825b, str, i12)));
                    }
                    if (!this.f6827d.containsKey(14)) {
                        map = this.f6827d;
                        valueOf = 14;
                        map.put(valueOf, Integer.valueOf(s.h(this.f6825b, str, i12)));
                    }
                    s.i(this.f6825b, f10);
                } else if (f10 == 4) {
                    h10 = s.h(this.f6825b, str, i12);
                    if (!this.f6827d.containsKey(4)) {
                        map2 = this.f6827d;
                        valueOf2 = 4;
                        map2.put(valueOf2, Integer.valueOf(h10));
                    }
                    s.i(this.f6825b, f10);
                } else if (f10 == 3) {
                    h10 = s.h(this.f6825b, str, i12);
                    if (Build.VERSION.SDK_INT < 29 && !this.f6827d.containsKey(4)) {
                        this.f6827d.put(4, Integer.valueOf(h10));
                    }
                    if (!this.f6827d.containsKey(5)) {
                        this.f6827d.put(5, Integer.valueOf(h10));
                    }
                    map2 = this.f6827d;
                    valueOf2 = Integer.valueOf(f10);
                    map2.put(valueOf2, Integer.valueOf(h10));
                    s.i(this.f6825b, f10);
                } else {
                    if (!this.f6827d.containsKey(Integer.valueOf(f10))) {
                        map = this.f6827d;
                        valueOf = Integer.valueOf(f10);
                        map.put(valueOf, Integer.valueOf(s.h(this.f6825b, str, i12)));
                    }
                    s.i(this.f6825b, f10);
                }
            }
        }
        int length = this.f6826c - iArr.length;
        this.f6826c = length;
        if (length != 0) {
            return true;
        }
        this.f6824a.a(this.f6827d);
        return true;
    }
}
