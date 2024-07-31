package nm;

import io.flutter.plugin.common.MethodCall;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final a b(MethodCall methodCall) {
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
            return new a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required".toString());
    }

    public static final String c(String str) {
        kotlin.jvm.internal.n.e(str, "<this>");
        String upperCase = new xk.f("(.) (.)").b(new xk.f("(.)(\\p{Upper})").b(str, "$1_$2"), "$1_$2").toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.n.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
