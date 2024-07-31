.class public final synthetic Lio/flutter/plugins/camera/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/camera/ErrorCallback;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/camera/Camera$2;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/camera/Camera$2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/q;->a:Lio/flutter/plugins/camera/Camera$2;

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/q;->a:Lio/flutter/plugins/camera/Camera$2;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/camera/Camera$2;->a(Lio/flutter/plugins/camera/Camera$2;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
