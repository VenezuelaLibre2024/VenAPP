.class public final synthetic Lio/flutter/plugins/camera/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/z;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p2, p0, Lio/flutter/plugins/camera/z;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/z;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lio/flutter/plugins/camera/z;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Lio/flutter/plugins/camera/DartMessenger;->b(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method
