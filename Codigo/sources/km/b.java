package km;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.preference.PreferenceManager;
import bi.h;
import com.yalantis.ucrop.a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes3.dex */
public class b implements PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f20727a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f20728b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel.Result f20729c;

    /* renamed from: d, reason: collision with root package name */
    private a f20730d = new a();

    public b(Activity activity) {
        this.f20727a = activity;
        this.f20728b = PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext());
    }

    private void a(String str) {
        SharedPreferences.Editor edit = this.f20728b.edit();
        edit.putString("imagecropper.FILENAME_CACHE_KEY", str);
        edit.apply();
    }

    private void b() {
        this.f20729c = null;
    }

    private int c(int i10) {
        Color.colorToHSV(i10, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.8f};
        return Color.HSVToColor(fArr);
    }

    private void d(String str, String str2, Throwable th2) {
        MethodChannel.Result result = this.f20729c;
        if (result != null) {
            result.error(str, str2, th2);
            b();
        }
    }

    private void e(String str) {
        MethodChannel.Result result = this.f20729c;
        if (result != null) {
            result.success(str);
            b();
        }
    }

    private String f() {
        if (!this.f20728b.contains("imagecropper.FILENAME_CACHE_KEY")) {
            return null;
        }
        String string = this.f20728b.getString("imagecropper.FILENAME_CACHE_KEY", "");
        SharedPreferences.Editor edit = this.f20728b.edit();
        edit.remove("imagecropper.FILENAME_CACHE_KEY");
        edit.apply();
        return string;
    }

    private di.a g(String str) {
        return "square".equals(str) ? new di.a(null, 1.0f, 1.0f) : "original".equals(str) ? new di.a(this.f20727a.getString(h.f6582c).toUpperCase(), 0.0f, 1.0f) : "3x2".equals(str) ? new di.a(null, 3.0f, 2.0f) : "4x3".equals(str) ? new di.a(null, 4.0f, 3.0f) : "5x3".equals(str) ? new di.a(null, 5.0f, 3.0f) : "5x4".equals(str) ? new di.a(null, 5.0f, 4.0f) : "7x5".equals(str) ? new di.a(null, 7.0f, 5.0f) : "16x9".equals(str) ? new di.a(null, 16.0f, 9.0f) : new di.a(this.f20727a.getString(h.f6582c).toUpperCase(), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yalantis.ucrop.a.C0198a i(com.yalantis.ucrop.a.C0198a r19, io.flutter.plugin.common.MethodCall r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: km.b.i(com.yalantis.ucrop.a$a, io.flutter.plugin.common.MethodCall):com.yalantis.ucrop.a$a");
    }

    public void h(MethodCall methodCall, MethodChannel.Result result) {
        result.success(f());
    }

    public void j(MethodCall methodCall, MethodChannel.Result result) {
        Integer num;
        Double d10;
        Double d11;
        File file;
        String str = (String) methodCall.argument("source_path");
        Integer num2 = (Integer) methodCall.argument("max_width");
        Integer num3 = (Integer) methodCall.argument("max_height");
        Double d12 = (Double) methodCall.argument("ratio_x");
        Double d13 = (Double) methodCall.argument("ratio_y");
        String str2 = (String) methodCall.argument("crop_style");
        String str3 = (String) methodCall.argument("compress_format");
        Integer num4 = (Integer) methodCall.argument("compress_quality");
        ArrayList arrayList = (ArrayList) methodCall.argument("aspect_ratio_presets");
        String str4 = (String) methodCall.argument("android.init_aspect_ratio");
        this.f20729c = result;
        File cacheDir = this.f20727a.getCacheDir();
        if ("png".equals(str3)) {
            d11 = d13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image_cropper_");
            num = num3;
            d10 = d12;
            sb2.append(new Date().getTime());
            sb2.append(".png");
            file = new File(cacheDir, sb2.toString());
        } else {
            num = num3;
            d10 = d12;
            d11 = d13;
            file = new File(cacheDir, "image_cropper_" + new Date().getTime() + ".jpg");
        }
        Uri fromFile = Uri.fromFile(new File(str));
        Uri fromFile2 = Uri.fromFile(file);
        a.C0198a c0198a = new a.C0198a();
        c0198a.e("png".equals(str3) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
        c0198a.f(num4 != null ? num4.intValue() : 90);
        if ("circle".equals(str2)) {
            c0198a.d(true);
        }
        i(c0198a, methodCall);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                String str5 = (String) arrayList.get(i11);
                if (str5 != null) {
                    arrayList2.add(g(str5));
                    if (str5.equals(str4)) {
                        i10 = i11;
                    }
                }
            }
            c0198a.c(i10, (di.a[]) arrayList2.toArray(new di.a[0]));
        }
        com.yalantis.ucrop.a g10 = com.yalantis.ucrop.a.d(fromFile, fromFile2).g(c0198a);
        if (num2 != null && num != null) {
            g10.f(num2.intValue(), num.intValue());
        }
        if (d10 != null && d11 != null) {
            g10.e(d10.floatValue(), d11.floatValue());
        }
        Activity activity = this.f20727a;
        activity.startActivityForResult(g10.b(activity), 69);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 69) {
            return false;
        }
        if (i11 == -1) {
            String e10 = this.f20730d.e(this.f20727a, com.yalantis.ucrop.a.c(intent));
            a(e10);
            e(e10);
            return true;
        }
        if (i11 == 96) {
            Throwable a10 = com.yalantis.ucrop.a.a(intent);
            d("crop_error", a10.getLocalizedMessage(), a10);
            return true;
        }
        MethodChannel.Result result = this.f20729c;
        if (result == null) {
            return false;
        }
        result.success(null);
        b();
        return true;
    }
}
