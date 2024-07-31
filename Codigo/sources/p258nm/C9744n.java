package p258nm;

import io.flutter.plugin.common.MethodCall;
import java.util.Locale;
import kotlin.jvm.internal.C9322n;
import p450xk.C12514f;

/* renamed from: nm.n */
/* loaded from: classes3.dex */
public final class C9744n {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final C9731a m29217b(MethodCall methodCall) {
        Boolean bool = (Boolean) methodCall.argument("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required".toString());
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) methodCall.argument("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required".toString());
        }
        boolean booleanValue2 = bool2.booleanValue();
        Integer num = (Integer) methodCall.argument("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required".toString());
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) methodCall.argument("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required".toString());
        }
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) methodCall.argument("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required".toString());
        }
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) methodCall.argument("audioMode");
        if (num4 != null) {
            return new C9731a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required".toString());
    }

    /* renamed from: c */
    public static final String m29218c(String str) {
        C9322n.m27781e(str, "<this>");
        String upperCase = new C12514f("(.) (.)").m40970b(new C12514f("(.)(\\p{Upper})").m40970b(str, "$1_$2"), "$1_$2").toUpperCase(Locale.ROOT);
        C9322n.m27780d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
