.class public final Lmh/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmh/b;->d(Lio/flutter/plugin/common/BinaryMessenger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/b;


# direct methods
.method constructor <init>(Lmh/b;)V
    .locals 0

    iput-object p1, p0, Lmh/b$b;->a:Lmh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lmh/b$b;->a:Lmh/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lmh/b;->a(Lmh/b;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    iget-object p1, p0, Lmh/b$b;->a:Lmh/b;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lmh/b;->a(Lmh/b;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method
