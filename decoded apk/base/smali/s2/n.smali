.class public Ls2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/arthenica/ffmpegkit/s;

.field private final b:I

.field private final c:Ls2/e;

.field private final d:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lcom/arthenica/ffmpegkit/s;ILs2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/n;->a:Lcom/arthenica/ffmpegkit/s;

    iput p2, p0, Ls2/n;->b:I

    iput-object p3, p0, Ls2/n;->c:Ls2/e;

    iput-object p4, p0, Ls2/n;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ls2/n;->a:Lcom/arthenica/ffmpegkit/s;

    iget v1, p0, Ls2/n;->b:I

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->D(Lcom/arthenica/ffmpegkit/s;I)V

    iget-object v0, p0, Ls2/n;->c:Ls2/e;

    iget-object v1, p0, Ls2/n;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ls2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method
