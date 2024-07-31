.class Lio/flutter/plugin/platform/PlatformViewWrapper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/platform/PlatformViewWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugin/platform/PlatformViewWrapper;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/PlatformViewWrapper;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper$2;->this$0:Lio/flutter/plugin/platform/PlatformViewWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x50

    if-ne p1, v0, :cond_0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper$2;->this$0:Lio/flutter/plugin/platform/PlatformViewWrapper;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->access$102(Lio/flutter/plugin/platform/PlatformViewWrapper;Z)Z

    :cond_0
    return-void
.end method
