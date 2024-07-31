.class final Loi/u$f;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/u;->h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/lang/Exception;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Loi/u$f;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0, p1}, Loi/u$f;->d(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method private static final d(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Loi/a;

    const/4 v1, 0x0

    const-string v2, "MobileScanner"

    if-eqz v0, :cond_0

    const-string p0, "Called start() while already started"

    :goto_0
    invoke-interface {p1, v2, p0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, Loi/e;

    if-eqz v0, :cond_1

    const-string p0, "Error occurred when setting up camera!"

    goto :goto_0

    :cond_1
    instance-of p0, p0, Loi/b0;

    if-eqz p0, :cond_2

    const-string p0, "No camera found or failed to open camera!"

    goto :goto_0

    :cond_2
    const-string p0, "Unknown error occurred."

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v1, p0, Loi/u$f;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    new-instance v2, Loi/w;

    invoke-direct {v2, p1, v1}, Loi/w;-><init>(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Loi/u$f;->c(Ljava/lang/Exception;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
