package la;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: la.m */
/* loaded from: classes.dex */
public final class C9468m {

    /* renamed from: a */
    private static final Pattern f23010a = Pattern.compile("\\\\.");

    /* renamed from: b */
    private static final Pattern f23011b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* renamed from: a */
    public static String m28161a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f23011b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                str2 = "\\\\f";
            } else if (charAt == '\r') {
                str2 = "\\\\r";
            } else if (charAt == '\"') {
                str2 = "\\\\\\\"";
            } else if (charAt == '/') {
                str2 = "\\\\/";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        str2 = "\\\\b";
                        break;
                    case '\t':
                        str2 = "\\\\t";
                        break;
                    case '\n':
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
