package io.flutter.plugins;

import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import gi.d;
import hh.e;
import ii.a;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.camera.CameraPlugin;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.inappmessaging.FirebaseInAppMessagingPlugin;
import io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin;
import io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import ji.f;
import nm.m;
import oi.z;
import r5.b;
import s2.k;
import sh.c;
import yh.b0;

@Keep
/* loaded from: classes3.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new a());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin android_id, dev.fluttercommunity.android_id.AndroidIdPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new ph.a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin android_path_provider, com.mix1009.android_path_provider.AndroidPathProviderPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new c());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin audio_waveforms, com.simform.audio_waveforms.AudioWaveformsPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new m());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new CameraPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new f());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new ki.a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new g4.a());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin devicelocale, com.example.devicelocale.DevicelocalePlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new k());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin ffmpeg_kit_flutter_min_gpl, com.arthenica.ffmpegkit.flutter.FFmpegKitFlutterPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new FilePickerPlugin());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAppCheckPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin firebase_app_check, io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new FirebaseInstallationsPlugin());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin firebase_app_installations, io.flutter.plugins.firebase.installations.firebase_app_installations.FirebaseInstallationsPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAuthPlugin());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseDynamicLinksPlugin());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin firebase_dynamic_links, io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new FirebaseInAppMessagingPlugin());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin firebase_in_app_messaging, io.flutter.plugins.firebase.inappmessaging.FirebaseInAppMessagingPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseMessagingPlugin());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebasePerformancePlugin());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseStoragePlugin());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add(new ri.a());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin flutter_app_badger, fr.g123k.flutterappbadger.FlutterAppBadgerPlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new vn.hunghd.flutterdownloader.a());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new o2.c());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin flutter_facebook_auth, app.meedu.flutter_facebook_auth.FlutterFacebookAuthPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new h5.a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin flutter_image_compress, com.fluttercandies.flutter_image_compress.ImageCompressPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add(new InAppWebViewFlutterPlugin());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add(new p2.a());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin flutter_jailbreak_detection, appmire.be.flutterjailbreakdetection.FlutterJailbreakDetectionPlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add(new kh.a());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterLocalNotificationsPlugin());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add(new ol.a());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e40);
        }
        try {
            flutterEngine.getPlugins().add(new e());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e41);
        }
        try {
            flutterEngine.getPlugins().add(new d3.e());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin flutter_uploader, com.bluechilli.flutteruploader.FlutterUploaderPlugin", e42);
        }
        try {
            flutterEngine.getPlugins().add(new v2.c());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin geocoding_android, com.baseflow.geocoding.GeocodingPlugin", e43);
        }
        try {
            flutterEngine.getPlugins().add(new com.baseflow.geolocator.a());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e44);
        }
        try {
            flutterEngine.getPlugins().add(new ui.a());
        } catch (Exception e45) {
            Log.e(TAG, "Error registering plugin google_api_headers, io.github.zeshuaro.google_api_headers.GoogleApiHeadersPlugin", e45);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleMapsPlugin());
        } catch (Exception e46) {
            Log.e(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e46);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleMobileAdsPlugin());
        } catch (Exception e47) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e47);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleSignInPlugin());
        } catch (Exception e48) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e48);
        }
        try {
            flutterEngine.getPlugins().add(new km.c());
        } catch (Exception e49) {
            Log.e(TAG, "Error registering plugin image_cropper, vn.hunghd.flutter.plugins.imagecropper.ImageCropperPlugin", e49);
        }
        try {
            flutterEngine.getPlugins().add(new ImagePickerPlugin());
        } catch (Exception e50) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e50);
        }
        try {
            flutterEngine.getPlugins().add(new lh.a());
        } catch (Exception e51) {
            Log.e(TAG, "Error registering plugin image_picker_plus, com.lykhonis.imagecrop.ImageCropPlugin", e51);
        }
        try {
            flutterEngine.getPlugins().add(new z());
        } catch (Exception e52) {
            Log.e(TAG, "Error registering plugin mobile_scanner, dev.steenbakker.mobile_scanner.MobileScannerPlugin", e52);
        }
        try {
            flutterEngine.getPlugins().add(new e4.a());
        } catch (Exception e53) {
            Log.e(TAG, "Error registering plugin open_filex, com.crazecoder.openfile.OpenFilePlugin", e53);
        }
        try {
            flutterEngine.getPlugins().add(new gh.c());
        } catch (Exception e54) {
            Log.e(TAG, "Error registering plugin open_mail_app, com.homex.open_mail_app.OpenMailAppPlugin", e54);
        }
        try {
            flutterEngine.getPlugins().add(new li.c());
        } catch (Exception e55) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e55);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e56) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e56);
        }
        try {
            flutterEngine.getPlugins().add(new c3.m());
        } catch (Exception e57) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e57);
        }
        try {
            flutterEngine.getPlugins().add(new b());
        } catch (Exception e58) {
            Log.e(TAG, "Error registering plugin photo_manager, com.fluttercandies.photo_manager.PhotoManagerPlugin", e58);
        }
        try {
            flutterEngine.getPlugins().add(new pl.b());
        } catch (Exception e59) {
            Log.e(TAG, "Error registering plugin qr_code_scanner, net.touchcapture.qr.flutterqr.FlutterQrPlugin", e59);
        }
        try {
            flutterEngine.getPlugins().add(new d());
        } catch (Exception e60) {
            Log.e(TAG, "Error registering plugin share_extend, com.zt.shareextend.ShareExtendPlugin", e60);
        }
        try {
            flutterEngine.getPlugins().add(new mi.c());
        } catch (Exception e61) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e61);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e62) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e62);
        }
        try {
            flutterEngine.getPlugins().add(new q2.a());
        } catch (Exception e63) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e63);
        }
        try {
            flutterEngine.getPlugins().add(new jm.b());
        } catch (Exception e64) {
            Log.e(TAG, "Error registering plugin soundpool, pl.ukaszapps.soundpool.SoundpoolPlugin", e64);
        }
        try {
            flutterEngine.getPlugins().add(new b0());
        } catch (Exception e65) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e65);
        }
        try {
            flutterEngine.getPlugins().add(new h4.a());
        } catch (Exception e66) {
            Log.e(TAG, "Error registering plugin system_info_plus, com.example.system_info_plus.SystemInfoPlusPlugin", e66);
        }
        try {
            flutterEngine.getPlugins().add(new mh.b());
        } catch (Exception e67) {
            Log.e(TAG, "Error registering plugin twitter_login, com.maru.twitter_login.TwitterLoginPlugin", e67);
        }
        try {
            flutterEngine.getPlugins().add(new nl.a());
        } catch (Exception e68) {
            Log.e(TAG, "Error registering plugin uni_links, name.avioli.unilinks.UniLinksPlugin", e68);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e69) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e69);
        }
        try {
            flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        } catch (Exception e70) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e70);
        }
        try {
            flutterEngine.getPlugins().add(new mm.a());
        } catch (Exception e71) {
            Log.e(TAG, "Error registering plugin video_thumbnail, xyz.justsoft.video_thumbnail.VideoThumbnailPlugin", e71);
        }
        try {
            flutterEngine.getPlugins().add(new ni.c());
        } catch (Exception e72) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e72);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e73) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e73);
        }
    }
}
