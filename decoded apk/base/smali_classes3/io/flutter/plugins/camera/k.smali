.class public final synthetic Lio/flutter/plugins/camera/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/k;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/k;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0}, Lio/flutter/plugins/camera/Camera;->h(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method
