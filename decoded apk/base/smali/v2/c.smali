.class public final Lv2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# instance fields
.field private a:Lv2/d;

.field private b:Lv2/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    new-instance v0, Lv2/b;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lv2/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lv2/c;->b:Lv2/b;

    new-instance v1, Lv2/d;

    invoke-direct {v1, v0}, Lv2/d;-><init>(Lv2/b;)V

    iput-object v1, p0, Lv2/c;->a:Lv2/d;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    invoke-virtual {v1, p1}, Lv2/d;->f(Lio/flutter/plugin/common/BinaryMessenger;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    iget-object p1, p0, Lv2/c;->a:Lv2/d;

    if-nez p1, :cond_0

    const-string p1, "GeocodingPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lv2/d;->g()V

    const/4 p1, 0x0

    iput-object p1, p0, Lv2/c;->a:Lv2/d;

    iput-object p1, p0, Lv2/c;->b:Lv2/b;

    return-void
.end method
