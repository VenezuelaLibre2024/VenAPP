package com.google.android.datatransport.cct;

/* renamed from: com.google.android.datatransport.cct.e */
/* loaded from: classes.dex */
public final class C4706e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m11804a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
