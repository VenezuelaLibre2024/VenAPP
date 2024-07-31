.class public final synthetic Lio/flutter/plugins/camera/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic b:Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/i;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p2, p0, Lio/flutter/plugins/camera/i;->b:Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/i;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lio/flutter/plugins/camera/i;->b:Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    invoke-static {v0, v1}, Lio/flutter/plugins/camera/Camera;->c(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V

    return-void
.end method
