.class public final synthetic Lio/flutter/plugins/camera/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/camera/CameraPermissions$ResultCallback;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/camera/CameraPermissions;

.field public final synthetic b:Lio/flutter/plugins/camera/CameraPermissions$ResultCallback;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/camera/CameraPermissions;Lio/flutter/plugins/camera/CameraPermissions$ResultCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/s;->a:Lio/flutter/plugins/camera/CameraPermissions;

    iput-object p2, p0, Lio/flutter/plugins/camera/s;->b:Lio/flutter/plugins/camera/CameraPermissions$ResultCallback;

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/s;->a:Lio/flutter/plugins/camera/CameraPermissions;

    iget-object v1, p0, Lio/flutter/plugins/camera/s;->b:Lio/flutter/plugins/camera/CameraPermissions$ResultCallback;

    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugins/camera/CameraPermissions;->a(Lio/flutter/plugins/camera/CameraPermissions;Lio/flutter/plugins/camera/CameraPermissions$ResultCallback;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
