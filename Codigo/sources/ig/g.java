package ig;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17715a = "g";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f17716b = Pattern.compile(",");

    public static Map<dg.e, Object> a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(dg.e.class);
        for (dg.e eVar : dg.e.values()) {
            if (eVar != dg.e.CHARACTER_SET && eVar != dg.e.NEED_RESULT_POINT_CALLBACK && eVar != dg.e.POSSIBLE_FORMATS) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.b().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.b().isInstance(obj)) {
                            Log.w(f17715a, "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put((EnumMap) eVar, (dg.e) obj);
                }
            }
        }
        Log.i(f17715a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
