.class public final Lsh/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/j3$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh/a;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/Float;Lsh/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/a$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lsh/a;

.field final synthetic b:Ljava/lang/Float;

.field final synthetic c:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method constructor <init>(Lsh/a;Ljava/lang/Float;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Lsh/a$a;->a:Lsh/a;

    iput-object p2, p0, Lsh/a$a;->b:Ljava/lang/Float;

    iput-object p3, p0, Lsh/a$a;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPlayerStateChanged(ZI)V
    .locals 6

    iget-object p1, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p1}, Lsh/a;->g(Lsh/a;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_2

    const/4 p1, 0x3

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p1}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lsh/a$a;->b:Ljava/lang/Float;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_0

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    invoke-interface {p1, v1}, Lt6/j3;->setVolume(F)V

    :goto_1
    iget-object p1, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p1, v0}, Lsh/a;->i(Lsh/a;Z)V

    iget-object p1, p0, Lsh/a$a;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x4

    if-ne p2, p1, :cond_b

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->a(Lsh/a;)Lsh/f;

    move-result-object p2

    sget-object v1, Lsh/a$a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "finishType"

    if-eq p2, v0, :cond_8

    const/4 v5, 0x2

    if-eq p2, v5, :cond_5

    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lt6/j3;->stop()V

    :cond_3
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {p2}, Lt6/j3;->release()V

    :cond_4
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lsh/a;->h(Lsh/a;Lt6/y;)V

    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->j(Lsh/a;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_3

    :cond_5
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-interface {p2, v2, v3}, Lt6/j3;->z(J)V

    :cond_6
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {p2, v1}, Lt6/j3;->k(Z)V

    :goto_2
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->j(Lsh/a;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_3

    :cond_8
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-interface {p2, v2, v3}, Lt6/j3;->z(J)V

    :cond_9
    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-interface {p2}, Lt6/j3;->d()V

    :cond_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_3
    invoke-interface {p1, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->c(Lsh/a;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "playerKey"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lsh/a$a;->a:Lsh/a;

    invoke-static {p2}, Lsh/a;->d(Lsh/a;)Lio/flutter/plugin/common/MethodChannel;

    move-result-object p2

    const-string v0, "onDidFinishPlayingAudio"

    invoke-virtual {p2, v0, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method
