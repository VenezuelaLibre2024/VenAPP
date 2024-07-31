package io.flutter.plugins.firebase.auth;

import android.net.Uri;
import com.google.firebase.auth.e;
import com.google.firebase.auth.n0;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class PigeonParser {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.firebase.auth.e getActionCodeSettings(GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings) {
        e.a A1 = com.google.firebase.auth.e.A1();
        A1.f(pigeonActionCodeSettings.getUrl());
        if (pigeonActionCodeSettings.getDynamicLinkDomain() != null) {
            A1.c(pigeonActionCodeSettings.getDynamicLinkDomain());
        }
        A1.d(pigeonActionCodeSettings.getHandleCodeInApp().booleanValue());
        if (pigeonActionCodeSettings.getAndroidPackageName() != null) {
            A1.b(pigeonActionCodeSettings.getAndroidPackageName(), pigeonActionCodeSettings.getAndroidInstallApp().booleanValue(), pigeonActionCodeSettings.getAndroidMinimumVersion());
        }
        if (pigeonActionCodeSettings.getIOSBundleId() != null) {
            A1.e(pigeonActionCodeSettings.getIOSBundleId());
        }
        return A1.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.firebase.auth.h getCredential(Map<String, Object> map) {
        if (map.get(Constants.TOKEN) != null) {
            com.google.firebase.auth.h hVar = FlutterFirebaseAuthPlugin.authCredentials.get(Integer.valueOf(((Integer) map.get(Constants.TOKEN)).intValue()));
            if (hVar != null) {
                return hVar;
            }
            throw FlutterFirebaseAuthPluginException.invalidCredential();
        }
        Object obj = map.get(Constants.SIGN_IN_METHOD);
        Objects.requireNonNull(obj);
        String str = (String) obj;
        String str2 = (String) map.get(Constants.SECRET);
        String str3 = (String) map.get(Constants.ID_TOKEN);
        String str4 = (String) map.get(Constants.ACCESS_TOKEN);
        String str5 = (String) map.get(Constants.RAW_NONCE);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals(Constants.SIGN_IN_METHOD_TWITTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals(Constants.SIGN_IN_METHOD_GOOGLE)) {
                    c10 = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals(Constants.SIGN_IN_METHOD_FACEBOOK)) {
                    c10 = 2;
                    break;
                }
                break;
            case 105516695:
                if (str.equals(Constants.SIGN_IN_METHOD_OAUTH)) {
                    c10 = 3;
                    break;
                }
                break;
            case 106642798:
                if (str.equals(Constants.SIGN_IN_METHOD_PHONE)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals(Constants.SIGN_IN_METHOD_GITHUB)) {
                    c10 = 6;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Objects.requireNonNull(str4);
                Objects.requireNonNull(str2);
                return com.google.firebase.auth.b1.a(str4, str2);
            case 1:
                return com.google.firebase.auth.g0.a(str3, str4);
            case 2:
                Objects.requireNonNull(str4);
                return com.google.firebase.auth.m.a(str4);
            case 3:
                Object obj2 = map.get(Constants.PROVIDER_ID);
                Objects.requireNonNull(obj2);
                n0.b f10 = com.google.firebase.auth.n0.f((String) obj2);
                Objects.requireNonNull(str4);
                f10.b(str4);
                Objects.requireNonNull(str3);
                if (str5 == null) {
                    f10.c(str3);
                } else {
                    f10.d(str3, str5);
                }
                return f10.a();
            case 4:
                Object obj3 = map.get(Constants.VERIFICATION_ID);
                Objects.requireNonNull(obj3);
                Object obj4 = map.get(Constants.SMS_CODE);
                Objects.requireNonNull(obj4);
                return com.google.firebase.auth.q0.a((String) obj3, (String) obj4);
            case 5:
                Object obj5 = map.get(Constants.EMAIL);
                Objects.requireNonNull(obj5);
                Objects.requireNonNull(str2);
                return com.google.firebase.auth.k.a((String) obj5, str2);
            case 6:
                Objects.requireNonNull(str4);
                return com.google.firebase.auth.e0.a(str4);
            case 7:
                Object obj6 = map.get(Constants.EMAIL);
                Objects.requireNonNull(obj6);
                Object obj7 = map.get("emailLink");
                Objects.requireNonNull(obj7);
                return com.google.firebase.auth.k.b((String) obj6, (String) obj7);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<List<Object>> multiFactorInfoToMap(List<com.google.firebase.auth.j0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> it = multiFactorInfoToPigeon(list).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toList());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> multiFactorInfoToPigeon(List<com.google.firebase.auth.j0> list) {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.j0 j0Var : list) {
            arrayList.add((j0Var instanceof com.google.firebase.auth.t0 ? new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder().setPhoneNumber(((com.google.firebase.auth.t0) j0Var).E()) : new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder()).setDisplayName(j0Var.R()).setEnrollmentTimestamp(Double.valueOf(j0Var.u1())).setUid(j0Var.l()).setFactorId(j0Var.v1()).build());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo parseActionCodeResult(com.google.firebase.auth.d dVar) {
        GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation actionCodeInfoOperation;
        com.google.firebase.auth.b a10;
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder();
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder builder2 = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder();
        int b10 = dVar.b();
        if (b10 == 0) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.PASSWORD_RESET;
        } else if (b10 == 1) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_EMAIL;
        } else if (b10 == 2) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.RECOVER_EMAIL;
        } else if (b10 == 4) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.EMAIL_SIGN_IN;
        } else {
            if (b10 != 5) {
                if (b10 == 6) {
                    actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.REVERT_SECOND_FACTOR_ADDITION;
                }
                a10 = dVar.a();
                if ((a10 == null && b10 == 1) || b10 == 0) {
                    builder2.setEmail(a10.a());
                } else if (b10 != 2 || b10 == 5) {
                    Objects.requireNonNull(a10);
                    com.google.firebase.auth.a aVar = (com.google.firebase.auth.a) a10;
                    builder2.setEmail(aVar.a());
                    builder2.setPreviousEmail(aVar.b());
                }
                builder.setData(builder2.build());
                return builder.build();
            }
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_AND_CHANGE_EMAIL;
        }
        builder.setOperation(actionCodeInfoOperation);
        a10 = dVar.a();
        if (a10 == null) {
        }
        if (b10 != 2) {
        }
        Objects.requireNonNull(a10);
        com.google.firebase.auth.a aVar2 = (com.google.firebase.auth.a) a10;
        builder2.setEmail(aVar2.a());
        builder2.setPreviousEmail(aVar2.b());
        builder.setData(builder2.build());
        return builder.build();
    }

    private static GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo parseAdditionalUserInfo(com.google.firebase.auth.g gVar) {
        if (gVar == null) {
            return null;
        }
        GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder();
        builder.setIsNewUser(Boolean.valueOf(gVar.m0()));
        builder.setProfile(gVar.b1());
        builder.setProviderId(gVar.q());
        builder.setUsername(gVar.L0());
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GeneratedAndroidFirebaseAuth.PigeonAuthCredential parseAuthCredential(com.google.firebase.auth.h hVar) {
        if (hVar == null) {
            return null;
        }
        int hashCode = hVar.hashCode();
        FlutterFirebaseAuthPlugin.authCredentials.put(Integer.valueOf(hashCode), hVar);
        GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder();
        builder.setProviderId(hVar.u1());
        builder.setSignInMethod(hVar.v1());
        builder.setNativeId(Long.valueOf(hashCode));
        if (hVar instanceof com.google.firebase.auth.m0) {
            builder.setAccessToken(((com.google.firebase.auth.m0) hVar).x1());
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GeneratedAndroidFirebaseAuth.PigeonUserCredential parseAuthResult(com.google.firebase.auth.i iVar) {
        GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder();
        builder.setAdditionalUserInfo(parseAdditionalUserInfo(iVar.W0()));
        builder.setCredential(parseAuthCredential(iVar.a1()));
        builder.setUser(parseFirebaseUser(iVar.j0()));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser(com.google.firebase.auth.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder();
        GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder builder2 = new GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder();
        builder2.setDisplayName(a0Var.R());
        builder2.setEmail(a0Var.r());
        builder2.setIsEmailVerified(Boolean.valueOf(a0Var.B0()));
        builder2.setIsAnonymous(Boolean.valueOf(a0Var.A1()));
        if (a0Var.w1() != null) {
            builder2.setCreationTimestamp(Long.valueOf(a0Var.w1().I()));
            builder2.setLastSignInTimestamp(Long.valueOf(a0Var.w1().S()));
        }
        builder2.setPhoneNumber(a0Var.E());
        builder2.setPhotoUrl(parsePhotoUrl(a0Var.v0()));
        builder2.setUid(a0Var.l());
        builder2.setTenantId(a0Var.z1());
        builder.setUserInfo(builder2.build());
        builder.setProviderData(parseUserInfoList(a0Var.y1()));
        return builder.build();
    }

    private static String parsePhotoUrl(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GeneratedAndroidFirebaseAuth.PigeonIdTokenResult parseTokenResult(com.google.firebase.auth.c0 c0Var) {
        GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder();
        builder.setToken(c0Var.g());
        builder.setSignInProvider(c0Var.e());
        builder.setAuthTimestamp(Long.valueOf(c0Var.a() * 1000));
        builder.setExpirationTimestamp(Long.valueOf(c0Var.c() * 1000));
        builder.setIssuedAtTimestamp(Long.valueOf(c0Var.d() * 1000));
        builder.setClaims(c0Var.b());
        builder.setSignInSecondFactor(c0Var.f());
        return builder.build();
    }

    private static List<Map<Object, Object>> parseUserInfoList(List<? extends com.google.firebase.auth.c1> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.c1 c1Var = (com.google.firebase.auth.c1) it.next();
            if (c1Var != null && !"firebase".equals(c1Var.q())) {
                arrayList.add(parseUserInfoToMap(c1Var));
            }
        }
        return arrayList;
    }

    private static Map<Object, Object> parseUserInfoToMap(com.google.firebase.auth.c1 c1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", c1Var.R());
        hashMap.put(Constants.EMAIL, c1Var.r());
        hashMap.put("isEmailVerified", Boolean.valueOf(c1Var.B0()));
        hashMap.put("phoneNumber", c1Var.E());
        hashMap.put("photoUrl", parsePhotoUrl(c1Var.v0()));
        hashMap.put("uid", c1Var.l() == null ? "" : c1Var.l());
        hashMap.put(Constants.PROVIDER_ID, c1Var.q());
        hashMap.put("isAnonymous", Boolean.FALSE);
        return hashMap;
    }
}
