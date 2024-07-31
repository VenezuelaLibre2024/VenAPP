package p239mf;

import com.google.gson.C6495k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: mf.a */
/* loaded from: classes2.dex */
public class C9579a {
    /* renamed from: a */
    private static String m28528a(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        sb2.append('#');
        sb2.append(constructor.getDeclaringClass().getSimpleName());
        sb2.append('(');
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m28529b(Field field) {
        try {
            field.setAccessible(true);
        } catch (Exception e10) {
            throw new C6495k("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e10);
        }
    }

    /* renamed from: c */
    public static String m28530c(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + m28528a(constructor) + "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
        }
    }
}
