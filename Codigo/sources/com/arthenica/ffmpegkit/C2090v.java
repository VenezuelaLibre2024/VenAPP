package com.arthenica.ffmpegkit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.arthenica.ffmpegkit.v */
/* loaded from: classes.dex */
public class C2090v {

    /* renamed from: a */
    private static final List<String> f8230a;

    static {
        ArrayList arrayList = new ArrayList();
        f8230a = arrayList;
        arrayList.add("dav1d");
        arrayList.add("fontconfig");
        arrayList.add("freetype");
        arrayList.add("fribidi");
        arrayList.add("gmp");
        arrayList.add("gnutls");
        arrayList.add("kvazaar");
        arrayList.add("mp3lame");
        arrayList.add("libass");
        arrayList.add("iconv");
        arrayList.add("libilbc");
        arrayList.add("libtheora");
        arrayList.add("libvidstab");
        arrayList.add("libvorbis");
        arrayList.add("libvpx");
        arrayList.add("libwebp");
        arrayList.add("libxml2");
        arrayList.add("opencore-amr");
        arrayList.add("openh264");
        arrayList.add("openssl");
        arrayList.add("opus");
        arrayList.add("rubberband");
        arrayList.add("sdl2");
        arrayList.add("shine");
        arrayList.add("snappy");
        arrayList.add("soxr");
        arrayList.add("speex");
        arrayList.add("srt");
        arrayList.add("tesseract");
        arrayList.add("twolame");
        arrayList.add("x264");
        arrayList.add("x265");
        arrayList.add("xvid");
        arrayList.add("zimg");
    }

    /* renamed from: a */
    public static List<String> m10547a() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        for (String str : f8230a) {
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static String m10548b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        List<String> m10547a = m10547a();
        boolean contains = m10547a.contains("speex");
        boolean contains2 = m10547a.contains("fribidi");
        boolean contains3 = m10547a.contains("gnutls");
        boolean contains4 = m10547a.contains("xvid");
        boolean z15 = true;
        boolean z16 = false;
        if (contains && contains2) {
            z10 = false;
            z11 = false;
            z13 = false;
            if (contains4) {
                z12 = false;
                z14 = false;
            } else {
                z12 = false;
                z14 = false;
                z16 = true;
                z15 = false;
            }
        } else {
            if (contains) {
                z11 = true;
                z10 = false;
                z13 = false;
            } else {
                if (contains2) {
                    z10 = true;
                    z11 = false;
                } else if (contains4) {
                    if (contains3) {
                        z13 = true;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z15 = z12;
                        z14 = z15;
                    } else {
                        z14 = true;
                        z10 = false;
                        z11 = false;
                        z13 = false;
                        z12 = false;
                        z15 = false;
                    }
                } else if (contains3) {
                    z12 = true;
                    z10 = false;
                    z11 = false;
                    z13 = false;
                    z15 = false;
                    z14 = z15;
                } else {
                    z10 = false;
                    z11 = false;
                }
                z13 = z11;
            }
            z12 = z13;
            z15 = z12;
            z14 = z15;
        }
        return z15 ? (m10547a.contains("dav1d") && m10547a.contains("fontconfig") && m10547a.contains("freetype") && m10547a.contains("fribidi") && m10547a.contains("gmp") && m10547a.contains("gnutls") && m10547a.contains("kvazaar") && m10547a.contains("mp3lame") && m10547a.contains("libass") && m10547a.contains("iconv") && m10547a.contains("libilbc") && m10547a.contains("libtheora") && m10547a.contains("libvidstab") && m10547a.contains("libvorbis") && m10547a.contains("libvpx") && m10547a.contains("libwebp") && m10547a.contains("libxml2") && m10547a.contains("opencore-amr") && m10547a.contains("opus") && m10547a.contains("shine") && m10547a.contains("snappy") && m10547a.contains("soxr") && m10547a.contains("speex") && m10547a.contains("twolame") && m10547a.contains("x264") && m10547a.contains("x265") && m10547a.contains("xvid") && m10547a.contains("zimg")) ? "full-gpl" : "custom" : z16 ? (m10547a.contains("dav1d") && m10547a.contains("fontconfig") && m10547a.contains("freetype") && m10547a.contains("fribidi") && m10547a.contains("gmp") && m10547a.contains("gnutls") && m10547a.contains("kvazaar") && m10547a.contains("mp3lame") && m10547a.contains("libass") && m10547a.contains("iconv") && m10547a.contains("libilbc") && m10547a.contains("libtheora") && m10547a.contains("libvorbis") && m10547a.contains("libvpx") && m10547a.contains("libwebp") && m10547a.contains("libxml2") && m10547a.contains("opencore-amr") && m10547a.contains("opus") && m10547a.contains("shine") && m10547a.contains("snappy") && m10547a.contains("soxr") && m10547a.contains("speex") && m10547a.contains("twolame") && m10547a.contains("zimg")) ? "full" : "custom" : z10 ? (m10547a.contains("dav1d") && m10547a.contains("fontconfig") && m10547a.contains("freetype") && m10547a.contains("fribidi") && m10547a.contains("kvazaar") && m10547a.contains("libass") && m10547a.contains("iconv") && m10547a.contains("libtheora") && m10547a.contains("libvpx") && m10547a.contains("libwebp") && m10547a.contains("snappy") && m10547a.contains("zimg")) ? "video" : "custom" : z11 ? (m10547a.contains("mp3lame") && m10547a.contains("libilbc") && m10547a.contains("libvorbis") && m10547a.contains("opencore-amr") && m10547a.contains("opus") && m10547a.contains("shine") && m10547a.contains("soxr") && m10547a.contains("speex") && m10547a.contains("twolame")) ? "audio" : "custom" : z13 ? (m10547a.contains("gmp") && m10547a.contains("gnutls") && m10547a.contains("libvidstab") && m10547a.contains("x264") && m10547a.contains("x265") && m10547a.contains("xvid")) ? "https-gpl" : "custom" : z12 ? (m10547a.contains("gmp") && m10547a.contains("gnutls")) ? "https" : "custom" : z14 ? (m10547a.contains("libvidstab") && m10547a.contains("x264") && m10547a.contains("x265") && m10547a.contains("xvid")) ? "min-gpl" : "custom" : m10547a.size() == 0 ? "min" : "custom";
    }
}
