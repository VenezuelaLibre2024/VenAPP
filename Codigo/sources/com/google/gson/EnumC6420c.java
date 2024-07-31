package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.c */
/* loaded from: classes2.dex */
public abstract class EnumC6420c implements InterfaceC6421d {
    private static final /* synthetic */ EnumC6420c[] $VALUES;
    public static final EnumC6420c IDENTITY;
    public static final EnumC6420c LOWER_CASE_WITH_DASHES;
    public static final EnumC6420c LOWER_CASE_WITH_DOTS;
    public static final EnumC6420c LOWER_CASE_WITH_UNDERSCORES;
    public static final EnumC6420c UPPER_CAMEL_CASE;
    public static final EnumC6420c UPPER_CAMEL_CASE_WITH_SPACES;
    public static final EnumC6420c UPPER_CASE_WITH_UNDERSCORES;

    /* renamed from: com.google.gson.c$a */
    /* loaded from: classes2.dex */
    enum a extends EnumC6420c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.InterfaceC6421d
        /* renamed from: b */
        public String mo18053b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        EnumC6420c enumC6420c = new EnumC6420c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6421d
            /* renamed from: b */
            public String mo18053b(Field field) {
                return EnumC6420c.m18052i(field.getName());
            }
        };
        UPPER_CAMEL_CASE = enumC6420c;
        EnumC6420c enumC6420c2 = new EnumC6420c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6421d
            /* renamed from: b */
            public String mo18053b(Field field) {
                return EnumC6420c.m18052i(EnumC6420c.m18051h(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = enumC6420c2;
        EnumC6420c enumC6420c3 = new EnumC6420c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6421d
            /* renamed from: b */
            public String mo18053b(Field field) {
                return EnumC6420c.m18051h(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = enumC6420c3;
        EnumC6420c enumC6420c4 = new EnumC6420c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6421d
            /* renamed from: b */
            public String mo18053b(Field field) {
                return EnumC6420c.m18051h(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = enumC6420c4;
        EnumC6420c enumC6420c5 = new EnumC6420c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6421d
            /* renamed from: b */
            public String mo18053b(Field field) {
                return EnumC6420c.m18051h(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = enumC6420c5;
        EnumC6420c enumC6420c6 = new EnumC6420c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6421d
            /* renamed from: b */
            public String mo18053b(Field field) {
                return EnumC6420c.m18051h(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = enumC6420c6;
        $VALUES = new EnumC6420c[]{aVar, enumC6420c, enumC6420c2, enumC6420c3, enumC6420c4, enumC6420c5, enumC6420c6};
    }

    private EnumC6420c(String str, int i10) {
    }

    /* synthetic */ EnumC6420c(String str, int i10, a aVar) {
        this(str, i10);
    }

    /* renamed from: h */
    static String m18051h(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* renamed from: i */
    static String m18052i(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static EnumC6420c valueOf(String str) {
        return (EnumC6420c) Enum.valueOf(EnumC6420c.class, str);
    }

    public static EnumC6420c[] values() {
        return (EnumC6420c[]) $VALUES.clone();
    }
}
