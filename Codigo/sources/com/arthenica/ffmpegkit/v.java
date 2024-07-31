package com.arthenica.ffmpegkit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f7278a;

    static {
        ArrayList arrayList = new ArrayList();
        f7278a = arrayList;
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

    public static List<String> a() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        for (String str : f7278a) {
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        List<String> a10 = a();
        boolean contains = a10.contains("speex");
        boolean contains2 = a10.contains("fribidi");
        boolean contains3 = a10.contains("gnutls");
        boolean contains4 = a10.contains("xvid");
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
        return z15 ? (a10.contains("dav1d") && a10.contains("fontconfig") && a10.contains("freetype") && a10.contains("fribidi") && a10.contains("gmp") && a10.contains("gnutls") && a10.contains("kvazaar") && a10.contains("mp3lame") && a10.contains("libass") && a10.contains("iconv") && a10.contains("libilbc") && a10.contains("libtheora") && a10.contains("libvidstab") && a10.contains("libvorbis") && a10.contains("libvpx") && a10.contains("libwebp") && a10.contains("libxml2") && a10.contains("opencore-amr") && a10.contains("opus") && a10.contains("shine") && a10.contains("snappy") && a10.contains("soxr") && a10.contains("speex") && a10.contains("twolame") && a10.contains("x264") && a10.contains("x265") && a10.contains("xvid") && a10.contains("zimg")) ? "full-gpl" : "custom" : z16 ? (a10.contains("dav1d") && a10.contains("fontconfig") && a10.contains("freetype") && a10.contains("fribidi") && a10.contains("gmp") && a10.contains("gnutls") && a10.contains("kvazaar") && a10.contains("mp3lame") && a10.contains("libass") && a10.contains("iconv") && a10.contains("libilbc") && a10.contains("libtheora") && a10.contains("libvorbis") && a10.contains("libvpx") && a10.contains("libwebp") && a10.contains("libxml2") && a10.contains("opencore-amr") && a10.contains("opus") && a10.contains("shine") && a10.contains("snappy") && a10.contains("soxr") && a10.contains("speex") && a10.contains("twolame") && a10.contains("zimg")) ? "full" : "custom" : z10 ? (a10.contains("dav1d") && a10.contains("fontconfig") && a10.contains("freetype") && a10.contains("fribidi") && a10.contains("kvazaar") && a10.contains("libass") && a10.contains("iconv") && a10.contains("libtheora") && a10.contains("libvpx") && a10.contains("libwebp") && a10.contains("snappy") && a10.contains("zimg")) ? "video" : "custom" : z11 ? (a10.contains("mp3lame") && a10.contains("libilbc") && a10.contains("libvorbis") && a10.contains("opencore-amr") && a10.contains("opus") && a10.contains("shine") && a10.contains("soxr") && a10.contains("speex") && a10.contains("twolame")) ? "audio" : "custom" : z13 ? (a10.contains("gmp") && a10.contains("gnutls") && a10.contains("libvidstab") && a10.contains("x264") && a10.contains("x265") && a10.contains("xvid")) ? "https-gpl" : "custom" : z12 ? (a10.contains("gmp") && a10.contains("gnutls")) ? "https" : "custom" : z14 ? (a10.contains("libvidstab") && a10.contains("x264") && a10.contains("x265") && a10.contains("xvid")) ? "min-gpl" : "custom" : a10.size() == 0 ? "min" : "custom";
    }
}
