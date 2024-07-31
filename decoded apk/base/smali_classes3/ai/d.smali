.class public Lai/d;
.super Lai/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/d$a;
    }
.end annotation


# instance fields
.field public final a:Lai/d$a;

.field final b:Lio/flutter/plugin/common/MethodCall;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Lai/a;-><init>()V

    iput-object p1, p0, Lai/d;->b:Lio/flutter/plugin/common/MethodCall;

    new-instance p1, Lai/d$a;

    invoke-direct {p1, p0, p2}, Lai/d$a;-><init>(Lai/d;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iput-object p1, p0, Lai/d;->a:Lai/d$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lai/d;->b:Lio/flutter/plugin/common/MethodCall;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lai/d;->b:Lio/flutter/plugin/common/MethodCall;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodCall;->hasArgument(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lai/d;->b:Lio/flutter/plugin/common/MethodCall;

    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    return-object v0
.end method

.method public l()Lai/f;
    .locals 1

    iget-object v0, p0, Lai/d;->a:Lai/d$a;

    return-object v0
.end method
