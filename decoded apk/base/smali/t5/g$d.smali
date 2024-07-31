.class final Lt5/g$d;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/g;->m(Lb6/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lt5/g;

.field final synthetic b:Lb6/e;


# direct methods
.method constructor <init>(Lt5/g;Lb6/e;)V
    .locals 0

    iput-object p1, p0, Lt5/g$d;->a:Lt5/g;

    iput-object p2, p0, Lt5/g$d;->b:Lb6/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lt5/g$d;->a:Lt5/g;

    invoke-static {v0}, Lt5/g;->b(Lt5/g;)Ly5/c;

    move-result-object v0

    iget-object v1, p0, Lt5/g$d;->a:Lt5/g;

    invoke-static {v1}, Lt5/g;->a(Lt5/g;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly5/c;->f(Landroid/content/Context;)Z

    move-result v0

    iget-object v1, p0, Lt5/g$d;->a:Lt5/g;

    iget-object v2, p0, Lt5/g$d;->b:Lb6/e;

    invoke-static {v1, v2, v0}, Lt5/g;->e(Lt5/g;Lb6/e;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lt5/g$d;->b:Lb6/e;

    invoke-virtual {v1}, Lb6/e;->d()Lio/flutter/plugin/common/MethodCall;

    move-result-object v1

    iget-object v2, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    iget-object v3, p0, Lt5/g$d;->b:Lb6/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "The "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " method has an error: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lck/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v1}, Lb6/e;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt5/g$d;->a()V

    sget-object v0, Lck/v;->a:Lck/v;

    return-object v0
.end method
