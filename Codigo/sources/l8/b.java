package l8;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f20993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20995c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20996d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20997e;

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f20993a = i10;
        this.f20994b = i11;
        this.f20995c = i12;
        this.f20996d = i13;
        this.f20997e = i14;
    }

    public static b a(String str) {
        char c10;
        t8.a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String e10 = eb.c.e(split[i14].trim());
            e10.hashCode();
            switch (e10.hashCode()) {
                case 100571:
                    if (e10.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (e10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (e10.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (e10.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, split.length);
    }
}
