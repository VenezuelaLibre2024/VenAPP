.class public Ls2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/arthenica/ffmpegkit/h;

.field private final b:Ls2/e;

.field private final c:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lcom/arthenica/ffmpegkit/h;Ls2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/l;->a:Lcom/arthenica/ffmpegkit/h;

    iput-object p2, p0, Ls2/l;->b:Ls2/e;

    iput-object p3, p0, Ls2/l;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ls2/l;->a:Lcom/arthenica/ffmpegkit/h;

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->r(Lcom/arthenica/ffmpegkit/h;)V

    iget-object v0, p0, Ls2/l;->b:Ls2/e;

    iget-object v1, p0, Ls2/l;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ls2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method
