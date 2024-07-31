package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfxr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.b1 */
/* loaded from: classes.dex */
public final class C4972b1 {
    /* renamed from: a */
    public static Point m12593a(MotionEvent motionEvent, View view) {
        int[] m12602j = m12602j(view);
        return new Point(((int) motionEvent.getRawX()) - m12602j[0], ((int) motionEvent.getRawY()) - m12602j[1]);
    }

    /* renamed from: b */
    public static WindowManager.LayoutParams m12594b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C4784a0.m12365c().zza(zzbgc.zzhT)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* renamed from: c */
    public static JSONObject m12595c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", C4930x.m12474b().zzb(context, point2.x));
                    jSONObject3.put("y", C4930x.m12474b().zzb(context, point2.y));
                    jSONObject3.put("start_x", C4930x.m12474b().zzb(context, point.x));
                    jSONObject3.put("start_y", C4930x.m12474b().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e10) {
                    zzcec.zzh("Error occurred while putting signals into JSON object.", e10);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e11) {
                e = e11;
                jSONObject = jSONObject2;
                zzcec.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: d */
    public static JSONObject m12596d(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] m12602j = m12602j(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] m12602j2 = m12602j(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", C4930x.m12474b().zzb(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", C4930x.m12474b().zzb(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", C4930x.m12474b().zzb(context, m12602j2[0] - m12602j[0]));
                            jSONObject5.put("y", C4930x.m12474b().zzb(context, m12602j2[1] - m12602j[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = m12603k(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", C4930x.m12474b().zzb(context, m12602j2[0] - m12602j[0]));
                                jSONObject2.put("y", C4930x.m12474b().zzb(context, m12602j2[1] - m12602j[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhN)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhO)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", m12604l(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", m12604l(layoutParams.height) - 1);
                                }
                                if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhP)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhQ)).booleanValue() && scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    zzcec.zzj("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((String) entry.getKey(), jSONObject4);
                            } catch (JSONException unused2) {
                                zzcec.zzj("Unable to get asset views information");
                                it = it2;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } catch (JSONException unused3) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    /* renamed from: e */
    public static JSONObject m12597e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C4965t.m12581r();
                jSONObject.put("can_show_on_lock_screen", C5005j2.m12649P(view));
                C4965t.m12581r();
                jSONObject.put("is_keyguard_locked", C5005j2.m12664c(context));
            } catch (JSONException unused) {
                zzcec.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if ((r1 == null ? -1 : ((android.widget.AdapterView) r1).getPositionForView(r6)) != (-1)) goto L15;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject m12598f(android.view.View r6) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L8
            goto L58
        L8:
            com.google.android.gms.internal.ads.zzbfu r1 = com.google.android.gms.internal.ads.zzbgc.zzhM     // Catch: java.lang.Exception -> L58
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> L58
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L58
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L58
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L38
            com.google.android.gms.ads.internal.C4965t.m12581r()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L25:
            if (r6 == 0) goto L30
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L30
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
            goto L25
        L30:
            if (r6 != 0) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L58
            goto L58
        L38:
            com.google.android.gms.ads.internal.C4965t.m12581r()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r1 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L3f:
            if (r1 == 0) goto L4a
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch: java.lang.Exception -> L58
            if (r5 != 0) goto L4a
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L58
            goto L3f
        L4a:
            r5 = -1
            if (r1 != 0) goto L4f
            r6 = r5
            goto L55
        L4f:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch: java.lang.Exception -> L58
            int r6 = r1.getPositionForView(r6)     // Catch: java.lang.Exception -> L58
        L55:
            if (r6 == r5) goto L34
            goto L33
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C4972b1.m12598f(android.view.View):org.json.JSONObject");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:16|(10:42|43|19|20|21|(3:23|(1:27)|36)(3:37|(1:39)|36)|28|(1:(2:31|32)(1:34))|35|32)|18|19|20|21|(0)(0)|28|(0)|35|32) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0171, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0172, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0172 -> B:31:0x0177). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject m12599g(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C4972b1.m12599g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    /* renamed from: h */
    public static boolean m12600h(Context context, zzfgm zzfgmVar) {
        if (!zzfgmVar.zzO) {
            return false;
        }
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhR)).booleanValue()) {
            return ((Boolean) C4784a0.m12365c().zza(zzbgc.zzhU)).booleanValue();
        }
        String str = (String) C4784a0.m12365c().zza(zzbgc.zzhS);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzfxr.zzc(zzfwp.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m12601i(int i10) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzdn)).booleanValue()) {
            return ((Boolean) C4784a0.m12365c().zza(zzbgc.zzdo)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    /* renamed from: j */
    public static int[] m12602j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* renamed from: k */
    private static JSONObject m12603k(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", C4930x.m12474b().zzb(context, rect.right - rect.left));
        jSONObject.put("height", C4930x.m12474b().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", C4930x.m12474b().zzb(context, rect.left));
        jSONObject.put("y", C4930x.m12474b().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: l */
    private static int m12604l(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }
}
