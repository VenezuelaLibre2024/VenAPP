.class public abstract Lai/a;
.super Lai/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lai/b;-><init>()V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lai/a;->l()Lai/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lai/f;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method protected abstract l()Lai/f;
.end method

.method public success(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lai/a;->l()Lai/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lai/f;->success(Ljava/lang/Object;)V

    return-void
.end method
