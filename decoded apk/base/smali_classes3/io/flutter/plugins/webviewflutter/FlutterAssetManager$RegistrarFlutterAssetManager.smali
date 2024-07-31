.class Lio/flutter/plugins/webviewflutter/FlutterAssetManager$RegistrarFlutterAssetManager;
.super Lio/flutter/plugins/webviewflutter/FlutterAssetManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/FlutterAssetManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RegistrarFlutterAssetManager"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field final registrar:Lio/flutter/plugin/common/PluginRegistry$Registrar;


# direct methods
.method constructor <init>(Landroid/content/res/AssetManager;Lio/flutter/plugin/common/PluginRegistry$Registrar;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/FlutterAssetManager;-><init>(Landroid/content/res/AssetManager;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/FlutterAssetManager$RegistrarFlutterAssetManager;->registrar:Lio/flutter/plugin/common/PluginRegistry$Registrar;

    return-void
.end method


# virtual methods
.method public getAssetFilePathByName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/FlutterAssetManager$RegistrarFlutterAssetManager;->registrar:Lio/flutter/plugin/common/PluginRegistry$Registrar;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->lookupKeyForAsset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
