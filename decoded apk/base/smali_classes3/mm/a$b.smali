.class Lmm/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmm/a;->i(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;ZLjava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic c:Ljava/lang/Exception;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lmm/a;


# direct methods
.method constructor <init>(Lmm/a;ZLio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmm/a$b;->e:Lmm/a;

    iput-boolean p2, p0, Lmm/a$b;->a:Z

    iput-object p3, p0, Lmm/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p4, p0, Lmm/a$b;->c:Ljava/lang/Exception;

    iput-object p5, p0, Lmm/a$b;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-boolean v0, p0, Lmm/a$b;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmm/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    return-void

    :cond_0
    iget-object v0, p0, Lmm/a$b;->c:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v0, p0, Lmm/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lmm/a$b;->c:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "exception"

    invoke-interface {v0, v3, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lmm/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lmm/a$b;->d:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
