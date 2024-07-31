package km;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.preference.PreferenceManager;
import bi.C1796h;
import com.yalantis.ucrop.C6793a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import p068di.C6972a;

/* renamed from: km.b */
/* loaded from: classes3.dex */
public class C9293b implements PluginRegistry.ActivityResultListener {

    /* renamed from: a */
    private final Activity f22549a;

    /* renamed from: b */
    private final SharedPreferences f22550b;

    /* renamed from: c */
    private MethodChannel.Result f22551c;

    /* renamed from: d */
    private C9292a f22552d = new C9292a();

    public C9293b(Activity activity) {
        this.f22549a = activity;
        this.f22550b = PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext());
    }

    /* renamed from: a */
    private void m27727a(String str) {
        SharedPreferences.Editor edit = this.f22550b.edit();
        edit.putString("imagecropper.FILENAME_CACHE_KEY", str);
        edit.apply();
    }

    /* renamed from: b */
    private void m27728b() {
        this.f22551c = null;
    }

    /* renamed from: c */
    private int m27729c(int i10) {
        Color.colorToHSV(i10, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.8f};
        return Color.HSVToColor(fArr);
    }

    /* renamed from: d */
    private void m27730d(String str, String str2, Throwable th2) {
        MethodChannel.Result result = this.f22551c;
        if (result != null) {
            result.error(str, str2, th2);
            m27728b();
        }
    }

    /* renamed from: e */
    private void m27731e(String str) {
        MethodChannel.Result result = this.f22551c;
        if (result != null) {
            result.success(str);
            m27728b();
        }
    }

    /* renamed from: f */
    private String m27732f() {
        if (!this.f22550b.contains("imagecropper.FILENAME_CACHE_KEY")) {
            return null;
        }
        String string = this.f22550b.getString("imagecropper.FILENAME_CACHE_KEY", "");
        SharedPreferences.Editor edit = this.f22550b.edit();
        edit.remove("imagecropper.FILENAME_CACHE_KEY");
        edit.apply();
        return string;
    }

    /* renamed from: g */
    private C6972a m27733g(String str) {
        return "square".equals(str) ? new C6972a(null, 1.0f, 1.0f) : "original".equals(str) ? new C6972a(this.f22549a.getString(C1796h.f7505c).toUpperCase(), 0.0f, 1.0f) : "3x2".equals(str) ? new C6972a(null, 3.0f, 2.0f) : "4x3".equals(str) ? new C6972a(null, 4.0f, 3.0f) : "5x3".equals(str) ? new C6972a(null, 5.0f, 3.0f) : "5x4".equals(str) ? new C6972a(null, 5.0f, 4.0f) : "7x5".equals(str) ? new C6972a(null, 7.0f, 5.0f) : "16x9".equals(str) ? new C6972a(null, 16.0f, 9.0f) : new C6972a(this.f22549a.getString(C1796h.f7505c).toUpperCase(), 0.0f, 1.0f);
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
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yalantis.ucrop.C6793a.a m27734i(com.yalantis.ucrop.C6793a.a r19, io.flutter.plugin.common.MethodCall r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C9293b.m27734i(com.yalantis.ucrop.a$a, io.flutter.plugin.common.MethodCall):com.yalantis.ucrop.a$a");
    }

    /* renamed from: h */
    public void m27735h(MethodCall methodCall, MethodChannel.Result result) {
        result.success(m27732f());
    }

    /* renamed from: j */
    public void m27736j(MethodCall methodCall, MethodChannel.Result result) {
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
        this.f22551c = result;
        File cacheDir = this.f22549a.getCacheDir();
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
        C6793a.a aVar = new C6793a.a();
        aVar.m19603e("png".equals(str3) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
        aVar.m19604f(num4 != null ? num4.intValue() : 90);
        if ("circle".equals(str2)) {
            aVar.m19602d(true);
        }
        m27734i(aVar, methodCall);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                String str5 = (String) arrayList.get(i11);
                if (str5 != null) {
                    arrayList2.add(m27733g(str5));
                    if (str5.equals(str4)) {
                        i10 = i11;
                    }
                }
            }
            aVar.m19601c(i10, (C6972a[]) arrayList2.toArray(new C6972a[0]));
        }
        C6793a m19598g = C6793a.m19594d(fromFile, fromFile2).m19598g(aVar);
        if (num2 != null && num != null) {
            m19598g.m19597f(num2.intValue(), num.intValue());
        }
        if (d10 != null && d11 != null) {
            m19598g.m19596e(d10.floatValue(), d11.floatValue());
        }
        Activity activity = this.f22549a;
        activity.startActivityForResult(m19598g.m19595b(activity), 69);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 69) {
            return false;
        }
        if (i11 == -1) {
            String m27726e = this.f22552d.m27726e(this.f22549a, C6793a.m19593c(intent));
            m27727a(m27726e);
            m27731e(m27726e);
            return true;
        }
        if (i11 == 96) {
            Throwable m19592a = C6793a.m19592a(intent);
            m27730d("crop_error", m19592a.getLocalizedMessage(), m19592a);
            return true;
        }
        MethodChannel.Result result = this.f22551c;
        if (result == null) {
            return false;
        }
        result.success(null);
        m27728b();
        return true;
    }
}
