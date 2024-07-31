package p423wg;

import java.util.HashMap;
import java.util.Map;
import p066dg.C6952m;

/* renamed from: wg.r */
/* loaded from: classes2.dex */
final class C12197r {

    /* renamed from: a */
    private static final Map<String, a> f32469a;

    /* renamed from: b */
    private static final Map<String, a> f32470b;

    /* renamed from: c */
    private static final Map<String, a> f32471c;

    /* renamed from: d */
    private static final Map<String, a> f32472d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wg.r$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        final boolean f32473a;

        /* renamed from: b */
        final int f32474b;

        private a(boolean z10, int i10) {
            this.f32473a = z10;
            this.f32474b = i10;
        }

        /* renamed from: a */
        static a m39132a(int i10) {
            return new a(false, i10);
        }

        /* renamed from: b */
        static a m39133b(int i10) {
            return new a(true, i10);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f32469a = hashMap;
        hashMap.put("00", a.m39132a(18));
        hashMap.put("01", a.m39132a(14));
        hashMap.put("02", a.m39132a(14));
        hashMap.put("10", a.m39133b(20));
        hashMap.put("11", a.m39132a(6));
        hashMap.put("12", a.m39132a(6));
        hashMap.put("13", a.m39132a(6));
        hashMap.put("15", a.m39132a(6));
        hashMap.put("17", a.m39132a(6));
        hashMap.put("20", a.m39132a(2));
        hashMap.put("21", a.m39133b(20));
        hashMap.put("22", a.m39133b(29));
        hashMap.put("30", a.m39133b(8));
        hashMap.put("37", a.m39133b(8));
        for (int i10 = 90; i10 <= 99; i10++) {
            f32469a.put(String.valueOf(i10), a.m39133b(30));
        }
        HashMap hashMap2 = new HashMap();
        f32470b = hashMap2;
        hashMap2.put("240", a.m39133b(30));
        hashMap2.put("241", a.m39133b(30));
        hashMap2.put("242", a.m39133b(6));
        hashMap2.put("250", a.m39133b(30));
        hashMap2.put("251", a.m39133b(30));
        hashMap2.put("253", a.m39133b(17));
        hashMap2.put("254", a.m39133b(20));
        hashMap2.put("400", a.m39133b(30));
        hashMap2.put("401", a.m39133b(30));
        hashMap2.put("402", a.m39132a(17));
        hashMap2.put("403", a.m39133b(30));
        hashMap2.put("410", a.m39132a(13));
        hashMap2.put("411", a.m39132a(13));
        hashMap2.put("412", a.m39132a(13));
        hashMap2.put("413", a.m39132a(13));
        hashMap2.put("414", a.m39132a(13));
        hashMap2.put("420", a.m39133b(20));
        hashMap2.put("421", a.m39133b(15));
        hashMap2.put("422", a.m39132a(3));
        hashMap2.put("423", a.m39133b(15));
        hashMap2.put("424", a.m39132a(3));
        hashMap2.put("425", a.m39132a(3));
        hashMap2.put("426", a.m39132a(3));
        f32471c = new HashMap();
        for (int i11 = 310; i11 <= 316; i11++) {
            f32471c.put(String.valueOf(i11), a.m39132a(6));
        }
        for (int i12 = 320; i12 <= 336; i12++) {
            f32471c.put(String.valueOf(i12), a.m39132a(6));
        }
        for (int i13 = 340; i13 <= 357; i13++) {
            f32471c.put(String.valueOf(i13), a.m39132a(6));
        }
        for (int i14 = 360; i14 <= 369; i14++) {
            f32471c.put(String.valueOf(i14), a.m39132a(6));
        }
        Map<String, a> map = f32471c;
        map.put("390", a.m39133b(15));
        map.put("391", a.m39133b(18));
        map.put("392", a.m39133b(15));
        map.put("393", a.m39133b(18));
        map.put("703", a.m39133b(30));
        HashMap hashMap3 = new HashMap();
        f32472d = hashMap3;
        hashMap3.put("7001", a.m39132a(13));
        hashMap3.put("7002", a.m39133b(30));
        hashMap3.put("7003", a.m39132a(10));
        hashMap3.put("8001", a.m39132a(14));
        hashMap3.put("8002", a.m39133b(20));
        hashMap3.put("8003", a.m39133b(30));
        hashMap3.put("8004", a.m39133b(30));
        hashMap3.put("8005", a.m39132a(6));
        hashMap3.put("8006", a.m39132a(18));
        hashMap3.put("8007", a.m39133b(30));
        hashMap3.put("8008", a.m39133b(12));
        hashMap3.put("8018", a.m39132a(18));
        hashMap3.put("8020", a.m39133b(25));
        hashMap3.put("8100", a.m39132a(6));
        hashMap3.put("8101", a.m39132a(10));
        hashMap3.put("8102", a.m39132a(2));
        hashMap3.put("8110", a.m39133b(70));
        hashMap3.put("8200", a.m39133b(70));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m39129a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw C6952m.m20106a();
        }
        a aVar = f32469a.get(str.substring(0, 2));
        if (aVar != null) {
            boolean z10 = aVar.f32473a;
            int i10 = aVar.f32474b;
            return z10 ? m39131c(2, i10, str) : m39130b(2, i10, str);
        }
        if (str.length() < 3) {
            throw C6952m.m20106a();
        }
        String substring = str.substring(0, 3);
        a aVar2 = f32470b.get(substring);
        if (aVar2 != null) {
            return aVar2.f32473a ? m39131c(3, aVar2.f32474b, str) : m39130b(3, aVar2.f32474b, str);
        }
        if (str.length() < 4) {
            throw C6952m.m20106a();
        }
        a aVar3 = f32471c.get(substring);
        if (aVar3 != null) {
            boolean z11 = aVar3.f32473a;
            int i11 = aVar3.f32474b;
            return z11 ? m39131c(4, i11, str) : m39130b(4, i11, str);
        }
        a aVar4 = f32472d.get(str.substring(0, 4));
        if (aVar4 == null) {
            throw C6952m.m20106a();
        }
        boolean z12 = aVar4.f32473a;
        int i12 = aVar4.f32474b;
        return z12 ? m39131c(4, i12, str) : m39130b(4, i12, str);
    }

    /* renamed from: b */
    private static String m39130b(int i10, int i11, String str) {
        if (str.length() < i10) {
            throw C6952m.m20106a();
        }
        String substring = str.substring(0, i10);
        int i12 = i11 + i10;
        if (str.length() < i12) {
            throw C6952m.m20106a();
        }
        String substring2 = str.substring(i10, i12);
        String str2 = '(' + substring + ')' + substring2;
        String m39129a = m39129a(str.substring(i12));
        if (m39129a == null) {
            return str2;
        }
        return str2 + m39129a;
    }

    /* renamed from: c */
    private static String m39131c(int i10, int i11, String str) {
        String substring = str.substring(0, i10);
        int min = Math.min(str.length(), i11 + i10);
        String substring2 = str.substring(i10, min);
        String str2 = '(' + substring + ')' + substring2;
        String m39129a = m39129a(str.substring(min));
        if (m39129a == null) {
            return str2;
        }
        return str2 + m39129a;
    }
}
