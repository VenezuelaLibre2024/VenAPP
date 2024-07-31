.class final Lnm/m$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnm/m;->N(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lok/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lok/p<",
        "Lzk/k0;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "xyz.luan.audioplayers.AudioplayersPlugin$safeCall$1"
    f = "AudioplayersPlugin.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "Lio/flutter/plugin/common/MethodCall;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lio/flutter/plugin/common/MethodCall;

.field final synthetic d:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method constructor <init>(Lok/p;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/p<",
            "-",
            "Lio/flutter/plugin/common/MethodCall;",
            "-",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Lck/v;",
            ">;",
            "Lio/flutter/plugin/common/MethodCall;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Lgk/Continuation<",
            "-",
            "Lnm/m$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnm/m$d;->b:Lok/p;

    iput-object p2, p0, Lnm/m$d;->c:Lio/flutter/plugin/common/MethodCall;

    iput-object p3, p0, Lnm/m$d;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lgk/Continuation<",
            "*>;)",
            "Lgk/Continuation<",
            "Lck/v;",
            ">;"
        }
    .end annotation

    new-instance p1, Lnm/m$d;

    iget-object v0, p0, Lnm/m$d;->b:Lok/p;

    iget-object v1, p0, Lnm/m$d;->c:Lio/flutter/plugin/common/MethodCall;

    iget-object v2, p0, Lnm/m$d;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p1, v0, v1, v2, p2}, Lnm/m$d;-><init>(Lok/p;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lgk/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzk/k0;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lnm/m$d;->invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/k0;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnm/m$d;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lnm/m$d;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lnm/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    iget v0, p0, Lnm/m$d;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lnm/m$d;->b:Lok/p;

    iget-object v0, p0, Lnm/m$d;->c:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, p0, Lnm/m$d;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {p1, v0, v1}, Lok/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lnm/m$d;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "Unexpected AndroidAudioError"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
