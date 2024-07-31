.class Lmm/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmm/a;->onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/util/HashMap;

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic r:I

.field final synthetic s:I

.field final synthetic t:I

.field final synthetic u:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic v:Lmm/a;


# direct methods
.method constructor <init>(Lmm/a;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/HashMap;IIIIILio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmm/a$a;->v:Lmm/a;

    iput-object p2, p0, Lmm/a$a;->a:Ljava/lang/String;

    iput-object p3, p0, Lmm/a$a;->b:Ljava/util/Map;

    iput-object p4, p0, Lmm/a$a;->c:Ljava/lang/String;

    iput-object p5, p0, Lmm/a$a;->d:Ljava/util/HashMap;

    iput p6, p0, Lmm/a$a;->e:I

    iput p7, p0, Lmm/a$a;->f:I

    iput p8, p0, Lmm/a$a;->r:I

    iput p9, p0, Lmm/a$a;->s:I

    iput p10, p0, Lmm/a$a;->t:I

    iput-object p11, p0, Lmm/a$a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lmm/a$a;->a:Ljava/lang/String;

    const-string v3, "file"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lmm/a$a;->b:Ljava/util/Map;

    const-string v4, "path"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    iget-object v4, p0, Lmm/a$a;->v:Lmm/a;

    iget-object v5, p0, Lmm/a$a;->c:Ljava/lang/String;

    iget-object v6, p0, Lmm/a$a;->d:Ljava/util/HashMap;

    iget v8, p0, Lmm/a$a;->e:I

    iget v9, p0, Lmm/a$a;->f:I

    iget v10, p0, Lmm/a$a;->r:I

    iget v11, p0, Lmm/a$a;->s:I

    iget v12, p0, Lmm/a$a;->t:I

    invoke-static/range {v4 .. v12}, Lmm/a;->a(Lmm/a;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;IIIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lmm/a$a;->a:Ljava/lang/String;

    const-string v4, "data"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v4, p0, Lmm/a$a;->v:Lmm/a;

    iget-object v5, p0, Lmm/a$a;->c:Ljava/lang/String;

    iget-object v6, p0, Lmm/a$a;->d:Ljava/util/HashMap;

    iget v7, p0, Lmm/a$a;->e:I

    iget v8, p0, Lmm/a$a;->f:I

    iget v9, p0, Lmm/a$a;->r:I

    iget v10, p0, Lmm/a$a;->s:I

    iget v11, p0, Lmm/a$a;->t:I

    invoke-static/range {v4 .. v11}, Lmm/a;->b(Lmm/a;Ljava/lang/String;Ljava/util/HashMap;IIIII)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move v3, v1

    move-object v1, v0

    :goto_0
    move-object v2, v0

    move-object v0, v1

    move v1, v3

    goto :goto_1

    :catch_0
    move-exception v2

    :goto_1
    iget-object v3, p0, Lmm/a$a;->v:Lmm/a;

    iget-object v4, p0, Lmm/a$a;->u:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v3, v4, v0, v1, v2}, Lmm/a;->c(Lmm/a;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;ZLjava/lang/Exception;)V

    return-void
.end method
