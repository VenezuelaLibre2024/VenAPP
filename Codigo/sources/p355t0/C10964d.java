package p355t0;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.C0984h;

/* renamed from: t0.d */
/* loaded from: classes.dex */
public final class C10964d {

    /* renamed from: a */
    private static final String[] f27870a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m33460a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    /* renamed from: a */
    public static String[] m33452a(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f27870a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f27870a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f27870a;
    }

    /* renamed from: b */
    private static boolean m33453b(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    /* renamed from: c */
    private static boolean m33454c(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    /* renamed from: d */
    public static void m33455d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m33456e(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        C0984h.m4833k(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m33460a(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            m33458g(editorInfo, null, 0, 0);
            return;
        }
        if (m33454c(editorInfo.inputType)) {
            m33458g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m33458g(editorInfo, charSequence, i13, i14);
        } else {
            m33459h(editorInfo, charSequence, i13, i14);
        }
    }

    /* renamed from: f */
    public static void m33457f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m33460a(editorInfo, charSequence, 0);
        } else {
            m33456e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m33458g(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    /* renamed from: h */
    private static void m33459h(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (m33453b(charSequence, i15, 0)) {
            i15++;
            min2--;
        }
        if (m33453b(charSequence, (i11 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i11, min + i11)) : charSequence.subSequence(i15, min2 + i13 + min + i15);
        int i16 = min2 + 0;
        m33458g(editorInfo, concat, i16, i13 + i16);
    }
}
