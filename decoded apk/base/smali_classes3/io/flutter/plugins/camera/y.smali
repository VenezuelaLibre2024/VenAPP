.class public final synthetic Lio/flutter/plugins/camera/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/camera/DartMessenger;

.field public final synthetic b:Lio/flutter/plugins/camera/DartMessenger$DeviceEventType;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/DartMessenger$DeviceEventType;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/y;->a:Lio/flutter/plugins/camera/DartMessenger;

    iput-object p2, p0, Lio/flutter/plugins/camera/y;->b:Lio/flutter/plugins/camera/DartMessenger$DeviceEventType;

    iput-object p3, p0, Lio/flutter/plugins/camera/y;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/camera/y;->a:Lio/flutter/plugins/camera/DartMessenger;

    iget-object v1, p0, Lio/flutter/plugins/camera/y;->b:Lio/flutter/plugins/camera/DartMessenger$DeviceEventType;

    iget-object v2, p0, Lio/flutter/plugins/camera/y;->c:Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/camera/DartMessenger;->c(Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/DartMessenger$DeviceEventType;Ljava/util/Map;)V

    return-void
.end method
