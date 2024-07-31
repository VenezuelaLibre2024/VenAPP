package p162ig;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import p066dg.EnumC6944e;

/* renamed from: ig.g */
/* loaded from: classes2.dex */
public final class C7975g {

    /* renamed from: a */
    private static final String f19378a = "g";

    /* renamed from: b */
    private static final Pattern f19379b = Pattern.compile(",");

    /* renamed from: a */
    public static Map<EnumC6944e, Object> m24516a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC6944e.class);
        for (EnumC6944e enumC6944e : EnumC6944e.values()) {
            if (enumC6944e != EnumC6944e.CHARACTER_SET && enumC6944e != EnumC6944e.NEED_RESULT_POINT_CALLBACK && enumC6944e != EnumC6944e.POSSIBLE_FORMATS) {
                String name = enumC6944e.name();
                if (extras.containsKey(name)) {
                    if (enumC6944e.m20091b().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!enumC6944e.m20091b().isInstance(obj)) {
                            Log.w(f19378a, "Ignoring hint " + enumC6944e + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put((EnumMap) enumC6944e, (EnumC6944e) obj);
                }
            }
        }
        Log.i(f19378a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
