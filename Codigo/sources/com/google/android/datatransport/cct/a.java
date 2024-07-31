package com.google.android.datatransport.cct;

import h6.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f8092c;

    /* renamed from: d, reason: collision with root package name */
    static final String f8093d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f8094e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<f6.b> f8095f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f8096g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f8097h;

    /* renamed from: a, reason: collision with root package name */
    private final String f8098a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8099b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8092c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f8093d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8094e = a12;
        f8095f = Collections.unmodifiableSet(new HashSet(Arrays.asList(f6.b.b("proto"), f6.b.b("json"))));
        f8096g = new a(a10, null);
        f8097h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f8098a = str;
        this.f8099b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // h6.g
    public Set<f6.b> a() {
        return f8095f;
    }

    public byte[] b() {
        String str = this.f8099b;
        if (str == null && this.f8098a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f8098a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f8099b;
    }

    public String e() {
        return this.f8098a;
    }

    @Override // h6.f
    public byte[] getExtras() {
        return b();
    }

    @Override // h6.f
    public String getName() {
        return "cct";
    }
}
