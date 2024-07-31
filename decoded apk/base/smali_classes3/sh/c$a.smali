.class public final Lsh/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh/c;->c(Ljava/lang/String;ILjava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic b:Lsh/c;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Lsh/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsh/c$a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p2, p0, Lsh/c$a;->b:Lsh/c;

    iput-object p3, p0, Lsh/c$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lsh/c$a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v0, p0, Lsh/c$a;->b:Lsh/c;

    invoke-static {v0}, Lsh/c;->a(Lsh/c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lsh/c$a;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lsh/i;->t()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
