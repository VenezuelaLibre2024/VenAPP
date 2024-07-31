.class abstract Lio/flutter/plugins/webviewflutter/FlutterAssetManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/FlutterAssetManager$PluginBindingFlutterAssetManager;,
        Lio/flutter/plugins/webviewflutter/FlutterAssetManager$RegistrarFlutterAssetManager;
    }
.end annotation


# instance fields
.field final assetManager:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/FlutterAssetManager;->assetManager:Landroid/content/res/AssetManager;

    return-void
.end method


# virtual methods
.method abstract getAssetFilePathByName(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public list(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/FlutterAssetManager;->assetManager:Landroid/content/res/AssetManager;

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
