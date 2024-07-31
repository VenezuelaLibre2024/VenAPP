package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzadn {
    public static void zza(String str, zzacp zzacpVar, zzadk<?> zzadkVar, Type type, zzact zzactVar) {
        String str2;
        try {
            s.j(zzacpVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzacpVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzactVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzadkVar, type);
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
                throw th2;
            }
        } catch (NullPointerException e10) {
            e = e10;
            str2 = e.getMessage();
            zzadkVar.zza(str2);
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            zzadkVar.zza(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            zzadkVar.zza(str2);
        } catch (IOException e11) {
            e = e11;
            str2 = e.getMessage();
            zzadkVar.zza(str2);
        } catch (JSONException e12) {
            e = e12;
            str2 = e.getMessage();
            zzadkVar.zza(str2);
        }
    }

    public static void zza(String str, zzadk<?> zzadkVar, Type type, zzact zzactVar) {
        String message;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzactVar.zza(httpURLConnection);
            zza(httpURLConnection, zzadkVar, type);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzadkVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzadkVar.zza(message);
        } catch (IOException e10) {
            message = e10.getMessage();
            zzadkVar.zza(message);
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzadk<?> zzadkVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        }
                        throw th2;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (zza(responseCode)) {
                    zzadkVar.zza((zzadk<?>) zzacq.zza(sb3, type));
                } else {
                    zzadkVar.zza((String) zzacq.zza(sb3, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzaaf e10) {
                e = e10;
                zzadkVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzadkVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e11) {
                e = e11;
                zzadkVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th4) {
            httpURLConnection.disconnect();
            throw th4;
        }
    }

    private static final boolean zza(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
