package p257nk;

import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.InterfaceC9312d;
import p405vk.InterfaceC11966c;

/* renamed from: nk.a */
/* loaded from: classes3.dex */
public final class C9728a {
    /* renamed from: a */
    public static final <T> Class<T> m29160a(InterfaceC11966c<T> interfaceC11966c) {
        C9322n.m27781e(interfaceC11966c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC9312d) interfaceC11966c).mo27769a();
        C9322n.m27779c(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* renamed from: b */
    public static final <T> Class<T> m29161b(InterfaceC11966c<T> interfaceC11966c) {
        C9322n.m27781e(interfaceC11966c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC9312d) interfaceC11966c).mo27769a();
        if (!cls.isPrimitive()) {
            C9322n.m27779c(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        C9322n.m27779c(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }
}
