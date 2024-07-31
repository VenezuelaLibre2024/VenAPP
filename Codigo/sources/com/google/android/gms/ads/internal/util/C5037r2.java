package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.ads.internal.util.r2 */
/* loaded from: classes.dex */
public class C5037r2 extends C5021n2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static final /* synthetic */ WindowInsets m12713m(Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (C4965t.m12580q().zzi().zzm() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                InterfaceC5053w1 zzi = C4965t.m12580q().zzi();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzi.mo12758i(str);
            } else {
                C4965t.m12580q().zzi().mo12758i("");
            }
        }
        m12714n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: n */
    private static final void m12714n(boolean z10, Activity activity) {
        int i10;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = true != z10 ? 2 : 1;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: i */
    public final int mo12613i(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: j */
    public final void mo12614j(final Activity activity) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzbf)).booleanValue() && C4965t.m12580q().zzi().zzm() == null && !activity.isInMultiWindowMode()) {
            m12714n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.o2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return C5037r2.m12713m(activity, view, windowInsets);
                }
            });
        }
    }
}
